package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.rb0;
import com.google.android.gms.internal.ads.ub0;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.zm;
import com.google.android.gms.internal.ads.zzbbi;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@jg
/* loaded from: classes.dex */
public final class h implements rb0, Runnable {
    private final List<Object[]> WB;
    private zzbbi fY;
    private Context jw;
    private final AtomicReference<rb0> mb;
    private CountDownLatch qp;

    public h(x0 x0Var) {
        this(x0Var.jw, x0Var.qp);
    }

    private final void EQ() {
        if (this.WB.isEmpty()) {
            return;
        }
        for (Object[] objArr : this.WB) {
            if (objArr.length == 1) {
                this.mb.get().VH((MotionEvent) objArr[0]);
            } else if (objArr.length == 3) {
                this.mb.get().Hw(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.WB.clear();
    }

    private final boolean tp() throws InterruptedException {
        try {
            this.qp.await();
            return true;
        } catch (InterruptedException e) {
            xp.v5("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private static Context u7(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final String DW(Context context) {
        rb0 rb0Var;
        if (!tp() || (rb0Var = this.mb.get()) == null) {
            return "";
        }
        EQ();
        return rb0Var.DW(u7(context));
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final void FH(View view) {
        rb0 rb0Var = this.mb.get();
        if (rb0Var != null) {
            rb0Var.FH(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final void Hw(int i, int i2, int i3) {
        rb0 rb0Var = this.mb.get();
        if (rb0Var == null) {
            this.WB.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            EQ();
            rb0Var.Hw(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final void VH(MotionEvent motionEvent) {
        rb0 rb0Var = this.mb.get();
        if (rb0Var == null) {
            this.WB.add(new Object[]{motionEvent});
        } else {
            EQ();
            rb0Var.VH(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final String gn(Context context, String str, View view, Activity activity) {
        rb0 rb0Var;
        if (!tp() || (rb0Var = this.mb.get()) == null) {
            return "";
        }
        EQ();
        return rb0Var.gn(u7(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final String j6(Context context, String str, View view) {
        return gn(context, str, view, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.fY.fY;
            if (!((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.jw)).booleanValue() && z2) {
                z = true;
            }
            this.mb.set(ub0.XL(this.fY.WB, u7(this.jw), z));
        } finally {
            this.qp.countDown();
            this.jw = null;
            this.fY = null;
        }
    }

    private h(Context context, zzbbi zzbbiVar) {
        this.WB = new Vector();
        this.mb = new AtomicReference<>();
        this.qp = new CountDownLatch(1);
        this.jw = context;
        this.fY = zzbbiVar;
        cw0.j6();
        if (mp.EQ()) {
            zm.DW(this);
        } else {
            run();
        }
    }
}
