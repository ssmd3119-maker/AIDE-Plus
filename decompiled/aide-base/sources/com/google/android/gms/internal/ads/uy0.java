package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class uy0 implements Parcelable.Creator<zzzw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzzw createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        boolean zLg = false;
        boolean zLg2 = false;
        boolean zLg3 = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 2) {
                zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
            } else if (iA8 == 3) {
                zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
            } else if (iA8 != 4) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                zLg3 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzzw(zLg, zLg2, zLg3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzzw[] newArray(int i) {
        return new zzzw[i];
    }
}
