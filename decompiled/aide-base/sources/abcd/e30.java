package abcd;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class e30 extends ArrayList<d30> {
    public e30() {
        super(16);
    }

    public static e30 j6(d30 d30Var) {
        e30 e30Var = new e30(1);
        e30Var.add(d30Var);
        return e30Var;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "EditList" + super.toString();
    }

    public e30(int i) {
        super(i);
    }
}
