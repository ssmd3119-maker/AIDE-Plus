package abcd;

import android.app.Application;
import android.os.DeadObjectException;
import com.android.installreferrer.api.b;
import com.android.installreferrer.api.c;
import com.probelytics.api.Market;
import com.probelytics.api.MarketReferrer;

/* loaded from: classes.dex */
public class uy {

    static class a implements b {
        final /* synthetic */ com.android.installreferrer.api.a j6;

        public a(com.android.installreferrer.api.a aVar) {
            this.j6 = aVar;
        }

        @Override // com.android.installreferrer.api.b
        public void DW() {
        }

        @Override // com.android.installreferrer.api.b
        public void j6(int i) {
            try {
                if (i != 0) {
                    if (i != 2) {
                        return;
                    }
                    uy.FH();
                    return;
                }
                c cVarDW = this.j6.DW();
                String strDW = cVarDW.DW();
                long jFH = cVarDW.FH() * 1000;
                long jJ6 = cVarDW.j6() * 1000;
                this.j6.j6();
                long jJ62 = by.j6().j6();
                boolean z = true;
                boolean z2 = jJ6 != 0 && jJ6 < jJ62;
                if (jFH == 0 || jFH >= jJ62) {
                    z = false;
                }
                if (z2 && z) {
                    if (jJ6 <= jFH) {
                        jJ6 = jFH + 1;
                    }
                } else if (!z2 && z) {
                    jJ6 = jFH + 1;
                } else if (z2) {
                    jFH = jJ6 - 1;
                } else {
                    jFH = jJ62 - 2;
                    jJ6 = jJ62 - 1;
                }
                MarketReferrer marketReferrer = new MarketReferrer(new Market("com.android.vending"), strDW);
                py.vy(jFH, marketReferrer);
                py.BT(jJ6, marketReferrer.getMarket());
            } catch (DeadObjectException e) {
                b00.DW("InstallReferrer", "Dead object", e);
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
            }
        }
    }

    public static void DW() {
        if (by.j6().FH()) {
            try {
                Application applicationDW = iy.DW();
                if ("com.android.vending".equals(applicationDW.getPackageManager().getInstallerPackageName(applicationDW.getPackageName()))) {
                    com.android.installreferrer.api.a aVarJ6 = com.android.installreferrer.api.a.FH(applicationDW).j6();
                    aVarJ6.Hw(new a(aVarJ6));
                } else {
                    FH();
                }
            } catch (NoClassDefFoundError e) {
                b00.DW("InstallReferrer", "Class not found", e);
                FH();
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void FH() {
        py.BT(by.j6().j6() - 1, new Market(iy.DW().getPackageManager().getInstallerPackageName(iy.DW().getPackageName())));
    }
}
