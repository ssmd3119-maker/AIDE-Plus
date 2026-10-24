package abcd;

import com.aide.uidesigner.ProxyTextView;

@cy(clazz = -841303878985533273L, container = -841303878985533273L, user = true)
/* loaded from: classes.dex */
public class d3 {

    @dy(field = -11784326254558620L)
    private static final int[] gn;

    @gy
    private static /* synthetic */ boolean tp;

    @fy
    private static /* synthetic */ boolean u7;

    @dy(field = -2524712710769442425L)
    private long[] DW;

    @dy(field = 2036516144078093424L)
    private int[] FH;

    @dy(field = 2644252862294472625L)
    private int[] Hw;

    @dy(field = -1537364462906718880L)
    private int VH;

    @dy(field = 638214035480845441L)
    private int Zo;

    @dy(field = -1476769781514878496L)
    private long[] j6;

    @dy(field = 1241046473090080679L)
    private int v5;

    @cy(clazz = 5292118356782114075L, container = 5292118356782114075L, user = true)
    public class b {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -4172977501964374631L)
        public /* synthetic */ b(d3 d3Var, a aVar) {
            this(d3Var);
            try {
                if (j6) {
                    iy.EQ(-134400406678034873L, null, d3Var, aVar);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.Mr(th, -134400406678034873L, null, d3Var, aVar);
                }
                throw th;
            }
        }

        @ey(method = 33808782387511215L)
        private b(d3 d3Var) {
            try {
                if (j6) {
                    iy.tp(435738392491990605L, null, d3Var);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 435738392491990605L, null, d3Var);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(d3.class);
            if (u7) {
                iy.gn(3248469553883527700L, null);
            }
            gn = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 3248469553883527700L, null);
            }
            throw th;
        }
    }

    @ey(method = 2747896883365659373L)
    public d3() {
        a aVar = null;
        try {
            if (u7) {
                iy.gn(-4715908203577089120L, null);
            }
            new b(this, aVar);
            this.VH = 0;
            this.j6 = new long[gn[0]];
            this.FH = new int[gn[0]];
            this.v5 = 0;
            this.Zo = 0;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -4715908203577089120L, null);
            }
            throw th;
        }
    }

    @ey(method = -2600286742085766684L)
    private void v5() {
        long[] jArr;
        int[] iArr;
        try {
            if (u7) {
                iy.gn(-355236792828969195L, this);
            }
            if (this.Zo * 2 > this.j6.length) {
                int i = this.VH + 1;
                this.VH = i;
                this.DW = null;
                this.Hw = null;
                jArr = new long[gn[i]];
                iArr = new int[gn[i]];
            } else if (this.DW == null || this.DW.length != this.j6.length) {
                this.DW = this.j6;
                this.Hw = this.FH;
                jArr = new long[gn[this.VH]];
                iArr = new int[gn[this.VH]];
            } else {
                jArr = this.DW;
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    jArr[i2] = 0;
                }
                iArr = this.Hw;
                this.DW = this.j6;
                this.Hw = this.FH;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.j6.length; i4++) {
                long j = this.j6[i4];
                if (j != 0 && j != Long.MIN_VALUE) {
                    long j2 = Long.MAX_VALUE & j;
                    int length = (int) (j2 % jArr.length);
                    int length2 = ((int) (j2 % (jArr.length - 2))) + 1;
                    while (jArr[length] != 0) {
                        length = (length + length2) % jArr.length;
                    }
                    jArr[length] = j;
                    iArr[length] = this.FH[i4];
                    i3++;
                }
            }
            this.j6 = jArr;
            this.FH = iArr;
            this.v5 = i3;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -355236792828969195L, this);
            }
            throw th;
        }
    }

    @ey(method = -1302798338970813861L)
    public boolean DW(long j) {
        try {
            if (u7) {
                iy.tp(815730037251973760L, this, new Long(j));
            }
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            long j2 = Long.MAX_VALUE & j;
            int length = (int) (j2 % this.j6.length);
            int length2 = ((int) (j2 % (this.j6.length - 2))) + 1;
            long j3 = this.j6[length];
            while (j3 != j) {
                if (j3 == 0) {
                    return false;
                }
                length = (length + length2) % this.j6.length;
                j3 = this.j6[length];
            }
            return true;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 815730037251973760L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -6826953658861537344L)
    public int FH(long j) {
        try {
            if (u7) {
                iy.tp(-7782042155463490131L, this, new Long(j));
            }
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            long j2 = Long.MAX_VALUE & j;
            int length = (int) (j2 % this.j6.length);
            int length2 = ((int) (j2 % (this.j6.length - 2))) + 1;
            long j3 = this.j6[length];
            while (j3 != j) {
                if (j3 == 0) {
                    return -1;
                }
                length = (length + length2) % this.j6.length;
                j3 = this.j6[length];
            }
            return this.FH[length];
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -7782042155463490131L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -2682772791797652936L)
    public void Hw(long j, int i) {
        try {
            if (u7) {
                iy.EQ(-3123752686141576509L, this, new Long(j), new Integer(i));
            }
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            long j2 = Long.MAX_VALUE & j;
            int length = (int) (j2 % this.j6.length);
            int length2 = ((int) (j2 % (this.j6.length - 2))) + 1;
            long j3 = this.j6[length];
            int i2 = -1;
            while (j3 != 0) {
                if (j3 == j) {
                    if (this.FH[length] == i) {
                        return;
                    }
                    this.j6[length] = Long.MIN_VALUE;
                    this.Zo--;
                } else if (j3 == Long.MIN_VALUE) {
                    i2 = length;
                }
                length = (length + length2) % this.j6.length;
                j3 = this.j6[length];
            }
            if (i2 != -1) {
                length = i2;
            }
            this.j6[length] = j;
            this.FH[length] = i;
            this.Zo++;
            if (i2 == -1) {
                this.v5++;
            }
            if (this.v5 * 2 > this.j6.length) {
                v5();
            }
        } finally {
        }
    }

    @ey(method = -2054857154960590620L)
    public int Zo() {
        try {
            if (u7) {
                iy.gn(1421119522668328021L, this);
            }
            return this.Zo;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 1421119522668328021L, this);
            }
            throw th;
        }
    }

    @ey(method = -1551437136881534340L)
    public void j6() {
        try {
            if (u7) {
                iy.gn(-1237326473175517197L, this);
            }
            if (this.v5 > 0) {
                for (int i = 0; i < this.j6.length; i++) {
                    this.j6[i] = 0;
                }
                this.v5 = 0;
                this.Zo = 0;
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -1237326473175517197L, this);
            }
            throw th;
        }
    }

    @ey(method = -3350731799566149625L)
    public String toString() {
        try {
            if (u7) {
                iy.gn(855331686624496424L, this);
            }
            String str = "{";
            for (int i = 0; i < this.j6.length; i++) {
                long j = this.j6[i];
                if (j != 0 && j != Long.MIN_VALUE) {
                    int i2 = this.FH[i];
                    str = j == Long.MAX_VALUE ? str + "0->" + i2 + ", " : str + j + "->" + i2 + ", ";
                }
            }
            return str + "}";
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 855331686624496424L, this);
            }
            throw th;
        }
    }
}
