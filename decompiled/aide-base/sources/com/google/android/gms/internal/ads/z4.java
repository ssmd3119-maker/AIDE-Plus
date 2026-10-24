package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z4 implements Parcelable.Creator<zzafz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafz createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        int iP8 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            if (com.google.android.gms.common.internal.safeparcel.a.a8(iBT) != 1) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzafz(iP8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafz[] newArray(int i) {
        return new zzafz[i];
    }
}
