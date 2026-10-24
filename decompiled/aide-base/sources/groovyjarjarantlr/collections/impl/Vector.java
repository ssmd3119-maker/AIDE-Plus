package groovyjarjarantlr.collections.impl;

import java.util.Enumeration;

/* loaded from: classes.dex */
public class Vector implements Cloneable {
    protected Object[] WB;
    protected int mb;

    public Vector() {
        this(10);
    }

    public synchronized Object FH(int i) {
        if (i >= this.WB.length) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i);
            stringBuffer.append(" >= ");
            stringBuffer.append(this.WB.length);
            throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
        }
        if (i < 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(i);
            stringBuffer2.append(" < 0 ");
            throw new ArrayIndexOutOfBoundsException(stringBuffer2.toString());
        }
        return this.WB[i];
    }

    public synchronized Enumeration Hw() {
        return new VectorEnumerator(this);
    }

    public synchronized void VH(Object obj, int i) {
        if (i >= this.WB.length) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i);
            stringBuffer.append(" >= ");
            stringBuffer.append(this.WB.length);
            throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
        }
        this.WB[i] = obj;
        if (i > this.mb) {
            this.mb = i;
        }
    }

    public synchronized void Zo(int i) {
        int i2 = i + 1;
        if (i2 > this.WB.length) {
            Object[] objArr = this.WB;
            int length = this.WB.length * 2;
            if (i2 <= length) {
                i2 = length;
            }
            Object[] objArr2 = new Object[i2];
            this.WB = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    public Object clone() {
        try {
            Vector vector = (Vector) super.clone();
            Object[] objArr = new Object[gn()];
            vector.WB = objArr;
            System.arraycopy(this.WB, 0, objArr, 0, gn());
            return vector;
        } catch (CloneNotSupportedException unused) {
            System.err.println("cannot clone Vector.super");
            return null;
        }
    }

    public int gn() {
        return this.mb + 1;
    }

    public synchronized void j6(Object obj) {
        Zo(this.mb + 2);
        Object[] objArr = this.WB;
        int i = this.mb + 1;
        this.mb = i;
        objArr[i] = obj;
    }

    public Vector(int i) {
        this.mb = -1;
        this.WB = new Object[i];
    }
}
