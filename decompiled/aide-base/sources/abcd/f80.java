package abcd;

import abcd.z20;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class f80 extends k80 {
    private y30 EQ;
    private List<String> J0;
    private List<String> J8;
    private boolean Mr;
    private Map<String, c80<? extends p30>> QX;
    private w30 U2;
    private Map<String, b40> Ws;
    private Map<String, a> XL;
    private kf0 a8;
    private e70 aM;
    private boolean j3;
    private y70 lg;
    private String[] tp;
    private if0 u7;
    private a70 we;

    public enum a {
        DIRTY_INDEX,
        DIRTY_WORKTREE,
        COULD_NOT_DELETE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public f80(p70 p70Var, boolean z) {
        super(p70Var);
        this.J0 = new ArrayList();
        this.J8 = new LinkedList();
        this.Ws = new HashMap();
        this.QX = new HashMap();
        this.XL = new HashMap();
        this.lg = new y70(z20.Zo((z20.a) p70Var.gn().J8("diff", null, "algorithm", z20.a.HISTOGRAM)));
        this.tp = new String[]{"BASE", "OURS", "THEIRS"};
        this.aM = DW();
        this.Mr = z;
        if (z) {
            this.U2 = w30.Mr();
        }
    }

    private b40 EQ(byte[] bArr, ff0 ff0Var, int i) {
        if (ff0Var == null || ff0Var.u7().equals(t60.Hw)) {
            return null;
        }
        b40 b40Var = new b40(bArr, i);
        b40Var.a8(ff0Var.u7());
        b40Var.yS(ff0Var.tp());
        this.EQ.VH(b40Var);
        return b40Var;
    }

    private void J0() throws IOException {
        if (this.Mr) {
            this.J8.clear();
            return;
        }
        w30 w30VarEi = this.j6.ei();
        g70 g70VarZo = this.j6.J0().Zo();
        Iterator<String> it = this.J8.iterator();
        while (it.hasNext()) {
            String next = it.next();
            b40 b40VarJ0 = w30VarEi.J0(next);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.j6.XL(), next));
            try {
                g70VarZo.Ws(b40VarJ0.u7()).DW(fileOutputStream);
                fileOutputStream.close();
                it.remove();
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        }
    }

    private c80<m30> J8(ff0 ff0Var, ff0 ff0Var2, ff0 ff0Var3) {
        return this.lg.j6(n30.j6, ff0Var == null ? m30.FH : j3(ff0Var.tp(), this.j6), ff0Var2 == null ? m30.FH : j3(ff0Var2.tp(), this.j6), ff0Var3 == null ? m30.FH : j3(ff0Var3.tp(), this.j6));
    }

    private File P8(c80<m30> c80Var) throws IOException {
        a80 a80Var = new a80();
        File fileCreateTempFile = null;
        if (!this.Mr) {
            File fileXL = this.j6.XL();
            if (fileXL == null) {
                throw new UnsupportedOperationException();
            }
            fileCreateTempFile = new File(fileXL, this.u7.J0());
            try {
                a80Var.j6(new FileOutputStream(fileCreateTempFile), c80Var, Arrays.asList(this.tp), "UTF-8");
            } finally {
            }
        } else if (!c80Var.v5()) {
            fileCreateTempFile = File.createTempFile("merge_", "_temp", null);
            try {
                a80Var.j6(new FileOutputStream(fileCreateTempFile), c80Var, Arrays.asList(this.tp), "UTF-8");
            } finally {
            }
        }
        return fileCreateTempFile;
    }

    private boolean U2(int i) {
        t60 t60VarV5 = t60.v5(i);
        return t60VarV5 == t60.Zo || t60VarV5 == t60.VH;
    }

    private void Ws(File file) throws InterruptedException, IOException {
        if (file.isDirectory() || file.mkdirs()) {
            return;
        }
        File parentFile = file;
        while (parentFile != null && !parentFile.exists()) {
            parentFile = parentFile.getParentFile();
        }
        if (parentFile == null || parentFile.isDirectory()) {
            throw new IOException(JGitText.DW().cannotCreateDirectory);
        }
        cg0.j6(parentFile);
        if (!file.mkdirs()) {
            throw new IOException(JGitText.DW().cannotCreateDirectory);
        }
    }

    private boolean a8() {
        int iJ8 = this.u7.J8(3);
        boolean z = true;
        int iJ82 = this.u7.J8(1);
        if (!er(iJ8) || (this.u7.aM(3, 1) && iJ82 == iJ8)) {
            z = false;
        }
        if (z) {
            this.XL.put(this.u7.J0(), a.DIRTY_INDEX);
        }
        return z;
    }

    private static boolean er(int i) {
        return (i == 0 || t60.Hw.Hw(i)) ? false : true;
    }

    private static m30 j3(a70 a70Var, p70 p70Var) {
        return a70Var.aM(a70.ca()) ? new m30(new byte[0]) : new m30(p70Var.BT(a70Var, 3).Hw());
    }

    private boolean lg() {
        if (this.Mr) {
            return false;
        }
        int iJ8 = this.u7.J8(4);
        boolean z = true;
        int iJ82 = this.u7.J8(1);
        if (!er(iJ8) || (this.u7.aM(4, 1) && iJ82 == iJ8)) {
            z = false;
        }
        if (z) {
            if (U2(iJ8) && U2(iJ82)) {
                return false;
            }
            this.XL.put(this.u7.J0(), a.DIRTY_WORKTREE);
        }
        return z;
    }

    private int rN(int i, int i2, int i3) {
        return i2 == i3 ? i2 : i == i2 ? i3 == t60.u7.Zo() ? i2 : i3 : i == i3 ? i2 == t60.u7.Zo() ? i3 : i2 : t60.u7.Zo();
    }

    private void vy(ff0 ff0Var, ff0 ff0Var2, ff0 ff0Var3, c80<m30> c80Var, File file) throws InterruptedException, IOException {
        if (c80Var.v5()) {
            EQ(this.u7.Ws(), ff0Var, 1);
            EQ(this.u7.Ws(), ff0Var2, 2);
            EQ(this.u7.Ws(), ff0Var3, 3);
            this.QX.put(this.u7.J0(), c80Var);
            return;
        }
        b40 b40Var = new b40(this.u7.J0());
        int iRN = rN(this.u7.J8(0), this.u7.J8(1), this.u7.J8(2));
        b40Var.a8(iRN == t60.u7.Zo() ? t60.Zo : t60.v5(iRN));
        b40Var.lg(file.lastModified());
        b40Var.rN((int) file.length());
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            b40Var.yS(this.aM.Zo(3, file.length(), fileInputStream));
            this.EQ.VH(b40Var);
        } finally {
            fileInputStream.close();
            if (this.Mr) {
                cg0.j6(file);
            }
        }
    }

    private void we() {
        g70 g70VarZo = this.j6.J0().Zo();
        try {
            for (Map.Entry<String, b40> entry : this.Ws.entrySet()) {
                File file = new File(this.j6.XL(), entry.getKey());
                if (entry.getValue() != null) {
                    Ws(file.getParentFile());
                    z30.FH(this.j6, file, entry.getValue(), g70VarZo);
                } else if (!file.delete()) {
                    this.XL.put(entry.getKey(), a.COULD_NOT_DELETE);
                }
                this.J8.add(entry.getKey());
            }
        } finally {
            g70VarZo.XL();
        }
    }

    private boolean yS(ff0 ff0Var, ff0 ff0Var2, ff0 ff0Var3, x30 x30Var, kf0 kf0Var) throws InterruptedException, IOException {
        this.j3 = true;
        int iJ8 = this.u7.J8(1);
        int iJ82 = this.u7.J8(2);
        int iJ83 = this.u7.J8(0);
        if (iJ8 == 0 && iJ82 == 0 && iJ83 == 0) {
            return true;
        }
        if (a8()) {
            return false;
        }
        if (er(iJ8) && er(iJ82) && this.u7.aM(1, 2)) {
            if (iJ8 == iJ82) {
                EQ(this.u7.Ws(), ff0Var2, 0);
                return true;
            }
            int iRN = rN(iJ83, iJ8, iJ82);
            if (iRN == t60.u7.Zo()) {
                EQ(this.u7.Ws(), ff0Var, 1);
                EQ(this.u7.Ws(), ff0Var2, 2);
                EQ(this.u7.Ws(), ff0Var3, 3);
                this.J0.add(this.u7.J0());
                this.QX.put(this.u7.J0(), new c80<>(Collections.emptyList()));
                return true;
            }
            if (iRN == iJ8) {
                EQ(this.u7.Ws(), ff0Var2, 0);
            } else {
                if (lg()) {
                    return false;
                }
                this.Ws.put(this.u7.J0(), EQ(this.u7.Ws(), ff0Var3, 0));
            }
            return true;
        }
        if (er(iJ8) && iJ83 == iJ82 && this.u7.aM(0, 2)) {
            EQ(this.u7.Ws(), ff0Var2, 0);
            return true;
        }
        if (iJ83 == iJ8 && this.u7.aM(0, 1)) {
            if (lg()) {
                return false;
            }
            if (er(iJ82)) {
                b40 b40VarEQ = EQ(this.u7.Ws(), ff0Var3, 0);
                if (b40VarEQ != null) {
                    this.Ws.put(this.u7.J0(), b40VarEQ);
                }
                return true;
            }
            if (iJ82 == 0 && iJ83 != 0) {
                this.Ws.put(this.u7.J0(), null);
                return true;
            }
        }
        if (this.u7.a8()) {
            if (er(iJ8) && !er(iJ82)) {
                if (er(iJ83)) {
                    EQ(this.u7.Ws(), ff0Var, 1);
                }
                EQ(this.u7.Ws(), ff0Var2, 2);
                this.J0.add(this.u7.J0());
                this.j3 = false;
                return true;
            }
            if (er(iJ82) && !er(iJ8)) {
                if (er(iJ83)) {
                    EQ(this.u7.Ws(), ff0Var, 1);
                }
                EQ(this.u7.Ws(), ff0Var3, 3);
                this.J0.add(this.u7.J0());
                this.j3 = false;
                return true;
            }
            if (!er(iJ8)) {
                return true;
            }
        }
        if (er(iJ8) && er(iJ82)) {
            if (lg()) {
                return false;
            }
            c80<m30> c80VarJ8 = J8(ff0Var, ff0Var2, ff0Var3);
            vy(ff0Var, ff0Var2, ff0Var3, c80VarJ8, P8(c80VarJ8));
            if (c80VarJ8.v5()) {
                this.J0.add(this.u7.J0());
            }
            this.J8.add(this.u7.J0());
        } else if (iJ8 != iJ82 && ((iJ8 != 0 && !this.u7.aM(0, 1)) || (iJ82 != 0 && !this.u7.aM(0, 2)))) {
            EQ(this.u7.Ws(), ff0Var, 1);
            EQ(this.u7.Ws(), ff0Var2, 2);
            b40 b40VarEQ2 = EQ(this.u7.Ws(), ff0Var3, 3);
            if (iJ8 == 0) {
                if (lg()) {
                    return false;
                }
                if (er(iJ82) && b40VarEQ2 != null) {
                    this.Ws.put(this.u7.J0(), b40VarEQ2);
                }
            }
            this.J0.add(this.u7.J0());
            this.QX.put(this.u7.J0(), J8(ff0Var, ff0Var2, ff0Var3));
        }
        return true;
    }

    public void BT(kf0 kf0Var) {
        this.a8 = kf0Var;
    }

    @Override // abcd.e80
    public a70 Hw() {
        a70 a70Var = this.we;
        if (a70Var == null) {
            return null;
        }
        a70Var.cn();
        return a70Var;
    }

    public List<String> Mr() {
        return this.J0;
    }

    public boolean QX() {
        return this.XL.size() > 0;
    }

    @Override // abcd.e80
    public boolean VH() {
        boolean z;
        if (this.U2 == null) {
            this.U2 = FH().rN();
            z = true;
        } else {
            z = false;
        }
        try {
            this.EQ = this.U2.j6();
            x30 x30Var = new x30(this.EQ);
            if0 if0Var = new if0(this.j6);
            this.u7 = if0Var;
            if0Var.DW(u7());
            this.u7.j6(this.VH[0]);
            this.u7.j6(this.VH[1]);
            this.u7.DW(x30Var);
            if (this.a8 != null) {
                this.u7.DW(this.a8);
            }
            while (true) {
                if (this.u7.rN()) {
                    if (!yS((ff0) this.u7.QX(0, ff0.class), (ff0) this.u7.QX(1, ff0.class), (ff0) this.u7.QX(2, ff0.class), (x30) this.u7.QX(3, x30.class), this.a8 != null ? (kf0) this.u7.QX(4, kf0.class) : null)) {
                        J0();
                        break;
                    }
                    if (this.u7.a8() && this.j3) {
                        this.u7.FH();
                    }
                } else {
                    if (this.Mr) {
                        this.EQ.Hw();
                        this.EQ = null;
                    } else {
                        if (!this.EQ.j6()) {
                            J0();
                            throw new k40();
                        }
                        this.EQ = null;
                        we();
                    }
                    if (Mr().isEmpty()) {
                        this.we = this.U2.SI(this.aM);
                        return true;
                    }
                    this.we = null;
                }
            }
            if (z) {
                this.U2.P8();
            }
            return false;
        } finally {
            if (z) {
                this.U2.P8();
            }
        }
    }

    public Map<String, a> XL() {
        if (this.XL.size() == 0) {
            return null;
        }
        return this.XL;
    }

    public Map<String, c80<? extends p30>> aM() {
        return this.QX;
    }

    public void gW(String[] strArr) {
        this.tp = strArr;
    }
}
