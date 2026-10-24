package abcd;

import com.aide.uidesigner.ProxyTextView;

/* loaded from: classes.dex */
public class to {
    private static final int[] u7 = {5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
    private int[] DW;
    private int[] FH;
    private int[] Hw;
    private int VH;
    private int Zo;
    private int gn;
    public final b j6;
    private int[] v5;

    public class b {
        private int DW;
        private int FH;
        private int Hw;
        private int j6;
        private int v5;

        public void DW() {
            this.j6 = 0;
            this.DW = 0;
        }

        public void FH(int i) {
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            this.v5 = i;
            int i2 = i & Integer.MAX_VALUE;
            this.DW = (i2 % (to.this.DW.length - 2)) + 1;
            this.j6 = i2 % to.this.DW.length;
        }

        public int Hw() {
            return this.FH;
        }

        public boolean j6() {
            if (this.DW == 0) {
                while (this.j6 < to.this.DW.length) {
                    int i = to.this.DW[this.j6];
                    this.FH = i;
                    if (i != 0 && i != Integer.MIN_VALUE) {
                        if (i == Integer.MAX_VALUE) {
                            this.FH = 0;
                        }
                        int[] iArr = to.this.Hw;
                        int i2 = this.j6;
                        this.Hw = iArr[i2];
                        this.j6 = i2 + 1;
                        return true;
                    }
                    this.j6++;
                }
                return false;
            }
            while (true) {
                int[] iArr2 = to.this.DW;
                int i3 = this.j6;
                int i4 = iArr2[i3];
                this.FH = i4;
                if (i4 == 0) {
                    return false;
                }
                if (i4 == this.v5) {
                    if (i4 == Integer.MAX_VALUE) {
                        this.FH = 0;
                    }
                    int[] iArr3 = to.this.Hw;
                    int i5 = this.j6;
                    this.Hw = iArr3[i5];
                    this.j6 = (i5 + this.DW) % to.this.DW.length;
                    return true;
                }
                this.j6 = (i3 + this.DW) % to.this.DW.length;
            }
        }

        public int v5() {
            return this.Hw;
        }

        private b() {
            this.j6 = 0;
            this.DW = 0;
        }
    }

    public to(int i) {
        this.j6 = new b();
        this.gn = 0;
        while (true) {
            int[] iArr = u7;
            int i2 = this.gn;
            if (iArr[i2] >= i * 2) {
                this.DW = new int[iArr[i2]];
                this.Hw = new int[iArr[i2]];
                this.Zo = 0;
                this.VH = 0;
                return;
            }
            this.gn = i2 + 1;
        }
    }

    private void gn() {
        int[] iArr;
        int[] iArr2;
        int i;
        int i2 = this.VH * 2;
        int[] iArr3 = this.DW;
        int i3 = 0;
        if (i2 > iArr3.length) {
            int i4 = this.gn + 1;
            this.gn = i4;
            this.FH = null;
            this.v5 = null;
            int[] iArr4 = u7;
            iArr = new int[iArr4[i4]];
            iArr2 = new int[iArr4[i4]];
        } else {
            iArr = this.FH;
            if (iArr == null || iArr.length != iArr3.length) {
                this.FH = this.DW;
                this.v5 = this.Hw;
                int[] iArr5 = u7;
                int i5 = this.gn;
                iArr = new int[iArr5[i5]];
                iArr2 = new int[iArr5[i5]];
            } else {
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    iArr[i6] = 0;
                }
                iArr2 = this.v5;
                this.FH = this.DW;
                this.v5 = this.Hw;
            }
        }
        int i7 = 0;
        while (true) {
            int[] iArr6 = this.DW;
            if (i3 >= iArr6.length) {
                this.DW = iArr;
                this.Hw = iArr2;
                this.Zo = i7;
                return;
            }
            int i8 = iArr6[i3];
            if (i8 != 0 && i8 != Integer.MIN_VALUE) {
                int i9 = Integer.MAX_VALUE & i8;
                int length = (i9 % (iArr.length - 2)) + 1;
                int length2 = iArr.length;
                while (true) {
                    i = i9 % length2;
                    if (iArr[i] == 0) {
                        break;
                    }
                    i9 = i + length;
                    length2 = iArr.length;
                }
                iArr[i] = i8;
                iArr2[i] = this.Hw[i3];
                i7++;
            }
            i3++;
        }
    }

    public void FH() {
        if (this.Zo <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.DW;
            if (i >= iArr.length) {
                this.Zo = 0;
                this.VH = 0;
                return;
            } else {
                iArr[i] = 0;
                i++;
            }
        }
    }

    public b Hw() {
        return new b();
    }

    public void VH(int i, int i2) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        int i3 = Integer.MAX_VALUE & i;
        int[] iArr = this.DW;
        int length = i3 % iArr.length;
        int length2 = (i3 % (iArr.length - 2)) + 1;
        boolean z = false;
        int i4 = iArr[length];
        int i5 = -1;
        while (i4 != 0) {
            if (i4 == i) {
                if (this.Hw[length] == i2) {
                    z = true;
                } else {
                    this.DW[length] = Integer.MIN_VALUE;
                    this.VH--;
                }
            } else if (i4 == Integer.MIN_VALUE) {
                i5 = length;
            }
            int[] iArr2 = this.DW;
            length = (length + length2) % iArr2.length;
            i4 = iArr2[length];
        }
        if (z) {
            return;
        }
        if (i5 != -1) {
            length = i5;
        }
        this.DW[length] = i;
        this.Hw[length] = i2;
        this.VH++;
        if (i5 == -1) {
            this.Zo++;
        }
        if (this.Zo * 2 > this.DW.length) {
            gn();
        }
    }

    public void Zo(int i, int i2) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        int i3 = Integer.MAX_VALUE & i;
        int[] iArr = this.DW;
        int length = i3 % iArr.length;
        int length2 = (i3 % (iArr.length - 2)) + 1;
        int i4 = iArr[length];
        int i5 = -1;
        while (i4 != 0) {
            if (i4 == i) {
                if (this.Hw[length] == i2) {
                    return;
                }
            } else if (i4 == Integer.MIN_VALUE) {
                i5 = length;
            }
            int[] iArr2 = this.DW;
            length = (length + length2) % iArr2.length;
            i4 = iArr2[length];
        }
        if (i5 != -1) {
            length = i5;
        }
        this.DW[length] = i;
        this.Hw[length] = i2;
        this.VH++;
        if (i5 == -1) {
            this.Zo++;
        }
        if (this.Zo * 2 > this.DW.length) {
            gn();
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
                int i3 = this.Hw[i];
                if (i2 == Integer.MAX_VALUE) {
                    str = str + "0->" + i3 + ", ";
                } else {
                    str = str + i2 + "->" + i3 + ", ";
                }
            }
            i++;
        }
    }

    public int u7() {
        return this.VH;
    }

    public int v5(int i) {
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
                return -1;
            }
            int[] iArr2 = this.DW;
            length2 = (length2 + length) % iArr2.length;
            i3 = iArr2[length2];
        }
        return this.Hw[length2];
    }

    public to() {
        this.j6 = new b();
        this.gn = 0;
        int[] iArr = u7;
        this.DW = new int[iArr[0]];
        this.Hw = new int[iArr[0]];
        this.Zo = 0;
        this.VH = 0;
    }
}
