package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.xp;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class e0 implements b0<Object> {
    private final f0 j6;

    public e0(f0 f0Var) {
        this.j6 = f0Var;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) throws NumberFormatException {
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat(map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            xp.Hw("Fail to parse float", e);
        }
        this.j6.vS(zEquals);
        this.j6.Mx(zEquals2, f);
    }
}
