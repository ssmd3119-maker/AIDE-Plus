package abcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class ia0 extends t70 {
    private final wf0 VH;
    private final File Zo;
    private volatile ma0 gn;
    private volatile a70 u7;

    public ia0(File file, wf0 wf0Var) {
        this(null, file, wf0Var);
    }

    private static a70 vJ(byte[] bArr) {
        return a70.sG(r60.Zo().digest(bArr));
    }

    @Override // abcd.q60
    public void Hw() {
        this.u7 = vJ(new byte[0]);
        super.Hw();
    }

    public void Mz() throws h40, IOException {
        ma0 ma0Var = this.gn;
        ma0 ma0VarZo = ma0.Zo(Sf());
        try {
            byte[] bArrFH = eg0.FH(Sf());
            a70 a70VarVJ = vJ(bArrFH);
            if (!this.u7.aM(a70VarVJ)) {
                u7(kg0.VH(bArrFH));
                this.gn = ma0VarZo;
                this.u7 = a70VarVJ;
            } else if (ma0Var.j6(ma0VarZo)) {
                ma0Var.VH(ma0VarZo);
            } else {
                this.gn = ma0VarZo;
            }
        } catch (h40 e) {
            throw new h40(MessageFormat.format(JGitText.DW().cannotReadFile, Sf()), e);
        } catch (FileNotFoundException unused) {
            Hw();
            this.gn = ma0VarZo;
        } catch (IOException e2) {
            IOException iOException = new IOException(MessageFormat.format(JGitText.DW().cannotReadFile, Sf()));
            iOException.initCause(e2);
            throw iOException;
        }
    }

    public final File Sf() {
        return this.Zo;
    }

    @Override // abcd.t70
    public void ef() throws o40 {
        byte[] bArrDW = r60.DW(sh());
        sa0 sa0Var = new sa0(Sf(), this.VH);
        if (!sa0Var.u7()) {
            throw new o40(Sf());
        }
        try {
            sa0Var.J8(true);
            sa0Var.j3(bArrDW);
            if (!sa0Var.Hw()) {
                throw new IOException(MessageFormat.format(JGitText.DW().cannotCommitWriteTo, Sf()));
            }
            sa0Var.QX();
            this.gn = sa0Var.Zo();
            this.u7 = vJ(bArrDW);
            gn();
        } catch (Throwable th) {
            sa0Var.QX();
            throw th;
        }
    }

    public boolean g3() {
        return this.gn.FH(Sf());
    }

    @Override // abcd.q60
    public boolean gW() {
        return false;
    }

    public String toString() {
        return String.valueOf(getClass().getSimpleName()) + "[" + Sf().getPath() + "]";
    }

    public ia0(q60 q60Var, File file, wf0 wf0Var) {
        super(q60Var);
        this.Zo = file;
        this.VH = wf0Var;
        this.gn = ma0.Hw;
        this.u7 = a70.ca();
    }
}
