package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class zx0 extends ae0 implements yx0 {
    public zx0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static yx0 Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof yx0 ? (yx0) iInterfaceQueryLocalInterface : new ay0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        by0 dy0Var;
        switch (i) {
            case 1:
                yb();
                parcel2.writeNoException();
                return true;
            case 2:
                Mr();
                parcel2.writeNoException();
                return true;
            case 3:
                Sg(be0.v5(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zFd = fd();
                parcel2.writeNoException();
                be0.j6(parcel2, zFd);
                return true;
            case 5:
                int iKf = kf();
                parcel2.writeNoException();
                parcel2.writeInt(iKf);
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                float fZ3 = Z3();
                parcel2.writeNoException();
                parcel2.writeFloat(fZ3);
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                float fHx = hx();
                parcel2.writeNoException();
                parcel2.writeFloat(fHx);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    dy0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    dy0Var = iInterfaceQueryLocalInterface instanceof by0 ? (by0) iInterfaceQueryLocalInterface : new dy0(strongBinder);
                }
                sv(dy0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                float fTi = ti();
                parcel2.writeNoException();
                parcel2.writeFloat(fTi);
                return true;
            case 10:
                boolean zBO = BO();
                parcel2.writeNoException();
                be0.j6(parcel2, zBO);
                return true;
            case 11:
                by0 by0VarPj = pj();
                parcel2.writeNoException();
                be0.FH(parcel2, by0VarPj);
                return true;
            case 12:
                boolean zAk = Ak();
                parcel2.writeNoException();
                be0.j6(parcel2, zAk);
                return true;
            default:
                return false;
        }
    }
}
