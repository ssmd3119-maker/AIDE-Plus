package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 7360388161383203025L, container = 7360388161383203025L, user = true)
/* loaded from: classes.dex */
public class HashtableOfInt<T> {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = -2112874059830192384L)
    private static final int[] u7;

    @dy(field = -212284426466010312L)
    private int[] DW;

    @dy(field = 147742362621808803L)
    private int[] FH;

    @dy(field = 1605692611523357804L)
    private T[] Hw;

    @dy(field = -1466678899635048423L)
    private int VH;

    @dy(field = -833805449763845229L)
    private int Zo;

    @dy(field = 1198532525584837548L)
    private int gn;

    @dy(field = -2895155796521169792L)
    public final HashtableOfInt<T>.b j6;

    @dy(field = 3288918572145288033L)
    private T[] v5;

    @cy(clazz = 1360197766476346969L, container = 1360197766476346969L, user = true)
    public class b {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 1510980506830099600L)
        private int DW;

        @dy(field = 708095089362173539L)
        private int FH;

        @dy(field = 2190498677736197445L)
        private T Hw;

        @dy(field = -1477499560909315656L)
        @hy
        final /* synthetic */ HashtableOfInt Zo;

        @dy(field = 1675180986662809600L)
        private int j6;

        @dy(field = -1493781540304395804L)
        private int v5;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 1322336692918474649L)
        public /* synthetic */ b(HashtableOfInt hashtableOfInt, a aVar) {
            this(hashtableOfInt);
            try {
                if (VH) {
                    iy.EQ(-816733024977602304L, null, hashtableOfInt, aVar);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, -816733024977602304L, null, hashtableOfInt, aVar);
                }
                throw th;
            }
        }

        @ey(method = -669404649796054347L)
        public void DW() {
            try {
                if (VH) {
                    iy.gn(1287148807320878640L, this);
                }
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 1287148807320878640L, this);
                }
                throw th;
            }
        }

        @ey(method = -2524700540544124887L)
        public int FH() {
            try {
                if (VH) {
                    iy.gn(2426033441639374124L, this);
                }
                return this.FH;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 2426033441639374124L, this);
                }
                throw th;
            }
        }

        @ey(method = 409100465258465487L)
        public T Hw() {
            try {
                if (VH) {
                    iy.gn(-1246058646537277336L, this);
                }
                return this.Hw;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -1246058646537277336L, this);
                }
                throw th;
            }
        }

        @ey(method = -1134961409989931033L)
        public boolean j6() {
            try {
                if (VH) {
                    iy.gn(887374090413555704L, this);
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
                    iy.aM(th, 887374090413555704L, this);
                }
                throw th;
            }
        }

        @ey(method = 110213513056291260L)
        private b(HashtableOfInt hashtableOfInt) {
            try {
                if (VH) {
                    iy.tp(-734448108852801783L, null, hashtableOfInt);
                }
                this.Zo = hashtableOfInt;
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -734448108852801783L, null, hashtableOfInt);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(HashtableOfInt.class);
            if (tp) {
                iy.gn(1346018338701764995L, null);
            }
            u7 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1346018338701764995L, null);
            }
            throw th;
        }
    }

    @ey(method = -13718560665206400L)
    public HashtableOfInt(int i) {
        a aVar = null;
        try {
            if (tp) {
                iy.u7(-3545753592683713920L, null, i);
            }
            this.j6 = new b(this, aVar);
            this.gn = 0;
            while (u7[this.gn] < i * 2) {
                this.gn++;
            }
            this.DW = new int[u7[this.gn]];
            this.Hw = (T[]) new Object[u7[this.gn]];
            this.Zo = 0;
            this.VH = 0;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -3545753592683713920L, null, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 84727159270746456L)
    private void u7() {
        int[] iArr;
        T[] tArr;
        try {
            if (tp) {
                iy.gn(-2936328469938470880L, this);
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
            if (this.v5 != null) {
                for (int i7 = 0; i7 < this.v5.length; i7++) {
                    this.v5[i7] = null;
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2936328469938470880L, this);
            }
            throw th;
        }
    }

    @ey(method = -2351912409941754920L)
    public int EQ() {
        try {
            if (tp) {
                iy.gn(-1917599878404671328L, this);
            }
            return this.VH;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1917599878404671328L, this);
            }
            throw th;
        }
    }

    @ey(method = -1172921184096321088L)
    public void FH() {
        try {
            if (tp) {
                iy.gn(-616084013174343000L, this);
            }
            for (int i = 0; i < this.DW.length; i++) {
                this.DW[i] = 0;
            }
            for (int i2 = 0; i2 < this.Hw.length; i2++) {
                this.Hw[i2] = null;
            }
            this.Zo = 0;
            this.VH = 0;
            this.v5 = null;
            this.FH = null;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -616084013174343000L, this);
            }
            throw th;
        }
    }

    @ey(method = 426113548035080773L)
    public boolean Hw(int i) {
        try {
            if (tp) {
                iy.u7(117971930104354865L, this, i);
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
                iy.j3(th, 117971930104354865L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -501052871601054812L)
    public void VH(int i, T t) {
        try {
            if (tp) {
                iy.EQ(-3036674910552220800L, this, new Integer(i), t);
            }
            tp(i);
            Zo(i, t);
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -3036674910552220800L, this, new Integer(i), t);
            }
            throw th;
        }
    }

    @ey(method = -682320870025312968L)
    public void Zo(int i, T t) {
        try {
            if (tp) {
                iy.EQ(2683471013546840712L, this, new Integer(i), t);
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
                u7();
            }
        } finally {
        }
    }

    @ey(method = 7244708523512998265L)
    public void gn(HashtableOfInt<? extends T> hashtableOfInt) {
        try {
            if (tp) {
                iy.tp(2193639453993458625L, this, hashtableOfInt);
            }
            for (int i = 0; i < hashtableOfInt.DW.length; i++) {
                int i2 = hashtableOfInt.DW[i];
                T t = hashtableOfInt.Hw[i];
                if (i2 == Integer.MAX_VALUE) {
                    Zo(0, t);
                } else if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    Zo(i2, t);
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 2193639453993458625L, this, hashtableOfInt);
            }
            throw th;
        }
    }

    @ey(method = 3397364588532230025L)
    public String toString() {
        try {
            if (tp) {
                iy.gn(-1029057893001464271L, this);
            }
            return getClass().getName() + "[Size=" + this.VH + "]";
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1029057893001464271L, this);
            }
            throw th;
        }
    }

    @ey(method = -31382711516340432L)
    public void tp(int i) {
        try {
            if (tp) {
                iy.u7(-5745820151261733088L, this, i);
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
                    this.Hw[length] = null;
                    this.VH--;
                }
                length = (length + length2) % this.DW.length;
                i3 = this.DW[length];
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -5745820151261733088L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 247668651680362848L)
    public T v5(int i) {
        try {
            if (tp) {
                iy.u7(-4303058939507884824L, this, i);
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
                iy.j3(th, -4303058939507884824L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -759309984412143525L)
    public HashtableOfInt() {
        a aVar = null;
        try {
            if (tp) {
                iy.gn(-3000439428057659209L, null);
            }
            this.j6 = new b(this, aVar);
            this.gn = 0;
            this.DW = new int[u7[0]];
            this.Hw = (T[]) new Object[u7[0]];
            this.Zo = 0;
            this.VH = 0;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -3000439428057659209L, null);
            }
            throw th;
        }
    }
}
