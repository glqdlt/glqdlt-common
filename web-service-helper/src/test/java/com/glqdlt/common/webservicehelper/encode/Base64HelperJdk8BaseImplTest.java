package com.glqdlt.common.webservicehelper.encode;


import org.junit.Assert;
import org.junit.Test;
/**
 * @author jhun
 */
public class Base64HelperJdk8BaseImplTest {
    private final Base64HelperJdk8BaseImpl base64HelperJdk8Base = new Base64HelperJdk8BaseImpl();

    @Test
    public void base64RegexTest() {
        final String ENCODE_GOOD = "TG9yZW0gSXBzdW0gaXMgc2ltcGx5IGR1bW15IHRleHQgb2YgdGhlIHByaW50aW5nIGFuZCB0eXBlc2V0dGluZyBpbmR1c3RyeS4gTG9yZW0gSXBzdW0gaGFzIGJlZW4gdGhlIGluZHVzdHJ5J3Mgc3RhbmRhcmQgZHVtbXkgdGV4dCBldmVyIHNpbmNlIHRoZSAxNTAwcywgd2hlbiBhbiB1bmtub3duIHByaW50ZXIgdG9vayBhIGdhbGxleSBvZiB0eXBlIGFuZCBzY3JhbWJsZWQgaXQgdG8gbWFrZSBhIHR5cGUgc3BlY2ltZW4gYm9vay4gSXQgaGFzIHN1cnZpdmVkIG5vdCBvbmx5IGZpdmUgY2VudHVyaWVzLCBidXQgYWxzbyB0aGUgbGVhcCBpbnRvIGVsZWN0cm9uaWMgdHlwZXNldHRpbmcsIHJlbWFpbmluZyBlc3NlbnRpYWxseSB1bmNoYW5nZWQuIEl0IHdhcyBwb3B1bGFyaXNlZCBpbiB0aGUgMTk2MHMgd2l0aCB0aGUgcmVsZWFzZSBvZiBMZXRyYXNldCBzaGVldHMgY29udGFpbmluZyBMb3JlbSBJcHN1bSBwYXNzYWdlcywgYW5kIG1vcmUgcmVjZW50bHkgd2l0aCBkZXNrdG9wIHB1Ymxpc2hpbmcgc29mdHdhcmUgbGlrZSBBbGR1cyBQYWdlTWFrZXIgaW5jbHVkaW5nIHZlcnNpb25zIG9mIExvcmVtIElwc3VtLg==";
        final String ENCODE_BAD = "TG9yZW0gSXBzdW0gaXMgc2ltcGxqweqweq";
        Assert.assertTrue(base64HelperJdk8Base.isBase64(ENCODE_GOOD));
        Assert.assertFalse(base64HelperJdk8Base.isBase64(ENCODE_BAD));
    }

    @Test
    public void encodeBase64() {
        String encodeString = base64HelperJdk8Base.encode("Hello World");
        Assert.assertEquals("SGVsbG8gV29ybGQ=", encodeString);
        Assert.assertTrue(base64HelperJdk8Base.isBase64(encodeString));
    }

    @Test
    public void decodeBase64() {
        String decodeString = base64HelperJdk8Base.decode("SGVsbG8gV29ybGQ=");
        Assert.assertFalse(base64HelperJdk8Base.isBase64(decodeString));
        Assert.assertEquals("Hello World", decodeString);
    }

    @Test(expected = Base64HelperException.Base64HelperNullArgException.class)
    public void encodingNullArg() {
        base64HelperJdk8Base.encode(null);
    }

    @Test(expected = Base64HelperException.Base64HelperNullArgException.class)
    public void decodingNullArg() {
        base64HelperJdk8Base.decode(null);
    }

    @Test(expected = Base64HelperException.Base64HelperNullArgException.class)
    public void validNull() {
        base64HelperJdk8Base.isBase64(null);
    }
}
