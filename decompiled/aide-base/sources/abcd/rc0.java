package abcd;

import abcd.ae0;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class rc0 extends pc0 implements rd0 {
    private boolean Mr;
    private boolean U2;
    private boolean a8;
    private final boolean aM;
    private long er;
    private boolean j3;
    private boolean lg;
    private boolean rN;

    public rc0(kd0 kd0Var) {
        super(kd0Var);
        this.aM = this.Zo.lg();
    }

    private void BT(Map<String, ae0> map, j70 j70Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        gc0 gc0Var = new gc0(this.Zo.J8(), this.Hw.yS());
        try {
            Iterator<k70> it = Zo().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().DW());
            }
            hashSet.addAll(this.XL);
            for (ae0 ae0Var : map.values()) {
                if (!a70.ca().aM(ae0Var.DW())) {
                    hashSet2.add(ae0Var.DW());
                }
            }
            gc0Var.cn(true);
            gc0Var.ro(this.aM);
            gc0Var.nw(false);
            gc0Var.P8(this.a8);
            gc0Var.j3(j70Var, hashSet2, hashSet);
            gc0Var.x9(j70Var, j70Var, this.EQ);
            gc0Var.a8();
            this.er = gc0Var.QX().DW();
        } catch (Throwable th) {
            gc0Var.a8();
            throw th;
        }
    }

    private void er(Map<String, ae0> map) throws IOException {
        int iIndexOf;
        boolean z;
        String strYS = yS();
        if (!strYS.startsWith("unpack ")) {
            throw new y40(this.v5, MessageFormat.format(JGitText.DW().unexpectedReportLine, strYS));
        }
        String strSubstring = strYS.substring(7);
        if (!strSubstring.equals("ok")) {
            throw new j50(this.v5, MessageFormat.format(JGitText.DW().errorOccurredDuringUnpackingOnTheRemoteEnd, strSubstring));
        }
        while (true) {
            String strFH = this.we.FH();
            if (strFH == md0.FH) {
                for (ae0 ae0Var : map.values()) {
                    if (ae0Var.Hw() == ae0.a.AWAITING_REPORT) {
                        throw new y40(MessageFormat.format(JGitText.DW().expectedReportForRefNotReceived, this.v5, ae0Var.FH()));
                    }
                }
                return;
            }
            if (strFH.startsWith("ok ")) {
                iIndexOf = strFH.length();
                z = true;
            } else {
                iIndexOf = strFH.startsWith("ng ") ? strFH.indexOf(" ", 3) : -1;
                z = false;
            }
            if (iIndexOf == -1) {
                throw new y40(MessageFormat.format(JGitText.DW().unexpectedReportLine2, this.v5, strFH));
            }
            String strSubstring2 = strFH.substring(3, iIndexOf);
            String strSubstring3 = z ? null : strFH.substring(iIndexOf + 1);
            ae0 ae0Var2 = map.get(strSubstring2);
            if (ae0Var2 == null) {
                throw new y40(MessageFormat.format(JGitText.DW().unexpectedRefReport, this.v5, strSubstring2));
            }
            if (z) {
                ae0Var2.we(ae0.a.OK);
            } else {
                ae0Var2.we(ae0.a.REJECTED_OTHER_REASON);
                ae0Var2.EQ(strSubstring3);
            }
        }
    }

    private void gW(Collection<ae0> collection, j70 j70Var) throws IOException {
        String strRN = rN(j70Var);
        for (ae0 ae0Var : collection) {
            if (this.j3 || !ae0Var.VH()) {
                StringBuilder sb = new StringBuilder();
                k70 k70VarDW = DW(ae0Var.FH());
                sb.append((k70VarDW == null ? a70.ca() : k70VarDW.DW()).BT());
                sb.append(' ');
                sb.append(ae0Var.DW().BT());
                sb.append(' ');
                sb.append(ae0Var.FH());
                if (!this.lg) {
                    this.lg = true;
                    sb.append(strRN);
                }
                this.J0.VH(sb.toString());
                ae0Var.we(ae0.a.AWAITING_REPORT);
                if (!ae0Var.VH()) {
                    this.rN = true;
                }
            } else {
                ae0Var.we(ae0.a.REJECTED_NODELETE);
            }
        }
        if (j70Var.isCancelled()) {
            throw new j50(this.v5, JGitText.DW().pushCancelled);
        }
        this.J0.j6();
        this.J8 = false;
    }

    private String rN(j70 j70Var) {
        StringBuilder sb = new StringBuilder();
        this.Mr = a8(sb, "report-status");
        this.j3 = a8(sb, "delete-refs");
        this.a8 = a8(sb, "ofs-delta");
        boolean zA8 = a8(sb, "side-band-64k");
        this.U2 = zA8;
        if (zA8) {
            this.tp = new ce0(this.tp, j70Var, we());
            this.we = new md0(this.tp);
        }
        if (sb.length() > 0) {
            sb.setCharAt(0, (char) 0);
        }
        return sb.toString();
    }

    private String yS() {
        yg0 yg0Var = this.VH;
        if (yg0Var == null) {
            return this.we.FH();
        }
        int iFH = yg0Var.FH();
        try {
            this.VH.Zo(Math.max((int) Math.min(this.er, 28800000L), iFH) * 10);
            return this.we.FH();
        } finally {
            this.VH.Zo(iFH);
        }
    }

    @Override // abcd.pc0
    public j50 j3() {
        try {
            this.Zo.nw().close();
        } catch (s40 e) {
            return e;
        } catch (j50 | u40 unused) {
        }
        return new j50(this.v5, JGitText.DW().pushNotPermitted);
    }

    public void lg(j70 j70Var, Map<String, ae0> map) {
        int i;
        try {
            try {
                gW(map.values(), j70Var);
                if (this.rN) {
                    BT(map, j70Var);
                }
                if (this.lg) {
                    if (this.Mr) {
                        er(map);
                    }
                    if (this.U2 && (i = this.tp.read()) >= 0) {
                        throw new j50(this.v5, MessageFormat.format(JGitText.DW().expectedEOFReceived, Character.valueOf((char) i)));
                    }
                }
            } catch (j50 e) {
                throw e;
            } catch (Exception e2) {
                throw new j50(this.v5, e2.getMessage(), e2);
            }
        } finally {
            close();
        }
    }

    @Override // abcd.rd0
    public void tp(j70 j70Var, Map<String, ae0> map) throws j50 {
        J0();
        lg(j70Var, map);
    }
}
