package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator<zzaq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaq createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        boolean zLg = false;
        boolean zLg2 = false;
        boolean zLg3 = false;
        float fYS = 0.0f;
        int iP8 = 0;
        boolean zLg4 = false;
        boolean zLg5 = false;
        boolean zLg6 = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 2:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 3:
                    zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 4:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 5:
                    zLg3 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    fYS = com.google.android.gms.common.internal.safeparcel.a.yS(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 8:
                    zLg4 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 9:
                    zLg5 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 10:
                    zLg6 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzaq(zLg, zLg2, strQX, zLg3, fYS, iP8, zLg4, zLg5, zLg6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaq[] newArray(int i) {
        return new zzaq[i];
    }
}
