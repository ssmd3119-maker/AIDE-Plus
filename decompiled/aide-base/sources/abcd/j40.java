package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class j40 extends IOException {
    public j40(a70 a70Var, String str) {
        super(MessageFormat.format(JGitText.DW().objectIsNotA, a70Var.BT(), str));
    }

    public j40(a70 a70Var, int i) {
        this(a70Var, r60.VH(i));
    }
}
