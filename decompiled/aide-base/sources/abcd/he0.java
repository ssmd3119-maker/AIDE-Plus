package abcd;

import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public enum he0 {
    AUTO_FOLLOW(""),
    NO_TAGS("--no-tags"),
    FETCH_TAGS("--tags");

    private final String WB;

    he0(String str) {
        this.WB = str;
    }

    public static he0 j6(String str) {
        if (str == null || str.length() == 0) {
            return AUTO_FOLLOW;
        }
        for (he0 he0Var : valuesCustom()) {
            if (he0Var.DW().equals(str)) {
                return he0Var;
            }
        }
        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidTagOption, str));
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static he0[] valuesCustom() {
        he0[] he0VarArrValuesCustom = values();
        int length = he0VarArrValuesCustom.length;
        he0[] he0VarArr = new he0[length];
        System.arraycopy(he0VarArrValuesCustom, 0, he0VarArr, 0, length);
        return he0VarArr;
    }

    public String DW() {
        return this.WB;
    }
}
