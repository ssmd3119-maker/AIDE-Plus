package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class k50 extends IOException {
    public k50(b40 b40Var) {
        super(MessageFormat.format(JGitText.DW().unmergedPath, b40Var.tp()));
    }
}
