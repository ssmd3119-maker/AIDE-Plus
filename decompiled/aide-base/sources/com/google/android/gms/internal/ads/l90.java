package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class l90 implements Cloneable {
    private static final m90 fY = new m90();
    private int[] WB;
    private int jw;
    private m90[] mb;

    l90() {
        this(10);
    }

    private final int gn(int i) {
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

    final int FH() {
        return this.jw;
    }

    final void Hw(int i, m90 m90Var) {
        int iGn = gn(i);
        if (iGn >= 0) {
            this.mb[iGn] = m90Var;
            return;
        }
        int i2 = iGn ^ (-1);
        if (i2 < this.jw) {
            m90[] m90VarArr = this.mb;
            if (m90VarArr[i2] == fY) {
                this.WB[i2] = i;
                m90VarArr[i2] = m90Var;
                return;
            }
        }
        int i3 = this.jw;
        if (i3 >= this.WB.length) {
            int iJ6 = j6(i3 + 1);
            int[] iArr = new int[iJ6];
            m90[] m90VarArr2 = new m90[iJ6];
            int[] iArr2 = this.WB;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            m90[] m90VarArr3 = this.mb;
            System.arraycopy(m90VarArr3, 0, m90VarArr2, 0, m90VarArr3.length);
            this.WB = iArr;
            this.mb = m90VarArr2;
        }
        int i4 = this.jw;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.WB;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            m90[] m90VarArr4 = this.mb;
            System.arraycopy(m90VarArr4, i2, m90VarArr4, i5, this.jw - i2);
        }
        this.WB[i2] = i;
        this.mb[i2] = m90Var;
        this.jw++;
    }

    final m90 VH(int i) {
        return this.mb[i];
    }

    final m90 Zo(int i) {
        int iGn = gn(i);
        if (iGn < 0) {
            return null;
        }
        m90[] m90VarArr = this.mb;
        if (m90VarArr[iGn] == fY) {
            return null;
        }
        return m90VarArr[iGn];
    }

    public final /* synthetic */ Object clone() {
        int i = this.jw;
        l90 l90Var = new l90(i);
        System.arraycopy(this.WB, 0, l90Var.WB, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            m90[] m90VarArr = this.mb;
            if (m90VarArr[i2] != null) {
                l90Var.mb[i2] = (m90) m90VarArr[i2].clone();
            }
        }
        l90Var.jw = i;
        return l90Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l90)) {
            return false;
        }
        l90 l90Var = (l90) obj;
        int i = this.jw;
        if (i != l90Var.jw) {
            return false;
        }
        int[] iArr = this.WB;
        int[] iArr2 = l90Var.WB;
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
            m90[] m90VarArr = this.mb;
            m90[] m90VarArr2 = l90Var.mb;
            int i3 = this.jw;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                }
                if (!m90VarArr[i4].equals(m90VarArr2[i4])) {
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

    public final int hashCode() {
        int iHashCode = 17;
        for (int i = 0; i < this.jw; i++) {
            iHashCode = (((iHashCode * 31) + this.WB[i]) * 31) + this.mb[i].hashCode();
        }
        return iHashCode;
    }

    private l90(int i) {
        int iJ6 = j6(i);
        this.WB = new int[iJ6];
        this.mb = new m90[iJ6];
        this.jw = 0;
    }
}
