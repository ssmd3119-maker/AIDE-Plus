package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    public final String packageName;
    public final long zzade;
    public final String zzafi;
    public final String zzafk;
    public final long zzafo;
    public final String zzafp;
    public final long zzafq;
    public final boolean zzafr;
    public final long zzafs;
    public final boolean zzaft;
    public final boolean zzafu;
    public final String zzafv;
    public final String zzagm;
    public final boolean zzagn;
    public final long zzago;
    public final int zzagp;
    public final boolean zzagq;
    public final String zzts;

    zzk(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        p.v5(str);
        this.packageName = str;
        this.zzafi = TextUtils.isEmpty(str2) ? null : str2;
        this.zzts = str3;
        this.zzafo = j;
        this.zzafp = str4;
        this.zzade = j2;
        this.zzafq = j3;
        this.zzagm = str5;
        this.zzafr = z;
        this.zzagn = z2;
        this.zzafk = str6;
        this.zzafs = j4;
        this.zzago = j5;
        this.zzagp = i;
        this.zzaft = z3;
        this.zzafu = z4;
        this.zzagq = z5;
        this.zzafv = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = b.j6(parcel);
        b.XL(parcel, 2, this.packageName, false);
        b.XL(parcel, 3, this.zzafi, false);
        b.XL(parcel, 4, this.zzts, false);
        b.XL(parcel, 5, this.zzafp, false);
        b.J0(parcel, 6, this.zzade);
        b.J0(parcel, 7, this.zzafq);
        b.XL(parcel, 8, this.zzagm, false);
        b.FH(parcel, 9, this.zzafr);
        b.FH(parcel, 10, this.zzagn);
        b.J0(parcel, 11, this.zzafo);
        b.XL(parcel, 12, this.zzafk, false);
        b.J0(parcel, 13, this.zzafs);
        b.J0(parcel, 14, this.zzago);
        b.tp(parcel, 15, this.zzagp);
        b.FH(parcel, 16, this.zzaft);
        b.FH(parcel, 17, this.zzafu);
        b.FH(parcel, 18, this.zzagq);
        b.XL(parcel, 19, this.zzafv, false);
        b.DW(parcel, iJ6);
    }

    zzk(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        this.packageName = str;
        this.zzafi = str2;
        this.zzts = str3;
        this.zzafo = j3;
        this.zzafp = str4;
        this.zzade = j;
        this.zzafq = j2;
        this.zzagm = str5;
        this.zzafr = z;
        this.zzagn = z2;
        this.zzafk = str6;
        this.zzafs = j4;
        this.zzago = j5;
        this.zzagp = i;
        this.zzaft = z3;
        this.zzafu = z4;
        this.zzagq = z5;
        this.zzafv = str7;
    }
}
