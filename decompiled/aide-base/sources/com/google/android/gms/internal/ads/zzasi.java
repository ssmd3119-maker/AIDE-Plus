package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzasi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasi> CREATOR = new jh();
    public final Bundle AE;
    public final String AL;
    public final boolean AR;
    public final zzyv An;
    public final int BR;
    public final String Bx;
    public final List<String> Cz;
    public final String E4;
    public final ArrayList<String> Fd;
    public final zzacp Gj;
    public final boolean IS;
    public final int Jl;
    public final String Jm;
    public final String Lz;
    public final List<Integer> MP;
    public final boolean Nh;
    public final String Of;
    public final List<String> PT;
    public final boolean Pa;
    public final Bundle Q6;
    public final int QO;
    public final boolean TI;
    public final int WB;
    public final int Z1;
    public final String Za;
    public final boolean a5;
    public final float aX;
    public final int b1;
    public final zzbbi cT;
    public final Bundle ce;
    public final boolean ct;
    public final String e3;
    public final int e9;
    public final float eU;
    public final String fN;
    public final zzwf fY;
    public final String gG;
    public final String hK;
    public final int iW;
    public final zzwb jw;
    public final ApplicationInfo k2;
    public final boolean kf;
    public final Bundle mb;
    public final List<String> n5;
    public final String oa;
    public final String oy;
    public final long pN;
    public final List<String> pO;
    public final Bundle q7;
    public final boolean qP;
    public final String qp;
    public final long sE;
    public final boolean sM;
    public final zzafz sT;
    public final String sg;
    public final String w9;
    public final Bundle xg;
    public final String ys;
    public final PackageInfo zh;

    private zzasi(Bundle bundle, zzwb zzwbVar, zzwf zzwfVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzbbi zzbbiVar, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, List<String> list3, String str7, zzacp zzacpVar, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, zzyv zzyvVar, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzafz zzafzVar, String str17, Bundle bundle6) {
        this(24, bundle, zzwbVar, zzwfVar, str, applicationInfo, packageInfo, str2, str3, str4, zzbbiVar, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, zzacpVar, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, zzyvVar, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9, z10, arrayList, str16, zzafzVar, str17, bundle6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 2, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 3, this.jw, i, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 4, this.fY, i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 5, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 6, this.k2, i, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 7, this.zh, i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 8, this.AL, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 9, this.w9, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 10, this.hK, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 11, this.cT, i, false);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 12, this.q7, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 13, this.Z1);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 14, this.n5, false);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 15, this.Q6, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 16, this.kf);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 18, this.Jl);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 19, this.iW);
        com.google.android.gms.common.internal.safeparcel.b.VH(parcel, 20, this.eU);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 21, this.e3, false);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 25, this.sE);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 26, this.sg, false);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 27, this.pO, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 28, this.fN, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 29, this.Gj, i, false);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 30, this.Cz, false);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 31, this.pN);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 33, this.oy, false);
        com.google.android.gms.common.internal.safeparcel.b.VH(parcel, 34, this.aX);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 35, this.e9);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 36, this.QO);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 37, this.sM);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 38, this.a5);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 39, this.ys, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 40, this.IS);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 41, this.gG, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 42, this.Nh);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 43, this.BR);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 44, this.AE, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 45, this.Za, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 46, this.An, i, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 47, this.Pa);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 48, this.ce, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 49, this.Jm, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 50, this.Bx, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 51, this.oa, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 52, this.qP);
        com.google.android.gms.common.internal.safeparcel.b.EQ(parcel, 53, this.MP, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 54, this.Of, false);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 55, this.PT, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 56, this.b1);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 57, this.AR);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 58, this.TI);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 59, this.ct);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 60, this.Fd, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 61, this.Lz, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 63, this.sT, i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 64, this.E4, false);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 65, this.xg, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zzasi(ih ihVar, long j, String str, String str2, String str3, String str4) {
        this(ihVar.j6, ihVar.DW, ihVar.FH, ihVar.Hw, ihVar.v5, ihVar.Zo, (String) jq.v5(ihVar.vJ, ""), ihVar.VH, ihVar.gn, ihVar.tp, ihVar.u7, ihVar.EQ, ihVar.we, ihVar.J0, ihVar.Ws, ihVar.QX, ihVar.XL, ihVar.aM, ihVar.j3, ihVar.Mr, ihVar.U2, ihVar.a8, ihVar.lg, ihVar.rN, ihVar.er, j, ihVar.yS, ihVar.gW, ihVar.BT, ihVar.vy, ihVar.P8, ihVar.ei, ihVar.nw, (String) jq.Zo(ihVar.SI, "", 1L, TimeUnit.SECONDS), ihVar.KD, ihVar.ro, ihVar.cn, ihVar.sh, ihVar.cb, ihVar.dx, ihVar.sG, ihVar.ef, str, str2, str3, ihVar.Sf, ihVar.g3, ihVar.Mz, ihVar.J8, ihVar.I, ihVar.ca, ihVar.x9, ihVar.Qq, ihVar.sy, ihVar.aj, ihVar.lp, str4, ihVar.OW);
    }

    zzasi(int i, Bundle bundle, zzwb zzwbVar, zzwf zzwfVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzbbi zzbbiVar, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzacp zzacpVar, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzyv zzyvVar, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzafz zzafzVar, String str17, Bundle bundle6) {
        List<String> listUnmodifiableList;
        List<String> listUnmodifiableList2;
        this.WB = i;
        this.mb = bundle;
        this.jw = zzwbVar;
        this.fY = zzwfVar;
        this.qp = str;
        this.k2 = applicationInfo;
        this.zh = packageInfo;
        this.AL = str2;
        this.w9 = str3;
        this.hK = str4;
        this.cT = zzbbiVar;
        this.q7 = bundle2;
        this.Z1 = i2;
        this.n5 = list;
        if (list3 == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list3);
        }
        this.Cz = listUnmodifiableList;
        this.Q6 = bundle3;
        this.kf = z;
        this.Jl = i3;
        this.iW = i4;
        this.eU = f;
        this.e3 = str5;
        this.sE = j;
        this.sg = str6;
        if (list2 == null) {
            listUnmodifiableList2 = Collections.emptyList();
        } else {
            listUnmodifiableList2 = Collections.unmodifiableList(list2);
        }
        this.pO = listUnmodifiableList2;
        this.fN = str7;
        this.Gj = zzacpVar;
        this.pN = j2;
        this.oy = str8;
        this.aX = f2;
        this.IS = z2;
        this.e9 = i5;
        this.QO = i6;
        this.sM = z3;
        this.a5 = z4;
        this.ys = str9;
        this.gG = str10;
        this.Nh = z5;
        this.BR = i7;
        this.AE = bundle4;
        this.Za = str11;
        this.An = zzyvVar;
        this.Pa = z6;
        this.ce = bundle5;
        this.Jm = str12;
        this.Bx = str13;
        this.oa = str14;
        this.qP = z7;
        this.MP = list4;
        this.Of = str15;
        this.PT = list5;
        this.b1 = i8;
        this.AR = z8;
        this.TI = z9;
        this.ct = z10;
        this.Fd = arrayList;
        this.Lz = str16;
        this.sT = zzafzVar;
        this.E4 = str17;
        this.xg = bundle6;
    }
}
