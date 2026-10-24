package com.google.android.gms.internal.measurement;

import java.util.Map;

/* loaded from: classes.dex */
public final class q4<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, n4> WB;

    private q4(Map.Entry<K, n4> entry) {
        this.WB = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.WB.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.WB.getValue() == null) {
            return null;
        }
        n4.v5();
        throw null;
    }

    public final n4 j6() {
        return this.WB.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof l5) {
            return this.WB.getValue().DW((l5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
