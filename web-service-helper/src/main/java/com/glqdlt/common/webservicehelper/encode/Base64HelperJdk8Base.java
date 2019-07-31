package com.glqdlt.common.webservicehelper.encode;


import java.util.Base64;
import java.util.Optional;
/**
 * @author jhun
 */
public interface Base64HelperJdk8Base extends Base64Helper {
    default boolean isBase64(String encodeString) {
        String arg = Optional.ofNullable(encodeString).orElseThrow(Base64HelperException.Base64HelperNullArgException::new);
        final String base64Regex = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$";
        return arg.matches(base64Regex);
    }

    default String encode(String rawString) {
        String arg = Optional.ofNullable(rawString).orElseThrow(Base64HelperException.Base64HelperNullArgException::new);
        byte[] bytes = Base64.getEncoder().encode(arg.getBytes());
        return convertByteToString(bytes);
    }

    default String convertByteToString(byte[] bytes) {
        return new String(bytes).intern();
    }

    default String decode(String encodeString) {
        String arg = Optional.ofNullable(encodeString).orElseThrow(Base64HelperException.Base64HelperNullArgException::new);
        return convertByteToString(Base64.getDecoder().decode(arg.getBytes()));
    }
}
