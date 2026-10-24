package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class dg implements hg {
    private static hg VH;
    private static final Object Zo = new Object();
    private static hg gn;
    private final Context DW;
    private final WeakHashMap<Thread, Boolean> FH;
    private final ExecutorService Hw;
    private final Object j6;
    private final zzbbi v5;

    private dg(Context context) {
        this(context, zzbbi.gn());
    }

    private final Uri.Builder FH(String str, String str2, String str3, int i) {
        boolean zVH;
        String packageName;
        try {
            zVH = com.google.android.gms.common.wrappers.b.j6(this.DW).VH();
        } catch (Throwable th) {
            xp.Hw("Error fetching instant app info", th);
            zVH = false;
        }
        try {
            packageName = this.DW.getPackageName();
        } catch (Throwable unused) {
            xp.u7("Cannot obtain package name, proceeding.");
            packageName = "unknown";
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zVH)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str4 = Build.MANUFACTURER;
        String string = Build.MODEL;
        if (!string.startsWith(str4)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(string).length());
            sb.append(str4);
            sb.append(" ");
            sb.append(string);
            string = sb.toString();
        }
        return builderAppendQueryParameter.appendQueryParameter("device", string).appendQueryParameter("js", this.v5.WB).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", p.FH())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "221522000").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", cw0.Zo()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(cw0.v5().FH(p.ME)));
    }

    public static hg Zo(Context context) {
        synchronized (Zo) {
            if (VH == null) {
                if (((Boolean) cw0.v5().FH(p.FH)).booleanValue()) {
                    VH = new dg(context);
                } else {
                    VH = new ig();
                }
            }
        }
        return VH;
    }

    public static hg v5(Context context, zzbbi zzbbiVar) {
        synchronized (Zo) {
            if (gn == null) {
                if (((Boolean) cw0.v5().FH(p.FH)).booleanValue()) {
                    dg dgVar = new dg(context, zzbbiVar);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (dgVar.j6) {
                            dgVar.FH.put(thread, Boolean.TRUE);
                        }
                        thread.setUncaughtExceptionHandler(new fg(dgVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new eg(dgVar, Thread.getDefaultUncaughtExceptionHandler()));
                    gn = dgVar;
                } else {
                    gn = new ig();
                }
            }
        }
        return gn;
    }

    @Override // com.google.android.gms.internal.ads.hg
    public final void DW(Throwable th, String str, float f) {
        if (mp.U2(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        s30.j6(th, new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        int i = 0;
        boolean z = Math.random() < ((double) f);
        int i2 = f > 0.0f ? (int) (1.0f / f) : 1;
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(FH(name, string, str, i2).toString());
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.Hw.submit(new gg(this, new bq(), (String) obj));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void Hw(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L3c
            r1 = r11
            r2 = 0
            r3 = 0
        L7:
            if (r1 == 0) goto L37
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = 0
        Lf:
            if (r6 >= r5) goto L32
            r7 = r4[r6]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.mp.rN(r8)
            if (r8 == 0) goto L1e
            r2 = 1
        L1e:
            java.lang.Class<com.google.android.gms.internal.ads.dg> r8 = com.google.android.gms.internal.ads.dg.class
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L2f
            r3 = 1
        L2f:
            int r6 = r6 + 1
            goto Lf
        L32:
            java.lang.Throwable r1 = r1.getCause()
            goto L7
        L37:
            if (r2 == 0) goto L3c
            if (r3 != 0) goto L3c
            goto L3d
        L3c:
            r10 = 0
        L3d:
            if (r10 == 0) goto L46
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.DW(r11, r0, r10)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dg.Hw(java.lang.Thread, java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.hg
    public final void j6(Throwable th, String str) {
        DW(th, str, 1.0f);
    }

    private dg(Context context, zzbbi zzbbiVar) {
        this.j6 = new Object();
        this.FH = new WeakHashMap<>();
        this.Hw = Executors.newCachedThreadPool();
        this.DW = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.v5 = zzbbiVar;
    }
}
