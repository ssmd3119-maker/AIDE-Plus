package abcd;

import abcd.xa0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public class ya0 extends xa0 {
    private long fY;
    private byte[][] jw;
    private final long[] mb;

    private class a extends xa0.a {
        private int fY;
        private int qp;

        /* renamed from: abcd.ya0$a$a, reason: collision with other inner class name */
        class C0018a extends xa0.b {
            public C0018a(a aVar) {
            }
        }

        private a() {
            super();
        }

        @Override // abcd.xa0.a
        /* renamed from: DW */
        public xa0.b next() {
            while (this.fY < ya0.this.jw.length) {
                if (ya0.this.jw[this.fY] != null) {
                    if (this.qp < ya0.this.jw[this.fY].length) {
                        this.WB.j6 = ig0.Hw(ya0.this.jw[this.fY], this.qp);
                        this.qp += 24;
                        this.mb++;
                        return this.WB;
                    }
                    this.qp = 0;
                }
                this.fY++;
            }
            throw new NoSuchElementException();
        }

        @Override // abcd.xa0.a
        public xa0.b j6() {
            return new C0018a(this);
        }

        public /* synthetic */ a(ya0 ya0Var, a aVar) {
            this();
        }
    }

    public ya0(InputStream inputStream, byte[] bArr) throws IOException {
        long[] jArr;
        byte[] bArr2 = new byte[1024];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        eg0.DW(inputStream, bArr2, bArr.length, 1024 - bArr.length);
        this.mb = new long[256];
        int i = 0;
        while (true) {
            jArr = this.mb;
            if (i >= jArr.length) {
                break;
            }
            jArr[i] = ig0.Hw(bArr2, i * 4);
            i++;
        }
        this.jw = new byte[jArr.length][];
        int i2 = 0;
        while (true) {
            long[] jArr2 = this.mb;
            if (i2 >= jArr2.length) {
                this.fY = jArr2[255];
                byte[] bArr3 = new byte[20];
                this.WB = bArr3;
                eg0.DW(inputStream, bArr3, 0, bArr3.length);
                return;
            }
            int i3 = (int) (i2 == 0 ? jArr2[i2] : jArr2[i2] - jArr2[i2 - 1]);
            if (i3 > 0) {
                byte[][] bArr4 = this.jw;
                bArr4[i2] = new byte[i3 * 24];
                eg0.DW(inputStream, bArr4[i2], 0, bArr4[i2].length);
            }
            i2++;
        }
    }

    private static int a8(int i) {
        return (i * 24) + 4;
    }

    @Override // abcd.xa0
    public long DW(j60 j60Var) {
        byte[] bArr = this.jw[j60Var.rN()];
        if (bArr == null) {
            return -1L;
        }
        int length = bArr.length / 24;
        int i = 0;
        do {
            int i2 = (i + length) >>> 1;
            int iA8 = a8(i2);
            int iFH = j60Var.FH(bArr, iA8);
            if (iFH < 0) {
                length = i2;
            } else {
                if (iFH == 0) {
                    int i3 = bArr[iA8 - 4] & 255;
                    int i4 = bArr[iA8 - 3] & 255;
                    return ((bArr[iA8 - 2] & 255) << 8) | (i3 << 24) | (i4 << 16) | (bArr[iA8 - 1] & 255);
                }
                i = i2 + 1;
            }
        } while (i < length);
        return -1L;
    }

    @Override // abcd.xa0
    public boolean EQ() {
        return false;
    }

    @Override // abcd.xa0
    public long Hw() {
        return this.fY;
    }

    @Override // abcd.xa0
    public a70 VH(long j) {
        int iBinarySearch = Arrays.binarySearch(this.mb, 1 + j);
        if (iBinarySearch >= 0) {
            long j2 = this.mb[iBinarySearch];
            while (iBinarySearch > 0 && j2 == this.mb[iBinarySearch - 1]) {
                iBinarySearch--;
            }
        } else {
            iBinarySearch = -(iBinarySearch + 1);
        }
        return a70.ef(this.jw[iBinarySearch], a8((int) (j - (iBinarySearch > 0 ? this.mb[iBinarySearch - 1] : 0L))));
    }

    @Override // abcd.xa0
    public long gn() {
        Iterator<xa0.b> it = iterator();
        long j = 0;
        while (it.hasNext()) {
            if (it.next().j6() >= 2147483647L) {
                j++;
            }
        }
        return j;
    }

    @Override // abcd.xa0, java.lang.Iterable
    public Iterator<xa0.b> iterator() {
        return new a(this, null);
    }

    @Override // abcd.xa0
    public void j3(Set<a70> set, h60 h60Var, int i) {
        byte[] bArr = this.jw[h60Var.v5()];
        if (bArr == null) {
            return;
        }
        int length = bArr.length / 24;
        int i2 = 0;
        int i3 = length;
        do {
            int i4 = (i2 + i3) >>> 1;
            int iJ8 = h60Var.J8(bArr, a8(i4));
            if (iJ8 < 0) {
                i3 = i4;
            } else {
                if (iJ8 == 0) {
                    while (i4 > 0 && h60Var.J8(bArr, a8(i4 - 1)) == 0) {
                        i4--;
                    }
                    while (i4 < length && h60Var.J8(bArr, a8(i4)) == 0) {
                        set.add(a70.ef(bArr, a8(i4)));
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
    public long j6(j60 j60Var) {
        throw new UnsupportedOperationException();
    }
}
