package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class p4 extends n1 implements p3 {
    public static p3 sh(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof p3 ? (p3) iInterfaceQueryLocalInterface : new q5(iBinder);
    }
}
