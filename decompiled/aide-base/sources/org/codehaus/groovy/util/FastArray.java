package org.codehaus.groovy.util;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public class FastArray implements Cloneable {
    private Object[] WB;
    public int mb;

    static {
        new FastArray(0);
    }

    public FastArray(int i) {
        this.WB = new Object[i];
    }

    public int FH() {
        return this.mb;
    }

    public List Hw() {
        return new AbstractList() { // from class: org.codehaus.groovy.util.FastArray.1
            @Override // java.util.AbstractList, java.util.List
            public Object get(int i) {
                return FastArray.this.j6(i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return FastArray.this.mb;
            }
        };
    }

    public Object j6(int i) {
        return this.WB[i];
    }

    public String toString() {
        return FH() == 0 ? "[]" : Hw().toString();
    }

    public FastArray() {
        this(8);
    }
}
