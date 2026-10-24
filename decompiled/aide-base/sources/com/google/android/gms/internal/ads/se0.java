package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class se0 {
    public final Object DW;
    public boolean EQ;
    public final int FH;
    public final uk0[] Hw;
    public tn0 J0;
    private final cf0[] J8;
    private final rn0 QX;
    public int VH;
    private final ef0[] Ws;
    private final ze0 XL;
    public final long Zo;
    private final nk0 aM;
    public long gn;
    private tn0 j3;
    public final lk0 j6;
    public boolean tp;
    public boolean u7;
    private final boolean[] v5;
    public se0 we;

    public se0(cf0[] cf0VarArr, ef0[] ef0VarArr, long j, rn0 rn0Var, ze0 ze0Var, nk0 nk0Var, Object obj, int i, int i2, boolean z, long j2) {
        this.J8 = cf0VarArr;
        this.Ws = ef0VarArr;
        this.Zo = j;
        this.QX = rn0Var;
        this.XL = ze0Var;
        this.aM = nk0Var;
        ro0.FH(obj);
        this.DW = obj;
        this.FH = i;
        this.VH = i2;
        this.u7 = z;
        this.gn = j2;
        this.Hw = new uk0[cf0VarArr.length];
        this.v5 = new boolean[cf0VarArr.length];
        this.j6 = nk0Var.Hw(i2, ze0Var.FH());
    }

    public final long DW(long j, boolean z, boolean[] zArr) {
        qn0 qn0Var = this.J0.DW;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= qn0Var.j6) {
                break;
            }
            boolean[] zArr2 = this.v5;
            if (z || !this.J0.j6(this.j3, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long jJ8 = this.j6.J8(qn0Var.DW(), this.v5, this.Hw, zArr, j);
        this.j3 = this.J0;
        this.EQ = false;
        int i2 = 0;
        while (true) {
            uk0[] uk0VarArr = this.Hw;
            if (i2 >= uk0VarArr.length) {
                this.XL.Hw(this.J8, this.J0.j6, qn0Var);
                return jJ8;
            }
            if (uk0VarArr[i2] != null) {
                ro0.Hw(qn0Var.j6(i2) != null);
                this.EQ = true;
            } else {
                ro0.Hw(qn0Var.j6(i2) == null);
            }
            i2++;
        }
    }

    public final long FH(long j, boolean z) {
        return DW(j, false, new boolean[this.J8.length]);
    }

    public final void Hw(int i, boolean z) {
        this.VH = i;
        this.u7 = z;
    }

    public final boolean VH() {
        boolean z;
        tn0 tn0VarDW = this.QX.DW(this.Ws, this.j6.tp());
        tn0 tn0Var = this.j3;
        if (tn0Var == null) {
            z = false;
            break;
        }
        for (int i = 0; i < tn0VarDW.DW.j6; i++) {
            if (!tn0VarDW.j6(tn0Var, i)) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            return false;
        }
        this.J0 = tn0VarDW;
        return true;
    }

    public final boolean Zo() {
        if (this.tp) {
            return !this.EQ || this.j6.gn() == Long.MIN_VALUE;
        }
        return false;
    }

    public final void j6() {
        try {
            this.aM.FH(this.j6);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }

    public final long v5() {
        return this.Zo - this.gn;
    }
}
