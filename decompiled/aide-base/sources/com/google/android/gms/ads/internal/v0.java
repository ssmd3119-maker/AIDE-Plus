package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class v0 {
    private final Map<String, String> DW = new TreeMap();
    private String FH;
    private String Hw;
    private final String j6;

    public v0(String str) {
        this.j6 = str;
    }

    public final void DW(zzwb zzwbVar, zzbbi zzbbiVar) {
        this.FH = zzwbVar.hK.WB;
        Bundle bundle = zzwbVar.Z1;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) cw0.v5().FH(com.google.android.gms.internal.ads.p.wE);
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.Hw = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.DW.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.DW.put("SDKVersion", zzbbiVar.WB);
    }

    public final String FH() {
        return this.Hw;
    }

    public final String Hw() {
        return this.j6;
    }

    public final String j6() {
        return this.FH;
    }

    public final Map<String, String> v5() {
        return this.DW;
    }
}
