package abcd;

import abcd.s60;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class z30 {
    private HashMap<String, a70> DW;
    private boolean EQ;
    private ArrayList<String> FH;
    private ArrayList<String> Hw;
    private y30 VH;
    private w30 Zo;
    private if0 gn;
    private p70 j6;
    private kf0 tp;
    private a70 u7;
    private a70 v5;
    private ArrayList<String> we;

    public z30(p70 p70Var, a70 a70Var, w30 w30Var, a70 a70Var2, kf0 kf0Var) {
        this.DW = new HashMap<>();
        this.FH = new ArrayList<>();
        this.Hw = new ArrayList<>();
        this.EQ = true;
        this.we = new ArrayList<>();
        this.j6 = p70Var;
        this.Zo = w30Var;
        this.u7 = a70Var;
        this.v5 = a70Var2;
        this.tp = kf0Var;
    }

    private static boolean EQ(String str, String str2) {
        return str.substring(0, str.lastIndexOf(47) + 1).equals(str2.substring(0, str2.lastIndexOf(47) + 1));
    }

    public static void FH(p70 p70Var, File file, b40 b40Var, g70 g70Var) throws InterruptedException, IOException {
        f70 f70VarWs = g70Var.Ws(b40Var.u7());
        File fileCreateTempFile = File.createTempFile("._" + file.getName(), null, file.getParentFile());
        lf0 lf0Var = (lf0) p70Var.gn().tp(lf0.FH);
        OutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        if (lf0Var.j6() == s60.b.TRUE) {
            fileOutputStream = new qg0(fileOutputStream);
        }
        try {
            f70VarWs.DW(fileOutputStream);
            fileOutputStream.close();
            wf0 wf0VarTp = p70Var.tp();
            if (lf0Var.DW() && wf0VarTp.J0()) {
                if (t60.VH.Hw(b40Var.EQ())) {
                    if (!wf0VarTp.j6(fileCreateTempFile)) {
                        wf0VarTp.EQ(fileCreateTempFile, true);
                    }
                } else if (wf0VarTp.j6(fileCreateTempFile)) {
                    wf0VarTp.EQ(fileCreateTempFile, false);
                }
            }
            if (!fileCreateTempFile.renameTo(file)) {
                cg0.j6(file);
                if (!fileCreateTempFile.renameTo(file)) {
                    throw new IOException(MessageFormat.format(JGitText.DW().couldNotWriteFile, fileCreateTempFile.getPath(), file.getPath()));
                }
            }
            b40Var.lg(file.lastModified());
            if (lf0Var.j6() != s60.b.FALSE) {
                b40Var.er(file.length());
            } else {
                b40Var.rN((int) f70VarWs.Zo());
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    private void Hw() throws f40 {
        Iterator<String> it = this.FH.iterator();
        while (it.hasNext()) {
            String next = it.next();
            File file = new File(this.j6.XL(), next);
            if (!file.delete()) {
                throw new f40(MessageFormat.format(JGitText.DW().cannotDeleteFile, next));
            }
            aM(file);
        }
        Iterator<String> it2 = this.Hw.iterator();
        while (it2.hasNext()) {
            File file2 = new File(this.j6.XL(), it2.next());
            if (!file2.delete()) {
                throw new f40(MessageFormat.format(JGitText.DW().cannotDeleteFile, file2.getAbsolutePath()));
            }
            aM(file2);
        }
    }

    private void Mr(String str, a70 a70Var, t60 t60Var) {
        if (t60.Hw.equals(t60Var)) {
            return;
        }
        this.DW.put(str, a70Var);
        b40 b40Var = new b40(str, 0);
        b40Var.yS(a70Var);
        b40Var.a8(t60Var);
        this.VH.VH(b40Var);
    }

    private boolean VH(a70 a70Var, t60 t60Var, a70 a70Var2, t60 t60Var2) {
        if (t60Var.equals(t60Var2)) {
            return a70Var != null ? a70Var.aM(a70Var2) : a70Var2 == null;
        }
        return false;
    }

    private void XL(String str) {
        this.Hw.add(str);
    }

    private boolean Zo() {
        this.we.clear();
        g70 g70VarZo = this.j6.J0().Zo();
        try {
            if (this.u7 != null) {
                J0();
            } else {
                J8();
            }
            if (!this.FH.isEmpty()) {
                if (this.EQ) {
                    throw new f40((String[]) this.FH.toArray(new String[this.FH.size()]));
                }
                Hw();
            }
            this.VH.Hw();
            File file = null;
            String str = "";
            int size = this.Hw.size() - 1;
            while (size >= 0) {
                String str2 = this.Hw.get(size);
                File file2 = new File(this.j6.XL(), str2);
                if (file2.delete() || !file2.exists()) {
                    if (!EQ(str2, str)) {
                        aM(new File(this.j6.XL(), str));
                    }
                    str = str2;
                } else if (!file2.isDirectory()) {
                    this.we.add(str2);
                }
                size--;
                file = file2;
            }
            if (file != null) {
                aM(file);
            }
            for (String str3 : this.DW.keySet()) {
                File file3 = new File(this.j6.XL(), str3);
                file3.getParentFile().mkdirs();
                b40 b40VarJ0 = this.Zo.J0(str3);
                if (!t60.gn.Hw(b40VarJ0.EQ())) {
                    FH(this.j6, file3, b40VarJ0, g70VarZo);
                }
            }
            if (!this.VH.j6()) {
                throw new k40();
            }
            g70VarZo.XL();
            return this.we.size() == 0;
        } catch (Throwable th) {
            g70VarZo.XL();
            throw th;
        }
    }

    private void aM(File file) {
        for (File parentFile = file.getParentFile(); !parentFile.equals(this.j6.XL()) && parentFile.delete(); parentFile = parentFile.getParentFile()) {
        }
    }

    private void j6(jf0 jf0Var, a70 a70Var) {
        if (a70Var == null) {
            jf0Var.DW(new gf0());
        } else {
            jf0Var.j6(a70Var);
        }
    }

    private boolean tp(String str) {
        if0 if0Var = new if0(this.j6);
        if0Var.DW(new c40(this.Zo));
        if0Var.DW(new hf0(this.j6));
        if0Var.KD(true);
        if0Var.SI(pf0.v5(str));
        while (if0Var.rN()) {
            c40 c40Var = (c40) if0Var.QX(0, c40.class);
            kf0 kf0Var = (kf0) if0Var.QX(1, kf0.class);
            if (c40Var == null || kf0Var == null || kf0Var.OW(c40Var.vy(), true)) {
                return true;
            }
        }
        return false;
    }

    private void v5(String str, b40 b40Var, ef0 ef0Var, ef0 ef0Var2) {
        this.FH.add(str);
        if (b40Var != null) {
            b40 b40Var2 = new b40(b40Var.tp(), 1);
            b40Var2.j6(b40Var);
            this.VH.VH(b40Var2);
        }
        if (ef0Var != null && !t60.Hw.equals(ef0Var.u7())) {
            b40 b40Var3 = new b40(ef0Var.we(), 2);
            b40Var3.a8(ef0Var.u7());
            b40Var3.yS(ef0Var.tp());
            this.VH.VH(b40Var3);
        }
        if (ef0Var2 == null || t60.Hw.equals(ef0Var2.u7())) {
            return;
        }
        b40 b40Var4 = new b40(ef0Var2.we(), 3);
        b40Var4.a8(ef0Var2.u7());
        b40Var4.yS(ef0Var2.tp());
        this.VH.VH(b40Var4);
    }

    private void we(b40 b40Var) {
        if (b40Var == null || t60.Hw.equals(b40Var.v5())) {
            return;
        }
        this.VH.VH(b40Var);
    }

    public boolean DW() {
        try {
            return Zo();
        } finally {
            this.Zo.P8();
        }
    }

    public void J0() {
        this.Hw.clear();
        this.DW.clear();
        this.FH.clear();
        this.gn = new if0(this.j6);
        this.VH = this.Zo.j6();
        j6(this.gn, this.u7);
        j6(this.gn, this.v5);
        this.gn.DW(new x30(this.VH));
        this.gn.DW(this.tp);
        while (this.gn.rN()) {
            Ws(this.gn.QX(0, ff0.class), this.gn.QX(1, ff0.class), (x30) this.gn.QX(2, x30.class), (kf0) this.gn.QX(3, kf0.class));
            if (this.gn.a8()) {
                this.gn.FH();
            }
        }
    }

    public void J8() {
        this.Hw.clear();
        this.DW.clear();
        this.FH.clear();
        this.VH = this.Zo.j6();
        if0 if0Var = new if0(this.j6);
        this.gn = if0Var;
        if0Var.j6(this.v5);
        this.gn.DW(new x30(this.VH));
        this.gn.DW(this.tp);
        while (this.gn.rN()) {
            QX((ff0) this.gn.QX(0, ff0.class), (x30) this.gn.QX(1, x30.class), (kf0) this.gn.QX(2, kf0.class));
            if (this.gn.a8()) {
                this.gn.FH();
            }
        }
        this.FH.removeAll(this.Hw);
    }

    public void QX(ff0 ff0Var, x30 x30Var, kf0 kf0Var) {
        if (ff0Var == null) {
            if (kf0Var != null) {
                if (this.gn.cb()) {
                    this.FH.add(this.gn.J0());
                    return;
                } else {
                    if (x30Var != null) {
                        XL(x30Var.we());
                        this.FH.remove(x30Var.we());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (x30Var == null) {
            if (kf0Var == null || t60.Hw.equals(kf0Var.u7()) || kf0Var.aj()) {
                Mr(ff0Var.we(), ff0Var.tp(), ff0Var.u7());
                return;
            } else {
                this.FH.add(this.gn.J0());
                return;
            }
        }
        if (kf0Var == null || !ff0Var.XL(x30Var)) {
            Mr(ff0Var.we(), ff0Var.tp(), ff0Var.u7());
            return;
        }
        if (x30Var.vy() == null) {
            we(x30Var.vy());
        } else if (kf0Var.OW(x30Var.vy(), true) || x30Var.vy().we() != 0) {
            Mr(ff0Var.we(), ff0Var.tp(), ff0Var.u7());
        } else {
            we(x30Var.vy());
        }
    }

    public void Ws(ef0 ef0Var, ef0 ef0Var2, x30 x30Var, kf0 kf0Var) {
        String strJ0 = this.gn.J0();
        if (x30Var == null && ef0Var2 == null && ef0Var == null) {
            if (this.gn.cb()) {
                v5(strJ0, null, null, null);
                return;
            }
            return;
        }
        a70 a70VarTp = x30Var == null ? null : x30Var.tp();
        a70 a70VarTp2 = ef0Var2 == null ? null : ef0Var2.tp();
        a70 a70VarTp3 = ef0Var == null ? null : ef0Var.tp();
        t60 t60VarU7 = x30Var == null ? null : x30Var.u7();
        t60 t60VarU72 = ef0Var2 == null ? null : ef0Var2.u7();
        t60 t60VarU73 = ef0Var == null ? null : ef0Var.u7();
        int i = ef0Var != null ? t60.Hw.equals(ef0Var.u7()) ? 3328 : 3840 : 0;
        if (x30Var != null) {
            i |= t60.Hw.equals(x30Var.u7()) ? 208 : 240;
        }
        if (ef0Var2 != null) {
            i |= t60.Hw.equals(ef0Var2.u7()) ? 13 : 15;
        }
        int i2 = i & 546;
        if (i2 != 0 && ((i & 15) == 13 || (i & 240) == 208 || (i & 3840) == 3328)) {
            switch (i) {
                case 223:
                    if (!tp(strJ0)) {
                        Mr(strJ0, a70VarTp2, ef0Var2.u7());
                        break;
                    } else {
                        v5(strJ0, x30Var.vy(), ef0Var, ef0Var2);
                        break;
                    }
                case 253:
                case 3568:
                    v5(strJ0, x30Var != null ? x30Var.vy() : null, ef0Var, ef0Var2);
                    break;
                case 3343:
                    Mr(strJ0, a70VarTp2, ef0Var2.u7());
                    break;
                case 3551:
                    if (!tp(strJ0)) {
                        Mr(strJ0, ef0Var2.tp(), ef0Var2.u7());
                        break;
                    } else {
                        v5(strJ0, x30Var.vy(), ef0Var, ef0Var2);
                        break;
                    }
                case 3581:
                    XL(strJ0);
                    break;
                case 3583:
                case 4061:
                    break;
                case 3853:
                    XL(strJ0);
                    break;
                case 4048:
                    we(x30Var.vy());
                    break;
                case 4063:
                    if (!VH(a70VarTp3, t60VarU73, a70VarTp2, t60VarU72)) {
                        if (!tp(strJ0)) {
                            Mr(strJ0, a70VarTp2, ef0Var2.u7());
                            break;
                        } else {
                            v5(strJ0, x30Var.vy(), ef0Var, ef0Var2);
                            break;
                        }
                    } else if (!tp(strJ0)) {
                        Mr(strJ0, a70VarTp2, ef0Var2.u7());
                        break;
                    } else {
                        v5(strJ0, x30Var.vy(), ef0Var, ef0Var2);
                        break;
                    }
                case 4093:
                    if (!VH(a70VarTp3, t60VarU73, a70VarTp, t60VarU7)) {
                        v5(strJ0, x30Var.vy(), ef0Var, ef0Var2);
                        break;
                    } else {
                        b40 b40VarVy = x30Var.vy();
                        if (kf0Var != null && !kf0Var.OW(b40VarVy, true)) {
                            XL(strJ0);
                            break;
                        } else {
                            v5(strJ0, b40VarVy, ef0Var, ef0Var2);
                            break;
                        }
                    }
                default:
                    we(x30Var.vy());
                    break;
            }
            return;
        }
        if (i2 == 0) {
            return;
        }
        if (i == 15 && kf0Var != null && t60.Hw.equals(kf0Var.u7())) {
            v5(strJ0, null, ef0Var, ef0Var2);
        }
        if (x30Var == null) {
            if (kf0Var != null && !t60.gn.equals(ef0Var2.u7()) && (a70VarTp2 == null || !VH(a70VarTp2, t60VarU72, kf0Var.tp(), kf0Var.u7()))) {
                v5(strJ0, null, ef0Var, ef0Var2);
                return;
            }
            if (ef0Var == null) {
                Mr(strJ0, a70VarTp2, ef0Var2.u7());
                return;
            } else if (ef0Var2 == null) {
                XL(strJ0);
                return;
            } else {
                Mr(strJ0, a70VarTp2, ef0Var2.u7());
                return;
            }
        }
        b40 b40VarVy2 = x30Var.vy();
        if (ef0Var == null) {
            if (ef0Var2 != null && !VH(a70VarTp2, t60VarU72, a70VarTp, t60VarU7)) {
                v5(strJ0, b40VarVy2, ef0Var, ef0Var2);
                return;
            }
            if (ef0Var2 != null || !this.gn.cb()) {
                we(b40VarVy2);
                return;
            } else if (b40VarVy2 == null || !(kf0Var == null || kf0Var.OW(b40VarVy2, true))) {
                XL(strJ0);
                return;
            } else {
                v5(strJ0, b40VarVy2, ef0Var, ef0Var2);
                return;
            }
        }
        if (ef0Var2 == null) {
            if (b40VarVy2.v5() == t60.gn) {
                XL(strJ0);
                return;
            }
            if (!VH(a70VarTp3, t60VarU73, a70VarTp, t60VarU7)) {
                v5(strJ0, b40VarVy2, ef0Var, ef0Var2);
                return;
            } else if (kf0Var == null || kf0Var.OW(b40VarVy2, true)) {
                v5(strJ0, b40VarVy2, ef0Var, ef0Var2);
                return;
            } else {
                XL(strJ0);
                return;
            }
        }
        if (!VH(a70VarTp3, t60VarU73, a70VarTp2, t60VarU72) && !VH(a70VarTp3, t60VarU73, a70VarTp, t60VarU7) && !VH(a70VarTp2, t60VarU72, a70VarTp, t60VarU7)) {
            v5(strJ0, b40VarVy2, ef0Var, ef0Var2);
            return;
        }
        if (!VH(a70VarTp3, t60VarU73, a70VarTp, t60VarU7) || VH(a70VarTp2, t60VarU72, a70VarTp, t60VarU7)) {
            we(b40VarVy2);
            return;
        }
        if (b40VarVy2 != null && t60.gn.equals(b40VarVy2.v5())) {
            Mr(strJ0, a70VarTp2, ef0Var2.u7());
        } else if (b40VarVy2 == null || !(kf0Var == null || kf0Var.OW(b40VarVy2, true))) {
            Mr(strJ0, a70VarTp2, ef0Var2.u7());
        } else {
            v5(strJ0, b40VarVy2, ef0Var, ef0Var2);
        }
    }

    public List<String> gn() {
        return this.FH;
    }

    public void j3(boolean z) {
        this.EQ = z;
    }

    public List<String> u7() {
        return this.we;
    }

    public z30(p70 p70Var, a70 a70Var, w30 w30Var, a70 a70Var2) {
        this(p70Var, a70Var, w30Var, a70Var2, new hf0(p70Var));
    }

    public z30(p70 p70Var, w30 w30Var, a70 a70Var) {
        this(p70Var, null, w30Var, a70Var, new hf0(p70Var));
    }
}
