package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.t1;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.hd;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.wc;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yc;
import com.google.android.gms.internal.ads.zc;
import java.util.Map;
import org.json.JSONException;

@jg
/* loaded from: classes.dex */
public final class b implements b0<cv> {
    private static final Map<String, Integer> Hw = com.google.android.gms.common.util.f.v5(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final wc DW;
    private final hd FH;
    private final t1 j6;

    public b(t1 t1Var, wc wcVar, hd hdVar) {
        this.j6 = t1Var;
        this.DW = wcVar;
        this.FH = hdVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(cv cvVar, Map map) throws JSONException {
        t1 t1Var;
        cv cvVar2 = cvVar;
        int iIntValue = Hw.get((String) map.get("a")).intValue();
        if (iIntValue != 5 && iIntValue != 7 && (t1Var = this.j6) != null && !t1Var.Hw()) {
            this.j6.DW(null);
            return;
        }
        if (iIntValue == 1) {
            this.DW.tp(map);
            return;
        }
        if (iIntValue == 3) {
            new zc(cvVar2, map).VH();
            return;
        }
        if (iIntValue == 4) {
            new sc(cvVar2, map).gn();
            return;
        }
        if (iIntValue == 5) {
            new yc(cvVar2, map).j6();
            return;
        }
        if (iIntValue == 6) {
            this.DW.J0(true);
        } else if (iIntValue != 7) {
            xp.gn("Unknown MRAID command called.");
        } else if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.cn)).booleanValue()) {
            this.FH.Jz();
        }
    }
}
