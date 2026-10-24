package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class sv0 implements Parcelable.Creator<zzwf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzwf createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        zzwf[] zzwfVarArr = null;
        int iP8 = 0;
        int iP82 = 0;
        boolean zLg = false;
        int iP83 = 0;
        int iP84 = 0;
        boolean zLg2 = false;
        boolean zLg3 = false;
        boolean zLg4 = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 2:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 3:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 4:
                    iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 5:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    iP83 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    iP84 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 8:
                    zzwfVarArr = (zzwf[]) com.google.android.gms.common.internal.safeparcel.a.j3(parcel, iBT, zzwf.CREATOR);
                    break;
                case 9:
                    zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 10:
                    zLg3 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 11:
                    zLg4 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzwf(strQX, iP8, iP82, zLg, iP83, iP84, zzwfVarArr, zLg2, zLg3, zLg4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzwf[] newArray(int i) {
        return new zzwf[i];
    }
}
