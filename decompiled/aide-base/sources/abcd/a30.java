package abcd;

import abcd.q60;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class a30 {
    public static final q60.b<a30> Hw = new a();
    private final b DW;
    private final int FH;
    private final boolean j6;

    class a implements q60.b<a30> {
        @Override // abcd.q60.b
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public a30 j6(q60 q60Var) {
            return new a30(q60Var, null);
        }
    }

    public enum b {
        FALSE,
        TRUE,
        COPY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            int length = bVarArrValuesCustom.length;
            b[] bVarArr = new b[length];
            System.arraycopy(bVarArrValuesCustom, 0, bVarArr, 0, length);
            return bVarArr;
        }
    }

    private a30(q60 q60Var) {
        this.j6 = q60Var.J0("diff", "noprefix", false);
        this.DW = Hw(q60Var.lg("diff", null, "renames"));
        this.FH = q60Var.QX("diff", "renamelimit", 200);
    }

    private static b Hw(String str) {
        if (str == null) {
            return b.FALSE;
        }
        if (ng0.j6("copy", str) || ng0.j6("copies", str)) {
            return b.COPY;
        }
        Boolean boolZo = ng0.Zo(str);
        if (boolZo != null) {
            return boolZo.booleanValue() ? b.TRUE : b.FALSE;
        }
        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().enumValueNotSupported2, "diff", "renames", str));
    }

    public boolean DW() {
        return this.j6;
    }

    public boolean FH() {
        return this.DW != b.FALSE;
    }

    public int j6() {
        return this.FH;
    }

    public /* synthetic */ a30(q60 q60Var, a30 a30Var) {
        this(q60Var);
    }
}
