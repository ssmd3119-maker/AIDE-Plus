package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

@jg
/* loaded from: classes.dex */
public final class ks {
    private final ss DW;
    private final ViewGroup FH;
    private es Hw;
    private final Context j6;

    public ks(Context context, ViewGroup viewGroup, cv cvVar) {
        this(context, viewGroup, cvVar, null);
    }

    public final void DW() {
        com.google.android.gms.common.internal.p.Hw("onPause must be called from the UI thread.");
        es esVar = this.Hw;
        if (esVar != null) {
            esVar.EQ();
        }
    }

    public final void FH(int i, int i2, int i3, int i4, int i5, boolean z, rs rsVar) {
        if (this.Hw != null) {
            return;
        }
        v.j6(this.DW.pN().FH(), this.DW.QO(), "vpr2");
        Context context = this.j6;
        ss ssVar = this.DW;
        es esVar = new es(context, ssVar, i5, z, ssVar.pN().FH(), rsVar);
        this.Hw = esVar;
        this.FH.addView(esVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.Hw.BT(i, i2, i3, i4);
        this.DW.e9(false);
    }

    public final es Hw() {
        com.google.android.gms.common.internal.p.Hw("getAdVideoUnderlay must be called from the UI thread.");
        return this.Hw;
    }

    public final void j6() {
        com.google.android.gms.common.internal.p.Hw("onDestroy must be called from the UI thread.");
        es esVar = this.Hw;
        if (esVar != null) {
            esVar.tp();
            this.FH.removeView(this.Hw);
            this.Hw = null;
        }
    }

    public final void v5(int i, int i2, int i3, int i4) {
        com.google.android.gms.common.internal.p.Hw("The underlay may only be modified from the UI thread.");
        es esVar = this.Hw;
        if (esVar != null) {
            esVar.BT(i, i2, i3, i4);
        }
    }

    private ks(Context context, ViewGroup viewGroup, ss ssVar, es esVar) {
        this.j6 = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.FH = viewGroup;
        this.DW = ssVar;
        this.Hw = null;
    }
}
