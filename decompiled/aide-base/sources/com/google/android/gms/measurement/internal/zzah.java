package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;

/* loaded from: classes.dex */
public final class zzah implements Parcelable.Creator<zzag> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzag createFromParcel(Parcel parcel) {
        int iCn = a.cn(parcel);
        String strQX = null;
        zzad zzadVar = null;
        String strQX2 = null;
        long jNw = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = a.BT(parcel);
            int iA8 = a.a8(iBT);
            if (iA8 == 2) {
                strQX = a.QX(parcel, iBT);
            } else if (iA8 == 3) {
                zzadVar = (zzad) a.Ws(parcel, iBT, zzad.CREATOR);
            } else if (iA8 == 4) {
                strQX2 = a.QX(parcel, iBT);
            } else if (iA8 != 5) {
                a.ro(parcel, iBT);
            } else {
                jNw = a.nw(parcel, iBT);
            }
        }
        a.U2(parcel, iCn);
        return new zzag(strQX, zzadVar, strQX2, jNw);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzag[] newArray(int i) {
        return new zzag[i];
    }
}
