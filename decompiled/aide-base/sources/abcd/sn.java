package abcd;

import abcd.fn;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class sn<T extends fn> extends fn {
    private final List<T> k2;
    private final xm qp;

    public sn(xm xmVar, List<T> list) {
        super(yS(list), KD(list));
        if (xmVar == null) {
            throw new NullPointerException("itemType == null");
        }
        this.k2 = list;
        this.qp = xmVar;
    }

    private static int KD(List<? extends fn> list) {
        return (list.size() * list.get(0).v5()) + yS(list);
    }

    private int vy() {
        return QX();
    }

    private static int yS(List<? extends fn> list) {
        try {
            return Math.max(4, list.get(0).QX());
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    public final List<T> BT() {
        return this.k2;
    }

    @Override // abcd.wm
    public xm DW() {
        return this.qp;
    }

    @Override // abcd.fn
    public void Mr(jn jnVar, int i) {
        int iVy = i + vy();
        int i2 = -1;
        int iQX = -1;
        boolean z = true;
        for (T t : this.k2) {
            int iV5 = t.v5();
            if (z) {
                iQX = t.QX();
                i2 = iV5;
                z = false;
            } else {
                if (iV5 != i2) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (t.QX() != iQX) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            iVy = t.aM(jnVar, iVy) + iV5;
        }
    }

    @Override // abcd.fn
    public final String a8() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("{");
        boolean z = true;
        for (T t : this.k2) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(", ");
            }
            stringBuffer.append(t.a8());
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        Iterator<T> it = this.k2.iterator();
        while (it.hasNext()) {
            it.next().j6(kmVar);
        }
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        int size = this.k2.size();
        if (lsVar.EQ()) {
            lsVar.Hw(0, XL() + " " + FH());
            StringBuilder sb = new StringBuilder();
            sb.append("  size: ");
            sb.append(xs.tp(size));
            lsVar.Hw(4, sb.toString());
        }
        lsVar.writeInt(size);
        Iterator<T> it = this.k2.iterator();
        while (it.hasNext()) {
            it.next().Zo(kmVar, lsVar);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(sn.class.getName());
        stringBuffer.append(this.k2);
        return stringBuffer.toString();
    }
}
