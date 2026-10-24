package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class yl {
    public final String BT;
    public final cv DW;
    public final JSONObject EQ;
    public final List<String> FH;
    public final int Hw;
    private final zzaso J0;
    public boolean J8;
    public boolean KD;
    public final w9 Mr;
    public final j1 P8;
    public final t9 QX;
    public boolean SI;
    public final boolean Sf;
    public final String U2;
    public final List<String> VH;
    public final boolean Ws;
    public final na XL;
    public final List<String> Zo;
    public final zzwf a8;
    public final String aM;
    public final pt0 cb;
    public boolean cn;
    public final boolean dx;
    public final boolean ef;
    public boolean ei;
    public final List<String> er;
    public final long gW;
    public final int gn;
    public final u9 j3;
    public final zzwb j6;
    public final zzawd lg;
    public boolean nw;
    public final List<String> rN;
    public boolean ro;
    public final boolean sG;
    public final List<String> sh;
    public final String tp;
    public final long u7;
    public final List<String> v5;
    public final boolean vJ;
    public final String vy;
    public final boolean we;
    public final long yS;

    public yl(zzwb zzwbVar, cv cvVar, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, t9 t9Var, na naVar, String str2, u9 u9Var, w9 w9Var, long j2, zzwf zzwfVar, long j3, long j4, long j5, String str3, JSONObject jSONObject, j1 j1Var, zzawd zzawdVar, List<String> list4, List<String> list5, boolean z2, zzaso zzasoVar, String str4, List<String> list6, String str5, pt0 pt0Var, boolean z3, boolean z4, boolean z5, List<String> list7, boolean z6, String str6, boolean z7) {
        this.ei = false;
        this.nw = false;
        this.SI = false;
        this.KD = false;
        this.ro = false;
        this.cn = false;
        this.j6 = zzwbVar;
        this.DW = cvVar;
        this.FH = DW(list);
        this.Hw = i;
        this.v5 = DW(list2);
        this.VH = DW(list3);
        this.gn = i2;
        this.u7 = j;
        this.tp = str;
        this.Ws = z;
        this.QX = t9Var;
        this.XL = naVar;
        this.aM = str2;
        this.j3 = u9Var;
        this.Mr = w9Var;
        this.a8 = zzwfVar;
        this.yS = j4;
        this.gW = j5;
        this.BT = str3;
        this.EQ = jSONObject;
        this.P8 = j1Var;
        this.lg = zzawdVar;
        this.rN = DW(list4);
        this.er = DW(list5);
        this.we = z2;
        this.J0 = zzasoVar;
        this.U2 = str4;
        this.sh = DW(list6);
        this.vy = str5;
        this.cb = pt0Var;
        this.dx = z3;
        this.sG = z4;
        this.ef = z5;
        this.Zo = DW(list7);
        this.Sf = z6;
        this.vJ = z7;
    }

    private static <T> List<T> DW(List<T> list) {
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public final boolean j6() {
        cv cvVar = this.DW;
        if (cvVar == null || cvVar.AF() == null) {
            return false;
        }
        return this.DW.AF().XL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yl(zl zlVar, cv cvVar, t9 t9Var, na naVar, String str, w9 w9Var, j1 j1Var, String str2) {
        zzasi zzasiVar = zlVar.j6;
        zzwb zzwbVar = zzasiVar.jw;
        zzasm zzasmVar = zlVar.DW;
        List<String> list = zzasmVar.qp;
        int i = zlVar.v5;
        List<String> list2 = zzasmVar.zh;
        List<String> list3 = zzasmVar.cT;
        int i2 = zzasmVar.Z1;
        long j = zzasmVar.q7;
        String str3 = zzasiVar.w9;
        boolean z = zzasmVar.w9;
        u9 u9Var = zlVar.FH;
        long j2 = zzasmVar.hK;
        zzwf zzwfVar = zlVar.Hw;
        long j3 = zzasmVar.AL;
        long j4 = zlVar.Zo;
        long j5 = zlVar.VH;
        String str4 = zzasmVar.kf;
        JSONObject jSONObject = zlVar.gn;
        zzawd zzawdVar = zzasmVar.e9;
        List<String> list4 = zzasmVar.QO;
        this(zzwbVar, null, list, i, list2, list3, i2, j, str3, z, null, null, null, u9Var, null, j2, zzwfVar, j3, j4, j5, str4, jSONObject, null, zzawdVar, list4, list4, zzasmVar.a5, zzasmVar.ys, null, zzasmVar.Nh, zzasmVar.An, zlVar.u7, zzasmVar.Bx, zlVar.tp, zzasmVar.qP, zzasmVar.MP, zzasmVar.Of, zzasmVar.PT, zzasmVar.AR);
    }
}
