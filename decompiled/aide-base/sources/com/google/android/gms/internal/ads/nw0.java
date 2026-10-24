package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class nw0 extends ae0 implements mw0 {
    public nw0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            p4((zzwb) be0.DW(parcel, zzwb.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            String strU7 = u7();
            parcel2.writeNoException();
            parcel2.writeString(strU7);
        } else if (i == 3) {
            boolean zCT = cT();
            parcel2.writeNoException();
            be0.j6(parcel2, zCT);
        } else if (i == 4) {
            String strJl = Jl();
            parcel2.writeNoException();
            parcel2.writeString(strJl);
        } else {
            if (i != 5) {
                return false;
            }
            eT((zzwb) be0.DW(parcel, zzwb.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
