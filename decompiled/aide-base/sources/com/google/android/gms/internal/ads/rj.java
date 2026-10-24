package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class rj extends ae0 implements qj {
    public rj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static qj Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return iInterfaceQueryLocalInterface instanceof qj ? (qj) iInterfaceQueryLocalInterface : new sj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            YM((zzavh) be0.DW(parcel, zzavh.CREATOR));
            parcel2.writeNoException();
        } else if (i != 2) {
            wj yjVar = null;
            oj pjVar = null;
            if (i == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    yjVar = iInterfaceQueryLocalInterface instanceof wj ? (wj) iInterfaceQueryLocalInterface : new yj(strongBinder);
                }
                br(yjVar);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zKJ = kJ();
                        parcel2.writeNoException();
                        be0.j6(parcel2, zKJ);
                        break;
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        Mr();
                        parcel2.writeNoException();
                        break;
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        XL();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        destroy();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        C(wu.a.dx(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 10:
                        b(wu.a.dx(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 11:
                        e7(wu.a.dx(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strU7 = u7();
                        parcel2.writeNoException();
                        parcel2.writeString(strU7);
                        break;
                    case 13:
                        Xa(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 14:
                        ye(ax0.Mt(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleXX = XX();
                        parcel2.writeNoException();
                        be0.VH(parcel2, bundleXX);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            pjVar = iInterfaceQueryLocalInterface2 instanceof oj ? (oj) iInterfaceQueryLocalInterface2 : new pj(strongBinder2);
                        }
                        HV(pjVar);
                        parcel2.writeNoException();
                        break;
                    case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                        o4(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                        wV(wu.a.dx(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 19:
                        NF(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    default:
                        return false;
                }
            } else {
                sG(be0.v5(parcel));
                parcel2.writeNoException();
            }
        } else {
            Bz();
            parcel2.writeNoException();
        }
        return true;
    }
}
