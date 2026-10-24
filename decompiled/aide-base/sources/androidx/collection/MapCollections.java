package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class MapCollections<K, V> {
    MapCollections<K, V>.c DW;
    MapCollections<K, V>.e FH;
    MapCollections<K, V>.b j6;

    final class a<T> implements Iterator<T> {
        final int WB;
        boolean fY = false;
        int jw;
        int mb;

        public a(int i) {
            this.WB = i;
            this.mb = MapCollections.this.Hw();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.jw < this.mb;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) MapCollections.this.DW(this.jw, this.WB);
            this.jw++;
            this.fY = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.fY) {
                throw new IllegalStateException();
            }
            int i = this.jw - 1;
            this.jw = i;
            this.mb--;
            this.fY = false;
            MapCollections.this.gn(i);
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            j6((Map.Entry) obj);
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iHw = MapCollections.this.Hw();
            for (Map.Entry<K, V> entry : collection) {
                MapCollections.this.VH(entry.getKey(), entry.getValue());
            }
            return iHw != MapCollections.this.Hw();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            MapCollections.this.j6();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iV5 = MapCollections.this.v5(entry.getKey());
            if (iV5 < 0) {
                return false;
            }
            return ContainerHelpers.DW(MapCollections.this.DW(iV5, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return MapCollections.EQ(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iHw = MapCollections.this.Hw() - 1; iHw >= 0; iHw--) {
                Object objDW = MapCollections.this.DW(iHw, 0);
                Object objDW2 = MapCollections.this.DW(iHw, 1);
                iHashCode += (objDW == null ? 0 : objDW.hashCode()) ^ (objDW2 == null ? 0 : objDW2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.Hw() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean j6(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return MapCollections.this.Hw();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            MapCollections.this.j6();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return MapCollections.this.v5(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return MapCollections.tp(MapCollections.this.FH(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return MapCollections.EQ(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iHw = MapCollections.this.Hw() - 1; iHw >= 0; iHw--) {
                Object objDW = MapCollections.this.DW(iHw, 0);
                iHashCode += objDW == null ? 0 : objDW.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.Hw() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iV5 = MapCollections.this.v5(obj);
            if (iV5 < 0) {
                return false;
            }
            MapCollections.this.gn(iV5);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return MapCollections.Ws(MapCollections.this.FH(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return MapCollections.QX(MapCollections.this.FH(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return MapCollections.this.Hw();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return MapCollections.this.XL(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapCollections.this.aM(tArr, 0);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        int WB;
        boolean jw = false;
        int mb = -1;

        public d() {
            this.WB = MapCollections.this.Hw() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.jw) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return ContainerHelpers.DW(entry.getKey(), MapCollections.this.DW(this.mb, 0)) && ContainerHelpers.DW(entry.getValue(), MapCollections.this.DW(this.mb, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.jw) {
                return (K) MapCollections.this.DW(this.mb, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.jw) {
                return (V) MapCollections.this.DW(this.mb, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mb < this.WB;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.jw) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objDW = MapCollections.this.DW(this.mb, 0);
            Object objDW2 = MapCollections.this.DW(this.mb, 1);
            return (objDW == null ? 0 : objDW.hashCode()) ^ (objDW2 != null ? objDW2.hashCode() : 0);
        }

        public Map.Entry<K, V> j6() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.mb++;
            this.jw = true;
            return this;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            j6();
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.jw) {
                throw new IllegalStateException();
            }
            MapCollections.this.gn(this.mb);
            this.mb--;
            this.WB--;
            this.jw = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.jw) {
                return (V) MapCollections.this.u7(this.mb, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            MapCollections.this.j6();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return MapCollections.this.Zo(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.Hw() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iZo = MapCollections.this.Zo(obj);
            if (iZo < 0) {
                return false;
            }
            MapCollections.this.gn(iZo);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iHw = MapCollections.this.Hw();
            int i = 0;
            boolean z = false;
            while (i < iHw) {
                if (collection.contains(MapCollections.this.DW(i, 1))) {
                    MapCollections.this.gn(i);
                    i--;
                    iHw--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iHw = MapCollections.this.Hw();
            int i = 0;
            boolean z = false;
            while (i < iHw) {
                if (!collection.contains(MapCollections.this.DW(i, 1))) {
                    MapCollections.this.gn(i);
                    i--;
                    iHw--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return MapCollections.this.Hw();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return MapCollections.this.XL(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapCollections.this.aM(tArr, 1);
        }
    }

    public static <T> boolean EQ(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean QX(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean Ws(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean tp(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Object DW(int i, int i2);

    public abstract Map<K, V> FH();

    public abstract int Hw();

    public Set<K> J0() {
        if (this.DW == null) {
            this.DW = new c();
        }
        return this.DW;
    }

    public Collection<V> J8() {
        if (this.FH == null) {
            this.FH = new e();
        }
        return this.FH;
    }

    public abstract void VH(K k, V v);

    public Object[] XL(int i) {
        int iHw = Hw();
        Object[] objArr = new Object[iHw];
        for (int i2 = 0; i2 < iHw; i2++) {
            objArr[i2] = DW(i2, i);
        }
        return objArr;
    }

    public abstract int Zo(Object obj);

    public <T> T[] aM(T[] tArr, int i) {
        int iHw = Hw();
        if (tArr.length < iHw) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iHw));
        }
        for (int i2 = 0; i2 < iHw; i2++) {
            tArr[i2] = DW(i2, i);
        }
        if (tArr.length > iHw) {
            tArr[iHw] = null;
        }
        return tArr;
    }

    public abstract void gn(int i);

    public abstract void j6();

    public abstract V u7(int i, V v);

    public abstract int v5(Object obj);

    public Set<Map.Entry<K, V>> we() {
        if (this.j6 == null) {
            this.j6 = new b();
        }
        return this.j6;
    }
}
