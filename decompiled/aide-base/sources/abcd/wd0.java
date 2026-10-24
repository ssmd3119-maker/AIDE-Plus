package abcd;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class wd0 {
    private boolean Zo;
    private p70 v5;
    private final StringBuilder j6 = new StringBuilder(100);
    private final char[] DW = new char[40];
    private final Set<String> FH = new LinkedHashSet();
    private final Set<a70> Hw = new HashSet();
    private boolean VH = true;

    public static class a extends wd0 {
        private final nd0 gn;

        public a(nd0 nd0Var) {
            this.gn = nd0Var;
        }

        @Override // abcd.wd0
        public void Zo() throws IOException {
            this.gn.j6();
        }

        @Override // abcd.wd0
        public void we(CharSequence charSequence) throws IOException {
            this.gn.VH(charSequence.toString());
        }
    }

    private void DW(j60 j60Var, String str) {
        if (this.Hw.contains(j60Var)) {
            return;
        }
        j6(j60Var, str);
    }

    private Iterable<k70> VH(Map<String, k70> map) {
        return ((map instanceof mg0) || ((map instanceof SortedMap) && ((SortedMap) map).comparator() == null)) ? map.values() : l70.Hw(map.values());
    }

    private void j6(j60 j60Var, String str) {
        this.Hw.add(j60Var.cn());
        v5(j60Var, str);
    }

    public void EQ(boolean z) {
        this.Zo = z;
    }

    public void FH(String str) {
        this.FH.add(str);
    }

    public void Hw(j60 j60Var) {
        DW(j60Var, ".have");
    }

    public abstract void Zo();

    public void gn(p70 p70Var) {
        this.v5 = p70Var;
    }

    public Set<a70> tp(Map<String, k70> map) {
        Iterator<k70> it = VH(map).iterator();
        while (it.hasNext()) {
            k70 next = it.next();
            if (next.DW() != null) {
                j6(next.DW(), next.getName());
                if (this.Zo) {
                    if (!next.Hw()) {
                        p70 p70Var = this.v5;
                        if (p70Var != null) {
                            next = p70Var.P8(next);
                        }
                    }
                    if (next.FH() != null) {
                        j6(next.FH(), String.valueOf(next.getName()) + "^{}");
                    }
                }
            }
        }
        return this.Hw;
    }

    public boolean u7() {
        return this.VH;
    }

    public void v5(j60 j60Var, String str) {
        this.j6.setLength(0);
        j60Var.XL(this.DW, this.j6);
        this.j6.append(' ');
        this.j6.append(str);
        if (this.VH) {
            this.VH = false;
            if (!this.FH.isEmpty()) {
                this.j6.append((char) 0);
                for (String str2 : this.FH) {
                    this.j6.append(' ');
                    this.j6.append(str2);
                }
                this.j6.append(' ');
            }
        }
        this.j6.append('\n');
        we(this.j6);
    }

    public abstract void we(CharSequence charSequence);
}
