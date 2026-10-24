package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class pv0 {
    private Bundle DW;
    private String EQ;
    private int FH;
    private List<String> Hw;
    private Bundle J0;
    private List<String> J8;
    private String Mr;
    private String QX;
    private boolean VH;
    private String Ws;
    private boolean XL;
    private int Zo;
    private zzvv aM;
    private String gn;
    private int j3;
    private long j6;
    private Location tp;
    private zzzs u7;
    private boolean v5;
    private Bundle we;

    public pv0(zzwb zzwbVar) {
        this.j6 = zzwbVar.mb;
        this.DW = zzwbVar.jw;
        this.FH = zzwbVar.fY;
        this.Hw = zzwbVar.qp;
        this.v5 = zzwbVar.k2;
        this.Zo = zzwbVar.zh;
        this.VH = zzwbVar.AL;
        this.gn = zzwbVar.w9;
        this.u7 = zzwbVar.hK;
        this.tp = zzwbVar.cT;
        this.EQ = zzwbVar.q7;
        this.we = zzwbVar.Z1;
        this.J0 = zzwbVar.n5;
        this.J8 = zzwbVar.Q6;
        this.Ws = zzwbVar.kf;
        this.QX = zzwbVar.Jl;
        this.XL = zzwbVar.iW;
        this.aM = zzwbVar.eU;
        this.j3 = zzwbVar.e3;
        this.Mr = zzwbVar.sE;
    }

    public final zzwb DW() {
        return new zzwb(8, this.j6, this.DW, this.FH, this.Hw, this.v5, this.Zo, this.VH, this.gn, this.u7, this.tp, this.EQ, this.we, this.J0, this.J8, this.Ws, this.QX, this.XL, this.aM, this.j3, this.Mr);
    }

    public final pv0 j6(Location location) {
        this.tp = null;
        return this;
    }
}
