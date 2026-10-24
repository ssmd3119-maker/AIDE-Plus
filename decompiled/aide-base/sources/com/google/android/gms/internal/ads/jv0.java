package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class jv0 implements Parcelable.Creator<zzvv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvv createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        String strQX2 = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
            } else if (iA8 != 2) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzvv(strQX, strQX2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvv[] newArray(int i) {
        return new zzvv[i];
    }
}
