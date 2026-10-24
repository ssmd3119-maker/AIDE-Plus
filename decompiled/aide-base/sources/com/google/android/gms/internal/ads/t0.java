package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class t0 extends b5 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, j1 {
    private cv WB;
    private h1 mb;
    private boolean jw = false;
    private boolean fY = false;

    public t0(cv cvVar) {
        this.WB = cvVar;
    }

    private final void CO() {
        cv cvVar;
        h1 h1Var = this.mb;
        if (h1Var == null || (cvVar = this.WB) == null) {
            return;
        }
        h1Var.xg(cvVar.getView(), Collections.emptyMap());
    }

    private static void Mt(c5 c5Var, int i) {
        try {
            c5Var.pK(i);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    private final void k6() {
        cv cvVar = this.WB;
        if (cvVar == null) {
            return;
        }
        ViewParent parent = cvVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView((View) this.WB);
        }
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final void DY(abcd.wu wuVar, c5 c5Var) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        if (this.jw) {
            xp.j6("Instream ad is destroyed already.");
            Mt(c5Var, 2);
            return;
        }
        if (this.WB.CU() == null) {
            xp.j6("Instream internal error: can not get video controller.");
            Mt(c5Var, 0);
            return;
        }
        if (this.fY) {
            xp.j6("Instream ad should not be used again.");
            Mt(c5Var, 1);
            return;
        }
        this.fY = true;
        k6();
        ((ViewGroup) abcd.xu.g3(wuVar)).addView(this.WB.getView(), new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.w0.P8();
        nr.j6(this.WB.getView(), this);
        com.google.android.gms.ads.internal.w0.P8();
        nr.DW(this.WB.getView(), this);
        CO();
        try {
            c5Var.np();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final p0 KX() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final String Vm() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final void destroy() {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        if (this.jw) {
            return;
        }
        k6();
        h1 h1Var = this.mb;
        if (h1Var != null) {
            h1Var.E4();
            this.mb.PH();
        }
        this.mb = null;
        this.WB = null;
        this.jw = true;
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final yx0 getVideoController() {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        if (this.jw) {
            xp.j6("Instream ad is destroyed already.");
            return null;
        }
        cv cvVar = this.WB;
        if (cvVar == null) {
            return null;
        }
        return cvVar.CU();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        CO();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        CO();
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void s5(h1 h1Var) {
        this.mb = h1Var;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final View tX() {
        cv cvVar = this.WB;
        if (cvVar == null) {
            return null;
        }
        return cvVar.getView();
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final String vy() {
        return "";
    }
}
