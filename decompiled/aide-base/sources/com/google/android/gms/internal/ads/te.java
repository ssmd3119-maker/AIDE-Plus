package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class te implements Callable<yl> {
    private static long Ws = 10;
    private final zzazs DW;
    private final com.google.android.gms.ads.internal.c0 FH;
    private final vb0 Hw;
    private final zl VH;
    private final d0 gn;
    private final Context j6;
    private final nf v5;
    private JSONObject we;
    private final Object Zo = new Object();
    private boolean u7 = false;
    private int tp = -2;
    private List<String> EQ = null;
    private String J0 = null;
    private String J8 = null;

    public te(Context context, com.google.android.gms.ads.internal.c0 c0Var, zzazs zzazsVar, vb0 vb0Var, zl zlVar, d0 d0Var) {
        this.j6 = context;
        this.FH = c0Var;
        this.DW = zzazsVar;
        this.VH = zlVar;
        this.Hw = vb0Var;
        this.gn = d0Var;
        this.v5 = c0Var.GB();
    }

    private static df DW(Context context, vb0 vb0Var, zl zlVar, d0 d0Var, com.google.android.gms.ads.internal.c0 c0Var) {
        return new df(context, vb0Var, zlVar, d0Var, c0Var);
    }

    private static cv EQ(vq<cv> vqVar) {
        try {
            return vqVar.get(((Integer) cw0.v5().FH(p.sT)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            xp.v5("", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException e2) {
            e = e2;
            xp.v5("", e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            xp.v5("", e);
            return null;
        } catch (TimeoutException e4) {
            e = e4;
            xp.v5("", e);
            return null;
        }
    }

    private final yl FH(j1 j1Var, boolean z) {
        int i;
        synchronized (this.Zo) {
            i = (j1Var == null && this.tp == -2) ? 0 : this.tp;
        }
        j1 j1Var2 = i != -2 ? null : j1Var;
        zl zlVar = this.VH;
        zzasi zzasiVar = zlVar.j6;
        zzwb zzwbVar = zzasiVar.jw;
        zzasm zzasmVar = zlVar.DW;
        return new yl(zzwbVar, null, zzasmVar.qp, i, zzasmVar.zh, this.EQ, zzasmVar.Z1, zzasmVar.q7, zzasiVar.w9, false, null, null, null, null, null, 0L, zlVar.Hw, zzasmVar.AL, zlVar.Zo, zlVar.VH, zzasmVar.kf, this.we, j1Var2, null, null, null, zzasmVar.a5, zzasmVar.ys, null, zzasmVar.Nh, this.J0, zlVar.u7, zzasmVar.Bx, zlVar.tp, z, zzasmVar.MP, zzasmVar.Of, this.J8, zzasmVar.AR);
    }

    static cv J8(vq<cv> vqVar) {
        try {
            return vqVar.get(((Integer) cw0.v5().FH(p.Lz)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            xp.v5("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException e2) {
            e = e2;
            xp.v5("Exception occurred while waiting for video to load", e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            xp.v5("Exception occurred while waiting for video to load", e);
            return null;
        } catch (TimeoutException e4) {
            e = e4;
            xp.v5("Exception occurred while waiting for video to load", e);
            return null;
        }
    }

    private final void QX(int i) {
        synchronized (this.Zo) {
            this.u7 = true;
            this.tp = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[Catch: Exception -> 0x0202, TimeoutException -> 0x0209, JSONException -> 0x0210, InterruptedException -> 0x0212, ExecutionException -> 0x0214, CancellationException -> 0x0216, TryCatch #2 {InterruptedException -> 0x0212, CancellationException -> 0x0216, ExecutionException -> 0x0214, TimeoutException -> 0x0209, JSONException -> 0x0210, Exception -> 0x0202, blocks: (B:3:0x0004, B:5:0x0010, B:8:0x002e, B:10:0x0034, B:13:0x003c, B:16:0x0046, B:18:0x005e, B:21:0x0071, B:26:0x007d, B:35:0x00af, B:39:0x00b9, B:41:0x00d3, B:43:0x00dd, B:45:0x00e5, B:48:0x00f1, B:67:0x0169, B:72:0x0175, B:82:0x01a3, B:84:0x01c1, B:85:0x01c7, B:87:0x01e1, B:89:0x01e5, B:90:0x01f4, B:81:0x019f, B:75:0x0185, B:76:0x018c, B:78:0x0192, B:49:0x00f8, B:51:0x0100, B:52:0x010a, B:54:0x0112, B:55:0x011c, B:57:0x0124, B:59:0x0141, B:60:0x0147, B:62:0x0157, B:64:0x0161, B:63:0x015c, B:65:0x0165, B:28:0x0083, B:30:0x0089, B:31:0x008e, B:33:0x009a, B:34:0x009f, B:15:0x0042), top: B:109:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[Catch: Exception -> 0x0202, TimeoutException -> 0x0209, JSONException -> 0x0210, InterruptedException -> 0x0212, ExecutionException -> 0x0214, CancellationException -> 0x0216, TryCatch #2 {InterruptedException -> 0x0212, CancellationException -> 0x0216, ExecutionException -> 0x0214, TimeoutException -> 0x0209, JSONException -> 0x0210, Exception -> 0x0202, blocks: (B:3:0x0004, B:5:0x0010, B:8:0x002e, B:10:0x0034, B:13:0x003c, B:16:0x0046, B:18:0x005e, B:21:0x0071, B:26:0x007d, B:35:0x00af, B:39:0x00b9, B:41:0x00d3, B:43:0x00dd, B:45:0x00e5, B:48:0x00f1, B:67:0x0169, B:72:0x0175, B:82:0x01a3, B:84:0x01c1, B:85:0x01c7, B:87:0x01e1, B:89:0x01e5, B:90:0x01f4, B:81:0x019f, B:75:0x0185, B:76:0x018c, B:78:0x0192, B:49:0x00f8, B:51:0x0100, B:52:0x010a, B:54:0x0112, B:55:0x011c, B:57:0x0124, B:59:0x0141, B:60:0x0147, B:62:0x0157, B:64:0x0161, B:63:0x015c, B:65:0x0165, B:28:0x0083, B:30:0x0089, B:31:0x008e, B:33:0x009a, B:34:0x009f, B:15:0x0042), top: B:109:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    @Override // java.util.concurrent.Callable
    /* renamed from: U2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.yl call() throws java.util.concurrent.ExecutionException, org.json.JSONException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.te.call():com.google.android.gms.internal.ads.yl");
    }

    private final vq<u0> VH(JSONObject jSONObject, boolean z, boolean z2) {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? jq.J0(new u0(null, Uri.parse(string), dOptDouble)) : this.DW.DW(string, new af(this, z, dOptDouble, zOptBoolean, string));
        }
        aM(0, z);
        return jq.J0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ws(b3 b3Var, String str) {
        try {
            m3 m3VarAq = this.FH.Aq(b3Var.vy());
            if (m3VarAq != null) {
                m3VarAq.lp(b3Var, str);
            }
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            xp.v5(sb.toString(), e);
        }
    }

    private final boolean a8() {
        boolean z;
        synchronized (this.Zo) {
            z = this.u7;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> List<V> j3(List<vq<V>> list) throws ExecutionException, InterruptedException {
        ArrayList arrayList = new ArrayList();
        Iterator<vq<V>> it = list.iterator();
        while (it.hasNext()) {
            V v = it.next().get();
            if (v != null) {
                arrayList.add(v);
            }
        }
        return arrayList;
    }

    private static Integer we(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    final /* synthetic */ vq Hw(String str, Object obj) {
        com.google.android.gms.ads.internal.w0.Zo();
        cv cvVarDW = iv.DW(this.j6, pw.DW(), "native-omid", false, false, this.Hw, this.VH.j6.cT, this.gn, null, this.FH.fY(), this.VH.u7);
        final er erVarVH = er.VH(cvVarDW);
        cvVarDW.AF().J8(new lw(erVarVH) { // from class: com.google.android.gms.internal.ads.ve
            private final er WB;

            {
                this.WB = erVarVH;
            }

            @Override // com.google.android.gms.internal.ads.lw
            public final void j6(boolean z) {
                this.WB.Zo();
            }
        });
        cvVarDW.loadData(str, "text/html", "UTF-8");
        return erVarVH;
    }

    public final vq<cv> J0(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return jq.J0(null);
        }
        if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("vast_xml"))) {
            xp.u7("Required field 'vast_xml' is missing");
            return jq.J0(null);
        }
        final df dfVarDW = DW(this.j6, this.Hw, this.VH, this.gn, this.FH);
        final boolean zEquals = "instream".equals(jSONObject.optString(AppMeasurement.Param.TYPE));
        final fr frVar = new fr();
        ar.j6.execute(new Runnable(dfVarDW, zEquals, jSONObjectOptJSONObject, frVar) { // from class: com.google.android.gms.internal.ads.ef
            private final df WB;
            private final fr fY;
            private final JSONObject jw;
            private final boolean mb;

            {
                this.WB = dfVarDW;
                this.mb = zEquals;
                this.jw = jSONObjectOptJSONObject;
                this.fY = frVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.gn(this.mb, this.jw, this.fY);
            }
        });
        return frVar;
    }

    public final vq<p0> XL(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return jq.J0(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("text");
        int iOptInt = jSONObjectOptJSONObject.optInt("text_size", -1);
        Integer numWe = we(jSONObjectOptJSONObject, "text_color");
        Integer numWe2 = we(jSONObjectOptJSONObject, "bg_color");
        int iOptInt2 = jSONObjectOptJSONObject.optInt("animation_ms", 1000);
        int iOptInt3 = jSONObjectOptJSONObject.optInt("presentation_ms", 4000);
        zzacp zzacpVar = this.VH.j6.Gj;
        int i = (zzacpVar == null || zzacpVar.WB < 2) ? 1 : zzacpVar.qp;
        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("allow_pub_rendering");
        List<vq<u0>> arrayList = new ArrayList<>();
        if (jSONObjectOptJSONObject.optJSONArray("images") != null) {
            arrayList = gn(jSONObjectOptJSONObject, "images", false, false, true);
        } else {
            arrayList.add(Zo(jSONObjectOptJSONObject, "image", false, false));
        }
        fr frVar = new fr();
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Iterator<vq<u0>> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().DW(new bf(atomicInteger, size, frVar, arrayList), zm.j6);
            arrayList = arrayList;
        }
        return jq.FH(frVar, new ze(this, strOptString, numWe2, numWe, iOptInt, iOptInt3, iOptInt2, i, zOptBoolean), zm.j6);
    }

    public final vq<u0> Zo(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return VH(jSONObject2, z, z2);
    }

    public final void aM(int i, boolean z) {
        if (z) {
            QX(i);
        }
    }

    public final List<vq<u0>> gn(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            aM(0, false);
            return arrayList;
        }
        int length = z3 ? jSONArrayOptJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(VH(jSONObject2, false, z2));
        }
        return arrayList;
    }

    public final Future<u0> u7(JSONObject jSONObject, String str, boolean z) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean zOptBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return VH(jSONObject2, zOptBoolean, z);
    }

    public final vq<cv> v5(final String str, final String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return jq.J0(null);
        }
        final df dfVarDW = DW(this.j6, this.Hw, this.VH, this.gn, this.FH);
        final fr frVar = new fr();
        final boolean z2 = true;
        ar.j6.execute(new Runnable(dfVarDW, z2, frVar, str, str2) { // from class: com.google.android.gms.internal.ads.ff
            private final df WB;
            private final String fY;
            private final fr jw;
            private final boolean mb = true;
            private final String qp;

            {
                this.WB = dfVarDW;
                this.jw = frVar;
                this.fY = str;
                this.qp = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.VH(this.mb, this.jw, this.fY, this.qp);
            }
        });
        return frVar;
    }
}
