package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<zaj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zaj createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        ConnectionResult connectionResult = null;
        ResolveAccountResponse resolveAccountResponse = null;
        int iP8 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 == 2) {
                connectionResult = (ConnectionResult) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, ConnectionResult.CREATOR);
            } else if (iA8 != 3) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, ResolveAccountResponse.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zaj(iP8, connectionResult, resolveAccountResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zaj[] newArray(int i) {
        return new zaj[i];
    }
}
