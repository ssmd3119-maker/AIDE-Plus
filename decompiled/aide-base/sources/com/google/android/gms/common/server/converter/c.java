package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<StringToIntConverter.zaa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StringToIntConverter.zaa createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        int iP8 = 0;
        String strQX = null;
        int iP82 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 == 2) {
                strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
            } else if (iA8 != 3) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new StringToIntConverter.zaa(iP8, strQX, iP82);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StringToIntConverter.zaa[] newArray(int i) {
        return new StringToIntConverter.zaa[i];
    }
}
