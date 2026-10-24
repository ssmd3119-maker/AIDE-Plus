package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ey0 implements Parcelable.Creator<zzyv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzyv createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        int iP8 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            if (com.google.android.gms.common.internal.safeparcel.a.a8(iBT) != 2) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzyv(iP8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzyv[] newArray(int i) {
        return new zzyv[i];
    }
}
