package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        ArrayList arrayListMr = null;
        Account account = null;
        String strQX = null;
        String strQX2 = null;
        ArrayList arrayListMr2 = null;
        int iP8 = 0;
        boolean zLg = false;
        boolean zLg2 = false;
        boolean zLg3 = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 2:
                    arrayListMr = com.google.android.gms.common.internal.safeparcel.a.Mr(parcel, iBT, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, Account.CREATOR);
                    break;
                case 4:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 5:
                    zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    zLg3 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 8:
                    strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 9:
                    arrayListMr2 = com.google.android.gms.common.internal.safeparcel.a.Mr(parcel, iBT, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new GoogleSignInOptions(iP8, (ArrayList<Scope>) arrayListMr, account, zLg, zLg2, zLg3, strQX, strQX2, (ArrayList<GoogleSignInOptionsExtensionParcelable>) arrayListMr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
