package org.codehaus.groovy.util;

import org.codehaus.groovy.util.AbstractConcurrentMap;

/* loaded from: classes.dex */
public class ManagedConcurrentMap<K, V> extends AbstractConcurrentMap<K, V> {

    public static class Entry<K, V> extends ManagedReference<K> implements AbstractConcurrentMap.Entry<K, V> {
        private int Hw;

        public Entry(ReferenceBundle referenceBundle, Segment segment, K k, int i) {
            super(referenceBundle, k);
            this.Hw = i;
        }

        @Override // org.codehaus.groovy.util.AbstractConcurrentMap.Entry
        public boolean FH(K k, int i) {
            return this.Hw == i && Zo() == k;
        }

        @Override // org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public int Hw() {
            return this.Hw;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public V getValue() {
            return this;
        }

        @Override // org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public boolean j6() {
            return Zo() != null;
        }

        @Override // org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public void setValue(V v) {
        }
    }

    public static class EntryWithValue<K, V> extends Entry<K, V> {
        private V v5;

        public EntryWithValue(ReferenceBundle referenceBundle, Segment segment, K k, int i, V v) {
            super(referenceBundle, segment, k, i);
            setValue(v);
        }

        @Override // org.codehaus.groovy.util.ManagedConcurrentMap.Entry, org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public V getValue() {
            return this.v5;
        }

        @Override // org.codehaus.groovy.util.ManagedConcurrentMap.Entry, org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public void setValue(V v) {
            this.v5 = v;
        }
    }

    public static class Segment<K, V> extends AbstractConcurrentMap.Segment<K, V> {
        protected final ReferenceBundle qp;

        public Segment(ReferenceBundle referenceBundle, int i) {
            super(i);
            this.qp = referenceBundle;
            if (referenceBundle == null) {
                throw new IllegalArgumentException("bundle must not be null");
            }
        }

        @Override // org.codehaus.groovy.util.AbstractConcurrentMap.Segment
        protected AbstractConcurrentMap.Entry<K, V> Zo(K k, int i, V v) {
            if (this.qp != null) {
                return new EntryWithValue(this.qp, this, k, i, v);
            }
            throw new IllegalArgumentException("bundle must not be null");
        }
    }

    public ManagedConcurrentMap(ReferenceBundle referenceBundle) {
        super(referenceBundle);
        if (referenceBundle == null) {
            throw new IllegalArgumentException("bundle must not be null");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.codehaus.groovy.util.AbstractConcurrentMapBase
    /* renamed from: gn */
    public Segment<K, V> j6(Object obj, int i) {
        ReferenceBundle referenceBundle = (ReferenceBundle) obj;
        if (referenceBundle != null) {
            return new Segment<>(referenceBundle, i);
        }
        throw new IllegalArgumentException("bundle must not be null");
    }
}
