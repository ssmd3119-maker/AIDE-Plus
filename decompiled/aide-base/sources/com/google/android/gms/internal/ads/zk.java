package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zk implements jl {
    private static List<Future<Void>> J8 = Collections.synchronizedList(new ArrayList());
    private static ScheduledExecutorService Ws = Executors.newSingleThreadScheduledExecutor();

    @GuardedBy("mLock")
    private final LinkedHashMap<String, ea0> DW;
    private boolean VH;
    private final ll Zo;
    private final zzawo gn;

    @GuardedBy("mLock")
    private final y90 j6;
    private final ml u7;
    private final Context v5;

    @GuardedBy("mLock")
    private final List<String> FH = new ArrayList();

    @GuardedBy("mLock")
    private final List<String> Hw = new ArrayList();
    private final Object tp = new Object();
    private HashSet<String> EQ = new HashSet<>();
    private boolean we = false;
    private boolean J0 = false;

    public zk(Context context, zzbbi zzbbiVar, zzawo zzawoVar, String str, ll llVar) {
        com.google.android.gms.common.internal.p.tp(zzawoVar, "SafeBrowsing config is not present.");
        this.v5 = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.DW = new LinkedHashMap<>();
        this.Zo = llVar;
        this.gn = zzawoVar;
        Iterator<String> it = zzawoVar.qp.iterator();
        while (it.hasNext()) {
            this.EQ.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        this.EQ.remove("cookie".toLowerCase(Locale.ENGLISH));
        y90 y90Var = new y90();
        y90Var.FH = 8;
        y90Var.v5 = str;
        y90Var.Zo = str;
        z90 z90Var = new z90();
        y90Var.gn = z90Var;
        z90Var.FH = this.gn.WB;
        fa0 fa0Var = new fa0();
        fa0Var.FH = zzbbiVar.WB;
        fa0Var.v5 = Boolean.valueOf(com.google.android.gms.common.wrappers.b.j6(this.v5).VH());
        long jDW = com.google.android.gms.common.c.VH().DW(this.v5);
        if (jDW > 0) {
            fa0Var.Hw = Long.valueOf(jDW);
        }
        y90Var.aM = fa0Var;
        this.j6 = y90Var;
        this.u7 = new ml(this.v5, this.gn.AL, this);
    }

    private final ea0 J0(String str) {
        ea0 ea0Var;
        synchronized (this.tp) {
            ea0Var = this.DW.get(str);
        }
        return ea0Var;
    }

    static final /* synthetic */ Void J8(String str) {
        return null;
    }

    private final vq<Void> QX() {
        vq<Void> vqVarFH;
        if (!((this.VH && this.gn.zh) || (this.J0 && this.gn.k2) || (!this.VH && this.gn.fY))) {
            return jq.J0(null);
        }
        synchronized (this.tp) {
            this.j6.u7 = new ea0[this.DW.size()];
            this.DW.values().toArray(this.j6.u7);
            this.j6.j3 = (String[]) this.FH.toArray(new String[0]);
            this.j6.Mr = (String[]) this.Hw.toArray(new String[0]);
            if (il.j6()) {
                String str = this.j6.v5;
                String str2 = this.j6.tp;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (ea0 ea0Var : this.j6.u7) {
                    sb2.append("    [");
                    sb2.append(ea0Var.EQ.length);
                    sb2.append("] ");
                    sb2.append(ea0Var.Hw);
                }
                il.DW(sb2.toString());
            }
            vq<String> vqVarJ6 = new zzazs(this.v5).j6(1, this.gn.mb, null, p90.VH(this.j6));
            if (il.j6()) {
                vqVarJ6.DW(new el(this), zm.j6);
            }
            vqVarFH = jq.FH(vqVarJ6, bl.j6, ar.DW);
        }
        return vqVarFH;
    }

    @Override // com.google.android.gms.internal.ads.jl
    public final void EQ(String str) {
        synchronized (this.tp) {
            this.j6.tp = str;
        }
    }

    final void FH(String str) {
        synchronized (this.tp) {
            this.FH.add(str);
        }
    }

    final void Hw(String str) {
        synchronized (this.tp) {
            this.Hw.add(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: all -> 0x00c6, TryCatch #0 {, blocks: (B:7:0x0007, B:8:0x0009, B:11:0x0013, B:12:0x0021, B:14:0x0023, B:17:0x004d, B:18:0x005a, B:20:0x0060, B:21:0x0066, B:23:0x006c, B:25:0x0075, B:27:0x007b, B:29:0x0084, B:32:0x0093, B:34:0x00ac, B:35:0x00b2, B:36:0x00bf, B:37:0x00c4), top: B:44:0x0007, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.jl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void VH(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.tp
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L9
            r2 = 1
            r6.J0 = r2     // Catch: java.lang.Throwable -> Lc6
        L9:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.ea0> r2 = r6.DW     // Catch: java.lang.Throwable -> Lc6
            boolean r2 = r2.containsKey(r7)     // Catch: java.lang.Throwable -> Lc6
            if (r2 == 0) goto L23
            if (r9 != r1) goto L21
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.ea0> r8 = r6.DW     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r7 = r8.get(r7)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.ea0 r7 = (com.google.android.gms.internal.ads.ea0) r7     // Catch: java.lang.Throwable -> Lc6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lc6
            r7.tp = r8     // Catch: java.lang.Throwable -> Lc6
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc6
            return
        L23:
            com.google.android.gms.internal.ads.ea0 r1 = new com.google.android.gms.internal.ads.ea0     // Catch: java.lang.Throwable -> Lc6
            r1.<init>()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lc6
            r1.tp = r9     // Catch: java.lang.Throwable -> Lc6
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.ea0> r9 = r6.DW     // Catch: java.lang.Throwable -> Lc6
            int r9 = r9.size()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lc6
            r1.FH = r9     // Catch: java.lang.Throwable -> Lc6
            r1.Hw = r7     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.ba0 r9 = new com.google.android.gms.internal.ads.ba0     // Catch: java.lang.Throwable -> Lc6
            r9.<init>()     // Catch: java.lang.Throwable -> Lc6
            r1.v5 = r9     // Catch: java.lang.Throwable -> Lc6
            java.util.HashSet<java.lang.String> r9 = r6.EQ     // Catch: java.lang.Throwable -> Lc6
            int r9 = r9.size()     // Catch: java.lang.Throwable -> Lc6
            if (r9 <= 0) goto Lbf
            if (r8 == 0) goto Lbf
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc6
            r9.<init>()     // Catch: java.lang.Throwable -> Lc6
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lc6
        L5a:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Lc6
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r3 = r2.getKey()     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            if (r3 == 0) goto L73
            java.lang.Object r3 = r2.getKey()     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            goto L75
        L73:
            java.lang.String r3 = ""
        L75:
            java.lang.Object r4 = r2.getValue()     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            if (r4 == 0) goto L82
            java.lang.Object r2 = r2.getValue()     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            goto L84
        L82:
            java.lang.String r2 = ""
        L84:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.util.HashSet<java.lang.String> r5 = r6.EQ     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            boolean r4 = r5.contains(r4)     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            if (r4 != 0) goto L93
            goto L5a
        L93:
            com.google.android.gms.internal.ads.aa0 r4 = new com.google.android.gms.internal.ads.aa0     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            r4.<init>()     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            r4.FH = r3     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            r4.Hw = r2     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            r9.add(r4)     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            goto L5a
        Lac:
            java.lang.String r2 = "Cannot convert string to bytes, skip header."
            com.google.android.gms.internal.ads.il.DW(r2)     // Catch: java.lang.Throwable -> Lc6
            goto L5a
        Lb2:
            int r8 = r9.size()     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.aa0[] r8 = new com.google.android.gms.internal.ads.aa0[r8]     // Catch: java.lang.Throwable -> Lc6
            r9.toArray(r8)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.ba0 r9 = r1.v5     // Catch: java.lang.Throwable -> Lc6
            r9.Hw = r8     // Catch: java.lang.Throwable -> Lc6
        Lbf:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.ea0> r8 = r6.DW     // Catch: java.lang.Throwable -> Lc6
            r8.put(r7, r1)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc6
            return
        Lc6:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc6
            goto Lca
        Lc9:
            throw r7
        Lca:
            goto Lc9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zk.VH(java.lang.String, java.util.Map, int):void");
    }

    final /* synthetic */ vq Ws(Map map) {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.tp) {
                            int length = jSONArrayOptJSONArray.length();
                            ea0 ea0VarJ0 = J0(str);
                            if (ea0VarJ0 == null) {
                                String strValueOf = String.valueOf(str);
                                il.DW(strValueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(strValueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                ea0VarJ0.EQ = new String[length];
                                for (int i = 0; i < length; i++) {
                                    ea0VarJ0.EQ[i] = jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                this.VH = (length > 0) | this.VH;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) cw0.v5().FH(p.eN)).booleanValue()) {
                    xp.FH("Failed to get SafeBrowsing metadata", e);
                }
                return jq.we(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.VH) {
            synchronized (this.tp) {
                this.j6.FH = 9;
            }
        }
        return QX();
    }

    @Override // com.google.android.gms.internal.ads.jl
    public final void Zo() {
        synchronized (this.tp) {
            vq vqVarDW = jq.DW(this.Zo.j6(this.v5, this.DW.keySet()), new eq(this) { // from class: com.google.android.gms.internal.ads.al
                private final zk j6;

                {
                    this.j6 = this;
                }

                @Override // com.google.android.gms.internal.ads.eq
                public final vq j6(Object obj) {
                    return this.j6.Ws((Map) obj);
                }
            }, ar.DW);
            vq vqVarJ6 = jq.j6(vqVarDW, 10L, TimeUnit.SECONDS, Ws);
            jq.VH(vqVarDW, new dl(this, vqVarJ6), ar.DW);
            J8.add(vqVarJ6);
        }
    }

    @Override // com.google.android.gms.internal.ads.jl
    public final void gn() {
    }

    @Override // com.google.android.gms.internal.ads.jl
    public final void tp(View view) {
        if (this.gn.jw && !this.we) {
            com.google.android.gms.ads.internal.w0.v5();
            Bitmap bitmapFN = bn.FN(view);
            if (bitmapFN == null) {
                il.DW("Failed to capture the webview bitmap.");
            } else {
                this.we = true;
                bn.x9(new cl(this, bitmapFN));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jl
    public final boolean u7() {
        return com.google.android.gms.common.util.o.Zo() && this.gn.jw && !this.we;
    }

    @Override // com.google.android.gms.internal.ads.jl
    public final zzawo v5() {
        return this.gn;
    }

    @Override // com.google.android.gms.internal.ads.jl
    public final String[] we(String[] strArr) {
        return (String[]) this.u7.j6(strArr).toArray(new String[0]);
    }
}
