package abcd;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class ec0 {
    private Executor J0;
    private long gn;
    private int we;
    private int j6 = -1;
    private boolean DW = true;
    private boolean FH = true;
    private boolean Hw = false;
    private boolean v5 = true;
    private int Zo = 50;
    private int VH = 10;
    private long u7 = 52428800;
    private int tp = 100;
    private int EQ = 52428800;
    private int J8 = 2;

    public ec0(p70 p70Var) {
        j6(p70Var.gn());
    }

    public int DW() {
        return this.EQ;
    }

    public int EQ() {
        return this.we;
    }

    public int FH() {
        return this.j6;
    }

    public int Hw() {
        return this.tp;
    }

    public boolean J0() {
        return this.v5;
    }

    public boolean J8() {
        return this.DW;
    }

    public void Mr(boolean z) {
        this.v5 = z;
    }

    public void QX(int i) {
        this.EQ = i;
    }

    public void U2(long j) {
        this.gn = j;
    }

    public int VH() {
        return this.VH;
    }

    public boolean Ws() {
        return this.FH;
    }

    public void XL(int i) {
        this.j6 = i;
    }

    public long Zo() {
        return this.gn;
    }

    public void a8(int i) {
        if (i <= 2) {
            Mr(false);
        } else {
            this.VH = i;
        }
    }

    public void aM(int i) {
        this.tp = i;
    }

    public void er(boolean z) {
        this.DW = z;
    }

    public void gW(int i) {
        this.we = i;
    }

    public Executor gn() {
        return this.J0;
    }

    public void j3(long j) {
        this.u7 = j;
    }

    public void j6(q60 q60Var) {
        rN(q60Var.QX("pack", "depth", tp()));
        a8(q60Var.QX("pack", "window", VH()));
        U2(q60Var.aM("pack", "windowmemory", Zo()));
        j3(q60Var.aM("pack", "deltacachesize", v5()));
        aM(q60Var.QX("pack", "deltacachelimit", Hw()));
        XL(q60Var.QX("pack", "compression", q60Var.QX("core", "compression", FH())));
        lg(q60Var.QX("pack", "indexversion", u7()));
        QX(q60Var.QX("core", "bigfilethreshold", DW()));
        gW(q60Var.QX("pack", "threads", EQ()));
        er(q60Var.J0("pack", "reusedeltas", J8()));
        yS(q60Var.J0("pack", "reuseobjects", Ws()));
        Mr(q60Var.J0("pack", "deltacompression", J0()));
    }

    public void lg(int i) {
        this.J8 = i;
    }

    public void rN(int i) {
        this.Zo = i;
    }

    public int tp() {
        return this.Zo;
    }

    public int u7() {
        return this.J8;
    }

    public long v5() {
        return this.u7;
    }

    public boolean we() {
        return this.Hw;
    }

    public void yS(boolean z) {
        this.FH = z;
    }
}
