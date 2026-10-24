package com.google.android.gms.ads.internal.overlay;

import abcd.wu;
import abcd.xu;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.hv0;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.zzbbi;

@jg
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new l();
    public final String AL;
    public final zzaq Q6;
    public final zzc WB;
    public final zzbbi Z1;
    public final int cT;
    public final cv fY;
    public final int hK;
    public final m jw;
    public final String k2;
    public final com.google.android.gms.ads.internal.gmsg.i kf;
    public final hv0 mb;
    public final String n5;
    public final String q7;
    public final com.google.android.gms.ads.internal.gmsg.k qp;
    public final s w9;
    public final boolean zh;

    public AdOverlayInfoParcel(hv0 hv0Var, m mVar, s sVar, cv cvVar, int i, zzbbi zzbbiVar, String str, zzaq zzaqVar) {
        this.WB = null;
        this.mb = hv0Var;
        this.jw = mVar;
        this.fY = cvVar;
        this.kf = null;
        this.qp = null;
        this.k2 = null;
        this.zh = false;
        this.AL = null;
        this.w9 = sVar;
        this.hK = i;
        this.cT = 1;
        this.q7 = null;
        this.Z1 = zzbbiVar;
        this.n5 = str;
        this.Q6 = zzaqVar;
    }

    public static AdOverlayInfoParcel EQ(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public static void gn(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 2, this.WB, i, false);
        com.google.android.gms.common.internal.safeparcel.b.u7(parcel, 3, xu.sy(this.mb).asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.b.u7(parcel, 4, xu.sy(this.jw).asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.b.u7(parcel, 5, xu.sy(this.fY).asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.b.u7(parcel, 6, xu.sy(this.qp).asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 7, this.k2, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 8, this.zh);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 9, this.AL, false);
        com.google.android.gms.common.internal.safeparcel.b.u7(parcel, 10, xu.sy(this.w9).asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 11, this.hK);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 12, this.cT);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 13, this.q7, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 14, this.Z1, i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 16, this.n5, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 17, this.Q6, i, false);
        com.google.android.gms.common.internal.safeparcel.b.u7(parcel, 18, xu.sy(this.kf).asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public AdOverlayInfoParcel(hv0 hv0Var, m mVar, s sVar, cv cvVar, boolean z, int i, zzbbi zzbbiVar) {
        this.WB = null;
        this.mb = hv0Var;
        this.jw = mVar;
        this.fY = cvVar;
        this.kf = null;
        this.qp = null;
        this.k2 = null;
        this.zh = z;
        this.AL = null;
        this.w9 = sVar;
        this.hK = i;
        this.cT = 2;
        this.q7 = null;
        this.Z1 = zzbbiVar;
        this.n5 = null;
        this.Q6 = null;
    }

    public AdOverlayInfoParcel(hv0 hv0Var, m mVar, com.google.android.gms.ads.internal.gmsg.i iVar, com.google.android.gms.ads.internal.gmsg.k kVar, s sVar, cv cvVar, boolean z, int i, String str, zzbbi zzbbiVar) {
        this.WB = null;
        this.mb = hv0Var;
        this.jw = mVar;
        this.fY = cvVar;
        this.kf = iVar;
        this.qp = kVar;
        this.k2 = null;
        this.zh = z;
        this.AL = null;
        this.w9 = sVar;
        this.hK = i;
        this.cT = 3;
        this.q7 = str;
        this.Z1 = zzbbiVar;
        this.n5 = null;
        this.Q6 = null;
    }

    public AdOverlayInfoParcel(hv0 hv0Var, m mVar, com.google.android.gms.ads.internal.gmsg.i iVar, com.google.android.gms.ads.internal.gmsg.k kVar, s sVar, cv cvVar, boolean z, int i, String str, String str2, zzbbi zzbbiVar) {
        this.WB = null;
        this.mb = hv0Var;
        this.jw = mVar;
        this.fY = cvVar;
        this.kf = iVar;
        this.qp = kVar;
        this.k2 = str2;
        this.zh = z;
        this.AL = str;
        this.w9 = sVar;
        this.hK = i;
        this.cT = 3;
        this.q7 = null;
        this.Z1 = zzbbiVar;
        this.n5 = null;
        this.Q6 = null;
    }

    public AdOverlayInfoParcel(zzc zzcVar, hv0 hv0Var, m mVar, s sVar, zzbbi zzbbiVar) {
        this.WB = zzcVar;
        this.mb = hv0Var;
        this.jw = mVar;
        this.fY = null;
        this.kf = null;
        this.qp = null;
        this.k2 = null;
        this.zh = false;
        this.AL = null;
        this.w9 = sVar;
        this.hK = -1;
        this.cT = 4;
        this.q7 = null;
        this.Z1 = zzbbiVar;
        this.n5 = null;
        this.Q6 = null;
    }

    AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzbbi zzbbiVar, String str4, zzaq zzaqVar, IBinder iBinder6) {
        this.WB = zzcVar;
        this.mb = (hv0) xu.g3(wu.a.dx(iBinder));
        this.jw = (m) xu.g3(wu.a.dx(iBinder2));
        this.fY = (cv) xu.g3(wu.a.dx(iBinder3));
        this.kf = (com.google.android.gms.ads.internal.gmsg.i) xu.g3(wu.a.dx(iBinder6));
        this.qp = (com.google.android.gms.ads.internal.gmsg.k) xu.g3(wu.a.dx(iBinder4));
        this.k2 = str;
        this.zh = z;
        this.AL = str2;
        this.w9 = (s) xu.g3(wu.a.dx(iBinder5));
        this.hK = i;
        this.cT = i2;
        this.q7 = str3;
        this.Z1 = zzbbiVar;
        this.n5 = str4;
        this.Q6 = zzaqVar;
    }
}
