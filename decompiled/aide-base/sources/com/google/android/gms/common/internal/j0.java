package com.google.android.gms.common.internal;

import abcd.lv;
import abcd.mv;
import abcd.wu;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class j0 extends lv implements i0 {
    public j0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static i0 dx(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new k0(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.lv
    public final boolean sh(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            wu wuVarOb = Ob();
            parcel2.writeNoException();
            mv.FH(parcel2, wuVarOb);
        } else {
            if (i != 2) {
                return false;
            }
            int iJ8 = J8();
            parcel2.writeNoException();
            parcel2.writeInt(iJ8);
        }
        return true;
    }
}
