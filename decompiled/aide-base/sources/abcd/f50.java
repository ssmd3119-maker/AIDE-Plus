package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class f50 extends IOException {
    public f50(long j) {
        super(MessageFormat.format(JGitText.DW().receivePackObjectTooLarge1, Long.valueOf(j)));
    }

    public f50(long j, long j2) {
        super(MessageFormat.format(JGitText.DW().receivePackObjectTooLarge2, Long.valueOf(j), Long.valueOf(j2)));
    }
}
