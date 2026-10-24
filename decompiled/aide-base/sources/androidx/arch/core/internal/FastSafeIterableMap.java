package androidx.arch.core.internal;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;

/* loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    private HashMap<K, SafeIterableMap.d<K, V>> qp = new HashMap<>();

    public boolean contains(K k) {
        return this.qp.containsKey(k);
    }
}
