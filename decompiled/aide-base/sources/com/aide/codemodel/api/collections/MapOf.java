package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 322898086603826664L, container = 322898086603826664L, user = true)
/* loaded from: classes.dex */
public class MapOf<K extends Entity, V extends Entity> {

    @fy
    private static /* synthetic */ boolean EQ;

    @dy(field = -2437139516333656589L)
    private static final int[] tp;

    @gy
    private static /* synthetic */ boolean we;

    @dy(field = 1587305318537238107L)
    private int[] DW;

    @dy(field = -3395633585993462400L)
    private int[] FH;

    @dy(field = -1466214081507359919L)
    private int[] Hw;

    @dy(field = -1783600356215724456L)
    private int VH;

    @dy(field = -1139519472776472564L)
    private int Zo;

    @dy(field = -2337720372844785045L)
    private int gn;

    @dy(field = -2711714401867474791L)
    public final MapOf<K, V>.b j6;

    @dy(field = -1131010667599403971L)
    private final EntitySpace u7;

    @dy(field = -3583818271219722136L)
    private int[] v5;

    @cy(clazz = 4962806706425249820L, container = 4962806706425249820L, user = true)
    public class b {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 1987306095262793580L)
        private int DW;

        @dy(field = -1333261660729482497L)
        private int FH;

        @dy(field = -1427361250920998075L)
        private int Hw;

        @dy(field = -655484110292253992L)
        @hy
        final /* synthetic */ MapOf Zo;

        @dy(field = -1902478700864785500L)
        private int j6;

        @dy(field = -665955962505527296L)
        private int v5;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 1558525605502838115L)
        public /* synthetic */ b(MapOf mapOf, a aVar) {
            this(mapOf);
            try {
                if (VH) {
                    iy.EQ(410159686244192896L, null, mapOf, aVar);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, 410159686244192896L, null, mapOf, aVar);
                }
                throw th;
            }
        }

        @ey(method = 1411096834889958531L)
        public void DW() {
            try {
                if (VH) {
                    iy.gn(1356086029566987952L, this);
                }
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 1356086029566987952L, this);
                }
                throw th;
            }
        }

        @ey(method = -291859551704485392L)
        public void FH(K k) {
            try {
                if (VH) {
                    iy.tp(1171463140008917573L, this, k);
                }
                int id = this.Zo.u7.getId(k);
                if (id == 0) {
                    id = Integer.MAX_VALUE;
                }
                this.v5 = id;
                int i = id & Integer.MAX_VALUE;
                this.DW = (i % (this.Zo.DW.length - 2)) + 1;
                this.j6 = i % this.Zo.DW.length;
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 1171463140008917573L, this, k);
                }
                throw th;
            }
        }

        @ey(method = 2175564112617627015L)
        public K Hw() {
            try {
                if (VH) {
                    iy.gn(2119858703759780940L, this);
                }
                return (K) this.Zo.u7.getEntity(this.FH);
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 2119858703759780940L, this);
                }
                throw th;
            }
        }

        @ey(method = -5627278362831163407L)
        public boolean j6() {
            try {
                if (VH) {
                    iy.gn(1017039341104904376L, this);
                }
                if (this.DW == 0) {
                    while (this.j6 < this.Zo.DW.length) {
                        int i = this.Zo.DW[this.j6];
                        this.FH = i;
                        if (i != 0 && i != Integer.MIN_VALUE) {
                            if (i == Integer.MAX_VALUE) {
                                this.FH = 0;
                            }
                            this.Hw = this.Zo.Hw[this.j6];
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
                        this.Hw = this.Zo.Hw[this.j6];
                        this.j6 = (this.j6 + this.DW) % this.Zo.DW.length;
                        return true;
                    }
                    this.j6 = (this.j6 + this.DW) % this.Zo.DW.length;
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 1017039341104904376L, this);
                }
                throw th;
            }
        }

        @ey(method = -1663296356559316695L)
        public V v5() {
            try {
                if (VH) {
                    iy.gn(3600844990171911848L, this);
                }
                return (V) this.Zo.u7.getEntity(this.Hw);
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 3600844990171911848L, this);
                }
                throw th;
            }
        }

        @ey(method = -4918567032009281867L)
        private b(MapOf mapOf) {
            try {
                if (VH) {
                    iy.tp(-187551753598721728L, null, mapOf);
                }
                this.Zo = mapOf;
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -187551753598721728L, null, mapOf);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(MapOf.class);
            if (EQ) {
                iy.gn(2614993682939561553L, null);
            }
            tp = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 2614993682939561553L, null);
            }
            throw th;
        }
    }

    @ey(method = 73825745807768220L)
    public MapOf(EntitySpace entitySpace) {
        a aVar = null;
        try {
            if (EQ) {
                iy.tp(6952508584435058672L, null, entitySpace);
            }
            this.j6 = new b(this, aVar);
            this.u7 = entitySpace;
            this.gn = 0;
            this.DW = new int[tp[0]];
            this.Hw = new int[tp[0]];
            this.Zo = 0;
            this.VH = 0;
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 6952508584435058672L, null, entitySpace);
            }
            throw th;
        }
    }

    @ey(method = 2516688841498912L)
    private int VH(int i) {
        try {
            if (EQ) {
                iy.u7(-3417332788425191671L, this, i);
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = 0;
            int i3 = Integer.MAX_VALUE & i;
            int length = (i3 % (this.DW.length - 2)) + 1;
            int length2 = i3 % this.DW.length;
            int i4 = this.DW[length2];
            while (i4 != 0) {
                if (i4 == i) {
                    i2++;
                }
                length2 = (length2 + length) % this.DW.length;
                i4 = this.DW[length2];
            }
            return i2;
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -3417332788425191671L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 5997876860234696779L)
    private void Ws(int i, int i2) {
        try {
            if (EQ) {
                iy.EQ(5932527599080315968L, this, new Integer(i), new Integer(i2));
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i3 = Integer.MAX_VALUE & i;
            int length = i3 % this.DW.length;
            int length2 = (i3 % (this.DW.length - 2)) + 1;
            boolean z = false;
            int i4 = this.DW[length];
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
                length = (length + length2) % this.DW.length;
                i4 = this.DW[length];
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
                XL();
            }
        } finally {
        }
    }

    @ey(method = -3031644053604666381L)
    private void XL() {
        int[] iArr;
        int[] iArr2;
        try {
            if (EQ) {
                iy.gn(-115130115050914944L, this);
            }
            if (this.VH * 2 > this.DW.length) {
                int i = this.gn + 1;
                this.gn = i;
                this.FH = null;
                this.v5 = null;
                iArr = new int[tp[i]];
                iArr2 = new int[tp[i]];
            } else if (this.FH == null || this.FH.length != this.DW.length) {
                this.FH = this.DW;
                this.v5 = this.Hw;
                iArr = new int[tp[this.gn]];
                iArr2 = new int[tp[this.gn]];
            } else {
                iArr = this.FH;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    iArr[i2] = 0;
                }
                iArr2 = this.v5;
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
                    iArr2[length2] = this.Hw[i4];
                    i3++;
                }
            }
            this.DW = iArr;
            this.Hw = iArr2;
            this.Zo = i3;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -115130115050914944L, this);
            }
            throw th;
        }
    }

    @ey(method = 45627740073281689L)
    private void aM(int i) {
        try {
            if (EQ) {
                iy.u7(1802641756122297552L, this, i);
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
            if (we) {
                iy.j3(th, 1802641756122297552L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 7485915036603016043L)
    private int u7(int i) {
        try {
            if (EQ) {
                iy.u7(-474262687031353260L, this, i);
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
                    return -1;
                }
                length2 = (length2 + length) % this.DW.length;
                i3 = this.DW[length2];
            }
            return this.Hw[length2];
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -474262687031353260L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 434399061634444040L)
    private boolean v5(int i) {
        try {
            if (EQ) {
                iy.u7(-88632522917287045L, this, i);
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
            if (we) {
                iy.j3(th, -88632522917287045L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -382344812236300713L)
    private void we(int i, int i2) {
        try {
            if (EQ) {
                iy.EQ(1485677553173615920L, this, new Integer(i), new Integer(i2));
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i3 = Integer.MAX_VALUE & i;
            int length = i3 % this.DW.length;
            int length2 = (i3 % (this.DW.length - 2)) + 1;
            int i4 = this.DW[length];
            int i5 = -1;
            while (i4 != 0) {
                if (i4 == i) {
                    if (this.Hw[length] == i2) {
                        return;
                    }
                } else if (i4 == Integer.MIN_VALUE) {
                    i5 = length;
                }
                length = (length + length2) % this.DW.length;
                i4 = this.DW[length];
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
                XL();
            }
        } finally {
        }
    }

    @ey(method = -74427137003137981L)
    public void J8(MapOf<? extends K, ? extends V> mapOf) {
        try {
            if (EQ) {
                iy.tp(4396797126646991460L, this, mapOf);
            }
            for (int i = 0; i < mapOf.DW.length; i++) {
                int i2 = mapOf.DW[i];
                int i3 = mapOf.Hw[i];
                if (i2 == Integer.MAX_VALUE) {
                    we(0, i3);
                } else if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    we(i2, i3);
                }
            }
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 4396797126646991460L, this, mapOf);
            }
            throw th;
        }
    }

    @ey(method = -573995573937427149L)
    public int Mr() {
        try {
            if (EQ) {
                iy.gn(-1870795857218456960L, this);
            }
            return this.VH;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -1870795857218456960L, this);
            }
            throw th;
        }
    }

    @ey(method = -6819440735818781917L)
    public void QX(K k, V v) {
        try {
            if (EQ) {
                iy.EQ(-4581435542477892336L, this, k, v);
            }
            Ws(this.u7.getId(k), this.u7.getId(v));
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, -4581435542477892336L, this, k, v);
            }
            throw th;
        }
    }

    @ey(method = -1485353157350468851L)
    public void clear() {
        try {
            if (EQ) {
                iy.gn(1943687438927852640L, this);
            }
            if (this.Zo > 0) {
                for (int i = 0; i < this.DW.length; i++) {
                    this.DW[i] = 0;
                }
                this.Zo = 0;
                this.VH = 0;
            }
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 1943687438927852640L, this);
            }
            throw th;
        }
    }

    @ey(method = 535475729532520512L)
    public boolean contains(K k) {
        try {
            if (EQ) {
                iy.tp(-47060638405872111L, this, k);
            }
            return v5(this.u7.getId(k));
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -47060638405872111L, this, k);
            }
            throw th;
        }
    }

    @ey(method = 7987069644072295761L)
    public V get(K k) {
        try {
            if (EQ) {
                iy.tp(-20210416123186464L, this, k);
            }
            return (V) this.u7.getEntity(u7(this.u7.getId(k)));
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -20210416123186464L, this, k);
            }
            throw th;
        }
    }

    @ey(method = 6253907048713222628L)
    public int gn(K k) {
        try {
            if (EQ) {
                iy.tp(-2893102025841633421L, this, k);
            }
            return VH(this.u7.getId(k));
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -2893102025841633421L, this, k);
            }
            throw th;
        }
    }

    @ey(method = -256326974819660241L)
    public void insert(K k, V v) {
        try {
            if (EQ) {
                iy.EQ(3398189714490928528L, this, k, v);
            }
            we(this.u7.getId(k), this.u7.getId(v));
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 3398189714490928528L, this, k, v);
            }
            throw th;
        }
    }

    @ey(method = 78086597204778795L)
    public void j3(K k) {
        try {
            if (EQ) {
                iy.tp(2353173155889999808L, this, k);
            }
            aM(this.u7.getId(k));
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 2353173155889999808L, this, k);
            }
            throw th;
        }
    }

    @ey(method = -4217211764403975304L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (EQ) {
                iy.tp(7181081537751839907L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.VH);
            storeOutputStream.writeInt(this.gn);
            for (int i = 0; i < this.DW.length; i++) {
                int i2 = this.DW[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    storeOutputStream.writeInt(this.DW[i]);
                    storeOutputStream.writeInt(this.Hw[i]);
                }
            }
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 7181081537751839907L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 983205455626766652L)
    public String toString() {
        try {
            if (EQ) {
                iy.gn(352493907469969375L, this);
            }
            String str = "{";
            for (int i = 0; i < this.DW.length; i++) {
                int i2 = this.DW[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    int i3 = this.Hw[i];
                    str = i2 == Integer.MAX_VALUE ? str + "0->" + i3 + ", " : str + i2 + " " + this.u7.getEntity(i2).getFullyQualifiedNameString() + " -> " + i3 + " " + this.u7.getEntity(i3).getFullyQualifiedNameString() + ", ";
                }
            }
            return str + "}";
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 352493907469969375L, this);
            }
            throw th;
        }
    }

    @ey(method = 2160768813308367080L)
    public K tp() {
        try {
            if (EQ) {
                iy.gn(1434877414226279291L, this);
            }
            int i = 0;
            int i2 = 0;
            while (i2 < this.DW.length) {
                int i3 = this.DW[i2];
                i2++;
                if (i3 != 0 && i3 != Integer.MIN_VALUE) {
                    if (i3 != Integer.MAX_VALUE) {
                        i = i3;
                    }
                    return (K) this.u7.getEntity(i);
                }
            }
            return null;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 1434877414226279291L, this);
            }
            throw th;
        }
    }

    @ey(method = -31969808092602880L)
    public MapOf(EntitySpace entitySpace, StoreInputStream storeInputStream) {
        try {
            a aVar = null;
            if (EQ) {
                iy.EQ(1337746200812693340L, null, entitySpace, storeInputStream);
            }
            this.j6 = new b(this, aVar);
            this.u7 = entitySpace;
            int i = storeInputStream.readInt();
            int i2 = storeInputStream.readInt();
            this.gn = i2;
            this.DW = new int[tp[i2]];
            this.Hw = new int[tp[i2]];
            this.Zo = 0;
            this.VH = 0;
            for (int i3 = 0; i3 < i; i3++) {
                we(storeInputStream.readInt(), storeInputStream.readInt());
            }
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 1337746200812693340L, null, entitySpace, storeInputStream);
            }
            throw th;
        }
    }
}
