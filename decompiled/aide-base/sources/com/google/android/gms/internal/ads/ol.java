package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class ol {
    private final AtomicReference<ThreadPoolExecutor> j6 = new AtomicReference<>(null);
    private final Object DW = new Object();

    @GuardedBy("mGmpAppIdLock")
    private String FH = null;

    @GuardedBy("mGmpAppIdLock")
    private String Hw = null;
    private final AtomicBoolean v5 = new AtomicBoolean(false);
    private final AtomicInteger Zo = new AtomicInteger(-1);
    private final AtomicReference<Object> VH = new AtomicReference<>(null);
    private final AtomicReference<Object> gn = new AtomicReference<>(null);
    private ConcurrentMap<String, Method> u7 = new ConcurrentHashMap(9);

    public ol() {
        new AtomicReference(null);
        new ArrayList();
    }

    private final void Hw(Exception exc, String str, boolean z) {
        if (this.v5.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        xp.u7(sb.toString());
        if (z) {
            xp.u7("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.v5.set(true);
        }
    }

    private static Bundle J8(String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String strValueOf = String.valueOf(str);
            xp.Hw(strValueOf.length() != 0 ? "Invalid event ID: ".concat(strValueOf) : new String("Invalid event ID: "), e);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Method Mr(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = this.u7.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.u7.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Hw(e, str, false);
            return null;
        }
    }

    private final Method VH(Context context) throws NoSuchMethodException, SecurityException {
        Method method = this.u7.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.u7.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Hw(e, "logEventInternal", true);
            return null;
        }
    }

    private final Method aM(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = this.u7.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.u7.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Hw(e, str, false);
            return null;
        }
    }

    private final Method j3(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = this.u7.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.u7.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Hw(e, str, false);
            return null;
        }
    }

    private final Object j6(String str, Context context) throws NoSuchMethodException, SecurityException {
        if (!v5(context, "com.google.android.gms.measurement.AppMeasurement", this.VH, true)) {
            return null;
        }
        try {
            return j3(context, str).invoke(this.VH.get(), new Object[0]);
        } catch (Exception e) {
            Hw(e, str, true);
            return null;
        }
    }

    private final void tp(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (v5(context, "com.google.android.gms.measurement.AppMeasurement", this.VH, true)) {
            try {
                aM(context, str2).invoke(this.VH.get(), str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                sm.we(sb.toString());
            } catch (Exception e) {
                Hw(e, str2, false);
            }
        }
    }

    private final void u7(Context context, String str, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (U2(context) && v5(context, "com.google.android.gms.measurement.AppMeasurement", this.VH, true)) {
            try {
                VH(context).invoke(this.VH.get(), "am", str, bundle);
            } catch (Exception e) {
                Hw(e, "logEventInternal", true);
            }
        }
    }

    private final boolean v5(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception e) {
                Hw(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    public final void DW(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (U2(context)) {
            u7(context, str, J8(str2, "_ac".equals(str)));
        }
    }

    public final void EQ(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (U2(context)) {
            tp(context, str, "beginAdUnitExposure");
        }
    }

    public final void FH(Context context, String str, String str2, String str3, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (U2(context)) {
            Bundle bundleJ8 = J8(str, false);
            bundleJ8.putString("_ai", str2);
            bundleJ8.putString(AppMeasurement.Param.TYPE, str3);
            bundleJ8.putInt(AppMeasurementSdk.ConditionalUserProperty.VALUE, i);
            u7(context, AppMeasurement.Event.AD_REWARD, bundleJ8);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            sm.we(sb.toString());
        }
    }

    public final void J0(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (U2(context) && (context instanceof Activity) && v5(context, "com.google.firebase.analytics.FirebaseAnalytics", this.gn, false)) {
            try {
                Mr(context, "setCurrentScreen").invoke(this.gn.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception e) {
                Hw(e, "setCurrentScreen", false);
            }
        }
    }

    public final void QX(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DW(context, "_ai", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U2(android.content.Context r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p.OW
            com.google.android.gms.internal.ads.m r1 = com.google.android.gms.internal.ads.cw0.v5()
            java.lang.Object r0 = r1.FH(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.v5
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p.wc
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.cw0.v5()
            java.lang.Object r0 = r2.FH(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.Zo
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            com.google.android.gms.internal.ads.cw0.j6()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = com.google.android.gms.internal.ads.mp.a8(r5, r0)
            if (r0 != 0) goto L59
            com.google.android.gms.internal.ads.cw0.j6()
            boolean r5 = com.google.android.gms.internal.ads.mp.XL(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            com.google.android.gms.internal.ads.xp.u7(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.Zo
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.Zo
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.Zo
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ol.U2(android.content.Context):boolean");
    }

    public final void Ws(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DW(context, "_ac", str);
    }

    public final void XL(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DW(context, "_aq", str);
    }

    public final String Zo(Context context) {
        if (!U2(context)) {
            return null;
        }
        synchronized (this.DW) {
            if (this.Hw != null) {
                return this.Hw;
            }
            this.Hw = "fa";
            return "fa";
        }
    }

    public final String a8(Context context) {
        if (!U2(context) || !v5(context, "com.google.android.gms.measurement.AppMeasurement", this.VH, true)) {
            return "";
        }
        try {
            String str = (String) j3(context, "getCurrentScreenName").invoke(this.VH.get(), new Object[0]);
            if (str == null) {
                str = (String) j3(context, "getCurrentScreenClass").invoke(this.VH.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception e) {
            Hw(e, "getCurrentScreenName", false);
            return "";
        }
    }

    public final String er(Context context) {
        Object objJ6;
        if (U2(context) && (objJ6 = j6("generateEventId", context)) != null) {
            return objJ6.toString();
        }
        return null;
    }

    final /* synthetic */ String gn(Context context) {
        return (String) j6("getAppInstanceId", context);
    }

    public final String lg(Context context) {
        if (!U2(context)) {
            return null;
        }
        synchronized (this.DW) {
            if (this.FH != null) {
                return this.FH;
            }
            String str = (String) j6("getGmpAppId", context);
            this.FH = str;
            return str;
        }
    }

    public final String rN(final Context context) {
        if (!U2(context)) {
            return null;
        }
        long jLongValue = ((Long) cw0.v5().FH(p.XG)).longValue();
        if (jLongValue < 0) {
            return (String) j6("getAppInstanceId", context);
        }
        if (this.j6.get() == null) {
            this.j6.compareAndSet(null, new ThreadPoolExecutor(((Integer) cw0.v5().FH(p.jJ)).intValue(), ((Integer) cw0.v5().FH(p.jJ)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ql(this)));
        }
        Future futureSubmit = this.j6.get().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.pl
            private final Context DW;
            private final ol j6;

            {
                this.j6 = this;
                this.DW = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.j6.gn(this.DW);
            }
        });
        try {
            return (String) futureSubmit.get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            futureSubmit.cancel(true);
            if (e instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    public final void we(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (U2(context)) {
            tp(context, str, "endAdUnitExposure");
        }
    }
}
