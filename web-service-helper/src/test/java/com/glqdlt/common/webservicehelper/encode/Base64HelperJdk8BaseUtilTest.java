package com.glqdlt.common.webservicehelper.encode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jhun
 */
public class Base64HelperJdk8BaseUtilTest {

    private final Base64HelperJdk8BaseImpl base64HelperJdk8Base = new Base64HelperJdk8BaseImpl();

    private final String encode = "SGVsbG8=";

    @Test
    public void sameFunction() {
        String encode = Base64HelperJdk8BaseUtil.encode("Hello");
        String encode1 = base64HelperJdk8Base.encode("Hello");
        Assert.assertEquals(encode, encode1);
    }

    @Test
    public void sameFunction2() {
        String r1 = base64HelperJdk8Base.decode(encode);
        String r2 = Base64HelperJdk8BaseUtil.decode(encode);
        Assert.assertEquals(r1, r2);
    }

    @Test
    public void sameFunction3() {
        Assert.assertEquals(base64HelperJdk8Base.isBase64(encode), Base64HelperJdk8BaseUtil.isBase64(encode));
    }
}
