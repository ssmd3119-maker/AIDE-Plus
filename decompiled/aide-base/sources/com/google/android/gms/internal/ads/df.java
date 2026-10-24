package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class df {
    private final Context DW;
    private final vb0 FH;
    private final zl Hw;
    private ViewTreeObserver.OnGlobalLayoutListener VH;
    private final com.google.android.gms.ads.internal.c0 Zo;
    private ViewTreeObserver.OnScrollChangedListener gn;
    private final DisplayMetrics u7;
    private final d0 v5;
    private final Object j6 = new Object();

    @GuardedBy("mLock")
    private int EQ = -1;

    @GuardedBy("mLock")
    private int we = -1;
    private bp tp = new bp(200);

    public df(Context context, vb0 vb0Var, zl zlVar, d0 d0Var, com.google.android.gms.ads.internal.c0 c0Var) {
        this.DW = context;
        this.FH = vb0Var;
        this.Hw = zlVar;
        this.v5 = d0Var;
        this.Zo = c0Var;
        com.google.android.gms.ads.internal.w0.v5();
        this.u7 = bn.FH((WindowManager) context.getSystemService("window"));
    }

    private final cv EQ() {
        com.google.android.gms.ads.internal.w0.Zo();
        return iv.DW(this.DW, pw.DW(), "native-video", false, false, this.FH, this.Hw.j6.cT, this.v5, null, this.Zo.fY(), this.Hw.u7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Zo(WeakReference<cv> weakReference, boolean z) {
        cv cvVar;
        if (weakReference == null || (cvVar = weakReference.get()) == null || cvVar.getView() == null) {
            return;
        }
        if (!z || this.tp.j6()) {
            int[] iArr = new int[2];
            cvVar.getView().getLocationOnScreen(iArr);
            cw0.j6();
            int iJ8 = mp.J8(this.u7, iArr[0]);
            cw0.j6();
            int iJ82 = mp.J8(this.u7, iArr[1]);
            synchronized (this.j6) {
                if (this.EQ != iJ8 || this.we != iJ82) {
                    this.EQ = iJ8;
                    this.we = iJ82;
                    cvVar.AF().EQ(this.EQ, this.we, z ? false : true);
                }
            }
        }
    }

    private final ViewTreeObserver.OnGlobalLayoutListener j6(WeakReference<cv> weakReference) {
        if (this.VH == null) {
            this.VH = new lf(this, weakReference);
        }
        return this.VH;
    }

    private final ViewTreeObserver.OnScrollChangedListener u7(WeakReference<cv> weakReference) {
        if (this.gn == null) {
            this.gn = new mf(this, weakReference);
        }
        return this.gn;
    }

    private final void v5(cv cvVar, boolean z) {
        cvVar.sh("/video", com.google.android.gms.ads.internal.gmsg.m.we);
        cvVar.sh("/videoMeta", com.google.android.gms.ads.internal.gmsg.m.J0);
        cvVar.sh("/precache", new lu());
        cvVar.sh("/delayPageLoaded", com.google.android.gms.ads.internal.gmsg.m.QX);
        cvVar.sh("/instrument", com.google.android.gms.ads.internal.gmsg.m.J8);
        cvVar.sh("/log", com.google.android.gms.ads.internal.gmsg.m.VH);
        cvVar.sh("/videoClicked", com.google.android.gms.ads.internal.gmsg.m.gn);
        cvVar.sh("/trackActiveViewUnit", new jf(this));
        cvVar.sh("/untrackActiveViewUnit", new kf(this));
        if (z) {
            cvVar.sh("/open", new com.google.android.gms.ads.internal.gmsg.c(null, null));
        }
    }

    final /* synthetic */ void Hw(fr frVar, cv cvVar, boolean z) {
        this.Zo.eE();
        frVar.FH(cvVar);
    }

    final /* synthetic */ void VH(boolean z, final fr frVar, String str, String str2) {
        try {
            final cv cvVarEQ = EQ();
            if (z) {
                cvVarEQ.ba(pw.Hw());
            } else {
                cvVarEQ.ba(pw.FH());
            }
            this.Zo.Zq(cvVarEQ);
            WeakReference<cv> weakReference = new WeakReference<>(cvVarEQ);
            cvVarEQ.AF().Ws(j6(weakReference), u7(weakReference));
            v5(cvVarEQ, z);
            cvVarEQ.AF().J8(new lw(this, frVar, cvVarEQ) { // from class: com.google.android.gms.internal.ads.gf
                private final df WB;
                private final cv jw;
                private final fr mb;

                {
                    this.WB = this;
                    this.mb = frVar;
                    this.jw = cvVarEQ;
                }

                @Override // com.google.android.gms.internal.ads.lw
                public final void j6(boolean z2) {
                    this.WB.Hw(this.mb, this.jw, z2);
                }
            });
            cvVarEQ.wM(str, str2, null);
        } catch (Exception e) {
            xp.v5("Exception occurred while getting video view", e);
            frVar.FH(null);
        }
    }

    final /* synthetic */ void gn(boolean z, final JSONObject jSONObject, final fr frVar) {
        try {
            final cv cvVarEQ = EQ();
            if (z) {
                cvVarEQ.ba(pw.Hw());
            } else {
                cvVarEQ.ba(pw.FH());
            }
            this.Zo.Zq(cvVarEQ);
            WeakReference<cv> weakReference = new WeakReference<>(cvVarEQ);
            cvVarEQ.AF().Ws(j6(weakReference), u7(weakReference));
            v5(cvVarEQ, z);
            cvVarEQ.AF().u7(new mw(cvVarEQ, jSONObject) { // from class: com.google.android.gms.internal.ads.hf
                private final JSONObject DW;
                private final cv j6;

                {
                    this.j6 = cvVarEQ;
                    this.DW = jSONObject;
                }

                @Override // com.google.android.gms.internal.ads.mw
                public final void j6() {
                    this.j6.tp("google.afma.nativeAds.renderVideo", this.DW);
                }
            });
            cvVarEQ.AF().J8(new lw(this, frVar, cvVarEQ) { // from class: com.google.android.gms.internal.ads.if
                private final df WB;
                private final cv jw;
                private final fr mb;

                {
                    this.WB = this;
                    this.mb = frVar;
                    this.jw = cvVarEQ;
                }

                @Override // com.google.android.gms.internal.ads.lw
                public final void j6(boolean z2) {
                    this.WB.tp(this.mb, this.jw, z2);
                }
            });
            cvVarEQ.loadUrl((String) cw0.v5().FH(p.Fd));
        } catch (Exception e) {
            xp.v5("Exception occurred while getting video view", e);
            frVar.FH(null);
        }
    }

    final /* synthetic */ void tp(fr frVar, cv cvVar, boolean z) {
        this.Zo.eE();
        frVar.FH(cvVar);
    }
}
