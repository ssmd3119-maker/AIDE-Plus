package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class g1 extends l1 {
    private za Mr;
    private cb U2;
    private final i1 a8;
    private boolean er;
    private wa j3;
    private h1 lg;
    private boolean rN;
    private final Object yS;

    public g1(Context context, i1 i1Var, vb0 vb0Var, wa waVar, j1 j1Var) {
        this(context, i1Var, vb0Var, j1Var);
        this.j3 = waVar;
    }

    private static HashMap<String, View> U2(Map<String, WeakReference<View>> map) {
        HashMap<String, View> map2 = new HashMap<>();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    map2.put(entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    private final void er(View view) {
        try {
            if (this.U2 != null && !this.U2.Qq()) {
                this.U2.Sf(abcd.xu.sy(view));
                this.a8.EQ();
            } else if (this.j3 != null && !this.j3.Qq()) {
                this.j3.Sf(abcd.xu.sy(view));
                this.a8.EQ();
            } else {
                if (this.Mr == null || this.Mr.Qq()) {
                    return;
                }
                this.Mr.Sf(abcd.xu.sy(view));
                this.a8.EQ();
            }
        } catch (RemoteException e) {
            xp.v5("Failed to call performClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void Bx() {
        h1 h1Var = this.lg;
        if (h1Var != null) {
            h1Var.Bx();
        }
    }

    @Override // com.google.android.gms.internal.ads.l1
    public final void DW(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        synchronized (this.yS) {
            this.rN = true;
            HashMap<String, View> mapU2 = U2(map);
            HashMap<String, View> mapU22 = U2(map2);
            try {
                if (this.U2 != null) {
                    this.U2.I(abcd.xu.sy(view), abcd.xu.sy(mapU2), abcd.xu.sy(mapU22));
                } else if (this.j3 != null) {
                    this.j3.I(abcd.xu.sy(view), abcd.xu.sy(mapU2), abcd.xu.sy(mapU22));
                    this.j3.qP(abcd.xu.sy(view));
                } else if (this.Mr != null) {
                    this.Mr.I(abcd.xu.sy(view), abcd.xu.sy(mapU2), abcd.xu.sy(mapU22));
                    this.Mr.qP(abcd.xu.sy(view));
                }
            } catch (RemoteException e) {
                xp.v5("Failed to call prepareAd", e);
            }
            this.rN = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void E4() {
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void Fd(MotionEvent motionEvent) {
        synchronized (this.yS) {
            if (this.lg != null) {
                this.lg.Fd(motionEvent);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0038, code lost:
    
        r4 = null;
     */
    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Lz(android.view.View.OnClickListener r3, boolean r4) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.yS
            monitor-enter(r0)
            com.google.android.gms.internal.ads.h1 r1 = r2.lg     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto Lf
            com.google.android.gms.internal.ads.h1 r1 = r2.lg     // Catch: java.lang.Throwable -> L44
            android.view.View r3 = r1.Lz(r3, r4)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r3
        Lf:
            r3 = 0
            com.google.android.gms.internal.ads.cb r4 = r2.U2     // Catch: android.os.RemoteException -> L31 java.lang.Throwable -> L44
            if (r4 == 0) goto L1b
            com.google.android.gms.internal.ads.cb r4 = r2.U2     // Catch: android.os.RemoteException -> L31 java.lang.Throwable -> L44
            abcd.wu r4 = r4.cb()     // Catch: android.os.RemoteException -> L31 java.lang.Throwable -> L44
            goto L38
        L1b:
            com.google.android.gms.internal.ads.wa r4 = r2.j3     // Catch: android.os.RemoteException -> L31 java.lang.Throwable -> L44
            if (r4 == 0) goto L26
            com.google.android.gms.internal.ads.wa r4 = r2.j3     // Catch: android.os.RemoteException -> L31 java.lang.Throwable -> L44
            abcd.wu r4 = r4.cb()     // Catch: android.os.RemoteException -> L31 java.lang.Throwable -> L44
            goto L38
        L26:
            com.google.android.gms.internal.ads.za r4 = r2.Mr     // Catch: android.os.RemoteException -> L31 java.lang.Throwable -> L44
            if (r4 == 0) goto L37
            com.google.android.gms.internal.ads.za r4 = r2.Mr     // Catch: android.os.RemoteException -> L31 java.lang.Throwable -> L44
            abcd.wu r4 = r4.cb()     // Catch: android.os.RemoteException -> L31 java.lang.Throwable -> L44
            goto L38
        L31:
            r4 = move-exception
            java.lang.String r1 = "Failed to call getAdChoicesContent"
            com.google.android.gms.internal.ads.xp.v5(r1, r4)     // Catch: java.lang.Throwable -> L44
        L37:
            r4 = r3
        L38:
            if (r4 == 0) goto L42
            java.lang.Object r3 = abcd.xu.g3(r4)     // Catch: java.lang.Throwable -> L44
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r3
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r3
        L44:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g1.Lz(android.view.View$OnClickListener, boolean):android.view.View");
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void MP() {
        com.google.android.gms.common.internal.p.Hw("recordDownloadedImpression must be called on main UI thread.");
        synchronized (this.yS) {
            this.EQ = true;
            if (this.lg != null) {
                this.lg.MP();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void Of(View view) {
        synchronized (this.yS) {
            if (this.lg != null) {
                this.lg.Of(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void PH() {
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void PT(View view, Map<String, WeakReference<View>> map) {
        com.google.android.gms.common.internal.p.Hw("recordImpression must be called on the main UI thread.");
        synchronized (this.yS) {
            this.tp = true;
            if (this.lg != null) {
                this.lg.PT(view, map);
                this.a8.VH();
            } else {
                try {
                    if (this.U2 != null && !this.U2.cn()) {
                        this.U2.VH();
                        this.a8.VH();
                    } else if (this.j3 != null && !this.j3.cn()) {
                        this.j3.VH();
                        this.a8.VH();
                    } else if (this.Mr != null && !this.Mr.cn()) {
                        this.Mr.VH();
                        this.a8.VH();
                    }
                } catch (RemoteException e) {
                    xp.v5("Failed to call recordImpression", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void Pa() {
        com.google.android.gms.common.internal.p.Hw("recordCustomClickGesture must be called on the main UI thread.");
        synchronized (this.yS) {
            if (this.lg != null) {
                if (this.er) {
                    this.lg.Q6();
                }
                this.lg.Pa();
                this.a8.EQ();
            } else if (!this.er) {
                xp.u7("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
            } else if (!ct()) {
                xp.u7("Custom click reporting for 3p ads failed. Ad unit id not whitelisted.");
            } else if (j3() != null) {
                er(j3().AR());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void Q6() {
        this.er = true;
        h1 h1Var = this.lg;
        if (h1Var != null) {
            h1Var.Q6();
        }
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void XG() {
        synchronized (this.yS) {
            if (this.lg != null) {
                this.lg.XG();
            }
        }
    }

    public final void a8(h1 h1Var) {
        synchronized (this.yS) {
            this.lg = h1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.l1
    public final cv aM() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final boolean b1() {
        synchronized (this.yS) {
            if (this.lg != null) {
                return this.lg.b1();
            }
            return this.a8.Lm();
        }
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final boolean ct() {
        synchronized (this.yS) {
            if (this.lg != null) {
                return this.lg.ct();
            }
            return this.a8.f2();
        }
    }

    public final h1 gW() {
        h1 h1Var;
        synchronized (this.yS) {
            h1Var = this.lg;
        }
        return h1Var;
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final boolean hp() {
        synchronized (this.yS) {
            if (this.lg != null) {
                return this.lg.hp();
            }
            return this.a8.vZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void oa(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        com.google.android.gms.common.internal.p.Hw("performClick must be called on the main UI thread.");
        synchronized (this.yS) {
            if (this.er && ct()) {
                return;
            }
            if (this.lg != null) {
                this.lg.oa(view, map, bundle, view2);
                this.a8.EQ();
            } else {
                er(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void qP(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.yS) {
            try {
                if (this.U2 != null) {
                    this.U2.x9(abcd.xu.sy(view));
                } else if (this.j3 != null) {
                    this.j3.x9(abcd.xu.sy(view));
                } else if (this.Mr != null) {
                    this.Mr.x9(abcd.xu.sy(view));
                }
            } catch (RemoteException e) {
                xp.v5("Failed to call untrackView", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void sE(y3 y3Var) {
        synchronized (this.yS) {
            if (this.lg != null) {
                this.lg.sE(y3Var);
            }
        }
    }

    public final boolean yS() {
        boolean z;
        synchronized (this.yS) {
            z = this.rN;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.l1, com.google.android.gms.internal.ads.h1
    public final void ys() {
        h1 h1Var = this.lg;
        if (h1Var != null) {
            h1Var.ys();
        }
    }

    public g1(Context context, i1 i1Var, vb0 vb0Var, za zaVar, j1 j1Var) {
        this(context, i1Var, vb0Var, j1Var);
        this.Mr = zaVar;
    }

    public g1(Context context, i1 i1Var, vb0 vb0Var, cb cbVar, j1 j1Var) {
        this(context, i1Var, vb0Var, j1Var);
        this.U2 = cbVar;
    }

    private g1(Context context, i1 i1Var, vb0 vb0Var, j1 j1Var) {
        super(context, i1Var, null, vb0Var, null, j1Var, null, null);
        this.rN = false;
        this.er = false;
        this.yS = new Object();
        this.a8 = i1Var;
    }
}
