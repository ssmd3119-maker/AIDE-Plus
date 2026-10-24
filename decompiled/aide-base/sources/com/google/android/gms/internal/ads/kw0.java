package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class kw0 extends ae0 implements jw0 {
    public kw0() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                fN();
                break;
            case 2:
                Gj(parcel.readInt());
                break;
            case 3:
                mb();
                break;
            case 4:
                k2();
                break;
            case 5:
                ko();
                break;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                EQ();
                break;
            case UserTouchAction.CLICK_KIND /* 7 */:
                hK();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
