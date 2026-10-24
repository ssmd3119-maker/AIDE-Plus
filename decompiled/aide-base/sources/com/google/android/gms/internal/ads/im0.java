package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class im0 {
    public qm0 DW;
    public em0 FH;
    private long Hw;
    public final fl0 j6;
    private int v5;

    public im0(long j, qm0 qm0Var, boolean z, boolean z2) {
        dh0 ni0Var;
        this.Hw = j;
        this.DW = qm0Var;
        String str = qm0Var.j6.qp;
        if (wo0.FH(str) || "application/ttml+xml".equals(str)) {
            this.j6 = null;
        } else {
            if ("application/x-rawcc".equals(str)) {
                ni0Var = new zi0(qm0Var.j6);
            } else {
                if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm")) {
                    ni0Var = new th0(1);
                } else {
                    int i = z ? 4 : 0;
                    ni0Var = new ni0(z2 ? i | 8 : i);
                }
            }
            this.j6 = new fl0(ni0Var, qm0Var.j6);
        }
        this.FH = qm0Var.EQ();
    }

    public final int DW(long j) {
        return this.FH.DW(j, this.Hw) + this.v5;
    }

    public final pm0 FH(int i) {
        return this.FH.VH(i - this.v5);
    }

    public final long Hw(int i) {
        return this.FH.Hw(i - this.v5);
    }

    public final int VH() {
        return this.FH.FH(this.Hw);
    }

    public final int Zo() {
        return this.FH.v5() + this.v5;
    }

    public final void j6(long j, qm0 qm0Var) throws xj0 {
        int iFH;
        em0 em0VarEQ = this.DW.EQ();
        em0 em0VarEQ2 = qm0Var.EQ();
        this.Hw = j;
        this.DW = qm0Var;
        if (em0VarEQ == null) {
            return;
        }
        this.FH = em0VarEQ2;
        if (em0VarEQ.j6() && (iFH = em0VarEQ.FH(this.Hw)) != 0) {
            int iV5 = (em0VarEQ.v5() + iFH) - 1;
            long jHw = em0VarEQ.Hw(iV5) + em0VarEQ.Zo(iV5, this.Hw);
            int iV52 = em0VarEQ2.v5();
            long jHw2 = em0VarEQ2.Hw(iV52);
            if (jHw == jHw2) {
                this.v5 += (iV5 + 1) - iV52;
            } else {
                if (jHw < jHw2) {
                    throw new xj0();
                }
                this.v5 += em0VarEQ.DW(jHw2, this.Hw) - iV52;
            }
        }
    }

    public final long v5(int i) {
        return Hw(i) + this.FH.Zo(i - this.v5, this.Hw);
    }
}
