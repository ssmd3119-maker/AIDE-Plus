package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    MapCollections<K, V> AL;

    class a extends MapCollections<K, V> {
        public a() {
        }

        @Override // androidx.collection.MapCollections
        public Object DW(int i, int i2) {
            return ArrayMap.this.mb[(i << 1) + i2];
        }

        @Override // androidx.collection.MapCollections
        public Map<K, V> FH() {
            return ArrayMap.this;
        }

        @Override // androidx.collection.MapCollections
        public int Hw() {
            return ArrayMap.this.jw;
        }

        @Override // androidx.collection.MapCollections
        public void VH(K k, V v) {
            ArrayMap.this.put(k, v);
        }

        @Override // androidx.collection.MapCollections
        public int Zo(Object obj) {
            return ArrayMap.this.gn(obj);
        }

        @Override // androidx.collection.MapCollections
        public void gn(int i) {
            ArrayMap.this.tp(i);
        }

        @Override // androidx.collection.MapCollections
        public void j6() {
            ArrayMap.this.clear();
        }

        @Override // androidx.collection.MapCollections
        public V u7(int i, V v) {
            return ArrayMap.this.EQ(i, v);
        }

        @Override // androidx.collection.MapCollections
        public int v5(Object obj) {
            return ArrayMap.this.Zo(obj);
        }
    }

    public ArrayMap() {
    }

    private MapCollections<K, V> J0() {
        if (this.AL == null) {
            this.AL = new a();
        }
        return this.AL;
    }

    public boolean J8(Collection<?> collection) {
        return MapCollections.QX(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return J0().we();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return J0().J0();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        FH(this.jw + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return J0().J8();
    }

    public ArrayMap(int i) {
        super(i);
    }
}
