package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r4<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> WB;

    public r4(Iterator<Map.Entry<K, Object>> it) {
        this.WB = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WB.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.WB.next();
        return next.getValue() instanceof n4 ? new q4(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.WB.remove();
    }
}
