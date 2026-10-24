package abcd;

import abcd.f80;
import java.util.Map;

/* loaded from: classes.dex */
public class w10 {
    static final w10 DW = new w10(a.WB);
    static final w10 FH = new w10(a.mb);
    static final w10 Hw = new w10(a.qp);
    static final w10 v5 = new w10(a.k2);
    private final a j6;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class a {
        public static final a k2;
        private static final /* synthetic */ a[] zh;
        public static final a WB = new C0015a("OK", 0);
        public static final a mb = new b("ABORTED", 1);
        public static final a jw = new c("STOPPED", 2);
        public static final a fY = new d("FAILED", 3);
        public static final a qp = new e("UP_TO_DATE", 4);

        /* renamed from: abcd.w10$a$a, reason: collision with other inner class name */
        enum C0015a extends a {
            public C0015a(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.w10.a
            public boolean j6() {
                return true;
            }
        }

        enum b extends a {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.w10.a
            public boolean j6() {
                return false;
            }
        }

        enum c extends a {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.w10.a
            public boolean j6() {
                return false;
            }
        }

        enum d extends a {
            public d(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.w10.a
            public boolean j6() {
                return false;
            }
        }

        enum e extends a {
            public e(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.w10.a
            public boolean j6() {
                return true;
            }
        }

        enum f extends a {
            public f(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.w10.a
            public boolean j6() {
                return true;
            }
        }

        static {
            f fVar = new f("FAST_FORWARD", 5);
            k2 = fVar;
            zh = new a[]{WB, mb, jw, fY, qp, fVar};
        }

        private a(String str, int i) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            a[] aVarArr = zh;
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            return aVarArr2;
        }

        public abstract boolean j6();

        public /* synthetic */ a(String str, int i, a aVar) {
            this(str, i);
        }
    }

    private w10(a aVar) {
        this.j6 = aVar;
    }

    public a j6() {
        return this.j6;
    }

    public w10(k90 k90Var) {
        this.j6 = a.jw;
    }

    public w10(Map<String, f80.a> map) {
        this.j6 = a.fY;
    }
}
