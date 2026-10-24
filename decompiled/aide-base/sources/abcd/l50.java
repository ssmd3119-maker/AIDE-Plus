package abcd;

import java.io.IOException;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class l50 extends IOException {
    public l50(Throwable th) {
        super(JGitText.DW().unpackException);
        initCause(th);
    }
}
