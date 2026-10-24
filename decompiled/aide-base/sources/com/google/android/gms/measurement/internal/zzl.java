package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.common.internal.safeparcel.a;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class zzl implements Parcelable.Creator<zzk> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzk createFromParcel(Parcel parcel) {
        int iCn = a.cn(parcel);
        long jNw = 0;
        long jNw2 = 0;
        long jNw3 = 0;
        long jNw4 = 0;
        String strQX = null;
        String strQX2 = null;
        String strQX3 = null;
        String strQX4 = null;
        String strQX5 = null;
        String strQX6 = null;
        String strQX7 = null;
        long jNw5 = -2147483648L;
        boolean zLg = true;
        boolean zLg2 = false;
        int iP8 = 0;
        boolean zLg3 = true;
        boolean zLg4 = true;
        boolean zLg5 = false;
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
                    strQX3 = a.QX(parcel, iBT);
                    break;
                case 5:
                    strQX4 = a.QX(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    jNw = a.nw(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    jNw2 = a.nw(parcel, iBT);
                    break;
                case 8:
                    strQX5 = a.QX(parcel, iBT);
                    break;
                case 9:
                    zLg = a.lg(parcel, iBT);
                    break;
                case 10:
                    zLg2 = a.lg(parcel, iBT);
                    break;
                case 11:
                    jNw5 = a.nw(parcel, iBT);
                    break;
                case 12:
                    strQX6 = a.QX(parcel, iBT);
                    break;
                case 13:
                    jNw3 = a.nw(parcel, iBT);
                    break;
                case 14:
                    jNw4 = a.nw(parcel, iBT);
                    break;
                case 15:
                    iP8 = a.P8(parcel, iBT);
                    break;
                case 16:
                    zLg3 = a.lg(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    zLg4 = a.lg(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    zLg5 = a.lg(parcel, iBT);
                    break;
                case 19:
                    strQX7 = a.QX(parcel, iBT);
                    break;
                default:
                    a.ro(parcel, iBT);
                    break;
            }
        }
        a.U2(parcel, iCn);
        return new zzk(strQX, strQX2, strQX3, strQX4, jNw, jNw2, strQX5, zLg, zLg2, jNw5, strQX6, jNw3, jNw4, iP8, zLg3, zLg4, zLg5, strQX7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzk[] newArray(int i) {
        return new zzk[i];
    }
}
