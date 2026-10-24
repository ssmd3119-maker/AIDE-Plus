package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.a;
import java.util.ArrayList;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class e2 extends a.AbstractC0106a {
    private final List<a.b> DW = new ArrayList();
    private final a2 j6;

    public e2(a2 a2Var) {
        f2 h2Var;
        IBinder iBinder;
        this.j6 = a2Var;
        try {
            a2Var.OW();
        } catch (RemoteException e) {
            xp.Hw("", e);
        }
        try {
            for (f2 f2Var : a2Var.MH()) {
                if (!(f2Var instanceof IBinder) || (iBinder = (IBinder) f2Var) == null) {
                    h2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    h2Var = iInterfaceQueryLocalInterface instanceof f2 ? (f2) iInterfaceQueryLocalInterface : new h2(iBinder);
                }
                if (h2Var != null) {
                    this.DW.add(new i2(h2Var));
                }
            }
        } catch (RemoteException e2) {
            xp.Hw("", e2);
        }
    }
}
