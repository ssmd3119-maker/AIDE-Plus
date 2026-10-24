package abcd;

import abcd.f80;
import abcd.z70;
import java.lang.reflect.Array;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class r10 {
    private a70 DW;
    private Map<String, int[][]> FH;
    private a Hw;
    private d80 Zo;
    private a70[] j6;
    private String v5;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class a {
        public static final a k2;
        private static final /* synthetic */ a[] zh;
        public static final a WB = new C0010a("FAST_FORWARD", 0);
        public static final a mb = new b("ALREADY_UP_TO_DATE", 1);
        public static final a jw = new c("FAILED", 2);
        public static final a fY = new d("MERGED", 3);
        public static final a qp = new e("CONFLICTING", 4);

        /* renamed from: abcd.r10$a$a, reason: collision with other inner class name */
        enum C0010a extends a {
            public C0010a(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.r10.a
            public boolean j6() {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Fast-forward";
            }
        }

        enum b extends a {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.r10.a
            public boolean j6() {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Already-up-to-date";
            }
        }

        enum c extends a {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.r10.a
            public boolean j6() {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Failed";
            }
        }

        enum d extends a {
            public d(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.r10.a
            public boolean j6() {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Merged";
            }
        }

        enum e extends a {
            public e(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.r10.a
            public boolean j6() {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Conflicting";
            }
        }

        enum f extends a {
            public f(String str, int i) {
                super(str, i, null);
            }

            @Override // abcd.r10.a
            public boolean j6() {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Not-yet-supported";
            }
        }

        static {
            f fVar = new f("NOT_SUPPORTED", 5);
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

    public r10(a70 a70Var, a70 a70Var2, a70[] a70VarArr, a aVar, d80 d80Var, Map<String, c80<?>> map, String str) {
        this(a70Var, a70Var2, a70VarArr, aVar, d80Var, map, null, null);
    }

    public a DW() {
        return this.Hw;
    }

    public void j6(String str, c80<?> c80Var) {
        int iFH;
        if (c80Var.v5()) {
            if (this.FH == null) {
                this.FH = new HashMap();
            }
            Iterator<z70> it = c80Var.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().DW().equals(z70.a.FIRST_CONFLICTING_RANGE)) {
                    i++;
                }
            }
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, i, this.j6.length + 1);
            Iterator<z70> it2 = c80Var.iterator();
            int i2 = -1;
            while (it2.hasNext()) {
                z70 next = it2.next();
                if (next.DW().equals(z70.a.FIRST_CONFLICTING_RANGE)) {
                    if (i2 > -1) {
                        iArr[i2][this.j6.length] = 0;
                    }
                    i2++;
                    iFH = next.FH();
                    iArr[i2][next.Hw()] = next.j6();
                } else {
                    iFH = 0;
                }
                if (next.DW().equals(z70.a.NEXT_CONFLICTING_RANGE)) {
                    if (next.FH() > iFH) {
                        next.FH();
                    }
                    iArr[i2][next.Hw()] = next.j6();
                }
            }
            this.FH.put(str, iArr);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (a70 a70Var : this.j6) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(a70.I(a70Var));
        }
        String str = JGitText.DW().mergeUsingStrategyResultedInDescription;
        Object[] objArr = new Object[5];
        objArr[0] = sb;
        objArr[1] = a70.I(this.DW);
        objArr[2] = this.Zo.j6();
        objArr[3] = this.Hw;
        objArr[4] = this.v5 == null ? "" : ", " + this.v5;
        return MessageFormat.format(str, objArr);
    }

    public r10(a70 a70Var, a70 a70Var2, a70[] a70VarArr, a aVar, d80 d80Var, Map<String, c80<?>> map, Map<String, f80.a> map2, String str) {
        this.j6 = a70VarArr;
        this.DW = a70Var2;
        this.Hw = aVar;
        this.Zo = d80Var;
        this.v5 = str;
        if (map != null) {
            for (Map.Entry<String, c80<?>> entry : map.entrySet()) {
                j6(entry.getKey(), entry.getValue());
            }
        }
    }
}
