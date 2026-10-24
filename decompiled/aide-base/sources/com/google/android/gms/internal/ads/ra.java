package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class ra extends ae0 implements qa {
    public ra() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static qa Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof qa ? (qa) iInterfaceQueryLocalInterface : new sa(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        ta vaVar;
        switch (i) {
            case 1:
                EQ();
                break;
            case 2:
                fN();
                break;
            case 3:
                Gj(parcel.readInt());
                break;
            case 4:
                mb();
                break;
            case 5:
                ko();
                break;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                k2();
                break;
            case UserTouchAction.CLICK_KIND /* 7 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    vaVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    vaVar = iInterfaceQueryLocalInterface instanceof ta ? (ta) iInterfaceQueryLocalInterface : new va(strongBinder);
                }
                l3(vaVar);
                break;
            case 8:
                hK();
                break;
            case 9:
                U2(parcel.readString(), parcel.readString());
                break;
            case 10:
                lp(c3.Mt(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                w9();
                break;
            case 12:
                Rf(parcel.readString());
                break;
            case 13:
                PT();
                break;
            case 14:
                MP((zzawd) be0.DW(parcel, zzawd.CREATOR));
                break;
            case 15:
                yO();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
