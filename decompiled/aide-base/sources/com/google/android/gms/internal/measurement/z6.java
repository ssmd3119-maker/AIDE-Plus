package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class z6 implements Iterator<String> {
    private Iterator<String> WB;
    private final /* synthetic */ x6 mb;

    z6(x6 x6Var) {
        this.mb = x6Var;
        this.WB = this.mb.WB.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WB.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.WB.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
