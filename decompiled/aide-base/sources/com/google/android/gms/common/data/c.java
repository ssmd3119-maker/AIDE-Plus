package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String[] strArrXL = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleZo = null;
        int iP8 = 0;
        int iP82 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                strArrXL = com.google.android.gms.common.internal.safeparcel.a.XL(parcel, iBT);
            } else if (iA8 == 2) {
                cursorWindowArr = (CursorWindow[]) com.google.android.gms.common.internal.safeparcel.a.j3(parcel, iBT, CursorWindow.CREATOR);
            } else if (iA8 == 3) {
                iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            } else if (iA8 == 4) {
                bundleZo = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
            } else if (iA8 != 1000) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        DataHolder dataHolder = new DataHolder(iP8, strArrXL, cursorWindowArr, iP82, bundleZo);
        dataHolder.Ws();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i) {
        return new DataHolder[i];
    }
}
