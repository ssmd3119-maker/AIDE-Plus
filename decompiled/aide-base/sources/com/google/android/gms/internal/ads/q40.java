package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class q40 extends p40 {
    protected final byte[] fY;

    q40(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.fY = bArr;
    }

    @Override // com.google.android.gms.internal.ads.i40
    protected final String DW(Charset charset) {
        return new String(this.fY, P8(), size(), charset);
    }

    @Override // com.google.android.gms.internal.ads.i40
    public final s40 EQ() {
        return s40.lg(this.fY, P8(), size(), true);
    }

    @Override // com.google.android.gms.internal.ads.i40
    final void Hw(h40 h40Var) {
        h40Var.j6(this.fY, P8(), size());
    }

    protected int P8() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.i40
    public byte Ws(int i) {
        return this.fY[i];
    }

    @Override // com.google.android.gms.internal.ads.i40
    protected final int aM(int i, int i2, int i3) {
        return t50.FH(i, this.fY, P8(), i3);
    }

    @Override // com.google.android.gms.internal.ads.i40
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i40) || size() != ((i40) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return obj.equals(this);
        }
        q40 q40Var = (q40) obj;
        int iJ8 = J8();
        int iJ82 = q40Var.J8();
        if (iJ8 == 0 || iJ82 == 0 || iJ8 == iJ82) {
            return vy(q40Var, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.i40
    public final i40 gW(int i, int i2) {
        int iMr = i40.Mr(0, i2, size());
        return iMr == 0 ? i40.mb : new l40(this.fY, P8(), iMr);
    }

    @Override // com.google.android.gms.internal.ads.i40
    public final boolean gn() {
        int iP8 = P8();
        return s80.tp(this.fY, iP8, size() + iP8);
    }

    @Override // com.google.android.gms.internal.ads.i40
    public int size() {
        return this.fY.length;
    }

    @Override // com.google.android.gms.internal.ads.i40
    protected void v5(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.fY, 0, bArr, 0, i3);
    }

    final boolean vy(i40 i40Var, int i, int i2) {
        if (i2 > i40Var.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 > i40Var.size()) {
            int size2 = i40Var.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(i40Var instanceof q40)) {
            return i40Var.gW(0, i2).equals(gW(0, i2));
        }
        q40 q40Var = (q40) i40Var;
        byte[] bArr = this.fY;
        byte[] bArr2 = q40Var.fY;
        int iP8 = P8() + i2;
        int iP82 = P8();
        int iP83 = q40Var.P8();
        while (iP82 < iP8) {
            if (bArr[iP82] != bArr2[iP83]) {
                return false;
            }
            iP82++;
            iP83++;
        }
        return true;
    }
}
