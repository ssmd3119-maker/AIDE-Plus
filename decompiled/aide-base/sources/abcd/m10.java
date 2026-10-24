package abcd;

import java.text.MessageFormat;
import java.util.concurrent.Callable;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class m10<T> implements Callable<T> {
    private boolean DW = true;
    protected final p70 j6;

    public m10(p70 p70Var) {
        this.j6 = p70Var;
    }

    public p70 DW() {
        return this.j6;
    }

    public void FH(boolean z) {
        this.DW = z;
    }

    public void j6() {
        if (!this.DW) {
            throw new IllegalStateException(MessageFormat.format(JGitText.DW().commandWasCalledInTheWrongState, getClass().getName()));
        }
    }
}
