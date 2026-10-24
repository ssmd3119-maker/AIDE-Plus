package abcd;

import abcd.kf0;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.CharacterCodingException;

/* loaded from: classes.dex */
public class hf0 extends kf0 {
    protected final wf0 er;
    protected final File rN;

    public static class a extends kf0.b {
        final File FH;
        private final t60 Hw;
        private long Zo;
        private long v5 = -1;

        public a(File file, wf0 wf0Var) {
            this.FH = file;
            if (file.isDirectory()) {
                if (new File(file, ".git").exists()) {
                    this.Hw = t60.gn;
                    return;
                } else {
                    this.Hw = t60.Hw;
                    return;
                }
            }
            if (wf0Var.j6(this.FH)) {
                this.Hw = t60.VH;
            } else {
                this.Hw = t60.Zo;
            }
        }

        @Override // abcd.kf0.b
        public long DW() {
            if (this.Zo == 0) {
                this.Zo = this.FH.lastModified();
            }
            return this.Zo;
        }

        @Override // abcd.kf0.b
        public long FH() {
            if (this.v5 < 0) {
                this.v5 = this.FH.length();
            }
            return this.v5;
        }

        @Override // abcd.kf0.b
        public t60 Hw() {
            return this.Hw;
        }

        @Override // abcd.kf0.b
        public InputStream Zo() {
            return new FileInputStream(this.FH);
        }

        @Override // abcd.kf0.b
        public String v5() {
            return this.FH.getName();
        }
    }

    public hf0(p70 p70Var) {
        this(p70Var.XL(), p70Var.tp(), (lf0) p70Var.gn().tp(lf0.FH));
        x9(p70Var);
    }

    private kf0.b[] jJ() {
        File[] fileArrListFiles = this.rN.listFiles();
        if (fileArrListFiles == null) {
            return kf0.XL;
        }
        int length = fileArrListFiles.length;
        kf0.b[] bVarArr = new kf0.b[length];
        for (int i = 0; i < length; i++) {
            bVarArr[i] = new a(fileArrListFiles[i], this.er);
        }
        return bVarArr;
    }

    @Override // abcd.ef0
    public ef0 Hw(g70 g70Var) {
        return new hf0(this, ((a) cn()).FH, this.er);
    }

    @Override // abcd.kf0
    public byte[] I(kf0.b bVar) {
        return this.QX == null ? Mz(wc(), bVar) : super.I(bVar);
    }

    public File wc() {
        return this.rN;
    }

    public hf0(File file, wf0 wf0Var, lf0 lf0Var) throws CharacterCodingException {
        super(lf0Var);
        this.rN = file;
        this.er = wf0Var;
        ca(jJ());
    }

    public hf0(hf0 hf0Var, File file, wf0 wf0Var) throws CharacterCodingException {
        super(hf0Var);
        this.rN = file;
        this.er = wf0Var;
        ca(jJ());
    }
}
