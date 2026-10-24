package abcd;

import java.io.Writer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ps implements ls, ss {
    private byte[] DW;
    private int FH;
    private boolean Hw;
    private int VH;
    private int Zo;
    private final boolean j6;
    private ArrayList<a> v5;

    public ps(byte[] bArr) {
        this(bArr, false);
    }

    private void J8(int i) {
        byte[] bArr = this.DW;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.FH);
            this.DW = bArr2;
        }
    }

    private static void XL() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    @Override // abcd.ls
    public int DW() {
        int i = this.VH;
        return this.Zo - (((i * 2) + 8) + (i / 2));
    }

    @Override // abcd.ls
    public boolean EQ() {
        return this.v5 != null;
    }

    @Override // abcd.jt
    public int FH() {
        return this.FH;
    }

    @Override // abcd.ls
    public void Hw(int i, String str) {
        if (this.v5 == null) {
            return;
        }
        u7();
        int size = this.v5.size();
        int iJ6 = size == 0 ? 0 : this.v5.get(size - 1).j6();
        int i2 = this.FH;
        if (iJ6 <= i2) {
            iJ6 = i2;
        }
        this.v5.add(new a(iJ6, i + iJ6, str));
    }

    public void J0(int i, boolean z) {
        if (this.v5 != null || this.FH != 0) {
            throw new RuntimeException("cannot enable annotations");
        }
        if (i < 40) {
            throw new IllegalArgumentException("annotationWidth < 40");
        }
        int i2 = (((i - 7) / 15) + 1) & (-2);
        if (i2 < 6) {
            i2 = 6;
        } else if (i2 > 10) {
            i2 = 10;
        }
        this.v5 = new ArrayList<>(1000);
        this.Zo = i;
        this.VH = i2;
        this.Hw = z;
    }

    public void Mr(Writer writer) {
        String strFH;
        int i;
        int i2;
        lt ltVar = new lt(writer, (this.Zo - r0) - 1, DW(), "|");
        Writer writerV5 = ltVar.v5();
        Writer writerZo = ltVar.Zo();
        int size = this.v5.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.FH && i3 < size) {
            a aVar = this.v5.get(i3);
            int iDW = aVar.DW();
            if (i4 < iDW) {
                strFH = "";
                i2 = iDW;
                i = i4;
            } else {
                int iJ6 = aVar.j6();
                strFH = aVar.FH();
                i3++;
                i = iDW;
                i2 = iJ6;
            }
            writerV5.write(xs.j6(this.DW, i, i2 - i, i, this.VH, 6));
            writerZo.write(strFH);
            ltVar.DW();
            i4 = i2;
        }
        int i5 = this.FH;
        if (i4 < i5) {
            writerV5.write(xs.j6(this.DW, i4, i5 - i4, i4, this.VH, 6));
        }
        while (i3 < size) {
            writerZo.write(this.v5.get(i3).FH());
            i3++;
        }
        ltVar.DW();
    }

    public byte[] QX() {
        return this.DW;
    }

    public int U2(int i) {
        if (this.j6) {
            J8(this.FH + 5);
        }
        int i2 = this.FH;
        et.Hw(this, i);
        return this.FH - i2;
    }

    @Override // abcd.ls
    public boolean VH() {
        return this.Hw;
    }

    public void Ws() {
        u7();
        ArrayList<a> arrayList = this.v5;
        if (arrayList != null) {
            for (int size = arrayList.size(); size > 0; size--) {
                int i = size - 1;
                a aVar = this.v5.get(i);
                if (aVar.DW() <= this.FH) {
                    int iJ6 = aVar.j6();
                    int i2 = this.FH;
                    if (iJ6 > i2) {
                        aVar.Hw(i2);
                        return;
                    }
                    return;
                }
                this.v5.remove(i);
            }
        }
    }

    @Override // abcd.jt
    public void Zo(int i) {
        if (this.FH == i) {
            return;
        }
        throw new us("expected cursor " + i + "; actual value: " + this.FH);
    }

    public byte[] aM() {
        int i = this.FH;
        byte[] bArr = new byte[i];
        System.arraycopy(this.DW, 0, bArr, 0, i);
        return bArr;
    }

    @Override // abcd.jt
    public int gn(int i) {
        if (this.j6) {
            J8(this.FH + 5);
        }
        int i2 = this.FH;
        et.v5(this, i);
        return this.FH - i2;
    }

    public void j3(byte[] bArr, int i, int i2) {
        int i3 = this.FH;
        int i4 = i3 + i2;
        int i5 = i + i2;
        if ((i | i2 | i4) < 0 || i5 > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; " + i + "..!" + i4);
        }
        if (this.j6) {
            J8(i4);
        } else if (i4 > this.DW.length) {
            XL();
            throw null;
        }
        System.arraycopy(bArr, i, this.DW, i3, i2);
        this.FH = i4;
    }

    @Override // abcd.ls
    public void j6(String str) {
        if (this.v5 == null) {
            return;
        }
        u7();
        this.v5.add(new a(this.FH, str));
    }

    @Override // abcd.jt
    public void tp(os osVar) {
        int iXL = osVar.XL();
        int i = this.FH;
        int i2 = iXL + i;
        if (this.j6) {
            J8(i2);
        } else if (i2 > this.DW.length) {
            XL();
            throw null;
        }
        osVar.gn(this.DW, i);
        this.FH = i2;
    }

    @Override // abcd.ls
    public void u7() {
        int size;
        ArrayList<a> arrayList = this.v5;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        this.v5.get(size - 1).v5(this.FH);
    }

    @Override // abcd.jt
    public void v5(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int i2 = this.FH + i;
        if (this.j6) {
            J8(i2);
        } else if (i2 > this.DW.length) {
            XL();
            throw null;
        }
        this.FH = i2;
    }

    @Override // abcd.jt
    public void we(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.FH + i2) & (i2 ^ (-1));
        if (this.j6) {
            J8(i3);
        } else if (i3 > this.DW.length) {
            XL();
            throw null;
        }
        this.FH = i3;
    }

    @Override // abcd.jt
    public void write(byte[] bArr) {
        j3(bArr, 0, bArr.length);
    }

    @Override // abcd.jt, abcd.ss
    public void writeByte(int i) {
        int i2 = this.FH;
        int i3 = i2 + 1;
        if (this.j6) {
            J8(i3);
        } else if (i3 > this.DW.length) {
            XL();
            throw null;
        }
        this.DW[i2] = (byte) i;
        this.FH = i3;
    }

    @Override // abcd.jt
    public void writeInt(int i) {
        int i2 = this.FH;
        int i3 = i2 + 4;
        if (this.j6) {
            J8(i3);
        } else if (i3 > this.DW.length) {
            XL();
            throw null;
        }
        byte[] bArr = this.DW;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.FH = i3;
    }

    @Override // abcd.jt
    public void writeLong(long j) {
        int i = this.FH;
        int i2 = i + 8;
        if (this.j6) {
            J8(i2);
        } else if (i2 > this.DW.length) {
            XL();
            throw null;
        }
        int i3 = (int) j;
        byte[] bArr = this.DW;
        bArr[i] = (byte) i3;
        bArr[i + 1] = (byte) (i3 >> 8);
        bArr[i + 2] = (byte) (i3 >> 16);
        bArr[i + 3] = (byte) (i3 >> 24);
        int i4 = (int) (j >> 32);
        bArr[i + 4] = (byte) i4;
        bArr[i + 5] = (byte) (i4 >> 8);
        bArr[i + 6] = (byte) (i4 >> 16);
        bArr[i + 7] = (byte) (i4 >> 24);
        this.FH = i2;
    }

    @Override // abcd.jt
    public void writeShort(int i) {
        int i2 = this.FH;
        int i3 = i2 + 2;
        if (this.j6) {
            J8(i3);
        } else if (i3 > this.DW.length) {
            XL();
            throw null;
        }
        byte[] bArr = this.DW;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.FH = i3;
    }

    public ps() {
        this(1000);
    }

    public ps(int i) {
        this(new byte[i], true);
    }

    private static class a {
        private int DW;
        private final String FH;
        private final int j6;

        public a(int i, int i2, String str) {
            this.j6 = i;
            this.DW = i2;
            this.FH = str;
        }

        public int DW() {
            return this.j6;
        }

        public String FH() {
            return this.FH;
        }

        public void Hw(int i) {
            this.DW = i;
        }

        public int j6() {
            return this.DW;
        }

        public void v5(int i) {
            if (this.DW == Integer.MAX_VALUE) {
                this.DW = i;
            }
        }

        public a(int i, String str) {
            this(i, Integer.MAX_VALUE, str);
        }
    }

    private ps(byte[] bArr, boolean z) {
        if (bArr != null) {
            this.j6 = z;
            this.DW = bArr;
            this.FH = 0;
            this.Hw = false;
            this.v5 = null;
            this.Zo = 0;
            this.VH = 0;
            return;
        }
        throw new NullPointerException("data == null");
    }
}
