package abcd;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class n90 extends AbstractSet<m90> {
    int WB;
    private final List<m90> mb = new ArrayList();

    class a implements Iterator<m90> {
        private m90 WB;
        private final /* synthetic */ Iterator jw;

        public a(Iterator it) {
            this.jw = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.jw.hasNext();
        }

        @Override // java.util.Iterator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public m90 next() {
            m90 m90Var = (m90) this.jw.next();
            this.WB = m90Var;
            return m90Var;
        }

        @Override // java.util.Iterator
        public void remove() {
            n90.this.WB &= this.WB.FH ^ (-1);
            this.jw.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof m90) {
            if ((((m90) obj).FH & this.WB) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (!(collection instanceof n90)) {
            return super.containsAll(collection);
        }
        int i = ((n90) collection).WB;
        return (this.WB & i) == i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<m90> iterator() {
        return new a(this.mb.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public boolean add(m90 m90Var) {
        int i = this.WB;
        int i2 = m90Var.FH;
        int i3 = 0;
        if ((i & i2) != 0) {
            return false;
        }
        this.WB = i | i2;
        while (i3 < this.mb.size() && this.mb.get(i3).FH < m90Var.FH) {
            i3++;
        }
        this.mb.add(i3, m90Var);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        m90 m90Var = (m90) obj;
        int i = this.WB;
        int i2 = m90Var.FH;
        if ((i & i2) == 0) {
            return false;
        }
        this.WB = i & (i2 ^ (-1));
        for (int i3 = 0; i3 < this.mb.size(); i3++) {
            if (this.mb.get(i3).FH == m90Var.FH) {
                this.mb.remove(i3);
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.mb.size();
    }
}
