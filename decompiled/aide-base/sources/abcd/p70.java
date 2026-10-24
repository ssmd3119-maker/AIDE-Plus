package abcd;

import com.aide.uidesigner.ProxyTextView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class p70 {
    private static final s50 VH = new s50();
    private final File DW;
    private final wf0 FH;
    private final File Zo;
    private final File v5;
    private final AtomicInteger j6 = new AtomicInteger(1);
    private final s50 Hw = new s50();

    class a implements q50 {
        public a() {
        }

        @Override // abcd.q50
        public void DW(p50 p50Var) {
            p70.this.gW();
        }
    }

    public p70(n60 n60Var) {
        this.DW = n60Var.VH();
        this.FH = n60Var.Zo();
        this.v5 = n60Var.tp();
        this.Zo = n60Var.gn();
    }

    private static boolean Mr(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (!a8(str.charAt(i))) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    private static boolean a8(char c) {
        if ('0' <= c && c <= '9') {
            return true;
        }
        if ('a' > c || c > 'f') {
            return 'A' <= c && c <= 'F';
        }
        return true;
    }

    private k90 cb(t90 t90Var, k70 k70Var, String str) throws NumberFormatException, c50 {
        try {
            int i = Integer.parseInt(str);
            if (i < 0) {
                throw new c50(MessageFormat.format(JGitText.DW().invalidReflogRevision, str));
            }
            ib0 ib0VarJ6 = new jb0(this, k70Var.getName()).j6(i);
            if (ib0VarJ6 != null) {
                return t90Var.ca(ib0VarJ6.DW());
            }
            throw new c50(MessageFormat.format(JGitText.DW().reflogEntryNotFound, Integer.valueOf(i), k70Var.getName()));
        } catch (NumberFormatException unused) {
            throw new c50(MessageFormat.format(JGitText.DW().invalidReflogRevision, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [abcd.j60] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    private a70 cn(t90 t90Var, String str) throws j40, NumberFormatException, c50 {
        s90 s90VarSy;
        int i;
        String str2;
        String str3;
        int i2;
        char[] charArray = str.toCharArray();
        o90 o90VarCb = null;
        int i3 = 0;
        while (i3 < charArray.length) {
            char c = charArray[i3];
            if (c == ':') {
                if (o90VarCb == null) {
                    try {
                        str = i3 == 0 ? cn(t90Var, "HEAD") : cn(t90Var, new String(charArray, 0, i3));
                        if (str == 0) {
                            return null;
                        }
                        s90VarSy = t90Var.sy(str);
                    } catch (c50 unused) {
                        throw new c50(str);
                    }
                } else {
                    s90VarSy = t90Var.sy(o90VarCb);
                }
                if (i3 == charArray.length - 1) {
                    return s90VarSy.Zo();
                }
                jf0 jf0VarV5 = jf0.v5(t90Var.lg(), new String(charArray, i3 + 1, (charArray.length - i3) - 1), s90VarSy);
                if (jf0VarV5 != null) {
                    return jf0VarV5.tp(0);
                }
                return null;
            }
            if (c == '@') {
                int i4 = i3 + 2;
                i = i4;
                while (true) {
                    if (i >= charArray.length) {
                        str2 = null;
                    } else if (charArray[i] == '}') {
                        str2 = new String(charArray, i4, (i - i3) - 2);
                    } else {
                        i++;
                    }
                }
                if (str2 != null) {
                    k70 k70VarFH = Ws().FH(new String(charArray, 0, i3));
                    if (k70VarFH == null) {
                        return null;
                    }
                    o90VarCb = cb(t90Var, k70VarFH, str2);
                    i3 = i;
                }
                i3 = i - 1;
            } else if (c != '^') {
                if (c != '~') {
                    if (o90VarCb != null) {
                        throw new c50(str);
                    }
                } else {
                    if (o90VarCb == null && (o90VarCb = vy(t90Var, new String(charArray, 0, i3))) == null) {
                        return null;
                    }
                    o90VarCb = t90Var.aj(o90VarCb);
                    if (!(o90VarCb instanceof k90)) {
                        throw new j40(o90VarCb, "commit");
                    }
                    int i5 = i3 + 1;
                    i = i5;
                    while (i < charArray.length && Character.isDigit(charArray[i])) {
                        i++;
                    }
                    int i6 = i - i3;
                    if (i6 > 1) {
                        try {
                            i2 = Integer.parseInt(new String(charArray, i5, i6 - 1));
                        } catch (NumberFormatException unused2) {
                            throw new c50(JGitText.DW().invalidAncestryLength, str);
                        }
                    } else {
                        i2 = 1;
                    }
                    while (true) {
                        if (i2 > 0) {
                            k90 k90Var = (k90) o90VarCb;
                            if (k90Var.et() == 0) {
                                o90VarCb = null;
                            } else {
                                o90VarCb = k90Var.wc(0);
                                t90Var.x9(o90VarCb);
                                i2--;
                            }
                        }
                    }
                    i3 = i - 1;
                }
            } else {
                if (o90VarCb == null && (o90VarCb = vy(t90Var, new String(charArray, 0, i3))) == null) {
                    return null;
                }
                int i7 = i3 + 1;
                if (i7 < charArray.length) {
                    char c2 = charArray[i7];
                    if (c2 != '{') {
                        switch (c2) {
                            case '0':
                            case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                k90 k90VarCa = t90Var.ca(o90VarCb);
                                int i8 = i7;
                                while (i8 < charArray.length && Character.isDigit(charArray[i8])) {
                                    i8++;
                                }
                                try {
                                    int i9 = Integer.parseInt(new String(charArray, i7, (i8 - i3) - 1));
                                    int i10 = i8 - 1;
                                    o90VarCb = i9 != 0 ? i9 > k90VarCa.et() ? null : k90VarCa.wc(i9 - 1) : k90VarCa;
                                    i3 = i10;
                                    continue;
                                } catch (NumberFormatException unused3) {
                                    throw new c50(JGitText.DW().invalidCommitParentNumber, str);
                                }
                            default:
                                o90 o90VarI = t90Var.I(o90VarCb);
                                if (!(o90VarI instanceof k90)) {
                                    throw new j40(o90VarI, "commit");
                                }
                                k90 k90Var2 = (k90) o90VarI;
                                if (k90Var2.et() != 0) {
                                    o90VarCb = k90Var2.wc(0);
                                    break;
                                }
                                break;
                        }
                    } else {
                        int i11 = i3 + 2;
                        i = i11;
                        while (true) {
                            if (i >= charArray.length) {
                                str3 = null;
                            } else if (charArray[i] == '}') {
                                str3 = new String(charArray, i11, (i - i3) - 2);
                            } else {
                                i++;
                            }
                        }
                        if (str3 == null) {
                            throw new c50(str);
                        }
                        if (str3.equals("tree")) {
                            o90VarCb = t90Var.sy(o90VarCb);
                        } else if (str3.equals("commit")) {
                            o90VarCb = t90Var.ca(o90VarCb);
                        } else if (str3.equals("blob")) {
                            o90VarCb = t90Var.aj(o90VarCb);
                            if (!(o90VarCb instanceof j90)) {
                                throw new j40(o90VarCb, "blob");
                            }
                        } else {
                            if (!str3.equals("")) {
                                throw new c50(str);
                            }
                            o90VarCb = t90Var.aj(o90VarCb);
                        }
                        i3 = i;
                    }
                } else {
                    o90 o90VarAj = t90Var.aj(o90VarCb);
                    if (!(o90VarAj instanceof k90)) {
                        throw new j40(o90VarAj, "commit");
                    }
                    k90 k90Var3 = (k90) o90VarAj;
                    o90VarCb = k90Var3.et() == 0 ? null : k90Var3.wc(0);
                }
            }
            i3++;
        }
        return o90VarCb != null ? o90VarCb.Zo() : dx(str);
    }

    private a70 dx(String str) {
        if (a70.Mz(str)) {
            return a70.vJ(str);
        }
        k70 k70VarFH = Ws().FH(str);
        if (k70VarFH != null) {
            return k70VarFH.DW();
        }
        if (h60.gn(str)) {
            return sh(str);
        }
        int iIndexOf = str.indexOf("-g");
        if (iIndexOf + 5 >= str.length() || iIndexOf < 0) {
            return null;
        }
        int i = iIndexOf + 2;
        if (!a8(str.charAt(i)) || !a8(str.charAt(iIndexOf + 3)) || !Mr(str, iIndexOf + 4)) {
            return null;
        }
        String strSubstring = str.substring(i);
        if (h60.gn(strSubstring)) {
            return sh(strSubstring);
        }
        return null;
    }

    private void g3(List<a70> list, String str) throws InterruptedException, IOException {
        File file = new File(u7(), str);
        if (list == null) {
            cg0.DW(file, 4);
            return;
        }
        vg0 vg0Var = new vg0(new FileOutputStream(file));
        try {
            Iterator<a70> it = list.iterator();
            while (it.hasNext()) {
                it.next().we(vg0Var);
                vg0Var.write(10);
            }
        } finally {
            vg0Var.close();
        }
    }

    public static boolean lg(String str) {
        int length = str.length();
        if (length == 0 || str.endsWith(".lock")) {
            return false;
        }
        int i = 0;
        int i2 = 1;
        char c = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt > ' ' && cCharAt != '*' && cCharAt != ':' && cCharAt != '?' && cCharAt != '^') {
                if (cCharAt != '{') {
                    if (cCharAt != '~') {
                        if (cCharAt != '.') {
                            if (cCharAt != '/') {
                                if (cCharAt == '[' || cCharAt == '\\') {
                                }
                            } else {
                                if (i == 0 || i == length - 1) {
                                    return false;
                                }
                                i2++;
                            }
                        } else if (c == 0 || c == '.' || c == '/' || i == length - 1) {
                            return false;
                        }
                    }
                } else if (c == '@') {
                    return false;
                }
                i++;
                c = cCharAt;
            }
            return false;
        }
        return i2 > 1;
    }

    private byte[] nw(String str) {
        try {
            byte[] bArrFH = eg0.FH(new File(u7(), str));
            if (bArrFH.length > 0) {
                return bArrFH;
            }
            return null;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static String sG(String str) {
        return str.startsWith("refs/heads/") ? str.substring(11) : str.startsWith("refs/tags/") ? str.substring(10) : str.startsWith("refs/remotes/") ? str.substring(13) : str;
    }

    private a70 sh(String str) {
        h60 h60VarFH = h60.FH(str);
        g70 g70VarYS = yS();
        try {
            Collection<a70> collectionAM = g70VarYS.aM(h60VarFH);
            if (collectionAM.size() == 0) {
                g70VarYS.XL();
                return null;
            }
            if (collectionAM.size() == 1) {
                return collectionAM.iterator().next();
            }
            throw new e40(h60VarFH, collectionAM);
        } finally {
            g70VarYS.XL();
        }
    }

    private o90 vy(t90 t90Var, String str) {
        a70 a70VarDx = dx(str);
        if (a70VarDx != null) {
            return t90Var.I(a70VarDx);
        }
        return null;
    }

    public f70 BT(j60 j60Var, int i) {
        return J0().VH(j60Var, i);
    }

    public void DW() {
        FH(false);
    }

    public String EQ() {
        k70 k70VarJ8 = J8("HEAD");
        if (k70VarJ8 == null) {
            return null;
        }
        if (k70VarJ8.gn()) {
            return k70VarJ8.VH().getName();
        }
        if (k70VarJ8.DW() != null) {
            return k70VarJ8.DW().BT();
        }
        return null;
    }

    public abstract void FH(boolean z);

    public void Hw() {
        J0().j6();
        Ws().j6();
    }

    public void I(List<a70> list) throws InterruptedException, IOException {
        g3(list, "MERGE_HEAD");
    }

    public abstract z60 J0();

    public k70 J8(String str) {
        return Ws().FH(str);
    }

    public List<a70> KD() {
        if (U2() || u7() == null) {
            throw new t40();
        }
        byte[] bArrNw = nw("MERGE_HEAD");
        if (bArrNw == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int iAM = 0; iAM < bArrNw.length; iAM = kg0.aM(bArrNw, iAM + 40)) {
            linkedList.add(a70.g3(bArrNw, iAM));
        }
        return linkedList;
    }

    public void Mz(String str) throws InterruptedException, IOException {
        File file = new File(this.DW, "MERGE_MSG");
        if (str == null) {
            cg0.DW(file, 4);
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(str.getBytes("UTF-8"));
        } finally {
            fileOutputStream.close();
        }
    }

    public k70 P8(k70 k70Var) {
        try {
            return Ws().VH(k70Var);
        } catch (IOException unused) {
            return k70Var;
        }
    }

    public s70 QX() {
        if (U2() || u7() == null) {
            return s70.BARE;
        }
        if (new File(XL(), ".dotest").exists()) {
            return s70.REBASING;
        }
        if (new File(u7(), ".dotest-merge").exists()) {
            return s70.REBASING_INTERACTIVE;
        }
        if (new File(u7(), "rebase-apply/rebasing").exists()) {
            return s70.REBASING_REBASING;
        }
        if (new File(u7(), "rebase-apply/applying").exists()) {
            return s70.APPLY;
        }
        if (new File(u7(), "rebase-apply").exists()) {
            return s70.REBASING;
        }
        if (new File(u7(), "rebase-merge/interactive").exists()) {
            return s70.REBASING_INTERACTIVE;
        }
        if (new File(u7(), "rebase-merge").exists()) {
            return s70.REBASING_MERGE;
        }
        if (new File(u7(), "MERGE_HEAD").exists()) {
            try {
                if (!ei().Ws()) {
                    return s70.MERGING_RESOLVED;
                }
            } catch (IOException unused) {
            }
            return s70.MERGING;
        }
        if (new File(u7(), "BISECT_LOG").exists()) {
            return s70.BISECTING;
        }
        if (!new File(u7(), "CHERRY_PICK_HEAD").exists()) {
            return s70.SAFE;
        }
        try {
            if (!ei().Ws()) {
                return s70.CHERRY_PICKING_RESOLVED;
            }
        } catch (IOException unused2) {
        }
        return s70.CHERRY_PICKING;
    }

    public String SI() {
        if (U2() || u7() == null) {
            throw new t40();
        }
        try {
            return kg0.VH(eg0.FH(new File(u7(), "MERGE_MSG")));
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public n70 Sf(String str, boolean z) {
        return Ws().Zo(str, z);
    }

    public boolean U2() {
        return this.v5 == null;
    }

    public Map<String, k70> VH() {
        try {
            return Ws().Hw("");
        } catch (IOException unused) {
            return new HashMap();
        }
    }

    public abstract m70 Ws();

    public File XL() {
        if (U2()) {
            throw new t40();
        }
        return this.v5;
    }

    public Set<a70> Zo() {
        return Collections.emptySet();
    }

    public boolean aM(j60 j60Var) {
        try {
            return J0().FH(j60Var);
        } catch (IOException unused) {
            return false;
        }
    }

    public n70 ef(String str) {
        return Sf(str, false);
    }

    public w30 ei() {
        return w30.a8(we(), tp());
    }

    public e70 er() {
        return J0().v5();
    }

    public abstract void gW();

    public abstract t70 gn();

    public void j3() {
        this.j6.incrementAndGet();
    }

    public void j6() {
        if (this.j6.decrementAndGet() == 0) {
            Hw();
        }
    }

    public w30 rN() {
        return w30.aM(we(), tp(), new a());
    }

    public a70 ro(String str) {
        t90 t90Var = new t90(this);
        try {
            return cn(t90Var, str);
        } finally {
            t90Var.lp();
        }
    }

    public String toString() {
        String path;
        if (u7() != null) {
            path = u7().getPath();
        } else {
            path = String.valueOf(getClass().getSimpleName()) + "-" + System.identityHashCode(this);
        }
        return "Repository[" + path + "]";
    }

    public wf0 tp() {
        return this.FH;
    }

    public File u7() {
        return this.DW;
    }

    public void v5(v50<?> v50Var) {
        v50Var.FH(this);
        this.Hw.Hw(v50Var);
        VH.Hw(v50Var);
    }

    public void vJ(a70 a70Var) throws InterruptedException, IOException {
        g3(a70Var != null ? Collections.singletonList(a70Var) : null, "CHERRY_PICK_HEAD");
    }

    public File we() {
        if (U2()) {
            throw new t40();
        }
        return this.Zo;
    }

    public g70 yS() {
        return J0().Zo();
    }
}
