package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class zzp implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo createFromParcel(Parcel parcel) {
        int iCn = a.cn(parcel);
        long jNw = 0;
        long jNw2 = 0;
        long jNw3 = 0;
        String strQX = null;
        String strQX2 = null;
        zzfv zzfvVar = null;
        String strQX3 = null;
        zzag zzagVar = null;
        zzag zzagVar2 = null;
        zzag zzagVar3 = null;
        boolean zLg = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = a.BT(parcel);
            switch (a.a8(iBT)) {
                case 2:
                    strQX = a.QX(parcel, iBT);
                    break;
                case 3:
                    strQX2 = a.QX(parcel, iBT);
                    break;
                case 4:
                    zzfvVar = (zzfv) a.Ws(parcel, iBT, zzfv.CREATOR);
                    break;
                case 5:
                    jNw = a.nw(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    zLg = a.lg(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    strQX3 = a.QX(parcel, iBT);
                    break;
                case 8:
                    zzagVar = (zzag) a.Ws(parcel, iBT, zzag.CREATOR);
                    break;
                case 9:
                    jNw2 = a.nw(parcel, iBT);
                    break;
                case 10:
                    zzagVar2 = (zzag) a.Ws(parcel, iBT, zzag.CREATOR);
                    break;
                case 11:
                    jNw3 = a.nw(parcel, iBT);
                    break;
                case 12:
                    zzagVar3 = (zzag) a.Ws(parcel, iBT, zzag.CREATOR);
                    break;
                default:
                    a.ro(parcel, iBT);
                    break;
            }
        }
        a.U2(parcel, iCn);
        return new zzo(strQX, strQX2, zzfvVar, jNw, zLg, strQX3, zzagVar, jNw2, zzagVar2, jNw3, zzagVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i) {
        return new zzo[i];
    }
}
