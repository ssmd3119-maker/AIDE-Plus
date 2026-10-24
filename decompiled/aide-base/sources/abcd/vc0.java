package abcd;

import java.util.List;

/* loaded from: classes.dex */
public abstract class vc0 {
    private static volatile vc0 j6;

    public static vc0 FH() {
        return j6;
    }

    public abstract boolean DW(ue0 ue0Var, uc0... uc0VarArr);

    public abstract boolean Hw();

    public abstract boolean Zo(uc0... uc0VarArr);

    public boolean j6(ue0 ue0Var, List<uc0> list) {
        return DW(ue0Var, (uc0[]) list.toArray(new uc0[list.size()]));
    }

    public void v5(ue0 ue0Var) {
    }
}
