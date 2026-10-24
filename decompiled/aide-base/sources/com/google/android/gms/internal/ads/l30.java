package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class l30 {
    private static final ThreadLocal<SecureRandom> j6 = new m30();

    public static byte[] FH(int i) {
        byte[] bArr = new byte[i];
        j6.get().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom j6() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
