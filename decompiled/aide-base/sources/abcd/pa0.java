package abcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class pa0 extends sb0 {
    private final Set<a70> DW;
    private final String[] FH;
    private wa0[] Hw;
    private final ta0 j6;

    public pa0(ta0 ta0Var, Set<a70> set, List<String> list) {
        this.j6 = ta0Var;
        if (set.size() == 1) {
            this.DW = Collections.singleton(set.iterator().next());
        } else {
            this.DW = Collections.unmodifiableSet(set);
        }
        this.FH = (String[]) list.toArray(new String[list.size()]);
    }

    private String VH(String str) {
        return new File(new File(this.j6.we(), "pack"), "pack-" + str + ".pack").getPath();
    }

    private wa0 Zo(String str) throws FileNotFoundException {
        for (wa0 wa0Var : this.j6.sh()) {
            if (str.equals(wa0Var.KD())) {
                return wa0Var;
            }
        }
        throw new FileNotFoundException(VH(str));
    }

    private wa0[] gn() {
        if (this.Hw == null) {
            wa0[] wa0VarArr = new wa0[this.FH.length];
            int i = 0;
            while (true) {
                String[] strArr = this.FH;
                if (i >= strArr.length) {
                    break;
                }
                wa0VarArr[i] = Zo(strArr[i]);
                i++;
            }
            this.Hw = wa0VarArr;
        }
        return this.Hw;
    }

    @Override // abcd.sb0
    public long DW() {
        long jVy = 0;
        for (wa0 wa0Var : gn()) {
            jVy += wa0Var.vy();
        }
        return jVy;
    }

    @Override // abcd.sb0
    public Set<a70> FH() {
        return this.DW;
    }

    @Override // abcd.sb0
    public boolean Hw(dc0 dc0Var, hc0 hc0Var) {
        try {
            qa0 qa0Var = (qa0) hc0Var;
            for (wa0 wa0Var : gn()) {
                if (qa0Var.j6 == wa0Var) {
                    return true;
                }
            }
            return false;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    public void v5(fc0 fc0Var, boolean z, ob0 ob0Var) {
        for (wa0 wa0Var : gn()) {
            wa0Var.EQ(fc0Var, z, ob0Var);
        }
    }
}
