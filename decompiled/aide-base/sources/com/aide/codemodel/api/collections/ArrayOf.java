package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 4967242876517076780L, container = 4967242876517076780L, user = true)
/* loaded from: classes.dex */
public class ArrayOf<T> {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = 936343634395342888L)
    private static final int[] u7;

    @dy(field = 238360836310693460L)
    private int[] DW;

    @dy(field = -422935401206132855L)
    private int[] FH;

    @dy(field = 1820892139362525416L)
    private T[] Hw;

    @dy(field = 1653347827390359387L)
    private int VH;

    @dy(field = 2302944149700018325L)
    private int Zo;

    @dy(field = 638468239418116400L)
    private int gn;

    @dy(field = 161964155982175144L)
    public final ArrayOf<T>.b j6;

    @dy(field = 1937372651397535287L)
    private T[] v5;

    @cy(clazz = -1018365442098577632L, container = -1018365442098577632L, user = true)
    public class b {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -2911088618663903265L)
        private int DW;

        @dy(field = 617438039637262376L)
        private int FH;

        @dy(field = -1136642703482335508L)
        private T Hw;

        @dy(field = 1081372160748178809L)
        @hy
        final /* synthetic */ ArrayOf Zo;

        @dy(field = -1672926209096879823L)
        private int j6;

        @dy(field = 1082280305273576451L)
        private int v5;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 1464528947641416580L)
        public /* synthetic */ b(ArrayOf arrayOf, a aVar) {
            this(arrayOf);
            try {
                if (VH) {
                    iy.EQ(-162188404509764868L, null, arrayOf, aVar);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, -162188404509764868L, null, arrayOf, aVar);
                }
                throw th;
            }
        }

        @ey(method = -2639837169992173984L)
        public void DW() {
            try {
                if (VH) {
                    iy.gn(-1251853313821082240L, this);
                }
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -1251853313821082240L, this);
                }
                throw th;
            }
        }

        @ey(method = 180952687003831280L)
        public int FH() {
            try {
                if (VH) {
                    iy.gn(-2196088765201729864L, this);
                }
                return this.FH;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -2196088765201729864L, this);
                }
                throw th;
            }
        }

        @ey(method = 432214682360059152L)
        public T Hw() {
            try {
                if (VH) {
                    iy.gn(-3283542036234027360L, this);
                }
                return this.Hw;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -3283542036234027360L, this);
                }
                throw th;
            }
        }

        @ey(method = 4843077191340094192L)
        public boolean j6() {
            try {
                if (VH) {
                    iy.gn(-3980798418362431200L, this);
                }
                if (this.DW == 0) {
                    while (this.j6 < this.Zo.DW.length) {
                        int i = this.Zo.DW[this.j6];
                        this.FH = i;
                        if (i != 0 && i != Integer.MIN_VALUE) {
                            if (i == Integer.MAX_VALUE) {
                                this.FH = 0;
                            }
                            this.Hw = (T) this.Zo.Hw[this.j6];
                            this.j6++;
                            return true;
                        }
                        this.j6++;
                    }
                    return false;
                }
                while (true) {
                    int i2 = this.Zo.DW[this.j6];
                    this.FH = i2;
                    if (i2 == 0) {
                        return false;
                    }
                    if (i2 == this.v5) {
                        if (i2 == Integer.MAX_VALUE) {
                            this.FH = 0;
                        }
                        this.Hw = (T) this.Zo.Hw[this.j6];
                        this.j6 = (this.j6 + this.DW) % this.Zo.DW.length;
                        return true;
                    }
                    this.j6 = (this.j6 + this.DW) % this.Zo.DW.length;
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -3980798418362431200L, this);
                }
                throw th;
            }
        }

        @ey(method = -11821047438650697L)
        private b(ArrayOf arrayOf) {
            try {
                if (VH) {
                    iy.tp(-411497317730045373L, null, arrayOf);
                }
                this.Zo = arrayOf;
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -411497317730045373L, null, arrayOf);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(ArrayOf.class);
            if (tp) {
                iy.gn(2491595004375838560L, null);
            }
            u7 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 2491595004375838560L, null);
            }
            throw th;
        }
    }

    @ey(method = -574590163866227775L)
    public ArrayOf() {
        a aVar = null;
        try {
            if (tp) {
                iy.gn(-2705571329496296265L, null);
            }
            this.j6 = new b(this, aVar);
            this.gn = 0;
            this.DW = new int[u7[0]];
            this.Hw = (T[]) new Object[u7[0]];
            this.Zo = 0;
            this.VH = 0;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2705571329496296265L, null);
            }
            throw th;
        }
    }

    @ey(method = 282309838656207264L)
    private void VH() {
        int[] iArr;
        T[] tArr;
        try {
            if (tp) {
                iy.gn(2832403260804541671L, this);
            }
            if (this.VH * 2 > this.DW.length) {
                int i = this.gn + 1;
                this.gn = i;
                this.FH = null;
                this.v5 = null;
                iArr = new int[u7[i]];
                tArr = (T[]) new Object[u7[i]];
            } else if (this.FH == null || this.FH.length != this.DW.length) {
                this.FH = this.DW;
                this.v5 = this.Hw;
                iArr = new int[u7[this.gn]];
                tArr = (T[]) new Object[u7[this.gn]];
            } else {
                iArr = this.FH;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    iArr[i2] = 0;
                }
                tArr = this.v5;
                this.FH = this.DW;
                this.v5 = this.Hw;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.DW.length; i4++) {
                int i5 = this.DW[i4];
                if (i5 != 0 && i5 != Integer.MIN_VALUE) {
                    int i6 = Integer.MAX_VALUE & i5;
                    int length = (i6 % (iArr.length - 2)) + 1;
                    int length2 = i6 % iArr.length;
                    while (iArr[length2] != 0) {
                        length2 = (length2 + length) % iArr.length;
                    }
                    iArr[length2] = i5;
                    tArr[length2] = this.Hw[i4];
                    i3++;
                }
            }
            this.DW = iArr;
            this.Hw = tArr;
            this.Zo = i3;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 2832403260804541671L, this);
            }
            throw th;
        }
    }

    @ey(method = 276580305324365595L)
    public boolean FH(int i) {
        try {
            if (tp) {
                iy.u7(100585106384436936L, this, i);
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = (i2 % (this.DW.length - 2)) + 1;
            int length2 = i2 % this.DW.length;
            int i3 = this.DW[length2];
            while (i3 != i) {
                if (i3 == 0) {
                    return false;
                }
                length2 = (length2 + length) % this.DW.length;
                i3 = this.DW[length2];
            }
            return true;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 100585106384436936L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 37162412484422100L)
    public T Hw(int i) {
        try {
            if (tp) {
                iy.u7(2678549808127387711L, this, i);
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = (i2 % (this.DW.length - 2)) + 1;
            int length2 = i2 % this.DW.length;
            int i3 = this.DW[length2];
            while (i3 != i) {
                if (i3 == 0) {
                    return null;
                }
                length2 = (length2 + length) % this.DW.length;
                i3 = this.DW[length2];
            }
            return this.Hw[length2];
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 2678549808127387711L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 6268460246976996360L)
    public void Zo(int i, T t) {
        try {
            if (tp) {
                iy.EQ(-2426990229583984211L, this, new Integer(i), t);
            }
            gn(i);
            v5(i, t);
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -2426990229583984211L, this, new Integer(i), t);
            }
            throw th;
        }
    }

    @ey(method = 288501805300465104L)
    public void gn(int i) {
        try {
            if (tp) {
                iy.u7(5428769114577455805L, this, i);
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = i2 % this.DW.length;
            int length2 = (i2 % (this.DW.length - 2)) + 1;
            int i3 = this.DW[length];
            while (i3 != 0) {
                if (i3 == i) {
                    this.DW[length] = Integer.MIN_VALUE;
                    this.VH--;
                }
                length = (length + length2) % this.DW.length;
                i3 = this.DW[length];
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 5428769114577455805L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -360284062246200337L)
    public String toString() {
        try {
            if (tp) {
                iy.gn(70806686696144224L, this);
            }
            return getClass().getName() + "[Size=" + this.VH + "]";
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 70806686696144224L, this);
            }
            throw th;
        }
    }

    @ey(method = -1922941926335685472L)
    public int u7() {
        try {
            if (tp) {
                iy.gn(-2403696245085621465L, this);
            }
            return this.VH;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2403696245085621465L, this);
            }
            throw th;
        }
    }

    @ey(method = 244002212504118324L)
    public void v5(int i, T t) {
        try {
            if (tp) {
                iy.EQ(54436343172184485L, this, new Integer(i), t);
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = i2 % this.DW.length;
            int length2 = (i2 % (this.DW.length - 2)) + 1;
            int i3 = this.DW[length];
            int i4 = -1;
            while (i3 != 0) {
                if (i3 == i) {
                    if (this.Hw[length] == t) {
                        return;
                    }
                } else if (i3 == Integer.MIN_VALUE) {
                    i4 = length;
                }
                length = (length + length2) % this.DW.length;
                i3 = this.DW[length];
            }
            if (i4 != -1) {
                length = i4;
            }
            this.DW[length] = i;
            this.Hw[length] = t;
            this.VH++;
            if (i4 == -1) {
                this.Zo++;
            }
            if (this.Zo * 2 > this.DW.length) {
                VH();
            }
        } finally {
        }
    }
}
