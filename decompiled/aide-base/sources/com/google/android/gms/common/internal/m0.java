package com.google.android.gms.common.internal;

import abcd.lv;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class m0 extends lv implements l0 {
    public static l0 dx(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new n0(iBinder);
    }
}
