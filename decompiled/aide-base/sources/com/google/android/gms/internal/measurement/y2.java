package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class y2 extends d3 {
    private final int k2;
    private final int qp;

    y2(byte[] bArr, int i, int i2) {
        super(bArr);
        u2.EQ(i, i + i2, bArr.length);
        this.qp = i;
        this.k2 = i2;
    }

    @Override // com.google.android.gms.internal.measurement.d3, com.google.android.gms.internal.measurement.u2
    final byte VH(int i) {
        return this.fY[this.qp + i];
    }

    @Override // com.google.android.gms.internal.measurement.d3
    protected final int er() {
        return this.qp;
    }

    @Override // com.google.android.gms.internal.measurement.d3, com.google.android.gms.internal.measurement.u2
    public final int size() {
        return this.k2;
    }

    @Override // com.google.android.gms.internal.measurement.d3, com.google.android.gms.internal.measurement.u2
    public final byte v5(int i) {
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
}
