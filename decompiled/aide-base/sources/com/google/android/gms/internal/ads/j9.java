package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class j9<I, O> implements x8<I, O> {
    private final a9<I> DW;
    private final u7 FH;
    private final String Hw;
    private final z8<O> j6;

    j9(u7 u7Var, String str, a9<I> a9Var, z8<O> z8Var) {
        this.FH = u7Var;
        this.Hw = str;
        this.DW = a9Var;
        this.j6 = z8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hw(k8 k8Var, t8 t8Var, I i, fr<O> frVar) throws JSONException {
        try {
            com.google.android.gms.ads.internal.w0.v5();
            String strWB = bn.WB();
            com.google.android.gms.ads.internal.gmsg.m.Ws.j6(strWB, new m9(this, k8Var, frVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", strWB);
            jSONObject.put("args", this.DW.DW(i));
            t8Var.tp(this.Hw, jSONObject);
        } catch (Exception e) {
            try {
                frVar.Hw(e);
                xp.Hw("Unable to invokeJavaScript", e);
            } finally {
                k8Var.v5();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x8
    public final vq<O> DW(I i) {
        fr frVar = new fr();
        k8 k8VarGn = this.FH.gn(null);
        k8VarGn.j6(new k9(this, k8VarGn, i, frVar), new l9(this, frVar, k8VarGn));
        return frVar;
    }

    @Override // com.google.android.gms.internal.ads.eq
    public final vq<O> j6(@Nullable I i) {
        return DW(i);
    }
}
