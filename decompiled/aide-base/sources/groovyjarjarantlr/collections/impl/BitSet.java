package groovyjarjarantlr.collections.impl;

import groovyjarjarantlr.CharFormatter;

/* loaded from: classes.dex */
public class BitSet implements Cloneable {
    protected long[] WB;

    public BitSet() {
        this(64);
    }

    private final int EQ(int i) {
        return (i >> 6) + 1;
    }

    private static final long FH(int i) {
        return 1 << (i & 63);
    }

    private void Ws(int i) {
        long[] jArr = new long[i];
        System.arraycopy(this.WB, 0, jArr, 0, Math.min(i, this.WB.length));
        this.WB = jArr;
    }

    private static final int er(int i) {
        return i >> 6;
    }

    public static BitSet we(int i) {
        BitSet bitSet = new BitSet(i + 1);
        bitSet.j6(i);
        return bitSet;
    }

    public void Hw(int i) {
        int iEr = er(i);
        if (iEr >= this.WB.length) {
            VH(i);
        }
        long[] jArr = this.WB;
        jArr[iEr] = jArr[iEr] & (FH(i) ^ (-1));
    }

    public void J0(BitSet bitSet) {
        long[] jArr = bitSet.WB;
        if (jArr.length > this.WB.length) {
            Ws(jArr.length);
        }
        for (int iMin = Math.min(this.WB.length, bitSet.WB.length) - 1; iMin >= 0; iMin--) {
            long[] jArr2 = this.WB;
            jArr2[iMin] = jArr2[iMin] | bitSet.WB[iMin];
        }
    }

    public void J8(int i) {
        int iEr = er(i);
        if (iEr >= this.WB.length) {
            VH(i);
        }
        long[] jArr = this.WB;
        jArr[iEr] = jArr[iEr] & (FH(i) ^ (-1));
    }

    public String U2(String str) {
        String string = "";
        for (int i = 0; i < (this.WB.length << 6); i++) {
            if (gn(i)) {
                if (string.length() > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(string);
                    stringBuffer.append(str);
                    string = stringBuffer.toString();
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(string);
                stringBuffer2.append(i);
                string = stringBuffer2.toString();
            }
        }
        return string;
    }

    public void VH(int i) {
        long[] jArr = new long[Math.max(this.WB.length << 1, EQ(i))];
        long[] jArr2 = this.WB;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        this.WB = jArr;
    }

    public void XL(BitSet bitSet) {
        if (bitSet == null) {
            return;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.WB;
            if (i >= jArr.length) {
                return;
            }
            long[] jArr2 = bitSet.WB;
            if (i >= jArr2.length) {
                return;
            }
            jArr[i] = jArr[i] & (jArr2[i] ^ (-1));
            i++;
        }
    }

    public int Zo() {
        int i = 0;
        for (int length = this.WB.length - 1; length >= 0; length--) {
            long j = this.WB[length];
            if (j != 0) {
                for (int i2 = 63; i2 >= 0; i2--) {
                    if (((1 << i2) & j) != 0) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    public Object clone() {
        try {
            BitSet bitSet = (BitSet) super.clone();
            long[] jArr = new long[this.WB.length];
            bitSet.WB = jArr;
            System.arraycopy(this.WB, 0, jArr, 0, this.WB.length);
            return bitSet;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BitSet)) {
            return false;
        }
        BitSet bitSet = (BitSet) obj;
        int iMin = Math.min(this.WB.length, bitSet.WB.length);
        int i = iMin;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                long[] jArr = this.WB;
                if (jArr.length > iMin) {
                    int length = jArr.length;
                    while (true) {
                        int i3 = length - 1;
                        if (length <= iMin) {
                            return true;
                        }
                        if (this.WB[i3] != 0) {
                            return false;
                        }
                        length = i3;
                    }
                } else {
                    long[] jArr2 = bitSet.WB;
                    if (jArr2.length <= iMin) {
                        return true;
                    }
                    int length2 = jArr2.length;
                    while (true) {
                        int i4 = length2 - 1;
                        if (length2 <= iMin) {
                            return true;
                        }
                        if (bitSet.WB[i4] != 0) {
                            return false;
                        }
                        length2 = i4;
                    }
                }
            } else {
                if (this.WB[i2] != bitSet.WB[i2]) {
                    return false;
                }
                i = i2;
            }
        }
    }

    public boolean gn(int i) {
        int iEr = er(i);
        long[] jArr = this.WB;
        return iEr < jArr.length && (jArr[iEr] & FH(i)) != 0;
    }

    public int[] j3() {
        int[] iArr = new int[Zo()];
        int i = 0;
        for (int i2 = 0; i2 < (this.WB.length << 6); i2++) {
            if (gn(i2)) {
                iArr[i] = i2;
                i++;
            }
        }
        return iArr;
    }

    public void j6(int i) {
        int iEr = er(i);
        if (iEr >= this.WB.length) {
            VH(i);
        }
        long[] jArr = this.WB;
        jArr[iEr] = jArr[iEr] | FH(i);
    }

    public String lg(String str, CharFormatter charFormatter) {
        String string = "";
        for (int i = 0; i < (this.WB.length << 6); i++) {
            if (gn(i)) {
                if (string.length() > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(string);
                    stringBuffer.append(str);
                    string = stringBuffer.toString();
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(string);
                stringBuffer2.append(charFormatter.j6(i));
                string = stringBuffer2.toString();
            }
        }
        return string;
    }

    public String rN(String str, Vector vector) {
        if (vector == null) {
            return U2(str);
        }
        String string = "";
        for (int i = 0; i < (this.WB.length << 6); i++) {
            if (gn(i)) {
                if (string.length() > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(string);
                    stringBuffer.append(str);
                    string = stringBuffer.toString();
                }
                if (i >= vector.gn()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(string);
                    stringBuffer2.append("<bad element ");
                    stringBuffer2.append(i);
                    stringBuffer2.append(">");
                    string = stringBuffer2.toString();
                } else if (vector.FH(i) == null) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(string);
                    stringBuffer3.append("<");
                    stringBuffer3.append(i);
                    stringBuffer3.append(">");
                    string = stringBuffer3.toString();
                } else {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append(string);
                    stringBuffer4.append((String) vector.FH(i));
                    string = stringBuffer4.toString();
                }
            }
        }
        return string;
    }

    public String toString() {
        return U2(",");
    }

    public void tp(int i, int i2) {
        VH(i2);
        while (i <= i2) {
            int iEr = er(i);
            long[] jArr = this.WB;
            jArr[iEr] = jArr[iEr] ^ FH(i);
            i++;
        }
    }

    public boolean u7() {
        for (int length = this.WB.length - 1; length >= 0; length--) {
            if (this.WB[length] != 0) {
                return false;
            }
        }
        return true;
    }

    public BitSet(long[] jArr) {
        this.WB = jArr;
    }

    public BitSet(int i) {
        this.WB = new long[((i - 1) >> 6) + 1];
    }
}
