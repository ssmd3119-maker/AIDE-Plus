package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@jg
/* loaded from: classes.dex */
public final class ih {
    public final boolean BT;
    public final zzwb DW;
    public final int EQ;
    public final zzwf FH;
    public final String Hw;
    public final int I;
    public final List<String> J0;
    public final List<String> J8;
    public final String KD;
    public final String Mr;
    public final String Mz;
    public final Bundle OW;
    public final int P8;
    public final boolean QX;
    public final boolean Qq;
    public final Future<String> SI;
    public final boolean Sf;
    public final long U2;
    public final String VH;
    public final Bundle Ws;
    public final int XL;
    public final PackageInfo Zo;
    public final String a8;
    public final int aM;
    public final String aj;
    public final boolean ca;
    public final String cb;
    public final int cn;
    public final zzyv dx;
    public final Bundle ef;
    public final boolean ei;
    public final zzacp er;
    public final List<Integer> g3;
    public final float gW;
    public final String gn;
    public final float j3;
    public final Bundle j6;
    public final List<String> lg;
    public final zzafz lp;
    public final boolean nw;
    public final String rN;
    public final boolean ro;
    public final boolean sG;
    public final Bundle sh;
    public final ArrayList<String> sy;
    public final zzbbi tp;
    public final Bundle u7;
    public final ApplicationInfo v5;
    public final Future<String> vJ;
    public final int vy;
    public final List<String> we;
    public final boolean x9;
    public final String yS;

    public ih(Bundle bundle, zzwb zzwbVar, zzwf zzwfVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, zzbbi zzbbiVar, Bundle bundle2, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i, int i2, float f, String str4, long j, String str5, List<String> list3, String str6, zzacp zzacpVar, String str7, float f2, boolean z2, int i3, int i4, boolean z3, boolean z4, Future<String> future, String str8, boolean z5, int i5, Bundle bundle4, String str9, zzyv zzyvVar, boolean z6, Bundle bundle5, boolean z7, Future<String> future2, List<Integer> list4, String str10, List<String> list5, int i6, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str11, zzafz zzafzVar, Bundle bundle6) {
        this.j6 = bundle;
        this.DW = zzwbVar;
        this.FH = zzwfVar;
        this.Hw = str;
        this.v5 = applicationInfo;
        this.Zo = packageInfo;
        this.VH = str2;
        this.gn = str3;
        this.tp = zzbbiVar;
        this.u7 = bundle2;
        this.QX = z;
        this.XL = i;
        this.aM = i2;
        this.j3 = f;
        if (list == null || list.size() <= 0) {
            this.EQ = 0;
            this.we = null;
            this.J0 = null;
        } else {
            this.EQ = 3;
            this.we = list;
            this.J0 = list2;
        }
        this.Ws = bundle3;
        this.Mr = str4;
        this.U2 = j;
        this.a8 = str5;
        this.lg = list3;
        this.rN = str6;
        this.er = zzacpVar;
        this.yS = str7;
        this.gW = f2;
        this.BT = z2;
        this.vy = i3;
        this.P8 = i4;
        this.ei = z3;
        this.nw = z4;
        this.SI = future;
        this.KD = str8;
        this.ro = z5;
        this.cn = i5;
        this.sh = bundle4;
        this.cb = str9;
        this.dx = zzyvVar;
        this.sG = z6;
        this.ef = bundle5;
        this.Sf = z7;
        this.vJ = future2;
        this.g3 = list4;
        this.Mz = str10;
        this.J8 = list5;
        this.I = i6;
        this.ca = z8;
        this.x9 = z9;
        this.Qq = z10;
        this.sy = arrayList;
        this.aj = str11;
        this.lp = zzafzVar;
        this.OW = bundle6;
    }
}
