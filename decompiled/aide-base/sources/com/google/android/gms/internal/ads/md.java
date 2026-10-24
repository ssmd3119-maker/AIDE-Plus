package com.google.android.gms.internal.ads;

import abcd.wu;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class md extends ae0 implements ld {
    public md() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static ld Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof ld ? (ld) iInterfaceQueryLocalInterface : new nd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                hw((Bundle) be0.DW(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Dv();
                parcel2.writeNoException();
                return true;
            case 3:
                b1();
                parcel2.writeNoException();
                return true;
            case 4:
                onResume();
                parcel2.writeNoException();
                return true;
            case 5:
                onPause();
                parcel2.writeNoException();
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                Bundle bundle = (Bundle) be0.DW(parcel, Bundle.CREATOR);
                PU(bundle);
                parcel2.writeNoException();
                be0.VH(parcel2, bundle);
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                Ae();
                parcel2.writeNoException();
                return true;
            case 8:
                onDestroy();
                parcel2.writeNoException();
                return true;
            case 9:
                fp();
                parcel2.writeNoException();
                return true;
            case 10:
                op();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zQG = qG();
                parcel2.writeNoException();
                be0.j6(parcel2, zQG);
                return true;
            case 12:
                cc(parcel.readInt(), parcel.readInt(), (Intent) be0.DW(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                Hn(wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
