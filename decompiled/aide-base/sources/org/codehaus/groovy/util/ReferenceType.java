package org.codehaus.groovy.util;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public enum ReferenceType {
    SOFT { // from class: org.codehaus.groovy.util.ReferenceType.1
        @Override // org.codehaus.groovy.util.ReferenceType
        protected <T, V extends Finalizable> Reference<T, V> j6(T t, V v, ReferenceQueue referenceQueue) {
            return new SoftRef(t, v, referenceQueue);
        }
    },
    WEAK { // from class: org.codehaus.groovy.util.ReferenceType.2
        @Override // org.codehaus.groovy.util.ReferenceType
        protected <T, V extends Finalizable> Reference<T, V> j6(T t, V v, ReferenceQueue referenceQueue) {
            return new WeakRef(t, v, referenceQueue);
        }
    },
    PHANTOM { // from class: org.codehaus.groovy.util.ReferenceType.3
        @Override // org.codehaus.groovy.util.ReferenceType
        protected <T, V extends Finalizable> Reference<T, V> j6(T t, V v, ReferenceQueue referenceQueue) {
            return new PhantomRef(t, v, referenceQueue);
        }
    },
    HARD { // from class: org.codehaus.groovy.util.ReferenceType.4
        @Override // org.codehaus.groovy.util.ReferenceType
        protected <T, V extends Finalizable> Reference<T, V> j6(T t, V v, ReferenceQueue referenceQueue) {
            return new HardRef(t, v, referenceQueue);
        }
    };

    private static class HardRef<TT, V extends Finalizable> implements Reference<TT, V> {
        private final V DW;
        private TT j6;

        public HardRef(TT tt, V v, ReferenceQueue<? super TT> referenceQueue) {
            this.j6 = tt;
            this.DW = v;
        }

        @Override // org.codehaus.groovy.util.Reference
        public void clear() {
            this.j6 = null;
        }

        @Override // org.codehaus.groovy.util.Reference
        public TT get() {
            return this.j6;
        }

        @Override // org.codehaus.groovy.util.Reference
        public V getHandler() {
            return this.DW;
        }
    }

    private static class PhantomRef<TT, V extends Finalizable> extends PhantomReference<TT> implements Reference<TT, V> {
        private final V j6;

        public PhantomRef(TT tt, V v, ReferenceQueue<? super TT> referenceQueue) {
            super(tt, referenceQueue);
            this.j6 = v;
        }

        @Override // org.codehaus.groovy.util.Reference
        public V getHandler() {
            return this.j6;
        }
    }

    private static class SoftRef<TT, V extends Finalizable> extends SoftReference<TT> implements Reference<TT, V> {
        private final V j6;

        public SoftRef(TT tt, V v, ReferenceQueue<? super TT> referenceQueue) {
            super(tt, referenceQueue);
            this.j6 = v;
        }

        @Override // org.codehaus.groovy.util.Reference
        public V getHandler() {
            return this.j6;
        }
    }

    private static class WeakRef<TT, V extends Finalizable> extends WeakReference<TT> implements Reference<TT, V> {
        private final V j6;

        public WeakRef(TT tt, V v, ReferenceQueue<? super TT> referenceQueue) {
            super(tt, referenceQueue);
            this.j6 = v;
        }

        @Override // org.codehaus.groovy.util.Reference
        public V getHandler() {
            return this.j6;
        }
    }

    protected abstract <T, V extends Finalizable> Reference<T, V> j6(T t, V v, ReferenceQueue referenceQueue);
}
