package abcd;

import abcd.n70;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class h20 extends j20 {
    /* JADX WARN: Illegal instructions before constructor call */
    public h20(String str, k70 k70Var, n70.c cVar) {
        if (cVar != null) {
            str = String.valueOf(str) + ". " + MessageFormat.format(JGitText.DW().refUpdateReturnCodeWas, cVar);
        }
        super(str);
    }
}
