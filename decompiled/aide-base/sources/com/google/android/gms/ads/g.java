package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.ty0;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yx0;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class g {

    @GuardedBy("mLock")
    private yx0 DW;

    @GuardedBy("mLock")
    private a FH;
    private final Object j6 = new Object();

    public static abstract class a {
        public void DW(boolean z) {
            throw null;
        }

        public void FH() {
            throw null;
        }

        public void Hw() {
            throw null;
        }

        public void j6() {
            throw null;
        }

        public void v5() {
            throw null;
        }
    }

    public final void DW(yx0 yx0Var) {
        synchronized (this.j6) {
            this.DW = yx0Var;
            if (this.FH != null) {
                j6(this.FH);
            }
        }
    }

    public final yx0 FH() {
        yx0 yx0Var;
        synchronized (this.j6) {
            yx0Var = this.DW;
        }
        return yx0Var;
    }

    public final void j6(a aVar) {
        p.tp(aVar, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.j6) {
            this.FH = aVar;
            if (this.DW == null) {
                return;
            }
            try {
                this.DW.sv(new ty0(aVar));
            } catch (RemoteException e) {
                xp.Hw("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }
}
