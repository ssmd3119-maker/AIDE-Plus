package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class u70<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int WB;
    private boolean fY;
    private Map<K, V> jw;
    private Map<K, V> k2;
    private List<b80> mb;
    private volatile d80 qp;
    private volatile x70 zh;

    private u70(int i) {
        this.WB = i;
        this.mb = Collections.emptyList();
        this.jw = Collections.emptyMap();
        this.k2 = Collections.emptyMap();
    }

    private final int DW(K k) {
        int size = this.mb.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo((Comparable) this.mb.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo((Comparable) this.mb.get(i2).getKey());
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    private final SortedMap<K, V> EQ() {
        tp();
        if (this.jw.isEmpty() && !(this.jw instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.jw = treeMap;
            this.k2 = treeMap.descendingMap();
        }
        return (SortedMap) this.jw;
    }

    static <FieldDescriptorType extends j50<FieldDescriptorType>> u70<FieldDescriptorType, Object> Ws(int i) {
        return new v70(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V XL(int i) {
        tp();
        V v = (V) this.mb.remove(i).getValue();
        if (!this.jw.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = EQ().entrySet().iterator();
            this.mb.add(new b80(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tp() {
        if (this.fY) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        tp();
        int iDW = DW(k);
        if (iDW >= 0) {
            return (V) this.mb.get(iDW).setValue(v);
        }
        tp();
        if (this.mb.isEmpty() && !(this.mb instanceof ArrayList)) {
            this.mb = new ArrayList(this.WB);
        }
        int i = -(iDW + 1);
        if (i >= this.WB) {
            return EQ().put(k, v);
        }
        int size = this.mb.size();
        int i2 = this.WB;
        if (size == i2) {
            b80 b80VarRemove = this.mb.remove(i2 - 1);
            EQ().put((Comparable) b80VarRemove.getKey(), b80VarRemove.getValue());
        }
        this.mb.add(i, new b80(this, k, v));
        return null;
    }

    public final Map.Entry<K, V> QX(int i) {
        return this.mb.get(i);
    }

    public final int VH() {
        return this.mb.size();
    }

    public void Zo() {
        if (this.fY) {
            return;
        }
        this.jw = this.jw.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.jw);
        this.k2 = this.k2.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.k2);
        this.fY = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        tp();
        if (!this.mb.isEmpty()) {
            this.mb.clear();
        }
        if (this.jw.isEmpty()) {
            return;
        }
        this.jw.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return DW(comparable) >= 0 || this.jw.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.qp == null) {
            this.qp = new d80(this, null);
        }
        return this.qp;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u70)) {
            return super.equals(obj);
        }
        u70 u70Var = (u70) obj;
        int size = size();
        if (size != u70Var.size()) {
            return false;
        }
        int iVH = VH();
        if (iVH != u70Var.VH()) {
            return entrySet().equals(u70Var.entrySet());
        }
        for (int i = 0; i < iVH; i++) {
            if (!QX(i).equals(u70Var.QX(i))) {
                return false;
            }
        }
        if (iVH != size) {
            return this.jw.equals(u70Var.jw);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iDW = DW(comparable);
        return iDW >= 0 ? (V) this.mb.get(iDW).getValue() : this.jw.get(comparable);
    }

    public final Iterable<Map.Entry<K, V>> gn() {
        return this.jw.isEmpty() ? y70.j6() : this.jw.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iVH = VH();
        int iHashCode = 0;
        for (int i = 0; i < iVH; i++) {
            iHashCode += this.mb.get(i).hashCode();
        }
        return this.jw.size() > 0 ? iHashCode + this.jw.hashCode() : iHashCode;
    }

    public final boolean j6() {
        return this.fY;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        tp();
        Comparable comparable = (Comparable) obj;
        int iDW = DW(comparable);
        if (iDW >= 0) {
            return XL(iDW);
        }
        if (this.jw.isEmpty()) {
            return null;
        }
        return this.jw.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.mb.size() + this.jw.size();
    }

    final Set<Map.Entry<K, V>> u7() {
        if (this.zh == null) {
            this.zh = new x70(this, null);
        }
        return this.zh;
    }

    /* synthetic */ u70(int i, v70 v70Var) {
        this(i);
    }
}
