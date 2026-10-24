package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class n6<K, V> implements Iterator<Map.Entry<K, V>> {
    private int WB;
    private final /* synthetic */ f6 fY;
    private Iterator<Map.Entry<K, V>> jw;
    private boolean mb;

    private n6(f6 f6Var) {
        this.fY = f6Var;
        this.WB = -1;
    }

    private final Iterator<Map.Entry<K, V>> j6() {
        if (this.jw == null) {
            this.jw = this.fY.jw.entrySet().iterator();
        }
        return this.jw;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WB + 1 < this.fY.mb.size() || (!this.fY.jw.isEmpty() && j6().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.mb = true;
        int i = this.WB + 1;
        this.WB = i;
        return i < this.fY.mb.size() ? (Map.Entry) this.fY.mb.get(this.WB) : j6().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.mb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.mb = false;
        this.fY.QX();
        if (this.WB >= this.fY.mb.size()) {
            j6().remove();
            return;
        }
        f6 f6Var = this.fY;
        int i = this.WB;
        this.WB = i - 1;
        f6Var.u7(i);
    }

    /* synthetic */ n6(f6 f6Var, g6 g6Var) {
        this(f6Var);
    }
}
