package com.google.firebase.components;

import abcd.nx;

/* loaded from: classes.dex */
public final class q<T> implements nx<T> {
    private static final Object FH = new Object();
    private volatile nx<T> DW;
    private volatile Object j6 = FH;

    q(c<T> cVar, b bVar) {
        this.DW = r.j6(cVar, bVar);
    }

    @Override // abcd.nx
    public final T get() {
        T t = (T) this.j6;
        if (t == FH) {
            synchronized (this) {
                t = (T) this.j6;
                if (t == FH) {
                    t = this.DW.get();
                    this.j6 = t;
                    this.DW = null;
                }
            }
        }
        return t;
    }
}
