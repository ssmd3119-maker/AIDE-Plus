package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes.dex */
public final class ra0<E> implements Iterator<E> {
    private int WB = 0;
    private final /* synthetic */ qa0 mb;

    ra0(qa0 qa0Var) {
        this.mb = qa0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WB < this.mb.WB.size() || this.mb.mb.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        while (this.WB >= this.mb.WB.size()) {
            qa0 qa0Var = this.mb;
            qa0Var.WB.add(qa0Var.mb.next());
        }
        List<E> list = this.mb.WB;
        int i = this.WB;
        this.WB = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
