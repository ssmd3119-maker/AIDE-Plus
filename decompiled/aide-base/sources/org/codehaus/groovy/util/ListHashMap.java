package org.codehaus.groovy.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ListHashMap<K, V> implements Map<K, V> {
    private final Object[] WB;
    private Map<K, V> fY;
    private int jw;
    private final Object[] mb;
    private final int qp;

    public ListHashMap() {
        this(3);
    }

    private void DW() {
        int i = 0;
        for (Map.Entry<K, V> entry : this.fY.entrySet()) {
            this.WB[i] = entry.getKey();
            this.mb[i] = entry.getValue();
            i++;
        }
        this.jw = this.fY.size();
        this.fY = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<K, V> j6() {
        HashMap map = new HashMap();
        for (int i = 0; i < this.jw; i++) {
            map.put(this.WB[i], this.mb[i]);
        }
        return map;
    }

    @Override // java.util.Map
    public void clear() {
        this.fY = null;
        for (int i = 0; i < this.qp; i++) {
            this.mb[i] = null;
            this.WB[i] = null;
        }
        this.jw = 0;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (this.jw >= this.qp) {
            return this.fY.containsKey(obj);
        }
        for (int i = 0; i < this.jw; i++) {
            if (this.WB[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (this.jw >= this.qp) {
            return this.fY.containsValue(obj);
        }
        for (int i = 0; i < this.jw; i++) {
            if (this.mb[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Map<K, V> mapJ6 = this.fY;
        if (mapJ6 == null) {
            mapJ6 = j6();
        }
        return mapJ6.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        if (this.jw == 0) {
            return null;
        }
        Map<K, V> map = this.fY;
        if (map != null) {
            return map.get(obj);
        }
        for (int i = 0; i < this.jw; i++) {
            if (this.WB[i].equals(obj)) {
                return (V) this.mb[i];
            }
        }
        return null;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.jw == 0;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        Map<K, V> mapJ6 = this.fY;
        if (mapJ6 == null) {
            mapJ6 = j6();
        }
        return mapJ6.keySet();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        if (this.fY == null) {
            int i = 0;
            while (true) {
                int i2 = this.jw;
                if (i < i2) {
                    if (this.WB[i].equals(k)) {
                        Object[] objArr = this.mb;
                        V v2 = (V) objArr[i];
                        objArr[i] = v;
                        return v2;
                    }
                    i++;
                } else {
                    if (i2 < this.qp) {
                        this.WB[i2] = k;
                        this.mb[i2] = v;
                        this.jw = i2 + 1;
                        return null;
                    }
                    this.fY = j6();
                }
            }
        }
        V vPut = this.fY.put(k, v);
        this.jw = this.fY.size();
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        Map<K, V> map = this.fY;
        if (map != null) {
            V vRemove = map.remove(obj);
            int size = this.fY.size();
            this.jw = size;
            if (size <= this.qp) {
                DW();
            }
            return vRemove;
        }
        for (int i = 0; i < this.jw; i++) {
            if (this.WB[i].equals(obj)) {
                Object[] objArr = this.mb;
                V v = (V) objArr[i];
                int i2 = this.jw - 1;
                this.jw = i2;
                objArr[i] = objArr[i2];
                Object[] objArr2 = this.WB;
                objArr2[i] = objArr2[i2];
                return v;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public int size() {
        return this.jw;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        Map<K, V> map = this.fY;
        if (map != null) {
            return map.values();
        }
        ArrayList arrayList = new ArrayList(this.jw);
        for (int i = 0; i < this.jw; i++) {
            arrayList.add(this.mb[i]);
        }
        return arrayList;
    }

    public ListHashMap(int i) {
        this.jw = 0;
        this.WB = new Object[i];
        this.mb = new Object[i];
        this.qp = i;
    }
}
