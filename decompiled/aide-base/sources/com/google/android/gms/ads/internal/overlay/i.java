package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.w0;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.om;

@jg
/* loaded from: classes.dex */
public final class i extends om {
    final /* synthetic */ c fY;

    private i(c cVar) {
        this.fY = cVar;
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void gn() {
        Bitmap bitmapJ6 = w0.yS().j6(Integer.valueOf(this.fY.mb.Q6.k2));
        if (bitmapJ6 != null) {
            jn jnVarVH = w0.VH();
            c cVar = this.fY;
            Activity activity = cVar.WB;
            zzaq zzaqVar = cVar.mb.Q6;
            bn.gn.post(new j(this, jnVarVH.Hw(activity, bitmapJ6, zzaqVar.fY, zzaqVar.qp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
    }

    /* synthetic */ i(c cVar, e eVar) {
        this(cVar);
    }
}
