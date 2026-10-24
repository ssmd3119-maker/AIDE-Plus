package abcd;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class lh implements zh {
    private gr[] DW;
    private boolean EQ;
    private int FH;
    private fr Hw;
    private gr[] J0;
    private int J8;
    private int VH;
    private bq Zo;
    private hi gn;
    private final dr j6;
    private int tp;
    private ArrayList<bq> u7;
    private int v5;
    private qp we;

    public lh(dr drVar) {
        if (drVar == null) {
            throw new NullPointerException("prototype == null");
        }
        this.j6 = drVar;
        this.DW = new gr[10];
        this.J0 = new gr[6];
        FH();
    }

    public static void KD(gr grVar, gr grVar2) {
        throw new fi("local variable type mismatch: attempt to set or access a value of type " + grVar.Zo() + " using a local variable of type " + grVar2.Zo() + ". This is symptomatic of .class transformation tools that ignore local variable information.");
    }

    public final int BT() {
        return this.tp;
    }

    @Override // abcd.zh
    public final void DW(fr frVar) {
        this.Hw = frVar;
    }

    @Override // abcd.zh
    public final void EQ(boolean z) {
        this.EQ = z;
    }

    @Override // abcd.zh
    public final void FH() {
        this.FH = 0;
        this.Hw = null;
        this.v5 = 0;
        this.Zo = null;
        this.VH = 0;
        this.gn = null;
        this.u7 = null;
        this.tp = -1;
        this.EQ = false;
        this.we = null;
        this.J8 = -1;
    }

    @Override // abcd.zh
    public dr Hw() {
        return this.j6;
    }

    @Override // abcd.zh
    public void J0(uh uhVar, dr drVar) {
        er erVarV5 = drVar.v5();
        int size = erVarV5.size();
        gn(uhVar, size);
        for (int i = 0; i < size; i++) {
            if (!ai.j6(erVarV5.v5(i), this.DW[i])) {
                throw new fi("at stack depth " + ((size - 1) - i) + ", expected type " + erVarV5.v5(i).Zo() + " but found " + this.DW[i].j6().Zo());
            }
        }
    }

    @Override // abcd.zh
    public final void J8(hi hiVar) {
        if (hiVar == null) {
            throw new NullPointerException("cases == null");
        }
        this.gn = hiVar;
    }

    public final int Mr() {
        return this.FH;
    }

    public final gr P8(int i) {
        if (i >= this.J8) {
            throw new IllegalArgumentException("n >= resultCount");
        }
        try {
            return this.J0[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    @Override // abcd.zh
    public final void QX(int i) {
        this.v5 = i;
    }

    public final void SI(uh uhVar) {
        int i = this.J8;
        if (i < 0) {
            throw new fi("results never set");
        }
        if (i == 0) {
            return;
        }
        if (this.we != null) {
            uhVar.Hw().sG(vy(false));
            return;
        }
        th thVarV5 = uhVar.v5();
        for (int i2 = 0; i2 < this.J8; i2++) {
            if (this.EQ) {
                thVarV5.vJ();
            }
            thVarV5.Sf(this.J0[i2]);
        }
    }

    public final void U2() {
        this.J8 = 0;
    }

    @Override // abcd.zh
    public final void VH(uh uhVar, fr frVar, fr frVar2, fr frVar3) {
        gn(uhVar, 3);
        if (!ai.j6(frVar, this.DW[0])) {
            throw new fi("expected type " + frVar.Zo() + " but found " + this.DW[0].j6().Zo());
        }
        if (!ai.j6(frVar2, this.DW[1])) {
            throw new fi("expected type " + frVar2.Zo() + " but found " + this.DW[1].j6().Zo());
        }
        if (ai.j6(frVar3, this.DW[2])) {
            return;
        }
        throw new fi("expected type " + frVar3.Zo() + " but found " + this.DW[2].j6().Zo());
    }

    @Override // abcd.zh
    public final void Ws(uh uhVar, int i) {
        FH();
        this.DW[0] = uhVar.Hw().KD(i);
        this.FH = 1;
        this.tp = i;
    }

    @Override // abcd.zh
    public final void XL(int i, fr frVar, kp kpVar) {
        this.we = qp.sh(i, frVar, kpVar);
    }

    @Override // abcd.zh
    public final void Zo(int i) {
        this.VH = i;
    }

    public final hi a8() {
        return this.gn;
    }

    public final void aM(gr grVar) {
        if (grVar == null) {
            throw new NullPointerException("result == null");
        }
        gr[] grVarArr = this.J0;
        int i = this.J8;
        grVarArr[i] = grVar;
        this.J8 = i + 1;
    }

    public final int ei() {
        int i = this.J8;
        if (i >= 0) {
            return i;
        }
        throw new fi("results never set");
    }

    public final int er() {
        return this.VH;
    }

    public final ArrayList<bq> gW() {
        return this.u7;
    }

    @Override // abcd.zh
    public final void gn(uh uhVar, int i) {
        th thVarV5 = uhVar.v5();
        FH();
        if (i > this.DW.length) {
            this.DW = new gr[i + 10];
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.DW[i2] = thVarV5.ef();
        }
        this.FH = i;
    }

    public final gr j3(int i) {
        if (i >= this.FH) {
            throw new IllegalArgumentException("n >= argCount");
        }
        try {
            return this.DW[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    @Override // abcd.zh
    public final void j6(uh uhVar, fr frVar) {
        gn(uhVar, 1);
        if (ai.j6(frVar, this.DW[0])) {
            return;
        }
        throw new fi("expected type " + frVar.Zo() + " but found " + this.DW[0].j6().Zo());
    }

    public final bq lg() {
        return this.Zo;
    }

    public final void nw(gr grVar) {
        if (grVar == null) {
            throw new NullPointerException("result == null");
        }
        this.J0[0] = grVar;
        this.J8 = 1;
    }

    public final int rN() {
        return this.v5;
    }

    @Override // abcd.zh
    public final void tp(ArrayList<bq> arrayList) {
        this.u7 = arrayList;
    }

    @Override // abcd.zh
    public final void u7(uh uhVar, fr frVar, fr frVar2) {
        gn(uhVar, 2);
        if (!ai.j6(frVar, this.DW[0])) {
            throw new fi("expected type " + frVar.Zo() + " but found " + this.DW[0].j6().Zo());
        }
        if (ai.j6(frVar2, this.DW[1])) {
            return;
        }
        throw new fi("expected type " + frVar2.Zo() + " but found " + this.DW[1].j6().Zo());
    }

    public final qp vy(boolean z) {
        if (this.we == null) {
            return null;
        }
        if (this.J8 != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("local target with ");
            sb.append(this.J8 == 0 ? "no" : "multiple");
            sb.append(" results");
            throw new fi(sb.toString());
        }
        gr grVar = this.J0[0];
        fr frVarJ6 = grVar.j6();
        fr frVarJ62 = this.we.j6();
        if (frVarJ6 == frVarJ62) {
            return z ? this.we.I(grVar) : this.we;
        }
        if (!ai.j6(frVarJ62, frVarJ6)) {
            KD(frVarJ6, frVarJ62);
            throw null;
        }
        if (frVarJ62 == fr.sg) {
            this.we = this.we.I(grVar);
        }
        return this.we;
    }

    @Override // abcd.zh
    public final void we(bq bqVar) {
        if (bqVar == null) {
            throw new NullPointerException("cst == null");
        }
        this.Zo = bqVar;
    }

    public final fr yS() {
        return this.Hw;
    }
}
