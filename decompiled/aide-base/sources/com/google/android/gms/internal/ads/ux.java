package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class ux extends ae0 implements sx {
    public static sx Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return iInterfaceQueryLocalInterface instanceof sx ? (sx) iInterfaceQueryLocalInterface : new vx(iBinder);
    }
}
