package com.glqdlt.common.webservicehelper.encode;

/**
 * @author jhun
 */
public interface Base64Helper {
    boolean isBase64(String encodeString);
    String encode(String rawString);
    String decode(String encodeString);
}
