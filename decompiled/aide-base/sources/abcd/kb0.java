package abcd;

import abcd.f70;
import abcd.h70;
import abcd.n40;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class kb0 {

    class a extends InflaterInputStream {
        private long WB;
        private final /* synthetic */ a70 mb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputStream inputStream, Inflater inflater, long j, a70 a70Var) {
            super(inputStream, inflater);
            this.mb = a70Var;
            this.WB = j;
        }

        @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                if (this.WB <= 0) {
                    kb0.VH(((InflaterInputStream) this).in, ((InflaterInputStream) this).inf, this.mb, new byte[64]);
                }
            } finally {
                v60.FH(((InflaterInputStream) this).inf);
                super.close();
            }
        }

        @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            try {
                int i3 = super.read(bArr, i, i2);
                if (i3 > 0) {
                    this.WB -= i3;
                }
                return i3;
            } catch (ZipException unused) {
                throw new i40(this.mb, JGitText.DW().corruptObjectBadStream);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean EQ(byte[] bArr) {
        int i = bArr[0] & 255;
        if ((i & 143) == 8) {
            if (((bArr[1] & 255) | (i << 8)) % 31 == 0) {
                return true;
            }
        }
        return false;
    }

    public static f70 J0(byte[] bArr, j60 j60Var) {
        ob0 ob0Var = new ob0(null);
        try {
            return we(new ByteArrayInputStream(bArr), null, j60Var, ob0Var);
        } finally {
            ob0Var.XL();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int J8(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i2 > 0) {
            int i4 = inputStream.read(bArr, i, i2);
            if (i4 < 0) {
                break;
            }
            i3 += i4;
            i += i4;
            i2 -= i4;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void VH(InputStream inputStream, Inflater inflater, j60 j60Var, byte[] bArr) throws IOException {
        while (inflater.inflate(bArr) == 0) {
            try {
                if (inflater.finished()) {
                    if (inflater.getRemaining() != 0 || inputStream.read() != -1) {
                        throw new i40(j60Var, JGitText.DW().corruptObjectBadStream);
                    }
                    return;
                } else {
                    if (!inflater.needsInput()) {
                        throw new i40(j60Var, JGitText.DW().corruptObjectBadStream);
                    }
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        throw new i40(j60Var, JGitText.DW().corruptObjectBadStream);
                    }
                    inflater.setInput(bArr, 0, i);
                }
            } catch (DataFormatException unused) {
                throw new i40(j60Var, JGitText.DW().corruptObjectBadStream);
            }
        }
        throw new i40(j60Var, JGitText.DW().corruptObjectIncorrectLength);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BufferedInputStream Zo(InputStream inputStream) {
        return new BufferedInputStream(inputStream, 8192);
    }

    public static long gn(InputStream inputStream, j60 j60Var, ob0 ob0Var) throws IOException {
        try {
            BufferedInputStream bufferedInputStreamZo = Zo(inputStream);
            bufferedInputStreamZo.mark(20);
            byte[] bArr = new byte[64];
            eg0.DW(bufferedInputStreamZo, bArr, 0, 2);
            if (EQ(bArr)) {
                bufferedInputStreamZo.reset();
                if (J8(tp(bufferedInputStreamZo, ob0Var.gW()), bArr, 0, 64) < 5) {
                    throw new i40(j60Var, JGitText.DW().corruptObjectNoHeader);
                }
                hg0 hg0Var = new hg0();
                r60.j6(j60Var, bArr, (byte) 32, hg0Var);
                long jEr = kg0.er(bArr, hg0Var.j6, hg0Var);
                if (jEr >= 0) {
                    return jEr;
                }
                throw new i40(j60Var, JGitText.DW().corruptObjectNegativeSize);
            }
            J8(bufferedInputStreamZo, bArr, 2, 18);
            int i = bArr[0] & 255;
            long j = i & 15;
            int i2 = 4;
            int i3 = 1;
            while ((i & 128) != 0) {
                int i4 = i3 + 1;
                int i5 = bArr[i3] & 255;
                j += (i5 & 127) << i2;
                i2 += 7;
                i3 = i4;
                i = i5;
            }
            return j;
        } catch (ZipException unused) {
            throw new i40(j60Var, JGitText.DW().corruptObjectBadStream);
        }
    }

    private static InflaterInputStream tp(InputStream inputStream, Inflater inflater) {
        return new InflaterInputStream(inputStream, inflater, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream u7(InputStream inputStream, long j, a70 a70Var) {
        return new a(inputStream, v60.j6(), j, a70Var);
    }

    public static f70 we(InputStream inputStream, File file, j60 j60Var, ob0 ob0Var) throws IOException {
        try {
            BufferedInputStream bufferedInputStreamZo = Zo(inputStream);
            bufferedInputStreamZo.mark(20);
            byte[] bArr = new byte[64];
            int i = 2;
            int i2 = 0;
            eg0.DW(bufferedInputStreamZo, bArr, 0, 2);
            if (EQ(bArr)) {
                bufferedInputStreamZo.reset();
                Inflater inflaterGW = ob0Var.gW();
                InflaterInputStream inflaterInputStreamTp = tp(bufferedInputStreamZo, inflaterGW);
                int iJ8 = J8(inflaterInputStreamTp, bArr, 0, 64);
                if (iJ8 < 5) {
                    throw new i40(j60Var, JGitText.DW().corruptObjectNoHeader);
                }
                hg0 hg0Var = new hg0();
                int iJ6 = r60.j6(j60Var, bArr, (byte) 32, hg0Var);
                long jEr = kg0.er(bArr, hg0Var.j6, hg0Var);
                if (jEr < 0) {
                    throw new i40(j60Var, JGitText.DW().corruptObjectNegativeSize);
                }
                int i3 = hg0Var.j6;
                hg0Var.j6 = i3 + 1;
                if (bArr[i3] != 0) {
                    throw new i40(j60Var, JGitText.DW().corruptObjectGarbageAfterSize);
                }
                if (file == null && 2147483647L < jEr) {
                    n40.a aVar = new n40.a();
                    aVar.FH(j60Var);
                    throw aVar;
                }
                if (jEr >= ob0Var.er() && file != null) {
                    return new b(iJ6, jEr, file, j60Var, ob0Var.v5, null);
                }
                int i4 = (int) jEr;
                byte[] bArr2 = new byte[i4];
                int i5 = iJ8 - hg0Var.j6;
                if (i5 > 0) {
                    System.arraycopy(bArr, hg0Var.j6, bArr2, 0, i5);
                }
                eg0.DW(inflaterInputStreamTp, bArr2, i5, i4 - i5);
                VH(bufferedInputStreamZo, inflaterGW, j60Var, bArr);
                return new f70.a(iJ6, bArr2);
            }
            J8(bufferedInputStreamZo, bArr, 2, 18);
            int i6 = bArr[0] & 255;
            int i7 = (i6 >> 4) & 7;
            long j = i6 & 15;
            int i8 = 1;
            int i9 = 4;
            while ((i6 & 128) != 0) {
                int i10 = i8 + 1;
                int i11 = bArr[i8] & 255;
                j += (i11 & 127) << i9;
                i9 += 7;
                i7 = i7;
                i = 2;
                i2 = 0;
                i8 = i10;
                i6 = i11;
            }
            if (i7 != 1 && i7 != i && i7 != 3 && i7 != 4) {
                throw new i40(j60Var, JGitText.DW().corruptObjectInvalidType);
            }
            if (file == null && 2147483647L < j) {
                n40.a aVar2 = new n40.a();
                aVar2.FH(j60Var);
                throw aVar2;
            }
            if (j >= ob0Var.er() && file != null) {
                return new b(i7, j, file, j60Var, ob0Var.v5, null);
            }
            bufferedInputStreamZo.reset();
            eg0.VH(bufferedInputStreamZo, i8);
            Inflater inflaterGW2 = ob0Var.gW();
            int i12 = (int) j;
            byte[] bArr3 = new byte[i12];
            eg0.DW(tp(bufferedInputStreamZo, inflaterGW2), bArr3, i2, i12);
            VH(bufferedInputStreamZo, inflaterGW2, j60Var, bArr);
            return new f70.a(i7, bArr3);
        } catch (ZipException unused) {
            throw new i40(j60Var, JGitText.DW().corruptObjectBadStream);
        }
    }

    private static final class b extends f70 {
        private final long DW;
        private final File FH;
        private final a70 Hw;
        private final int j6;
        private final ja0 v5;

        private b(int i, long j, File file, j60 j60Var, ja0 ja0Var) {
            this.j6 = i;
            this.DW = j;
            this.FH = file;
            this.Hw = j60Var.Zo();
            this.v5 = ja0Var;
        }

        @Override // abcd.f70
        public byte[] Hw() {
            throw new n40(this.Hw);
        }

        @Override // abcd.f70
        public int VH() {
            return this.j6;
        }

        @Override // abcd.f70
        public long Zo() {
            return this.DW;
        }

        @Override // abcd.f70
        public boolean gn() {
            return true;
        }

        @Override // abcd.f70
        public h70 u7() throws Throwable {
            try {
                BufferedInputStream bufferedInputStreamZo = kb0.Zo(new FileInputStream(this.FH));
                boolean z = true;
                try {
                    byte[] bArr = new byte[64];
                    bufferedInputStreamZo.mark(20);
                    eg0.DW(bufferedInputStreamZo, bArr, 0, 2);
                    if (kb0.EQ(bArr)) {
                        bufferedInputStreamZo.reset();
                        bufferedInputStreamZo = kb0.Zo(kb0.u7(bufferedInputStreamZo, this.DW, this.Hw));
                        while (bufferedInputStreamZo.read() > 0) {
                        }
                    } else {
                        kb0.J8(bufferedInputStreamZo, bArr, 2, 18);
                        int i = bArr[0] & 255;
                        int i2 = 1;
                        while ((i & 128) != 0) {
                            int i3 = i2 + 1;
                            int i4 = bArr[i2] & 255;
                            i2 = i3;
                            i = i4;
                        }
                        bufferedInputStreamZo.reset();
                        eg0.VH(bufferedInputStreamZo, i2);
                        bufferedInputStreamZo = kb0.Zo(kb0.u7(bufferedInputStreamZo, this.DW, this.Hw));
                    }
                    try {
                        return new h70.a(this.j6, this.DW, bufferedInputStreamZo);
                    } catch (Throwable th) {
                        th = th;
                        if (!z) {
                            bufferedInputStreamZo.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (FileNotFoundException unused) {
                return this.v5.VH(this.Hw, this.j6).u7();
            }
        }

        public /* synthetic */ b(int i, long j, File file, j60 j60Var, ja0 ja0Var, b bVar) {
            this(i, j, file, j60Var, ja0Var);
        }
    }
}
