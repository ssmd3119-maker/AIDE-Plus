package abcd;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class n10 implements Callable<l10> {
    private boolean DW;
    private File j6;

    public n10 DW(boolean z) {
        this.DW = z;
        return this;
    }

    public n10 FH(File file) {
        this.j6 = file;
        return this;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public l10 call() {
        try {
            q70 q70Var = new q70();
            if (this.DW) {
                q70Var.U2();
            }
            q70Var.QX();
            if (this.j6 != null) {
                File file = this.j6;
                if (!this.DW) {
                    file = new File(file, ".git");
                }
                q70Var.lg(file);
            } else if (q70Var.VH() == null) {
                File file2 = new File(".");
                if (file2.getParentFile() != null) {
                    file2 = file2.getParentFile();
                }
                if (!this.DW) {
                    file2 = new File(file2, ".git");
                }
                q70Var.lg(file2);
            }
            p70 p70VarFH = q70Var.FH();
            if (!p70VarFH.J0().DW()) {
                p70VarFH.FH(this.DW);
            }
            return new l10(p70VarFH);
        } catch (IOException e) {
            throw new o20(e.getMessage(), e);
        }
    }
}
