package abcd;

import abcd.b30;
import abcd.n40;
import abcd.o80;
import abcd.y20;
import abcd.z20;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class c30 {
    private static /* synthetic */ int[] aM;
    private static /* synthetic */ int[] j3;
    private p70 DW;
    private g70 FH;
    private j70 J0;
    private y20.c J8;
    private z20 Zo;
    private final OutputStream j6;
    private o30 we;
    private static final byte[] Ws = r60.Hw("\\ No newline at end of file\n");
    private static final byte[] QX = new byte[0];
    private static final byte[] XL = new byte[0];
    private int Hw = 3;
    private int v5 = 7;
    private n30 VH = n30.j6;
    private int gn = 52428800;
    private String u7 = "a/";
    private String tp = "b/";
    private sf0 EQ = sf0.j6;

    private static class a {
        m30 DW;
        m30 FH;
        o80 j6;

        private a() {
        }

        public /* synthetic */ a(a aVar) {
            this();
        }
    }

    public c30(OutputStream outputStream) {
        this.j6 = outputStream;
    }

    public static /* synthetic */ int[] DW() {
        int[] iArr = j3;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[b30.b.valuesCustom().length];
        try {
            iArr2[b30.b.NEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[b30.b.OLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        j3 = iArr2;
        return iArr2;
    }

    private String EQ(h60 h60Var) {
        if (h60Var.VH() && this.DW != null) {
            try {
                h60Var = this.FH.gn(h60Var.QX(), this.v5);
            } catch (IOException unused) {
            }
        }
        return h60Var.we();
    }

    private void FH() {
        if (this.DW == null) {
            throw new IllegalStateException(JGitText.DW().repositoryIsRequired);
        }
    }

    private boolean Hw(List<d30> list, int i) {
        return list.get(i).v5() - list.get(i - 1).VH() <= this.Hw * 2;
    }

    private y20 KD(ef0 ef0Var) {
        return ef0Var instanceof kf0 ? y20.DW((kf0) ef0Var) : y20.j6(this.FH);
    }

    private static sf0 Mr(ef0 ef0Var, ef0 ef0Var2) {
        if ((ef0Var instanceof c40) && (ef0Var2 instanceof kf0)) {
            return new nf0(0, 1);
        }
        boolean z = ef0Var instanceof kf0;
        if (z && (ef0Var2 instanceof c40)) {
            return new nf0(1, 0);
        }
        sf0 sf0VarV5 = sf0.DW;
        if (z) {
            sf0VarV5 = mf0.v5(new of0(0), sf0VarV5);
        }
        return ef0Var2 instanceof kf0 ? mf0.v5(new of0(1), sf0VarV5) : sf0VarV5;
    }

    private boolean U2(List<b30> list) {
        String strV5 = ((c90) this.EQ).v5();
        for (b30 b30Var : list) {
            if (b30Var.FH() == b30.a.ADD && b30Var.gn().equals(strV5)) {
                return true;
            }
        }
        return false;
    }

    private List<b30> VH(List<b30> list) {
        this.we.U2();
        this.we.DW(list);
        return this.we.gn(this.FH, this.J0);
    }

    private void XL(ByteArrayOutputStream byteArrayOutputStream, b30 b30Var) throws IOException {
        b30.a aVarFH = b30Var.FH();
        String strEQ = b30Var.EQ();
        String strGn = b30Var.gn();
        t60 t60VarTp = b30Var.tp();
        t60 t60VarVH = b30Var.VH();
        byteArrayOutputStream.write(r60.Hw("diff --git "));
        StringBuilder sb = new StringBuilder(String.valueOf(this.u7));
        sb.append(aVarFH == b30.a.ADD ? strGn : strEQ);
        byteArrayOutputStream.write(r60.DW(yS(sb.toString())));
        byteArrayOutputStream.write(32);
        StringBuilder sb2 = new StringBuilder(String.valueOf(this.tp));
        sb2.append(aVarFH == b30.a.DELETE ? strEQ : strGn);
        byteArrayOutputStream.write(r60.DW(yS(sb2.toString())));
        byteArrayOutputStream.write(10);
        int i = j6()[aVarFH.ordinal()];
        if (i == 1) {
            byteArrayOutputStream.write(r60.Hw("new file mode "));
            t60VarVH.j6(byteArrayOutputStream);
            byteArrayOutputStream.write(10);
        } else if (i != 2) {
            if (i == 3) {
                byteArrayOutputStream.write(r60.Hw("deleted file mode "));
                t60VarTp.j6(byteArrayOutputStream);
                byteArrayOutputStream.write(10);
            } else if (i == 4) {
                byteArrayOutputStream.write(r60.Hw("similarity index " + b30Var.J0() + "%"));
                byteArrayOutputStream.write(10);
                byteArrayOutputStream.write(r60.DW("rename from " + yS(strEQ)));
                byteArrayOutputStream.write(10);
                byteArrayOutputStream.write(r60.DW("rename to " + yS(strGn)));
                byteArrayOutputStream.write(10);
            } else if (i == 5) {
                byteArrayOutputStream.write(r60.Hw("similarity index " + b30Var.J0() + "%"));
                byteArrayOutputStream.write(10);
                byteArrayOutputStream.write(r60.DW("copy from " + yS(strEQ)));
                byteArrayOutputStream.write(10);
                byteArrayOutputStream.write(r60.DW("copy to " + yS(strGn)));
                byteArrayOutputStream.write(10);
                if (!t60VarTp.equals(t60VarVH)) {
                    byteArrayOutputStream.write(r60.Hw("new file mode "));
                    t60VarVH.j6(byteArrayOutputStream);
                    byteArrayOutputStream.write(10);
                }
            }
        } else if (b30Var.J0() > 0) {
            byteArrayOutputStream.write(r60.Hw("dissimilarity index " + (100 - b30Var.J0()) + "%"));
            byteArrayOutputStream.write(10);
        }
        if ((aVarFH == b30.a.MODIFY || aVarFH == b30.a.RENAME) && !t60VarTp.equals(t60VarVH)) {
            byteArrayOutputStream.write(r60.Hw("old mode "));
            t60VarTp.j6(byteArrayOutputStream);
            byteArrayOutputStream.write(10);
            byteArrayOutputStream.write(r60.Hw("new mode "));
            t60VarVH.j6(byteArrayOutputStream);
            byteArrayOutputStream.write(10);
        }
        if (b30Var.u7().equals(b30Var.Zo())) {
            return;
        }
        aM(byteArrayOutputStream, b30Var);
    }

    private a Zo(b30 b30Var) throws IOException {
        e30 e30Var;
        o80.a aVar;
        a aVar2 = new a(null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        XL(byteArrayOutputStream, b30Var);
        if (b30Var.tp() == t60.gn || b30Var.VH() == t60.gn) {
            j3(byteArrayOutputStream, b30Var);
            cb(byteArrayOutputStream, b30Var);
            e30Var = new e30();
            aVar = o80.a.UNIFIED;
        } else {
            FH();
            byte[] bArrEr = er(b30.b.OLD, b30Var);
            byte[] bArrEr2 = er(b30.b.NEW, b30Var);
            byte[] bArr = XL;
            if (bArrEr == bArr || bArrEr2 == bArr || m30.v5(bArrEr) || m30.v5(bArrEr2)) {
                j3(byteArrayOutputStream, b30Var);
                byteArrayOutputStream.write(r60.Hw("Binary files differ\n"));
                e30Var = new e30();
                aVar = o80.a.BINARY;
            } else {
                aVar2.DW = new m30(bArrEr);
                m30 m30Var = new m30(bArrEr2);
                aVar2.FH = m30Var;
                e30Var = gn(aVar2.DW, m30Var);
                aVar = o80.a.UNIFIED;
                int i = j6()[b30Var.FH().ordinal()];
                if ((i != 4 && i != 5) || !e30Var.isEmpty()) {
                    j3(byteArrayOutputStream, b30Var);
                }
            }
        }
        aVar2.j6 = new o80(byteArrayOutputStream.toByteArray(), e30Var, aVar);
        return aVar2;
    }

    private boolean a8(String str) {
        return false;
    }

    private void cb(OutputStream outputStream, b30 b30Var) throws IOException {
        if (b30Var.tp() == t60.gn) {
            outputStream.write(r60.Hw("-Subproject commit " + b30Var.u7().we() + "\n"));
        }
        if (b30Var.VH() == t60.gn) {
            outputStream.write(r60.Hw("+Subproject commit " + b30Var.Zo().we() + "\n"));
        }
    }

    private void ef(char c, int i, int i2) throws IOException {
        this.j6.write(32);
        this.j6.write(c);
        if (i2 == 0) {
            this.j6.write(r60.FH(i - 1));
            this.j6.write(44);
            this.j6.write(48);
        } else {
            if (i2 == 1) {
                this.j6.write(r60.FH(i));
                return;
            }
            this.j6.write(r60.FH(i));
            this.j6.write(44);
            this.j6.write(r60.FH(i2));
        }
    }

    private byte[] er(b30.b bVar, b30 b30Var) throws e40, q40 {
        if (b30Var.v5(bVar) == t60.u7) {
            return QX;
        }
        if (b30Var.v5(bVar).VH() != 3) {
            return QX;
        }
        if (a8(b30Var.we(bVar))) {
            return XL;
        }
        h60 h60VarHw = b30Var.Hw(bVar);
        if (!h60VarHw.VH()) {
            Collection<a70> collectionAM = this.FH.aM(h60VarHw);
            if (collectionAM.size() != 1) {
                if (collectionAM.size() == 0) {
                    throw new q40(h60VarHw, 3);
                }
                throw new e40(h60VarHw, collectionAM);
            }
            h60VarHw = h60.DW(collectionAM.iterator().next());
            int i = DW()[bVar.ordinal()];
            if (i == 1) {
                b30Var.VH = h60VarHw;
            } else if (i == 2) {
                b30Var.gn = h60VarHw;
            }
        }
        try {
            return this.J8.DW(bVar, b30Var).FH(this.gn);
        } catch (n40.a unused) {
            return XL;
        } catch (n40.b unused2) {
            return XL;
        } catch (n40.c unused3) {
            return XL;
        } catch (n40 e) {
            e.FH(h60VarHw.QX());
            throw e;
        }
    }

    private e30 gn(m30 m30Var, m30 m30Var2) {
        return this.Zo.Hw(this.VH, m30Var, m30Var2);
    }

    private void j3(ByteArrayOutputStream byteArrayOutputStream, b30 b30Var) {
        String strYS;
        if (b30Var.VH.equals(b30Var.gn)) {
            return;
        }
        int i = j6()[b30Var.FH().ordinal()];
        String strYS2 = "/dev/null";
        if (i == 1) {
            strYS = yS(String.valueOf(this.tp) + b30Var.gn());
        } else if (i != 3) {
            strYS2 = yS(String.valueOf(this.u7) + b30Var.EQ());
            strYS = yS(String.valueOf(this.tp) + b30Var.gn());
        } else {
            strYS2 = yS(String.valueOf(this.u7) + b30Var.EQ());
            strYS = "/dev/null";
        }
        byteArrayOutputStream.write(r60.DW("--- " + strYS2 + "\n"));
        byteArrayOutputStream.write(r60.DW("+++ " + strYS + "\n"));
    }

    public static /* synthetic */ int[] j6() {
        int[] iArr = aM;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[b30.a.valuesCustom().length];
        try {
            iArr2[b30.a.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[b30.a.COPY.ordinal()] = 5;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[b30.a.DELETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b30.a.MODIFY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b30.a.RENAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        aM = iArr2;
        return iArr2;
    }

    private boolean lg(m30 m30Var, int i) {
        return i + 1 == m30Var.j6() && m30Var.VH();
    }

    private static boolean rN(b30 b30Var) {
        return b30Var.FH() == b30.a.RENAME || b30Var.FH() == b30.a.COPY;
    }

    private List<b30> ro(List<b30> list) {
        String strV5 = ((c90) this.EQ).v5();
        for (b30 b30Var : list) {
            if (rN(b30Var) && b30Var.gn().equals(strV5)) {
                this.EQ = c90.Hw(b30Var.EQ());
                return Collections.singletonList(b30Var);
            }
        }
        return Collections.emptyList();
    }

    private int tp(List<d30> list, int i) {
        while (true) {
            i++;
            if (i >= list.size() || (!Hw(list, i) && !v5(list, i))) {
                break;
            }
        }
        return i - 1;
    }

    private static boolean u7(d30 d30Var, int i, int i2) {
        return d30Var.VH() <= i && d30Var.gn() <= i2;
    }

    private boolean v5(List<d30> list, int i) {
        return list.get(i).Zo() - list.get(i - 1).gn() <= this.Hw * 2;
    }

    private static String yS(String str) {
        return jg0.j6.FH(str);
    }

    public List<b30> BT(s90 s90Var, s90 s90Var2) {
        FH();
        ff0 ff0Var = new ff0();
        ff0 ff0Var2 = new ff0();
        ff0Var.KD(this.FH, s90Var);
        ff0Var2.KD(this.FH, s90Var2);
        return vy(ff0Var, ff0Var2);
    }

    public void J0(b30 b30Var) throws IOException {
        a aVarZo = Zo(b30Var);
        QX(aVarZo.j6, aVarZo.DW, aVarZo.FH);
    }

    public void J8(e30 e30Var, m30 m30Var, m30 m30Var2) throws IOException {
        int i = 0;
        while (i < e30Var.size()) {
            d30 d30Var = e30Var.get(i);
            int iTp = tp(e30Var, i);
            d30 d30Var2 = e30Var.get(iTp);
            int iMax = Math.max(0, d30Var.v5() - this.Hw);
            int iMax2 = Math.max(0, d30Var.Zo() - this.Hw);
            int iMin = Math.min(m30Var.j6(), d30Var2.VH() + this.Hw);
            int iMin2 = Math.min(m30Var2.j6(), d30Var2.gn() + this.Hw);
            dx(iMax, iMin, iMax2, iMin2);
            while (true) {
                if (iMax < iMin || iMax2 < iMin2) {
                    if (iMax < d30Var.v5() || iTp + 1 < i) {
                        sh(m30Var, iMax);
                        if (lg(m30Var, iMax)) {
                            this.j6.write(Ws);
                        }
                        iMax++;
                    } else {
                        if (iMax < d30Var.VH()) {
                            Sf(m30Var, iMax);
                            if (lg(m30Var, iMax)) {
                                this.j6.write(Ws);
                            }
                            iMax++;
                        } else if (iMax2 < d30Var.gn()) {
                            cn(m30Var2, iMax2);
                            if (lg(m30Var2, iMax2)) {
                                this.j6.write(Ws);
                            }
                        }
                        if (!u7(d30Var, iMax, iMax2) && (i = i + 1) < e30Var.size()) {
                            d30Var = e30Var.get(i);
                        }
                    }
                    iMax2++;
                    if (!u7(d30Var, iMax, iMax2)) {
                    }
                }
            }
        }
    }

    public void P8(boolean z) {
        if (z && this.we == null) {
            FH();
            this.we = new o30(this.DW);
        } else {
            if (z) {
                return;
            }
            this.we = null;
        }
    }

    public void QX(o80 o80Var, m30 m30Var, m30 m30Var2) throws IOException {
        int iLg = o80Var.lg();
        int iMr = o80Var.Mr();
        if (!o80Var.U2().isEmpty()) {
            iMr = o80Var.U2().get(0).v5();
        }
        this.j6.write(o80Var.j3(), iLg, iMr - iLg);
        if (o80Var.a8() == o80.a.UNIFIED) {
            J8(o80Var.KD(), m30Var, m30Var2);
        }
    }

    public void SI(p70 p70Var) {
        g70 g70Var = this.FH;
        if (g70Var != null) {
            g70Var.XL();
        }
        this.DW = p70Var;
        g70 g70VarYS = p70Var.yS();
        this.FH = g70VarYS;
        y20 y20VarJ6 = y20.j6(g70VarYS);
        this.J8 = new y20.c(y20VarJ6, y20VarJ6);
        a30 a30Var = (a30) this.DW.gn().tp(a30.Hw);
        if (a30Var.DW()) {
            nw("");
            ei("");
        }
        P8(a30Var.FH());
        this.Zo = z20.Zo((z20.a) this.DW.gn().J8("diff", null, "algorithm", z20.a.HISTOGRAM));
    }

    public void Sf(m30 m30Var, int i) throws IOException {
        sG('-', m30Var, i);
    }

    public void Ws(j60 j60Var, j60 j60Var2) throws IOException {
        we(gW(j60Var, j60Var2));
    }

    public void aM(OutputStream outputStream, b30 b30Var) throws IOException {
        outputStream.write(r60.Hw("index " + EQ(b30Var.u7()) + ".." + EQ(b30Var.Zo())));
        if (b30Var.tp().equals(b30Var.VH())) {
            outputStream.write(32);
            b30Var.VH().j6(outputStream);
        }
        outputStream.write(10);
    }

    public void cn(m30 m30Var, int i) throws IOException {
        sG('+', m30Var, i);
    }

    public void dx(int i, int i2, int i3, int i4) throws IOException {
        this.j6.write(64);
        this.j6.write(64);
        ef('-', i + 1, i2 - i);
        ef('+', i3 + 1, i4 - i3);
        this.j6.write(32);
        this.j6.write(64);
        this.j6.write(64);
        this.j6.write(10);
    }

    public void ei(String str) {
        this.tp = str;
    }

    public List<b30> gW(j60 j60Var, j60 j60Var2) {
        FH();
        t90 t90Var = new t90(this.FH);
        return BT(t90Var.sy(j60Var), t90Var.sy(j60Var2));
    }

    public void nw(String str) {
        this.u7 = str;
    }

    public void sG(char c, m30 m30Var, int i) throws IOException {
        this.j6.write(c);
        m30Var.gn(this.j6, i);
        this.j6.write(10);
    }

    public void sh(m30 m30Var, int i) throws IOException {
        sG(' ', m30Var, i);
    }

    public List<b30> vy(ef0 ef0Var, ef0 ef0Var2) {
        FH();
        jf0 jf0Var = new jf0(this.FH);
        jf0Var.DW(ef0Var);
        jf0Var.DW(ef0Var2);
        jf0Var.KD(true);
        sf0 sf0VarMr = Mr(ef0Var, ef0Var2);
        sf0 sf0Var = this.EQ;
        if (sf0Var instanceof c90) {
            jf0Var.SI(mf0.v5(pf0.v5(((c90) sf0Var).v5()), sf0VarMr));
        } else {
            jf0Var.SI(mf0.v5(sf0Var, sf0VarMr));
        }
        this.J8 = new y20.c(KD(ef0Var), KD(ef0Var2));
        List<b30> listWs = b30.Ws(jf0Var);
        if (!(this.EQ instanceof c90) || !U2(listWs)) {
            return this.we != null ? VH(listWs) : listWs;
        }
        ef0Var.er();
        ef0Var2.er();
        jf0Var.P8();
        jf0Var.DW(ef0Var);
        jf0Var.DW(ef0Var2);
        jf0Var.SI(sf0VarMr);
        if (this.we == null) {
            P8(true);
        }
        return ro(VH(b30.Ws(jf0Var)));
    }

    public void we(List<? extends b30> list) throws IOException {
        Iterator<? extends b30> it = list.iterator();
        while (it.hasNext()) {
            J0(it.next());
        }
    }
}
