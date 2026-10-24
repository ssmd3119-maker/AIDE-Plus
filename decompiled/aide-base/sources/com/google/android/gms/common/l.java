package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<ConnectionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionResult createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        PendingIntent pendingIntent = null;
        String strQX = null;
        int iP8 = 0;
        int iP82 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 == 2) {
                iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, PendingIntent.CREATOR);
            } else if (iA8 != 4) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new ConnectionResult(iP8, iP82, pendingIntent, strQX);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionResult[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
