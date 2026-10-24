package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzasm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasm> CREATOR = new lh();
    public final String AE;
    public final long AL;
    public boolean AR;
    public final String An;
    public final boolean BR;
    public final boolean Bx;
    public String Cz;
    private zzasy Gj;
    public final boolean IS;
    public final boolean Jl;
    private Bundle Jm;
    public final List<String> MP;
    public final List<String> Nh;
    public final boolean Of;
    public final String PT;
    public final boolean Pa;
    public final long Q6;
    public final List<String> QO;
    private zzasi WB;
    public final int Z1;
    public final zzawo Za;
    public final boolean a5;
    public final boolean aX;
    public String b1;
    public final List<String> cT;
    public final boolean ce;
    public final boolean e3;
    public final zzawd e9;
    public final String eU;
    public final boolean fN;
    public String fY;
    public String gG;
    public final long hK;
    public final String iW;
    public final String jw;
    public final int k2;
    public final String kf;
    private final int mb;
    public final String n5;
    public final int oa;
    public final boolean oy;
    public final String pN;
    public final boolean pO;
    public final long q7;
    public final boolean qP;
    public final List<String> qp;
    public final boolean sE;
    public final List<String> sM;
    public final boolean sg;
    public final boolean w9;
    public final zzaso ys;
    public final List<String> zh;

    public zzasm(zzasi zzasiVar, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzawd zzawdVar, List<String> list4, List<String> list5, boolean z10, zzaso zzasoVar, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzawo zzawoVar, String str10, boolean z13, boolean z14, boolean z15, int i2, boolean z16, List<String> list7, boolean z17, String str11, String str12, boolean z18) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, zzawdVar, list4, list5, z10, zzasoVar, z11, str8, list6, z12, str9, zzawoVar, str10, z13, z14, null, z15, 0, z16, list7, z17, str11, str12, z18);
        this.WB = zzasiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzasi zzasiVar = this.WB;
        if (zzasiVar != null && zzasiVar.WB >= 9 && !TextUtils.isEmpty(this.fY)) {
            this.Gj = new zzasy(new zzatm(this.fY));
            this.fY = null;
        }
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.jw, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 3, this.fY, false);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 4, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 5, this.k2);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 6, this.zh, false);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 7, this.AL);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 8, this.w9);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 9, this.hK);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 10, this.cT, false);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 11, this.q7);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 12, this.Z1);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 13, this.n5, false);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 14, this.Q6);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 15, this.kf, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 18, this.Jl);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 19, this.iW, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 21, this.eU, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 22, this.e3);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 23, this.sE);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 24, this.sg);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 25, this.pO);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 26, this.fN);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 28, this.Gj, i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 29, this.Cz, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 30, this.pN, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 31, this.oy);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 32, this.aX);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 33, this.e9, i, false);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 34, this.QO, false);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 35, this.sM, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 36, this.a5);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 37, this.ys, i, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 38, this.IS);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 39, this.gG, false);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 40, this.Nh, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 42, this.BR);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 43, this.AE, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 44, this.Za, i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 45, this.An, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 46, this.Pa);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 47, this.ce);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 48, this.Jm, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 49, this.Bx);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 50, this.oa);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 51, this.qP);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 52, this.MP, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 53, this.Of);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 54, this.PT, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 55, this.b1, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 56, this.AR);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zzasm(zzasi zzasiVar, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzawd zzawdVar, List<String> list4, List<String> list5, boolean z9, zzaso zzasoVar, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzawo zzawoVar, String str9, boolean z12, boolean z13, boolean z14, int i2, boolean z15, List<String> list7, boolean z16, String str10, String str11, boolean z17) {
        this(19, str, str2, list, -2, list2, j, z, -1L, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z7, z8, zzawdVar, list4, list5, z9, zzasoVar, z10, str7, list6, z11, str8, zzawoVar, str9, z12, z13, null, z14, i2, z15, list7, z16, str10, str11, z17);
        this.WB = zzasiVar;
    }

    public zzasm(int i) {
        this(19, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null, null, false);
    }

    public zzasm(int i, long j) {
        this(19, null, null, null, i, null, -1L, false, -1L, null, j, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null, null, false);
    }

    zzasm(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzasy zzasyVar, String str7, String str8, boolean z8, boolean z9, zzawd zzawdVar, List<String> list4, List<String> list5, boolean z10, zzaso zzasoVar, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzawo zzawoVar, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4, boolean z16, List<String> list7, boolean z17, String str12, String str13, boolean z18) {
        zzatm zzatmVar;
        this.mb = i;
        this.jw = str;
        this.fY = str2;
        this.qp = list != null ? Collections.unmodifiableList(list) : null;
        this.k2 = i2;
        this.zh = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.AL = j;
        this.w9 = z;
        this.hK = j2;
        this.cT = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.q7 = j3;
        this.Z1 = i3;
        this.n5 = str3;
        this.Q6 = j4;
        this.kf = str4;
        this.Jl = z2;
        this.iW = str5;
        this.eU = str6;
        this.e3 = z3;
        this.sE = z4;
        this.sg = z5;
        this.pO = z6;
        this.Pa = z13;
        this.fN = z7;
        this.Gj = zzasyVar;
        this.Cz = str7;
        this.pN = str8;
        if (this.fY == null && zzasyVar != null && (zzatmVar = (zzatm) zzasyVar.gn(zzatm.CREATOR)) != null && !TextUtils.isEmpty(zzatmVar.WB)) {
            this.fY = zzatmVar.WB;
        }
        this.oy = z8;
        this.aX = z9;
        this.e9 = zzawdVar;
        this.QO = list4;
        this.sM = list5;
        this.a5 = z10;
        this.ys = zzasoVar;
        this.IS = z11;
        this.gG = str9;
        this.Nh = list6;
        this.BR = z12;
        this.AE = str10;
        this.Za = zzawoVar;
        this.An = str11;
        this.ce = z14;
        this.Jm = bundle;
        this.Bx = z15;
        this.oa = i4;
        this.qP = z16;
        this.MP = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.Of = z17;
        this.PT = str12;
        this.b1 = str13;
        this.AR = z18;
    }
}
