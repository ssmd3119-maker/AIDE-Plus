package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class tm0 extends qm0 {
    private final String VH;
    private final Uri Zo;
    private final pm0 gn;
    private final an0 u7;

    public tm0(String str, long j, zzfs zzfsVar, String str2, zm0 zm0Var, List<nm0> list, String str3, long j2) {
        String string;
        super(str, -1L, zzfsVar, str2, zm0Var, list);
        this.Zo = Uri.parse(str2);
        long j3 = zm0Var.v5;
        this.gn = j3 <= 0 ? null : new pm0(null, zm0Var.Hw, j3);
        if (str != null) {
            String str4 = zzfsVar.WB;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str4).length());
            sb.append(str);
            sb.append(".");
            sb.append(str4);
            sb.append(".-1");
            string = sb.toString();
        } else {
            string = null;
        }
        this.VH = string;
        this.u7 = this.gn == null ? new an0(new pm0(null, 0L, -1L)) : null;
    }

    @Override // com.google.android.gms.internal.ads.qm0
    public final em0 EQ() {
        return this.u7;
    }

    @Override // com.google.android.gms.internal.ads.qm0
    public final String gn() {
        return this.VH;
    }

    @Override // com.google.android.gms.internal.ads.qm0
    public final pm0 tp() {
        return this.gn;
    }
}
