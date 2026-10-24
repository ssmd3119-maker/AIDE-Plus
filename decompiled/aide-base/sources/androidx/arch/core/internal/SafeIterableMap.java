package androidx.arch.core.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    private d<K, V> WB;
    private d<K, V> mb;
    private WeakHashMap<Object<K, V>, Boolean> jw = new WeakHashMap<>();
    private int fY = 0;

    static class b<K, V> extends f<K, V> {
        public b(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.f
        public d<K, V> j6(d<K, V> dVar) {
            return dVar.WB;
        }
    }

    private static class c<K, V> extends f<K, V> {
        public c(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.f
        public d<K, V> j6(d<K, V> dVar) {
            return dVar.mb;
        }
    }

    static class d<K, V> implements Map.Entry<K, V> {
        d<K, V> WB;
        d<K, V> mb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<K, V>] */
    public class e implements Iterator<Map.Entry<K, V>> {
        private d<K, V> WB;
        private boolean mb;

        private e() {
            this.mb = true;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.mb) {
                return SafeIterableMap.this.WB != null;
            }
            d<K, V> dVar = this.WB;
            return (dVar == null || dVar.WB == null) ? false : true;
        }

        @Override // java.util.Iterator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.mb) {
                this.mb = false;
                this.WB = SafeIterableMap.this.WB;
            } else {
                d<K, V> dVar = this.WB;
                this.WB = dVar != null ? dVar.WB : null;
            }
            return this.WB;
        }
    }

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<K, V>] */
    private static abstract class f<K, V> implements Iterator<Map.Entry<K, V>> {
        d<K, V> WB;
        d<K, V> mb;

        public f(d<K, V> dVar, d<K, V> dVar2) {
            this.WB = dVar2;
            this.mb = dVar;
        }

        private d<K, V> FH() {
            d<K, V> dVar = this.mb;
            d<K, V> dVar2 = this.WB;
            if (dVar == dVar2 || dVar2 == null) {
                return null;
            }
            return j6(dVar);
        }

        @Override // java.util.Iterator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            d<K, V> dVar = this.mb;
            this.mb = FH();
            return dVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mb != null;
        }

        public abstract d<K, V> j6(d<K, V> dVar);
    }

    public Iterator<Map.Entry<K, V>> DW() {
        c cVar = new c(this.mb, this.WB);
        this.jw.put(cVar, Boolean.FALSE);
        return cVar;
    }

    public Map.Entry<K, V> Hw() {
        return this.WB;
    }

    public Map.Entry<K, V> VH() {
        return this.mb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        b bVar = new b(this.WB, this.mb);
        this.jw.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public int size() {
        return this.fY;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public SafeIterableMap<K, V>.e v5() {
        SafeIterableMap<K, V>.e eVar = new e();
        this.jw.put(eVar, Boolean.FALSE);
        return eVar;
    }
}
