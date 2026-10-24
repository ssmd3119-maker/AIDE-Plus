package abcd;

import abcd.ja0;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class ka0 extends p70 {
    private final m70 EQ;
    private final ia0 gn;
    private final ia0 tp;
    private final ia0 u7;
    private final ta0 we;

    class a implements o50 {
        public a() {
        }

        @Override // abcd.o50
        public void j6(n50 n50Var) {
            ka0.this.v5(n50Var);
        }
    }

    public ka0(File file) throws IOException {
        la0 la0Var = new la0();
        la0Var.lg(file);
        la0 la0Var2 = la0Var;
        la0Var2.BT();
        this(la0Var2);
    }

    private void Qq() throws IOException {
        try {
            this.tp.Mz();
        } catch (h40 e) {
            IOException iOException = new IOException(JGitText.DW().unknownRepositoryFormat);
            iOException.initCause(e);
            throw iOException;
        }
    }

    private void aj() throws IOException {
        try {
            this.u7.Mz();
        } catch (h40 e) {
            IOException iOException = new IOException(MessageFormat.format(JGitText.DW().userConfigFileInvalid, this.u7.Sf().getAbsolutePath(), e));
            iOException.initCause(e);
            throw iOException;
        }
    }

    private void sy() throws IOException {
        try {
            this.gn.Mz();
        } catch (h40 e) {
            IOException iOException = new IOException(MessageFormat.format(JGitText.DW().systemConfigFileInvalid, this.gn.Sf().getAbsolutePath(), e));
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0088  */
    @Override // abcd.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void FH(boolean r8) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r7 = this;
            abcd.ia0 r0 = r7.gn()
            java.io.File r1 = r0.Sf()
            boolean r1 = r1.exists()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lac
            java.io.File r1 = r7.u7()
            abcd.cg0.Zo(r1, r3)
            abcd.m70 r1 = r7.EQ
            r1.DW()
            abcd.ta0 r1 = r7.we
            r1.cn()
            java.io.File r1 = new java.io.File
            java.io.File r4 = r7.u7()
            java.lang.String r5 = "branches"
            r1.<init>(r4, r5)
            abcd.cg0.FH(r1)
            java.io.File r1 = new java.io.File
            java.io.File r4 = r7.u7()
            java.lang.String r5 = "hooks"
            r1.<init>(r4, r5)
            abcd.cg0.FH(r1)
            java.lang.String r1 = "HEAD"
            abcd.n70 r1 = r7.ef(r1)
            r1.FH()
            java.lang.String r4 = "refs/heads/master"
            r1.j3(r4)
            abcd.wf0 r1 = r7.tp()
            boolean r1 = r1.J0()
            if (r1 == 0) goto L88
            java.io.File r1 = r7.u7()
            java.lang.String r4 = "try"
            java.lang.String r5 = "execute"
            java.io.File r1 = java.io.File.createTempFile(r4, r5, r1)
            abcd.wf0 r4 = r7.tp()
            r4.EQ(r1, r3)
            abcd.wf0 r4 = r7.tp()
            boolean r4 = r4.j6(r1)
            abcd.wf0 r5 = r7.tp()
            r5.EQ(r1, r2)
            abcd.wf0 r5 = r7.tp()
            boolean r5 = r5.j6(r1)
            abcd.cg0.j6(r1)
            if (r4 == 0) goto L88
            if (r5 != 0) goto L88
            r1 = 1
            goto L89
        L88:
            r1 = 0
        L89:
            java.lang.String r4 = "core"
            r5 = 0
            java.lang.String r6 = "repositoryformatversion"
            r0.SI(r4, r5, r6, r2)
            java.lang.String r6 = "filemode"
            r0.nw(r4, r5, r6, r1)
            if (r8 == 0) goto L9d
            java.lang.String r1 = "bare"
            r0.nw(r4, r5, r1, r3)
        L9d:
            r8 = r8 ^ r3
            java.lang.String r1 = "logallrefupdates"
            r0.nw(r4, r5, r1, r8)
            java.lang.String r8 = "autocrlf"
            r0.nw(r4, r5, r8, r2)
            r0.ef()
            return
        Lac:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            org.eclipse.jgit.JGitText r0 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r0 = r0.repositoryAlreadyExists
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.io.File r3 = r7.u7()
            r1[r2] = r3
            java.lang.String r0 = java.text.MessageFormat.format(r0, r1)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.ka0.FH(boolean):void");
    }

    @Override // abcd.p70
    public m70 Ws() {
        return this.EQ;
    }

    @Override // abcd.p70
    public Set<a70> Zo() {
        HashSet hashSet = new HashSet();
        for (ja0.a aVar : this.we.rN()) {
            if (aVar instanceof ja0.b) {
                ka0 ka0Var = ((ja0.b) aVar).DW;
                for (k70 k70Var : ka0Var.VH().values()) {
                    if (k70Var.DW() != null) {
                        hashSet.add(k70Var.DW());
                    }
                    if (k70Var.FH() != null) {
                        hashSet.add(k70Var.FH());
                    }
                }
                hashSet.addAll(ka0Var.Zo());
            }
        }
        return hashSet;
    }

    @Override // abcd.p70
    /* renamed from: ca, reason: merged with bridge method [inline-methods] */
    public ia0 gn() {
        if (this.gn.g3()) {
            try {
                sy();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (this.u7.g3()) {
            try {
                aj();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        if (this.tp.g3()) {
            try {
                Qq();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
        return this.tp;
    }

    @Override // abcd.p70
    public void gW() {
        ma0.Zo(we());
        v5(new p50());
    }

    @Override // abcd.p70
    /* renamed from: x9, reason: merged with bridge method [inline-methods] */
    public ta0 J0() {
        return this.we;
    }

    public ka0(n60 n60Var) throws IOException {
        super(n60Var);
        this.gn = og0.FH().gn(null, tp());
        this.u7 = og0.FH().u7(this.gn, tp());
        this.tp = new ia0(this.u7, tp().VH(u7(), "config"), tp());
        sy();
        aj();
        Qq();
        this.tp.DW(new a());
        this.EQ = new gb0(this);
        ta0 ta0Var = new ta0(this.tp, n60Var.u7(), n60Var.Hw(), tp());
        this.we = ta0Var;
        if (ta0Var.DW()) {
            String strLg = gn().lg("core", null, "repositoryformatversion");
            if (!"0".equals(strLg)) {
                throw new IOException(MessageFormat.format(JGitText.DW().unknownRepositoryFormat2, strLg));
            }
        }
        if (U2()) {
            return;
        }
        ma0.Zo(we());
    }
}
