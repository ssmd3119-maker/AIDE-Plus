package abcd;

import java.io.IOException;
import java.io.OutputStream;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class bb0 extends ab0 {
    public bb0(OutputStream outputStream) {
        super(outputStream);
    }

    public static boolean gn(ld0 ld0Var) {
        return (ld0Var.Qq() >>> 1) < 2147483647L;
    }

    @Override // abcd.ab0
    public void Zo() throws IOException {
        v5();
        for (ld0 ld0Var : this.FH) {
            if (!gn(ld0Var)) {
                throw new IOException(JGitText.DW().packTooLargeForIndexVersion1);
            }
            ig0.VH(this.DW, 0, (int) ld0Var.Qq());
            ld0Var.tp(this.DW, 4);
            this.j6.write(this.DW);
        }
        Hw();
    }
}
