package abcd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class qf0 {
    /* JADX WARN: Multi-variable type inference failed */
    private static sf0 DW(pf0[] pf0VarArr) {
        return pf0VarArr.length == 1 ? new b(pf0VarArr[0], null) : new a(pf0VarArr, 0 == true ? 1 : 0);
    }

    public static sf0 FH(Collection<String> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(JGitText.DW().atLeastOnePathIsRequired);
        }
        pf0[] pf0VarArr = new pf0[collection.size()];
        int i = 0;
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            pf0VarArr[i] = pf0.v5(it.next());
            i++;
        }
        return DW(pf0VarArr);
    }

    public static sf0 j6(Collection<pf0> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(JGitText.DW().atLeastOnePathIsRequired);
        }
        pf0[] pf0VarArr = new pf0[collection.size()];
        collection.toArray(pf0VarArr);
        return DW(pf0VarArr);
    }

    static class a extends sf0 {
        private static final Comparator<pf0> Hw = new C0009a();
        private final pf0[] FH;

        /* renamed from: abcd.qf0$a$a, reason: collision with other inner class name */
        class C0009a implements Comparator<pf0> {
            @Override // java.util.Comparator
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public int compare(pf0 pf0Var, pf0 pf0Var2) {
                return pf0Var.FH.compareTo(pf0Var2.FH);
            }
        }

        private a(pf0[] pf0VarArr) {
            this.FH = pf0VarArr;
            Arrays.sort(pf0VarArr, Hw);
        }

        @Override // abcd.sf0
        public boolean DW(jf0 jf0Var) {
            int iJ3;
            int length = this.FH.length;
            int i = 0;
            do {
                byte[] bArr = this.FH[i].Hw;
                iJ3 = jf0Var.j3(bArr, bArr.length);
                if (iJ3 == 0) {
                    return true;
                }
                i++;
            } while (i < length);
            if (iJ3 <= 0) {
                return false;
            }
            throw d50.WB;
        }

        @Override // abcd.sf0
        public boolean FH() {
            for (pf0 pf0Var : this.FH) {
                if (pf0Var.FH()) {
                    return true;
                }
            }
            return false;
        }

        @Override // abcd.sf0
        /* renamed from: j6 */
        public sf0 clone() {
            return this;
        }

        @Override // abcd.sf0
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FAST(");
            for (int i = 0; i < this.FH.length; i++) {
                if (i > 0) {
                    sb.append(" OR ");
                }
                sb.append(this.FH[i].toString());
            }
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ a(pf0[] pf0VarArr, a aVar) {
            this(pf0VarArr);
        }
    }

    static class b extends sf0 {
        private final pf0 FH;
        private final byte[] Hw;

        private b(pf0 pf0Var) {
            this.FH = pf0Var;
            this.Hw = pf0Var.Hw;
        }

        @Override // abcd.sf0
        public boolean DW(jf0 jf0Var) {
            byte[] bArr = this.Hw;
            int iJ3 = jf0Var.j3(bArr, bArr.length);
            if (iJ3 <= 0) {
                return iJ3 == 0;
            }
            throw d50.WB;
        }

        @Override // abcd.sf0
        public boolean FH() {
            return this.FH.FH();
        }

        @Override // abcd.sf0
        /* renamed from: j6 */
        public sf0 clone() {
            return this;
        }

        @Override // abcd.sf0
        public String toString() {
            return "FAST_" + this.FH.toString();
        }

        public /* synthetic */ b(pf0 pf0Var, b bVar) {
            this(pf0Var);
        }
    }
}
