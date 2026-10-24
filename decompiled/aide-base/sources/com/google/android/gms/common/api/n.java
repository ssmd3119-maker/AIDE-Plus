package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        PendingIntent pendingIntent = null;
        int iP8 = 0;
        int iP82 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 == 2) {
                strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
            } else if (iA8 == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, PendingIntent.CREATOR);
            } else if (iA8 != 1000) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new Status(iP8, iP82, strQX, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
