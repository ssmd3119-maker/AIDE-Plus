package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class o4 implements Parcelable.Creator<zzafn> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafn createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        byte[] bArrVH = null;
        String[] strArrXL = null;
        String[] strArrXL2 = null;
        long jNw = 0;
        boolean zLg = false;
        int iP8 = 0;
        boolean zLg2 = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 2:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 3:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 4:
                    bArrVH = com.google.android.gms.common.internal.safeparcel.a.VH(parcel, iBT);
                    break;
                case 5:
                    strArrXL = com.google.android.gms.common.internal.safeparcel.a.XL(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    strArrXL2 = com.google.android.gms.common.internal.safeparcel.a.XL(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 8:
                    jNw = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzafn(zLg, strQX, iP8, bArrVH, strArrXL, strArrXL2, zLg2, jNw);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafn[] newArray(int i) {
        return new zzafn[i];
    }
}
