package abcd;

import abcd.jd0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class va0 extends jd0 {
    private int KD;
    private final MessageDigest SI;
    private byte[] Sf;
    private RandomAccessFile cb;
    private File cn;
    private long dx;
    private long ef;
    private final ja0 ei;
    private final CRC32 nw;
    private boolean ro;
    private byte[] sG;
    private File sh;
    private Deflater vJ;

    public va0(ja0 ja0Var, InputStream inputStream) {
        super(ja0Var, inputStream);
        this.ei = ja0Var;
        this.nw = new CRC32();
        this.SI = r60.Zo();
        this.KD = ((s60) this.ei.EQ().tp(s60.v5)).FH();
    }

    private static String WB(File file) {
        String name = file.getName();
        return name.substring(0, name.lastIndexOf(46));
    }

    private void fY() throws IOException {
        List<ld0> listJ3 = j3(null);
        FileOutputStream fileOutputStream = new FileOutputStream(this.sh);
        try {
            (this.KD <= 0 ? ab0.j6(fileOutputStream, listJ3) : ab0.DW(fileOutputStream, this.KD)).FH(listJ3, this.Sf);
            fileOutputStream.getChannel().force(true);
        } finally {
            fileOutputStream.close();
        }
    }

    private eb0 jw(String str) throws InterruptedException, IOException {
        if (!this.ro && aM() == 0) {
            mb();
            return null;
        }
        MessageDigest messageDigestZo = r60.Zo();
        byte[] bArr = new byte[20];
        for (int i = 0; i < aM(); i++) {
            XL(i).tp(bArr, 0);
            messageDigestZo.update(bArr);
        }
        String strBT = a70.sG(messageDigestZo.digest()).BT();
        File file = new File(this.ei.we(), "pack");
        File file2 = new File(file, "pack-" + strBT + ".pack");
        File file3 = new File(file, "pack-" + strBT + ".idx");
        eb0 eb0Var = new eb0(file2, this.ei.J0());
        if (!file.exists() && !file.mkdir() && !file.exists()) {
            mb();
            throw new IOException(MessageFormat.format(JGitText.DW().cannotCreateDirectory, file.getAbsolutePath()));
        }
        if (file2.exists()) {
            mb();
            return null;
        }
        if (str != null) {
            try {
                if (!eb0Var.j6(str)) {
                    throw new o40(file2, MessageFormat.format(JGitText.DW().cannotLockPackIn, file2));
                }
            } catch (IOException e) {
                mb();
                throw e;
            }
        }
        if (!this.cn.renameTo(file2)) {
            mb();
            eb0Var.DW();
            throw new IOException(MessageFormat.format(JGitText.DW().cannotMovePackTo, file2));
        }
        if (!this.sh.renameTo(file3)) {
            mb();
            eb0Var.DW();
            if (!file2.delete()) {
                file2.deleteOnExit();
            }
            throw new IOException(MessageFormat.format(JGitText.DW().cannotMoveIndexTo, file3));
        }
        try {
            this.ei.nw(file2, file3);
            if (str != null) {
                return eb0Var;
            }
            return null;
        } catch (IOException e2) {
            eb0Var.DW();
            if (file2.exists()) {
                cg0.j6(file2);
            }
            if (file3.exists()) {
                cg0.j6(file3);
            }
            throw e2;
        }
    }

    private void mb() {
        File file = this.sh;
        if (file != null && !file.delete() && this.sh.exists()) {
            this.sh.deleteOnExit();
        }
        File file2 = this.cn;
        if (file2 == null || file2.delete() || !this.cn.exists()) {
            return;
        }
        this.cn.deleteOnExit();
    }

    @Override // abcd.jd0
    public eb0 I(j70 j70Var, j70 j70Var2) throws IOException {
        this.cn = File.createTempFile("incoming_", ".pack", this.ei.we());
        this.sh = new File(this.ei.we(), String.valueOf(WB(this.cn)) + ".idx");
        try {
            this.cb = new RandomAccessFile(this.cn, "rw");
            super.I(j70Var, j70Var2);
            this.cb.seek(this.ef);
            this.cb.write(this.Sf);
            this.cb.getChannel().force(true);
            this.cb.close();
            fY();
            this.cn.setReadOnly();
            this.sh.setReadOnly();
            return jw(Ws());
        } finally {
            Deflater deflater = this.vJ;
            if (deflater != null) {
                deflater.end();
            }
            try {
                if (this.cb != null && this.cb.getChannel().isOpen()) {
                    this.cb.close();
                }
            } catch (IOException unused) {
            }
            mb();
        }
    }

    @Override // abcd.jd0
    public jd0.f KD() {
        jd0.f fVar = new jd0.f();
        fVar.DW((int) this.nw.getValue());
        return fVar;
    }

    @Override // abcd.jd0
    public boolean P8(int i, byte[] bArr, ld0 ld0Var) throws IOException {
        ld0Var.aj(this.ef);
        byte[] bArrVH = VH();
        int length = bArr.length;
        bArrVH[0] = (byte) ((i << 4) | (length & 15));
        int i2 = length >>> 4;
        int i3 = 1;
        while (i2 > 0) {
            int i4 = i3 - 1;
            bArrVH[i4] = (byte) (bArrVH[i4] | 128);
            bArrVH[i3] = (byte) (i2 & 127);
            i2 >>>= 7;
            i3++;
        }
        this.SI.update(bArrVH, 0, i3);
        this.nw.reset();
        this.nw.update(bArrVH, 0, i3);
        this.cb.seek(this.ef);
        this.cb.write(bArrVH, 0, i3);
        this.ef += i3;
        Deflater deflater = this.vJ;
        if (deflater == null) {
            this.vJ = new Deflater(-1, false);
        } else {
            deflater.reset();
        }
        this.vJ.setInput(bArr);
        this.vJ.finish();
        while (!this.vJ.finished()) {
            int iDeflate = this.vJ.deflate(bArrVH);
            this.SI.update(bArrVH, 0, iDeflate);
            this.nw.update(bArrVH, 0, iDeflate);
            this.cb.write(bArrVH, 0, iDeflate);
            this.ef += iDeflate;
        }
        ld0Var.sy((int) this.nw.getValue());
        return true;
    }

    @Override // abcd.jd0
    public void SI(long j, int i, long j2) {
        this.nw.reset();
    }

    @Override // abcd.jd0
    public void Sf(byte[] bArr, int i, int i2) throws IOException {
        this.cb.write(bArr, i, i2);
    }

    @Override // abcd.jd0
    public jd0.d XG(jd0.f fVar, jd0.d dVar) throws IOException {
        this.cb.seek(fVar.j6());
        this.nw.reset();
        Qq(dVar);
        return dVar;
    }

    @Override // abcd.jd0
    public int ca(byte[] bArr, int i, int i2) {
        return this.cb.read(bArr, i, i2);
    }

    @Override // abcd.jd0
    public void cb(jd0.e eVar, byte[] bArr, int i, int i2) {
        this.nw.update(bArr, i, i2);
    }

    @Override // abcd.jd0
    public void cn(ld0 ld0Var) {
        ld0Var.sy((int) this.nw.getValue());
    }

    @Override // abcd.jd0
    public void dx(jd0.e eVar, byte[] bArr, int i, int i2) {
        this.nw.update(bArr, i, i2);
    }

    @Override // abcd.jd0
    public void ef(long j) {
    }

    @Override // abcd.jd0
    public void ei(long j, long j2, long j3) {
        this.nw.reset();
    }

    @Override // abcd.jd0
    public boolean gn(int i) {
        return i == ((int) this.nw.getValue());
    }

    @Override // abcd.jd0
    public jd0.d jJ(ld0 ld0Var, jd0.d dVar) throws IOException {
        this.cb.seek(ld0Var.Qq());
        this.nw.reset();
        Qq(dVar);
        return dVar;
    }

    @Override // abcd.jd0
    public void nw(long j, j60 j60Var, long j2) {
        this.nw.reset();
    }

    @Override // abcd.jd0
    public void ro() throws IOException {
        byte[] bArrDigest = this.SI.digest();
        byte[] bArrVH = VH();
        MessageDigest messageDigestZo = r60.Zo();
        MessageDigest messageDigestZo2 = r60.Zo();
        MessageDigest messageDigestZo3 = r60.Zo();
        long j = this.dx;
        this.cb.seek(0L);
        this.cb.readFully(bArrVH, 0, 12);
        messageDigestZo.update(bArrVH, 0, 12);
        long j2 = j - 12;
        ig0.VH(bArrVH, 8, aM());
        this.cb.seek(0L);
        this.cb.write(bArrVH, 0, 12);
        messageDigestZo3.update(bArrVH, 0, 12);
        while (true) {
            int i = this.cb.read(bArrVH);
            if (i < 0) {
                break;
            }
            if (j2 != 0) {
                int iMin = (int) Math.min(i, j2);
                messageDigestZo.update(bArrVH, 0, iMin);
                j2 -= iMin;
                if (j2 == 0) {
                    messageDigestZo2.update(bArrVH, iMin, i - iMin);
                }
            } else {
                messageDigestZo2.update(bArrVH, 0, i);
            }
            messageDigestZo3.update(bArrVH, 0, i);
        }
        if (!Arrays.equals(messageDigestZo.digest(), this.sG) || !Arrays.equals(messageDigestZo2.digest(), bArrDigest)) {
            throw new IOException(JGitText.DW().packCorruptedWhileWritingToFilesystem);
        }
        this.Sf = messageDigestZo3.digest();
    }

    @Override // abcd.jd0
    public void sG(byte[] bArr) throws IOException {
        long filePointer = this.cb.getFilePointer();
        this.ef = filePointer;
        this.dx = filePointer;
        this.sG = bArr;
        this.Sf = bArr;
    }

    @Override // abcd.jd0
    public void sh(ld0 ld0Var, int i, byte[] bArr) {
    }
}
