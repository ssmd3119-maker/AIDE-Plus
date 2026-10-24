package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class sa extends zd0 implements qa {
    sa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void EQ() {
        g3(1, sh());
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void Gj(int i) {
        Parcel parcelSh = sh();
        parcelSh.writeInt(i);
        g3(3, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void MP(zzawd zzawdVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzawdVar);
        g3(14, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void PT() {
        g3(13, sh());
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void Rf(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(12, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void U2(String str, String str2) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        parcelSh.writeString(str2);
        g3(9, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void fN() {
        g3(2, sh());
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void hK() {
        g3(8, sh());
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void k2() {
        g3(6, sh());
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void ko() {
        g3(5, sh());
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void l3(ta taVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, taVar);
        g3(7, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void lp(b3 b3Var, String str) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, b3Var);
        parcelSh.writeString(str);
        g3(10, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void mb() {
        g3(4, sh());
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void w9() {
        g3(11, sh());
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void yO() {
        g3(15, sh());
    }
}
