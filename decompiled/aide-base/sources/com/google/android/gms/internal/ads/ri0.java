package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes.dex */
public final class ri0 implements dh0, kh0 {
    private static final int QX = ip0.Ws("qt  ");
    private int EQ;
    private si0[] J0;
    private long J8;
    private long VH;
    private boolean Ws;
    private int Zo;
    private int gn;
    private int tp;
    private ap0 u7;
    private int v5;
    private gh0 we;
    private final ap0 FH = new ap0(16);
    private final Stack<ai0> Hw = new Stack<>();
    private final ap0 j6 = new ap0(xo0.j6);
    private final ap0 DW = new ap0(4);

    private final void tp(long j) throws af0 {
        vi0 vi0VarDW;
        while (!this.Hw.isEmpty() && this.Hw.peek().sg == j) {
            ai0 ai0VarPop = this.Hw.pop();
            if (ai0VarPop.j6 == zh0.vy) {
                long jMax = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                zzki zzkiVarHw = null;
                ih0 ih0Var = new ih0();
                bi0 bi0VarZo = ai0VarPop.Zo(zh0.zh);
                if (bi0VarZo != null && (zzkiVarHw = ci0.Hw(bi0VarZo, this.Ws)) != null) {
                    ih0Var.j6(zzkiVarHw);
                }
                for (int i = 0; i < ai0VarPop.fN.size(); i++) {
                    ai0 ai0Var = ai0VarPop.fN.get(i);
                    if (ai0Var.j6 == zh0.ei && (vi0VarDW = ci0.DW(ai0Var, ai0VarPop.Zo(zh0.P8), -9223372036854775807L, null, this.Ws)) != null) {
                        yi0 yi0VarFH = ci0.FH(vi0VarDW, ai0Var.VH(zh0.nw).VH(zh0.SI).VH(zh0.KD), ih0Var);
                        if (yi0VarFH.j6 != 0) {
                            si0 si0Var = new si0(vi0VarDW, yi0VarFH, this.we.j6(i, vi0VarDW.DW));
                            zzfs zzfsVarMr = vi0VarDW.Zo.Mr(yi0VarFH.Hw + 30);
                            if (vi0VarDW.DW == 1) {
                                if (ih0Var.FH()) {
                                    zzfsVarMr = zzfsVarMr.j6(ih0Var.j6, ih0Var.DW);
                                }
                                if (zzkiVarHw != null) {
                                    zzfsVarMr = zzfsVarMr.Hw(zzkiVarHw);
                                }
                            }
                            si0Var.FH.j6(zzfsVarMr);
                            jMax = Math.max(jMax, vi0VarDW.v5);
                            arrayList.add(si0Var);
                        }
                    }
                }
                this.J8 = jMax;
                this.J0 = (si0[]) arrayList.toArray(new si0[arrayList.size()]);
                this.we.Hw();
                this.we.u7(this);
                this.Hw.clear();
                this.v5 = 2;
            } else if (!this.Hw.isEmpty()) {
                this.Hw.peek().Hw(ai0VarPop);
            }
        }
        if (this.v5 != 2) {
            u7();
        }
    }

    private final void u7() {
        this.v5 = 0;
        this.gn = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ea  */
    @Override // com.google.android.gms.internal.ads.dh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int DW(com.google.android.gms.internal.ads.fh0 r24, com.google.android.gms.internal.ads.jh0 r25) throws com.google.android.gms.internal.ads.af0 {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri0.DW(com.google.android.gms.internal.ads.fh0, com.google.android.gms.internal.ads.jh0):int");
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void FH(gh0 gh0Var) {
        this.we = gh0Var;
    }

    @Override // com.google.android.gms.internal.ads.kh0
    public final boolean Hw() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final boolean VH(fh0 fh0Var) {
        return ui0.FH(fh0Var);
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void Zo(long j, long j2) {
        this.Hw.clear();
        this.gn = 0;
        this.tp = 0;
        this.EQ = 0;
        if (j == 0) {
            u7();
            return;
        }
        si0[] si0VarArr = this.J0;
        if (si0VarArr != null) {
            for (si0 si0Var : si0VarArr) {
                yi0 yi0Var = si0Var.DW;
                int iJ6 = yi0Var.j6(j2);
                if (iJ6 == -1) {
                    iJ6 = yi0Var.DW(j2);
                }
                si0Var.Hw = iJ6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kh0
    public final long gn() {
        return this.J8;
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void j6() {
    }

    @Override // com.google.android.gms.internal.ads.kh0
    public final long v5(long j) {
        long j2 = Long.MAX_VALUE;
        for (si0 si0Var : this.J0) {
            yi0 yi0Var = si0Var.DW;
            int iJ6 = yi0Var.j6(j);
            if (iJ6 == -1) {
                iJ6 = yi0Var.DW(j);
            }
            long j3 = yi0Var.DW[iJ6];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }
}
