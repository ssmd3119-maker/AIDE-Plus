package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class xj extends ae0 implements wj {
    public xj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public static wj Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof wj ? (wj) iInterfaceQueryLocalInterface : new yj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        lj njVar;
        switch (i) {
            case 1:
                AE();
                break;
            case 2:
                ca();
                break;
            case 3:
                P8();
                break;
            case 4:
                Mz();
                break;
            case 5:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    njVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    njVar = iInterfaceQueryLocalInterface instanceof lj ? (lj) iInterfaceQueryLocalInterface : new nj(strongBinder);
                }
                zG(njVar);
                break;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                SI();
                break;
            case UserTouchAction.CLICK_KIND /* 7 */:
                wc(parcel.readInt());
                break;
            case 8:
                ei();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
