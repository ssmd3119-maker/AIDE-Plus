package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n4 implements Parcelable.Creator<zzafl> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafl createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        String[] strArrXL = null;
        String[] strArrXL2 = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
            } else if (iA8 == 2) {
                strArrXL = com.google.android.gms.common.internal.safeparcel.a.XL(parcel, iBT);
            } else if (iA8 != 3) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                strArrXL2 = com.google.android.gms.common.internal.safeparcel.a.XL(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzafl(strQX, strArrXL, strArrXL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafl[] newArray(int i) {
        return new zzafl[i];
    }
}
