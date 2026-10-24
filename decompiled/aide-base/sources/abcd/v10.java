package abcd;

import abcd.f10;
import abcd.n70;
import abcd.w10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class v10 extends m10<w10> {
    private static /* synthetic */ int[] EQ;
    private static /* synthetic */ int[] gn;
    private static /* synthetic */ int[] tp;
    private static /* synthetic */ int[] u7;
    private b FH;
    private k90 Hw;
    private final File VH;
    private final t90 Zo;
    private j70 v5;

    enum a {
        PICK("pick");

        private final String WB;

        a(String str) {
            this.WB = str;
        }

        public static a j6(String str) {
            if (str.equals("pick") || str.equals("p")) {
                return PICK;
            }
            throw new o20(MessageFormat.format("Unknown or unsupported command \"{0}\", only  \"pick\" is allowed", str));
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }

        public String DW() {
            return this.WB;
        }
    }

    public enum b {
        BEGIN,
        CONTINUE,
        SKIP,
        ABORT;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            int length = bVarArrValuesCustom.length;
            b[] bVarArr = new b[length];
            System.arraycopy(bVarArrValuesCustom, 0, bVarArr, 0, length);
            return bVarArr;
        }
    }

    static class c {
        byte[] DW;
        h60 j6;

        public c(a aVar) {
        }
    }

    public v10(p70 p70Var) {
        super(p70Var);
        this.FH = b.BEGIN;
        this.v5 = x60.j6;
        this.Zo = new t90(p70Var);
        this.VH = new File(p70Var.u7(), "rebase-merge");
    }

    private boolean EQ(k90 k90Var) {
        try {
            k90 k90VarCa = this.Zo.ca(this.j6.ro("HEAD"));
            z30 z30Var = new z30(this.j6, k90VarCa.Eq(), this.j6.rN(), k90Var.Eq());
            z30Var.j3(true);
            z30Var.DW();
            n70 n70VarSf = this.j6.Sf("HEAD", true);
            n70VarSf.lg(k90VarCa);
            n70VarSf.er(k90Var);
            int i = Zo()[n70VarSf.VH().ordinal()];
            if (i != 3 && i != 5 && i != 6) {
                throw new IOException("Could not rewind to upstream commit");
            }
            return true;
        } finally {
            this.Zo.lp();
            this.v5.FH();
        }
    }

    public static /* synthetic */ int[] Hw() {
        int[] iArr = u7;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[f10.a.values().length];
        try {
            iArr2[f10.a.jw.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[f10.a.mb.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[f10.a.WB.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        u7 = iArr2;
        return iArr2;
    }

    private k90 J0() throws w20, r20 {
        w30 w30VarEi = this.j6.ei();
        if (w30VarEi.Ws()) {
            throw new w20();
        }
        jf0 jf0Var = new jf0(this.j6);
        jf0Var.P8();
        jf0Var.KD(true);
        jf0Var.DW(new c40(w30VarEi));
        a70 a70VarRo = this.j6.ro("HEAD^{tree}");
        if (a70VarRo == null) {
            throw new r20(JGitText.DW().cannotRebaseWithoutCurrentHead);
        }
        jf0Var.j6(a70VarRo);
        jf0Var.SI(sf0.DW);
        boolean zRN = jf0Var.rN();
        jf0Var.vy();
        if (!zRN) {
            return null;
        }
        h10 h10VarGn = new l10(this.j6).gn();
        h10VarGn.we(Mr(this.VH, "message"));
        h10VarGn.EQ(XL());
        return h10VarGn.call();
    }

    private void J8(File file, String str, String str2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str));
        try {
            fileOutputStream.write(str2.getBytes("UTF-8"));
            fileOutputStream.write(10);
        } finally {
            fileOutputStream.close();
        }
    }

    private String Mr(File file, String str) {
        byte[] bArrFH = eg0.FH(new File(file, str));
        int length = bArrFH.length;
        while (length > 0 && bArrFH[length - 1] == 10) {
            length--;
        }
        return kg0.gn(bArrFH, 0, length);
    }

    private List<c> QX() {
        byte[] bArrFH = eg0.FH(new File(this.VH, "git-rebase-todo"));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bArrFH.length) {
            int iAM = kg0.aM(bArrFH, i);
            c cVar = null;
            int i2 = 0;
            int iXL = 0;
            while (i2 < 3 && iXL < iAM) {
                if (i2 == 0) {
                    iXL = kg0.XL(bArrFH, i, ' ');
                    String str = new String(bArrFH, i, (iXL - i) - 1);
                    if (str.charAt(0) == '#') {
                        i = iXL;
                        i2 = 3;
                    } else {
                        if (a.j6(str) != null) {
                            cVar = new c(a.j6(str));
                        }
                        i = iXL;
                    }
                } else if (i2 != 1) {
                    if (i2 == 2 && cVar != null) {
                        int i3 = iAM - i;
                        byte[] bArr = new byte[i3];
                        cVar.DW = bArr;
                        System.arraycopy(bArrFH, i, bArr, 0, i3);
                        arrayList.add(cVar);
                        iXL = iAM;
                    }
                } else if (cVar != null) {
                    iXL = kg0.XL(bArrFH, i, ' ');
                    cVar.j6 = h60.FH(new String(bArrFH, i, (iXL - i) - 1));
                    i = iXL;
                }
                i2++;
            }
            i = iAM;
        }
        return arrayList;
    }

    public static /* synthetic */ int[] VH() {
        int[] iArr = EQ;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[s70.valuesCustom().length];
        try {
            iArr2[s70.APPLY.ordinal()] = 9;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[s70.BARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[s70.BISECTING.ordinal()] = 12;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[s70.CHERRY_PICKING.ordinal()] = 5;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[s70.CHERRY_PICKING_RESOLVED.ordinal()] = 6;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[s70.MERGING.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[s70.MERGING_RESOLVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[s70.REBASING.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[s70.REBASING_INTERACTIVE.ordinal()] = 11;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[s70.REBASING_MERGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[s70.REBASING_REBASING.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[s70.SAFE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        EQ = iArr2;
        return iArr2;
    }

    private w10 Ws() throws v20, InterruptedException, r20, IOException {
        k70 k70VarJ8 = this.j6.J8("HEAD");
        if (k70VarJ8 == null || k70VarJ8.DW() == null) {
            throw new v20(MessageFormat.format(JGitText.DW().refNotResolved, "HEAD"));
        }
        String name = k70VarJ8.gn() ? k70VarJ8.VH().getName() : "detached HEAD";
        a70 a70VarDW = k70VarJ8.DW();
        if (a70VarDW == null) {
            throw new v20(MessageFormat.format(JGitText.DW().refNotResolved, "HEAD"));
        }
        k90 k90VarRo = this.Zo.ro(a70VarDW);
        t90 t90Var = this.Zo;
        k90 k90Var = this.Hw;
        k90Var.sy();
        k90 k90VarRo2 = t90Var.ro(k90Var);
        if (this.Zo.P8(k90VarRo2, k90VarRo)) {
            return w10.Hw;
        }
        if (this.Zo.P8(k90VarRo, k90VarRo2)) {
            this.v5.j6(MessageFormat.format(JGitText.DW().resettingHead, this.Hw.Xa()), 0);
            EQ(this.Hw);
            this.v5.FH();
            vy(name, this.Hw);
            return w10.v5;
        }
        this.v5.j6(JGitText.DW().obtainingCommitsForCherryPick, 0);
        p10 p10VarEQ = new l10(this.j6).EQ();
        p10VarEQ.Zo(this.Hw, k90VarRo);
        Iterable<k90> iterableCall = p10VarEQ.call();
        ArrayList<k90> arrayList = new ArrayList();
        for (k90 k90Var2 : iterableCall) {
            if (k90Var2.et() != 1) {
                throw new o20(MessageFormat.format(JGitText.DW().canOnlyCherryPickCommitsWithOneParent, k90Var2.BT(), Integer.valueOf(k90Var2.et())));
            }
            arrayList.add(k90Var2);
        }
        Collections.reverse(arrayList);
        cg0.FH(this.VH);
        J8(this.j6.u7(), "ORIG_HEAD", a70VarDW.BT());
        J8(this.VH, "head", a70VarDW.BT());
        J8(this.VH, "head-name", name);
        J8(this.VH, "onto", this.Hw.BT());
        J8(this.VH, "interactive", "");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(this.VH, "git-rebase-todo")), "UTF-8"));
        bufferedWriter.write("# Created by EGit: rebasing " + this.Hw.BT() + " onto " + a70VarDW.BT());
        bufferedWriter.newLine();
        try {
            StringBuilder sb = new StringBuilder();
            g70 g70VarLg = this.Zo.lg();
            for (k90 k90Var3 : arrayList) {
                sb.setLength(0);
                sb.append(a.PICK.DW());
                sb.append(" ");
                sb.append(g70VarLg.VH(k90Var3).we());
                sb.append(" ");
                sb.append(k90Var3.Xa());
                bufferedWriter.write(sb.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            this.v5.FH();
            this.v5.j6(MessageFormat.format(JGitText.DW().rewinding, this.Hw.Xa()), 0);
            try {
                if (!EQ(this.Hw)) {
                }
                this.v5.FH();
                return null;
            } finally {
                cg0.DW(this.VH, 1);
            }
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    private i70 XL() {
        try {
            return aM(eg0.FH(new File(this.VH, "author-script")));
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static /* synthetic */ int[] Zo() {
        int[] iArr = tp;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[n70.c.valuesCustom().length];
        try {
            iArr2[n70.c.FAST_FORWARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[n70.c.FORCED.ordinal()] = 5;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[n70.c.IO_FAILURE.ordinal()] = 9;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[n70.c.LOCK_FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n70.c.NEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n70.c.NOT_ATTEMPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[n70.c.NO_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[n70.c.REJECTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[n70.c.REJECTED_CURRENT_BRANCH.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[n70.c.RENAMED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        tp = iArr2;
        return iArr2;
    }

    private w10 er(k90 k90Var) throws InterruptedException, IOException {
        J8(this.VH, "author-script", yS(k90Var.yO()));
        J8(this.VH, "message", k90Var.jJ());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c30 c30Var = new c30(byteArrayOutputStream);
        c30Var.SI(this.j6);
        c30Var.Ws(k90Var.wc(0), k90Var);
        J8(this.VH, "patch", new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
        J8(this.VH, "stopped-sha", this.j6.yS().VH(k90Var).we());
        this.j6.vJ(null);
        return new w10(k90Var);
    }

    private k90 gW(String str, k90 k90Var, k90 k90Var2) throws IOException {
        boolean z = false;
        for (k90 k90Var3 : k90Var2.CU()) {
            if (k90Var3.aM(k90Var)) {
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        c10 c10Var = new c10(this.j6);
        try {
            c10Var.J0(k90Var2.BT());
            c10Var.call();
            if (str.startsWith("refs/heads/")) {
                n70 n70VarEf = this.j6.ef(str);
                n70VarEf.lg(k90Var);
                n70VarEf.er(k90Var2);
                n70VarEf.BT("Fast-foward from " + k90Var.BT() + " to " + k90Var2.BT(), false);
                int i = Zo()[n70VarEf.nw(this.Zo).ordinal()];
                if (i != 3 && i != 5 && i != 6) {
                    throw new IOException("Could not fast-forward");
                }
            }
            return k90Var2;
        } catch (m20 e) {
            throw new o20(e.getMessage(), e);
        } catch (u20 e2) {
            throw new o20(e2.getMessage(), e2);
        } catch (v20 e3) {
            throw new o20(e3.getMessage(), e3);
        }
    }

    private w10 gn(w10 w10Var) {
        try {
            String strMr = Mr(this.j6.u7(), "ORIG_HEAD");
            this.v5.j6(MessageFormat.format(JGitText.DW().abortingRebase, strMr), 0);
            k90 k90VarCa = this.Zo.ca(this.j6.ro(strMr));
            z30 z30Var = w10Var.j6().equals(w10.a.fY) ? new z30(this.j6, this.Zo.ca(this.j6.ro("HEAD")).Eq(), this.j6.rN(), k90VarCa.Eq()) : new z30(this.j6, this.j6.rN(), k90VarCa.Eq());
            z30Var.j3(false);
            z30Var.DW();
            this.Zo.lp();
            try {
                String strMr2 = Mr(this.VH, "head-name");
                if (strMr2.startsWith("refs/")) {
                    this.v5.j6(MessageFormat.format(JGitText.DW().resettingHead, strMr2), 0);
                    int i = Zo()[this.j6.Sf("HEAD", false).j3(strMr2).ordinal()];
                    if (i != 3 && i != 5 && i != 6) {
                        throw new o20(JGitText.DW().abortingRebaseFailed);
                    }
                }
                cg0.DW(this.VH, 1);
                this.j6.vJ(null);
                return w10Var;
            } finally {
            }
        } finally {
        }
    }

    private void j3(int i) throws IOException {
        String line;
        if (i == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = new File(this.VH, "git-rebase-todo");
        File file2 = new File(this.VH, "done");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        while (true) {
            try {
                boolean z = true;
                if (arrayList2.size() >= i || (line = bufferedReader.readLine()) == null) {
                    break;
                }
                boolean z2 = false;
                if (line.charAt(0) != '#') {
                    int iIndexOf = line.indexOf(32);
                    if (iIndexOf >= 0) {
                        if (a.j6(line.substring(0, iIndexOf)) == null) {
                            z = false;
                        }
                        z2 = z;
                    }
                    if (z2) {
                        arrayList2.add(line);
                    } else {
                        arrayList.add(line);
                    }
                }
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        }
        for (String line2 = bufferedReader.readLine(); line2 != null; line2 = bufferedReader.readLine()) {
            arrayList.add(line2);
        }
        bufferedReader.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bufferedWriter.write((String) it.next());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            if (arrayList2.size() > 0) {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true), "UTF-8"));
                try {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        bufferedWriter.write((String) it2.next());
                        bufferedWriter.newLine();
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    private void tp() throws x20 {
        if (this.FH != b.BEGIN) {
            if (VH()[this.j6.QX().ordinal()] != 11) {
                throw new x20(MessageFormat.format(JGitText.DW().wrongRepositoryState, this.j6.QX().name()));
            }
        } else {
            if (VH()[this.j6.QX().ordinal()] != 2) {
                throw new x20(MessageFormat.format(JGitText.DW().wrongRepositoryState, this.j6.QX().name()));
            }
            if (this.Hw == null) {
                throw new o20(MessageFormat.format(JGitText.DW().missingRequiredParameter, "upstream"));
            }
        }
    }

    public static /* synthetic */ int[] v5() {
        int[] iArr = gn;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[b.valuesCustom().length];
        try {
            iArr2[b.ABORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[b.BEGIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[b.CONTINUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b.SKIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        gn = iArr2;
        return iArr2;
    }

    private void vy(String str, k90 k90Var) {
        if (str.startsWith("refs/")) {
            n70 n70VarEf = this.j6.ef(str);
            n70VarEf.er(k90Var);
            int i = Zo()[n70VarEf.VH().ordinal()];
            if (i != 3 && i != 5 && i != 6) {
                throw new o20("Updating HEAD failed");
            }
            int i2 = Zo()[this.j6.ef("HEAD").j3(str).ordinal()];
            if (i2 != 3 && i2 != 5 && i2 != 6) {
                throw new o20("Updating HEAD failed");
            }
        }
    }

    private k90 we() throws j40, r20 {
        a70 a70VarRo = this.j6.ro("HEAD^{tree}");
        if (a70VarRo == null) {
            throw new r20(JGitText.DW().cannotRebaseWithoutCurrentHead);
        }
        w30 w30VarRN = this.j6.rN();
        try {
            z30 z30Var = new z30(this.j6, w30VarRN, a70VarRo);
            z30Var.j3(false);
            if (z30Var.DW()) {
                Iterator<String> it = z30Var.u7().iterator();
                while (it.hasNext()) {
                    File file = new File(this.j6.XL(), it.next());
                    if (file.exists()) {
                        cg0.DW(file, 3);
                    }
                }
            }
            w30VarRN.P8();
            t90 t90Var = new t90(this.j6);
            k90 k90VarCa = t90Var.ca(this.j6.ro("HEAD"));
            t90Var.lp();
            return k90VarCa;
        } catch (Throwable th) {
            w30VarRN.P8();
            throw th;
        }
    }

    public k90 BT(k90 k90Var) throws v20 {
        k70 k70VarJ8 = this.j6.J8("HEAD");
        if (k70VarJ8 == null || k70VarJ8.DW() == null) {
            throw new v20(MessageFormat.format(JGitText.DW().refNotResolved, "HEAD"));
        }
        a70 a70VarDW = k70VarJ8.DW();
        if (a70VarDW == null) {
            throw new v20(MessageFormat.format(JGitText.DW().refNotResolved, "HEAD"));
        }
        k90 k90VarRo = this.Zo.ro(a70VarDW);
        if (this.Zo.P8(k90Var, k90VarRo)) {
            return k90Var;
        }
        return gW(k70VarJ8.gn() ? k70VarJ8.VH().getName() : "detached HEAD", k90VarRo, k90Var);
    }

    public v10 U2(b bVar) {
        this.FH = bVar;
        return this;
    }

    public v10 a8(j70 j70Var) {
        this.v5 = j70Var;
        return this;
    }

    public i70 aM(byte[] bArr) {
        int iAM;
        int iXL;
        if (bArr.length == 0) {
            return null;
        }
        HashMap map = new HashMap();
        int i = 0;
        while (i < bArr.length && (iAM = kg0.aM(bArr, i)) != i && (iXL = kg0.XL(bArr, i, '=')) != iAM) {
            map.put(kg0.gn(bArr, i, iXL - 1), kg0.gn(bArr, iXL + 1, iAM - 2));
            i = iAM;
        }
        String str = (String) map.get("GIT_AUTHOR_NAME");
        String str2 = (String) map.get("GIT_AUTHOR_EMAIL");
        String str3 = (String) map.get("GIT_AUTHOR_DATE");
        long j = Long.parseLong(str3.substring(0, str3.indexOf(32))) * 1000;
        String strSubstring = str3.substring(str3.indexOf(32) + 1);
        int i2 = ((Integer.parseInt(strSubstring.substring(1, 3)) * 60) + Integer.parseInt(strSubstring.substring(3, 5))) * (strSubstring.charAt(0) == '+' ? 1 : -1);
        if (str == null || str2 == null) {
            return null;
        }
        return new i70(str, str2, j, i2);
    }

    public v10 lg(j60 j60Var) {
        try {
            this.Hw = this.Zo.ca(j60Var);
            return this;
        } catch (IOException e) {
            throw new o20(MessageFormat.format(JGitText.DW().couldNotReadObjectWhileParsingCommit, j60Var.BT()), e);
        }
    }

    public v10 rN(k90 k90Var) {
        this.Hw = k90Var;
        return this;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: u7, reason: merged with bridge method [inline-methods] */
    public w10 call() throws v20, InterruptedException, x20, r20 {
        int i;
        j6();
        tp();
        try {
            i = v5()[this.FH.ordinal()];
        } catch (IOException e) {
            throw new o20(e.getMessage(), e);
        }
        if (i == 1) {
            w10 w10VarWs = Ws();
            if (w10VarWs != null) {
                return w10VarWs;
            }
        } else {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    try {
                        w10 w10Var = w10.FH;
                        gn(w10Var);
                        return w10Var;
                    } catch (IOException e2) {
                        throw new o20(e2.getMessage(), e2);
                    }
                }
                throw new o20(e.getMessage(), e);
            }
            this.Hw = this.Zo.ca(this.j6.ro(Mr(this.VH, "onto")));
        }
        if (this.v5.isCancelled()) {
            w10 w10Var2 = w10.FH;
            gn(w10Var2);
            return w10Var2;
        }
        k90 k90VarJ0 = this.FH == b.CONTINUE ? J0() : null;
        if (this.FH == b.SKIP) {
            k90VarJ0 = we();
        }
        g70 g70VarYS = this.j6.yS();
        boolean z = false;
        for (c cVar : QX()) {
            j3(1);
            Collection<a70> collectionAM = g70VarYS.aM(cVar.j6);
            if (collectionAM.size() != 1) {
                throw new o20("Could not resolve uniquely the abbreviated object ID");
            }
            k90 k90VarCa = this.Zo.ca(collectionAM.iterator().next());
            if (this.v5.isCancelled()) {
                return new w10(k90VarCa);
            }
            try {
                this.v5.j6(MessageFormat.format(JGitText.DW().applyingCommit, k90VarCa.Xa()), 0);
                k90 k90VarBT = BT(k90VarCa);
                boolean z2 = k90VarBT != null;
                if (!z2) {
                    e10 e10VarZo = new l10(this.j6).Zo();
                    e10VarZo.Zo(k90VarCa);
                    f10 f10VarCall = e10VarZo.call();
                    int i2 = Hw()[f10VarCall.FH().ordinal()];
                    if (i2 == 1) {
                        k90VarBT = f10VarCall.DW();
                    } else {
                        if (i2 == 2) {
                            if (this.FH != b.BEGIN) {
                                return er(k90VarCa);
                            }
                            w10 w10Var3 = new w10(f10VarCall.j6());
                            gn(w10Var3);
                            return w10Var3;
                        }
                        if (i2 == 3) {
                            return er(k90VarCa);
                        }
                    }
                }
                k90VarJ0 = k90VarBT;
                this.v5.FH();
                z = z2;
            } finally {
                this.v5.FH();
            }
        }
        if (k90VarJ0 == null) {
            return w10.v5;
        }
        vy(Mr(this.VH, "head-name"), k90VarJ0);
        cg0.DW(this.VH, 1);
        return z ? w10.v5 : w10.DW;
    }

    public String yS(i70 i70Var) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("GIT_AUTHOR_NAME");
        sb.append("='");
        sb.append(i70Var.FH());
        sb.append("'\n");
        sb.append("GIT_AUTHOR_EMAIL");
        sb.append("='");
        sb.append(i70Var.DW());
        sb.append("'\n");
        sb.append("GIT_AUTHOR_DATE");
        sb.append("='");
        String strV5 = i70Var.v5();
        sb.append(strV5.substring(strV5.lastIndexOf(62) + 2));
        sb.append("'\n");
        return sb.toString();
    }
}
