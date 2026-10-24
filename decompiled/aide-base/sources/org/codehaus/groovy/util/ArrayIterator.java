package org.codehaus.groovy.util;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ArrayIterator<T> implements Iterator<T> {
    private final T[] WB;
    private int jw;
    private int mb;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.jw < this.mb;
    }

    @Override // java.util.Iterator
    public T next() {
        T[] tArr = this.WB;
        int i = this.jw;
        this.jw = i + 1;
        return (T) Array.get(tArr, i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Remove not supported for arrays");
    }
}
