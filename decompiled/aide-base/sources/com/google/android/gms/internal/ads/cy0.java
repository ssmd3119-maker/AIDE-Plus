package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class cy0 extends ae0 implements by0 {
    public cy0() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            id();
        } else if (i == 2) {
            qZ();
        } else if (i == 3) {
            yO();
        } else if (i == 4) {
            w9();
        } else {
            if (i != 5) {
                return false;
            }
            Ej(be0.v5(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
