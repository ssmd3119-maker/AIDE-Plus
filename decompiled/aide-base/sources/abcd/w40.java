package abcd;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class w40 extends IOException {
    public w40(File file) {
        this(file.getAbsolutePath());
    }

    public w40(String str) {
        super(MessageFormat.format(JGitText.DW().packFileInvalid, str));
    }
}
