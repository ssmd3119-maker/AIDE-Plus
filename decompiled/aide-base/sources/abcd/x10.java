package abcd;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class x10 {
    private final u60 j6;

    public x10(u60 u60Var) {
        this.j6 = u60Var;
        if (u60Var.FH().isEmpty() && u60Var.Hw().isEmpty() && u60Var.gn().isEmpty() && u60Var.Zo().isEmpty() && u60Var.VH().isEmpty() && u60Var.u7().isEmpty()) {
            u60Var.v5().isEmpty();
        }
    }

    public Set<String> DW() {
        return Collections.unmodifiableSet(this.j6.Hw());
    }

    public Set<String> FH() {
        return Collections.unmodifiableSet(this.j6.v5());
    }

    public Set<String> Hw() {
        return Collections.unmodifiableSet(this.j6.Zo());
    }

    public Set<String> VH() {
        return Collections.unmodifiableSet(this.j6.u7());
    }

    public Set<String> Zo() {
        return Collections.unmodifiableSet(this.j6.gn());
    }

    public Set<String> j6() {
        return Collections.unmodifiableSet(this.j6.FH());
    }

    public Set<String> v5() {
        return Collections.unmodifiableSet(this.j6.VH());
    }
}
