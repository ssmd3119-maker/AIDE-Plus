package org.codehaus.groovy.util;

/* loaded from: classes.dex */
public abstract class LazyReference<T> extends LockableObject {
    private static final ManagedReference fY;
    private static final ManagedReference qp;
    private final ReferenceBundle jw;
    private ManagedReference<T> mb = fY;

    static {
        ReferenceManager referenceManager = null;
        fY = new ManagedReference(ReferenceType.HARD, referenceManager, referenceManager) { // from class: org.codehaus.groovy.util.LazyReference.1
        };
        qp = new ManagedReference(ReferenceType.HARD, referenceManager, referenceManager) { // from class: org.codehaus.groovy.util.LazyReference.2
        };
    }

    public LazyReference(ReferenceBundle referenceBundle) {
        this.jw = referenceBundle;
    }

    private T Hw(boolean z) {
        j6();
        try {
            ManagedReference<T> managedReference = this.mb;
            if (!z && managedReference != fY) {
                return managedReference.Zo();
            }
            T tV5 = v5();
            if (tV5 == null) {
                this.mb = qp;
            } else {
                this.mb = new ManagedReference<>(this.jw, tV5);
            }
            return tV5;
        } finally {
            DW();
        }
    }

    public T FH() {
        ManagedReference<T> managedReference = this.mb;
        if (managedReference == fY) {
            return Hw(false);
        }
        if (managedReference == qp) {
            return null;
        }
        T tZo = managedReference.Zo();
        return tZo == null ? Hw(true) : tZo;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public String toString() {
        T tZo = this.mb.Zo();
        return tZo == null ? "<null>" : tZo.toString();
    }

    public abstract T v5();
}
