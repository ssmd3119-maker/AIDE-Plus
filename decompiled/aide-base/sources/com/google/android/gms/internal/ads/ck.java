package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ck implements Parcelable.Creator<zzavh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzavh createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        zzwb zzwbVar = null;
        String strQX = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 2) {
                zzwbVar = (zzwb) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzwb.CREATOR);
            } else if (iA8 != 3) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzavh(zzwbVar, strQX);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzavh[] newArray(int i) {
        return new zzavh[i];
    }
}
