package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<StringToIntConverter> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StringToIntConverter createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        int iP8 = 0;
        ArrayList arrayListMr = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 != 2) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                arrayListMr = com.google.android.gms.common.internal.safeparcel.a.Mr(parcel, iBT, StringToIntConverter.zaa.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new StringToIntConverter(iP8, arrayListMr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StringToIntConverter[] newArray(int i) {
        return new StringToIntConverter[i];
    }
}
