package com.glqdlt.common.webservicehelper.encode;
/**
 * @author jhun
 */
public final class Base64HelperJdk8BaseUtil {
    private Base64HelperJdk8BaseUtil() {
    }

    private static final Base64HelperJdk8BaseImpl BASE_64_HELPER_JDK_8_BASE_STATIC = new Base64HelperJdk8BaseImpl();

    public static boolean isBase64(String encode) {
        return BASE_64_HELPER_JDK_8_BASE_STATIC.isBase64(encode);
    }

    public static String encode(String raw) {
        return BASE_64_HELPER_JDK_8_BASE_STATIC.encode(raw);
    }

    public static String decode(String encode) {
        return BASE_64_HELPER_JDK_8_BASE_STATIC.decode(encode);
    }
}
