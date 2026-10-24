package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzazs {
    private static final Object DW = new Object();
    private static tu0 j6;

    public zzazs(Context context) {
        FH(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    private static tu0 FH(Context context) {
        tu0 tu0Var;
        tu0 tu0Var2;
        synchronized (DW) {
            if (j6 == null) {
                p.j6(context);
                if (((Boolean) cw0.v5().FH(p.k1)).booleanValue()) {
                    tu0Var2 = go.Hw(context);
                } else {
                    tu0Var2 = new tu0(new eb(new File(context.getCacheDir(), "volley")), new b8((a7) new zg()));
                    tu0Var2.j6();
                }
                j6 = tu0Var2;
            }
            tu0Var = j6;
        }
        return tu0Var;
    }

    @Deprecated
    public final <T> vq<T> DW(String str, ro<T> roVar) {
        fr frVar = new fr();
        j6.DW(new vo(str, frVar));
        return jq.Hw(jq.FH(frVar, new oo(this, roVar), zm.j6), Throwable.class, new no(this, roVar), ar.DW);
    }

    public final vq<String> Hw(String str, Map<String, String> map) {
        return j6(0, str, map, null);
    }

    public final vq<String> j6(int i, String str, Map<String, String> map, byte[] bArr) throws IOException {
        so soVar = new so(null);
        po poVar = new po(this, str, soVar);
        qp qpVar = new qp(null);
        qo qoVar = new qo(this, i, str, soVar, poVar, bArr, map, qpVar);
        if (qp.j6()) {
            try {
                qpVar.Zo(str, "GET", qoVar.j6(), qoVar.vy());
            } catch (a e) {
                xp.u7(e.getMessage());
            }
        }
        j6.DW(qoVar);
        return soVar;
    }
}
