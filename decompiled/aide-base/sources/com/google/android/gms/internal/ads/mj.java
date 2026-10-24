package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class mj extends ae0 implements lj {
    public mj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String strJ6 = j6();
            parcel2.writeNoException();
            parcel2.writeString(strJ6);
        } else {
            if (i != 2) {
                return false;
            }
            int iZh = zh();
            parcel2.writeNoException();
            parcel2.writeInt(iZh);
        }
        return true;
    }
}
