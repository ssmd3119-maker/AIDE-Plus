package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class v7 implements Cloneable {
    private static final w7 fY = new w7();
    private int[] WB;
    private int jw;
    private w7[] mb;

    v7() {
        this(10);
    }

    private static int j6(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    private final int u7(int i) {
        int i2 = this.jw - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.WB[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else {
                if (i5 <= i) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return i3 ^ (-1);
    }

    public final boolean FH() {
        return this.jw == 0;
    }

    final int Hw() {
        return this.jw;
    }

    final w7 VH(int i) {
        int iU7 = u7(i);
        if (iU7 < 0) {
            return null;
        }
        w7[] w7VarArr = this.mb;
        if (w7VarArr[iU7] == fY) {
            return null;
        }
        return w7VarArr[iU7];
    }

    final void Zo(int i, w7 w7Var) {
        int iU7 = u7(i);
        if (iU7 >= 0) {
            this.mb[iU7] = w7Var;
            return;
        }
        int i2 = iU7 ^ (-1);
        if (i2 < this.jw) {
            w7[] w7VarArr = this.mb;
            if (w7VarArr[i2] == fY) {
                this.WB[i2] = i;
                w7VarArr[i2] = w7Var;
                return;
            }
        }
        int i3 = this.jw;
        if (i3 >= this.WB.length) {
            int iJ6 = j6(i3 + 1);
            int[] iArr = new int[iJ6];
            w7[] w7VarArr2 = new w7[iJ6];
            int[] iArr2 = this.WB;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            w7[] w7VarArr3 = this.mb;
            System.arraycopy(w7VarArr3, 0, w7VarArr2, 0, w7VarArr3.length);
            this.WB = iArr;
            this.mb = w7VarArr2;
        }
        int i4 = this.jw;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.WB;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            w7[] w7VarArr4 = this.mb;
            System.arraycopy(w7VarArr4, i2, w7VarArr4, i5, this.jw - i2);
        }
        this.WB[i2] = i;
        this.mb[i2] = w7Var;
        this.jw++;
    }

    public final /* synthetic */ Object clone() {
        int i = this.jw;
        v7 v7Var = new v7(i);
        System.arraycopy(this.WB, 0, v7Var.WB, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            w7[] w7VarArr = this.mb;
            if (w7VarArr[i2] != null) {
                v7Var.mb[i2] = (w7) w7VarArr[i2].clone();
            }
        }
        v7Var.jw = i;
        return v7Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v7)) {
            return false;
        }
        v7 v7Var = (v7) obj;
        int i = this.jw;
        if (i != v7Var.jw) {
            return false;
        }
        int[] iArr = this.WB;
        int[] iArr2 = v7Var.WB;
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
            w7[] w7VarArr = this.mb;
            w7[] w7VarArr2 = v7Var.mb;
            int i3 = this.jw;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                }
                if (!w7VarArr[i4].equals(w7VarArr2[i4])) {
                    z2 = false;
                    break;
                }
                i4++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    final w7 gn(int i) {
        return this.mb[i];
    }

    public final int hashCode() {
        int iHashCode = 17;
        for (int i = 0; i < this.jw; i++) {
            iHashCode = (((iHashCode * 31) + this.WB[i]) * 31) + this.mb[i].hashCode();
        }
        return iHashCode;
    }

    private v7(int i) {
        int iJ6 = j6(i);
        this.WB = new int[iJ6];
        this.mb = new w7[iJ6];
        this.jw = 0;
    }
}
