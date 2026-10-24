package org.codehaus.groovy.util;

import org.codehaus.groovy.util.AbstractConcurrentMapBase;

/* loaded from: classes.dex */
public abstract class AbstractConcurrentMap<K, V> extends AbstractConcurrentMapBase {

    public interface Entry<K, V> extends AbstractConcurrentMapBase.Entry<V> {
        boolean FH(K k, int i);
    }

    public static abstract class Segment<K, V> extends AbstractConcurrentMapBase.Segment {
        protected Segment(int i) {
            super(i);
        }

        public final V VH(K k, int i) {
            Object obj = this.fY[(r0.length - 1) & i];
            if (obj == null) {
                return null;
            }
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                if (entry.FH(k, i)) {
                    return entry.getValue();
                }
                return null;
            }
            for (Object obj2 : (Object[]) obj) {
                Entry entry2 = (Entry) obj2;
                if (entry2 != null && entry2.FH(k, i)) {
                    return entry2.getValue();
                }
            }
            return null;
        }

        protected abstract Entry<K, V> Zo(K k, int i, V v);

        public final Entry<K, V> gn(K k, int i, V v) {
            Object obj = this.fY[(r0.length - 1) & i];
            if (obj != null) {
                if (obj instanceof Entry) {
                    Entry<K, V> entry = (Entry) obj;
                    if (entry.FH(k, i)) {
                        return entry;
                    }
                } else {
                    for (Object obj2 : (Object[]) obj) {
                        Entry<K, V> entry2 = (Entry) obj2;
                        if (entry2 != null && entry2.FH(k, i)) {
                            return entry2;
                        }
                    }
                }
            }
            return u7(k, i, v);
        }

        public final Entry u7(K k, int i, V v) {
            j6();
            try {
                int i2 = this.mb;
                int i3 = i2 + 1;
                if (i2 > this.jw) {
                    Hw();
                }
                Object[] objArr = this.fY;
                int length = (objArr.length - 1) & i;
                Object obj = objArr[length];
                if (obj == null) {
                    Entry<K, V> entryZo = Zo(k, i, v);
                    objArr[length] = entryZo;
                    this.mb = i3;
                    return entryZo;
                }
                if (obj instanceof Entry) {
                    Entry entry = (Entry) obj;
                    if (entry.FH(k, i)) {
                        entry.setValue(v);
                        return entry;
                    }
                    Entry<K, V> entryZo2 = Zo(k, i, v);
                    objArr[length] = new Object[]{entryZo2, entry};
                    this.mb = i3;
                    return entryZo2;
                }
                Object[] objArr2 = (Object[]) obj;
                for (Object obj2 : objArr2) {
                    Entry entry2 = (Entry) obj2;
                    if (entry2 != null && entry2.FH(k, i)) {
                        entry2.setValue(v);
                        return entry2;
                    }
                }
                Entry<K, V> entryZo3 = Zo(k, i, v);
                for (int i4 = 0; i4 < objArr2.length; i4++) {
                    if (((Entry) objArr2[i4]) == null) {
                        objArr2[i4] = entryZo3;
                        this.mb = i3;
                        return entryZo3;
                    }
                }
                Object[] objArr3 = new Object[objArr2.length + 1];
                objArr3[0] = entryZo3;
                System.arraycopy(objArr2, 0, objArr3, 1, objArr2.length);
                objArr[length] = objArr3;
                this.mb = i3;
                return entryZo3;
            } finally {
                DW();
            }
        }
    }

    public AbstractConcurrentMap(Object obj) {
        super(obj);
    }

    public V Hw(K k) {
        int iDW = AbstractConcurrentMapBase.DW(k);
        return (V) VH(iDW).VH(k, iDW);
    }

    public Segment VH(int i) {
        return (Segment) super.FH(i);
    }

    public void Zo(K k, V v) {
        int iDW = AbstractConcurrentMapBase.DW(k);
        VH(iDW).u7(k, iDW, v);
    }

    public Entry<K, V> v5(K k, V v) {
        int iDW = AbstractConcurrentMapBase.DW(k);
        return VH(iDW).gn(k, iDW, v);
    }
}
