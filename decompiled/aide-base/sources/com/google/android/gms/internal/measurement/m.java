package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzcx;
import com.google.android.gms.measurement.internal.zzcy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class m {
    private static volatile m tp;
    protected final com.google.android.gms.common.util.e DW;
    private final ExecutorService FH;
    private final AppMeasurementSdk Hw;
    private boolean VH;
    private int Zo;
    private String gn;
    private final String j6;
    private com.google.android.gms.internal.measurement.e u7;
    private Map<zzcy, d> v5;

    class a extends i {
        private final AtomicReference<Bundle> WB = new AtomicReference<>();
        private boolean mb;

        a() {
        }

        final String dx(long j) {
            return (String) sh(g3(j), String.class);
        }

        final Bundle g3(long j) {
            Bundle bundle;
            synchronized (this.WB) {
                if (!this.mb) {
                    try {
                        this.WB.wait(j);
                    } catch (InterruptedException unused) {
                        return null;
                    }
                }
                bundle = this.WB.get();
            }
            return bundle;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        
            r9 = r9.get("r");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final <T> T sh(android.os.Bundle r9, java.lang.Class<T> r10) {
            /*
                r8 = this;
                r0 = 0
                if (r9 == 0) goto L46
                java.lang.String r1 = "r"
                java.lang.Object r9 = r9.get(r1)
                if (r9 == 0) goto L46
                java.lang.Object r9 = r10.cast(r9)     // Catch: java.lang.ClassCastException -> L10
                return r9
            L10:
                r6 = move-exception
                java.lang.String r7 = "Unexpected object type. Expected, Received"
                java.lang.String r10 = r10.getCanonicalName()
                java.lang.Class r9 = r9.getClass()
                java.lang.String r9 = r9.getCanonicalName()
                com.google.android.gms.internal.measurement.m r0 = com.google.android.gms.internal.measurement.m.this
                r1 = 5
                r2 = r7
                r3 = r10
                r4 = r9
                r5 = r6
                r0.KD(r1, r2, r3, r4, r5)
                com.google.android.gms.internal.measurement.m r0 = com.google.android.gms.internal.measurement.m.this
                java.lang.String r0 = com.google.android.gms.internal.measurement.m.SI(r0)
                java.lang.String r1 = ": %s, %s"
                java.lang.String r1 = r7.concat(r1)
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r10
                r10 = 1
                r2[r10] = r9
                java.lang.String r9 = java.lang.String.format(r1, r2)
                android.util.Log.w(r0, r9, r6)
                throw r6
            L46:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.m.a.sh(android.os.Bundle, java.lang.Class):java.lang.Object");
        }

        @Override // com.google.android.gms.internal.measurement.h
        public final void xL(Bundle bundle) {
            synchronized (this.WB) {
                try {
                    this.WB.set(bundle);
                    this.mb = true;
                } finally {
                    this.WB.notify();
                }
            }
        }
    }

    abstract class b implements Runnable {
        final long WB;
        private final boolean jw;
        final long mb;

        b(m mVar) {
            this(true);
        }

        protected void DW() {
        }

        abstract void j6();

        @Override // java.lang.Runnable
        public void run() {
            if (m.this.VH) {
                DW();
                return;
            }
            try {
                j6();
            } catch (Exception e) {
                m.this.yS(e, false, this.jw);
                DW();
            }
        }

        b(boolean z) {
            this.WB = m.this.DW.j6();
            this.mb = m.this.DW.DW();
            this.jw = z;
        }
    }

    static class c extends k {
        private final zzcx WB;

        c(zzcx zzcxVar) {
            this.WB = zzcxVar;
        }

        @Override // com.google.android.gms.internal.measurement.j
        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            this.WB.interceptEvent(str, str2, bundle, j);
        }

        @Override // com.google.android.gms.internal.measurement.j
        public final int ph() {
            return this.WB.hashCode();
        }
    }

    static class d extends k {
        private final zzcy WB;

        d(zzcy zzcyVar) {
            this.WB = zzcyVar;
        }

        @Override // com.google.android.gms.internal.measurement.j
        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            this.WB.onEvent(str, str2, bundle, j);
        }

        @Override // com.google.android.gms.internal.measurement.j
        public final int ph() {
            return this.WB.hashCode();
        }
    }

    class e implements Application.ActivityLifecycleCallbacks {
        e() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            m.this.U2(new j0(this, activity, bundle));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            m.this.U2(new p0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            m.this.U2(new m0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            m.this.U2(new l0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            a aVar = m.this.new a();
            m.this.U2(new o0(this, activity, aVar));
            Bundle bundleG3 = aVar.g3(50L);
            if (bundleG3 != null) {
                bundle.putAll(bundleG3);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            m.this.U2(new k0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            m.this.U2(new n0(this, activity));
        }
    }

    private m(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !cn(str2, str3)) {
            this.j6 = "FA";
        } else {
            this.j6 = str;
        }
        this.DW = com.google.android.gms.common.util.h.Hw();
        this.FH = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.j6, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new e());
        }
        this.Hw = new AppMeasurementSdk(this);
        if (!(!sh(context) || sG())) {
            this.gn = null;
            this.VH = true;
            Log.w(this.j6, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (cn(str2, str3)) {
            this.gn = str2;
        } else {
            this.gn = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.j6, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                this.VH = true;
                return;
            } else {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.j6, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        }
        U2(new n(this, context, str2, str3, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Sf(Context context) {
        return DynamiteModule.FH(context, "com.google.android.gms.measurement.dynamite");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2(b bVar) {
        this.FH.execute(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean cn(String str, String str2) {
        return (str2 == null || str == null || sG()) ? false : true;
    }

    private final void gW(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        U2(new g0(this, l, str, str2, bundle, true, z2));
    }

    public static m j3(Context context, String str, String str2, String str3, Bundle bundle) {
        com.google.android.gms.common.internal.p.u7(context);
        if (tp == null) {
            synchronized (m.class) {
                if (tp == null) {
                    tp = new m(context, str, str2, str3, bundle);
                }
            }
        }
        return tp;
    }

    private static boolean sG() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static boolean sh(Context context) {
        try {
            com.google.android.gms.common.api.internal.c.FH(context);
        } catch (IllegalStateException unused) {
        }
        return com.google.android.gms.common.api.internal.c.DW() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int vJ(Context context) {
        return DynamiteModule.j6(context, "com.google.android.gms.measurement.dynamite");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yS(Exception exc, boolean z, boolean z2) {
        this.VH |= z;
        if (z) {
            Log.w(this.j6, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            KD(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.j6, "Error with data collection. Data lost.", exc);
    }

    public final void BT(String str, String str2, Object obj, boolean z) {
        U2(new h0(this, str, str2, obj, true));
    }

    public final void DW(String str, String str2, Bundle bundle) {
        U2(new o(this, str, str2, bundle));
    }

    public final Map<String, Object> EQ(String str, String str2, boolean z) {
        a aVar = new a();
        U2(new a0(this, str, str2, z, aVar));
        Bundle bundleG3 = aVar.g3(5000L);
        if (bundleG3 == null || bundleG3.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleG3.size());
        for (String str3 : bundleG3.keySet()) {
            Object obj = bundleG3.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void FH(String str) {
        U2(new t(this, str));
    }

    public final long Hw() {
        a aVar = new a();
        U2(new x(this, aVar));
        Long l = (Long) aVar.sh(aVar.g3(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.DW.j6()).nextLong();
        int i = this.Zo + 1;
        this.Zo = i;
        return jNextLong + i;
    }

    public final void J0(String str, String str2, Bundle bundle, long j) {
        gW(str, str2, bundle, true, false, Long.valueOf(j));
    }

    public final void J8(Bundle bundle) {
        U2(new i0(this, bundle));
    }

    public final void KD(int i, String str, Object obj, Object obj2, Object obj3) {
        U2(new b0(this, false, 5, str, obj, obj2, obj3));
    }

    public final void QX(boolean z) {
        U2(new r(this, z));
    }

    public final String VH() {
        a aVar = new a();
        U2(new z(this, aVar));
        return aVar.dx(500L);
    }

    public final void Ws(Activity activity, String str, String str2) {
        U2(new q(this, activity, str, str2));
    }

    public final Bundle XL(Bundle bundle, boolean z) {
        a aVar = new a();
        U2(new c0(this, bundle, aVar));
        if (z) {
            return aVar.g3(5000L);
        }
        return null;
    }

    public final List<Bundle> Zo(String str, String str2) {
        a aVar = new a();
        U2(new p(this, str, str2, aVar));
        List<Bundle> list = (List) aVar.sh(aVar.g3(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    protected final com.google.android.gms.internal.measurement.e cb(Context context) {
        try {
            return f.sh(DynamiteModule.v5(context, DynamiteModule.EQ, "com.google.android.gms.measurement.dynamite").Hw("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e2) {
            yS(e2, true, false);
            return null;
        }
    }

    public final AppMeasurementSdk dx() {
        return this.Hw;
    }

    public final String ef() {
        a aVar = new a();
        U2(new w(this, aVar));
        return aVar.dx(50L);
    }

    public final void er(zzcy zzcyVar) {
        U2(new e0(this, zzcyVar));
    }

    public final String gn() {
        a aVar = new a();
        U2(new y(this, aVar));
        return aVar.dx(500L);
    }

    public final void j6(String str) {
        U2(new s(this, str));
    }

    public final void nw(zzcy zzcyVar) {
        U2(new f0(this, zzcyVar));
    }

    public final void rN(zzcx zzcxVar) {
        U2(new u(this, zzcxVar));
    }

    public final int tp(String str) {
        a aVar = new a();
        U2(new d0(this, str, aVar));
        Integer num = (Integer) aVar.sh(aVar.g3(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String u7() {
        a aVar = new a();
        U2(new v(this, aVar));
        return aVar.dx(500L);
    }

    public final String v5() {
        return this.gn;
    }

    public final void we(String str, String str2, Bundle bundle) {
        gW(str, str2, bundle, true, true, null);
    }
}
