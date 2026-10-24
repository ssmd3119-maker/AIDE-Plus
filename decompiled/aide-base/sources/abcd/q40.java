package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class q40 extends IOException {
    private final a70 WB;

    public q40(a70 a70Var, String str) {
        super(MessageFormat.format(JGitText.DW().missingObject, str, a70Var.BT()));
        this.WB = a70Var.Zo();
    }

    public a70 j6() {
        return this.WB;
    }

    public q40(a70 a70Var, int i) {
        this(a70Var, r60.VH(i));
    }

    public q40(h60 h60Var, int i) {
        super(MessageFormat.format(JGitText.DW().missingObject, r60.VH(i), h60Var.we()));
        this.WB = null;
    }
}
