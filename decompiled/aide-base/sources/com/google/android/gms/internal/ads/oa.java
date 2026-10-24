package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class oa extends ae0 implements na {
    public oa() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qa saVar = null;
        switch (i) {
            case 1:
                abcd.wu wuVarDx = wu.a.dx(parcel.readStrongBinder());
                zzwf zzwfVar = (zzwf) be0.DW(parcel, zzwf.CREATOR);
                zzwb zzwbVar = (zzwb) be0.DW(parcel, zzwb.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    saVar = iInterfaceQueryLocalInterface instanceof qa ? (qa) iInterfaceQueryLocalInterface : new sa(strongBinder);
                }
                ix(wuVarDx, zzwfVar, zzwbVar, string, saVar);
                parcel2.writeNoException();
                return true;
            case 2:
                abcd.wu wuVarAn = An();
                parcel2.writeNoException();
                be0.FH(parcel2, wuVarAn);
                return true;
            case 3:
                abcd.wu wuVarDx2 = wu.a.dx(parcel.readStrongBinder());
                zzwb zzwbVar2 = (zzwb) be0.DW(parcel, zzwb.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    saVar = iInterfaceQueryLocalInterface2 instanceof qa ? (qa) iInterfaceQueryLocalInterface2 : new sa(strongBinder2);
                }
                Oo(wuVarDx2, zzwbVar2, string2, saVar);
                parcel2.writeNoException();
                return true;
            case 4:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 5:
                destroy();
                parcel2.writeNoException();
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                abcd.wu wuVarDx3 = wu.a.dx(parcel.readStrongBinder());
                zzwf zzwfVar2 = (zzwf) be0.DW(parcel, zzwf.CREATOR);
                zzwb zzwbVar3 = (zzwb) be0.DW(parcel, zzwb.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    saVar = iInterfaceQueryLocalInterface3 instanceof qa ? (qa) iInterfaceQueryLocalInterface3 : new sa(strongBinder3);
                }
                uW(wuVarDx3, zzwfVar2, zzwbVar3, string3, string4, saVar);
                parcel2.writeNoException();
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                abcd.wu wuVarDx4 = wu.a.dx(parcel.readStrongBinder());
                zzwb zzwbVar4 = (zzwb) be0.DW(parcel, zzwb.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    saVar = iInterfaceQueryLocalInterface4 instanceof qa ? (qa) iInterfaceQueryLocalInterface4 : new sa(strongBinder4);
                }
                Vw(wuVarDx4, zzwbVar4, string5, string6, saVar);
                parcel2.writeNoException();
                return true;
            case 8:
                Mr();
                parcel2.writeNoException();
                return true;
            case 9:
                XL();
                parcel2.writeNoException();
                return true;
            case 10:
                lz(wu.a.dx(parcel.readStrongBinder()), (zzwb) be0.DW(parcel, zzwb.CREATOR), parcel.readString(), uk.Mt(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                Jy((zzwb) be0.DW(parcel, zzwb.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                showVideo();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zIsInitialized = isInitialized();
                parcel2.writeNoException();
                be0.j6(parcel2, zIsInitialized);
                return true;
            case 14:
                abcd.wu wuVarDx5 = wu.a.dx(parcel.readStrongBinder());
                zzwb zzwbVar5 = (zzwb) be0.DW(parcel, zzwb.CREATOR);
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    saVar = iInterfaceQueryLocalInterface5 instanceof qa ? (qa) iInterfaceQueryLocalInterface5 : new sa(strongBinder5);
                }
                T6(wuVarDx5, zzwbVar5, string7, string8, saVar, (zzacp) be0.DW(parcel, zzacp.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                wa waVarSM = sM();
                parcel2.writeNoException();
                be0.FH(parcel2, waVarSM);
                return true;
            case 16:
                za zaVarE3 = e3();
                parcel2.writeNoException();
                be0.FH(parcel2, zaVarE3);
                return true;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                Bundle bundleZzuw = zzuw();
                parcel2.writeNoException();
                be0.VH(parcel2, bundleZzuw);
                return true;
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                Bundle interstitialAdapterInfo = getInterstitialAdapterInfo();
                parcel2.writeNoException();
                be0.VH(parcel2, interstitialAdapterInfo);
                return true;
            case 19:
                Bundle bundleIW = iW();
                parcel2.writeNoException();
                be0.VH(parcel2, bundleIW);
                return true;
            case ProxyTextView.INPUTTYPE_date /* 20 */:
                DP((zzwb) be0.DW(parcel, zzwb.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                bI(wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zMm = mm();
                parcel2.writeNoException();
                be0.j6(parcel2, zMm);
                return true;
            case 23:
                aa(wu.a.dx(parcel.readStrongBinder()), uk.Mt(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                b3 b3VarLJ = lJ();
                parcel2.writeNoException();
                be0.FH(parcel2, b3VarLJ);
                return true;
            case 25:
                sG(be0.v5(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                yx0 videoController = getVideoController();
                parcel2.writeNoException();
                be0.FH(parcel2, videoController);
                return true;
            case 27:
                cb cbVarM0 = m0();
                parcel2.writeNoException();
                be0.FH(parcel2, cbVarM0);
                return true;
            default:
                return false;
        }
    }
}
