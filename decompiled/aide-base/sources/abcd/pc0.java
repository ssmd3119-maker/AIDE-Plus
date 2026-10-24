package abcd;

import abcd.c70;
import abcd.k70;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class pc0 extends nc0 {
    protected OutputStream EQ;
    protected final p70 Hw;
    protected nd0 J0;
    protected boolean J8;
    protected yg0 VH;
    protected boolean Ws;
    protected final le0 Zo;
    protected zg0 gn;
    protected InputStream tp;
    private tg0 u7;
    protected final ue0 v5;
    protected md0 we;
    private final Set<String> QX = new HashSet();
    protected final Set<a70> XL = new HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public pc0(kd0 kd0Var) {
        le0 le0Var = (le0) kd0Var;
        this.Zo = le0Var;
        this.Hw = le0Var.j6;
        this.v5 = le0Var.DW;
    }

    private void U2() throws IOException {
        int iIndexOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            try {
                String strFH = this.we.FH();
                if (strFH == md0.FH) {
                    EQ(linkedHashMap);
                    return;
                }
                if (strFH.startsWith("ERR ")) {
                    throw new z40(this.v5, strFH.substring(4));
                }
                if (linkedHashMap.isEmpty() && (iIndexOf = strFH.indexOf(0)) >= 0) {
                    for (String str : strFH.substring(iIndexOf + 1).split(" ")) {
                        this.QX.add(str);
                    }
                    strFH = strFH.substring(0, iIndexOf);
                }
                String strSubstring = strFH.substring(41, strFH.length());
                if (!linkedHashMap.isEmpty() || !strSubstring.equals("capabilities^{}")) {
                    a70 a70VarVJ = a70.vJ(strFH.substring(0, 40));
                    if (strSubstring.equals(".have")) {
                        this.XL.add(a70VarVJ);
                    } else if (strSubstring.endsWith("^{}")) {
                        String strSubstring2 = strSubstring.substring(0, strSubstring.length() - 3);
                        k70 k70Var = (k70) linkedHashMap.get(strSubstring2);
                        if (k70Var == null) {
                            throw new y40(this.v5, MessageFormat.format(JGitText.DW().advertisementCameBefore, strSubstring2, strSubstring2));
                        }
                        if (k70Var.FH() != null) {
                            throw Ws(String.valueOf(strSubstring2) + "^{}");
                        }
                        linkedHashMap.put(strSubstring2, new c70.b(k70.a.NETWORK, strSubstring2, k70Var.DW(), a70VarVJ));
                    } else if (((k70) linkedHashMap.put(strSubstring, new c70.a(k70.a.NETWORK, strSubstring, a70VarVJ))) != null) {
                        throw Ws(strSubstring);
                    }
                }
            } catch (EOFException e) {
                if (!linkedHashMap.isEmpty()) {
                    throw e;
                }
                throw j3();
            }
        }
    }

    private y40 Ws(String str) {
        return new y40(this.v5, MessageFormat.format(JGitText.DW().duplicateAdvertisementsOf, str));
    }

    public void Mr() {
        try {
            U2();
        } catch (j50 e) {
            close();
            throw e;
        } catch (IOException e2) {
            close();
            throw new j50(e2.getMessage(), e2);
        } catch (RuntimeException e3) {
            close();
            throw new j50(e3.getMessage(), e3);
        }
    }

    public void QX() {
        if (!this.J8 || this.EQ == null) {
            return;
        }
        try {
            this.J8 = false;
            this.J0.j6();
        } catch (IOException unused) {
            try {
                this.EQ.close();
            } catch (IOException unused2) {
            } catch (Throwable th) {
                this.EQ = null;
                this.J0 = null;
                throw th;
            }
            this.EQ = null;
            this.J0 = null;
        }
    }

    public final void XL(InputStream inputStream, OutputStream outputStream) {
        int iQX = this.Zo.QX();
        if (iQX > 0) {
            this.u7 = new tg0(String.valueOf(Thread.currentThread().getName()) + "-Timer");
            this.VH = new yg0(inputStream, this.u7);
            this.gn = new zg0(outputStream, this.u7);
            int i = iQX * 1000;
            this.VH.Zo(i);
            this.gn.FH(i);
            inputStream = this.VH;
            outputStream = this.gn;
        }
        this.tp = inputStream;
        this.EQ = outputStream;
        this.we = new md0(this.tp);
        this.J0 = new nd0(this.EQ);
        this.J8 = true;
    }

    public boolean a8(StringBuilder sb, String str) {
        if (!aM(str)) {
            return false;
        }
        sb.append(' ');
        sb.append(str);
        return true;
    }

    public boolean aM(String str) {
        return this.QX.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // abcd.tc0
    public void close() {
        if (this.EQ != null) {
            try {
                if (this.J8) {
                    this.J8 = false;
                    this.J0.j6();
                }
                this.EQ.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.EQ = null;
                this.J0 = null;
                throw th;
            }
            this.EQ = null;
            this.J0 = null;
        }
        InputStream inputStream = this.tp;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                this.tp = null;
                this.we = null;
                throw th2;
            }
            this.tp = null;
            this.we = null;
        }
        tg0 tg0Var = this.u7;
        if (tg0Var != null) {
            try {
                tg0Var.FH();
            } finally {
                this.u7 = null;
                this.VH = null;
                this.gn = null;
            }
        }
    }

    public j50 j3() {
        return new s40(this.v5, JGitText.DW().notFound);
    }
}
