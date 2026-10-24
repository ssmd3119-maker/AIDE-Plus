package groovyjarjarantlr.collections.impl;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class VectorEnumerator implements Enumeration {
    int DW = 0;
    Vector j6;

    VectorEnumerator(Vector vector) {
        this.j6 = vector;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        boolean z;
        synchronized (this.j6) {
            z = this.DW <= this.j6.mb;
        }
        return z;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj;
        synchronized (this.j6) {
            if (this.DW > this.j6.mb) {
                throw new NoSuchElementException("VectorEnumerator");
            }
            Object[] objArr = this.j6.WB;
            int i = this.DW;
            this.DW = i + 1;
            obj = objArr[i];
        }
        return obj;
    }
}
