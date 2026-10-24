package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.internal.ads.zzbbi;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        zzc zzcVar = null;
        IBinder iBinderVy = null;
        IBinder iBinderVy2 = null;
        IBinder iBinderVy3 = null;
        IBinder iBinderVy4 = null;
        String strQX = null;
        String strQX2 = null;
        IBinder iBinderVy5 = null;
        String strQX3 = null;
        zzbbi zzbbiVar = null;
        String strQX4 = null;
        zzaq zzaqVar = null;
        IBinder iBinderVy6 = null;
        boolean zLg = false;
        int iP8 = 0;
        int iP82 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 2:
                    zzcVar = (zzc) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzc.CREATOR);
                    break;
                case 3:
                    iBinderVy = com.google.android.gms.common.internal.safeparcel.a.vy(parcel, iBT);
                    break;
                case 4:
                    iBinderVy2 = com.google.android.gms.common.internal.safeparcel.a.vy(parcel, iBT);
                    break;
                case 5:
                    iBinderVy3 = com.google.android.gms.common.internal.safeparcel.a.vy(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    iBinderVy4 = com.google.android.gms.common.internal.safeparcel.a.vy(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 8:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 9:
                    strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 10:
                    iBinderVy5 = com.google.android.gms.common.internal.safeparcel.a.vy(parcel, iBT);
                    break;
                case 11:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 12:
                    iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 13:
                    strQX3 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 14:
                    zzbbiVar = (zzbbi) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzbbi.CREATOR);
                    break;
                case 15:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
                case 16:
                    strQX4 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    zzaqVar = (zzaq) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzaq.CREATOR);
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    iBinderVy6 = com.google.android.gms.common.internal.safeparcel.a.vy(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new AdOverlayInfoParcel(zzcVar, iBinderVy, iBinderVy2, iBinderVy3, iBinderVy4, strQX, zLg, strQX2, iBinderVy5, iP8, iP82, strQX3, zzbbiVar, strQX4, zzaqVar, iBinderVy6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
