package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class d3 extends c3 {
    protected final byte[] fY;

    d3(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.fY = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.u2
    protected final String DW(Charset charset) {
        return new String(this.fY, er(), size(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.u2
    final void Hw(t2 t2Var) {
        t2Var.j6(this.fY, er(), size());
    }

    @Override // com.google.android.gms.internal.measurement.u2
    public final u2 J8(int i, int i2) {
        int iEQ = u2.EQ(0, i2, size());
        return iEQ == 0 ? u2.mb : new y2(this.fY, er(), iEQ);
    }

    @Override // com.google.android.gms.internal.measurement.u2
    public final boolean Mr() {
        int iEr = er();
        return c7.gn(this.fY, iEr, size() + iEr);
    }

    @Override // com.google.android.gms.internal.measurement.u2
    byte VH(int i) {
        return this.fY[i];
    }

    @Override // com.google.android.gms.internal.measurement.u2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u2) || size() != ((u2) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return obj.equals(this);
        }
        d3 d3Var = (d3) obj;
        int iA8 = a8();
        int iA82 = d3Var.a8();
        if (iA8 == 0 || iA82 == 0 || iA8 == iA82) {
            return lg(d3Var, 0, size());
        }
        return false;
    }

    protected int er() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.u2
    protected final int j6(int i, int i2, int i3) {
        return g4.FH(i, this.fY, er(), i3);
    }

    final boolean lg(u2 u2Var, int i, int i2) {
        if (i2 > u2Var.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 > u2Var.size()) {
            int size2 = u2Var.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(u2Var instanceof d3)) {
            return u2Var.J8(0, i2).equals(J8(0, i2));
        }
        d3 d3Var = (d3) u2Var;
        byte[] bArr = this.fY;
        byte[] bArr2 = d3Var.fY;
        int iEr = er() + i2;
        int iEr2 = er();
        int iEr3 = d3Var.er();
        while (iEr2 < iEr) {
            if (bArr[iEr2] != bArr2[iEr3]) {
                return false;
            }
            iEr2++;
            iEr3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.u2
    public int size() {
        return this.fY.length;
    }

    @Override // com.google.android.gms.internal.measurement.u2
    public byte v5(int i) {
        return this.fY[i];
    }
}
