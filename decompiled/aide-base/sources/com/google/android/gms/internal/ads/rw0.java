package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* loaded from: classes.dex */
public final class rw0 extends zd0 implements pw0 {
    rw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void D5(zzacp zzacpVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzacpVar);
        g3(6, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void HU(s3 s3Var, zzwf zzwfVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, s3Var);
        be0.Hw(parcelSh, zzwfVar);
        g3(8, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void LA(PublisherAdViewOptions publisherAdViewOptions) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, publisherAdViewOptions);
        g3(9, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void eJ(jw0 jw0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, jw0Var);
        g3(2, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void fP(v3 v3Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, v3Var);
        g3(10, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void ob(ix0 ix0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, ix0Var);
        g3(7, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void sT(e5 e5Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, e5Var);
        g3(14, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final mw0 tj() {
        mw0 ow0Var;
        Parcel parcelDx = dx(1, sh());
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            ow0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            ow0Var = iInterfaceQueryLocalInterface instanceof mw0 ? (mw0) iInterfaceQueryLocalInterface : new ow0(strongBinder);
        }
        parcelDx.recycle();
        return ow0Var;
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void uM(j3 j3Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, j3Var);
        g3(4, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void wC(String str, p3 p3Var, m3 m3Var) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        be0.FH(parcelSh, p3Var);
        be0.FH(parcelSh, m3Var);
        g3(5, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void yr(g3 g3Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, g3Var);
        g3(3, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void yz(zzafz zzafzVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzafzVar);
        g3(13, parcelSh);
    }
}
