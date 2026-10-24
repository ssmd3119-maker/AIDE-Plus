package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class o80 implements Iterator<String> {
    private Iterator<String> WB;
    private final /* synthetic */ m80 mb;

    o80(m80 m80Var) {
        this.mb = m80Var;
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
