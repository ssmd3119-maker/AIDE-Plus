package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qb0 implements Runnable {
    private final /* synthetic */ pb0 WB;

    qb0(pb0 pb0Var) {
        this.WB = pb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.DW != null) {
            return;
        }
        synchronized (pb0.FH) {
            if (this.WB.DW != null) {
                return;
            }
            boolean zBooleanValue = ((Boolean) cw0.v5().FH(p.IS)).booleanValue();
            if (zBooleanValue) {
                try {
                    pb0.Hw = new zzur(this.WB.j6.j6, "ADSHIELD", null);
                } catch (Throwable unused) {
                    zBooleanValue = false;
                }
            }
            this.WB.DW = Boolean.valueOf(zBooleanValue);
            pb0.FH.open();
        }
    }
}
