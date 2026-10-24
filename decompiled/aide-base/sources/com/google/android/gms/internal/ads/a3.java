package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.a;
import java.util.ArrayList;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class a3 extends com.google.android.gms.ads.formats.e {
    private final i2 FH;
    private final x2 j6;
    private final List<a.b> DW = new ArrayList();
    private final com.google.android.gms.ads.g Hw = new com.google.android.gms.ads.g();

    public a3(x2 x2Var) {
        f2 h2Var;
        IBinder iBinder;
        this.j6 = x2Var;
        i2 i2Var = null;
        try {
            List listDW = x2Var.DW();
            if (listDW != null) {
                for (Object obj : listDW) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        h2Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        h2Var = iInterfaceQueryLocalInterface instanceof f2 ? (f2) iInterfaceQueryLocalInterface : new h2(iBinder);
                    }
                    if (h2Var != null) {
                        this.DW.add(new i2(h2Var));
                    }
                }
            }
        } catch (RemoteException e) {
            xp.Hw("", e);
        }
        try {
            f2 f2VarTI = this.j6.TI();
            if (f2VarTI != null) {
                i2Var = new i2(f2VarTI);
            }
        } catch (RemoteException e2) {
            xp.Hw("", e2);
        }
        this.FH = i2Var;
        try {
            if (this.j6.Hw() != null) {
                new e2(this.j6.Hw());
            }
        } catch (RemoteException e3) {
            xp.Hw("", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.a
    /* renamed from: u7, reason: merged with bridge method [inline-methods] */
    public final abcd.wu j6() {
        try {
            return this.j6.QX();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.e
    public final CharSequence DW() {
        try {
            return this.j6.er();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.e
    public final CharSequence FH() {
        try {
            return this.j6.gn();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.e
    public final CharSequence Hw() {
        try {
            return this.j6.Zo();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.e
    public final a.b VH() {
        return this.FH;
    }

    @Override // com.google.android.gms.ads.formats.e
    public final List<a.b> Zo() {
        return this.DW;
    }

    @Override // com.google.android.gms.ads.formats.e
    public final com.google.android.gms.ads.g gn() {
        try {
            if (this.j6.getVideoController() != null) {
                this.Hw.DW(this.j6.getVideoController());
            }
        } catch (RemoteException e) {
            xp.Hw("Exception occurred while getting video controller", e);
        }
        return this.Hw;
    }

    @Override // com.google.android.gms.ads.formats.e
    public final CharSequence v5() {
        try {
            return this.j6.FH();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }
}
