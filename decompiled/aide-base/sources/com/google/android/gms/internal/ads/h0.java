package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class h0 extends ae0 implements g0 {
    public h0() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String strSq = Sq();
            parcel2.writeNoException();
            parcel2.writeString(strSq);
        } else if (i == 2) {
            String content = getContent();
            parcel2.writeNoException();
            parcel2.writeString(content);
        } else if (i == 3) {
            rC(wu.a.dx(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 4) {
            oC();
            parcel2.writeNoException();
        } else {
            if (i != 5) {
                return false;
            }
            VH();
            parcel2.writeNoException();
        }
        return true;
    }
}
