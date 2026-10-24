package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<WebImage> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WebImage createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        int iP8 = 0;
        Uri uri = null;
        int iP82 = 0;
        int iP83 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 == 2) {
                uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, Uri.CREATOR);
            } else if (iA8 == 3) {
                iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 != 4) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                iP83 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new WebImage(iP8, uri, iP82, iP83);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WebImage[] newArray(int i) {
        return new WebImage[i];
    }
}
