package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Parcel;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class nx0 extends ae0 implements mx0 {
    public nx0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a5();
                parcel2.writeNoException();
                return true;
            case 2:
                KC(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                CA(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                jH(be0.v5(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                PH(wu.a.dx(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                AV(parcel.readString(), wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                float fF0 = F0();
                parcel2.writeNoException();
                parcel2.writeFloat(fF0);
                return true;
            case 8:
                boolean zUF = uF();
                parcel2.writeNoException();
                be0.j6(parcel2, zUF);
                return true;
            case 9:
                String strCp = Cp();
                parcel2.writeNoException();
                parcel2.writeString(strCp);
                return true;
            case 10:
                ep(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                gk(la.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
