package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ge0 extends zd0 implements ee0 {
    ge0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.ee0
    public final void E2(int i) {
        Parcel parcelSh = sh();
        parcelSh.writeInt(i);
        g3(7, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.ee0
    public final void Od(byte[] bArr) {
        Parcel parcelSh = sh();
        parcelSh.writeByteArray(bArr);
        g3(5, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.ee0
    public final void g0(abcd.wu wuVar, String str) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        g3(2, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.ee0
    public final void hu(abcd.wu wuVar, String str, String str2) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        parcelSh.writeString(null);
        g3(8, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.ee0
    public final void nA(int i) {
        Parcel parcelSh = sh();
        parcelSh.writeInt(i);
        g3(6, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.ee0
    public final void q5(int[] iArr) {
        Parcel parcelSh = sh();
        parcelSh.writeIntArray(null);
        g3(4, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.ee0
    public final void uN() {
        g3(3, sh());
    }
}
