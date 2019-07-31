package com.glqdlt.common.webservicehelper.encode;

/**
 * @author jhun
 */
public class Base64HelperException extends RuntimeException {
    public Base64HelperException(String message) {
        super(message);
    }
    public static class Base64HelperNullArgException extends Base64HelperException{

        public Base64HelperNullArgException() {
            super("parameter arg is null.");
        }
    }
}
