package abcd;

import abcd.n60;
import abcd.p70;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class n60<B extends n60, R extends p70> {
    private File DW;
    private File FH;
    private List<File> Hw;
    private List<File> VH;
    private File Zo;
    private boolean gn;
    private wf0 j6;
    private q60 tp;
    private boolean u7;
    private File v5;

    private File EQ() {
        q60 q60VarV5 = v5();
        String strLg = q60VarV5.lg("core", null, "worktree");
        if (strLg != null) {
            return j3().VH(VH(), strLg);
        }
        if (q60VarV5.lg("core", null, "bare") != null) {
            if (!q60VarV5.J0("core", "bare", true)) {
                return VH().getParentFile();
            }
            U2();
            return null;
        }
        if (VH().getName().equals(".git")) {
            return VH().getParentFile();
        }
        U2();
        return null;
    }

    private static boolean J8(byte[] bArr) {
        return bArr.length >= 9 && bArr[0] == 103 && bArr[1] == 105 && bArr[2] == 116 && bArr[3] == 100 && bArr[4] == 105 && bArr[5] == 114 && bArr[6] == 58 && bArr[7] == 32;
    }

    public B BT() throws IOException {
        aM();
        vy();
        ei();
        P8();
        Mr();
        return this;
    }

    public B DW(File file) {
        if (file != null) {
            if (this.VH == null) {
                this.VH = new LinkedList();
            }
            this.VH.add(file);
        }
        Mr();
        return this;
    }

    public R FH() throws IOException {
        BT();
        ka0 ka0Var = new ka0(this);
        if (!J0() || ka0Var.J0().DW()) {
            return ka0Var;
        }
        throw new a50(VH());
    }

    public File[] Hw() {
        List<File> list = this.Hw;
        if (list == null) {
            return null;
        }
        return (File[]) list.toArray(new File[list.size()]);
    }

    public boolean J0() {
        return this.u7;
    }

    public final B Mr() {
        return this;
    }

    public void P8() {
        if (u7() != null || VH() == null) {
            return;
        }
        yS(j3().VH(VH(), "objects"));
    }

    public B QX() {
        XL(og0.FH());
        return this;
    }

    public B U2() {
        rN(null);
        gW(null);
        this.gn = true;
        Mr();
        return this;
    }

    public File VH() {
        return this.DW;
    }

    public q60 Ws() throws IOException {
        if (VH() == null) {
            return new q60();
        }
        File fileVH = j3().VH(VH(), "config");
        ia0 ia0Var = new ia0(fileVH, j3());
        try {
            ia0Var.Mz();
            return ia0Var;
        } catch (h40 e) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().repositoryConfigFileInvalid, fileVH.getAbsolutePath(), e.getMessage()));
        }
    }

    public B XL(og0 og0Var) {
        String strVH;
        String strVH2;
        String strVH3;
        String strVH4;
        String strVH5;
        String strVH6;
        if (VH() == null && (strVH6 = og0Var.VH("GIT_DIR")) != null) {
            lg(new File(strVH6));
        }
        if (u7() == null && (strVH5 = og0Var.VH("GIT_OBJECT_DIRECTORY")) != null) {
            yS(new File(strVH5));
        }
        if (Hw() == null && (strVH4 = og0Var.VH("GIT_ALTERNATE_OBJECT_DIRECTORIES")) != null) {
            for (String str : strVH4.split(File.pathSeparator)) {
                j6(new File(str));
            }
        }
        if (tp() == null && (strVH3 = og0Var.VH("GIT_WORK_TREE")) != null) {
            gW(new File(strVH3));
        }
        if (gn() == null && (strVH2 = og0Var.VH("GIT_INDEX_FILE")) != null) {
            rN(new File(strVH2));
        }
        if (this.VH == null && (strVH = og0Var.VH("GIT_CEILING_DIRECTORIES")) != null) {
            for (String str2 : strVH.split(File.pathSeparator)) {
                DW(new File(str2));
            }
        }
        Mr();
        return this;
    }

    public wf0 Zo() {
        return this.j6;
    }

    public B a8(wf0 wf0Var) {
        this.j6 = wf0Var;
        Mr();
        return this;
    }

    public void aM() {
        if (VH() == null && tp() == null) {
            throw new IllegalArgumentException(JGitText.DW().eitherGitDirOrWorkTreeRequired);
        }
    }

    public void ei() {
        if (Zo() == null) {
            a8(wf0.FH);
        }
        if (!we() && tp() == null) {
            gW(EQ());
        }
        if (we()) {
            return;
        }
        if (VH() == null) {
            lg(tp().getParentFile());
        }
        if (gn() == null) {
            rN(new File(VH(), "index"));
        }
    }

    public B er(boolean z) {
        this.u7 = z;
        Mr();
        return this;
    }

    public B gW(File file) {
        this.Zo = file;
        Mr();
        return this;
    }

    public File gn() {
        return this.v5;
    }

    public wf0 j3() {
        return Zo() != null ? Zo() : wf0.FH;
    }

    public B j6(File file) {
        if (file != null) {
            if (this.Hw == null) {
                this.Hw = new LinkedList();
            }
            this.Hw.add(file);
        }
        Mr();
        return this;
    }

    public B lg(File file) {
        this.DW = file;
        this.tp = null;
        Mr();
        return this;
    }

    public B rN(File file) {
        this.v5 = file;
        Mr();
        return this;
    }

    public File tp() {
        return this.Zo;
    }

    public File u7() {
        return this.FH;
    }

    public q60 v5() {
        if (this.tp == null) {
            this.tp = Ws();
        }
        return this.tp;
    }

    public void vy() throws IOException {
        if (VH() != null || tp() == null) {
            return;
        }
        File file = new File(tp(), ".git");
        if (!file.isFile()) {
            lg(file);
            return;
        }
        byte[] bArrFH = eg0.FH(file);
        if (!J8(bArrFH)) {
            throw new IOException(MessageFormat.format(JGitText.DW().invalidGitdirRef, file.getAbsolutePath()));
        }
        int iAM = kg0.aM(bArrFH, 8);
        if (bArrFH[iAM - 1] == 10) {
            iAM--;
        }
        if (iAM == 8) {
            throw new IOException(MessageFormat.format(JGitText.DW().invalidGitdirRef, file.getAbsolutePath()));
        }
        String strGn = kg0.gn(bArrFH, 8, iAM);
        File file2 = new File(strGn);
        if (file2.isAbsolute()) {
            lg(file2);
        } else {
            lg(new File(tp(), strGn).getCanonicalFile());
        }
    }

    public boolean we() {
        return this.gn;
    }

    public B yS(File file) {
        this.FH = file;
        Mr();
        return this;
    }
}
