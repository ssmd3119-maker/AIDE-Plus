package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<zah> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zah createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        int iP8 = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 != 2) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, ResolveAccountRequest.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zah(iP8, resolveAccountRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zah[] newArray(int i) {
        return new zah[i];
    }
}
