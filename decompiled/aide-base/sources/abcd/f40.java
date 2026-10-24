package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class f40 extends IOException {
    public f40(String str) {
        super(MessageFormat.format(JGitText.DW().checkoutConflictWithFile, str));
    }

    private static String j6(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append("\n");
            sb.append(str);
        }
        return sb.toString();
    }

    public f40(String[] strArr) {
        super(MessageFormat.format(JGitText.DW().checkoutConflictWithFiles, j6(strArr)));
    }
}
