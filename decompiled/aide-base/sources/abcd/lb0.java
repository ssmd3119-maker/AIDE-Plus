package abcd;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public class lb0 {
    private volatile a j6 = new a(5);

    private static class a {
        private final int DW;
        final int FH;
        private final AtomicReferenceArray<a70> j6;

        public a(int i) {
            this.j6 = new AtomicReferenceArray<>(1 << i);
            this.DW = 32 - i;
            this.FH = i;
        }

        private int FH(j60 j60Var) {
            return j60Var.hashCode() >>> this.DW;
        }

        public boolean DW(j60 j60Var) {
            a70 a70Var;
            int iFH = FH(j60Var);
            for (int i = 0; i < 8 && (a70Var = this.j6.get(iFH)) != null; i++) {
                if (j60.Mr(a70Var, j60Var)) {
                    return true;
                }
                iFH++;
                if (iFH == this.j6.length()) {
                    iFH = 0;
                }
            }
            return false;
        }

        public boolean j6(j60 j60Var) {
            int iFH = FH(j60Var);
            int i = 0;
            while (i < 8) {
                a70 a70Var = this.j6.get(iFH);
                if (a70Var == null) {
                    if (this.j6.compareAndSet(iFH, null, j60Var.Zo())) {
                        return true;
                    }
                } else {
                    if (j60.Mr(a70Var, j60Var)) {
                        return true;
                    }
                    iFH++;
                    if (iFH == this.j6.length()) {
                        iFH = 0;
                    }
                    i++;
                }
            }
            return false;
        }
    }

    public void DW() {
        this.j6 = new a(5);
    }

    public boolean FH(j60 j60Var) {
        return this.j6.DW(j60Var);
    }

    public void Hw(j60 j60Var) {
        if (FH(j60Var)) {
            DW();
        }
    }

    public void j6(j60 j60Var) {
        a aVar = this.j6;
        if (aVar.j6(j60Var)) {
            return;
        }
        a aVar2 = new a(Math.min(aVar.FH + 1, 11));
        aVar2.j6(j60Var);
        this.j6 = aVar2;
    }
}
