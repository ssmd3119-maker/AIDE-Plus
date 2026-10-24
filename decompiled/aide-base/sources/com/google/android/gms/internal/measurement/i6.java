package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i6 extends o6 {
    private final /* synthetic */ f6 mb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private i6(f6 f6Var) {
        super(f6Var, null);
        this.mb = f6Var;
    }

    @Override // com.google.android.gms.internal.measurement.o6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new h6(this.mb, null);
    }

    /* synthetic */ i6(f6 f6Var, g6 g6Var) {
        this(f6Var);
    }
}
