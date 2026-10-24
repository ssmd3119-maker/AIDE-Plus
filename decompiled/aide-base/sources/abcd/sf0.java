package abcd;

/* loaded from: classes.dex */
public abstract class sf0 {
    public static final sf0 j6 = new a(null);
    public static final sf0 DW = new b(0 == true ? 1 : 0);

    private static final class a extends sf0 {
        private a() {
        }

        @Override // abcd.sf0
        public boolean DW(jf0 jf0Var) {
            return true;
        }

        @Override // abcd.sf0
        public boolean FH() {
            return false;
        }

        @Override // abcd.sf0
        /* renamed from: j6 */
        public sf0 clone() {
            return this;
        }

        @Override // abcd.sf0
        public String toString() {
            return "ALL";
        }

        public /* synthetic */ a(a aVar) {
            this();
        }
    }

    private static final class b extends sf0 {
        private b() {
        }

        @Override // abcd.sf0
        public boolean DW(jf0 jf0Var) {
            int iXL = jf0Var.XL();
            if (iXL == 1) {
                return true;
            }
            int iJ8 = jf0Var.J8(0);
            for (int i = 1; i < iXL; i++) {
                if (jf0Var.J8(i) != iJ8 || !jf0Var.aM(i, 0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // abcd.sf0
        public boolean FH() {
            return false;
        }

        @Override // abcd.sf0
        /* renamed from: j6 */
        public sf0 clone() {
            return this;
        }

        @Override // abcd.sf0
        public String toString() {
            return "ANY_DIFF";
        }

        public /* synthetic */ b(b bVar) {
            this();
        }
    }

    public abstract boolean DW(jf0 jf0Var);

    public abstract boolean FH();

    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public abstract sf0 clone();

    public String toString() {
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        return name.replace('$', '.');
    }
}
