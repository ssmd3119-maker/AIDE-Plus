package abcd;

import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class b50 extends RuntimeException {
    public b50(Throwable th) {
        super(JGitText.DW().walkFailure, th);
    }
}
