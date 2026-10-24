package abcd;

import abcd.r70;
import java.io.File;

/* loaded from: classes.dex */
public class l10 {
    private final p70 j6;

    public l10(p70 p70Var) {
        if (p70Var == null) {
            throw null;
        }
        this.j6 = p70Var;
    }

    public static l10 J0(File file) {
        return J8(file, wf0.FH);
    }

    public static l10 J8(File file, wf0 wf0Var) {
        r70.a aVarVH = r70.a.VH(file, wf0Var);
        q70 q70Var = new q70();
        q70Var.a8(wf0Var);
        q70 q70Var2 = q70Var;
        q70Var2.lg(aVarVH.Hw());
        q70 q70Var3 = q70Var2;
        q70Var3.er(true);
        return j3(q70Var3.FH());
    }

    public static g10 VH() {
        return new g10();
    }

    public static l10 j3(p70 p70Var) {
        return new l10(p70Var);
    }

    public static n10 tp() {
        return new n10();
    }

    public i10 DW() {
        return new i10(this.j6);
    }

    public p10 EQ() {
        return new p10(this.j6);
    }

    public j10 FH() {
        return new j10(this.j6);
    }

    public o10 Hw() {
        return new o10(this.j6);
    }

    public u10 QX() {
        return new u10(this.j6);
    }

    public s10 Ws() {
        return new s10(this.j6);
    }

    public y10 XL() {
        return new y10(this.j6);
    }

    public e10 Zo() {
        return new e10(this.j6);
    }

    public a20 aM() {
        return new a20(this.j6);
    }

    public h10 gn() {
        return new h10(this.j6);
    }

    public b10 j6() {
        return new b10(this.j6);
    }

    public p70 u7() {
        return this.j6;
    }

    public c10 v5() {
        return new c10(this.j6);
    }

    public q10 we() {
        return new q10(this.j6);
    }
}
