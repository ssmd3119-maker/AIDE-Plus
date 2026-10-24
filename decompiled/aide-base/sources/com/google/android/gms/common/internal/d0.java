package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator<GetServiceRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        String strQX = null;
        IBinder iBinderVy = null;
        Scope[] scopeArr = null;
        Bundle bundleZo = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        int iP8 = 0;
        int iP82 = 0;
        int iP83 = 0;
        boolean zLg = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 2:
                    iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 3:
                    iP83 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 4:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 5:
                    iBinderVy = com.google.android.gms.common.internal.safeparcel.a.vy(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    scopeArr = (Scope[]) com.google.android.gms.common.internal.safeparcel.a.j3(parcel, iBT, Scope.CREATOR);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    bundleZo = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case 8:
                    account = (Account) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, Account.CREATOR);
                    break;
                case 9:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
                case 10:
                    featureArr = (Feature[]) com.google.android.gms.common.internal.safeparcel.a.j3(parcel, iBT, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) com.google.android.gms.common.internal.safeparcel.a.j3(parcel, iBT, Feature.CREATOR);
                    break;
                case 12:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new GetServiceRequest(iP8, iP82, iP83, strQX, iBinderVy, scopeArr, bundleZo, account, featureArr, featureArr2, zLg);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
