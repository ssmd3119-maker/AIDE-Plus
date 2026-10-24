package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Bundle;
import android.os.Parcel;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.List;

/* loaded from: classes.dex */
public abstract class db extends ae0 implements cb {
    public db() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
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
                a2 a2VarHw = Hw();
                parcel2.writeNoException();
                be0.FH(parcel2, a2VarHw);
                return true;
            case 13:
                abcd.wu wuVarCb = cb();
                parcel2.writeNoException();
                be0.FH(parcel2, wuVarCb);
                return true;
            case 14:
                abcd.wu wuVarRo = ro();
                parcel2.writeNoException();
                be0.FH(parcel2, wuVarRo);
                return true;
            case 15:
                abcd.wu wuVarV5 = v5();
                parcel2.writeNoException();
                be0.FH(parcel2, wuVarV5);
                return true;
            case 16:
                Bundle bundleTp = tp();
                parcel2.writeNoException();
                be0.VH(parcel2, bundleTp);
                return true;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                boolean zCn = cn();
                parcel2.writeNoException();
                be0.j6(parcel2, zCn);
                return true;
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                boolean zQq = Qq();
                parcel2.writeNoException();
                be0.j6(parcel2, zQq);
                return true;
            case 19:
                VH();
                parcel2.writeNoException();
                return true;
            case ProxyTextView.INPUTTYPE_date /* 20 */:
                Sf(wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                I(wu.a.dx(parcel.readStrongBinder()), wu.a.dx(parcel.readStrongBinder()), wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                x9(wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
