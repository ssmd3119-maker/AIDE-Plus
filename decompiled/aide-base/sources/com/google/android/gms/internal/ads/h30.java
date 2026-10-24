package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class h30 {
    private final byte[] j6;

    private h30(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.j6 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static h30 DW(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new h30(bArr, 0, bArr.length);
    }

    public final byte[] j6() {
        byte[] bArr = this.j6;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
