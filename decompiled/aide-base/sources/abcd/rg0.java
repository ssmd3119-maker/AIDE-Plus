package abcd;

import java.io.OutputStream;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public final class rg0 extends OutputStream {
    public static final rg0 WB = new rg0();

    private rg0() {
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        throw new IllegalStateException(JGitText.DW().writingNotPermitted);
    }
}
