package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class m1 implements com.google.android.gms.ads.internal.gmsg.b0<Object> {
    private final String DW;
    private final WeakReference<i1> j6;

    public m1(i1 i1Var, String str) {
        this.j6 = new WeakReference<>(i1Var);
        this.DW = str;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) {
        i1 i1Var;
        String str = map.get("ads_id");
        String str2 = map.get("eventName");
        if (TextUtils.isEmpty(str) || !this.DW.equals(str)) {
            return;
        }
        if ("_ai".equals(str2)) {
            i1 i1Var2 = this.j6.get();
            if (i1Var2 != null) {
                i1Var2.dY();
                return;
            }
            return;
        }
        if (!"_ac".equals(str2) || (i1Var = this.j6.get()) == null) {
            return;
        }
        i1Var.yx();
    }
}
