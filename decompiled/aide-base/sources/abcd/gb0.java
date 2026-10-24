package abcd;

import abcd.c70;
import abcd.k70;
import abcd.lg0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class gb0 extends m70 {
    private static final String[] we = {"MERGE_HEAD", "FETCH_HEAD", "ORIG_HEAD", "CHERRY_PICK_HEAD"};
    private final ka0 DW;
    private final File FH;
    private final File Hw;
    private final File VH;
    private final File Zo;
    private final File v5;
    private final AtomicReference<lg0<d>> gn = new AtomicReference<>();
    private final AtomicReference<h> u7 = new AtomicReference<>();
    private final AtomicInteger tp = new AtomicInteger();
    private final AtomicInteger EQ = new AtomicInteger();

    class a extends o70 {
        private final /* synthetic */ sa0 FH;
        private final /* synthetic */ h Hw;
        private final /* synthetic */ lg0 v5;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lg0 lg0Var, sa0 sa0Var, h hVar, lg0 lg0Var2) {
            super((lg0<k70>) lg0Var);
            this.FH = sa0Var;
            this.Hw = hVar;
            this.v5 = lg0Var2;
        }

        @Override // abcd.o70
        public void j6(String str, byte[] bArr) throws v40 {
            this.FH.J0(true);
            this.FH.J8(true);
            try {
                this.FH.j3(bArr);
                try {
                    this.FH.XL();
                    if (!this.FH.Hw()) {
                        throw new v40(MessageFormat.format(JGitText.DW().unableToWrite, str));
                    }
                    gb0.this.u7.compareAndSet(this.Hw, new h(this.v5, this.FH.Zo()));
                } catch (InterruptedException unused) {
                    this.FH.QX();
                    throw new v40(MessageFormat.format(JGitText.DW().interruptedWriting, str));
                }
            } catch (IOException e) {
                throw new v40(MessageFormat.format(JGitText.DW().unableToWrite, str), e);
            }
        }
    }

    private static final class b extends c70.a implements d {
        private final ma0 Hw;

        public b(ma0 ma0Var, String str, a70 a70Var) {
            super(k70.a.LOOSE, str, a70Var);
            this.Hw = ma0Var;
        }

        @Override // abcd.gb0.d
        public d Zo(c70 c70Var) {
            return this;
        }

        @Override // abcd.gb0.d
        public ma0 u7() {
            return this.Hw;
        }
    }

    private static final class c extends c70.b implements d {
        private final ma0 v5;

        public c(ma0 ma0Var, String str, a70 a70Var, a70 a70Var2) {
            super(k70.a.LOOSE, str, a70Var, a70Var2);
            this.v5 = ma0Var;
        }

        @Override // abcd.gb0.d
        public d Zo(c70 c70Var) {
            return this;
        }

        @Override // abcd.gb0.d
        public ma0 u7() {
            return this.v5;
        }
    }

    private interface d extends k70 {
        d Zo(c70 c70Var);

        ma0 u7();
    }

    private class e {
        private int DW;
        final lg0.b<k70> FH = new lg0.b<>(4);
        lg0.b<d> Hw;
        private final lg0<d> j6;

        public e(lg0<d> lg0Var) {
            this.j6 = lg0Var;
        }

        private void DW(String str) {
            d dVar;
            d dVarRo = null;
            if (this.DW < this.j6.size()) {
                while (true) {
                    dVar = (d) this.j6.Ws(this.DW);
                    int iDW = l70.DW(dVar, str);
                    if (iDW >= 0) {
                        if (iDW > 0) {
                            break;
                        }
                    } else {
                        if (this.Hw == null) {
                            this.Hw = this.j6.gn(this.DW);
                        }
                        int i = this.DW + 1;
                        this.DW = i;
                        if (i >= this.j6.size()) {
                            break;
                        }
                    }
                }
                dVar = null;
            } else {
                dVar = null;
            }
            try {
                dVarRo = gb0.this.ro(dVar, str);
            } catch (IOException unused) {
            }
            if (dVarRo != null) {
                if (dVar != dVarRo && this.Hw == null) {
                    this.Hw = this.j6.gn(this.DW);
                }
                lg0.b<d> bVar = this.Hw;
                if (bVar != null) {
                    bVar.j6(dVarRo);
                }
                if (dVarRo.gn()) {
                    this.FH.j6(dVarRo);
                }
            } else if (dVar != null && this.Hw == null) {
                this.Hw = this.j6.gn(this.DW);
            }
            if (dVar != null) {
                this.DW++;
            }
        }

        private boolean FH(String str, File file) {
            String[] list = file.list(sa0.u7);
            if (list == null) {
                return false;
            }
            if (list.length > 0) {
                for (int i = 0; i < list.length; i++) {
                    if (new File(file, list[i]).isDirectory()) {
                        list[i] = String.valueOf(list[i]) + '/';
                    }
                }
                Arrays.sort(list);
                for (String str2 : list) {
                    if (str2.charAt(str2.length() - 1) == '/') {
                        FH(String.valueOf(str) + str2, new File(file, str2));
                    } else {
                        DW(String.valueOf(str) + str2);
                    }
                }
            }
            return true;
        }

        public void j6(String str) {
            if ("".equals(str)) {
                DW("HEAD");
                FH("refs/", gb0.this.Hw);
                if (this.Hw != null || this.DW >= this.j6.size()) {
                    return;
                }
                this.Hw = this.j6.gn(this.DW);
                return;
            }
            if (str.startsWith("refs/") && str.endsWith("/")) {
                this.DW = -(this.j6.J8(str) + 1);
                FH(str, new File(gb0.this.Hw, str.substring(5)));
                while (this.DW < this.j6.size() && ((d) this.j6.Ws(this.DW)).getName().startsWith(str)) {
                    if (this.Hw == null) {
                        this.Hw = this.j6.gn(this.DW);
                    }
                    this.DW++;
                }
                if (this.Hw != null) {
                    while (this.DW < this.j6.size()) {
                        lg0.b<d> bVar = this.Hw;
                        lg0<d> lg0Var = this.j6;
                        int i = this.DW;
                        this.DW = i + 1;
                        bVar.j6((d) lg0Var.Ws(i));
                    }
                }
            }
        }
    }

    private static final class f extends u70 implements d {
        private final ma0 FH;

        public f(ma0 ma0Var, String str, k70 k70Var) {
            super(str, k70Var);
            this.FH = ma0Var;
        }

        @Override // abcd.gb0.d
        public d Zo(c70 c70Var) {
            throw new UnsupportedOperationException();
        }

        @Override // abcd.gb0.d
        public ma0 u7() {
            return this.FH;
        }
    }

    private static final class g extends c70.c implements d {
        private ma0 Hw;

        public g(ma0 ma0Var, String str, a70 a70Var) {
            super(k70.a.LOOSE, str, a70Var);
            this.Hw = ma0Var;
        }

        @Override // abcd.gb0.d
        public d Zo(c70 c70Var) {
            return c70Var.FH() != null ? new c(this.Hw, getName(), DW(), c70Var.FH()) : new b(this.Hw, getName(), DW());
        }

        @Override // abcd.gb0.d
        public ma0 u7() {
            return this.Hw;
        }
    }

    private static class h extends lg0<k70> {
        static final h qp = new h(lg0.EQ(), ma0.v5);
        final ma0 fY;

        public h(lg0<k70> lg0Var, ma0 ma0Var) {
            super(lg0Var);
            this.fY = ma0Var;
        }
    }

    public gb0(ka0 ka0Var) {
        wf0 wf0VarTp = ka0Var.tp();
        this.DW = ka0Var;
        File fileU7 = ka0Var.u7();
        this.FH = fileU7;
        this.Hw = wf0VarTp.VH(fileU7, "refs/");
        this.v5 = wf0VarTp.VH(this.FH, "logs");
        this.Zo = wf0VarTp.VH(this.FH, "logs/refs/");
        this.VH = wf0VarTp.VH(this.FH, "packed-refs");
        this.gn.set(lg0.EQ());
        this.u7.set(h.qp);
    }

    private void EQ(sa0 sa0Var, lg0<k70> lg0Var, h hVar) throws IOException {
        new a(lg0Var, sa0Var, hVar, lg0Var).FH();
    }

    public static void J0(File file, int i) throws IOException {
        if (!file.delete() && file.isFile()) {
            throw new IOException(MessageFormat.format(JGitText.DW().fileCannotBeDeleted, file));
        }
        File parentFile = file.getParentFile();
        for (int i2 = 0; i2 < i && parentFile.delete(); i2++) {
            parentFile = parentFile.getParentFile();
        }
    }

    private k70 KD(k70 k70Var, int i, String str, lg0<d> lg0Var, lg0<k70> lg0Var2) throws IOException {
        k70 k70VarNw;
        if (!k70Var.gn()) {
            return k70Var;
        }
        k70 k70VarVH = k70Var.VH();
        if (5 <= i) {
            return null;
        }
        if (lg0Var == null || !k70VarVH.getName().startsWith(str)) {
            k70VarNw = nw(k70VarVH.getName(), lg0Var2);
            if (k70VarNw == null) {
                return k70Var;
            }
        } else {
            int iJ8 = lg0Var.J8(k70VarVH.getName());
            if (iJ8 >= 0) {
                k70VarNw = lg0Var.Ws(iJ8);
            } else {
                int iJ82 = lg0Var2.J8(k70VarVH.getName());
                if (iJ82 < 0) {
                    return k70Var;
                }
                k70VarNw = lg0Var2.Ws(iJ82);
            }
        }
        k70 k70VarKD = KD(k70VarNw, i + 1, str, lg0Var, lg0Var2);
        if (k70VarKD == null) {
            return null;
        }
        return new u70(k70Var.getName(), k70VarKD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void P8(d dVar) {
        lg0<d> lg0Var;
        do {
            lg0Var = this.gn.get();
        } while (!this.gn.compareAndSet(lg0Var, lg0Var.aM(dVar)));
        this.tp.incrementAndGet();
        XL();
    }

    private static k70 SI(k70 k70Var, c70 c70Var) {
        if (!k70Var.gn()) {
            return c70Var;
        }
        return new u70(k70Var.getName(), SI(k70Var.VH(), c70Var));
    }

    private boolean U2() {
        return ((s60) this.DW.gn().tp(s60.v5)).Hw();
    }

    private c70 Ws(k70 k70Var) {
        t90 t90Var = new t90(Mr());
        try {
            o90 o90VarI = t90Var.I(k70Var.DW());
            return o90VarI instanceof r90 ? new c70.b(k70Var.j6(), k70Var.getName(), k70Var.DW(), t90Var.aj(o90VarI).Zo()) : new c70.a(k70Var.j6(), k70Var.getName(), k70Var.DW());
        } finally {
            t90Var.lp();
        }
    }

    private void XL() {
        int i = this.EQ.get();
        int i2 = this.tp.get();
        if (i == i2 || !this.EQ.compareAndSet(i, i2) || i == 0) {
            return;
        }
        this.DW.v5(new t50());
    }

    private static boolean a8(byte[] bArr, int i) {
        return i >= 6 && bArr[0] == 114 && bArr[1] == 101 && bArr[2] == 102 && bArr[3] == 58 && bArr[4] == 32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private lg0<d> aM() {
        lg0<d> lg0Var = this.gn.get();
        e eVar = new e(lg0Var);
        eVar.j6("");
        lg0.b<d> bVar = eVar.Hw;
        if (bVar == null) {
            return lg0Var;
        }
        lg0 lg0VarGn = bVar.gn();
        if (this.gn.compareAndSet(lg0Var, lg0VarGn)) {
            this.tp.incrementAndGet();
        }
        return lg0VarGn;
    }

    private boolean cn(String str) {
        return str.equals("HEAD") || str.startsWith("refs/heads/") || str.startsWith("refs/remotes/") || str.equals("refs/stash");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private lg0<k70> dx(lg0<? extends k70> lg0Var) {
        return lg0Var;
    }

    private h ei() throws IOException {
        ma0 ma0VarZo = ma0.Zo(this.VH);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.VH), r60.Zo));
            try {
                return new h(vy(bufferedReader), ma0VarZo);
            } finally {
                bufferedReader.close();
            }
        } catch (FileNotFoundException unused) {
            return h.qp;
        }
    }

    private static f gW(ma0 ma0Var, String str, String str2) {
        return new f(ma0Var, str, new c70.c(k70.a.NEW, str2, null));
    }

    private h j3() throws IOException {
        h hVar = this.u7.get();
        if (!hVar.fY.FH(this.VH)) {
            return hVar;
        }
        h hVarEi = ei();
        if (this.u7.compareAndSet(hVar, hVarEi)) {
            this.tp.incrementAndGet();
        }
        return hVarEi;
    }

    public static int lg(String str) {
        int iIndexOf = str.indexOf(47);
        int i = 0;
        while (iIndexOf >= 0) {
            i++;
            iIndexOf = str.indexOf(47, iIndexOf + 1);
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private k70 nw(String str, lg0<k70> lg0Var) throws IOException {
        lg0<d> lg0Var2 = this.gn.get();
        int iJ8 = lg0Var2.J8(str);
        if (iJ8 >= 0) {
            d dVar = (d) lg0Var2.Ws(iJ8);
            d dVarRo = ro(dVar, str);
            if (dVarRo == null) {
                if (this.gn.compareAndSet(lg0Var2, lg0Var2.j3(iJ8))) {
                    this.tp.incrementAndGet();
                }
                return lg0Var.QX(str);
            }
            if (dVar != dVarRo && this.gn.compareAndSet(lg0Var2, lg0Var2.Mr(iJ8, dVarRo))) {
                this.tp.incrementAndGet();
            }
            return dVarRo;
        }
        d dVarRo2 = ro(null, str);
        if (dVarRo2 == null) {
            return lg0Var.QX(str);
        }
        int i = 0;
        while (true) {
            String[] strArr = we;
            if (i >= strArr.length) {
                if (this.gn.compareAndSet(lg0Var2, lg0Var2.Hw(iJ8, dVarRo2))) {
                    this.tp.incrementAndGet();
                }
                return dVarRo2;
            }
            if (str.equals(strArr[i])) {
                return dVarRo2;
            }
            i++;
        }
    }

    private void rN(String str, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream;
        File fileYS = yS(str);
        if ((U2() && cn(str)) || fileYS.isFile()) {
            pb0 pb0Var = (pb0) Mr().gn().tp(pb0.Hw);
            try {
                fileOutputStream = new FileOutputStream(fileYS, true);
            } catch (FileNotFoundException e2) {
                File parentFile = fileYS.getParentFile();
                if (parentFile.exists()) {
                    throw e2;
                }
                if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                    throw new IOException(MessageFormat.format(JGitText.DW().cannotCreateDirectory, parentFile));
                }
                fileOutputStream = new FileOutputStream(fileYS, true);
            }
            try {
                if (pb0Var.FH()) {
                    FileChannel channel = fileOutputStream.getChannel();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    while (byteBufferWrap.remaining() > 0) {
                        channel.write(byteBufferWrap);
                    }
                    channel.force(true);
                } else {
                    fileOutputStream.write(bArr);
                }
            } finally {
                fileOutputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d ro(d dVar, String str) throws IOException {
        ma0 ma0Var;
        File fileQX = QX(str);
        if (dVar != null) {
            ma0 ma0VarU7 = dVar.u7();
            if (!ma0VarU7.FH(fileQX)) {
                return dVar;
            }
            ma0Var = ma0VarU7;
            str = dVar.getName();
        } else {
            ma0Var = null;
        }
        ma0 ma0VarZo = ma0.Zo(fileQX);
        try {
            byte[] bArrV5 = eg0.v5(fileQX, 4096);
            int length = bArrV5.length;
            if (length == 0) {
                return null;
            }
            if (!a8(bArrV5, length)) {
                if (length < 40) {
                    return null;
                }
                try {
                    a70 a70VarG3 = a70.g3(bArrV5, 0);
                    if (dVar == null || dVar.gn() || !dVar.VH().DW().aM(a70VarG3)) {
                        return new g(ma0VarZo, str, a70VarG3);
                    }
                    ma0Var.VH(ma0VarZo);
                    return dVar;
                } catch (IllegalArgumentException unused) {
                    while (length > 0 && Character.isWhitespace(bArrV5[length - 1])) {
                        length--;
                    }
                    throw new IOException(MessageFormat.format(JGitText.DW().notARef, str, kg0.gn(bArrV5, 0, length)));
                }
            }
            if (length == 4096) {
                return null;
            }
            while (length > 0 && Character.isWhitespace(bArrV5[length - 1])) {
                length--;
            }
            if (length < 6) {
                throw new IOException(MessageFormat.format(JGitText.DW().notARef, str, kg0.gn(bArrV5, 0, length)));
            }
            String strGn = kg0.gn(bArrV5, 5, length);
            if (dVar == null || !dVar.gn() || !dVar.VH().getName().equals(strGn)) {
                return gW(ma0VarZo, str, strGn);
            }
            ma0Var.VH(ma0VarZo);
            return dVar;
        } catch (FileNotFoundException unused2) {
            return null;
        }
    }

    private lg0<k70> vy(BufferedReader bufferedReader) throws IOException {
        k70 aVar;
        lg0.b bVar = new lg0.b();
        k70 k70Var = null;
        boolean z = false;
        boolean zContains = false;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                if (z) {
                    bVar.VH();
                }
                return bVar.gn();
            }
            if (line.charAt(0) != '#') {
                if (line.charAt(0) != '^') {
                    int iIndexOf = line.indexOf(32);
                    a70 a70VarVJ = a70.vJ(line.substring(0, iIndexOf));
                    String strWe = we(line, iIndexOf + 1, line.length());
                    aVar = zContains ? new c70.a(k70.a.PACKED, strWe, a70VarVJ) : new c70.c(k70.a.PACKED, strWe, a70VarVJ);
                    if (k70Var != null && l70.FH(k70Var, aVar) > 0) {
                        z = true;
                    }
                    bVar.j6(aVar);
                } else {
                    if (k70Var == null) {
                        throw new IOException(JGitText.DW().peeledLineBeforeRef);
                    }
                    aVar = new c70.b(k70.a.PACKED, k70Var.getName(), k70Var.DW(), a70.vJ(line.substring(1)));
                    bVar.v5(bVar.Zo() - 1, aVar);
                }
                k70Var = aVar;
            } else if (line.startsWith("# pack-refs with:")) {
                zContains = line.substring(17).contains(" peeled");
            }
        }
    }

    private static String we(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 - i);
        sb.append((CharSequence) str, i, i2);
        return sb.toString();
    }

    @Override // abcd.m70
    /* renamed from: BT, reason: merged with bridge method [inline-methods] */
    public hb0 Zo(String str, boolean z) throws IOException {
        h hVarJ3 = j3();
        k70 k70VarNw = nw(str, hVarJ3);
        if (k70VarNw != null) {
            k70VarNw = KD(k70VarNw, 0, null, null, hVarJ3);
        }
        boolean z2 = false;
        if (k70VarNw == null) {
            k70VarNw = new c70.c(k70.a.NEW, str, null);
        } else {
            if (z && k70VarNw.gn()) {
                z2 = true;
            }
            if (z2) {
                k70VarNw = new c70.c(k70.a.LOOSE, str, k70VarNw.DW());
            }
        }
        hb0 hb0Var = new hb0(this, k70VarNw);
        if (z2) {
            hb0Var.a8();
        }
        return hb0Var;
    }

    @Override // abcd.m70
    public void DW() throws IOException {
        cg0.FH(this.Hw);
        cg0.FH(this.v5);
        cg0.FH(this.Zo);
        cg0.FH(new File(this.Hw, "heads/"));
        cg0.FH(new File(this.Hw, "tags/"));
        cg0.FH(new File(this.Zo, "heads/"));
    }

    @Override // abcd.m70
    public k70 FH(String str) throws IOException {
        h hVarJ3 = j3();
        String[] strArr = m70.j6;
        int length = strArr.length;
        k70 k70VarNw = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            k70VarNw = nw(String.valueOf(strArr[i]) + str, hVarJ3);
            if (k70VarNw != null) {
                k70VarNw = KD(k70VarNw, 0, null, null, hVarJ3);
                break;
            }
            i++;
        }
        XL();
        return k70VarNw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // abcd.m70
    public Map<String, k70> Hw(String str) throws IOException {
        h hVarJ3 = j3();
        lg0<d> lg0Var = this.gn.get();
        e eVar = new e(lg0Var);
        eVar.j6(str);
        lg0.b<d> bVar = eVar.Hw;
        if (bVar != null) {
            bVar.VH();
            lg0<d> lg0VarGn = eVar.Hw.gn();
            if (this.gn.compareAndSet(lg0Var, lg0VarGn)) {
                this.tp.incrementAndGet();
            }
            lg0Var = lg0VarGn;
        }
        XL();
        lg0.b<k70> bVar2 = eVar.FH;
        lg0 lg0VarJ3 = lg0Var;
        int i = 0;
        while (i < bVar2.Zo()) {
            k70 k70VarFH = bVar2.FH(i);
            k70 k70VarKD = KD(k70VarFH, 0, str, lg0VarJ3, hVarJ3);
            if (k70VarKD == null || k70VarKD.DW() == null) {
                bVar2.Hw(i);
                int iJ8 = lg0VarJ3.J8(k70VarFH.getName());
                if (iJ8 >= 0) {
                    lg0VarJ3 = lg0VarJ3.j3(iJ8);
                }
            } else {
                bVar2.v5(i, k70VarKD);
                i++;
            }
        }
        bVar2.VH();
        dx(lg0VarJ3);
        return new mg0(str, hVarJ3, lg0VarJ3, bVar2.gn());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void J8(hb0 hb0Var) throws IOException {
        lg0<d> lg0Var;
        int iJ8;
        k70 k70VarV5 = hb0Var.EQ().v5();
        String name = k70VarV5.getName();
        h hVarJ3 = j3();
        if (hVarJ3.VH(name)) {
            sa0 sa0Var = new sa0(this.VH, hb0Var.Ws().tp());
            if (!sa0Var.u7()) {
                throw new o40(this.VH);
            }
            try {
                h hVarEi = ei();
                int iJ82 = hVarEi.J8(name);
                if (iJ82 >= 0) {
                    EQ(sa0Var, hVarEi.j3(iJ82), hVarJ3);
                }
            } finally {
                sa0Var.QX();
            }
        }
        do {
            lg0Var = this.gn.get();
            iJ8 = lg0Var.J8(name);
            if (iJ8 < 0) {
                break;
            }
        } while (!this.gn.compareAndSet(lg0Var, lg0Var.j3(iJ8)));
        int iLg = lg(name) - 2;
        J0(yS(name), iLg);
        if (k70VarV5.j6().j6()) {
            hb0Var.P8();
            J0(QX(name), iLg);
        }
        this.tp.incrementAndGet();
        XL();
    }

    public p70 Mr() {
        return this.DW;
    }

    public File QX(String str) {
        if (!str.startsWith("refs/")) {
            return new File(this.FH, str);
        }
        return new File(this.Hw, str.substring(5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // abcd.m70
    public k70 VH(k70 k70Var) {
        lg0<d> lg0Var;
        int iJ8;
        k70 k70VarV5 = k70Var.v5();
        if (k70VarV5.Hw() || k70VarV5.DW() == null) {
            return k70Var;
        }
        c70 c70VarWs = Ws(k70VarV5);
        if (k70VarV5.j6().j6() && (iJ8 = (lg0Var = this.gn.get()).J8(k70VarV5.getName())) >= 0 && lg0Var.Ws(iJ8) == k70VarV5) {
            this.gn.compareAndSet(lg0Var, lg0Var.Mr(iJ8, ((d) k70VarV5).Zo(c70VarWs)));
        }
        return SI(k70Var, c70VarWs);
    }

    public void cb(hb0 hb0Var, ma0 ma0Var, String str) {
        P8(gW(ma0Var, hb0Var.EQ().getName(), str));
        XL();
    }

    public void er(n70 n70Var, String str, boolean z) throws IOException {
        a70 a70VarTp = n70Var.tp();
        a70 a70VarU7 = n70Var.u7();
        k70 k70VarEQ = n70Var.EQ();
        i70 i70VarJ0 = n70Var.J0();
        byte[] bArrDW = r60.DW(a70.I(a70VarTp) + ' ' + a70.I(a70VarU7) + ' ' + (i70VarJ0 == null ? new i70(this.DW) : new i70(i70VarJ0)).v5() + '\t' + str + '\n');
        if (!z || !k70VarEQ.gn()) {
            rN(k70VarEQ.getName(), bArrDW);
        } else {
            rN(k70VarEQ.getName(), bArrDW);
            rN(k70VarEQ.v5().getName(), bArrDW);
        }
    }

    @Override // abcd.m70
    public void j6() {
    }

    public void sh(hb0 hb0Var, ma0 ma0Var) {
        P8(new g(ma0Var, hb0Var.EQ().v5().getName(), hb0Var.u7().Zo()));
    }

    @Override // abcd.m70
    public boolean v5(String str) throws IOException {
        h hVarJ3 = j3();
        lg0<d> lg0VarAM = aM();
        int iLastIndexOf = str.lastIndexOf(47);
        while (iLastIndexOf > 0) {
            String strSubstring = str.substring(0, iLastIndexOf);
            if (lg0VarAM.VH(strSubstring) || hVarJ3.VH(strSubstring)) {
                return true;
            }
            iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
        }
        String str2 = String.valueOf(str) + '/';
        int i = -(hVarJ3.J8(str2) + 1);
        if (i < hVarJ3.size() && hVarJ3.Ws(i).getName().startsWith(str2)) {
            return true;
        }
        int i2 = -(lg0VarAM.J8(str2) + 1);
        return i2 < lg0VarAM.size() && ((d) lg0VarAM.Ws(i2)).getName().startsWith(str2);
    }

    public File yS(String str) {
        if (!str.startsWith("refs/")) {
            return new File(this.v5, str);
        }
        return new File(this.Zo, str.substring(5));
    }
}
