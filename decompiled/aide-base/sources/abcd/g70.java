package abcd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g70 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements k60<T> {
        private final /* synthetic */ Iterator FH;

        /* JADX INFO: Incorrect field signature: TT; */
        private a70 j6;

        public a(Iterator it) {
            this.FH = it;
        }

        @Override // abcd.k60
        public a70 DW() {
            return this.j6;
        }

        @Override // abcd.k60
        public f70 FH() {
            return g70.this.QX(this.j6, -1);
        }

        @Override // abcd.m60
        public void j6() {
        }

        @Override // abcd.k60
        public boolean next() {
            if (!this.FH.hasNext()) {
                return false;
            }
            this.j6 = (a70) this.FH.next();
            return true;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> implements l60<T> {
        private long DW;
        private final /* synthetic */ Iterator Hw;

        /* JADX INFO: Incorrect field signature: TT; */
        private a70 j6;

        public b(Iterator it) {
            this.Hw = it;
        }

        @Override // abcd.l60
        public a70 DW() {
            return this.j6;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // abcd.l60
        public a70 Hw() {
            return this.j6;
        }

        @Override // abcd.m60
        public void j6() {
        }

        @Override // abcd.l60
        public boolean next() {
            if (!this.Hw.hasNext()) {
                return false;
            }
            a70 a70Var = (a70) this.Hw.next();
            this.j6 = a70Var;
            this.DW = g70.this.u7(a70Var, -1);
            return true;
        }

        @Override // abcd.l60
        public long v5() {
            return this.DW;
        }
    }

    public abstract boolean EQ(j60 j60Var);

    public abstract g70 J0();

    public <T extends a70> k60<T> J8(Iterable<T> iterable, boolean z) {
        return new a(iterable.iterator());
    }

    public void Mr(g90 g90Var, k90 k90Var, k90 k90Var2) {
    }

    public abstract f70 QX(j60 j60Var, int i);

    public void U2() {
    }

    public h60 VH(j60 j60Var) {
        return gn(j60Var, 7);
    }

    public f70 Ws(j60 j60Var) {
        return QX(j60Var, -1);
    }

    public abstract void XL();

    public abstract Collection<a70> aM(h60 h60Var);

    public h60 gn(j60 j60Var, int i) {
        if (i == 40) {
            return h60.DW(j60Var);
        }
        h60 h60VarJ6 = j60Var.j6(i);
        Collection<a70> collectionAM = aM(h60VarJ6);
        while (1 < collectionAM.size() && i < 40) {
            i++;
            h60 h60VarJ62 = j60Var.j6(i);
            ArrayList arrayList = new ArrayList(8);
            for (a70 a70Var : collectionAM) {
                if (h60VarJ62.J0(a70Var) == 0) {
                    arrayList.add(a70Var);
                }
            }
            if (1 < arrayList.size()) {
                h60VarJ6 = h60VarJ62;
                collectionAM = arrayList;
            } else {
                collectionAM = aM(h60VarJ62);
                h60VarJ6 = h60VarJ62;
            }
        }
        return h60VarJ6;
    }

    public void j3(t90 t90Var, Collection<k90> collection) {
    }

    public <T extends a70> l60<T> tp(Iterable<T> iterable, boolean z) {
        return new b(iterable.iterator());
    }

    public abstract long u7(j60 j60Var, int i);

    public boolean we(j60 j60Var, int i) {
        try {
            QX(j60Var, i);
            return true;
        } catch (q40 unused) {
            return false;
        }
    }
}
