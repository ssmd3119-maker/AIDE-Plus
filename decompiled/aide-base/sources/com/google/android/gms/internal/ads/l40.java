package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class l40 extends q40 {
    private final int k2;
    private final int qp;

    l40(byte[] bArr, int i, int i2) {
        super(bArr);
        i40.Mr(i, i + i2, bArr.length);
        this.qp = i;
        this.k2 = i2;
    }

    @Override // com.google.android.gms.internal.ads.q40
    protected final int P8() {
        return this.qp;
    }

    @Override // com.google.android.gms.internal.ads.q40, com.google.android.gms.internal.ads.i40
    public final byte Ws(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.fY[this.qp + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.q40, com.google.android.gms.internal.ads.i40
    public final int size() {
        return this.k2;
    }

    @Override // com.google.android.gms.internal.ads.q40, com.google.android.gms.internal.ads.i40
    protected final void v5(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.fY, P8(), bArr, 0, i3);
    }
}
