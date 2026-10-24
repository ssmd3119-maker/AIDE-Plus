package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class k2 extends ae0 implements j2 {
    public k2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static j2 Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof j2 ? (j2) iInterfaceQueryLocalInterface : new l2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                St(parcel.readString(), wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                abcd.wu wuVarIk = ik(parcel.readString());
                parcel2.writeNoException();
                be0.FH(parcel2, wuVarIk);
                return true;
            case 3:
                aX(wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                destroy();
                parcel2.writeNoException();
                return true;
            case 5:
                TG(wu.a.dx(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                Za(wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
