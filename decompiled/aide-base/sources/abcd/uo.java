package abcd;

import com.aide.uidesigner.ProxyTextView;

/* loaded from: classes.dex */
public class uo {
    private static final int[] VH = {5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
    private int[] FH;
    public final b j6 = new b();
    private int Zo = 1;
    private int[] DW = new int[VH[1]];
    private int Hw = 0;
    private int v5 = 0;

    public class b {
        private int DW;
        private int j6;

        public void DW() {
            this.j6 = 0;
        }

        public int FH() {
            return this.DW;
        }

        public boolean j6() {
            while (this.j6 < uo.this.DW.length) {
                int[] iArr = uo.this.DW;
                int i = this.j6;
                int i2 = iArr[i];
                this.DW = i2;
                this.j6 = i + 1;
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    if (i2 == Integer.MAX_VALUE) {
                        this.DW = 0;
                    }
                    return true;
                }
            }
            return false;
        }

        private b() {
            this.j6 = 0;
        }
    }

    static {
        new uo();
    }

    private void Hw() {
        int[] iArr;
        int i;
        int i2 = this.v5 * 2;
        int[] iArr2 = this.DW;
        int i3 = 0;
        if (i2 > iArr2.length) {
            int i4 = this.Zo + 1;
            this.Zo = i4;
            this.FH = null;
            iArr = new int[VH[i4]];
        } else {
            iArr = this.FH;
            if (iArr == null || iArr.length != iArr2.length) {
                this.FH = this.DW;
                iArr = new int[VH[this.Zo]];
            } else {
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    iArr[i5] = 0;
                }
                this.FH = this.DW;
            }
        }
        int i6 = 0;
        while (true) {
            int[] iArr3 = this.DW;
            if (i3 >= iArr3.length) {
                this.DW = iArr;
                this.Hw = i6;
                return;
            }
            int i7 = iArr3[i3];
            if (i7 != 0 && i7 != Integer.MIN_VALUE) {
                int i8 = Integer.MAX_VALUE & i7;
                int length = (i8 % (iArr.length - 2)) + 1;
                int length2 = iArr.length;
                while (true) {
                    i = i8 % length2;
                    if (iArr[i] == 0) {
                        break;
                    }
                    i8 = i + length;
                    length2 = iArr.length;
                }
                iArr[i] = i7;
                i6++;
            }
            i3++;
        }
    }

    public boolean DW(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        int i2 = Integer.MAX_VALUE & i;
        int[] iArr = this.DW;
        int length = (i2 % (iArr.length - 2)) + 1;
        int length2 = i2 % iArr.length;
        int i3 = iArr[length2];
        while (i3 != i) {
            if (i3 == 0) {
                return false;
            }
            int[] iArr2 = this.DW;
            length2 = (length2 + length) % iArr2.length;
            i3 = iArr2[length2];
        }
        return true;
    }

    public void FH(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        int i2 = Integer.MAX_VALUE & i;
        int[] iArr = this.DW;
        int length = i2 % iArr.length;
        int length2 = (i2 % (iArr.length - 2)) + 1;
        int i3 = iArr[length];
        int i4 = -1;
        while (i3 != 0) {
            if (i3 == i) {
                return;
            }
            if (i3 == Integer.MIN_VALUE) {
                i4 = length;
            }
            int[] iArr2 = this.DW;
            length = (length + length2) % iArr2.length;
            i3 = iArr2[length];
        }
        if (i4 != -1) {
            length = i4;
        }
        this.DW[length] = i;
        if (i4 == -1) {
            this.Hw++;
        }
        this.v5++;
        if (this.Hw * 2 > this.DW.length) {
            Hw();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        if (uoVar.v5() != v5()) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.DW;
            if (i >= iArr.length) {
                return true;
            }
            int i2 = iArr[i];
            if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                if (i2 == Integer.MAX_VALUE) {
                    i2 = 0;
                }
                if (!uoVar.DW(i2)) {
                    return false;
                }
            }
            i++;
        }
    }

    public String toString() {
        String str = "{";
        int i = 0;
        while (true) {
            int[] iArr = this.DW;
            if (i >= iArr.length) {
                return str + "}";
            }
            int i2 = iArr[i];
            if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                if (i2 == Integer.MAX_VALUE) {
                    str = str + "0, ";
                } else {
                    str = str + i2 + ", ";
                }
            }
            i++;
        }
    }

    public int v5() {
        return this.v5;
    }
}
