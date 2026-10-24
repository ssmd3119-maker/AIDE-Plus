package abcd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class ne0 extends le0 implements kd0 {
    static final se0 j3 = new a();
    private final File aM;

    class a extends se0 {
        private final String[] DW = {"bundle", "file"};
        private final Set<String> FH = Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(this.DW)));

        @Override // abcd.se0
        public boolean FH(ue0 ue0Var, p70 p70Var, String str) {
            if (ue0Var.gn() != null && ue0Var.u7() <= 0 && ue0Var.we() == null && ue0Var.VH() == null && ue0Var.v5() == null) {
                return ue0Var.EQ() == null || VH().contains(ue0Var.EQ());
            }
            return false;
        }

        @Override // abcd.se0
        public String Hw() {
            return JGitText.DW().transportProtoBundleFile;
        }

        @Override // abcd.se0
        public Set<String> VH() {
            return this.FH;
        }

        @Override // abcd.se0
        public le0 gn(ue0 ue0Var, p70 p70Var, String str) {
            return "bundle".equals(ue0Var.EQ()) ? new ne0(p70Var, ue0Var, p70Var.tp().VH(new File("."), ue0Var.gn())) : re0.j3.gn(ue0Var, p70Var, str);
        }
    }

    public ne0(p70 p70Var, ue0 ue0Var, File file) {
        super(p70Var, ue0Var);
        this.aM = file;
    }

    @Override // abcd.le0
    public void Hw() {
    }

    @Override // abcd.le0
    public rd0 SI() throws u40 {
        throw new u40(JGitText.DW().pushIsNotSupportedForBundleTransport);
    }

    @Override // abcd.le0
    public yc0 nw() throws j50 {
        try {
            return new sc0(this, new FileInputStream(this.aM));
        } catch (FileNotFoundException unused) {
            throw new j50(this.DW, JGitText.DW().notFound);
        }
    }
}
