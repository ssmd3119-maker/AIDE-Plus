package abcd;

/* loaded from: classes.dex */
public class t80 {
    private a DW;
    private a FH;
    private b j6 = new b();

    static final class a {
        final o90[] DW = new o90[256];
        int FH;
        int Hw;
        a j6;

        public void DW() {
            this.j6 = null;
            this.FH = 0;
            this.Hw = 0;
        }

        public boolean FH() {
            return this.FH == this.Hw;
        }

        public boolean Hw() {
            return this.Hw == 256;
        }

        public void j6(o90 o90Var) {
            o90[] o90VarArr = this.DW;
            int i = this.Hw;
            this.Hw = i + 1;
            o90VarArr[i] = o90Var;
        }

        public o90 v5() {
            o90[] o90VarArr = this.DW;
            int i = this.FH;
            this.FH = i + 1;
            return o90VarArr[i];
        }
    }

    static final class b {
        private a j6;

        public a DW() {
            a aVar = this.j6;
            if (aVar == null) {
                return new a();
            }
            this.j6 = aVar.j6;
            aVar.DW();
            return aVar;
        }

        public void j6(a aVar) {
            aVar.j6 = this.j6;
            this.j6 = aVar;
        }
    }

    public o90 DW() {
        a aVar = this.DW;
        if (aVar == null) {
            return null;
        }
        o90 o90VarV5 = aVar.v5();
        if (aVar.FH()) {
            a aVar2 = aVar.j6;
            this.DW = aVar2;
            if (aVar2 == null) {
                this.FH = null;
            }
            this.j6.j6(aVar);
        }
        return o90VarV5;
    }

    public void j6(o90 o90Var) {
        a aVarDW = this.FH;
        if (aVarDW == null) {
            a aVarDW2 = this.j6.DW();
            aVarDW2.j6(o90Var);
            this.DW = aVarDW2;
            this.FH = aVarDW2;
            return;
        }
        if (aVarDW.Hw()) {
            aVarDW = this.j6.DW();
            this.FH.j6 = aVarDW;
            this.FH = aVarDW;
        }
        aVarDW.j6(o90Var);
    }
}
