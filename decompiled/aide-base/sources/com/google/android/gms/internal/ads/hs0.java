package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class hs0 {
    private static MessageDigest DW;
    protected Object j6 = new Object();

    protected final MessageDigest DW() {
        synchronized (this.j6) {
            if (DW != null) {
                return DW;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    DW = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return DW;
        }
    }

    abstract byte[] j6(String str);
}
