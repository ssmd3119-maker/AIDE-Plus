package abcd;

import abcd.f60;
import abcd.s60;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class kf0 extends ef0 {
    private static /* synthetic */ int[] U2;
    private static /* synthetic */ int[] a8;
    private static /* synthetic */ int[] lg;
    private int EQ;
    private int J0;
    private int J8;
    protected p70 QX;
    private f60 Ws;
    private byte[] tp;
    private final c u7;
    private b[] we;
    protected static final b[] XL = new b[0];
    private static final byte[] aM = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    private static final byte[] j3 = r60.v5(3);
    private static final Comparator<b> Mr = new a();

    class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            int iBr;
            int iBr2;
            byte[] bArr = bVar.j6;
            byte[] bArr2 = bVar2.j6;
            int i = bVar.DW;
            int i2 = bVar2.DW;
            int i3 = 0;
            while (i3 < i && i3 < i2) {
                int i4 = (bArr[i3] & 255) - (bArr2[i3] & 255);
                if (i4 != 0) {
                    return i4;
                }
                i3++;
            }
            if (i3 < i) {
                iBr = bArr[i3] & 255;
                iBr2 = kf0.br(bVar2);
            } else if (i3 < i2) {
                iBr = kf0.br(bVar);
                iBr2 = bArr2[i3] & 255;
            } else {
                iBr = kf0.br(bVar);
                iBr2 = kf0.br(bVar2);
            }
            return iBr - iBr2;
        }
    }

    protected static abstract class b {
        int DW;
        byte[] j6;

        public abstract long DW();

        public abstract long FH();

        public abstract t60 Hw();

        public abstract InputStream Zo();

        public void j6(CharsetEncoder charsetEncoder) throws CharacterCodingException {
            try {
                ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(v5()));
                this.DW = byteBufferEncode.limit();
                if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
                    this.j6 = byteBufferEncode.array();
                    return;
                }
                byte[] bArr = new byte[this.DW];
                this.j6 = bArr;
                byteBufferEncode.get(bArr);
            } catch (CharacterCodingException unused) {
                throw new RuntimeException(MessageFormat.format(JGitText.DW().unencodeableFile, v5()));
            }
        }

        public String toString() {
            return String.valueOf(Hw().toString()) + " " + v5();
        }

        public abstract String v5();
    }

    private static final class c {
        final CharsetEncoder DW = r60.Zo.newEncoder();
        MessageDigest FH;
        byte[] Hw;
        int Zo;
        final lf0 j6;
        jf0 v5;

        public c(lf0 lf0Var) {
            this.j6 = lf0Var;
        }

        public void j6() {
            if (this.FH == null) {
                this.FH = r60.Zo();
                this.Hw = new byte[2048];
            }
        }
    }

    public enum d {
        EQUAL,
        DIFFER_BY_METADATA,
        SMUDGED,
        DIFFER_BY_TIMESTAMP;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] dVarArrValuesCustom = values();
            int length = dVarArrValuesCustom.length;
            d[] dVarArr = new d[length];
            System.arraycopy(dVarArrValuesCustom, 0, dVarArr, 0, length);
            return dVarArr;
        }
    }

    private static class e extends f60 {
        final b DW;

        public e(b bVar) {
            super(Collections.emptyList());
            this.DW = bVar;
        }

        public f60 v5() throws IOException {
            f60 f60Var = new f60();
            InputStream inputStreamZo = this.DW.Zo();
            try {
                f60Var.Hw(inputStreamZo);
                inputStreamZo.close();
                if (f60Var.DW().isEmpty()) {
                    return null;
                }
                return f60Var;
            } catch (Throwable th) {
                inputStreamZo.close();
                throw th;
            }
        }
    }

    private static class f extends e {
        final p70 FH;

        public f(b bVar, p70 p70Var) {
            super(bVar);
            this.FH = p70Var;
        }

        private void Zo(f60 f60Var, File file) throws IOException {
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    f60Var.Hw(fileInputStream);
                } finally {
                    fileInputStream.close();
                }
            }
        }

        @Override // abcd.kf0.e
        public f60 v5() throws IOException {
            f60 f60Var;
            if (this.DW == null || (f60Var = super.v5()) == null) {
                f60Var = new f60();
            }
            wf0 wf0VarTp = this.FH.tp();
            String strDW = ((s60) this.FH.gn().tp(s60.v5)).DW();
            if (strDW != null) {
                Zo(f60Var, strDW.startsWith("~/") ? wf0VarTp.VH(wf0VarTp.J8(), strDW.substring(2)) : wf0VarTp.VH(null, strDW));
            }
            Zo(f60Var, wf0VarTp.VH(this.FH.u7(), "info/exclude"));
            if (f60Var.DW().isEmpty()) {
                return null;
            }
            return f60Var;
        }
    }

    public kf0(lf0 lf0Var) {
        this.u7 = new c(lf0Var);
    }

    private long KD(InputStream inputStream) throws IOException {
        long j = 0;
        while (true) {
            long jSkip = inputStream.skip(1048576L);
            if (jSkip <= 0) {
                return j;
            }
            j += jSkip;
        }
    }

    public static /* synthetic */ int[] P8() {
        int[] iArr = U2;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[s60.b.valuesCustom().length];
        try {
            iArr2[s60.b.FALSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[s60.b.INPUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[s60.b.TRUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        U2 = iArr2;
        return iArr2;
    }

    private boolean Qq(b bVar) throws IOException {
        InputStream inputStreamZo = bVar.Zo();
        try {
            return m30.Hw(inputStreamZo);
        } finally {
            XG(inputStreamZo);
        }
    }

    private byte[] SI(InputStream inputStream, long j) throws IOException {
        long j2;
        c cVar = this.u7;
        MessageDigest messageDigest = cVar.FH;
        byte[] bArr = cVar.Hw;
        messageDigest.reset();
        messageDigest.update(j3);
        messageDigest.update((byte) 32);
        if (j == 0) {
            messageDigest.update((byte) 48);
            j2 = j;
        } else {
            int length = bArr.length;
            j2 = j;
            int i = length;
            do {
                i--;
                bArr[i] = aM[(int) (j2 % 10)];
                j2 /= 10;
            } while (j2 > 0);
            messageDigest.update(bArr, i, length - i);
        }
        messageDigest.update((byte) 0);
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 <= 0) {
                break;
            }
            messageDigest.update(bArr, 0, i2);
            j2 += i2;
        }
        return j2 != j ? ef0.gn : messageDigest.digest();
    }

    private static void XG(InputStream inputStream) throws IOException {
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    private boolean XX() {
        int i = P8()[vJ().j6().ordinal()];
        return i == 2 || i == 3;
    }

    public static int br(b bVar) {
        return bVar.Hw() == t60.Hw ? 47 : 0;
    }

    private ByteBuffer cb(byte[] bArr, int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            return eg0.Zo(sh(byteArrayInputStream), i);
        } finally {
            XG(byteArrayInputStream);
        }
    }

    private f60 ef() {
        f60 f60Var = this.Ws;
        if (f60Var instanceof e) {
            this.Ws = ((e) f60Var).v5();
        }
        return this.Ws;
    }

    public static /* synthetic */ int[] ei() {
        int[] iArr = lg;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[d.valuesCustom().length];
        try {
            iArr2[d.DIFFER_BY_METADATA.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[d.DIFFER_BY_TIMESTAMP.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[d.EQUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[d.SMUDGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        lg = iArr2;
        return iArr2;
    }

    private byte[] g3(b bVar) {
        try {
            InputStream inputStreamZo = bVar.Zo();
            if (inputStreamZo == null) {
                return ef0.gn;
            }
            try {
                this.u7.j6();
                long jFH = bVar.FH();
                if (!XX()) {
                    return SI(inputStreamZo, jFH);
                }
                if (jFH <= 65536) {
                    ByteBuffer byteBufferZo = eg0.Zo(inputStreamZo, (int) jFH);
                    byte[] bArrArray = byteBufferZo.array();
                    int iLimit = byteBufferZo.limit();
                    if (!sy(bArrArray, iLimit)) {
                        ByteBuffer byteBufferCb = cb(bArrArray, iLimit);
                        bArrArray = byteBufferCb.array();
                        iLimit = byteBufferCb.limit();
                    }
                    return SI(new ByteArrayInputStream(bArrArray, 0, iLimit), iLimit);
                }
                if (Qq(bVar)) {
                    return SI(inputStreamZo, jFH);
                }
                InputStream inputStreamSh = sh(bVar.Zo());
                try {
                    long jKD = KD(inputStreamSh);
                    XG(inputStreamSh);
                    return SI(sh(inputStreamZo), jKD);
                } catch (Throwable th) {
                    XG(inputStreamSh);
                    throw th;
                }
            } finally {
                XG(inputStreamZo);
            }
        } catch (IOException unused) {
            return ef0.gn;
        }
    }

    private boolean ro(b40 b40Var) {
        if (!tp().aM(b40Var.u7())) {
            return true;
        }
        b40Var.rN((int) sG());
        return false;
    }

    private InputStream sh(InputStream inputStream) {
        return new sg0(inputStream);
    }

    private boolean sy(byte[] bArr, int i) {
        return m30.Zo(bArr, i);
    }

    public static /* synthetic */ int[] vy() {
        int[] iArr = a8;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[f60.a.valuesCustom().length];
        try {
            iArr2[f60.a.CHECK_PARENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[f60.a.IGNORED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[f60.a.NOT_IGNORED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        a8 = iArr2;
        return iArr2;
    }

    private void yO() {
        b bVar = this.we[this.J8];
        this.Hw = bVar.Hw().Zo();
        int i = bVar.DW;
        int i2 = this.Zo;
        Zo(i2 + i, i2);
        System.arraycopy(bVar.j6, 0, this.v5, this.Zo, i);
        this.VH = this.Zo + i;
    }

    @Override // abcd.ef0
    public void DW(int i) {
        this.J8 -= i;
        yO();
    }

    public byte[] I(b bVar) {
        p70 p70Var = this.QX;
        if (p70Var == null) {
            return ef0.gn;
        }
        try {
            return Mz(p70Var.XL(), bVar);
        } catch (t40 unused) {
            return ef0.gn;
        }
    }

    @Override // abcd.ef0
    public void Mr(int i) {
        this.J8 += i;
        if (VH()) {
            return;
        }
        yO();
    }

    public byte[] Mz(File file, b bVar) {
        try {
            p70 p70VarJ8 = lc0.J8(file, bVar.v5());
            try {
                if (p70VarJ8 == null) {
                    return ef0.gn;
                }
                a70 a70VarRo = p70VarJ8.ro("HEAD");
                if (a70VarRo == null) {
                    return ef0.gn;
                }
                byte[] bArr = new byte[20];
                a70VarRo.tp(bArr, 0);
                return bArr;
            } catch (IOException unused) {
                return ef0.gn;
            } finally {
                p70VarJ8.j6();
            }
        } catch (IOException unused2) {
            return ef0.gn;
        }
    }

    public boolean OW(b40 b40Var, boolean z) {
        d dVarNw = nw(b40Var);
        int i = ei()[dVarNw.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return ro(b40Var);
        }
        if (i != 4) {
            throw new IllegalStateException(MessageFormat.format(JGitText.DW().unexpectedCompareResult, dVarNw.name()));
        }
        if (z) {
            return ro(b40Var);
        }
        return true;
    }

    @Override // abcd.ef0
    public byte[] QX() {
        c40 c40Var;
        b40 b40VarVy;
        if (this.EQ == this.J8) {
            return this.tp;
        }
        c cVar = this.u7;
        jf0 jf0Var = cVar.v5;
        if (jf0Var != null && (c40Var = (c40) jf0Var.QX(cVar.Zo, c40.class)) != null && (b40VarVy = c40Var.vy()) != null && nw(b40VarVy) == d.EQUAL) {
            return c40Var.QX();
        }
        int i = this.Hw & 61440;
        if (i == 32768) {
            int i2 = this.J8;
            this.EQ = i2;
            byte[] bArrG3 = g3(this.we[i2]);
            this.tp = bArrG3;
            return bArrG3;
        }
        if (i == 40960) {
            return ef0.gn;
        }
        if (i != 57344) {
            return ef0.gn;
        }
        int i3 = this.J8;
        this.EQ = i3;
        byte[] bArrI = I(this.we[i3]);
        this.tp = bArrI;
        return bArrI;
    }

    public t60 Sf(c40 c40Var) {
        t60 t60VarU7 = u7();
        if (c40Var == null || vJ().DW()) {
            return t60VarU7;
        }
        t60 t60VarU72 = c40Var.u7();
        return (t60.Zo == t60VarU7 && t60.VH == t60VarU72) ? t60VarU72 : (t60.VH == t60VarU7 && t60.Zo == t60VarU72) ? t60VarU72 : t60VarU7;
    }

    @Override // abcd.ef0
    public boolean VH() {
        return this.J8 == this.J0;
    }

    @Override // abcd.ef0
    public boolean Ws() {
        return this.EQ == this.J8 || (this.Hw & 61440) == 32768;
    }

    @Override // abcd.ef0
    public int aM() {
        return 0;
    }

    public boolean aj() {
        return lp(this.VH);
    }

    public void ca(b[] bVarArr) throws CharacterCodingException {
        b[] bVarArr2;
        this.we = bVarArr;
        CharsetEncoder charsetEncoder = this.u7.DW;
        int i = 0;
        int i2 = 0;
        while (true) {
            bVarArr2 = this.we;
            if (i >= bVarArr2.length) {
                break;
            }
            b bVar = bVarArr2[i];
            if (bVar != null) {
                String strV5 = bVar.v5();
                if (!".".equals(strV5) && !"..".equals(strV5) && !".git".equals(strV5)) {
                    if (".gitignore".equals(strV5)) {
                        this.Ws = new e(bVar);
                    }
                    if (i != i2) {
                        this.we[i2] = bVar;
                    }
                    bVar.j6(charsetEncoder);
                    i2++;
                }
            }
            i++;
        }
        this.J0 = i2;
        Arrays.sort(bVarArr2, 0, i2, Mr);
        this.EQ = -1;
        this.J8 = 0;
        if (VH()) {
            return;
        }
        yO();
    }

    public b cn() {
        return this.we[this.J8];
    }

    public long dx() {
        return cn().DW();
    }

    @Override // abcd.ef0
    public void er() {
        if (gn()) {
            return;
        }
        this.J8 = 0;
        if (VH()) {
            return;
        }
        yO();
    }

    @Override // abcd.ef0
    public boolean gn() {
        return this.J8 == 0;
    }

    public InputStream kQ() {
        InputStream inputStreamZo = cn().Zo();
        return vJ().j6() != s60.b.FALSE ? new sg0(inputStreamZo) : inputStreamZo;
    }

    public boolean lp(int i) {
        f60 f60VarEf = ef();
        if (f60VarEf != null) {
            int i2 = this.Zo;
            if (i2 > 0) {
                i2--;
            }
            int i3 = vy()[f60VarEf.FH(jf0.gW(this.v5, i2, i), t60.Hw.Hw(this.Hw)).ordinal()];
            if (i3 == 1) {
                return false;
            }
            if (i3 == 2) {
                return true;
            }
        }
        ef0 ef0Var = this.j6;
        if (ef0Var instanceof kf0) {
            return ((kf0) ef0Var).lp(i);
        }
        return false;
    }

    public d nw(b40 b40Var) {
        if (b40Var.Ws()) {
            return d.EQUAL;
        }
        if (b40Var.j3()) {
            return d.DIFFER_BY_METADATA;
        }
        if (!b40Var.aM() && sG() != b40Var.VH()) {
            return d.DIFFER_BY_METADATA;
        }
        int iJ0 = J0() ^ b40Var.EQ();
        if (iJ0 != 0 && !t60.v5.Hw(b40Var.EQ())) {
            if (!this.u7.j6.DW()) {
                iJ0 &= t60.VH.Zo() ^ (-1);
            }
            if (iJ0 != 0) {
                return d.DIFFER_BY_METADATA;
            }
        }
        long jZo = b40Var.Zo();
        long jDx = dx();
        if (jZo % 1000 == 0) {
            jDx -= jDx % 1000;
        }
        return jDx != jZo ? d.DIFFER_BY_TIMESTAMP : !b40Var.aM() ? d.EQUAL : d.SMUDGED;
    }

    public long sG() {
        return cn().FH();
    }

    public lf0 vJ() {
        return this.u7.j6;
    }

    public void x9(p70 p70Var) {
        this.QX = p70Var;
        f60 f60Var = this.Ws;
        this.Ws = new f(f60Var instanceof e ? ((e) f60Var).DW : null, p70Var);
    }

    public kf0(kf0 kf0Var) {
        super(kf0Var);
        this.u7 = kf0Var.u7;
    }
}
