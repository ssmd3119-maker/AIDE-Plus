package abcd;

import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class ba0 {
    public static final ba0 j6 = new a(null);
    public static final ba0 DW = new b(0 == true ? 1 : 0);

    private static final class a extends ba0 {
        private a() {
        }

        @Override // abcd.ba0
        public boolean DW(t90 t90Var, k90 k90Var) {
            return true;
        }

        @Override // abcd.ba0
        public boolean FH() {
            return false;
        }

        @Override // abcd.ba0
        /* renamed from: j6 */
        public ba0 clone() {
            return this;
        }

        @Override // abcd.ba0
        public String toString() {
            return "ALL";
        }

        public /* synthetic */ a(a aVar) {
            this();
        }
    }

    private static final class b extends ba0 {
        private b() {
        }

        @Override // abcd.ba0
        public boolean DW(t90 t90Var, k90 k90Var) {
            throw new UnsupportedOperationException(JGitText.DW().cannotBeCombined);
        }

        @Override // abcd.ba0
        public boolean FH() {
            return false;
        }

        @Override // abcd.ba0
        /* renamed from: j6 */
        public ba0 clone() {
            return this;
        }

        @Override // abcd.ba0
        public String toString() {
            return "MERGE_BASE";
        }

        public /* synthetic */ b(b bVar) {
            this();
        }
    }

    public abstract boolean DW(t90 t90Var, k90 k90Var);

    public boolean FH() {
        return true;
    }

    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public abstract ba0 clone();

    public String toString() {
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        return name.replace('$', '.');
    }
}
