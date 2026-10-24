package com.google.firebase.components;

import abcd.ix;
import abcd.jx;
import abcd.kx;
import abcd.lx;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class o implements kx, lx {
    private final Executor FH;
    private final Map<Class<?>, ConcurrentHashMap<jx<Object>, Executor>> j6 = new HashMap();
    private Queue<ix<?>> DW = new ArrayDeque();

    o(Executor executor) {
        this.FH = executor;
    }

    private synchronized Set<Map.Entry<jx<Object>, Executor>> Hw(ix<?> ixVar) {
        ConcurrentHashMap<jx<Object>, Executor> concurrentHashMap = this.j6.get(ixVar.DW());
        if (concurrentHashMap == null) {
            return Collections.emptySet();
        }
        return concurrentHashMap.entrySet();
    }

    @Override // abcd.lx
    public synchronized <T> void DW(Class<T> cls, Executor executor, jx<? super T> jxVar) {
        com.google.android.gms.common.internal.p.u7(cls);
        com.google.android.gms.common.internal.p.u7(jxVar);
        com.google.android.gms.common.internal.p.u7(executor);
        if (!this.j6.containsKey(cls)) {
            this.j6.put(cls, new ConcurrentHashMap<>());
        }
        this.j6.get(cls).put(jxVar, executor);
    }

    public void FH(ix<?> ixVar) {
        com.google.android.gms.common.internal.p.u7(ixVar);
        synchronized (this) {
            if (this.DW != null) {
                this.DW.add(ixVar);
                return;
            }
            for (Map.Entry<jx<Object>, Executor> entry : Hw(ixVar)) {
                entry.getValue().execute(p.j6(entry, ixVar));
            }
        }
    }

    @Override // abcd.lx
    public <T> void j6(Class<T> cls, jx<? super T> jxVar) {
        DW(cls, this.FH, jxVar);
    }

    final void v5() {
        Queue<ix<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.DW != null) {
                Queue<ix<?>> queue2 = this.DW;
                this.DW = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            Iterator<ix<?>> it = queue.iterator();
            while (it.hasNext()) {
                FH(it.next());
            }
        }
    }
}
