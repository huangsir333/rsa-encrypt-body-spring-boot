package cn.shuibo.util;

import org.apache.commons.codec.binary.Base64;

/**
 * Base64
 * Author:Bobby
 * DateTime:2019/4/9
 **/
public class Base64Util{

    /**
     * Decoding to binary
     * @param base64
     * @return
     * @throws Exception
     */
    public static byte[] decode(String base64) throws Exception {
        return Base64.decodeBase64(base64);
    }

    /**
     * Binary encoding as a string
     * @param bytes
     * @return
     * @throws Exception
     */
    public static String encode(byte[] bytes) throws Exception {
        return new String(Base64.encodeBase64(bytes));
    }
}