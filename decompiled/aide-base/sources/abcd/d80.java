package abcd;

import java.text.MessageFormat;
import java.util.HashMap;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class d80 {
    public static final d80 j6 = new g80("ours", 0);
    public static final d80 DW = new g80("theirs", 1);
    public static final j80 FH = new i80();
    public static final j80 Hw = new h80();
    private static final HashMap<String, d80> v5 = new HashMap<>();

    static {
        Hw(j6);
        Hw(DW);
        Hw(FH);
        Hw(Hw);
    }

    public static synchronized void FH(String str, d80 d80Var) {
        if (v5.containsKey(str)) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().mergeStrategyAlreadyExistsAsDefault, str));
        }
        v5.put(str, d80Var);
    }

    public static void Hw(d80 d80Var) {
        FH(d80Var.j6(), d80Var);
    }

    public abstract e80 DW(p70 p70Var);

    public abstract String j6();
}
