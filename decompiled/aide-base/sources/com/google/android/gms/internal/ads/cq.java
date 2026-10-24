package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class cq implements Parcelable.Creator<zzbbi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbbi createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        int iP8 = 0;
        int iP82 = 0;
        boolean zLg = false;
        boolean zLg2 = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 2) {
                strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
            } else if (iA8 == 3) {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 == 4) {
                iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 == 5) {
                zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
            } else if (iA8 != 6) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzbbi(strQX, iP8, iP82, zLg, zLg2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbbi[] newArray(int i) {
        return new zzbbi[i];
    }
}
