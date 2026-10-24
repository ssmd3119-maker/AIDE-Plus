package org.codehaus.groovy.util;

/* loaded from: classes.dex */
public abstract class AbstractConcurrentMapBase {
    final int DW;
    protected final Segment[] FH;
    final int j6;

    public interface Entry<V> {
        int Hw();

        V getValue();

        boolean j6();

        void setValue(V v);
    }

    public static class Segment extends LockableObject {
        protected volatile Object[] fY;
        int jw;
        volatile int mb;

        protected Segment(int i) {
            v5(new Object[i]);
        }

        private void FH(Entry entry, int i, Object[] objArr) {
            Object obj = objArr[i];
            if (obj == null) {
                objArr[i] = entry;
                return;
            }
            if (obj instanceof Entry) {
                objArr[i] = new Object[]{entry, (Entry) obj};
                return;
            }
            Object[] objArr2 = (Object[]) obj;
            Object[] objArr3 = new Object[objArr2.length + 1];
            objArr3[0] = entry;
            System.arraycopy(objArr2, 0, objArr3, 1, objArr2.length);
            objArr[i] = objArr3;
        }

        void Hw() {
            Object[] objArr = this.fY;
            int length = objArr.length;
            if (length >= 1073741824) {
                return;
            }
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = objArr[i2];
                if (obj != null) {
                    if (!(obj instanceof Entry)) {
                        Object[] objArr2 = (Object[]) obj;
                        int i3 = 0;
                        for (int i4 = 0; i4 < objArr2.length; i4++) {
                            Entry entry = (Entry) objArr2[i4];
                            if (entry == null || !entry.j6()) {
                                objArr2[i4] = null;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 == 0) {
                            objArr[i2] = null;
                        } else {
                            i += i3;
                        }
                    } else if (((Entry) obj).j6()) {
                        i++;
                    } else {
                        objArr[i2] = null;
                    }
                }
            }
            int i5 = i + 1 < this.jw ? length : length << 1;
            Object[] objArr3 = new Object[i5];
            int i6 = i5 - 1;
            int i7 = 0;
            for (Object obj2 : objArr) {
                if (obj2 != null) {
                    if (obj2 instanceof Entry) {
                        Entry entry2 = (Entry) obj2;
                        if (entry2.j6()) {
                            FH(entry2, entry2.Hw() & i6, objArr3);
                            i7++;
                        }
                    } else {
                        for (Object obj3 : (Object[]) obj2) {
                            Entry entry3 = (Entry) obj3;
                            if (entry3 != null && entry3.j6()) {
                                FH(entry3, entry3.Hw() & i6, objArr3);
                                i7++;
                            }
                        }
                    }
                }
            }
            this.jw = (int) (i5 * 0.75f);
            this.fY = objArr3;
            this.mb = i7;
        }

        void v5(Object[] objArr) {
            this.jw = (int) (objArr.length * 0.75f);
            this.fY = objArr;
        }
    }

    public AbstractConcurrentMapBase(Object obj) {
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < 16) {
            i4++;
            i3 <<= 1;
        }
        this.DW = 32 - i4;
        this.j6 = i3 - 1;
        this.FH = new Segment[i3];
        int i5 = 512 / i3;
        while (i2 < (i3 * i5 < 512 ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.FH;
            if (i >= segmentArr.length) {
                return;
            }
            segmentArr[i] = j6(obj, i2);
            i++;
        }
    }

    protected static <K> int DW(K k) {
        int iIdentityHashCode = System.identityHashCode(k);
        int i = iIdentityHashCode + ((iIdentityHashCode << 9) ^ (-1));
        int i2 = i ^ (i >>> 14);
        int i3 = i2 + (i2 << 4);
        return i3 ^ (i3 >>> 10);
    }

    public Segment FH(int i) {
        return this.FH[(i >>> this.DW) & this.j6];
    }

    protected abstract Segment j6(Object obj, int i);
}
