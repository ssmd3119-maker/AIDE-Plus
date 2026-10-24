package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.probelytics.api.UserTouchAction;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c3 extends ae0 implements b3 {
    public c3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static b3 Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof b3 ? (b3) iInterfaceQueryLocalInterface : new d3(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                String strNH = NH(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strNH);
                return true;
            case 2:
                f2 f2VarNY = NY(parcel.readString());
                parcel2.writeNoException();
                be0.FH(parcel2, f2VarNY);
                return true;
            case 3:
                List<String> listN3 = n3();
                parcel2.writeNoException();
                parcel2.writeStringList(listN3);
                return true;
            case 4:
                String strVy = vy();
                parcel2.writeNoException();
                parcel2.writeString(strVy);
                return true;
            case 5:
                hr(parcel.readString());
                parcel2.writeNoException();
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                VH();
                parcel2.writeNoException();
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                yx0 videoController = getVideoController();
                parcel2.writeNoException();
                be0.FH(parcel2, videoController);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                abcd.wu wuVarIP = IP();
                parcel2.writeNoException();
                be0.FH(parcel2, wuVarIP);
                return true;
            case 10:
                boolean zMT = mT(wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                be0.j6(parcel2, zMT);
                return true;
            case 11:
                abcd.wu wuVarQX = QX();
                parcel2.writeNoException();
                be0.FH(parcel2, wuVarQX);
                return true;
            default:
                return false;
        }
    }
}
