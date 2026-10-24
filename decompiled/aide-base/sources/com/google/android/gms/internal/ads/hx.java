package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Bundle;
import android.os.Parcel;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class hx extends ae0 implements gx {
    public hx() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                iK((Bundle) be0.DW(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundleNa = Na((Bundle) be0.DW(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                be0.VH(parcel2, bundleNa);
                return true;
            case 3:
                lG(parcel.readString(), parcel.readString(), (Bundle) be0.DW(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                IJ(parcel.readString(), parcel.readString(), wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map mapEX = eX(parcel.readString(), parcel.readString(), be0.v5(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(mapEX);
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                int iJj = jj(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iJj);
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                LB((Bundle) be0.DW(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                sg(parcel.readString(), parcel.readString(), (Bundle) be0.DW(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List listTh = th(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(listTh);
                return true;
            case 10:
                String strSx = Sx();
                parcel2.writeNoException();
                parcel2.writeString(strSx);
                return true;
            case 11:
                String strJY = jY();
                parcel2.writeNoException();
                parcel2.writeString(strJY);
                return true;
            case 12:
                long jXF = XF();
                parcel2.writeNoException();
                parcel2.writeLong(jXF);
                return true;
            case 13:
                nK(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                Ph(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                hg(wu.a.dx(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String strSR = sR();
                parcel2.writeNoException();
                parcel2.writeString(strSR);
                return true;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                String strPy = Py();
                parcel2.writeNoException();
                parcel2.writeString(strPy);
                return true;
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                String strJa = ja();
                parcel2.writeNoException();
                parcel2.writeString(strJa);
                return true;
            default:
                return false;
        }
    }
}
