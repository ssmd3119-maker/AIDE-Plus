package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b4 extends ae0 implements a4 {
    public b4() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        y3 z3Var;
        switch (i) {
            case 2:
                String strFH = FH();
                parcel2.writeNoException();
                parcel2.writeString(strFH);
                return true;
            case 3:
                List listDW = DW();
                parcel2.writeNoException();
                parcel2.writeList(listDW);
                return true;
            case 4:
                String strGn = gn();
                parcel2.writeNoException();
                parcel2.writeString(strGn);
                return true;
            case 5:
                f2 f2VarJ3 = j3();
                parcel2.writeNoException();
                be0.FH(parcel2, f2VarJ3);
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                String strZo = Zo();
                parcel2.writeNoException();
                parcel2.writeString(strZo);
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                String strEr = er();
                parcel2.writeNoException();
                parcel2.writeString(strEr);
                return true;
            case 8:
                double dA8 = a8();
                parcel2.writeNoException();
                parcel2.writeDouble(dA8);
                return true;
            case 9:
                String strYS = yS();
                parcel2.writeNoException();
                parcel2.writeString(strYS);
                return true;
            case 10:
                String strAM = aM();
                parcel2.writeNoException();
                parcel2.writeString(strAM);
                return true;
            case 11:
                yx0 videoController = getVideoController();
                parcel2.writeNoException();
                be0.FH(parcel2, videoController);
                return true;
            case 12:
                String strU7 = u7();
                parcel2.writeNoException();
                parcel2.writeString(strU7);
                return true;
            case 13:
                destroy();
                parcel2.writeNoException();
                return true;
            case 14:
                a2 a2VarHw = Hw();
                parcel2.writeNoException();
                be0.FH(parcel2, a2VarHw);
                return true;
            case 15:
                Ws((Bundle) be0.DW(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                boolean zLg = lg((Bundle) be0.DW(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                be0.j6(parcel2, zLg);
                return true;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                rN((Bundle) be0.DW(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                abcd.wu wuVarQX = QX();
                parcel2.writeNoException();
                be0.FH(parcel2, wuVarQX);
                return true;
            case 19:
                abcd.wu wuVarV5 = v5();
                parcel2.writeNoException();
                be0.FH(parcel2, wuVarV5);
                return true;
            case ProxyTextView.INPUTTYPE_date /* 20 */:
                Bundle bundleTp = tp();
                parcel2.writeNoException();
                be0.VH(parcel2, bundleTp);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    z3Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    z3Var = iInterfaceQueryLocalInterface instanceof y3 ? (y3) iInterfaceQueryLocalInterface : new z3(strongBinder);
                }
                sE(z3Var);
                parcel2.writeNoException();
                return true;
            case 22:
                XG();
                parcel2.writeNoException();
                return true;
            case 23:
                List listKD = kD();
                parcel2.writeNoException();
                parcel2.writeList(listKD);
                return true;
            case 24:
                boolean zFr = fr();
                parcel2.writeNoException();
                be0.j6(parcel2, zFr);
                return true;
            case 25:
                DV(vx0.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                Yt(sx0.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                Q6();
                parcel2.writeNoException();
                return true;
            case 28:
                Pa();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
