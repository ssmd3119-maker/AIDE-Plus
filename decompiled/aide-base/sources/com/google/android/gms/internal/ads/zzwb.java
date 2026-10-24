package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import javax.annotation.Nullable;

@jg
/* loaded from: classes.dex */
public final class zzwb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwb> CREATOR = new qv0();
    public final boolean AL;
    public final String Jl;
    public final List<String> Q6;
    public final int WB;
    public final Bundle Z1;
    public final Location cT;
    public final int e3;

    @Nullable
    public final zzvv eU;

    @Deprecated
    public final int fY;
    public final zzzs hK;

    @Deprecated
    public final boolean iW;
    public final Bundle jw;
    public final boolean k2;
    public final String kf;

    @Deprecated
    public final long mb;
    public final Bundle n5;
    public final String q7;
    public final List<String> qp;

    @Nullable
    public final String sE;
    public final String w9;
    public final int zh;

    public zzwb(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzzs zzzsVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, zzvv zzvvVar, int i4, @Nullable String str5) {
        this.WB = i;
        this.mb = j;
        this.jw = bundle == null ? new Bundle() : bundle;
        this.fY = i2;
        this.qp = list;
        this.k2 = z;
        this.zh = i3;
        this.AL = z2;
        this.w9 = str;
        this.hK = zzzsVar;
        this.cT = location;
        this.q7 = str2;
        this.Z1 = bundle2 == null ? new Bundle() : bundle2;
        this.n5 = bundle3;
        this.Q6 = list2;
        this.kf = str3;
        this.Jl = str4;
        this.iW = z3;
        this.eU = zzvvVar;
        this.e3 = i4;
        this.sE = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzwb)) {
            return false;
        }
        zzwb zzwbVar = (zzwb) obj;
        return this.WB == zzwbVar.WB && this.mb == zzwbVar.mb && com.google.android.gms.common.internal.o.j6(this.jw, zzwbVar.jw) && this.fY == zzwbVar.fY && com.google.android.gms.common.internal.o.j6(this.qp, zzwbVar.qp) && this.k2 == zzwbVar.k2 && this.zh == zzwbVar.zh && this.AL == zzwbVar.AL && com.google.android.gms.common.internal.o.j6(this.w9, zzwbVar.w9) && com.google.android.gms.common.internal.o.j6(this.hK, zzwbVar.hK) && com.google.android.gms.common.internal.o.j6(this.cT, zzwbVar.cT) && com.google.android.gms.common.internal.o.j6(this.q7, zzwbVar.q7) && com.google.android.gms.common.internal.o.j6(this.Z1, zzwbVar.Z1) && com.google.android.gms.common.internal.o.j6(this.n5, zzwbVar.n5) && com.google.android.gms.common.internal.o.j6(this.Q6, zzwbVar.Q6) && com.google.android.gms.common.internal.o.j6(this.kf, zzwbVar.kf) && com.google.android.gms.common.internal.o.j6(this.Jl, zzwbVar.Jl) && this.iW == zzwbVar.iW && this.e3 == zzwbVar.e3 && com.google.android.gms.common.internal.o.j6(this.sE, zzwbVar.sE);
    }

    public final zzwb gn() {
        Bundle bundle = this.Z1.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle == null) {
            bundle = this.jw;
            this.Z1.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle);
        }
        return new zzwb(this.WB, this.mb, bundle, this.fY, this.qp, this.k2, this.zh, this.AL, this.w9, this.hK, this.cT, this.q7, this.Z1, this.n5, this.Q6, this.kf, this.Jl, this.iW, this.eU, this.e3, this.sE);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.o.DW(Integer.valueOf(this.WB), Long.valueOf(this.mb), this.jw, Integer.valueOf(this.fY), this.qp, Boolean.valueOf(this.k2), Integer.valueOf(this.zh), Boolean.valueOf(this.AL), this.w9, this.hK, this.cT, this.q7, this.Z1, this.n5, this.Q6, this.kf, this.Jl, Boolean.valueOf(this.iW), Integer.valueOf(this.e3), this.sE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 2, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 3, this.jw, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 4, this.fY);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 5, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 6, this.k2);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 7, this.zh);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 8, this.AL);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 9, this.w9, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 10, this.hK, i, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 11, this.cT, i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 12, this.q7, false);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 13, this.Z1, false);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 14, this.n5, false);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 15, this.Q6, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 16, this.kf, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 17, this.Jl, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 18, this.iW);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 19, this.eU, i, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 20, this.e3);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 21, this.sE, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
