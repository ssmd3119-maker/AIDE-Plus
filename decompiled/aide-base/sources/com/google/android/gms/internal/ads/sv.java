package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class sv extends zx0 {
    private final ss WB;

    @GuardedBy("lock")
    private boolean Z1;

    @GuardedBy("lock")
    private float cT;
    private final boolean fY;

    @GuardedBy("lock")
    private float hK;
    private final boolean jw;

    @GuardedBy("lock")
    private by0 k2;

    @GuardedBy("lock")
    private boolean q7;

    @GuardedBy("lock")
    private int qp;

    @GuardedBy("lock")
    private float w9;

    @GuardedBy("lock")
    private boolean zh;
    private final Object mb = new Object();

    @GuardedBy("lock")
    private boolean AL = true;

    public sv(ss ssVar, float f, boolean z, boolean z2) {
        this.WB = ssVar;
        this.w9 = f;
        this.jw = z;
        this.fY = z2;
    }

    private final void CO(final int i, final int i2, final boolean z, final boolean z2) {
        ar.j6.execute(new Runnable(this, i, i2, z, z2) { // from class: com.google.android.gms.internal.ads.uv
            private final sv WB;
            private final boolean fY;
            private final int jw;
            private final int mb;
            private final boolean qp;

            {
                this.WB = this;
                this.mb = i;
                this.jw = i2;
                this.fY = z;
                this.qp = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.tc(this.mb, this.jw, this.fY, this.qp);
            }
        });
    }

    private final void Yb(String str, Map<String, String> map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        ar.j6.execute(new Runnable(this, map2) { // from class: com.google.android.gms.internal.ads.tv
            private final sv WB;
            private final Map mb;

            {
                this.WB = this;
                this.mb = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.HS(this.mb);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    @Override // com.google.android.gms.internal.ads.yx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ak() {
        /*
            r2 = this;
            boolean r0 = r2.BO()
            java.lang.Object r1 = r2.mb
            monitor-enter(r1)
            if (r0 != 0) goto L15
            boolean r0 = r2.Z1     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            boolean r0 = r2.fY     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L13:
            r0 = move-exception
            goto L18
        L15:
            r0 = 0
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return r0
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sv.Ak():boolean");
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final boolean BO() {
        boolean z;
        synchronized (this.mb) {
            z = this.jw && this.q7;
        }
        return z;
    }

    final /* synthetic */ void HS(Map map) {
        this.WB.v5("pubVideoCmd", map);
    }

    public final void MU(boolean z, boolean z2, boolean z3) {
        synchronized (this.mb) {
            this.q7 = z2;
            this.Z1 = z3;
        }
        Yb("initialState", com.google.android.gms.common.util.f.Hw("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final void Mr() {
        Yb("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final void Sg(boolean z) {
        Yb(z ? "mute" : "unmute", null);
    }

    public final void UE() {
        boolean z;
        int i;
        synchronized (this.mb) {
            z = this.AL;
            i = this.qp;
            this.qp = 3;
        }
        CO(i, 3, z, z);
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final float Z3() {
        float f;
        synchronized (this.mb) {
            f = this.w9;
        }
        return f;
    }

    public final void d7(zzzw zzzwVar) {
        MU(zzzwVar.WB, zzzwVar.mb, zzzwVar.jw);
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final boolean fd() {
        boolean z;
        synchronized (this.mb) {
            z = this.AL;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final float hx() {
        float f;
        synchronized (this.mb) {
            f = this.hK;
        }
        return f;
    }

    public final void k6(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        int i2;
        synchronized (this.mb) {
            this.w9 = f2;
            this.hK = f;
            z2 = this.AL;
            this.AL = z;
            i2 = this.qp;
            this.qp = i;
            float f4 = this.cT;
            this.cT = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.WB.getView().invalidate();
            }
        }
        CO(i2, i, z2, z);
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final int kf() {
        int i;
        synchronized (this.mb) {
            i = this.qp;
        }
        return i;
    }

    public final void nG(float f) {
        synchronized (this.mb) {
            this.hK = f;
        }
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final by0 pj() {
        by0 by0Var;
        synchronized (this.mb) {
            by0Var = this.k2;
        }
        return by0Var;
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final void sv(by0 by0Var) {
        synchronized (this.mb) {
            this.k2 = by0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void tc(int r7, int r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mb
            monitor-enter(r0)
            r1 = 0
            r2 = 1
            if (r7 == r8) goto L9
            r7 = 1
            goto La
        L9:
            r7 = 0
        La:
            boolean r3 = r6.zh     // Catch: java.lang.Throwable -> L8b
            if (r3 != 0) goto L12
            if (r8 != r2) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            if (r7 == 0) goto L19
            if (r8 != r2) goto L19
            r4 = 1
            goto L1a
        L19:
            r4 = 0
        L1a:
            if (r7 == 0) goto L21
            r5 = 2
            if (r8 != r5) goto L21
            r5 = 1
            goto L22
        L21:
            r5 = 0
        L22:
            if (r7 == 0) goto L29
            r7 = 3
            if (r8 != r7) goto L29
            r7 = 1
            goto L2a
        L29:
            r7 = 0
        L2a:
            if (r9 == r10) goto L2e
            r8 = 1
            goto L2f
        L2e:
            r8 = 0
        L2f:
            boolean r9 = r6.zh     // Catch: java.lang.Throwable -> L8b
            if (r9 != 0) goto L35
            if (r3 == 0) goto L36
        L35:
            r1 = 1
        L36:
            r6.zh = r1     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.by0 r9 = r6.k2     // Catch: java.lang.Throwable -> L8b
            if (r9 != 0) goto L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            return
        L3e:
            if (r3 == 0) goto L4c
            com.google.android.gms.internal.ads.by0 r9 = r6.k2     // Catch: android.os.RemoteException -> L46 java.lang.Throwable -> L8b
            r9.id()     // Catch: android.os.RemoteException -> L46 java.lang.Throwable -> L8b
            goto L4c
        L46:
            r9 = move-exception
            java.lang.String r1 = "Unable to call onVideoStart()"
            com.google.android.gms.internal.ads.xp.v5(r1, r9)     // Catch: java.lang.Throwable -> L8b
        L4c:
            if (r4 == 0) goto L5a
            com.google.android.gms.internal.ads.by0 r9 = r6.k2     // Catch: android.os.RemoteException -> L54 java.lang.Throwable -> L8b
            r9.qZ()     // Catch: android.os.RemoteException -> L54 java.lang.Throwable -> L8b
            goto L5a
        L54:
            r9 = move-exception
            java.lang.String r1 = "Unable to call onVideoPlay()"
            com.google.android.gms.internal.ads.xp.v5(r1, r9)     // Catch: java.lang.Throwable -> L8b
        L5a:
            if (r5 == 0) goto L68
            com.google.android.gms.internal.ads.by0 r9 = r6.k2     // Catch: android.os.RemoteException -> L62 java.lang.Throwable -> L8b
            r9.yO()     // Catch: android.os.RemoteException -> L62 java.lang.Throwable -> L8b
            goto L68
        L62:
            r9 = move-exception
            java.lang.String r1 = "Unable to call onVideoPause()"
            com.google.android.gms.internal.ads.xp.v5(r1, r9)     // Catch: java.lang.Throwable -> L8b
        L68:
            if (r7 == 0) goto L7b
            com.google.android.gms.internal.ads.by0 r7 = r6.k2     // Catch: android.os.RemoteException -> L70 java.lang.Throwable -> L8b
            r7.w9()     // Catch: android.os.RemoteException -> L70 java.lang.Throwable -> L8b
            goto L76
        L70:
            r7 = move-exception
            java.lang.String r9 = "Unable to call onVideoEnd()"
            com.google.android.gms.internal.ads.xp.v5(r9, r7)     // Catch: java.lang.Throwable -> L8b
        L76:
            com.google.android.gms.internal.ads.ss r7 = r6.WB     // Catch: java.lang.Throwable -> L8b
            r7.Nh()     // Catch: java.lang.Throwable -> L8b
        L7b:
            if (r8 == 0) goto L89
            com.google.android.gms.internal.ads.by0 r7 = r6.k2     // Catch: android.os.RemoteException -> L83 java.lang.Throwable -> L8b
            r7.Ej(r10)     // Catch: android.os.RemoteException -> L83 java.lang.Throwable -> L8b
            goto L89
        L83:
            r7 = move-exception
            java.lang.String r8 = "Unable to call onVideoMute()"
            com.google.android.gms.internal.ads.xp.v5(r8, r7)     // Catch: java.lang.Throwable -> L8b
        L89:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            return
        L8b:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sv.tc(int, int, boolean, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final float ti() {
        float f;
        synchronized (this.mb) {
            f = this.cT;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final void yb() {
        Yb("play", null);
    }
}
