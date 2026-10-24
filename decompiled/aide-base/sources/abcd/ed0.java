package abcd;

import abcd.hd0;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class ed0 extends fe0 {
    private final Map<String, JSch> DW = new HashMap();
    private JSch FH;
    private hd0 Hw;

    private static void EQ(JSch jSch, wf0 wf0Var) throws IOException {
        File fileJ8 = wf0Var.J8();
        if (fileJ8 == null) {
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(new File(fileJ8, ".ssh"), "known_hosts"));
            try {
                jSch.Ws(fileInputStream);
                fileInputStream.close();
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (FileNotFoundException | IOException unused) {
        }
    }

    private Session VH(vc0 vc0Var, wf0 wf0Var, String str, String str2, String str3, int i, hd0.b bVar) {
        Session sessionGn = gn(bVar, str, str3, i, wf0Var);
        if (str2 != null) {
            sessionGn.vJ(str2);
        }
        String strZo = bVar.Zo();
        if (strZo != null) {
            sessionGn.dx("StrictHostKeyChecking", strZo);
        }
        String strV5 = bVar.v5();
        if (strV5 != null) {
            sessionGn.dx("PreferredAuthentications", strV5);
        }
        if (vc0Var != null && (!bVar.gn() || !vc0Var.Hw())) {
            sessionGn.aj(new wc0(sessionGn, vc0Var));
        }
        v5(bVar, sessionGn);
        return sessionGn;
    }

    private static void tp(JSch jSch, wf0 wf0Var) {
        File fileJ8 = wf0Var.J8();
        if (fileJ8 == null) {
            return;
        }
        File file = new File(fileJ8, ".ssh");
        if (file.isDirectory()) {
            we(jSch, new File(file, "identity"));
            we(jSch, new File(file, "id_rsa"));
            we(jSch, new File(file, "id_dsa"));
        }
    }

    private static void we(JSch jSch, File file) {
        if (file.isFile()) {
            try {
                jSch.DW(file.getAbsolutePath());
            } catch (JSchException unused) {
            }
        }
    }

    @Override // abcd.fe0
    public synchronized be0 DW(ue0 ue0Var, vc0 vc0Var, wf0 wf0Var, int i) {
        Session sessionVH;
        String strWe = ue0Var.we();
        String strVH = ue0Var.VH();
        String strV5 = ue0Var.v5();
        int iU7 = ue0Var.u7();
        try {
            if (this.Hw == null) {
                this.Hw = hd0.DW(wf0Var);
            }
            hd0.b bVarV5 = this.Hw.v5(strV5);
            String strDW = bVarV5.DW();
            if (iU7 <= 0) {
                iU7 = bVarV5.Hw();
            }
            int i2 = iU7;
            if (strWe == null) {
                strWe = bVarV5.VH();
            }
            String str = strWe;
            sessionVH = VH(vc0Var, wf0Var, str, strVH, strDW, i2, bVarV5);
            int i3 = 0;
            while (!sessionVH.vy() && i3 < 3) {
                int i4 = i3 + 1;
                try {
                    sessionVH.J8(i);
                } catch (JSchException e) {
                    sessionVH.Ws();
                    if (vc0Var == null) {
                        throw e;
                    }
                    if (e.getCause() != null) {
                        throw e;
                    }
                    if (!e.getMessage().equals("Auth fail")) {
                        throw e;
                    }
                    vc0Var.v5(ue0Var);
                    sessionVH = VH(vc0Var, wf0Var, str, strVH, strDW, i2, bVarV5);
                }
                i3 = i4;
            }
        } catch (JSchException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof UnknownHostException) {
                throw new j50(ue0Var, JGitText.DW().unknownHost);
            }
            if (cause instanceof ConnectException) {
                throw new j50(ue0Var, cause.getMessage());
            }
            throw new j50(ue0Var, e2.getMessage(), e2);
        }
        return new fd0(sessionVH, ue0Var);
    }

    public JSch Zo(wf0 wf0Var) throws IOException {
        JSch jSch = new JSch();
        EQ(jSch, wf0Var);
        tp(jSch, wf0Var);
        return jSch;
    }

    public Session gn(hd0.b bVar, String str, String str2, int i, wf0 wf0Var) {
        return u7(bVar, wf0Var).EQ(str, str2, i);
    }

    public JSch u7(hd0.b bVar, wf0 wf0Var) throws IOException {
        if (this.FH == null) {
            JSch jSchZo = Zo(wf0Var);
            this.FH = jSchZo;
            Iterator it = jSchZo.gn().iterator();
            while (it.hasNext()) {
                this.DW.put((String) it.next(), this.FH);
            }
        }
        File fileFH = bVar.FH();
        if (fileFH == null) {
            return this.FH;
        }
        String absolutePath = fileFH.getAbsolutePath();
        JSch jSch = this.DW.get(absolutePath);
        if (jSch != null) {
            return jSch;
        }
        JSch jSch2 = new JSch();
        jSch2.J0(this.FH.VH());
        jSch2.DW(absolutePath);
        this.DW.put(absolutePath, jSch2);
        return jSch2;
    }

    public abstract void v5(hd0.b bVar, Session session);
}
