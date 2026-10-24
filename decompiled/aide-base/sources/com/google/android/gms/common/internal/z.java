package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class z implements Parcelable.Creator<ResolveAccountResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        IBinder iBinderVy = null;
        ConnectionResult connectionResult = null;
        int iP8 = 0;
        boolean zLg = false;
        boolean zLg2 = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 == 2) {
                iBinderVy = com.google.android.gms.common.internal.safeparcel.a.vy(parcel, iBT);
            } else if (iA8 == 3) {
                connectionResult = (ConnectionResult) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, ConnectionResult.CREATOR);
            } else if (iA8 == 4) {
                zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
            } else if (iA8 != 5) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new ResolveAccountResponse(iP8, iBinderVy, connectionResult, zLg, zLg2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }
}
