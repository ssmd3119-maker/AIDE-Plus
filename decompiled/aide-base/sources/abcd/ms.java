package abcd;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class ms implements bt {
    int[] j6;

    class a implements zs {
        private int j6;

        public a() {
            this.j6 = ns.v5(ms.this.j6, 0);
        }

        @Override // abcd.zs
        public boolean hasNext() {
            return this.j6 >= 0;
        }

        @Override // abcd.zs
        public int next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.j6;
            this.j6 = ns.v5(ms.this.j6, i + 1);
            return i;
        }
    }

    public ms(int i) {
        this.j6 = ns.u7(i);
    }

    private void Hw(int i) {
        if (i >= ns.VH(this.j6)) {
            int[] iArrU7 = ns.u7(Math.max(i + 1, ns.VH(this.j6) * 2));
            int[] iArr = this.j6;
            System.arraycopy(iArr, 0, iArrU7, 0, iArr.length);
            this.j6 = iArrU7;
        }
    }

    @Override // abcd.bt
    public int DW() {
        return ns.DW(this.j6);
    }

    @Override // abcd.bt
    public boolean FH(int i) {
        return i < ns.VH(this.j6) && ns.Zo(this.j6, i);
    }

    @Override // abcd.bt
    public void add(int i) {
        Hw(i);
        ns.we(this.j6, i, true);
    }

    @Override // abcd.bt
    public zs iterator() {
        return new a();
    }

    @Override // abcd.bt
    public void j6(bt btVar) {
        if (btVar instanceof ms) {
            ms msVar = (ms) btVar;
            Hw(ns.VH(msVar.j6) + 1);
            ns.tp(this.j6, msVar.j6);
        } else {
            if (!(btVar instanceof ft)) {
                zs it = btVar.iterator();
                while (it.hasNext()) {
                    add(it.next());
                }
                return;
            }
            ft ftVar = (ft) btVar;
            int size = ftVar.j6.size();
            if (size > 0) {
                Hw(ftVar.j6.ro(size - 1));
            }
            for (int i = 0; i < ftVar.j6.size(); i++) {
                ns.we(this.j6, ftVar.j6.ro(i), true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int iV5 = ns.v5(this.j6, 0);
        boolean z = true;
        while (iV5 >= 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(iV5);
            iV5 = ns.v5(this.j6, iV5 + 1);
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
