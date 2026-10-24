package abcd;

import java.io.File;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class a50 extends j50 {
    public a50(File file) {
        this(file.getPath());
    }

    private static String j6(String str) {
        return MessageFormat.format(JGitText.DW().repositoryNotFound, str);
    }

    public a50(String str) {
        super(j6(str));
    }
}
