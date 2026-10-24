package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class zzfw implements Parcelable.Creator<zzfv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzfv createFromParcel(Parcel parcel) {
        int iCn = a.cn(parcel);
        String strQX = null;
        Long lSI = null;
        Float fGW = null;
        String strQX2 = null;
        String strQX3 = null;
        Double dEr = null;
        long jNw = 0;
        int iP8 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = a.BT(parcel);
            switch (a.a8(iBT)) {
                case 1:
                    iP8 = a.P8(parcel, iBT);
                    break;
                case 2:
                    strQX = a.QX(parcel, iBT);
                    break;
                case 3:
                    jNw = a.nw(parcel, iBT);
                    break;
                case 4:
                    lSI = a.SI(parcel, iBT);
                    break;
                case 5:
                    fGW = a.gW(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    strQX2 = a.QX(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    strQX3 = a.QX(parcel, iBT);
                    break;
                case 8:
                    dEr = a.er(parcel, iBT);
                    break;
                default:
                    a.ro(parcel, iBT);
                    break;
            }
        }
        a.U2(parcel, iCn);
        return new zzfv(iP8, strQX, jNw, lSI, fGW, strQX2, strQX3, dEr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzfv[] newArray(int i) {
        return new zzfv[i];
    }
}
