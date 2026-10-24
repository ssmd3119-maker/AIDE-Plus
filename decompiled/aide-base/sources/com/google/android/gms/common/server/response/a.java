package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<FastJsonResponse.Field> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        String strQX2 = null;
        zaa zaaVar = null;
        int iP8 = 0;
        int iP82 = 0;
        boolean zLg = false;
        int iP83 = 0;
        boolean zLg2 = false;
        int iP84 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 2:
                    iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 3:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 4:
                    iP83 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 5:
                    zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    iP84 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 8:
                    strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 9:
                    zaaVar = (zaa) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zaa.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new FastJsonResponse.Field(iP8, iP82, zLg, iP83, zLg2, strQX, iP84, strQX2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
