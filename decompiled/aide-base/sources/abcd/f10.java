package abcd;

import abcd.f80;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class f10 {
    public static final f10 Hw = new f10(a.jw);
    private final k90 DW;
    private final Map<String, f80.a> FH;
    private final a j6;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class a {
        private static final /* synthetic */ a[] fY;
        public static final a jw;
        public static final a WB = new C0003a("OK", 0);
        public static final a mb = new b("FAILED", 1);

        /* renamed from: abcd.f10$a$a, reason: collision with other inner class name */
        enum C0003a extends a {
            public C0003a(String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Ok";
            }
        }

        enum b extends a {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Failed";
            }
        }

        enum c extends a {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Conflicting";
            }
        }

        static {
            c cVar = new c("CONFLICTING", 2);
            jw = cVar;
            fY = new a[]{WB, mb, cVar};
        }

        private a(String str, int i) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            a[] aVarArr = fY;
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            return aVarArr2;
        }

        public /* synthetic */ a(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public f10(k90 k90Var, List<k70> list) {
        this.j6 = a.WB;
        this.DW = k90Var;
        this.FH = null;
    }

    public k90 DW() {
        return this.DW;
    }

    public a FH() {
        return this.j6;
    }

    public Map<String, f80.a> j6() {
        return this.FH;
    }

    public f10(Map<String, f80.a> map) {
        this.j6 = a.mb;
        this.DW = null;
        this.FH = map;
    }

    private f10(a aVar) {
        this.j6 = aVar;
        this.DW = null;
        this.FH = null;
    }
}
