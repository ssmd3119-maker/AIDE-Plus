package com.google.android.gms.ads.internal;

import abcd.wu;
import abcd.xu;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.na;
import com.google.android.gms.internal.ads.nx0;
import com.google.android.gms.internal.ads.rk;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.zzazc;
import com.google.android.gms.internal.ads.zzbbi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class y extends nx0 {
    private static final Object fY = new Object();

    @GuardedBy("sLock")
    private static y qp;
    private final Context WB;
    private zzbbi jw;
    private boolean mb = false;

    private y(Context context, zzbbi zzbbiVar) {
        this.WB = context;
        this.jw = zzbbiVar;
    }

    public static y Mt(Context context, zzbbi zzbbiVar) {
        y yVar;
        synchronized (fY) {
            if (qp == null) {
                qp = new y(context.getApplicationContext(), zzbbiVar);
            }
            yVar = qp;
        }
        return yVar;
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void AV(String str, wu wuVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.internal.ads.p.j6(this.WB);
        boolean zBooleanValue = ((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.oh)).booleanValue() | ((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.FN)).booleanValue();
        Runnable runnable = null;
        if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.FN)).booleanValue()) {
            zBooleanValue = true;
            final Runnable runnable2 = (Runnable) xu.g3(wuVar);
            runnable = new Runnable(this, runnable2) { // from class: com.google.android.gms.ads.internal.z
                private final y WB;
                private final Runnable mb;

                {
                    this.WB = this;
                    this.mb = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ar.j6.execute(new Runnable(this.WB, this.mb) { // from class: com.google.android.gms.ads.internal.b0
                        private final y WB;
                        private final Runnable mb;

                        {
                            this.WB = yVar;
                            this.mb = runnable;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.WB.k6(this.mb);
                        }
                    });
                }
            };
        }
        if (zBooleanValue) {
            w0.J0().j6(this.WB, this.jw, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void CA(String str) {
        com.google.android.gms.internal.ads.p.j6(this.WB);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.oh)).booleanValue()) {
            w0.J0().j6(this.WB, this.jw, str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final String Cp() {
        return this.jw.WB;
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final float F0() {
        return w0.tp().v5();
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void KC(float f) {
        w0.tp().DW(f);
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void PH(wu wuVar, String str) {
        if (wuVar == null) {
            xp.j6("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) xu.g3(wuVar);
        if (context == null) {
            xp.j6("Context is null. Failed to open debug menu.");
            return;
        }
        zzazc zzazcVar = new zzazc(context);
        zzazcVar.j6(str);
        zzazcVar.we(this.jw.WB);
        zzazcVar.DW();
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void a5() {
        synchronized (fY) {
            if (this.mb) {
                xp.u7("Mobile ads is initialized already.");
                return;
            }
            this.mb = true;
            com.google.android.gms.internal.ads.p.j6(this.WB);
            w0.u7().we(this.WB, this.jw);
            w0.EQ().FH(this.WB);
        }
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void ep(String str) {
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void gk(ka kaVar) {
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void jH(boolean z) {
        w0.tp().j6(z);
    }

    final /* synthetic */ void k6(Runnable runnable) {
        Context context = this.WB;
        com.google.android.gms.common.internal.p.Hw("Adapters must be initialized on the main thread.");
        Map<String, u9> mapV5 = w0.u7().a8().j6().v5();
        if (mapV5 == null || mapV5.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                xp.v5("Could not initialize rewarded ads.", th);
                return;
            }
        }
        ij ijVarCZ = ij.CZ();
        if (ijVarCZ != null) {
            Collection<u9> collectionValues = mapV5.values();
            HashMap map = new HashMap();
            wu wuVarSy = xu.sy(context);
            Iterator<u9> it = collectionValues.iterator();
            while (it.hasNext()) {
                for (t9 t9Var : it.next().j6) {
                    String str = t9Var.EQ;
                    for (String str2 : t9Var.FH) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) map.get(str2)).add(str);
                        }
                    }
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    rk rkVarSe = ijVarCZ.se(str3);
                    if (rkVarSe != null) {
                        na naVarJ6 = rkVarSe.j6();
                        if (!naVarJ6.isInitialized() && naVarJ6.mm()) {
                            naVarJ6.aa(wuVarSy, rkVarSe.DW(), (List) entry.getValue());
                            String strValueOf = String.valueOf(str3);
                            xp.VH(strValueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(strValueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (Throwable th2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    xp.v5(sb.toString(), th2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final boolean uF() {
        return w0.tp().Zo();
    }
}
