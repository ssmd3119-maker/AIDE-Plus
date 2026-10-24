package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class ya0 implements Runnable {
    private ya0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            MessageDigest unused = la0.DW = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused2) {
        } finally {
            la0.v5.countDown();
        }
    }
}
