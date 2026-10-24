package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<WakeLockEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        long jNw = 0;
        long jNw2 = 0;
        long jNw3 = 0;
        String strQX = null;
        ArrayList<String> arrayListAM = null;
        String strQX2 = null;
        String strQX3 = null;
        String strQX4 = null;
        String strQX5 = null;
        int iP8 = 0;
        int iP82 = 0;
        int iP83 = 0;
        int iP84 = 0;
        float fYS = 0.0f;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 2:
                    jNw = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case 3:
                case UserTouchAction.CLICK_KIND /* 7 */:
                case 9:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
                case 4:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 5:
                    iP83 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    arrayListAM = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 8:
                    jNw2 = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case 10:
                    strQX3 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 11:
                    iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 12:
                    strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 13:
                    strQX4 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 14:
                    iP84 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 15:
                    fYS = com.google.android.gms.common.internal.safeparcel.a.yS(parcel, iBT);
                    break;
                case 16:
                    jNw3 = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    strQX5 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new WakeLockEvent(iP8, jNw, iP82, strQX, iP83, arrayListAM, strQX2, jNw2, iP84, strQX3, strQX4, fYS, jNw3, strQX5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
