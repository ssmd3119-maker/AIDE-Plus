package abcd;

import java.util.Collection;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class mf0 extends sf0 {

    private static class a extends mf0 {
        private final sf0 FH;
        private final sf0 Hw;

        public a(sf0 sf0Var, sf0 sf0Var2) {
            this.FH = sf0Var;
            this.Hw = sf0Var2;
        }

        @Override // abcd.sf0
        public boolean DW(jf0 jf0Var) {
            return this.FH.DW(jf0Var) && this.Hw.DW(jf0Var);
        }

        @Override // abcd.sf0
        public boolean FH() {
            return this.FH.FH() || this.Hw.FH();
        }

        @Override // abcd.sf0
        /* renamed from: j6 */
        public sf0 clone() {
            return new a(this.FH.clone(), this.Hw.clone());
        }

        @Override // abcd.sf0
        public String toString() {
            return "(" + this.FH.toString() + " AND " + this.Hw.toString() + ")";
        }
    }

    private static class b extends mf0 {
        private final sf0[] FH;

        public b(sf0[] sf0VarArr) {
            this.FH = sf0VarArr;
        }

        @Override // abcd.sf0
        public boolean DW(jf0 jf0Var) {
            for (sf0 sf0Var : this.FH) {
                if (!sf0Var.DW(jf0Var)) {
                    return false;
                }
            }
            return true;
        }

        @Override // abcd.sf0
        public boolean FH() {
            for (sf0 sf0Var : this.FH) {
                if (sf0Var.FH()) {
                    return true;
                }
            }
            return false;
        }

        @Override // abcd.sf0
        /* renamed from: j6 */
        public sf0 clone() {
            int length = this.FH.length;
            sf0[] sf0VarArr = new sf0[length];
            for (int i = 0; i < length; i++) {
                sf0VarArr[i] = this.FH[i].clone();
            }
            return new b(sf0VarArr);
        }

        @Override // abcd.sf0
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            for (int i = 0; i < this.FH.length; i++) {
                if (i > 0) {
                    sb.append(" AND ");
                }
                sb.append(this.FH[i].toString());
            }
            sb.append(")");
            return sb.toString();
        }
    }

    public static sf0 Hw(Collection<sf0> collection) {
        if (collection.size() < 2) {
            throw new IllegalArgumentException(JGitText.DW().atLeastTwoFiltersNeeded);
        }
        int size = collection.size();
        sf0[] sf0VarArr = new sf0[size];
        collection.toArray(sf0VarArr);
        return size == 2 ? v5(sf0VarArr[0], sf0VarArr[1]) : new b(sf0VarArr);
    }

    public static sf0 v5(sf0 sf0Var, sf0 sf0Var2) {
        sf0 sf0Var3 = sf0.j6;
        return sf0Var == sf0Var3 ? sf0Var2 : sf0Var2 == sf0Var3 ? sf0Var : new a(sf0Var, sf0Var2);
    }
}
