package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator<AuthAccountRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        IBinder iBinderVy = null;
        Scope[] scopeArr = null;
        Integer numEi = null;
        Integer numEi2 = null;
        Account account = null;
        int iP8 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 2:
                    iBinderVy = com.google.android.gms.common.internal.safeparcel.a.vy(parcel, iBT);
                    break;
                case 3:
                    scopeArr = (Scope[]) com.google.android.gms.common.internal.safeparcel.a.j3(parcel, iBT, Scope.CREATOR);
                    break;
                case 4:
                    numEi = com.google.android.gms.common.internal.safeparcel.a.ei(parcel, iBT);
                    break;
                case 5:
                    numEi2 = com.google.android.gms.common.internal.safeparcel.a.ei(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    account = (Account) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, Account.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new AuthAccountRequest(iP8, iBinderVy, scopeArr, numEi, numEi2, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest[] newArray(int i) {
        return new AuthAccountRequest[i];
    }
}
