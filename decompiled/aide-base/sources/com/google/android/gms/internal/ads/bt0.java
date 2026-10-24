package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class bt0 implements Parcelable.Creator<zzty> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzty createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        long jNw = 0;
        long jNw2 = 0;
        String strQX = null;
        String strQX2 = null;
        String strQX3 = null;
        String strQX4 = null;
        Bundle bundleZo = null;
        boolean zLg = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 2:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 3:
                    jNw = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case 4:
                    strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 5:
                    strQX3 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    strQX4 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    bundleZo = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case 8:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 9:
                    jNw2 = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzty(strQX, jNw, strQX2, strQX3, strQX4, bundleZo, zLg, jNw2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzty[] newArray(int i) {
        return new zzty[i];
    }
}
