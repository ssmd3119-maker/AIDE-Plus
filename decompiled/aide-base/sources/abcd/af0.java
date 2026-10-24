package abcd;

import abcd.cf0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class af0 extends oc0 {
    private final m90 EQ;
    private final p70 Hw;
    private final w80 J0;
    private LinkedList<a70> J8;
    private final HashMap<a70, List<Throwable>> Mr;
    private final LinkedList<cf0> QX;
    private String U2;
    private int VH;
    private final LinkedList<cf0> Ws;
    private final LinkedList<a> XL;
    private final List<cf0> Zo;
    private final List<eb0> a8;
    private final Set<String> aM;
    private final t90 gn;
    private final w60 j3 = new w60();
    private final e70 lg;
    private final g70 rN;
    private final m90 tp;
    private final jf0 u7;
    private final y60 v5;
    private final m90 we;

    private class a {
        final String DW;
        final String FH;
        File Hw;
        final cf0 j6;
        xa0 v5;

        public a(cf0 cf0Var, String str) {
            this.j6 = cf0Var;
            this.DW = str;
            String strSubstring = String.valueOf(str.substring(0, str.length() - 5)) + ".idx";
            this.FH = strSubstring;
            strSubstring = strSubstring.startsWith("pack-") ? strSubstring.substring(5) : strSubstring;
            strSubstring = strSubstring.endsWith(".idx") ? strSubstring.substring(0, strSubstring.length() - 4) : strSubstring;
            if (af0.this.Hw.J0() instanceof ta0) {
                this.Hw = new File(((ta0) af0.this.Hw.J0()).we(), "walk-" + strSubstring + ".walkidx");
            }
        }

        public void DW(j70 j70Var) throws InterruptedException, IOException {
            int i;
            if (this.v5 != null) {
                return;
            }
            File file = this.Hw;
            if (file == null) {
                this.Hw = File.createTempFile("jgit-walk-", ".idx");
            } else if (file.isFile()) {
                try {
                    this.v5 = xa0.QX(this.Hw);
                    return;
                } catch (FileNotFoundException unused) {
                }
            }
            cf0.a aVarGn = this.j6.gn("pack/" + this.FH);
            String str = "Get " + this.FH.substring(0, 12) + "..idx";
            long j = aVarGn.DW;
            j70Var.j6(str, j < 0 ? 0 : (int) (j / 1024));
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.Hw);
                    try {
                        byte[] bArr = new byte[2048];
                        while (!j70Var.isCancelled() && (i = aVarGn.j6.read(bArr)) >= 0) {
                            fileOutputStream.write(bArr, 0, i);
                            j70Var.v5(i / 1024);
                        }
                        aVarGn.j6.close();
                        j70Var.FH();
                        if (j70Var.isCancelled()) {
                            cg0.j6(this.Hw);
                            return;
                        }
                        try {
                            this.v5 = xa0.QX(this.Hw);
                        } catch (IOException e) {
                            cg0.j6(this.Hw);
                            throw e;
                        }
                    } finally {
                        fileOutputStream.close();
                    }
                } catch (IOException e2) {
                    cg0.j6(this.Hw);
                    throw e2;
                }
            } catch (Throwable th) {
                aVarGn.j6.close();
                throw th;
            }
        }

        public void j6(j70 j70Var) {
            jd0 jd0VarEQ = af0.this.lg.EQ(this.j6.gn("pack/" + this.DW).j6);
            jd0VarEQ.wc(false);
            jd0VarEQ.aq(af0.this.v5);
            jd0VarEQ.CU(af0.this.U2);
            eb0 eb0VarMz = jd0VarEQ.Mz(j70Var);
            if (eb0VarMz != null) {
                af0.this.a8.add(eb0VarMz);
            }
            af0.this.lg.FH();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public af0(df0 df0Var, cf0 cf0Var) {
        le0 le0Var = (le0) df0Var;
        this.Hw = le0Var.j6;
        this.v5 = le0Var.Mr() ? new y60() : null;
        this.lg = this.Hw.er();
        this.rN = this.Hw.yS();
        ArrayList arrayList = new ArrayList();
        this.Zo = arrayList;
        arrayList.add(cf0Var);
        this.XL = new LinkedList<>();
        this.aM = new HashSet();
        LinkedList<cf0> linkedList = new LinkedList<>();
        this.Ws = linkedList;
        linkedList.add(cf0Var);
        LinkedList<cf0> linkedList2 = new LinkedList<>();
        this.QX = linkedList2;
        linkedList2.add(cf0Var);
        this.Mr = new HashMap<>();
        this.a8 = new ArrayList(4);
        t90 t90Var = new t90(this.rN);
        this.gn = t90Var;
        t90Var.yO(false);
        this.u7 = new jf0(this.rN);
        this.tp = this.gn.vJ("COMPLETE");
        this.EQ = this.gn.vJ("IN_WORK_QUEUE");
        this.we = this.gn.vJ("LOCALLY_SEEN");
        this.J0 = new w80();
        this.J8 = new LinkedList<>();
    }

    private void BT(Set<a70> set) throws j50 {
        for (k70 k70Var : this.Hw.VH().values()) {
            try {
                gW(this.gn.I(k70Var.DW()));
            } catch (IOException e) {
                throw new j50(MessageFormat.format(JGitText.DW().localRefIsMissingObjects, k70Var.getName()), e);
            }
        }
        for (a70 a70Var : set) {
            try {
                gW(this.gn.I(a70Var));
            } catch (IOException e2) {
                throw new j50(MessageFormat.format(JGitText.DW().transportExceptionMissingAssumed, a70Var.BT()), e2);
            }
        }
    }

    private void KD(o90 o90Var) {
        P8(((r90) o90Var).br());
        o90Var.x9(this.tp);
    }

    private void P8(o90 o90Var) {
        if (o90Var.lp(this.tp) || o90Var.lp(this.EQ)) {
            return;
        }
        o90Var.x9(this.EQ);
        this.J8.add(o90Var);
    }

    private void SI(o90 o90Var) throws j50 {
        k90 k90Var = (k90) o90Var;
        yS(k90Var.XG());
        P8(k90Var.Eq());
        for (k90 k90Var2 : k90Var.CU()) {
            P8(k90Var2);
        }
        o90Var.x9(this.tp);
    }

    private boolean U2(j60 j60Var) throws j50 {
        try {
            return this.rN.EQ(j60Var);
        } catch (IOException e) {
            throw new j50(MessageFormat.format(JGitText.DW().cannotReadObject, j60Var.BT()), e);
        }
    }

    private boolean a8(j60 j60Var, String str, cf0 cf0Var) throws j50 {
        try {
            sG(j60Var, cf0Var.gn(str).j6());
            return true;
        } catch (FileNotFoundException e) {
            cb(j60Var, e);
            return false;
        } catch (IOException e2) {
            throw new j50(MessageFormat.format(JGitText.DW().cannotDownload, j60Var.BT()), e2);
        }
    }

    private void cb(j60 j60Var, Throwable th) {
        a70 a70VarZo = j60Var.Zo();
        List<Throwable> arrayList = this.Mr.get(a70VarZo);
        if (arrayList == null) {
            arrayList = new ArrayList<>(2);
            this.Mr.put(a70VarZo, arrayList);
        }
        arrayList.add(th);
    }

    private void cn(k90 k90Var) {
        if (k90Var.lp(this.we)) {
            return;
        }
        this.gn.x9(k90Var);
        k90Var.x9(this.we);
        k90Var.x9(this.tp);
        k90Var.br(this.tp);
        this.J0.Hw(k90Var);
    }

    private Iterator<a70> dx() {
        Iterator<a70> it = this.J8.iterator();
        this.J8 = new LinkedList<>();
        return it;
    }

    private void ei(a70 a70Var) throws j50, i40 {
        o90 o90VarI;
        try {
            if (a70Var instanceof o90) {
                o90VarI = (o90) a70Var;
                if (o90VarI.lp(this.tp)) {
                    return;
                } else {
                    this.gn.x9(o90VarI);
                }
            } else {
                o90VarI = this.gn.I(a70Var);
                if (o90VarI.lp(this.tp)) {
                    return;
                }
            }
            int iAj = o90VarI.aj();
            if (iAj == 1) {
                SI(o90VarI);
            } else if (iAj == 2) {
                ro(o90VarI);
            } else if (iAj == 3) {
                nw(o90VarI);
            } else {
                if (iAj != 4) {
                    throw new j50(MessageFormat.format(JGitText.DW().unknownObjectType, a70Var.BT()));
                }
                KD(o90VarI);
            }
            this.Mr.remove(a70Var);
        } catch (IOException e) {
            throw new j50(MessageFormat.format(JGitText.DW().cannotRead, a70Var.BT()), e);
        }
    }

    private Collection<cf0> er(j60 j60Var, j70 j70Var) {
        Collection<cf0> collectionV5;
        while (!this.QX.isEmpty()) {
            cf0 cf0VarRemoveFirst = this.QX.removeFirst();
            try {
                try {
                    j70Var.j6(JGitText.DW().listingAlternates, 0);
                    collectionV5 = cf0VarRemoveFirst.v5();
                } catch (IOException e) {
                    cb(j60Var, e);
                }
                if (collectionV5 != null && !collectionV5.isEmpty()) {
                    return collectionV5;
                }
            } finally {
                j70Var.FH();
            }
        }
        return null;
    }

    private void gW(o90 o90Var) throws i40 {
        while (o90Var.aj() == 4) {
            o90Var.x9(this.tp);
            o90Var = ((r90) o90Var).br();
            this.gn.x9(o90Var);
        }
        int iAj = o90Var.aj();
        if (iAj == 1) {
            cn((k90) o90Var);
        } else if (iAj == 2) {
            vy((s90) o90Var);
        } else {
            if (iAj != 3) {
                return;
            }
            o90Var.x9(this.tp);
        }
    }

    private void lg(j70 j70Var, j60 j60Var) throws j50 {
        if (U2(j60Var)) {
            return;
        }
        while (!rN(j70Var, j60Var)) {
            String strBT = j60Var.BT();
            String strSubstring = strBT.substring(0, 2);
            String str = String.valueOf(strSubstring) + "/" + strBT.substring(2);
            for (int i = this.VH; i < this.Zo.size(); i++) {
                if (a8(j60Var, str, this.Zo.get(i))) {
                    this.VH = i;
                    return;
                }
            }
            for (int i2 = 0; i2 < this.VH; i2++) {
                if (a8(j60Var, str, this.Zo.get(i2))) {
                    this.VH = i2;
                    return;
                }
            }
            while (!this.Ws.isEmpty()) {
                cf0 cf0VarRemoveFirst = this.Ws.removeFirst();
                try {
                    j70Var.j6("Listing packs", 0);
                    Collection<String> collectionZo = cf0VarRemoveFirst.Zo();
                    if (collectionZo != null && !collectionZo.isEmpty()) {
                        for (String str2 : collectionZo) {
                            if (this.aM.add(str2)) {
                                this.XL.add(new a(cf0VarRemoveFirst, str2));
                            }
                        }
                        if (rN(j70Var, j60Var)) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    cb(j60Var, e);
                } finally {
                    j70Var.FH();
                }
            }
            Collection<cf0> collectionEr = er(j60Var, j70Var);
            if (collectionEr == null || collectionEr.isEmpty()) {
                List<Throwable> list = this.Mr.get(j60Var);
                j50 j50Var = new j50(MessageFormat.format(JGitText.DW().cannotGet, j60Var.BT()));
                if (list != null && !list.isEmpty()) {
                    if (list.size() == 1) {
                        j50Var.initCause(list.get(0));
                    } else {
                        j50Var.initCause(new g40(list));
                    }
                }
                throw j50Var;
            }
            for (cf0 cf0Var : collectionEr) {
                this.Zo.add(cf0Var);
                this.Ws.add(cf0Var);
                this.QX.add(cf0Var);
            }
        }
    }

    private void nw(o90 o90Var) throws j50 {
        try {
            if (!this.rN.we(o90Var, 3)) {
                throw new j50(MessageFormat.format(JGitText.DW().cannotReadBlob, o90Var.BT()), new q40(o90Var, "blob"));
            }
            o90Var.x9(this.tp);
        } catch (IOException e) {
            throw new j50(MessageFormat.format(JGitText.DW().cannotReadBlob, o90Var.BT()), e);
        }
    }

    private boolean rN(j70 j70Var, j60 j60Var) throws InterruptedException, j50, i40 {
        Iterator<a> it = this.XL.iterator();
        while (it.hasNext() && !j70Var.isCancelled()) {
            a next = it.next();
            try {
                next.DW(j70Var);
            } catch (IOException e) {
                cb(j60Var, e);
                it.remove();
            }
            if (j70Var.isCancelled()) {
                return false;
            }
            if (next.v5.J8(j60Var)) {
                try {
                    try {
                        next.j6(j70Var);
                        try {
                            if (next.Hw != null) {
                                cg0.j6(next.Hw);
                            }
                            it.remove();
                            if (U2(j60Var)) {
                                Iterator<a70> itDx = dx();
                                while (itDx.hasNext()) {
                                    a70 next2 = itDx.next();
                                    if (next.v5.J8(next2)) {
                                        itDx.remove();
                                        ei(next2);
                                    } else {
                                        this.J8.add(next2);
                                    }
                                }
                                return true;
                            }
                            cb(j60Var, new FileNotFoundException(MessageFormat.format(JGitText.DW().objectNotFoundIn, j60Var.BT(), next.DW)));
                        } catch (IOException e2) {
                            throw new j50(e2.getMessage(), e2);
                        }
                    } catch (IOException e3) {
                        cb(j60Var, e3);
                        try {
                            if (next.Hw != null) {
                                cg0.j6(next.Hw);
                            }
                            it.remove();
                        } catch (IOException e4) {
                            throw new j50(e4.getMessage(), e4);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        if (next.Hw != null) {
                            cg0.j6(next.Hw);
                        }
                        it.remove();
                        throw th;
                    } catch (IOException e5) {
                        throw new j50(e5.getMessage(), e5);
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void ro(o90 o90Var) throws i40, j50 {
        try {
            this.u7.ei(o90Var);
            while (this.u7.rN()) {
                t60 t60VarGn = this.u7.gn(0);
                int iVH = t60VarGn.VH();
                if (iVH == 2 || iVH == 3) {
                    this.u7.EQ(this.j3, 0);
                    P8(this.gn.SI(this.j3, iVH));
                } else if (!t60.gn.equals(t60VarGn)) {
                    this.u7.EQ(this.j3, 0);
                    String str = JGitText.DW().invalidModeFor;
                    o90Var.sy();
                    throw new i40(MessageFormat.format(str, t60VarGn, this.j3.BT(), this.u7.J0(), o90Var.BT()));
                }
            }
            o90Var.x9(this.tp);
        } catch (IOException e) {
            throw new j50(MessageFormat.format(JGitText.DW().cannotReadTree, o90Var.BT()), e);
        }
    }

    private void sG(j60 j60Var, byte[] bArr) throws j50, FileNotFoundException {
        try {
            f70 f70VarJ0 = kb0.J0(bArr, j60Var);
            int iVH = f70VarJ0.VH();
            byte[] bArrHw = f70VarJ0.Hw();
            y60 y60Var = this.v5;
            if (y60Var != null) {
                try {
                    y60Var.j6(iVH, bArrHw);
                } catch (i40 e) {
                    throw new j50(MessageFormat.format(JGitText.DW().transportExceptionInvalid, r60.VH(iVH), j60Var.BT(), e.getMessage()));
                }
            }
            a70 a70VarVH = this.lg.VH(iVH, bArrHw);
            if (!j60.Mr(j60Var, a70VarVH)) {
                throw new j50(MessageFormat.format(JGitText.DW().incorrectHashFor, j60Var.BT(), a70VarVH.BT(), r60.VH(iVH), Integer.valueOf(bArr.length)));
            }
            this.lg.FH();
        } catch (i40 e2) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException(j60Var.BT());
            fileNotFoundException.initCause(e2);
            throw fileNotFoundException;
        }
    }

    private void sh(Collection<k70> collection) throws j50 {
        HashSet hashSet = new HashSet();
        Iterator<k70> it = collection.iterator();
        while (it.hasNext()) {
            a70 a70VarDW = it.next().DW();
            try {
                o90 o90VarI = this.gn.I(a70VarDW);
                if (!o90VarI.lp(this.tp) && hashSet.add(a70VarDW)) {
                    o90VarI.x9(this.EQ);
                    this.J8.add(o90VarI);
                }
            } catch (q40 unused) {
                if (hashSet.add(a70VarDW)) {
                    this.J8.add(a70VarDW);
                }
            } catch (IOException e) {
                throw new j50(MessageFormat.format(JGitText.DW().cannotRead, a70VarDW.BT()), e);
            }
        }
    }

    private void vy(s90 s90Var) throws i40 {
        if (s90Var.lp(this.tp)) {
            return;
        }
        s90Var.x9(this.tp);
        this.u7.ei(s90Var);
        while (this.u7.rN()) {
            t60 t60VarGn = this.u7.gn(0);
            int iVH = t60VarGn.VH();
            if (iVH == 2) {
                this.u7.EQ(this.j3, 0);
                o90 o90VarSI = this.gn.SI(this.j3, iVH);
                if (!o90VarSI.lp(this.tp)) {
                    o90VarSI.x9(this.tp);
                    this.u7.FH();
                }
            } else if (iVH == 3) {
                this.u7.EQ(this.j3, 0);
                this.gn.SI(this.j3, iVH).x9(this.tp);
            } else if (!t60.gn.equals(t60VarGn)) {
                this.u7.EQ(this.j3, 0);
                throw new i40(MessageFormat.format(JGitText.DW().corruptObjectInvalidMode3, t60VarGn, this.j3.BT(), this.u7.J0(), s90Var.BT()));
            }
        }
    }

    private void yS(int i) throws j50 {
        while (true) {
            try {
                k90 k90VarEQ = this.J0.EQ();
                if (k90VarEQ != null && k90VarEQ.XG() >= i) {
                    this.J0.j6();
                    vy(k90VarEQ.Eq());
                    for (k90 k90Var : k90VarEQ.CU()) {
                        cn(k90Var);
                    }
                }
                return;
            } catch (IOException e) {
                throw new j50(JGitText.DW().localObjectsIncomplete, e);
            }
        }
    }

    @Override // abcd.yc0
    public void FH(String str) {
        this.U2 = str;
    }

    @Override // abcd.yc0
    public Collection<eb0> VH() {
        return this.a8;
    }

    @Override // abcd.oc0
    public void Ws(j70 j70Var, Collection<k70> collection, Set<a70> set) throws j50, i40 {
        BT(set);
        sh(collection);
        while (!j70Var.isCancelled() && !this.J8.isEmpty()) {
            a70 a70VarRemoveFirst = this.J8.removeFirst();
            if (!(a70VarRemoveFirst instanceof o90) || !((o90) a70VarRemoveFirst).lp(this.tp)) {
                lg(j70Var, a70VarRemoveFirst);
            }
            ei(a70VarRemoveFirst);
        }
    }

    @Override // abcd.tc0
    public void close() {
        this.lg.we();
        this.rN.XL();
        Iterator<a> it = this.XL.iterator();
        while (it.hasNext()) {
            File file = it.next().Hw;
            if (file != null) {
                file.delete();
            }
        }
        Iterator<cf0> it2 = this.Zo.iterator();
        while (it2.hasNext()) {
            it2.next().j6();
        }
    }

    @Override // abcd.yc0
    public boolean v5() {
        return true;
    }
}
