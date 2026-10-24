package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zs0 implements Parcelable.Creator<zztv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zztv createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            if (com.google.android.gms.common.internal.safeparcel.a.a8(iBT) != 2) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, ParcelFileDescriptor.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zztv(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zztv[] newArray(int i) {
        return new zztv[i];
    }
}
