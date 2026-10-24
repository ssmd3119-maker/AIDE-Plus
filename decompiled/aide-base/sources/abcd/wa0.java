package abcd;

import abcd.xa0;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.DataFormatException;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class wa0 implements Iterable<xa0.b> {
    public static final Comparator<wa0> kf = new a();
    private int AL;
    private volatile gg0 Q6;
    private final File WB;
    private xa0 Z1;
    private volatile boolean cT;
    private int hK;
    private volatile String jw;
    private final File mb;
    private fb0 n5;
    private byte[] q7;
    private RandomAccessFile qp;
    private int w9;
    private final Object k2 = new Object();
    final int fY = System.identityHashCode(this) * 31;
    long zh = Long.MAX_VALUE;

    class a implements Comparator<wa0> {
        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(wa0 wa0Var, wa0 wa0Var2) {
            return wa0Var2.hK - wa0Var.hK;
        }
    }

    private static class b {
        final long DW;
        final int FH;
        final int Hw;
        final b j6;
        final long v5;

        public b(b bVar, long j, int i, int i2, long j2) {
            this.j6 = bVar;
            this.DW = j;
            this.FH = i;
            this.Hw = i2;
            this.v5 = j2;
        }

        private f70 DW(wa0 wa0Var, ob0 ob0Var) {
            return new na0(this.DW, this.v5, this.Hw, wa0Var, ob0Var.v5);
        }

        public f70 j6(wa0 wa0Var, ob0 ob0Var) {
            b bVar = this;
            while (true) {
                b bVar2 = bVar.j6;
                if (bVar2 == null) {
                    return bVar.DW(wa0Var, ob0Var);
                }
                bVar = bVar2;
            }
        }
    }

    public wa0(File file, File file2) {
        this.WB = file;
        this.mb = file2;
        this.hK = (int) (file2.lastModified() >> 10);
    }

    private synchronized void DW(dc0 dc0Var) {
        int i = this.w9 + 1;
        this.w9 = i;
        if (i == 1 && this.AL == 0) {
            try {
                QX();
            } catch (IOException e) {
                e50 e50Var = new e50(dc0Var);
                e50Var.initCause(e);
                throw e50Var;
            }
        }
    }

    private final byte[] J8(long j, int i, ob0 ob0Var) throws EOFException {
        try {
            byte[] bArr = new byte[i];
            if (ob0Var.yS(this, j, bArr, 0) == i) {
                return bArr;
            }
            throw new EOFException(MessageFormat.format(JGitText.DW().shortCompressedStreamAt, Long.valueOf(j)));
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    private long Mr(a70 a70Var) throws q40 {
        long jDW = dx().DW(a70Var);
        if (jDW >= 0) {
            return jDW;
        }
        throw new q40(a70Var, JGitText.DW().missingDeltaBase);
    }

    private void Mz() {
        this.AL = 0;
        this.w9 = 0;
        this.cT = true;
        Ws();
    }

    private void QX() throws IOException {
        try {
            if (this.cT) {
                throw new w40(this.mb);
            }
            synchronized (this.k2) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.mb, "r");
                this.qp = randomAccessFile;
                this.zh = randomAccessFile.length();
                g3();
            }
        } catch (IOException e) {
            Mz();
            throw e;
        } catch (Error e2) {
            Mz();
            throw e2;
        } catch (RuntimeException e3) {
            Mz();
            throw e3;
        }
    }

    private void Ws() {
        synchronized (this.k2) {
            if (this.qp != null) {
                try {
                    this.qp.close();
                } catch (IOException unused) {
                }
                this.qp = null;
            }
        }
    }

    private long a8(long j) {
        return ro().j6(j, this.zh - 20);
    }

    private synchronized void aM() {
        int i = this.w9 - 1;
        this.w9 = i;
        if (i == 0 && this.AL == 0) {
            Ws();
        }
    }

    private void ca(long j, byte[] bArr, int i, int i2, ob0 ob0Var) throws EOFException {
        if (ob0Var.a8(this, j, bArr, i, i2) != i2) {
            throw new EOFException();
        }
    }

    private synchronized xa0 dx() {
        if (this.Z1 == null) {
            if (this.cT) {
                throw new w40(this.mb);
            }
            try {
                xa0 xa0VarQX = xa0.QX(this.WB);
                if (this.q7 == null) {
                    this.q7 = xa0VarQX.WB;
                } else if (!Arrays.equals(this.q7, xa0VarQX.WB)) {
                    throw new x40(JGitText.DW().packChecksumMismatch);
                }
                this.Z1 = xa0VarQX;
            } catch (IOException e) {
                this.cT = true;
                throw e;
            }
        }
        return this.Z1;
    }

    private boolean ef(long j) {
        boolean zFH;
        gg0 gg0Var = this.Q6;
        if (gg0Var == null) {
            return false;
        }
        synchronized (gg0Var) {
            zFH = gg0Var.FH(j);
        }
        return zFH;
    }

    private void g3() throws IOException {
        xa0 xa0VarDx = dx();
        byte[] bArr = new byte[20];
        this.qp.seek(0L);
        this.qp.readFully(bArr, 0, 12);
        if (kg0.QX(bArr, 0, r60.v5) != 4) {
            throw new IOException(JGitText.DW().notAPACKFile);
        }
        long jHw = ig0.Hw(bArr, 4);
        long jHw2 = ig0.Hw(bArr, 8);
        if (jHw != 2 && jHw != 3) {
            throw new IOException(MessageFormat.format(JGitText.DW().unsupportedPackVersion, Long.valueOf(jHw)));
        }
        if (jHw2 != xa0VarDx.Hw()) {
            throw new x40(MessageFormat.format(JGitText.DW().packObjectCountMismatch, Long.valueOf(jHw2), Long.valueOf(xa0VarDx.Hw()), SI()));
        }
        this.qp.seek(this.zh - 20);
        this.qp.readFully(bArr, 0, 20);
        if (!Arrays.equals(bArr, this.q7)) {
            throw new x40(MessageFormat.format(JGitText.DW().packObjectCountMismatch, a70.sG(bArr).BT(), a70.sG(xa0VarDx.WB).BT(), SI()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021e  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v22, types: [abcd.ra0] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [abcd.dc0, abcd.ra0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [abcd.dc0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void gn(abcd.fc0 r35, abcd.ra0 r36, boolean r37, abcd.ob0 r38) throws abcd.i40, abcd.e50, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.wa0.gn(abcd.fc0, abcd.ra0, boolean, abcd.ob0):void");
    }

    private synchronized fb0 ro() {
        if (this.n5 == null) {
            this.n5 = new fb0(dx());
        }
        return this.n5;
    }

    private void sy(long j) {
        gg0 gg0Var = this.Q6;
        if (gg0Var == null) {
            synchronized (this.k2) {
                gg0Var = this.Q6;
                if (gg0Var == null) {
                    gg0Var = new gg0();
                    this.Q6 = gg0Var;
                }
            }
        }
        synchronized (gg0Var) {
            gg0Var.j6(j);
        }
    }

    public void EQ(fc0 fc0Var, boolean z, ob0 ob0Var) throws IOException {
        ob0Var.vy(this, 0L);
        ob0Var.lg(this, this.zh, z, fc0Var);
    }

    public synchronized boolean Hw() {
        int i = this.AL + 1;
        this.AL = i;
        if (i != 1) {
            return false;
        }
        if (this.w9 == 0) {
            QX();
        }
        return true;
    }

    public da0 I(long j, int i) {
        da0 da0Var;
        synchronized (this.k2) {
            if (this.zh < i + j) {
                i = (int) (this.zh - j);
            }
            byte[] bArr = new byte[i];
            this.qp.seek(j);
            this.qp.readFully(bArr, 0, i);
            da0Var = new da0(this, j, bArr);
        }
        return da0Var;
    }

    public String KD() {
        String name = this.jw;
        if (name == null) {
            name = SI().getName();
            if (name.startsWith("pack-")) {
                name = name.substring(5);
            }
            if (name.endsWith(".pack")) {
                name = name.substring(0, name.length() - 5);
            }
            this.jw = name;
        }
        return name;
    }

    public long P8(ob0 ob0Var, long j) throws IOException {
        long j2;
        byte[] bArr = ob0Var.j6;
        ca(j, bArr, 0, 20, ob0Var);
        int i = bArr[0] & 255;
        int i2 = (i >> 4) & 7;
        long j3 = i & 15;
        int i3 = 1;
        int i4 = 4;
        while ((i & 128) != 0) {
            int i5 = i3 + 1;
            int i6 = bArr[i3] & 255;
            j3 += (i6 & 127) << i4;
            i4 += 7;
            i3 = i5;
            i = i6;
        }
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return j3;
        }
        if (i2 == 6) {
            int i7 = i3 + 1;
            int i8 = bArr[i3] & 255;
            while ((i8 & 128) != 0) {
                i8 = bArr[i7] & 255;
                i7++;
            }
            j2 = j + i7;
        } else {
            if (i2 != 7) {
                throw new IOException(MessageFormat.format(JGitText.DW().unknownObjectType, Integer.valueOf(i2)));
            }
            j2 = j + i3 + 20;
        }
        try {
            return rb0.FH(gW(ob0Var, j2));
        } catch (DataFormatException unused) {
            throw new i40(MessageFormat.format(JGitText.DW().objectAtHasBadZlibStream, Long.valueOf(j), SI()));
        }
    }

    public void Qq(Set<a70> set, h60 h60Var, int i) {
        dx().j3(set, h60Var, i);
    }

    public File SI() {
        return this.mb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        r4 = false;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        if (r11 >= r26.er()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
    
        r14 = r10.J8(r23 + r15, (int) r11, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        if (r16 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        r9 = r2;
        r3 = r16;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015e, code lost:
    
        if (r14 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0165, code lost:
    
        return new abcd.f70.a(r2, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0174, code lost:
    
        return new abcd.oa0(r2, r11, r23, r15, r25, r26.v5);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102 A[Catch: DataFormatException -> 0x018b, TryCatch #0 {DataFormatException -> 0x018b, blocks: (B:6:0x0018, B:7:0x0029, B:17:0x003b, B:43:0x0102, B:51:0x011e, B:48:0x010d, B:50:0x0111, B:20:0x0070, B:22:0x007a, B:23:0x007f, B:24:0x0097, B:25:0x0098, B:26:0x00a2, B:28:0x00a8, B:31:0x00c1, B:33:0x00cb, B:36:0x00d9, B:37:0x00e8, B:39:0x00f2, B:72:0x0160, B:74:0x0166, B:76:0x0175), top: B:85:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public abcd.f70 Sf(abcd.ob0 r26, long r27) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.wa0.Sf(abcd.ob0, long):abcd.f70");
    }

    public final void VH(fc0 fc0Var, ra0 ra0Var, boolean z, ob0 ob0Var) {
        DW(ra0Var);
        try {
            gn(fc0Var, ra0Var, z, ob0Var);
        } finally {
            aM();
        }
    }

    public void aj() {
        this.cT = true;
    }

    public boolean cb(j60 j60Var) {
        long jDW = dx().DW(j60Var);
        return 0 < jDW && !ef(jDW);
    }

    public long ei(ob0 ob0Var, j60 j60Var) {
        long jDW = dx().DW(j60Var);
        if (0 < jDW) {
            return P8(ob0Var, jDW);
        }
        return -1L;
    }

    public f70 er(ob0 ob0Var, j60 j60Var) {
        long jDW = dx().DW(j60Var);
        if (0 >= jDW || ef(jDW)) {
            return null;
        }
        return Sf(ob0Var, jDW);
    }

    public byte[] gW(ob0 ob0Var, long j) throws DataFormatException {
        byte[] bArr = new byte[18];
        ob0Var.yS(this, j, bArr, 0);
        return bArr;
    }

    @Override // java.lang.Iterable
    public Iterator<xa0.b> iterator() {
        try {
            return dx().iterator();
        } catch (IOException unused) {
            return Collections.emptyList().iterator();
        }
    }

    public synchronized boolean j3() {
        boolean z;
        z = true;
        int i = this.AL - 1;
        this.AL = i;
        if (i != 0) {
            z = false;
        }
        if (z && this.w9 == 0) {
            Ws();
        }
        return z;
    }

    public a70 lg(long j) {
        return ro().DW(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int nw(abcd.ob0 r12, long r13) throws java.io.IOException {
        /*
            r11 = this;
            byte[] r7 = r12.j6
        L2:
            r4 = 0
            r5 = 20
            r0 = r11
            r1 = r13
            r3 = r7
            r6 = r12
            r0.ca(r1, r3, r4, r5, r6)
            r0 = 0
            r1 = r7[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r1 >> 4
            r3 = 7
            r2 = r2 & r3
            r4 = 1
            if (r2 == r4) goto L8c
            r5 = 2
            if (r2 == r5) goto L8c
            r5 = 3
            if (r2 == r5) goto L8c
            r5 = 4
            if (r2 == r5) goto L8c
            r5 = 6
            if (r2 == r5) goto L5f
            if (r2 != r3) goto L47
        L26:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 != 0) goto L3f
            long r0 = (long) r4
            long r13 = r13 + r0
            r4 = 0
            r5 = 20
            r0 = r11
            r1 = r13
            r3 = r7
            r6 = r12
            r0.ca(r1, r3, r4, r5, r6)
            abcd.a70 r13 = abcd.a70.sG(r7)
            long r13 = r11.Mr(r13)
            goto L2
        L3f:
            int r0 = r4 + 1
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r4 = r0
            goto L26
        L47:
            java.io.IOException r12 = new java.io.IOException
            org.eclipse.jgit.JGitText r13 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r13 = r13.unknownObjectType
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r14[r0] = r1
            java.lang.String r13 = java.text.MessageFormat.format(r13, r14)
            r12.<init>(r13)
            throw r12
        L5f:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 != 0) goto L84
            int r0 = r4 + 1
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r1 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r2
        L6c:
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 != 0) goto L72
            long r13 = r13 - r4
            goto L2
        L72:
            r1 = 1
            long r4 = r4 + r1
            int r1 = r0 + 1
            r0 = r7[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r4 = r4 << r3
            r2 = r0 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r2
            long r4 = r4 + r8
            r10 = r1
            r1 = r0
            r0 = r10
            goto L6c
        L84:
            int r0 = r4 + 1
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r4 = r0
            goto L5f
        L8c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.wa0.nw(abcd.ob0, long):int");
    }

    public boolean sG() {
        return this.cT;
    }

    public void v5() {
        mb0.XL(this);
        synchronized (this) {
            this.Z1 = null;
            this.n5 = null;
        }
    }

    public fa0 vJ(long j, int i) {
        MappedByteBuffer map;
        synchronized (this.k2) {
            if (this.zh < i + j) {
                i = (int) (this.zh - j);
            }
            try {
                map = this.qp.getChannel().map(FileChannel.MapMode.READ_ONLY, j, i);
            } catch (IOException unused) {
                System.gc();
                System.runFinalization();
                map = this.qp.getChannel().map(FileChannel.MapMode.READ_ONLY, j, i);
            }
            if (map.hasArray()) {
                return new da0(this, j, map.array());
            }
            return new ea0(this, j, map);
        }
    }

    public long vy() {
        return dx().Hw();
    }

    public qa0 x9(ob0 ob0Var, j60 j60Var) throws IOException {
        long jDW = dx().DW(j60Var);
        if (jDW < 0) {
            return null;
        }
        byte[] bArr = ob0Var.j6;
        ca(jDW, bArr, 0, 20, ob0Var);
        int i = bArr[0] & 255;
        int i2 = (i >> 4) & 7;
        int i3 = 1;
        while ((i & 128) != 0) {
            int i4 = i3 + 1;
            int i5 = bArr[i3] & 255;
            i3 = i4;
            i = i5;
        }
        long jA8 = a8(jDW) - jDW;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return qa0.Zo(this, jDW, jA8 - i3);
        }
        if (i2 != 6) {
            if (i2 != 7) {
                throw new IOException(MessageFormat.format(JGitText.DW().unknownObjectType, Integer.valueOf(i2)));
            }
            long j = i3;
            ca(jDW + j, bArr, 0, 20, ob0Var);
            return qa0.v5(this, jDW, (jA8 - j) - 20, a70.sG(bArr));
        }
        int i6 = i3 + 1;
        int i7 = bArr[i3] & 255;
        long j2 = i7 & 127;
        while ((i7 & 128) != 0) {
            int i8 = i6 + 1;
            j2 = ((j2 + 1) << 7) + (r14 & 127);
            i7 = bArr[i6] & 255;
            i6 = i8;
        }
        return qa0.Hw(this, jDW, jA8 - i6, jDW - j2);
    }
}
