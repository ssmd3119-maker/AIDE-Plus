package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class qw0 extends ae0 implements pw0 {
    public qw0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        jw0 lw0Var = null;
        ix0 lx0Var = null;
        switch (i) {
            case 1:
                mw0 mw0VarTj = tj();
                parcel2.writeNoException();
                be0.FH(parcel2, mw0VarTj);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    lw0Var = iInterfaceQueryLocalInterface instanceof jw0 ? (jw0) iInterfaceQueryLocalInterface : new lw0(strongBinder);
                }
                eJ(lw0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                yr(h3.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                uM(k3.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                wC(parcel.readString(), q3.Mt(parcel.readStrongBinder()), n3.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                D5((zzacp) be0.DW(parcel, zzacp.CREATOR));
                parcel2.writeNoException();
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    lx0Var = iInterfaceQueryLocalInterface2 instanceof ix0 ? (ix0) iInterfaceQueryLocalInterface2 : new lx0(strongBinder2);
                }
                ob(lx0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                HU(t3.Mt(parcel.readStrongBinder()), (zzwf) be0.DW(parcel, zzwf.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                LA((PublisherAdViewOptions) be0.DW(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                fP(w3.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                yz((zzafz) be0.DW(parcel, zzafz.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                sT(f5.Mt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
