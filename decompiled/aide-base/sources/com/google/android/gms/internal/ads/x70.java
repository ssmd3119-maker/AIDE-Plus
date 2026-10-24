package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class x70 extends d80 {
    private final /* synthetic */ u70 mb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private x70(u70 u70Var) {
        super(u70Var, null);
        this.mb = u70Var;
    }

    @Override // com.google.android.gms.internal.ads.d80, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new w70(this.mb, null);
    }

    /* synthetic */ x70(u70 u70Var, v70 v70Var) {
        this(u70Var);
    }
}
