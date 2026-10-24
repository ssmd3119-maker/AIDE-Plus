package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class v6 extends h7<t8> implements d7, j7 {
    private k7 fY;
    private final cx jw;

    /* JADX WARN: Multi-variable type inference failed */
    public v6(Context context, zzbbi zzbbiVar) throws mv {
        try {
            cx cxVar = new cx(context, new c7(this));
            this.jw = cxVar;
            cxVar.setWillNotDraw(true);
            this.jw.addJavascriptInterface(new b7(this), "GoogleJsInterface");
            com.google.android.gms.ads.internal.w0.v5().J0(context, zzbbiVar.WB, this.jw.getSettings());
            super.J8(this);
        } catch (Throwable th) {
            throw new mv("Init failed.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.d7, com.google.android.gms.internal.ads.t7
    public final void DW(final String str) {
        ar.j6.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.y6
            private final v6 WB;
            private final String mb;

            {
                this.WB = this;
                this.mb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.aM(this.mb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void EQ(final String str) {
        ar.j6.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.x6
            private final v6 WB;
            private final String mb;

            {
                this.WB = this;
                this.mb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.j3(this.mb);
            }
        });
    }

    final /* synthetic */ void Mr(String str) {
        this.jw.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void QX(final String str) {
        ar.j6.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.w6
            private final v6 WB;
            private final String mb;

            {
                this.WB = this;
                this.mb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.Mr(this.mb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void VH(k7 k7Var) {
        this.fY = k7Var;
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void Ws(String str) {
        QX(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", str));
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final u8 Zo() {
        return new v8(this);
    }

    final /* synthetic */ void aM(String str) {
        this.jw.DW(str);
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void destroy() {
        this.jw.destroy();
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final boolean isDestroyed() {
        return this.jw.isDestroyed();
    }

    final /* synthetic */ void j3(String str) {
        this.jw.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.d7, com.google.android.gms.internal.ads.u6
    public final void j6(String str, JSONObject jSONObject) {
        e7.Hw(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.t7
    public final void tp(String str, JSONObject jSONObject) {
        e7.FH(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.u6
    public final void v5(String str, Map map) {
        e7.DW(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.d7
    public final void we(String str, String str2) {
        e7.j6(this, str, str2);
    }
}
