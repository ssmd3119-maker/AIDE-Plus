package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class de0 implements ds0 {
    private final bc0 DW;
    private final Map<String, List<bq0<?>>> j6 = new HashMap();

    de0(bc0 bc0Var) {
        this.DW = bc0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean Hw(bq0<?> bq0Var) {
        String strYS = bq0Var.yS();
        if (!this.j6.containsKey(strYS)) {
            this.j6.put(strYS, null);
            bq0Var.J0(this);
            if (e4.DW) {
                e4.j6("new request, sending to network %s", strYS);
            }
            return false;
        }
        List<bq0<?>> arrayList = this.j6.get(strYS);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        bq0Var.Mr("waiting-for-response");
        arrayList.add(bq0Var);
        this.j6.put(strYS, arrayList);
        if (e4.DW) {
            e4.j6("Request for cacheKey=%s is in flight, putting on hold.", strYS);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ds0
    public final void DW(bq0<?> bq0Var, iw0<?> iw0Var) {
        List<bq0<?>> listRemove;
        ab0 ab0Var = iw0Var.DW;
        if (ab0Var == null || ab0Var.j6()) {
            j6(bq0Var);
            return;
        }
        String strYS = bq0Var.yS();
        synchronized (this) {
            listRemove = this.j6.remove(strYS);
        }
        if (listRemove != null) {
            if (e4.DW) {
                e4.FH("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), strYS);
            }
            Iterator<bq0<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.DW.fY.DW(it.next(), iw0Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ds0
    public final synchronized void j6(bq0<?> bq0Var) {
        String strYS = bq0Var.yS();
        List<bq0<?>> listRemove = this.j6.remove(strYS);
        if (listRemove != null && !listRemove.isEmpty()) {
            if (e4.DW) {
                e4.FH("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), strYS);
            }
            bq0<?> bq0VarRemove = listRemove.remove(0);
            this.j6.put(strYS, listRemove);
            bq0VarRemove.J0(this);
            try {
                this.DW.mb.put(bq0VarRemove);
            } catch (InterruptedException e) {
                e4.DW("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.DW.DW();
            }
        }
    }
}
