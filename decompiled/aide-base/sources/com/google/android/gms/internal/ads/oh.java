package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class oh extends ae0 implements nh {
    public oh() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            qh shVar = null;
            th uhVar = null;
            th uhVar2 = null;
            if (i == 2) {
                zzasi zzasiVar = (zzasi) be0.DW(parcel, zzasi.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    shVar = iInterfaceQueryLocalInterface instanceof qh ? (qh) iInterfaceQueryLocalInterface : new sh(strongBinder);
                }
                x(zzasiVar, shVar);
                parcel2.writeNoException();
            } else if (i == 4) {
                zzatb zzatbVar = (zzatb) be0.DW(parcel, zzatb.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    uhVar2 = iInterfaceQueryLocalInterface2 instanceof th ? (th) iInterfaceQueryLocalInterface2 : new uh(strongBinder2);
                }
                dd(zzatbVar, uhVar2);
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return false;
                }
                zzatb zzatbVar2 = (zzatb) be0.DW(parcel, zzatb.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    uhVar = iInterfaceQueryLocalInterface3 instanceof th ? (th) iInterfaceQueryLocalInterface3 : new uh(strongBinder3);
                }
                pT(zzatbVar2, uhVar);
                parcel2.writeNoException();
            }
        } else {
            zzasm zzasmVarXm = xm((zzasi) be0.DW(parcel, zzasi.CREATOR));
            parcel2.writeNoException();
            be0.VH(parcel2, zzasmVarXm);
        }
        return true;
    }
}
