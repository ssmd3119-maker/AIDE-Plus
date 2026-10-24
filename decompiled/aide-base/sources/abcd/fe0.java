package abcd;

/* loaded from: classes.dex */
public abstract class fe0 {
    private static fe0 j6 = new xc0();

    public static void Hw(fe0 fe0Var) {
        if (fe0Var != null) {
            j6 = fe0Var;
        } else {
            j6 = new xc0();
        }
    }

    public static fe0 j6() {
        return j6;
    }

    public abstract be0 DW(ue0 ue0Var, vc0 vc0Var, wf0 wf0Var, int i);

    public void FH(be0 be0Var) {
        be0Var.disconnect();
    }
}
