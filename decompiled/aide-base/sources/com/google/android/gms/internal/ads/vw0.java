package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class vw0 extends ae0 implements uw0 {
    public vw0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        jw0 lw0Var = null;
        zw0 bx0Var = null;
        ix0 lx0Var = null;
        fw0 hw0Var = null;
        cx0 ex0Var = null;
        switch (i) {
            case 1:
                abcd.wu wuVarTv = Tv();
                parcel2.writeNoException();
                be0.FH(parcel2, wuVarTv);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zKD = KD();
                parcel2.writeNoException();
                be0.j6(parcel2, zKD);
                return true;
            case 4:
                boolean zP8 = p8((zzwb) be0.DW(parcel, zzwb.CREATOR));
                parcel2.writeNoException();
                be0.j6(parcel2, zP8);
                return true;
            case 5:
                Mr();
                parcel2.writeNoException();
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                XL();
                parcel2.writeNoException();
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    lw0Var = iInterfaceQueryLocalInterface instanceof jw0 ? (jw0) iInterfaceQueryLocalInterface : new lw0(strongBinder);
                }
                xt(lw0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    ex0Var = iInterfaceQueryLocalInterface2 instanceof cx0 ? (cx0) iInterfaceQueryLocalInterface2 : new ex0(strongBinder2);
                }
                lR(ex0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                stopLoading();
                parcel2.writeNoException();
                return true;
            case 11:
                OM();
                parcel2.writeNoException();
                return true;
            case 12:
                zzwf zzwfVarI8 = I8();
                parcel2.writeNoException();
                be0.VH(parcel2, zzwfVarI8);
                return true;
            case 13:
                dz((zzwf) be0.DW(parcel, zzwf.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                cX(td.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                tD(ae.Mt(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
            case 27:
            case 28:
            default:
                return false;
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                String strU7 = u7();
                parcel2.writeNoException();
                parcel2.writeString(strU7);
                return true;
            case 19:
                rB(k0.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case ProxyTextView.INPUTTYPE_date /* 20 */:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    hw0Var = iInterfaceQueryLocalInterface3 instanceof fw0 ? (fw0) iInterfaceQueryLocalInterface3 : new hw0(strongBinder3);
                }
                JX(hw0Var);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    lx0Var = iInterfaceQueryLocalInterface4 instanceof ix0 ? (ix0) iInterfaceQueryLocalInterface4 : new lx0(strongBinder4);
                }
                ek(lx0Var);
                parcel2.writeNoException();
                return true;
            case 22:
                ir(be0.v5(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zCT = cT();
                parcel2.writeNoException();
                be0.j6(parcel2, zCT);
                return true;
            case 24:
                br(xj.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                Xa(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                yx0 videoController = getVideoController();
                parcel2.writeNoException();
                be0.FH(parcel2, videoController);
                return true;
            case 29:
                Zz((zzzw) be0.DW(parcel, zzzw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                uy((zzyv) be0.DW(parcel, zzyv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String strNh = Nh();
                parcel2.writeNoException();
                parcel2.writeString(strNh);
                return true;
            case 32:
                cx0 cx0VarOR = oR();
                parcel2.writeNoException();
                be0.FH(parcel2, cx0VarOR);
                return true;
            case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                jw0 jw0VarJP = JP();
                parcel2.writeNoException();
                be0.FH(parcel2, jw0VarJP);
                return true;
            case 34:
                sG(be0.v5(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                String strJl = Jl();
                parcel2.writeNoException();
                parcel2.writeString(strJl);
                return true;
            case ProxyTextView.INPUTTYPE_time /* 36 */:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    bx0Var = iInterfaceQueryLocalInterface5 instanceof zw0 ? (zw0) iInterfaceQueryLocalInterface5 : new bx0(strongBinder5);
                }
                ye(bx0Var);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleXX = XX();
                parcel2.writeNoException();
                be0.VH(parcel2, bundleXX);
                return true;
            case 38:
                ew(parcel.readString());
                parcel2.writeNoException();
                return true;
        }
    }
}
