package abcd;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class ft implements bt {
    final at j6;

    class a implements zs {
        private int j6 = 0;

        public a() {
        }

        @Override // abcd.zs
        public boolean hasNext() {
            return this.j6 < ft.this.j6.size();
        }

        @Override // abcd.zs
        public int next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            at atVar = ft.this.j6;
            int i = this.j6;
            this.j6 = i + 1;
            return atVar.ro(i);
        }
    }

    public ft() {
        at atVar = new at();
        this.j6 = atVar;
        atVar.I();
    }

    @Override // abcd.bt
    public int DW() {
        return this.j6.size();
    }

    @Override // abcd.bt
    public boolean FH(int i) {
        return this.j6.sh(i) >= 0;
    }

    @Override // abcd.bt
    public void add(int i) {
        int iVy = this.j6.vy(i);
        if (iVy < 0) {
            this.j6.cb(-(iVy + 1), i);
        }
    }

    @Override // abcd.bt
    public zs iterator() {
        return new a();
    }

    @Override // abcd.bt
    public void j6(bt btVar) {
        int iV5 = 0;
        if (!(btVar instanceof ft)) {
            if (!(btVar instanceof ms)) {
                zs it = btVar.iterator();
                while (it.hasNext()) {
                    add(it.next());
                }
                return;
            } else {
                ms msVar = (ms) btVar;
                while (iV5 >= 0) {
                    this.j6.BT(iV5);
                    iV5 = ns.v5(msVar.j6, iV5 + 1);
                }
                this.j6.I();
                return;
            }
        }
        ft ftVar = (ft) btVar;
        int size = this.j6.size();
        int size2 = ftVar.j6.size();
        int i = 0;
        while (iV5 < size2 && i < size) {
            while (iV5 < size2 && ftVar.j6.ro(iV5) < this.j6.ro(i)) {
                add(ftVar.j6.ro(iV5));
                iV5++;
            }
            if (iV5 == size2) {
                break;
            }
            while (i < size && ftVar.j6.ro(iV5) >= this.j6.ro(i)) {
                i++;
            }
        }
        while (iV5 < size2) {
            add(ftVar.j6.ro(iV5));
            iV5++;
        }
        this.j6.I();
    }

    public String toString() {
        return this.j6.toString();
    }
}
