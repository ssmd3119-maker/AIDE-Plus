package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hl implements Parcelable.Creator<zzawo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzawo createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        String strQX2 = null;
        ArrayList<String> arrayListAM = null;
        ArrayList<String> arrayListAM2 = null;
        boolean zLg = false;
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
                    strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 4:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 5:
                    zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    arrayListAM = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    zLg3 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 8:
                    zLg4 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 9:
                    arrayListAM2 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzawo(strQX, strQX2, zLg, zLg2, arrayListAM, zLg3, zLg4, arrayListAM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzawo[] newArray(int i) {
        return new zzawo[i];
    }
}
