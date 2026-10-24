package abcd;

import abcd.xa0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class za0 extends xa0 {
    private static final int[] AL = new int[0];
    private static final byte[] w9 = new byte[0];
    private int[][] fY;
    private final long[] jw;
    private byte[][] k2;
    private long mb;
    private byte[][] qp;
    private byte[] zh;

    private class a extends xa0.a {
        private int fY;
        private int qp;

        /* renamed from: abcd.za0$a$a, reason: collision with other inner class name */
        class C0019a extends xa0.b {
            public C0019a(a aVar) {
            }
        }

        private a() {
            super();
        }

        @Override // abcd.xa0.a
        /* renamed from: DW */
        public xa0.b next() {
            while (this.fY < za0.this.fY.length) {
                int i = this.qp;
                int[][] iArr = za0.this.fY;
                int i2 = this.fY;
                if (i < iArr[i2].length) {
                    long jHw = ig0.Hw(za0.this.qp[this.fY], (this.qp / 5) * 4);
                    if ((2147483648L & jHw) != 0) {
                        jHw = ig0.v5(za0.this.zh, ((int) (jHw & (-2147483649L))) * 8);
                    }
                    xa0.b bVar = this.WB;
                    bVar.j6 = jHw;
                    this.qp += 5;
                    this.mb++;
                    return bVar;
                }
                this.qp = 0;
                this.fY = i2 + 1;
            }
            throw new NoSuchElementException();
        }

        @Override // abcd.xa0.a
        public xa0.b j6() {
            return new C0019a(this);
        }

        public /* synthetic */ a(za0 za0Var, a aVar) {
            this();
        }
    }

    public za0(InputStream inputStream) throws IOException {
        long j;
        byte[] bArr = new byte[1024];
        eg0.DW(inputStream, bArr, 0, 1024);
        this.jw = new long[256];
        for (int i = 0; i < 256; i++) {
            this.jw[i] = ig0.Hw(bArr, i * 4);
        }
        this.mb = this.jw[255];
        this.fY = new int[256][];
        this.qp = new byte[256][];
        this.k2 = new byte[256][];
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 == 0) {
                j = this.jw[i2];
            } else {
                long[] jArr = this.jw;
                j = jArr[i2] - jArr[i2 - 1];
            }
            if (j == 0) {
                this.fY[i2] = AL;
                byte[][] bArr2 = this.qp;
                byte[] bArr3 = w9;
                bArr2[i2] = bArr3;
                this.k2[i2] = bArr3;
            } else {
                long j2 = 20 * j;
                if (j2 > 2147483647L) {
                    throw new IOException(JGitText.DW().indexFileIsTooLargeForJgit);
                }
                int i3 = (int) j2;
                byte[] bArr4 = new byte[i3];
                int i4 = i3 >>> 2;
                int[] iArr = new int[i4];
                eg0.DW(inputStream, bArr4, 0, i3);
                for (int i5 = 0; i5 < i4; i5++) {
                    iArr[i5] = ig0.DW(bArr4, i5 << 2);
                }
                this.fY[i2] = iArr;
                int i6 = (int) (j * 4);
                this.qp[i2] = new byte[i6];
                this.k2[i2] = new byte[i6];
            }
        }
        for (int i7 = 0; i7 < 256; i7++) {
            byte[][] bArr5 = this.k2;
            eg0.DW(inputStream, bArr5[i7], 0, bArr5[i7].length);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < 256; i9++) {
            byte[] bArr6 = this.qp[i9];
            eg0.DW(inputStream, bArr6, 0, bArr6.length);
            for (int i10 = 0; i10 < bArr6.length; i10 += 4) {
                if (bArr6[i10] < 0) {
                    i8++;
                }
            }
        }
        if (i8 > 0) {
            byte[] bArr7 = new byte[i8 * 8];
            this.zh = bArr7;
            eg0.DW(inputStream, bArr7, 0, bArr7.length);
        } else {
            this.zh = w9;
        }
        byte[] bArr8 = new byte[20];
        this.WB = bArr8;
        eg0.DW(inputStream, bArr8, 0, bArr8.length);
    }

    private int er(j60 j60Var, int i) {
        int[] iArr = this.fY[i];
        int length = this.qp[i].length >>> 2;
        if (length == 0) {
            return -1;
        }
        int i2 = 0;
        do {
            int i3 = (i2 + length) >>> 1;
            int iV5 = j60Var.v5(iArr, (i3 << 2) + i3);
            if (iV5 < 0) {
                length = i3;
            } else {
                if (iV5 == 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        } while (i2 < length);
        return -1;
    }

    private static int gW(int i) {
        return (i << 2) + i;
    }

    @Override // abcd.xa0
    public long DW(j60 j60Var) {
        int iRN = j60Var.rN();
        int iEr = er(j60Var, iRN);
        if (iEr == -1) {
            return -1L;
        }
        long jHw = ig0.Hw(this.qp[iRN], iEr << 2);
        return (2147483648L & jHw) != 0 ? ig0.v5(this.zh, ((int) (jHw & (-2147483649L))) * 8) : jHw;
    }

    @Override // abcd.xa0
    public boolean EQ() {
        return true;
    }

    @Override // abcd.xa0
    public long Hw() {
        return this.mb;
    }

    @Override // abcd.xa0
    public a70 VH(long j) {
        int iBinarySearch = Arrays.binarySearch(this.jw, 1 + j);
        if (iBinarySearch >= 0) {
            long j2 = this.jw[iBinarySearch];
            while (iBinarySearch > 0 && j2 == this.jw[iBinarySearch - 1]) {
                iBinarySearch--;
            }
        } else {
            iBinarySearch = -(iBinarySearch + 1);
        }
        int i = (int) (j - (iBinarySearch > 0 ? this.jw[iBinarySearch - 1] : 0L));
        return a70.Sf(this.fY[iBinarySearch], (i << 2) + i);
    }

    @Override // abcd.xa0
    public long gn() {
        return this.zh.length / 8;
    }

    @Override // abcd.xa0, java.lang.Iterable
    public Iterator<xa0.b> iterator() {
        return new a(this, null);
    }

    @Override // abcd.xa0
    public void j3(Set<a70> set, h60 h60Var, int i) {
        int[] iArr = this.fY[h60Var.v5()];
        int length = this.qp[h60Var.v5()].length >>> 2;
        if (length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = length;
        do {
            int i4 = (i2 + i3) >>> 1;
            int iWs = h60Var.Ws(iArr, gW(i4));
            if (iWs < 0) {
                i3 = i4;
            } else {
                if (iWs == 0) {
                    while (i4 > 0 && h60Var.Ws(iArr, gW(i4 - 1)) == 0) {
                        i4--;
                    }
                    while (i4 < length && h60Var.Ws(iArr, gW(i4)) == 0) {
                        set.add(a70.Sf(iArr, gW(i4)));
                        if (set.size() > i) {
                            return;
                        } else {
                            i4++;
                        }
                    }
                    return;
                }
                i2 = i4 + 1;
            }
        } while (i2 < i3);
    }

    @Override // abcd.xa0
    public long j6(j60 j60Var) throws q40 {
        int iRN = j60Var.rN();
        int iEr = er(j60Var, iRN);
        if (iEr != -1) {
            return ig0.Hw(this.k2[iRN], iEr << 2);
        }
        throw new q40(j60Var.Zo(), "unknown");
    }
}
