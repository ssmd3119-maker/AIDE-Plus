package org.codehaus.groovy.util;

import java.util.Iterator;

/* loaded from: classes.dex */
public class ManagedLinkedList<T> {
    private ManagedLinkedList<T>.Element<T> DW;
    private ManagedLinkedList<T>.Element<T> j6;

    private final class Element<V> extends ManagedReference<V> {
        Element Hw;
        final /* synthetic */ ManagedLinkedList Zo;
        Element v5;

        @Override // org.codehaus.groovy.util.ManagedReference, org.codehaus.groovy.util.Finalizable
        public void DW() {
            Element element = this.v5;
            if (element != null && element.Hw != null) {
                element.Hw = this.Hw;
            }
            Element element2 = this.Hw;
            if (element2 != null && element2.v5 != null) {
                element2.v5 = this.v5;
            }
            if (this == this.Zo.DW) {
                this.Zo.DW = this.Hw;
            }
            this.Hw = null;
            if (this == this.Zo.j6) {
                this.Zo.j6 = this.v5;
            }
            this.v5 = null;
            super.DW();
        }
    }

    private final class Iter implements Iterator<T> {
        private ManagedLinkedList<T>.Element<T> WB;
        private boolean mb;

        @Override // java.util.Iterator
        public boolean hasNext() {
            ManagedLinkedList<T>.Element<T> element = this.WB;
            if (element == null) {
                return false;
            }
            return this.mb ? element.Hw != null : element != null;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.mb) {
                this.WB = this.WB.Hw;
            }
            this.mb = true;
            ManagedLinkedList<T>.Element<T> element = this.WB;
            if (element == null) {
                return null;
            }
            return element.Zo();
        }

        @Override // java.util.Iterator
        public void remove() {
            ManagedLinkedList<T>.Element<T> element = this.WB;
            if (element != null) {
                element.DW();
            }
        }
    }
}
