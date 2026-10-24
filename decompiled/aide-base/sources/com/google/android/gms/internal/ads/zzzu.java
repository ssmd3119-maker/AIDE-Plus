package com.google.android.gms.internal.ads;

import android.os.Parcel;

@jg
/* loaded from: classes.dex */
public final class zzzu extends zzwf {
    public zzzu(zzwf zzwfVar) {
        super(zzwfVar.WB, zzwfVar.mb, zzwfVar.jw, zzwfVar.fY, zzwfVar.qp, zzwfVar.k2, zzwfVar.zh, zzwfVar.AL, zzwfVar.w9, zzwfVar.hK);
    }

    @Override // com.google.android.gms.internal.ads.zzwf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.WB, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 6, this.qp);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
