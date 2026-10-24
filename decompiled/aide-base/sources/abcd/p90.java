package abcd;

import abcd.o90;
import java.text.MessageFormat;
import java.util.AbstractList;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class p90<E extends o90> extends AbstractList<E> {
    protected a WB = new a(0);
    protected int mb = 0;

    protected static class a {
        final int DW;
        final Object[] j6 = new Object[256];

        public a(int i) {
            this.DW = i;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: DW, reason: merged with bridge method [inline-methods] */
    public E get(int i) {
        a aVar = this.WB;
        if ((i >> aVar.DW) >= 1024) {
            return null;
        }
        while (aVar != null) {
            int i2 = aVar.DW;
            if (i2 <= 0) {
                break;
            }
            int i3 = i >> i2;
            i -= i3 << i2;
            aVar = (a) aVar.j6[i3];
        }
        if (aVar != null) {
            return (E) aVar.j6[i];
        }
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public E set(int i, E e) {
        a aVar = this.WB;
        while (true) {
            int i2 = aVar.DW;
            if ((i >> i2) < 256) {
                break;
            }
            aVar = new a(i2 + 8);
            aVar.j6[0] = this.WB;
            this.WB = aVar;
        }
        while (true) {
            int i3 = aVar.DW;
            if (i3 <= 0) {
                Object[] objArr = aVar.j6;
                Object obj = objArr[i];
                objArr[i] = e;
                return (E) obj;
            }
            int i4 = i >> i3;
            i -= i4 << i3;
            Object[] objArr2 = aVar.j6;
            if (objArr2[i4] == null) {
                objArr2[i4] = new a(i3 - 8);
            }
            aVar = (a) aVar.j6[i4];
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.WB = new a(0);
        this.mb = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public void add(int i, E e) {
        if (i != this.mb) {
            throw new UnsupportedOperationException(MessageFormat.format(JGitText.DW().unsupportedOperationNotAddAtEnd, Integer.valueOf(i)));
        }
        set(i, e);
        this.mb++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.mb;
    }
}
