package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class xd extends ae0 implements vd {
    public static vd Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        return iInterfaceQueryLocalInterface instanceof vd ? (vd) iInterfaceQueryLocalInterface : new yd(iBinder);
    }
}
