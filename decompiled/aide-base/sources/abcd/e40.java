package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class e40 extends IOException {
    public e40(h60 h60Var, Collection<a70> collection) {
        super(MessageFormat.format(JGitText.DW().ambiguousObjectAbbreviation, h60Var.we()));
    }
}
