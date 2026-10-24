package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        String strQX2 = null;
        String strQX3 = null;
        String strQX4 = null;
        Uri uri = null;
        String strQX5 = null;
        String strQX6 = null;
        ArrayList arrayListMr = null;
        String strQX7 = null;
        String strQX8 = null;
        long jNw = 0;
        int iP8 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 2:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 3:
                    strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 4:
                    strQX3 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 5:
                    strQX4 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, Uri.CREATOR);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    strQX5 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 8:
                    jNw = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case 9:
                    strQX6 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 10:
                    arrayListMr = com.google.android.gms.common.internal.safeparcel.a.Mr(parcel, iBT, Scope.CREATOR);
                    break;
                case 11:
                    strQX7 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 12:
                    strQX8 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new GoogleSignInAccount(iP8, strQX, strQX2, strQX3, strQX4, uri, strQX5, jNw, strQX6, arrayListMr, strQX7, strQX8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
