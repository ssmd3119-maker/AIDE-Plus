package abcd;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class ha0 {
    private static volatile int VH;
    private static final SoftReference<a> Zo = new SoftReference<>(null);
    private b FH;
    private b Hw;
    private int v5;
    private final int j6 = VH;
    private final b[] DW = new b[1024];

    static class a {
        final int DW;
        final byte[] j6;

        public a(byte[] bArr, int i) {
            this.j6 = bArr;
            this.DW = i;
        }
    }

    static {
        Zo(new nb0());
    }

    private void DW(b bVar) {
        this.v5 -= bVar.v5;
        bVar.FH = null;
        bVar.Zo = Zo;
        bVar.v5 = 0;
    }

    private static int Hw(long j) {
        return (((int) j) << 22) >>> 22;
    }

    private void VH() {
        b bVar;
        while (this.v5 > this.j6 && (bVar = this.Hw) != null) {
            b bVar2 = bVar.j6;
            DW(bVar);
            bVar.j6 = null;
            bVar.DW = null;
            if (bVar2 == null) {
                this.FH = null;
            } else {
                bVar2.DW = null;
            }
            this.Hw = bVar2;
        }
    }

    public static void Zo(nb0 nb0Var) {
        VH = nb0Var.j6();
    }

    private void u7(b bVar) {
        b bVar2 = bVar.j6;
        b bVar3 = bVar.DW;
        if (bVar2 != null) {
            bVar2.DW = bVar3;
        }
        if (bVar3 != null) {
            bVar3.j6 = bVar2;
        }
    }

    private void v5(b bVar) {
        u7(bVar);
        bVar.j6 = null;
        b bVar2 = this.FH;
        bVar.DW = bVar2;
        if (bVar2 != null) {
            bVar2.j6 = bVar;
        } else {
            this.Hw = bVar;
        }
        this.FH = bVar;
    }

    public a FH(wa0 wa0Var, long j) {
        a aVar;
        b bVar = this.DW[Hw(j)];
        if (bVar == null || bVar.FH != wa0Var || bVar.Hw != j || (aVar = bVar.Zo.get()) == null) {
            return null;
        }
        v5(bVar);
        return aVar;
    }

    public void gn(wa0 wa0Var, long j, byte[] bArr, int i) {
        if (bArr.length > this.j6) {
            return;
        }
        b bVar = this.DW[Hw(j)];
        if (bVar == null) {
            bVar = new b(null);
            this.DW[Hw(j)] = bVar;
        } else {
            DW(bVar);
        }
        this.v5 += bArr.length;
        VH();
        bVar.FH = wa0Var;
        bVar.Hw = j;
        bVar.v5 = bArr.length;
        bVar.Zo = new SoftReference<>(new a(bArr, i));
        v5(bVar);
    }

    private static class b {
        b DW;
        wa0 FH;
        long Hw;
        SoftReference<a> Zo;
        b j6;
        int v5;

        private b() {
            this.Zo = ha0.Zo;
        }

        public /* synthetic */ b(b bVar) {
            this();
        }
    }
}
