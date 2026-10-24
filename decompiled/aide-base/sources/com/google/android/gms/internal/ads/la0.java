package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class la0 {
    private static MessageDigest DW;
    private static boolean j6;
    private static final Object FH = new Object();
    private static final Object Hw = new Object();
    static CountDownLatch v5 = new CountDownLatch(1);

    private static Vector<byte[]> FH(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static byte[] Hw(byte[] bArr, String str, boolean z) {
        byte[] bArrArray;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = p90.VH(Zo(4096L));
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[i - bArr.length];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(v5(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        for (cb0 cb0Var : new za0().ee) {
            cb0Var.j6(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new y30(str.getBytes("UTF-8")).j6(bArr3);
        }
        return bArr3;
    }

    static void VH() {
        synchronized (Hw) {
            if (!j6) {
                j6 = true;
                new Thread(new ya0()).start();
            }
        }
    }

    private static sz Zo(long j) {
        sz szVar = new sz();
        szVar.a8 = 4096L;
        return szVar;
    }

    private static MessageDigest gn() throws InterruptedException {
        boolean zAwait;
        MessageDigest messageDigest;
        VH();
        try {
            zAwait = v5.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            zAwait = false;
        }
        if (zAwait && (messageDigest = DW) != null) {
            return messageDigest;
        }
        return null;
    }

    static String j6(sz szVar, String str) throws GeneralSecurityException {
        byte[] bArrHw;
        byte[] bArrVH = p90.VH(szVar);
        if (((Boolean) cw0.v5().FH(p.Jm)).booleanValue()) {
            Vector<byte[]> vectorFH = FH(bArrVH, 255);
            if (vectorFH == null || vectorFH.size() == 0) {
                bArrHw = Hw(p90.VH(Zo(4096L)), str, true);
            } else {
                n60 n60Var = new n60();
                n60Var.FH = new byte[vectorFH.size()][];
                Iterator<byte[]> it = vectorFH.iterator();
                int i = 0;
                while (it.hasNext()) {
                    n60Var.FH[i] = Hw(it.next(), str, false);
                    i++;
                }
                n60Var.Hw = v5(bArrVH);
                bArrHw = p90.VH(n60Var);
            }
        } else {
            if (sc0.j6 == null) {
                throw new GeneralSecurityException();
            }
            byte[] bArrJ6 = sc0.j6.j6(bArrVH, str != null ? str.getBytes() : new byte[0]);
            n60 n60Var2 = new n60();
            n60Var2.FH = new byte[][]{bArrJ6};
            n60Var2.Zo = 2;
            bArrHw = p90.VH(n60Var2);
        }
        return p80.j6(bArrHw, true);
    }

    public static byte[] v5(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (FH) {
            MessageDigest messageDigestGn = gn();
            if (messageDigestGn == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigestGn.reset();
            messageDigestGn.update(bArr);
            bArrDigest = DW.digest();
        }
        return bArrDigest;
    }
}
