package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k80 {
    private static final k80 Zo = new k80(0, new int[0], new Object[0], false);
    private int[] DW;
    private Object[] FH;
    private int Hw;
    private int j6;
    private boolean v5;

    private k80() {
        this(0, new int[8], new Object[8], true);
    }

    static k80 VH() {
        return new k80();
    }

    public static k80 Zo() {
        return Zo;
    }

    static k80 j6(k80 k80Var, k80 k80Var2) {
        int i = k80Var.j6 + k80Var2.j6;
        int[] iArrCopyOf = Arrays.copyOf(k80Var.DW, i);
        System.arraycopy(k80Var2.DW, 0, iArrCopyOf, k80Var.j6, k80Var2.j6);
        Object[] objArrCopyOf = Arrays.copyOf(k80Var.FH, i);
        System.arraycopy(k80Var2.FH, 0, objArrCopyOf, k80Var.j6, k80Var2.j6);
        return new k80(i, iArrCopyOf, objArrCopyOf, true);
    }

    private static void u7(int i, Object obj, f90 f90Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            f90Var.KD(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            f90Var.sG(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            f90Var.sh(i2, (i40) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(y50.Zo());
            }
            f90Var.ei(i2, ((Integer) obj).intValue());
        } else if (f90Var.rN() == r50.e.EQ) {
            f90Var.ef(i2);
            ((k80) obj).tp(f90Var);
            f90Var.vJ(i2);
        } else {
            f90Var.vJ(i2);
            ((k80) obj).tp(f90Var);
            f90Var.ef(i2);
        }
    }

    final void DW(f90 f90Var) {
        if (f90Var.rN() == r50.e.we) {
            for (int i = this.j6 - 1; i >= 0; i--) {
                f90Var.gW(this.DW[i] >>> 3, this.FH[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.j6; i2++) {
            f90Var.gW(this.DW[i2] >>> 3, this.FH[i2]);
        }
    }

    final void EQ(int i, Object obj) {
        if (!this.v5) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.j6;
        if (i2 == this.DW.length) {
            int i3 = this.j6 + (i2 < 4 ? 8 : i2 >> 1);
            this.DW = Arrays.copyOf(this.DW, i3);
            this.FH = Arrays.copyOf(this.FH, i3);
        }
        int[] iArr = this.DW;
        int i4 = this.j6;
        iArr[i4] = i;
        this.FH[i4] = obj;
        this.j6 = i4 + 1;
    }

    final void FH(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.j6; i2++) {
            c70.FH(sb, i, String.valueOf(this.DW[i2] >>> 3), this.FH[i2]);
        }
    }

    public final void Hw() {
        this.v5 = false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k80)) {
            return false;
        }
        k80 k80Var = (k80) obj;
        int i = this.j6;
        if (i == k80Var.j6) {
            int[] iArr = this.DW;
            int[] iArr2 = k80Var.DW;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                Object[] objArr = this.FH;
                Object[] objArr2 = k80Var.FH;
                int i3 = this.j6;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    }
                    i4++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int gn() {
        int i = this.Hw;
        if (i != -1) {
            return i;
        }
        int iMz = 0;
        for (int i2 = 0; i2 < this.j6; i2++) {
            iMz += x40.Mz(this.DW[i2] >>> 3, (i40) this.FH[i2]);
        }
        this.Hw = iMz;
        return iMz;
    }

    public final int hashCode() {
        int i = this.j6;
        int i2 = (i + 527) * 31;
        int[] iArr = this.DW;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.FH;
        int i6 = this.j6;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void tp(f90 f90Var) {
        if (this.j6 == 0) {
            return;
        }
        if (f90Var.rN() == r50.e.EQ) {
            for (int i = 0; i < this.j6; i++) {
                u7(this.DW[i], this.FH[i], f90Var);
            }
            return;
        }
        for (int i2 = this.j6 - 1; i2 >= 0; i2--) {
            u7(this.DW[i2], this.FH[i2], f90Var);
        }
    }

    public final int v5() {
        int iQp;
        int i = this.Hw;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.j6; i3++) {
            int i4 = this.DW[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iQp = x40.qp(i5, ((Long) this.FH[i3]).longValue());
            } else if (i6 == 1) {
                iQp = x40.AL(i5, ((Long) this.FH[i3]).longValue());
            } else if (i6 == 2) {
                iQp = x40.Sf(i5, (i40) this.FH[i3]);
            } else if (i6 == 3) {
                iQp = (x40.kQ(i5) << 1) + ((k80) this.FH[i3]).v5();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(y50.Zo());
                }
                iQp = x40.J0(i5, ((Integer) this.FH[i3]).intValue());
            }
            i2 += iQp;
        }
        this.Hw = i2;
        return i2;
    }

    private k80(int i, int[] iArr, Object[] objArr, boolean z) {
        this.Hw = -1;
        this.j6 = i;
        this.DW = iArr;
        this.FH = objArr;
        this.v5 = z;
    }
}
