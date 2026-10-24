package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.zzaso;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class t1 {
    private boolean DW;
    private jl FH;
    private zzaso Hw;
    private final Context j6;

    public t1(Context context, jl jlVar, zzaso zzasoVar) {
        this.j6 = context;
        this.FH = jlVar;
        this.Hw = zzasoVar;
        if (zzasoVar == null) {
            this.Hw = new zzaso();
        }
    }

    private final boolean FH() {
        jl jlVar = this.FH;
        return (jlVar != null && jlVar.v5().k2) || this.Hw.WB;
    }

    public final void DW(String str) {
        List<String> list;
        if (FH()) {
            if (str == null) {
                str = "";
            }
            jl jlVar = this.FH;
            if (jlVar != null) {
                jlVar.VH(str, null, 3);
                return;
            }
            zzaso zzasoVar = this.Hw;
            if (!zzasoVar.WB || (list = zzasoVar.mb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    w0.v5();
                    bn.Mz(this.j6, "", strReplace);
                }
            }
        }
    }

    public final boolean Hw() {
        return !FH() || this.DW;
    }

    public final void j6() {
        this.DW = true;
    }
}
