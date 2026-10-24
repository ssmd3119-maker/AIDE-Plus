package org.codehaus.groovy.util;

/* loaded from: classes.dex */
public class ManagedReference<T> implements Finalizable {
    private static final ReferenceManager FH = new ReferenceManager(null) { // from class: org.codehaus.groovy.util.ManagedReference.1
    };
    private final ReferenceManager DW;
    private final Reference<T, ManagedReference<T>> j6;

    public ManagedReference(ReferenceType referenceType, ReferenceManager referenceManager, T t) {
        referenceManager = referenceManager == null ? FH : referenceManager;
        this.DW = referenceManager;
        Reference<T, ManagedReference<T>> referenceJ6 = referenceType.j6(t, this, referenceManager.v5());
        this.j6 = referenceJ6;
        referenceManager.j6(referenceJ6);
    }

    @Override // org.codehaus.groovy.util.Finalizable
    public void DW() {
        v5();
    }

    public final T Zo() {
        return this.j6.get();
    }

    public final void v5() {
        this.j6.clear();
        this.DW.Zo();
    }

    public ManagedReference(ReferenceBundle referenceBundle, T t) {
        this(referenceBundle.FH(), referenceBundle.j6(), t);
    }
}
