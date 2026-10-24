package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class tu0 {
    private final Set<bq0<?>> DW;
    private final PriorityBlockingQueue<bq0<?>> FH;
    private final PriorityBlockingQueue<bq0<?>> Hw;
    private final b VH;
    private final zk0 Zo;
    private final am0[] gn;
    private final AtomicInteger j6;
    private final List<nv0> tp;
    private bc0 u7;
    private final to v5;

    private tu0(to toVar, zk0 zk0Var, int i, b bVar) {
        this.j6 = new AtomicInteger();
        this.DW = new HashSet();
        this.FH = new PriorityBlockingQueue<>();
        this.Hw = new PriorityBlockingQueue<>();
        this.tp = new ArrayList();
        this.v5 = toVar;
        this.Zo = zk0Var;
        this.gn = new am0[4];
        this.VH = bVar;
    }

    public final <T> bq0<T> DW(bq0<T> bq0Var) {
        bq0Var.tp(this);
        synchronized (this.DW) {
            this.DW.add(bq0Var);
        }
        bq0Var.Zo(this.j6.incrementAndGet());
        bq0Var.Mr("add-to-queue");
        if (bq0Var.KD()) {
            this.FH.add(bq0Var);
            return bq0Var;
        }
        this.Hw.add(bq0Var);
        return bq0Var;
    }

    final <T> void FH(bq0<T> bq0Var) {
        synchronized (this.DW) {
            this.DW.remove(bq0Var);
        }
        synchronized (this.tp) {
            Iterator<nv0> it = this.tp.iterator();
            while (it.hasNext()) {
                it.next().j6(bq0Var);
            }
        }
    }

    public final void j6() {
        bc0 bc0Var = this.u7;
        if (bc0Var != null) {
            bc0Var.DW();
        }
        for (am0 am0Var : this.gn) {
            if (am0Var != null) {
                am0Var.DW();
            }
        }
        bc0 bc0Var2 = new bc0(this.FH, this.Hw, this.v5, this.VH);
        this.u7 = bc0Var2;
        bc0Var2.start();
        for (int i = 0; i < this.gn.length; i++) {
            am0 am0Var2 = new am0(this.Hw, this.Zo, this.v5, this.VH);
            this.gn[i] = am0Var2;
            am0Var2.start();
        }
    }

    private tu0(to toVar, zk0 zk0Var, int i) {
        this(toVar, zk0Var, 4, new eh0(new Handler(Looper.getMainLooper())));
    }

    public tu0(to toVar, zk0 zk0Var) {
        this(toVar, zk0Var, 4);
    }
}
