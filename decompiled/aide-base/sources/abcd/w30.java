package abcd;

import abcd.pg0;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Comparator;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class w30 {
    private b40[] DW;
    private int FH;
    private d40 Hw;
    private ma0 VH;
    private final wf0 Zo;
    private byte[] gn;
    private final File j6;
    private q50 tp;
    private byte[] u7;
    private sa0 v5;
    private static final byte[] EQ = {68, 73, 82, 67};
    private static final b40[] we = new b40[0];
    private static final byte[] J0 = new byte[0];
    static final Comparator<b40> J8 = new a();

    class a implements Comparator<b40> {
        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(b40 b40Var, b40 b40Var2) {
            int iFH = w30.FH(b40Var, b40Var2);
            return iFH != 0 ? iFH : b40Var.we() - b40Var2.we();
        }
    }

    public w30(File file, wf0 wf0Var) {
        this.j6 = file;
        this.Zo = wf0Var;
        DW();
    }

    private void BT(InputStream inputStream, MessageDigest messageDigest, byte[] bArr, long j) throws IOException {
        byte[] bArr2 = new byte[4096];
        while (0 < j) {
            int i = inputStream.read(bArr2, 0, (int) Math.min(4096, j));
            if (i < 0) {
                throw new EOFException(MessageFormat.format(JGitText.DW().shortReadOfOptionalDIRCExtensionExpectedAnotherBytes, tp(bArr), Long.valueOf(j)));
            }
            messageDigest.update(bArr2, 0, i);
            j -= i;
        }
    }

    public static int FH(b40 b40Var, b40 b40Var2) {
        byte[] bArr = b40Var.FH;
        return Hw(bArr, bArr.length, b40Var2);
    }

    public static int Hw(byte[] bArr, int i, b40 b40Var) {
        byte[] bArr2 = b40Var.FH;
        return v5(bArr, i, bArr2, bArr2.length);
    }

    public static w30 Mr() {
        return new w30(null, null);
    }

    private static boolean QX(byte[] bArr) {
        if (bArr.length < EQ.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr2 = EQ;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public static w30 XL(File file, wf0 wf0Var) throws IOException {
        w30 w30Var = new w30(file, wf0Var);
        if (!w30Var.j3()) {
            throw new o40(file);
        }
        try {
            w30Var.lg();
            return w30Var;
        } catch (IOException e) {
            w30Var.P8();
            throw e;
        } catch (Error e2) {
            w30Var.P8();
            throw e2;
        } catch (RuntimeException e3) {
            w30Var.P8();
            throw e3;
        }
    }

    public static w30 a8(File file, wf0 wf0Var) throws IOException {
        w30 w30Var = new w30(file, wf0Var);
        w30Var.lg();
        return w30Var;
    }

    public static w30 aM(File file, wf0 wf0Var, q50 q50Var) throws IOException {
        w30 w30VarXL = XL(file, wf0Var);
        w30VarXL.er(q50Var);
        return w30VarXL;
    }

    private void er(q50 q50Var) {
        this.tp = q50Var;
    }

    private void gW(sa0 sa0Var) {
        if (this.j6 == null) {
            throw new IllegalStateException(JGitText.DW().dirCacheIsNotLocked);
        }
        if (sa0Var == null) {
            throw new IllegalStateException(MessageFormat.format(JGitText.DW().dirCacheFileIsNotLocked, this.j6.getAbsolutePath()));
        }
    }

    private void rN(InputStream inputStream) throws IOException {
        boolean z;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        MessageDigest messageDigestZo = r60.Zo();
        byte[] bArr = new byte[20];
        eg0.DW(bufferedInputStream, bArr, 0, 12);
        messageDigestZo.update(bArr, 0, 12);
        if (!QX(bArr)) {
            throw new i40(JGitText.DW().notADIRCFile);
        }
        int iDW = ig0.DW(bArr, 4);
        if (iDW == 3) {
            z = true;
        } else {
            if (iDW != 2) {
                throw new i40(MessageFormat.format(JGitText.DW().unknownDIRCVersion, Integer.valueOf(iDW)));
            }
            z = false;
        }
        int iDW2 = ig0.DW(bArr, 8);
        this.FH = iDW2;
        if (iDW2 < 0) {
            throw new i40(JGitText.DW().DIRCHasTooManyEntries);
        }
        int iGn = b40.gn(z);
        int i = this.FH;
        byte[] bArr2 = new byte[iGn * i];
        this.DW = new b40[i];
        hg0 hg0Var = new hg0();
        for (int i2 = 0; i2 < this.FH; i2++) {
            this.DW[i2] = new b40(bArr2, hg0Var, bufferedInputStream, messageDigestZo);
        }
        this.VH = ma0.Zo(this.j6);
        while (true) {
            bufferedInputStream.mark(21);
            eg0.DW(bufferedInputStream, bArr, 0, 20);
            if (bufferedInputStream.read() < 0) {
                byte[] bArrDigest = messageDigestZo.digest();
                this.gn = bArrDigest;
                if (!Arrays.equals(bArrDigest, bArr)) {
                    throw new i40(JGitText.DW().DIRCChecksumMismatch);
                }
                return;
            }
            bufferedInputStream.reset();
            messageDigestZo.update(bArr, 0, 8);
            eg0.VH(bufferedInputStream, 8L);
            long jHw = ig0.Hw(bArr, 4);
            if (ig0.DW(bArr, 0) == 1414677829) {
                if (2147483647L < jHw) {
                    throw new i40(MessageFormat.format(JGitText.DW().DIRCExtensionIsTooLargeAt, tp(bArr), Long.valueOf(jHw)));
                }
                int i3 = (int) jHw;
                byte[] bArr3 = new byte[i3];
                eg0.DW(bufferedInputStream, bArr3, 0, i3);
                messageDigestZo.update(bArr3, 0, i3);
                this.Hw = new d40(bArr3, new hg0(), null);
            } else if (bArr[0] < 65 || bArr[0] > 90) {
                break;
            } else {
                BT(bufferedInputStream, messageDigestZo, bArr, jHw);
            }
        }
        throw new i40(MessageFormat.format(JGitText.DW().DIRCExtensionNotSupportedByThisVersion, tp(bArr)));
    }

    private static String tp(byte[] bArr) {
        return "'" + new String(bArr, 0, 4, "ISO-8859-1") + "'";
    }

    public static int v5(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < i && i3 < i2; i3++) {
            int i4 = (bArr[i3] & 255) - (bArr2[i3] & 255);
            if (i4 != 0) {
                return i4;
            }
        }
        return i - i2;
    }

    public void DW() {
        this.VH = null;
        this.DW = we;
        this.FH = 0;
        this.Hw = null;
        this.gn = J0;
    }

    public d40 EQ(boolean z) {
        if (z) {
            if (this.Hw == null) {
                this.Hw = new d40();
            }
            this.Hw.Ws(this.DW, this.FH, 0, 0);
        }
        return this.Hw;
    }

    public b40 J0(String str) {
        int iGn = gn(str);
        if (iGn < 0) {
            return null;
        }
        return this.DW[iGn];
    }

    public int J8() {
        return this.FH;
    }

    public void P8() {
        sa0 sa0Var = this.v5;
        if (sa0Var != null) {
            this.v5 = null;
            sa0Var.QX();
        }
    }

    public a70 SI(e70 e70Var) {
        return EQ(true).XL(this.DW, 0, 0, e70Var);
    }

    public int U2(int i) {
        b40 b40Var = this.DW[i];
        int i2 = i + 1;
        while (i2 < this.FH) {
            b40 b40Var2 = this.DW[i2];
            if (FH(b40Var, b40Var2) != 0) {
                break;
            }
            i2++;
            b40Var = b40Var2;
        }
        return i2;
    }

    public a40 VH() {
        return new a40(this, this.FH + 16);
    }

    public boolean Ws() {
        for (int i = 0; i < this.FH; i++) {
            if (this.DW[i].we() > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean Zo() {
        sa0 sa0Var = this.v5;
        gW(sa0Var);
        this.v5 = null;
        if (!sa0Var.Hw()) {
            return false;
        }
        this.VH = sa0Var.Zo();
        if (this.tp == null || Arrays.equals(this.gn, this.u7)) {
            return true;
        }
        this.tp.DW(new p50());
        return true;
    }

    public void ei() throws IOException {
        sa0 sa0Var = this.v5;
        gW(sa0Var);
        try {
            nw(new vg0(sa0Var.gn()));
        } catch (IOException e) {
            sa0Var.QX();
            throw e;
        } catch (Error e2) {
            sa0Var.QX();
            throw e2;
        } catch (RuntimeException e3) {
            sa0Var.QX();
            throw e3;
        }
    }

    public int gn(String str) {
        byte[] bArrDW = r60.DW(str);
        return u7(bArrDW, bArrDW.length);
    }

    public boolean j3() throws IOException {
        if (this.j6 == null) {
            throw new IOException(JGitText.DW().dirCacheDoesNotHaveABackingFile);
        }
        sa0 sa0Var = new sa0(this.j6, this.Zo);
        if (!sa0Var.u7()) {
            return false;
        }
        sa0Var.Ws(true);
        this.v5 = sa0Var;
        return true;
    }

    public y30 j6() {
        return new y30(this, this.FH + 16);
    }

    public void lg() throws IOException {
        FileInputStream fileInputStream;
        File file = this.j6;
        if (file == null) {
            throw new IOException(JGitText.DW().dirCacheDoesNotHaveABackingFile);
        }
        if (!file.exists()) {
            DW();
            return;
        }
        ma0 ma0Var = this.VH;
        if (ma0Var == null || ma0Var.FH(this.j6)) {
            try {
                fileInputStream = new FileInputStream(this.j6);
            } catch (FileNotFoundException unused) {
                DW();
            }
            try {
                DW();
                rN(fileInputStream);
                this.VH = ma0.Zo(this.j6);
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    public void nw(OutputStream outputStream) throws IOException {
        MessageDigest messageDigestZo = r60.Zo();
        DigestOutputStream digestOutputStream = new DigestOutputStream(outputStream, messageDigestZo);
        boolean zQX = false;
        for (int i = 0; i < this.FH; i++) {
            zQX |= this.DW[i].QX();
        }
        byte[] bArr = new byte[128];
        byte[] bArr2 = EQ;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        ig0.VH(bArr, 4, zQX ? 3 : 2);
        ig0.VH(bArr, 8, this.FH);
        digestOutputStream.write(bArr, 0, 12);
        ma0 ma0Var = this.VH;
        if (ma0Var == null) {
            for (int i2 = 0; i2 < this.FH; i2++) {
                this.DW[i2].P8(digestOutputStream);
            }
        } else {
            int iHw = (int) (ma0Var.Hw() / 1000);
            int iHw2 = ((int) (this.VH.Hw() % 1000)) * 1000000;
            for (int i3 = 0; i3 < this.FH; i3++) {
                b40 b40Var = this.DW[i3];
                if (b40Var.U2(iHw, iHw2)) {
                    b40Var.BT();
                }
                b40Var.P8(digestOutputStream);
            }
        }
        if (this.Hw != null) {
            pg0.d dVar = new pg0.d();
            this.Hw.QX(bArr, dVar);
            dVar.close();
            ig0.VH(bArr, 0, 1414677829);
            ig0.VH(bArr, 4, (int) dVar.gn());
            digestOutputStream.write(bArr, 0, 8);
            dVar.Ws(digestOutputStream, null);
        }
        byte[] bArrDigest = messageDigestZo.digest();
        this.u7 = bArrDigest;
        outputStream.write(bArrDigest);
        outputStream.close();
    }

    public int u7(byte[] bArr, int i) {
        int i2 = this.FH;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (i3 + i2) >>> 1;
            int iHw = Hw(bArr, i, this.DW[i4]);
            if (iHw < 0) {
                i2 = i4;
            } else {
                if (iHw == 0) {
                    while (i4 > 0 && Hw(bArr, i, this.DW[i4 - 1]) == 0) {
                        i4--;
                    }
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    public void vy(int i, b40[] b40VarArr, int i2, int i3) {
        System.arraycopy(this.DW, i, b40VarArr, i2, i3);
    }

    public b40 we(int i) {
        return this.DW[i];
    }

    public void yS(b40[] b40VarArr, int i) {
        this.DW = b40VarArr;
        this.FH = i;
        this.Hw = null;
    }
}
