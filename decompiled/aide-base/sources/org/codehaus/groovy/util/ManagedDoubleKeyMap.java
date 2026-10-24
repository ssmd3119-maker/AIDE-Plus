package org.codehaus.groovy.util;

import org.codehaus.groovy.util.AbstractConcurrentDoubleKeyMap;

/* loaded from: classes.dex */
public class ManagedDoubleKeyMap<K1, K2, V> extends AbstractConcurrentDoubleKeyMap<K1, K2, V> {

    public static class Entry<K1, K2, V> implements AbstractConcurrentDoubleKeyMap.Entry<K1, K2, V> {
        final Ref<K1> DW;
        final Ref<K2> FH;
        private final int j6;

        @Override // org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public int Hw() {
            return this.j6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public V getValue() {
            return this;
        }

        @Override // org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public boolean j6() {
            return (this.DW.Zo() == null || this.FH.Zo() == null) ? false : true;
        }

        @Override // org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public void setValue(V v) {
        }
    }

    private static class EntryWithValue<K1, K2, V> extends Entry<K1, K2, V> {
        private V Hw;

        @Override // org.codehaus.groovy.util.ManagedDoubleKeyMap.Entry, org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public V getValue() {
            return this.Hw;
        }

        @Override // org.codehaus.groovy.util.ManagedDoubleKeyMap.Entry, org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry
        public void setValue(V v) {
            this.Hw = v;
        }
    }

    static class Ref<K> extends ManagedReference<K> {
    }

    static class Segment<K1, K2, V> extends AbstractConcurrentDoubleKeyMap.Segment<K1, K2, V> {
        public Segment(ReferenceBundle referenceBundle, int i) {
            super(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.codehaus.groovy.util.AbstractConcurrentMapBase
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public AbstractConcurrentDoubleKeyMap.Segment<K1, K2, V> j6(Object obj, int i) {
        return new Segment((ReferenceBundle) obj, i);
    }
}
