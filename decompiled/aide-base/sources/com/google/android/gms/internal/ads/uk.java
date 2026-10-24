package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class uk extends ae0 implements sk {
    public uk() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static sk Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof sk ? (sk) iInterfaceQueryLocalInterface : new vk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                qY(wu.a.dx(parcel.readStrongBinder()));
                break;
            case 2:
                N0(wu.a.dx(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                kM(wu.a.dx(parcel.readStrongBinder()));
                break;
            case 4:
                Rd(wu.a.dx(parcel.readStrongBinder()));
                break;
            case 5:
                N2(wu.a.dx(parcel.readStrongBinder()));
                break;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                u9(wu.a.dx(parcel.readStrongBinder()));
                break;
            case UserTouchAction.CLICK_KIND /* 7 */:
                QM(wu.a.dx(parcel.readStrongBinder()), (zzawd) be0.DW(parcel, zzawd.CREATOR));
                break;
            case 8:
                l2(wu.a.dx(parcel.readStrongBinder()));
                break;
            case 9:
                K3(wu.a.dx(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                Qk(wu.a.dx(parcel.readStrongBinder()));
                break;
            case 11:
                Tc(wu.a.dx(parcel.readStrongBinder()));
                break;
            case 12:
                ef((Bundle) be0.DW(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
