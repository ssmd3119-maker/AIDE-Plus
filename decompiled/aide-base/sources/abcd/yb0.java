package abcd;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class yb0 implements Callable<Object> {
    private final g70 DW;
    private final tb0 FH;
    private final v70 Hw;
    private final dc0[] VH;
    private final int Zo;
    private final ec0 j6;
    private final int v5;

    public yb0(ec0 ec0Var, g70 g70Var, tb0 tb0Var, v70 v70Var, int i, int i2, dc0[] dc0VarArr) {
        this.j6 = ec0Var;
        this.DW = g70Var;
        this.FH = tb0Var;
        this.Hw = v70Var;
        this.v5 = i;
        this.Zo = i2;
        this.VH = dc0VarArr;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        g70 g70VarJ0 = this.DW.J0();
        try {
            new zb0(this.j6, this.FH, g70VarJ0).QX(this.Hw, this.VH, this.Zo, this.v5);
            g70VarJ0.XL();
            this.Hw.Zo();
            return null;
        } catch (Throwable th) {
            g70VarJ0.XL();
            this.Hw.Zo();
            throw th;
        }
    }
}
