package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class v8 implements d7, u8 {
    private final t8 WB;
    private final HashSet<AbstractMap.SimpleEntry<String, com.google.android.gms.ads.internal.gmsg.b0<? super t8>>> mb = new HashSet<>();

    public v8(t8 t8Var) {
        this.WB = t8Var;
    }

    @Override // com.google.android.gms.internal.ads.d7, com.google.android.gms.internal.ads.t7
    public final void DW(String str) {
        this.WB.DW(str);
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void g3(String str, com.google.android.gms.ads.internal.gmsg.b0<? super t8> b0Var) {
        this.WB.g3(str, b0Var);
        this.mb.remove(new AbstractMap.SimpleEntry(str, b0Var));
    }

    @Override // com.google.android.gms.internal.ads.d7, com.google.android.gms.internal.ads.u6
    public final void j6(String str, JSONObject jSONObject) {
        e7.Hw(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void sh(String str, com.google.android.gms.ads.internal.gmsg.b0<? super t8> b0Var) {
        this.WB.sh(str, b0Var);
        this.mb.add(new AbstractMap.SimpleEntry<>(str, b0Var));
    }

    @Override // com.google.android.gms.internal.ads.t7
    public final void tp(String str, JSONObject jSONObject) {
        e7.FH(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.u8
    public final void u7() {
        Iterator<AbstractMap.SimpleEntry<String, com.google.android.gms.ads.internal.gmsg.b0<? super t8>>> it = this.mb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, com.google.android.gms.ads.internal.gmsg.b0<? super t8>> next = it.next();
            String strValueOf = String.valueOf(next.getValue().toString());
            sm.we(strValueOf.length() != 0 ? "Unregistering eventhandler: ".concat(strValueOf) : new String("Unregistering eventhandler: "));
            this.WB.g3(next.getKey(), next.getValue());
        }
        this.mb.clear();
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
