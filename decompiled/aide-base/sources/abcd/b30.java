package abcd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class b30 {
    private static /* synthetic */ int[] tp;
    static final h60 u7 = h60.DW(a70.ca());
    protected String DW;
    protected t60 FH;
    protected t60 Hw;
    protected h60 VH;
    protected int Zo;
    protected h60 gn;
    protected String j6;
    protected a v5;

    public enum a {
        ADD,
        MODIFY,
        DELETE,
        RENAME,
        COPY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public enum b {
        OLD,
        NEW;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            int length = bVarArrValuesCustom.length;
            b[] bVarArr = new b[length];
            System.arraycopy(bVarArrValuesCustom, 0, bVarArr, 0, length);
            return bVarArr;
        }
    }

    public static List<b30> DW(b30 b30Var) {
        b30 b30Var2 = new b30();
        b30Var2.VH = b30Var.u7();
        b30Var2.FH = b30Var.tp();
        b30Var2.j6 = b30Var.EQ();
        b30Var2.gn = u7;
        b30Var2.Hw = t60.u7;
        b30Var2.DW = "/dev/null";
        b30Var2.v5 = a.DELETE;
        b30 b30Var3 = new b30();
        b30Var3.VH = u7;
        b30Var3.FH = t60.u7;
        b30Var3.j6 = "/dev/null";
        b30Var3.gn = b30Var.Zo();
        b30Var3.Hw = b30Var.VH();
        b30Var3.DW = b30Var.gn();
        b30Var3.v5 = a.ADD;
        return Arrays.asList(b30Var2, b30Var3);
    }

    public static b30 J8(a aVar, b30 b30Var, b30 b30Var2, int i) {
        b30 b30Var3 = new b30();
        b30Var3.VH = b30Var.VH;
        b30Var3.FH = b30Var.FH;
        b30Var3.j6 = b30Var.j6;
        b30Var3.gn = b30Var2.gn;
        b30Var3.Hw = b30Var2.Hw;
        b30Var3.DW = b30Var2.DW;
        b30Var3.v5 = aVar;
        b30Var3.Zo = i;
        return b30Var3;
    }

    public static List<b30> QX(jf0 jf0Var, boolean z) {
        if (jf0Var.XL() != 2) {
            throw new IllegalArgumentException(JGitText.DW().treeWalkMustHaveExactlyTwoTrees);
        }
        if (z && jf0Var.U2()) {
            throw new IllegalArgumentException(JGitText.DW().cannotBeRecursiveWhenTreesAreIncluded);
        }
        ArrayList arrayList = new ArrayList();
        w60 w60Var = new w60();
        while (jf0Var.rN()) {
            b30 b30Var = new b30();
            jf0Var.EQ(w60Var, 0);
            b30Var.VH = h60.DW(w60Var);
            jf0Var.EQ(w60Var, 1);
            b30Var.gn = h60.DW(w60Var);
            b30Var.FH = jf0Var.gn(0);
            b30Var.Hw = jf0Var.gn(1);
            String strJ0 = jf0Var.J0();
            b30Var.j6 = strJ0;
            b30Var.DW = strJ0;
            t60 t60Var = b30Var.FH;
            t60 t60Var2 = t60.u7;
            if (t60Var == t60Var2) {
                b30Var.j6 = "/dev/null";
                b30Var.v5 = a.ADD;
                arrayList.add(b30Var);
            } else if (b30Var.Hw == t60Var2) {
                b30Var.DW = "/dev/null";
                b30Var.v5 = a.DELETE;
                arrayList.add(b30Var);
            } else if (!b30Var.VH.equals(b30Var.gn)) {
                b30Var.v5 = a.MODIFY;
                if (o30.a8(b30Var.FH, b30Var.Hw)) {
                    arrayList.add(b30Var);
                } else {
                    arrayList.addAll(DW(b30Var));
                }
            } else if (b30Var.FH != b30Var.Hw) {
                b30Var.v5 = a.MODIFY;
                arrayList.add(b30Var);
            }
            if (z && jf0Var.a8()) {
                jf0Var.FH();
            }
        }
        return arrayList;
    }

    public static List<b30> Ws(jf0 jf0Var) {
        return QX(jf0Var, false);
    }

    public static /* synthetic */ int[] j6() {
        int[] iArr = tp;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[a.valuesCustom().length];
        try {
            iArr2[a.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[a.COPY.ordinal()] = 5;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[a.DELETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a.MODIFY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[a.RENAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        tp = iArr2;
        return iArr2;
    }

    public String EQ() {
        return this.j6;
    }

    public a FH() {
        return this.v5;
    }

    public h60 Hw(b bVar) {
        return bVar == b.OLD ? u7() : Zo();
    }

    public int J0() {
        return this.Zo;
    }

    public t60 VH() {
        return this.Hw;
    }

    public h60 Zo() {
        return this.gn;
    }

    public String gn() {
        return this.DW;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiffEntry[");
        sb.append(this.v5);
        sb.append(" ");
        int i = j6()[this.v5.ordinal()];
        if (i == 1) {
            sb.append(this.DW);
        } else if (i == 2 || i == 3) {
            sb.append(this.j6);
        } else if (i == 4) {
            sb.append(String.valueOf(this.j6) + "->" + this.DW);
        } else if (i == 5) {
            sb.append(String.valueOf(this.j6) + "->" + this.DW);
        }
        sb.append("]");
        return sb.toString();
    }

    public t60 tp() {
        return this.FH;
    }

    public h60 u7() {
        return this.VH;
    }

    public t60 v5(b bVar) {
        return bVar == b.OLD ? tp() : VH();
    }

    public String we(b bVar) {
        return bVar == b.OLD ? EQ() : gn();
    }
}
