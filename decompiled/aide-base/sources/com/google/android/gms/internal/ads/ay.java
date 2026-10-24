package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ay implements Parcelable.Creator<zzbji> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbji createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        int iP8 = 0;
        byte[] bArrVH = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 != 2) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                bArrVH = com.google.android.gms.common.internal.safeparcel.a.VH(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzbji(iP8, bArrVH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbji[] newArray(int i) {
        return new zzbji[i];
    }
}
