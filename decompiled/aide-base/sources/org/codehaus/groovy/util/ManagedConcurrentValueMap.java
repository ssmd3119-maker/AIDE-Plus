package org.codehaus.groovy.util;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ManagedConcurrentValueMap<K, V> {
    private final ConcurrentHashMap<K, ManagedReference<V>> j6;

    /* renamed from: org.codehaus.groovy.util.ManagedConcurrentValueMap$1, reason: invalid class name */
    public class AnonymousClass1 extends ManagedReference<V> {
        final /* synthetic */ Object Hw;
        final /* synthetic */ ManagedConcurrentValueMap v5;

        @Override // org.codehaus.groovy.util.ManagedReference, org.codehaus.groovy.util.Finalizable
        public void DW() {
            super.DW();
            this.v5.j6.remove(this.Hw, Zo());
        }
    }
}
