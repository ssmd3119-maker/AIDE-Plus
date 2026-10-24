package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class hq0 implements pq0 {
    private final Context Hw;
    private final u7 Zo;
    private final zzbbi v5;
    private final Object j6 = new Object();
    private final WeakHashMap<yl, iq0> DW = new WeakHashMap<>();
    private final ArrayList<iq0> FH = new ArrayList<>();

    public hq0(Context context, zzbbi zzbbiVar) {
        this.Hw = context.getApplicationContext();
        this.v5 = zzbbiVar;
        this.Zo = new u7(context.getApplicationContext(), zzbbiVar, (String) cw0.v5().FH(p.j6));
    }

    private final boolean Zo(yl ylVar) {
        boolean z;
        synchronized (this.j6) {
            iq0 iq0Var = this.DW.get(ylVar);
            z = iq0Var != null && iq0Var.Mr();
        }
        return z;
    }

    public final void DW(zzwf zzwfVar, yl ylVar) {
        FH(zzwfVar, ylVar, ylVar.DW.getView());
    }

    public final void FH(zzwf zzwfVar, yl ylVar, View view) {
        v5(zzwfVar, ylVar, new oq0(view, ylVar), null);
    }

    public final void Hw(zzwf zzwfVar, yl ylVar, View view, cv cvVar) {
        v5(zzwfVar, ylVar, new oq0(view, ylVar), cvVar);
    }

    public final void VH(yl ylVar) {
        synchronized (this.j6) {
            iq0 iq0Var = this.DW.get(ylVar);
            if (iq0Var != null) {
                iq0Var.aM();
            }
        }
    }

    public final void gn(yl ylVar) {
        synchronized (this.j6) {
            iq0 iq0Var = this.DW.get(ylVar);
            if (iq0Var != null) {
                iq0Var.Hw();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pq0
    public final void j6(iq0 iq0Var) {
        synchronized (this.j6) {
            if (!iq0Var.Mr()) {
                this.FH.remove(iq0Var);
                Iterator<Map.Entry<yl, iq0>> it = this.DW.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue() == iq0Var) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void tp(yl ylVar) {
        synchronized (this.j6) {
            iq0 iq0Var = this.DW.get(ylVar);
            if (iq0Var != null) {
                iq0Var.FH();
            }
        }
    }

    public final void u7(yl ylVar) {
        synchronized (this.j6) {
            iq0 iq0Var = this.DW.get(ylVar);
            if (iq0Var != null) {
                iq0Var.DW();
            }
        }
    }

    public final void v5(zzwf zzwfVar, yl ylVar, tr0 tr0Var, cv cvVar) {
        iq0 iq0Var;
        synchronized (this.j6) {
            if (Zo(ylVar)) {
                iq0Var = this.DW.get(ylVar);
            } else {
                iq0 iq0Var2 = new iq0(this.Hw, zzwfVar, ylVar, this.v5, tr0Var);
                iq0Var2.gn(this);
                this.DW.put(ylVar, iq0Var2);
                this.FH.add(iq0Var2);
                iq0Var = iq0Var2;
            }
            if (cvVar != null) {
                iq0Var.u7(new qq0(iq0Var, cvVar));
            } else {
                iq0Var.u7(new uq0(iq0Var, this.Zo, this.Hw));
            }
        }
    }
}
