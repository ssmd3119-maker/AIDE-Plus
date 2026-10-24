package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class i40 extends IOException {
    public i40(j60 j60Var, String str) {
        this(j60Var.cn(), str);
    }

    public i40(a70 a70Var, String str) {
        super(MessageFormat.format(JGitText.DW().objectIsCorrupt, a70Var.BT(), str));
    }

    public i40(String str) {
        super(str);
    }
}
