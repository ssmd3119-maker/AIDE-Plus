package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.a;
import java.util.ArrayList;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class d4 extends com.google.android.gms.ads.formats.g {
    private final i2 FH;
    private final a4 j6;
    private final List<a.b> DW = new ArrayList();
    private final com.google.android.gms.ads.g Hw = new com.google.android.gms.ads.g();
    private final List<Object> v5 = new ArrayList();

    public d4(a4 a4Var) {
        f2 h2Var;
        IBinder iBinder;
        this.j6 = a4Var;
        i2 i2Var = null;
        try {
            List listDW = a4Var.DW();
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
            List listKD = this.j6.kD();
            if (listKD != null) {
                for (Object obj2 : listKD) {
                    ux0 ux0VarMt = obj2 instanceof IBinder ? vx0.Mt((IBinder) obj2) : null;
                    if (ux0VarMt != null) {
                        this.v5.add(new xx0(ux0VarMt));
                    }
                }
            }
        } catch (RemoteException e2) {
            xp.Hw("", e2);
        }
        try {
            f2 f2VarJ3 = this.j6.j3();
            if (f2VarJ3 != null) {
                i2Var = new i2(f2VarJ3);
            }
        } catch (RemoteException e3) {
            xp.Hw("", e3);
        }
        this.FH = i2Var;
        try {
            if (this.j6.Hw() != null) {
                new e2(this.j6.Hw());
            }
        } catch (RemoteException e4) {
            xp.Hw("", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.g
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final abcd.wu EQ() {
        try {
            return this.j6.QX();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.g
    public final String DW() {
        try {
            return this.j6.gn();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.g
    public final String FH() {
        try {
            return this.j6.Zo();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.g
    public final String Hw() {
        try {
            return this.j6.FH();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.g
    public final String VH() {
        try {
            return this.j6.aM();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.g
    public final List<a.b> Zo() {
        return this.DW;
    }

    @Override // com.google.android.gms.ads.formats.g
    public final Double gn() {
        try {
            double dA8 = this.j6.a8();
            if (dA8 == -1.0d) {
                return null;
            }
            return Double.valueOf(dA8);
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.g
    public final String j6() {
        try {
            return this.j6.er();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.g
    public final com.google.android.gms.ads.g tp() {
        try {
            if (this.j6.getVideoController() != null) {
                this.Hw.DW(this.j6.getVideoController());
            }
        } catch (RemoteException e) {
            xp.Hw("Exception occurred while getting video controller", e);
        }
        return this.Hw;
    }

    @Override // com.google.android.gms.ads.formats.g
    public final String u7() {
        try {
            return this.j6.yS();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.g
    public final a.b v5() {
        return this.FH;
    }

    @Override // com.google.android.gms.ads.formats.g
    public final Object we() {
        try {
            abcd.wu wuVarV5 = this.j6.v5();
            if (wuVarV5 != null) {
                return abcd.xu.g3(wuVarV5);
            }
            return null;
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }
}
