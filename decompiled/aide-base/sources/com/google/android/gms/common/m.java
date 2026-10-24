package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<Feature> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Feature createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        int iP8 = 0;
        long jNw = -1;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
            } else if (iA8 == 2) {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 != 3) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                jNw = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new Feature(strQX, iP8, jNw);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Feature[] newArray(int i) {
        return new Feature[i];
    }
}
