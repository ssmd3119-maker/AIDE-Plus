package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e4;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v6 {
    private static final v6 Zo = new v6(0, new int[0], new Object[0], false);
    private int[] DW;
    private Object[] FH;
    private int Hw;
    private int j6;
    private boolean v5;

    private v6() {
        this(0, new int[8], new Object[8], true);
    }

    private static void Hw(int i, Object obj, p7 p7Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            p7Var.P8(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            p7Var.v5(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            p7Var.BT(i2, (u2) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(k4.Zo());
            }
            p7Var.cb(i2, ((Integer) obj).intValue());
        } else if (p7Var.yS() == e4.e.EQ) {
            p7Var.vy(i2);
            ((v6) obj).v5(p7Var);
            p7Var.gW(i2);
        } else {
            p7Var.gW(i2);
            ((v6) obj).v5(p7Var);
            p7Var.vy(i2);
        }
    }

    static v6 j6(v6 v6Var, v6 v6Var2) {
        int i = v6Var.j6 + v6Var2.j6;
        int[] iArrCopyOf = Arrays.copyOf(v6Var.DW, i);
        System.arraycopy(v6Var2.DW, 0, iArrCopyOf, v6Var.j6, v6Var2.j6);
        Object[] objArrCopyOf = Arrays.copyOf(v6Var.FH, i);
        System.arraycopy(v6Var2.FH, 0, objArrCopyOf, v6Var.j6, v6Var2.j6);
        return new v6(i, iArrCopyOf, objArrCopyOf, true);
    }

    static v6 tp() {
        return new v6();
    }

    public static v6 u7() {
        return Zo;
    }

    final void DW(p7 p7Var) {
        if (p7Var.yS() == e4.e.we) {
            for (int i = this.j6 - 1; i >= 0; i--) {
                p7Var.Zo(this.DW[i] >>> 3, this.FH[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.j6; i2++) {
            p7Var.Zo(this.DW[i2] >>> 3, this.FH[i2]);
        }
    }

    public final int EQ() {
        int i = this.Hw;
        if (i != -1) {
            return i;
        }
        int iXa = 0;
        for (int i2 = 0; i2 < this.j6; i2++) {
            iXa += k3.Xa(this.DW[i2] >>> 3, (u2) this.FH[i2]);
        }
        this.Hw = iXa;
        return iXa;
    }

    final void FH(int i, Object obj) {
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

    public final void VH() {
        this.v5 = false;
    }

    final void Zo(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.j6; i2++) {
            o5.FH(sb, i, String.valueOf(this.DW[i2] >>> 3), this.FH[i2]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        int i = this.j6;
        if (i == v6Var.j6) {
            int[] iArr = this.DW;
            int[] iArr2 = v6Var.DW;
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
                Object[] objArr2 = v6Var.FH;
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
        int iFN;
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
                iFN = k3.FN(i5, ((Long) this.FH[i3]).longValue());
            } else if (i6 == 1) {
                iFN = k3.ye(i5, ((Long) this.FH[i3]).longValue());
            } else if (i6 == 2) {
                iFN = k3.OW(i5, (u2) this.FH[i3]);
            } else if (i6 == 3) {
                iFN = (k3.vJ(i5) << 1) + ((v6) this.FH[i3]).gn();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(k4.Zo());
                }
                iFN = k3.w9(i5, ((Integer) this.FH[i3]).intValue());
            }
            i2 += iFN;
        }
        this.Hw = i2;
        return i2;
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

    public final void v5(p7 p7Var) {
        if (this.j6 == 0) {
            return;
        }
        if (p7Var.yS() == e4.e.EQ) {
            for (int i = 0; i < this.j6; i++) {
                Hw(this.DW[i], this.FH[i], p7Var);
            }
            return;
        }
        for (int i2 = this.j6 - 1; i2 >= 0; i2--) {
            Hw(this.DW[i2], this.FH[i2], p7Var);
        }
    }

    private v6(int i, int[] iArr, Object[] objArr, boolean z) {
        this.Hw = -1;
        this.j6 = i;
        this.DW = iArr;
        this.FH = objArr;
        this.v5 = z;
    }
}
