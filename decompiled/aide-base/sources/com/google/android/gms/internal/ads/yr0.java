package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class yr0 implements Runnable {
    private final /* synthetic */ xr0 WB;

    yr0(xr0 xr0Var) {
        this.WB = xr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.WB.jw) {
            if (this.WB.fY && this.WB.qp) {
                xr0.VH(this.WB, false);
                xp.VH("App went background");
                Iterator it = this.WB.k2.iterator();
                while (it.hasNext()) {
                    try {
                        ((zr0) it.next()).j6(false);
                    } catch (Exception e) {
                        xp.Hw("", e);
                    }
                }
            } else {
                xp.VH("App is still foreground");
            }
        }
    }
}
