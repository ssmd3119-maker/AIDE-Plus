package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.zzbbi;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class e {
    private long DW = 0;
    private Context j6;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void DW(android.content.Context r8, com.google.android.gms.internal.ads.zzbbi r9, boolean r10, com.google.android.gms.internal.ads.cm r11, java.lang.String r12, java.lang.String r13, java.lang.Runnable r14) {
        /*
            r7 = this;
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.w0.we()
            long r0 = r0.DW()
            long r2 = r7.DW
            long r0 = r0 - r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L17
            java.lang.String r8 = "Not retrying to fetch app settings"
            com.google.android.gms.internal.ads.xp.u7(r8)
            return
        L17:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.w0.we()
            long r0 = r0.DW()
            r7.DW = r0
            r0 = 0
            r1 = 1
            if (r11 != 0) goto L27
        L25:
            r0 = 1
            goto L54
        L27:
            long r2 = r11.j6()
            com.google.android.gms.common.util.e r4 = com.google.android.gms.ads.internal.w0.we()
            long r4 = r4.j6()
            long r4 = r4 - r2
            com.google.android.gms.internal.ads.e<java.lang.Long> r2 = com.google.android.gms.internal.ads.p.Ej
            com.google.android.gms.internal.ads.m r3 = com.google.android.gms.internal.ads.cw0.v5()
            java.lang.Object r2 = r3.FH(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4a
            r2 = 1
            goto L4b
        L4a:
            r2 = 0
        L4b:
            if (r2 != 0) goto L25
            boolean r11 = r11.DW()
            if (r11 != 0) goto L54
            goto L25
        L54:
            if (r0 != 0) goto L57
            return
        L57:
            if (r8 != 0) goto L5f
            java.lang.String r8 = "Context not provided to fetch application settings"
            com.google.android.gms.internal.ads.xp.u7(r8)
            return
        L5f:
            boolean r11 = android.text.TextUtils.isEmpty(r12)
            if (r11 == 0) goto L71
            boolean r11 = android.text.TextUtils.isEmpty(r13)
            if (r11 == 0) goto L71
            java.lang.String r8 = "App settings could not be fetched. Required parameters missing"
            com.google.android.gms.internal.ads.xp.u7(r8)
            return
        L71:
            android.content.Context r11 = r8.getApplicationContext()
            if (r11 == 0) goto L78
            goto L79
        L78:
            r11 = r8
        L79:
            r7.j6 = r11
            com.google.android.gms.internal.ads.y8 r11 = com.google.android.gms.ads.internal.w0.Mr()
            android.content.Context r0 = r7.j6
            com.google.android.gms.internal.ads.g9 r9 = r11.j6(r0, r9)
            com.google.android.gms.internal.ads.b9<org.json.JSONObject> r11 = com.google.android.gms.internal.ads.d9.DW
            java.lang.String r0 = "google.afma.config.fetchAppSettings"
            com.google.android.gms.internal.ads.x8 r9 = r9.j6(r0, r11, r11)
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld0
            r11.<init>()     // Catch: java.lang.Exception -> Ld0
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> Ld0
            if (r0 != 0) goto L9e
            java.lang.String r13 = "app_id"
            r11.put(r13, r12)     // Catch: java.lang.Exception -> Ld0
            goto La9
        L9e:
            boolean r12 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> Ld0
            if (r12 != 0) goto La9
            java.lang.String r12 = "ad_unit_id"
            r11.put(r12, r13)     // Catch: java.lang.Exception -> Ld0
        La9:
            java.lang.String r12 = "is_init"
            r11.put(r12, r10)     // Catch: java.lang.Exception -> Ld0
            java.lang.String r10 = "pn"
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Exception -> Ld0
            r11.put(r10, r8)     // Catch: java.lang.Exception -> Ld0
            com.google.android.gms.internal.ads.vq r8 = r9.DW(r11)     // Catch: java.lang.Exception -> Ld0
            com.google.android.gms.internal.ads.eq r9 = com.google.android.gms.ads.internal.f.j6     // Catch: java.lang.Exception -> Ld0
            java.util.concurrent.Executor r10 = com.google.android.gms.internal.ads.ar.DW     // Catch: java.lang.Exception -> Ld0
            com.google.android.gms.internal.ads.vq r9 = com.google.android.gms.internal.ads.jq.DW(r8, r9, r10)     // Catch: java.lang.Exception -> Ld0
            if (r14 == 0) goto Lca
            java.util.concurrent.Executor r10 = com.google.android.gms.internal.ads.ar.DW     // Catch: java.lang.Exception -> Ld0
            r8.DW(r14, r10)     // Catch: java.lang.Exception -> Ld0
        Lca:
            java.lang.String r8 = "ConfigLoader.maybeFetchNewAppSettings"
            com.google.android.gms.internal.ads.hq.j6(r9, r8)     // Catch: java.lang.Exception -> Ld0
            return
        Ld0:
            r8 = move-exception
            java.lang.String r9 = "Error requesting application settings"
            com.google.android.gms.internal.ads.xp.Hw(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.e.DW(android.content.Context, com.google.android.gms.internal.ads.zzbbi, boolean, com.google.android.gms.internal.ads.cm, java.lang.String, java.lang.String, java.lang.Runnable):void");
    }

    public final void j6(Context context, zzbbi zzbbiVar, String str, Runnable runnable) {
        DW(context, zzbbiVar, true, null, str, null, runnable);
    }
}
