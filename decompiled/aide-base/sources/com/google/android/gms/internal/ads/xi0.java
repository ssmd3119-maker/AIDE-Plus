package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xi0 {
    public long DW;
    public long[] EQ;
    public long FH;
    public long Hw;
    public boolean J0;
    public boolean[] J8;
    public int QX;
    public long[] VH;
    public wi0 Ws;
    public ap0 XL;
    public int Zo;
    public boolean aM;
    public int[] gn;
    public long j3;
    public ki0 j6;
    public int[] tp;
    public int[] u7;
    public int v5;
    public boolean[] we;

    xi0() {
    }

    public final long DW(int i) {
        return this.EQ[i] + this.tp[i];
    }

    public final void j6(int i) {
        ap0 ap0Var = this.XL;
        if (ap0Var == null || ap0Var.FH() < i) {
            this.XL = new ap0(i);
        }
        this.QX = i;
        this.J0 = true;
        this.aM = true;
    }
}
