package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class d60<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, b60> WB;

    private d60(Map.Entry<K, b60> entry) {
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
        b60.v5();
        throw null;
    }

    public final b60 j6() {
        return this.WB.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof z60) {
            return this.WB.getValue().Hw((z60) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
