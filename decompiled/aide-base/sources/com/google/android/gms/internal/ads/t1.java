package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class t1 implements Parcelable.Creator<zzacp> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzacp createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        zzzw zzzwVar = null;
        int iP8 = 0;
        boolean zLg = false;
        int iP82 = 0;
        boolean zLg2 = false;
        int iP83 = 0;
        boolean zLg3 = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 2:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 3:
                    iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 4:
                    zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 5:
                    iP83 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    zzzwVar = (zzzw) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzzw.CREATOR);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    zLg3 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzacp(iP8, zLg, iP82, zLg2, iP83, zzzwVar, zLg3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzacp[] newArray(int i) {
        return new zzacp[i];
    }
}
