package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 2451584352145441620L, container = 2451584352145441620L, user = true)
/* loaded from: classes.dex */
public class MapOfIntInt {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = 952109684946897300L)
    private static final int[] u7;

    @dy(field = 1384266291851926712L)
    private int[] DW;

    @dy(field = 1373270203344798527L)
    private int[] FH;

    @dy(field = -1415512143243953280L)
    private int[] Hw;

    @dy(field = 1618774196975708625L)
    private int VH;

    @dy(field = 2220502582710722127L)
    private int Zo;

    @dy(field = 2368814562314603200L)
    private int gn;

    @dy(field = 2992845425604416132L)
    public final b j6;

    @dy(field = -35692828007601279L)
    private int[] v5;

    @cy(clazz = -268052789629962480L, container = -268052789629962480L, user = true)
    public class b {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -1353463936327969180L)
        private int DW;

        @dy(field = -1030136139207055125L)
        private int FH;

        @dy(field = 3020851637804340809L)
        private int Hw;

        @dy(field = 576357231953156632L)
        @hy
        final /* synthetic */ MapOfIntInt Zo;

        @dy(field = 2506551853044960284L)
        private int j6;

        @dy(field = 574496785979409600L)
        private int v5;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 69667605644418617L)
        public /* synthetic */ b(MapOfIntInt mapOfIntInt, a aVar) {
            this(mapOfIntInt);
            try {
                if (VH) {
                    iy.EQ(-1108979900001645584L, null, mapOfIntInt, aVar);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, -1108979900001645584L, null, mapOfIntInt, aVar);
                }
                throw th;
            }
        }

        @ey(method = 2076952882789465461L)
        public void DW() {
            try {
                if (VH) {
                    iy.gn(-577549524988802352L, this);
                }
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -577549524988802352L, this);
                }
                throw th;
            }
        }

        @ey(method = -529930429573273024L)
        public void FH(int i) {
            try {
                if (VH) {
                    iy.u7(1110043169612655741L, this, i);
                }
                if (i == 0) {
                    i = Integer.MAX_VALUE;
                }
                this.v5 = i;
                int i2 = Integer.MAX_VALUE & i;
                this.DW = (i2 % (this.Zo.DW.length - 2)) + 1;
                this.j6 = i2 % this.Zo.DW.length;
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 1110043169612655741L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 2649018947827702773L)
        public int Hw() {
            try {
                if (VH) {
                    iy.gn(-1795262040206385024L, this);
                }
                return this.FH;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -1795262040206385024L, this);
                }
                throw th;
            }
        }

        @ey(method = -4149955655371670817L)
        public boolean j6() {
            try {
                if (VH) {
                    iy.gn(4062361068202258368L, this);
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
                    iy.aM(th, 4062361068202258368L, this);
                }
                throw th;
            }
        }

        @ey(method = -2322238979492420073L)
        public int v5() {
            try {
                if (VH) {
                    iy.gn(-3357496083471202848L, this);
                }
                return this.Hw;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -3357496083471202848L, this);
                }
                throw th;
            }
        }

        @ey(method = -75153925334932032L)
        private b(MapOfIntInt mapOfIntInt) {
            try {
                if (VH) {
                    iy.tp(-138991161835729973L, null, mapOfIntInt);
                }
                this.Zo = mapOfIntInt;
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -138991161835729973L, null, mapOfIntInt);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(MapOfIntInt.class);
            if (tp) {
                iy.gn(-1187631115837145472L, null);
            }
            u7 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1187631115837145472L, null);
            }
            throw th;
        }
    }

    @ey(method = -680069041048264107L)
    public MapOfIntInt() {
        a aVar = null;
        try {
            if (tp) {
                iy.gn(-2320650060286383679L, null);
            }
            this.j6 = new b(this, aVar);
            this.gn = 0;
            this.DW = new int[u7[0]];
            this.Hw = new int[u7[0]];
            this.Zo = 0;
            this.VH = 0;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2320650060286383679L, null);
            }
            throw th;
        }
    }

    @ey(method = 113015990092057956L)
    private void EQ() {
        int[] iArr;
        int[] iArr2;
        try {
            if (tp) {
                iy.gn(-76187676909011913L, this);
            }
            if (this.VH * 2 > this.DW.length) {
                int i = this.gn + 1;
                this.gn = i;
                this.FH = null;
                this.v5 = null;
                iArr = new int[u7[i]];
                iArr2 = new int[u7[i]];
            } else if (this.FH == null || this.FH.length != this.DW.length) {
                this.FH = this.DW;
                this.v5 = this.Hw;
                iArr = new int[u7[this.gn]];
                iArr2 = new int[u7[this.gn]];
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
            if (EQ) {
                iy.aM(th, -76187676909011913L, this);
            }
            throw th;
        }
    }

    @ey(method = -3021138133924593275L)
    public void Hw(int i) {
        try {
            if (tp) {
                iy.u7(5686622021455212432L, this, i);
            }
            if (this.Zo > 0) {
                if (this.DW.length >= i) {
                    this.gn = 0;
                    while (u7[this.gn] < i * 2) {
                        this.gn++;
                    }
                    this.DW = new int[u7[this.gn]];
                    this.Hw = new int[u7[this.gn]];
                } else {
                    for (int i2 = 0; i2 < this.DW.length; i2++) {
                        this.DW[i2] = 0;
                    }
                }
                this.Zo = 0;
                this.VH = 0;
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 5686622021455212432L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3629914573445605575L)
    public void J0(int i, int i2) {
        try {
            if (tp) {
                iy.EQ(3850956080653223520L, this, new Integer(i), new Integer(i2));
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i3 = Integer.MAX_VALUE & i;
            int length = i3 % this.DW.length;
            int length2 = (i3 % (this.DW.length - 2)) + 1;
            int i4 = this.DW[length];
            while (i4 != 0) {
                if (i4 == i) {
                    if (this.Hw[length] == i2) {
                        this.DW[length] = Integer.MIN_VALUE;
                        this.VH--;
                    }
                }
                length = (length + length2) % this.DW.length;
                i4 = this.DW[length];
            }
        } finally {
        }
    }

    @ey(method = -1504329621685206656L)
    public int VH(int i) {
        try {
            if (tp) {
                iy.u7(-966755981223307945L, this, i);
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
            if (EQ) {
                iy.j3(th, -966755981223307945L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 946284146779339053L)
    public b Zo() {
        try {
            if (tp) {
                iy.gn(407508767655614952L, this);
            }
            return new b(this, null);
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 407508767655614952L, this);
            }
            throw th;
        }
    }

    @ey(method = -551924387210141412L)
    public void clear() {
        try {
            if (tp) {
                iy.gn(333636021579215961L, this);
            }
            if (this.Zo > 0) {
                for (int i = 0; i < this.DW.length; i++) {
                    this.DW[i] = 0;
                }
                this.Zo = 0;
                this.VH = 0;
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 333636021579215961L, this);
            }
            throw th;
        }
    }

    @ey(method = 3718352169532285484L)
    public void gn(int i, int i2) {
        try {
            if (tp) {
                iy.EQ(-6333112258103675653L, this, new Integer(i), new Integer(i2));
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
                EQ();
            }
        } finally {
        }
    }

    @ey(method = 7374588320114362919L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (tp) {
                iy.tp(7412056296506818320L, this, storeOutputStream);
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
            if (EQ) {
                iy.j3(th, 7412056296506818320L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -2472204810741328617L)
    public String toString() {
        try {
            if (tp) {
                iy.gn(3384168664103562052L, this);
            }
            String str = "{";
            for (int i = 0; i < this.DW.length; i++) {
                int i2 = this.DW[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    int i3 = this.Hw[i];
                    str = i2 == Integer.MAX_VALUE ? str + "0->" + i3 + ", " : str + i2 + "->" + i3 + ", ";
                }
            }
            return str + "}";
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 3384168664103562052L, this);
            }
            throw th;
        }
    }

    @ey(method = 2479840017897828240L)
    public void tp(int i, int i2) {
        try {
            if (tp) {
                iy.EQ(4676563592341575375L, this, new Integer(i), new Integer(i2));
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
                EQ();
            }
        } finally {
        }
    }

    @ey(method = -412133569497376279L)
    public void u7(MapOfIntInt mapOfIntInt) {
        try {
            if (tp) {
                iy.tp(108455174511798600L, this, mapOfIntInt);
            }
            for (int i = 0; i < mapOfIntInt.DW.length; i++) {
                int i2 = mapOfIntInt.DW[i];
                int i3 = mapOfIntInt.Hw[i];
                if (i2 == Integer.MAX_VALUE) {
                    gn(0, i3);
                } else if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    gn(i2, i3);
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 108455174511798600L, this, mapOfIntInt);
            }
            throw th;
        }
    }

    @ey(method = -1042441629696574065L)
    public boolean v5(int i) {
        try {
            if (tp) {
                iy.u7(738290232207132000L, this, i);
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
                iy.j3(th, 738290232207132000L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 31877168303951220L)
    public void we(int i) {
        try {
            if (tp) {
                iy.u7(2007957929180410261L, this, i);
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
                iy.j3(th, 2007957929180410261L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -98221868690354055L)
    public MapOfIntInt(StoreInputStream storeInputStream) {
        a aVar = null;
        try {
            if (tp) {
                iy.tp(1879472473865004525L, null, storeInputStream);
            }
            this.j6 = new b(this, aVar);
            int i = storeInputStream.readInt();
            int i2 = storeInputStream.readInt();
            this.gn = i2;
            this.DW = new int[u7[i2]];
            this.Hw = new int[u7[i2]];
            this.Zo = 0;
            this.VH = 0;
            for (int i3 = 0; i3 < i; i3++) {
                gn(storeInputStream.readInt(), storeInputStream.readInt());
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 1879472473865004525L, null, storeInputStream);
            }
            throw th;
        }
    }
}
