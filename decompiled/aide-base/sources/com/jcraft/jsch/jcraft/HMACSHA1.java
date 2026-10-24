package com.jcraft.jsch.jcraft;

import com.jcraft.jsch.MAC;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class HMACSHA1 extends HMAC implements MAC {
    public HMACSHA1() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
        } catch (Exception e) {
            System.err.println(e);
            messageDigest = null;
        }
        DW(messageDigest);
    }
}
