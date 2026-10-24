package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ii implements Parcelable.Creator<zzatm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzatm createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            if (com.google.android.gms.common.internal.safeparcel.a.a8(iBT) != 2) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzatm(strQX);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzatm[] newArray(int i) {
        return new zzatm[i];
    }
}
