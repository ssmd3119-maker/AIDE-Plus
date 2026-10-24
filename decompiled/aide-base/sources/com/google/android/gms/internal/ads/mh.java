package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mh implements Parcelable.Creator<zzaso> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaso createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        boolean zLg = false;
        ArrayList<String> arrayListAM = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 2) {
                zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
            } else if (iA8 != 3) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                arrayListAM = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzaso(zLg, arrayListAM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaso[] newArray(int i) {
        return new zzaso[i];
    }
}
