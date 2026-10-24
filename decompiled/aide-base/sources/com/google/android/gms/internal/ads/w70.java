package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class w70<K, V> implements Iterator<Map.Entry<K, V>> {
    private int WB;
    private final /* synthetic */ u70 jw;
    private Iterator<Map.Entry<K, V>> mb;

    private w70(u70 u70Var) {
        this.jw = u70Var;
        this.WB = this.jw.mb.size();
    }

    private final Iterator<Map.Entry<K, V>> j6() {
        if (this.mb == null) {
            this.mb = this.jw.k2.entrySet().iterator();
        }
        return this.mb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.WB;
        return (i > 0 && i <= this.jw.mb.size()) || j6().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (j6().hasNext()) {
            return j6().next();
        }
        List list = this.jw.mb;
        int i = this.WB - 1;
        this.WB = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ w70(u70 u70Var, v70 v70Var) {
        this(u70Var);
    }
}
