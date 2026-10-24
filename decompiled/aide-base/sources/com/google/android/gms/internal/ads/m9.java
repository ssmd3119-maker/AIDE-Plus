package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m9 implements com.google.android.gms.ads.internal.gmsg.f {
    private final fr DW;
    private final /* synthetic */ j9 FH;
    private final k8 j6;

    public m9(j9 j9Var, k8 k8Var, fr frVar) {
        this.FH = j9Var;
        this.j6 = k8Var;
        this.DW = frVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.f
    public final void DW(JSONObject jSONObject) {
        try {
            try {
                this.DW.FH(this.FH.j6.j6(jSONObject));
                this.j6.v5();
            } catch (IllegalStateException unused) {
                this.j6.v5();
            } catch (JSONException e) {
                this.DW.FH(e);
                this.j6.v5();
            }
        } catch (Throwable th) {
            this.j6.v5();
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.f
    public final void j6(@Nullable String str) {
        try {
            if (str == null) {
                this.DW.Hw(new w8());
            } else {
                this.DW.Hw(new w8(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.j6.v5();
        }
    }
}
