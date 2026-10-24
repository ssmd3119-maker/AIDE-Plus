package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public abstract class ee extends om {
    protected final zl AL;
    protected final je fY;
    protected final Object k2;
    protected final Context qp;

    @GuardedBy("mLock")
    protected zzasm w9;
    protected final Object zh;

    protected ee(Context context, zl zlVar, je jeVar) {
        super(true);
        this.k2 = new Object();
        this.zh = new Object();
        this.qp = context;
        this.AL = zlVar;
        this.w9 = zlVar.DW;
        this.fY = jeVar;
    }

    protected abstract yl EQ(int i);

    @Override // com.google.android.gms.internal.ads.om
    public final void gn() {
        synchronized (this.k2) {
            xp.VH("AdRendererBackgroundTask started.");
            int i = this.AL.v5;
            try {
                tp(SystemClock.elapsedRealtime());
            } catch (he e) {
                int iJ6 = e.j6();
                if (iJ6 == 3 || iJ6 == -1) {
                    xp.gn(e.getMessage());
                } else {
                    xp.u7(e.getMessage());
                }
                if (this.w9 == null) {
                    this.w9 = new zzasm(iJ6);
                } else {
                    this.w9 = new zzasm(iJ6, this.w9.q7);
                }
                bn.gn.post(new fe(this));
                i = iJ6;
            }
            bn.gn.post(new ge(this, EQ(i)));
        }
    }

    protected abstract void tp(long j);

    @Override // com.google.android.gms.internal.ads.om
    public void v5() {
    }
}
