package abcd;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class o40 extends IOException {
    public o40(File file, String str) {
        super(str);
    }

    public o40(File file) {
        this(file, MessageFormat.format(JGitText.DW().cannotLock, file));
    }
}
