package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v implements Parcelable.Creator<zzk> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzk createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        IBinder iBinderVy = null;
        boolean zLg = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
            } else if (iA8 == 2) {
                iBinderVy = com.google.android.gms.common.internal.safeparcel.a.vy(parcel, iBT);
            } else if (iA8 != 3) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzk(strQX, iBinderVy, zLg);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzk[] newArray(int i) {
        return new zzk[i];
    }
}
