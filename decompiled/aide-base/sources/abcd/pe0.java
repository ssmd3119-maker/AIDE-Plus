package abcd;

import abcd.se0;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class pe0 extends ge0 implements kd0 {
    static final se0 Mr = new a();

    class a extends se0 {
        private final String[] DW = {"ssh", "ssh+git", "git+ssh"};
        private final Set<String> FH = Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(this.DW)));

        @Override // abcd.se0
        public boolean FH(ue0 ue0Var, p70 p70Var, String str) {
            return ue0Var.EQ() == null ? (ue0Var.v5() == null || ue0Var.gn() == null || ue0Var.v5().length() == 0 || ue0Var.gn().length() == 0) ? false : true : super.FH(ue0Var, p70Var, str);
        }

        @Override // abcd.se0
        public String Hw() {
            return JGitText.DW().transportProtoSSH;
        }

        @Override // abcd.se0
        public Set<String> VH() {
            return this.FH;
        }

        @Override // abcd.se0
        public Set<se0.a> Zo() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.HOST, se0.a.PATH));
        }

        @Override // abcd.se0
        public le0 gn(ue0 ue0Var, p70 p70Var, String str) {
            return new pe0(p70Var, ue0Var);
        }

        @Override // abcd.se0
        public Set<se0.a> v5() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.USER, se0.a.PASS, se0.a.PORT));
        }
    }

    class b extends fe0 {
        public b() {
        }

        @Override // abcd.fe0
        public be0 DW(ue0 ue0Var, vc0 vc0Var, wf0 wf0Var, int i) {
            return new c(pe0.this, null);
        }
    }

    private class c implements be0 {
        private c() {
        }

        @Override // abcd.be0
        public void disconnect() {
        }

        @Override // abcd.be0
        public Process j6(String str, int i) throws j50 {
            String strVH = og0.FH().VH("GIT_SSH");
            boolean zContains = strVH.toLowerCase().contains("plink");
            ArrayList arrayList = new ArrayList();
            arrayList.add(strVH);
            if (zContains && !strVH.toLowerCase().contains("tortoiseplink")) {
                arrayList.add("-batch");
            }
            if (pe0.this.aM().u7() > 0) {
                arrayList.add(zContains ? "-P" : "-p");
                arrayList.add(String.valueOf(pe0.this.aM().u7()));
            }
            if (pe0.this.aM().we() != null) {
                arrayList.add(String.valueOf(pe0.this.aM().we()) + "@" + pe0.this.aM().v5());
            } else {
                arrayList.add(pe0.this.aM().v5());
            }
            arrayList.add(str);
            ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
            processBuilder.command(arrayList);
            if (pe0.this.j6.u7() != null) {
                processBuilder.environment().put("GIT_DIR", pe0.this.j6.u7().getPath());
            }
            try {
                return processBuilder.start();
            } catch (IOException e) {
                throw new j50(e.getMessage(), e);
            }
        }

        public /* synthetic */ c(pe0 pe0Var, c cVar) {
            this();
        }
    }

    class d extends qc0 {
        private wg0 cn;
        private final Process ro;

        public d(pe0 pe0Var) throws j50 {
            super(pe0Var);
            try {
                this.ro = pe0Var.x9().j6(pe0Var.lp(pe0Var.J0()), pe0Var.QX());
                ug0 ug0Var = new ug0();
                J8(ug0Var);
                wg0 wg0Var = new wg0(this.ro.getErrorStream(), ug0Var.j6());
                this.cn = wg0Var;
                wg0Var.start();
                XL(this.ro.getInputStream(), this.ro.getOutputStream());
                try {
                    Mr();
                } catch (s40 e) {
                    String strHw = Hw();
                    pe0Var.sy(this.ro.exitValue(), pe0Var.J0(), strHw);
                    throw pe0Var.aj(e, strHw);
                }
            } catch (j50 e2) {
                close();
                throw e2;
            } catch (IOException e3) {
                close();
                throw new j50(this.v5, JGitText.DW().remoteHungUpUnexpectedly, e3);
            }
        }

        @Override // abcd.qc0, abcd.pc0, abcd.tc0
        public void close() {
            QX();
            wg0 wg0Var = this.cn;
            if (wg0Var != null) {
                try {
                    wg0Var.DW();
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    this.cn = null;
                    throw th;
                }
                this.cn = null;
            }
            super.close();
            Process process = this.ro;
            if (process != null) {
                process.destroy();
            }
        }
    }

    class e extends rc0 {
        private wg0 gW;
        private final Process yS;

        public e(pe0 pe0Var) throws j50 {
            super(pe0Var);
            try {
                this.yS = pe0Var.x9().j6(pe0Var.lp(pe0Var.we()), pe0Var.QX());
                ug0 ug0Var = new ug0();
                J8(ug0Var);
                wg0 wg0Var = new wg0(this.yS.getErrorStream(), ug0Var.j6());
                this.gW = wg0Var;
                wg0Var.start();
                XL(this.yS.getInputStream(), this.yS.getOutputStream());
                try {
                    Mr();
                } catch (s40 e) {
                    String strHw = Hw();
                    pe0Var.sy(this.yS.exitValue(), pe0Var.we(), strHw);
                    throw pe0Var.aj(e, strHw);
                }
            } catch (j50 e2) {
                close();
                throw e2;
            } catch (IOException e3) {
                close();
                throw new j50(this.v5, JGitText.DW().remoteHungUpUnexpectedly, e3);
            }
        }

        @Override // abcd.pc0, abcd.tc0
        public void close() {
            QX();
            wg0 wg0Var = this.gW;
            if (wg0Var != null) {
                try {
                    wg0Var.DW();
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    this.gW = null;
                    throw th;
                }
                this.gW = null;
            }
            super.close();
            Process process = this.yS;
            if (process != null) {
                process.destroy();
            }
        }
    }

    public pe0(p70 p70Var, ue0 ue0Var) {
        super(p70Var, ue0Var);
        if (OW()) {
            Qq(new b());
        }
    }

    private static boolean OW() {
        return og0.FH().VH("GIT_SSH") != null;
    }

    @Override // abcd.le0
    public rd0 SI() {
        return new e(this);
    }

    public s40 aj(s40 s40Var, String str) {
        if (str == null || str.length() == 0) {
            return s40Var;
        }
        String strGn = this.DW.gn();
        if (this.DW.EQ() != null && this.DW.gn().startsWith("/~")) {
            strGn = this.DW.gn().substring(1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fatal: ");
        sb.append(jg0.DW.j6(strGn));
        sb.append(": ");
        if (str.startsWith(sb.toString())) {
            str = str.substring(sb.length());
        }
        return new s40(this.DW, str);
    }

    public String lp(String str) {
        String strGn = this.DW.gn();
        if (this.DW.EQ() != null && this.DW.gn().startsWith("/~")) {
            strGn = this.DW.gn().substring(1);
        }
        return str + ' ' + jg0.DW.j6(strGn);
    }

    @Override // abcd.le0
    public yc0 nw() {
        return new d(this);
    }

    public void sy(int i, String str, String str2) throws j50 {
        if (i == 127) {
            IOException iOException = null;
            if (str2 != null && str2.length() > 0) {
                iOException = new IOException(str2);
            }
            throw new j50(this.DW, MessageFormat.format(JGitText.DW().cannotExecute, lp(str)), iOException);
        }
    }
}
