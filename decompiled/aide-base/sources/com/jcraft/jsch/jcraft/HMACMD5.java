package com.jcraft.jsch.jcraft;

import com.jcraft.jsch.MAC;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class HMACMD5 extends HMAC implements MAC {
    public HMACMD5() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.err.println(e);
            messageDigest = null;
        }
        DW(messageDigest);
    }
}
