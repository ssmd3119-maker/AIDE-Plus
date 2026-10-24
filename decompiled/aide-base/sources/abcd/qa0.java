package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class qa0 extends hc0 {
    long DW;
    long FH;
    private long Hw;
    wa0 j6;
    private a70 v5;

    class a extends qa0 {
        @Override // abcd.hc0
        public int DW() {
            return 1;
        }
    }

    private static final class b extends qa0 {
        private b() {
        }

        @Override // abcd.hc0
        public int DW() {
            return 0;
        }

        public /* synthetic */ b(b bVar) {
            this();
        }
    }

    public static qa0 Hw(wa0 wa0Var, long j, long j2, long j3) {
        b bVar = new b(null);
        bVar.j6 = wa0Var;
        bVar.DW = j;
        bVar.FH = j2;
        ((qa0) bVar).Hw = j3;
        return bVar;
    }

    public static qa0 Zo(wa0 wa0Var, long j, long j2) {
        a aVar = new a();
        aVar.j6 = wa0Var;
        aVar.DW = j;
        aVar.FH = j2;
        return aVar;
    }

    public static qa0 v5(wa0 wa0Var, long j, long j2, a70 a70Var) {
        b bVar = new b(null);
        bVar.j6 = wa0Var;
        bVar.DW = j;
        bVar.FH = j2;
        ((qa0) bVar).v5 = a70Var;
        return bVar;
    }

    @Override // abcd.hc0
    public int FH() {
        return (int) Math.min(this.FH, 2147483647L);
    }

    @Override // abcd.hc0
    public a70 j6() {
        if (this.v5 == null && DW() == 0) {
            try {
                this.v5 = this.j6.lg(this.Hw);
            } catch (IOException unused) {
                return null;
            }
        }
        return this.v5;
    }
}
