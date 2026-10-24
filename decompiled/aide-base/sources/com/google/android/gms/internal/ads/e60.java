package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e60<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> WB;

    public e60(Iterator<Map.Entry<K, Object>> it) {
        this.WB = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WB.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.WB.next();
        return next.getValue() instanceof b60 ? new d60(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.WB.remove();
    }
}
