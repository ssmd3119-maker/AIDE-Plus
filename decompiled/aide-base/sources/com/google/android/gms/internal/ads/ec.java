package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class ec extends ae0 implements dc {
    public ec() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static dc Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof dc ? (dc) iInterfaceQueryLocalInterface : new fc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        gc hcVar = null;
        zb acVar = null;
        bc ccVar = null;
        xb ybVar = null;
        ub vbVar = null;
        switch (i) {
            case 1:
                abcd.wu wuVarDx = wu.a.dx(parcel.readStrongBinder());
                String string = parcel.readString();
                Bundle bundle = (Bundle) be0.DW(parcel, Bundle.CREATOR);
                Bundle bundle2 = (Bundle) be0.DW(parcel, Bundle.CREATOR);
                zzwf zzwfVar = (zzwf) be0.DW(parcel, zzwf.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                    hcVar = iInterfaceQueryLocalInterface instanceof gc ? (gc) iInterfaceQueryLocalInterface : new hc(strongBinder);
                }
                pl(wuVarDx, string, bundle, bundle2, zzwfVar, hcVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzans zzansVarQO = QO();
                parcel2.writeNoException();
                be0.VH(parcel2, zzansVarQO);
                return true;
            case 3:
                zzans zzansVarZU = ZU();
                parcel2.writeNoException();
                be0.VH(parcel2, zzansVarZU);
                return true;
            case 4:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Bundle bundle3 = (Bundle) be0.DW(parcel, Bundle.CREATOR);
                abcd.wu wuVarDx2 = wu.a.dx(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    vbVar = iInterfaceQueryLocalInterface2 instanceof ub ? (ub) iInterfaceQueryLocalInterface2 : new vb(strongBinder2);
                }
                sN(string2, string3, bundle3, wuVarDx2, vbVar, ra.Mt(parcel.readStrongBinder()), (zzwf) be0.DW(parcel, zzwf.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                yx0 videoController = getVideoController();
                parcel2.writeNoException();
                be0.FH(parcel2, videoController);
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                Bundle bundle4 = (Bundle) be0.DW(parcel, Bundle.CREATOR);
                abcd.wu wuVarDx3 = wu.a.dx(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    ybVar = iInterfaceQueryLocalInterface3 instanceof xb ? (xb) iInterfaceQueryLocalInterface3 : new yb(strongBinder3);
                }
                qh(string4, string5, bundle4, wuVarDx3, ybVar, ra.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 8:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                Bundle bundle5 = (Bundle) be0.DW(parcel, Bundle.CREATOR);
                abcd.wu wuVarDx4 = wu.a.dx(parcel.readStrongBinder());
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    ccVar = iInterfaceQueryLocalInterface4 instanceof bc ? (bc) iInterfaceQueryLocalInterface4 : new cc(strongBinder4);
                }
                hl(string6, string7, bundle5, wuVarDx4, ccVar, ra.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                tS();
                parcel2.writeNoException();
                return true;
            case 10:
                fD(wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                iU(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 12:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Bundle bundle6 = (Bundle) be0.DW(parcel, Bundle.CREATOR);
                abcd.wu wuVarDx5 = wu.a.dx(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    acVar = iInterfaceQueryLocalInterface5 instanceof zb ? (zb) iInterfaceQueryLocalInterface5 : new ac(strongBinder5);
                }
                i9(string8, string9, bundle6, wuVarDx5, acVar, ra.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
