package abcd;

import abcd.gc0;
import abcd.qc0;
import abcd.wd0;
import abcd.z80;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class ve0 {
    private static /* synthetic */ int[] cn;
    private static /* synthetic */ int[] ro;
    private final m90 BT;
    private final t90 DW;
    private Map<String, k70> EQ;
    private ec0 FH;
    private int Hw;
    private int Mr;
    private gc0.e SI;
    private int U2;
    private InputStream VH;
    private tg0 Zo;
    private Boolean a8;
    private final m90 er;
    private final m90 gW;
    private OutputStream gn;
    private final p70 j6;
    private boolean lg;
    private boolean nw;
    private Set<a70> rN;
    private nd0 tp;
    private md0 u7;
    private final n90 vy;
    private xd0 we;
    private final m90 yS;
    private boolean v5 = true;
    private qd0 J0 = qd0.j6;
    private final Set<String> J8 = new HashSet();
    private final Set<a70> Ws = new HashSet();
    private final Set<o90> QX = new HashSet();
    private final Set<o90> XL = new HashSet();
    private final Set<a70> aM = new HashSet();
    private final List<a70> j3 = new ArrayList();
    private a P8 = a.ADVERTISED;
    private qc0.d ei = qc0.d.OFF;
    private xe0 KD = xe0.j6;

    public enum a {
        ADVERTISED,
        REACHABLE_COMMIT,
        ANY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public ve0(p70 p70Var) {
        this.j6 = p70Var;
        t90 t90Var = new t90(p70Var);
        this.DW = t90Var;
        t90Var.yO(false);
        this.er = this.DW.vJ("WANT");
        this.yS = this.DW.vJ("PEER_HAS");
        this.gW = this.DW.vJ("COMMON");
        this.BT = this.DW.vJ("SATISFIED");
        this.DW.EQ(this.yS);
        n90 n90Var = new n90();
        this.vy = n90Var;
        n90Var.add(this.er);
        this.vy.add(this.yS);
        this.vy.add(this.gW);
        this.vy.add(this.BT);
        this.we = xd0.j6;
    }

    public static /* synthetic */ int[] DW() {
        int[] iArr = cn;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[a.valuesCustom().length];
        try {
            iArr2[a.ADVERTISED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[a.ANY.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[a.REACHABLE_COMMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        cn = iArr2;
        return iArr2;
    }

    private void EQ() throws IOException {
        String strFH;
        boolean z = true;
        while (true) {
            try {
                strFH = this.u7.FH();
                if (strFH == md0.FH) {
                    return;
                }
                if (strFH.startsWith("deepen ")) {
                    this.Mr = Integer.parseInt(strFH.substring(7));
                } else if (strFH.startsWith("shallow ")) {
                    this.aM.add(a70.vJ(strFH.substring(8)));
                } else {
                    if (!strFH.startsWith("want ") || strFH.length() < 45) {
                        break;
                    }
                    if (z && strFH.length() > 45) {
                        String strSubstring = strFH.substring(45);
                        if (strSubstring.startsWith(" ")) {
                            strSubstring = strSubstring.substring(1);
                        }
                        for (String str : strSubstring.split(" ")) {
                            this.J8.add(str);
                        }
                        strFH = strFH.substring(0, 45);
                    }
                    this.Ws.add(a70.vJ(strFH.substring(5)));
                    z = false;
                }
            } catch (EOFException e) {
                if (!z) {
                    throw e;
                }
                return;
            }
        }
        throw new y40(MessageFormat.format(JGitText.DW().expectedGot, "want", strFH));
    }

    private void FH(o90 o90Var) {
        if (o90Var.lp(this.gW)) {
            return;
        }
        o90Var.x9(this.gW);
        this.XL.add(o90Var);
        this.a8 = null;
    }

    private void Hw(Set<o90> set) throws y40 {
        for (o90 o90Var : set) {
            if (!(o90Var instanceof k90)) {
                throw new y40(MessageFormat.format(JGitText.DW().wantNotValid, set.iterator().next().BT()));
            }
            this.DW.ef((k90) o90Var);
        }
        Iterator<a70> it = this.rN.iterator();
        while (it.hasNext()) {
            try {
                this.DW.Sf(this.DW.ca(it.next()));
            } catch (j40 unused) {
            }
        }
        k90 k90VarG3 = this.DW.g3();
        if (k90VarG3 != null) {
            throw new y40(MessageFormat.format(JGitText.DW().wantNotValid, k90VarG3.BT()));
        }
        this.DW.OW();
    }

    private boolean J0() {
        try {
            de0 de0Var = new de0(3, 1000, this.gn);
            de0Var.write(r60.DW(JGitText.DW().internalServerError));
            de0Var.flush();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean Mr(o90 o90Var) {
        k90 k90VarG3;
        if (o90Var.lp(this.BT)) {
            return true;
        }
        this.DW.XX(this.vy);
        this.DW.ef((k90) o90Var);
        int i = this.U2;
        if (i != 0) {
            this.DW.XG(z90.Hw(i * 1000));
        }
        do {
            k90VarG3 = this.DW.g3();
            if (k90VarG3 == null) {
                return false;
            }
        } while (!k90VarG3.lp(this.yS));
        FH(k90VarG3);
        o90Var.x9(this.BT);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: ye0 -> 0x01cd, TryCatch #1 {ye0 -> 0x01cd, blocks: (B:12:0x003b, B:14:0x0043, B:15:0x004d), top: B:97:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: ye0 -> 0x01cd, TRY_LEAVE, TryCatch #1 {ye0 -> 0x01cd, blocks: (B:12:0x003b, B:14:0x0043, B:15:0x004d), top: B:97:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[Catch: all -> 0x01c8, TryCatch #0 {all -> 0x01c8, blocks: (B:20:0x006c, B:22:0x0094, B:24:0x0098, B:25:0x00a7, B:27:0x00ad, B:28:0x00b1, B:30:0x00bd, B:31:0x00c5, B:34:0x00cc, B:36:0x00d8, B:37:0x00e0, B:39:0x00e4, B:40:0x00eb, B:42:0x00f5, B:44:0x010f, B:46:0x0119, B:48:0x011d, B:49:0x0127, B:52:0x012e, B:54:0x0140, B:62:0x0158, B:64:0x015e, B:65:0x0164, B:68:0x016b, B:70:0x0175, B:72:0x017b, B:57:0x0149, B:59:0x014f, B:73:0x0183, B:75:0x0190, B:43:0x00fd), top: B:95:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4 A[Catch: all -> 0x01c8, TryCatch #0 {all -> 0x01c8, blocks: (B:20:0x006c, B:22:0x0094, B:24:0x0098, B:25:0x00a7, B:27:0x00ad, B:28:0x00b1, B:30:0x00bd, B:31:0x00c5, B:34:0x00cc, B:36:0x00d8, B:37:0x00e0, B:39:0x00e4, B:40:0x00eb, B:42:0x00f5, B:44:0x010f, B:46:0x0119, B:48:0x011d, B:49:0x0127, B:52:0x012e, B:54:0x0140, B:62:0x0158, B:64:0x015e, B:65:0x0164, B:68:0x016b, B:70:0x0175, B:72:0x017b, B:57:0x0149, B:59:0x014f, B:73:0x0183, B:75:0x0190, B:43:0x00fd), top: B:95:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5 A[Catch: all -> 0x01c8, TryCatch #0 {all -> 0x01c8, blocks: (B:20:0x006c, B:22:0x0094, B:24:0x0098, B:25:0x00a7, B:27:0x00ad, B:28:0x00b1, B:30:0x00bd, B:31:0x00c5, B:34:0x00cc, B:36:0x00d8, B:37:0x00e0, B:39:0x00e4, B:40:0x00eb, B:42:0x00f5, B:44:0x010f, B:46:0x0119, B:48:0x011d, B:49:0x0127, B:52:0x012e, B:54:0x0140, B:62:0x0158, B:64:0x015e, B:65:0x0164, B:68:0x016b, B:70:0x0175, B:72:0x017b, B:57:0x0149, B:59:0x014f, B:73:0x0183, B:75:0x0190, B:43:0x00fd), top: B:95:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd A[Catch: all -> 0x01c8, TryCatch #0 {all -> 0x01c8, blocks: (B:20:0x006c, B:22:0x0094, B:24:0x0098, B:25:0x00a7, B:27:0x00ad, B:28:0x00b1, B:30:0x00bd, B:31:0x00c5, B:34:0x00cc, B:36:0x00d8, B:37:0x00e0, B:39:0x00e4, B:40:0x00eb, B:42:0x00f5, B:44:0x010f, B:46:0x0119, B:48:0x011d, B:49:0x0127, B:52:0x012e, B:54:0x0140, B:62:0x0158, B:64:0x015e, B:65:0x0164, B:68:0x016b, B:70:0x0175, B:72:0x017b, B:57:0x0149, B:59:0x014f, B:73:0x0183, B:75:0x0190, B:43:0x00fd), top: B:95:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e A[Catch: all -> 0x01c8, TryCatch #0 {all -> 0x01c8, blocks: (B:20:0x006c, B:22:0x0094, B:24:0x0098, B:25:0x00a7, B:27:0x00ad, B:28:0x00b1, B:30:0x00bd, B:31:0x00c5, B:34:0x00cc, B:36:0x00d8, B:37:0x00e0, B:39:0x00e4, B:40:0x00eb, B:42:0x00f5, B:44:0x010f, B:46:0x0119, B:48:0x011d, B:49:0x0127, B:52:0x012e, B:54:0x0140, B:62:0x0158, B:64:0x015e, B:65:0x0164, B:68:0x016b, B:70:0x0175, B:72:0x017b, B:57:0x0149, B:59:0x014f, B:73:0x0183, B:75:0x0190, B:43:0x00fd), top: B:95:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e A[Catch: all -> 0x01c8, TryCatch #0 {all -> 0x01c8, blocks: (B:20:0x006c, B:22:0x0094, B:24:0x0098, B:25:0x00a7, B:27:0x00ad, B:28:0x00b1, B:30:0x00bd, B:31:0x00c5, B:34:0x00cc, B:36:0x00d8, B:37:0x00e0, B:39:0x00e4, B:40:0x00eb, B:42:0x00f5, B:44:0x010f, B:46:0x0119, B:48:0x011d, B:49:0x0127, B:52:0x012e, B:54:0x0140, B:62:0x0158, B:64:0x015e, B:65:0x0164, B:68:0x016b, B:70:0x0175, B:72:0x017b, B:57:0x0149, B:59:0x014f, B:73:0x0183, B:75:0x0190, B:43:0x00fd), top: B:95:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0190 A[Catch: all -> 0x01c8, TRY_LEAVE, TryCatch #0 {all -> 0x01c8, blocks: (B:20:0x006c, B:22:0x0094, B:24:0x0098, B:25:0x00a7, B:27:0x00ad, B:28:0x00b1, B:30:0x00bd, B:31:0x00c5, B:34:0x00cc, B:36:0x00d8, B:37:0x00e0, B:39:0x00e4, B:40:0x00eb, B:42:0x00f5, B:44:0x010f, B:46:0x0119, B:48:0x011d, B:49:0x0127, B:52:0x012e, B:54:0x0140, B:62:0x0158, B:64:0x015e, B:65:0x0164, B:68:0x016b, B:70:0x0175, B:72:0x017b, B:57:0x0149, B:59:0x014f, B:73:0x0183, B:75:0x0190, B:43:0x00fd), top: B:95:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c2  */
    /* JADX WARN: Type inference failed for: r2v11, types: [abcd.t90] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void QX(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.ve0.QX(boolean):void");
    }

    private boolean VH() {
        if (this.a8 == null) {
            this.a8 = Boolean.valueOf(gn());
        }
        return this.a8.booleanValue();
    }

    private void Ws() throws IOException {
        int i;
        boolean z = this.J8.contains("side-band") || this.J8.contains("side-band-64k");
        if (!this.v5 && (i = this.VH.read()) >= 0) {
            throw new i40(MessageFormat.format(JGitText.DW().expectedEOFReceived, "\\x" + Integer.toHexString(i)));
        }
        if (!z) {
            QX(false);
            return;
        }
        try {
            QX(true);
        } catch (ye0 e) {
            throw e;
        } catch (IOException e2) {
            if (!J0()) {
                throw e2;
            }
            throw new we0(e2);
        } catch (Error e3) {
            if (!J0()) {
                throw e3;
            }
            throw new we0(e3);
        } catch (RuntimeException e4) {
            if (!J0()) {
                throw e4;
            }
            throw new we0(e4);
        }
    }

    private void XL() throws IOException {
        if (this.v5) {
            J8(new wd0.a(this.tp));
        } else if (this.P8 == a.ANY) {
            this.rN = Collections.emptySet();
        } else {
            this.rN = new HashSet();
            for (k70 k70Var : v5().values()) {
                if (k70Var.DW() != null) {
                    this.rN.add(k70Var.DW());
                }
            }
        }
        try {
            EQ();
            if (this.Ws.isEmpty()) {
                this.J0.j6(this, this.Ws, 0);
                this.J0.FH(this, this.Ws, 0, 0, false);
                return;
            }
            if (this.J8.contains("multi_ack_detailed")) {
                this.ei = qc0.d.DETAILED;
                this.nw = this.J8.contains("no-done");
            } else if (this.J8.contains("multi_ack")) {
                this.ei = qc0.d.CONTINUE;
            } else {
                this.ei = qc0.d.OFF;
            }
            if (this.Mr != 0) {
                tp();
            }
            if (Zo()) {
                Ws();
            }
        } catch (y40 e) {
            we(e.getMessage());
            throw e;
        } catch (ye0 e2) {
            e2.j6();
            throw null;
        } catch (IOException e3) {
            we(JGitText.DW().internalServerError);
            throw e3;
        } catch (Error e4) {
            we(JGitText.DW().internalServerError);
            throw e4;
        } catch (RuntimeException e5) {
            we(JGitText.DW().internalServerError);
            throw e5;
        }
    }

    private boolean Zo() throws IOException {
        String strFH;
        this.a8 = Boolean.FALSE;
        a70 a70VarCa = a70.ca();
        ArrayList arrayList = new ArrayList(64);
        while (true) {
            try {
                strFH = this.u7.FH();
                if (strFH == md0.FH) {
                    a70VarCa = u7(arrayList, a70VarCa);
                    if (this.XL.isEmpty() || this.ei != qc0.d.OFF) {
                        this.tp.VH("NAK\n");
                    }
                    if (this.nw && this.lg) {
                        this.tp.VH("ACK " + a70VarCa.BT() + "\n");
                        return true;
                    }
                    if (!this.v5) {
                        return false;
                    }
                    this.tp.DW();
                } else {
                    if (!strFH.startsWith("have ") || strFH.length() != 45) {
                        break;
                    }
                    arrayList.add(a70.vJ(strFH.substring(5)));
                }
            } catch (EOFException e) {
                if (this.v5 || this.Mr <= 0) {
                    throw e;
                }
                return false;
            }
        }
        if (!strFH.equals("done")) {
            throw new y40(MessageFormat.format(JGitText.DW().expectedGot, "have", strFH));
        }
        a70 a70VarU7 = u7(arrayList, a70VarCa);
        if (this.XL.isEmpty()) {
            this.tp.VH("NAK\n");
        } else if (this.ei != qc0.d.OFF) {
            this.tp.VH("ACK " + a70VarU7.BT() + "\n");
        }
        return true;
    }

    private boolean gn() throws y40 {
        if (this.XL.isEmpty()) {
            return false;
        }
        try {
            Iterator<o90> it = this.QX.iterator();
            while (it.hasNext()) {
                if (!Mr(it.next())) {
                    return false;
                }
            }
            return true;
        } catch (IOException e) {
            throw new y40(JGitText.DW().internalRevisionError, e);
        }
    }

    public static /* synthetic */ int[] j6() {
        int[] iArr = ro;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[qc0.d.valuesCustom().length];
        try {
            iArr2[qc0.d.CONTINUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[qc0.d.DETAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[qc0.d.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        ro = iArr2;
        return iArr2;
    }

    private void tp() throws IOException {
        z80.c cVar = new z80.c(this.DW.lg(), this.Mr);
        Iterator<a70> it = this.Ws.iterator();
        while (it.hasNext()) {
            try {
                cVar.Xa(cVar.ca(it.next()));
            } catch (j40 unused) {
            }
        }
        while (true) {
            k90 k90VarG3 = cVar.g3();
            if (k90VarG3 == null) {
                this.tp.j6();
                return;
            }
            z80.a aVar = (z80.a) k90VarG3;
            if (aVar.oY() == this.Mr && !this.aM.contains(aVar)) {
                this.tp.VH("shallow " + k90VarG3.BT());
            }
            if (aVar.oY() < this.Mr && this.aM.contains(aVar)) {
                this.j3.add(aVar.Zo());
                this.tp.VH("unshallow " + aVar.BT());
            }
        }
    }

    private a70 u7(List<a70> list, a70 a70Var) throws IOException {
        List arrayList;
        HashSet hashSet;
        boolean z;
        o90 next;
        int i;
        this.J0.j6(this, this.Ws, list.size());
        if (list.isEmpty()) {
            return a70Var;
        }
        boolean z2 = false;
        this.lg = false;
        HashSet hashSet2 = null;
        if (!this.QX.isEmpty() || this.Ws.isEmpty()) {
            arrayList = list;
            hashSet = null;
            z = false;
        } else {
            hashSet = new HashSet(list);
            arrayList = new ArrayList(this.Ws.size() + hashSet.size());
            arrayList.addAll(this.Ws);
            arrayList.addAll(hashSet);
            z = true;
        }
        s80 s80VarMz = this.DW.Mz(arrayList, z);
        int i2 = 0;
        while (true) {
            try {
                try {
                    next = s80VarMz.next();
                } catch (q40 e) {
                    a70 a70VarJ6 = e.j6();
                    if (this.Ws.contains(a70VarJ6)) {
                        throw new y40(MessageFormat.format(JGitText.DW().wantNotValid, a70VarJ6.BT()), e);
                    }
                }
                if (next == null) {
                    s80VarMz.j6();
                    if (hashSet2 != null && !hashSet2.isEmpty()) {
                        int i3 = DW()[this.P8.ordinal()];
                        if (i3 == 2) {
                            Hw(hashSet2);
                        } else if (i3 != 3) {
                            throw new y40(MessageFormat.format(JGitText.DW().wantNotValid, hashSet2.iterator().next().BT()));
                        }
                    }
                    int size = list.size() - i2;
                    if (size > 0) {
                        int size2 = list.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            }
                            a70 a70Var2 = list.get(size2);
                            if (this.DW.cb(a70Var2) == null) {
                                if (VH() && (i = j6()[this.ei.ordinal()]) != 1) {
                                    if (i == 2) {
                                        this.tp.VH("ACK " + a70Var2.BT() + " continue\n");
                                    } else if (i == 3) {
                                        this.tp.VH("ACK " + a70Var2.BT() + " ready\n");
                                        this.lg = true;
                                    }
                                }
                                z2 = true;
                            } else {
                                size2--;
                            }
                        }
                    }
                    if (this.ei == qc0.d.DETAILED && !z2 && VH()) {
                        a70 a70Var3 = list.get(list.size() - 1);
                        this.lg = true;
                        this.tp.VH("ACK " + a70Var3.BT() + " ready\n");
                        this.lg = true;
                    }
                    this.J0.FH(this, this.QX, i2, size, this.lg);
                    list.clear();
                    return a70Var;
                }
                if (this.Ws.remove(next)) {
                    if (!this.rN.contains(next) && this.P8 != a.ANY) {
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                        }
                        hashSet2.add(next);
                    }
                    if (!next.lp(this.er)) {
                        next.x9(this.er);
                        this.QX.add(next);
                    }
                    if (!(next instanceof k90)) {
                        next.x9(this.BT);
                    }
                    if (next instanceof r90) {
                        o90 o90VarAj = this.DW.aj(next);
                        if ((o90VarAj instanceof k90) && !o90VarAj.lp(this.er)) {
                            o90VarAj.x9(this.er);
                            this.QX.add(o90VarAj);
                        }
                    }
                    if (!hashSet.contains(next)) {
                    }
                }
                i2++;
                if (next instanceof k90) {
                    k90 k90Var = (k90) next;
                    if (this.U2 == 0 || k90Var.XG() < this.U2) {
                        this.U2 = k90Var.XG();
                    }
                }
                if (!next.lp(this.yS)) {
                    next.x9(this.yS);
                    if (next instanceof k90) {
                        ((k90) next).br(this.yS);
                    }
                    FH(next);
                    int i4 = j6()[this.ei.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            this.tp.VH("ACK " + next.BT() + " continue\n");
                        } else if (i4 == 3) {
                            this.tp.VH("ACK " + next.BT() + " common\n");
                        }
                    } else if (this.XL.size() == 1) {
                        this.tp.VH("ACK " + next.BT() + "\n");
                    }
                }
                a70Var = next;
            } catch (Throwable th) {
                s80VarMz.j6();
                throw th;
            }
        }
    }

    private void we(String str) {
        try {
            this.tp.VH("ERR " + str + "\n");
        } catch (Throwable unused) {
        }
    }

    public void J8(wd0 wd0Var) throws ye0 {
        try {
            this.J0.DW(this);
            wd0Var.gn(this.j6);
            wd0Var.FH("include-tag");
            wd0Var.FH("multi_ack_detailed");
            wd0Var.FH("multi_ack");
            wd0Var.FH("ofs-delta");
            wd0Var.FH("side-band");
            wd0Var.FH("side-band-64k");
            wd0Var.FH("thin-pack");
            wd0Var.FH("no-progress");
            wd0Var.FH("shallow");
            if (!this.v5) {
                wd0Var.FH("no-done");
            }
            wd0Var.EQ(true);
            this.rN = wd0Var.tp(v5());
            wd0Var.Zo();
        } catch (ye0 e) {
            if (e.getMessage() == null) {
                throw e;
            }
            wd0Var.we("ERR " + e.getMessage());
            e.DW();
            throw null;
        }
    }

    public void aM(Map<String, k70> map) {
        this.we.j6(map);
        this.EQ = map;
    }

    public void j3(InputStream inputStream, OutputStream outputStream, OutputStream outputStream2) {
        try {
            this.VH = inputStream;
            this.gn = outputStream;
            if (this.Hw > 0) {
                this.Zo = new tg0(String.valueOf(Thread.currentThread().getName()) + "-Timer");
                yg0 yg0Var = new yg0(this.VH, this.Zo);
                zg0 zg0Var = new zg0(this.gn, this.Zo);
                yg0Var.Zo(this.Hw * 1000);
                zg0Var.FH(this.Hw * 1000);
                this.VH = yg0Var;
                this.gn = zg0Var;
            }
            this.u7 = new md0(this.VH);
            this.tp = new nd0(this.gn);
            XL();
            this.DW.lp();
            tg0 tg0Var = this.Zo;
            if (tg0Var != null) {
                try {
                    tg0Var.FH();
                } finally {
                }
            }
        } catch (Throwable th) {
            this.DW.lp();
            tg0 tg0Var2 = this.Zo;
            if (tg0Var2 != null) {
                try {
                    tg0Var2.FH();
                } finally {
                }
            }
            throw th;
        }
    }

    public final Map<String, k70> v5() {
        if (this.EQ == null) {
            aM(this.j6.VH());
        }
        return this.EQ;
    }
}
