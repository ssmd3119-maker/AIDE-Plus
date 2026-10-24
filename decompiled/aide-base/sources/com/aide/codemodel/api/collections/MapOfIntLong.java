package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 3659322688218762075L, container = 3659322688218762075L, user = true)
/* loaded from: classes.dex */
public class MapOfIntLong {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = -2275320006339553467L)
    private static final int[] u7;

    @dy(field = 2139040437303671929L)
    private int[] DW;

    @dy(field = -283292406876403128L)
    private int[] FH;

    @dy(field = -2446175920963666885L)
    private long[] Hw;

    @dy(field = -1617592964811371808L)
    private int VH;

    @dy(field = -972234468924051760L)
    private int Zo;

    @dy(field = -4946125479808392385L)
    public final Iterator default_Iterator;

    @dy(field = 786691153589216409L)
    private int gn;

    @dy(field = 2892985364442350492L)
    private long[] v5;

    @cy(clazz = 2776620608827402095L, container = 2776620608827402095L, user = true)
    public class Iterator {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 733336819445981124L)
        private int DW;

        @dy(field = -2455928137690763853L)
        private int FH;

        @dy(field = 510401075817958521L)
        private long Hw;

        @dy(field = 1572069533265732928L)
        @hy
        final /* synthetic */ MapOfIntLong Zo;

        @dy(field = 1272651770239836L)
        private int j6;

        @dy(field = 1577189990889793104L)
        private int v5;

        static {
            iy.Zo(Iterator.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -242681674397158953L)
        public /* synthetic */ Iterator(MapOfIntLong mapOfIntLong, a aVar) {
            this(mapOfIntLong);
            try {
                if (VH) {
                    iy.EQ(1243161846285260265L, null, mapOfIntLong, aVar);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, 1243161846285260265L, null, mapOfIntLong, aVar);
                }
                throw th;
            }
        }

        @ey(method = -4520985294199165625L)
        public boolean hasMoreElements() {
            try {
                if (VH) {
                    iy.gn(724731773040276897L, this);
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
                    iy.aM(th, 724731773040276897L, this);
                }
                throw th;
            }
        }

        @ey(method = -1441745596445786787L)
        public void init() {
            try {
                if (VH) {
                    iy.gn(683785028023098507L, this);
                }
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 683785028023098507L, this);
                }
                throw th;
            }
        }

        @ey(method = 661543509306814677L)
        public int nextKey() {
            try {
                if (VH) {
                    iy.gn(-1034110458154151253L, this);
                }
                return this.FH;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -1034110458154151253L, this);
                }
                throw th;
            }
        }

        @ey(method = -1974193071115407777L)
        public long nextValue() {
            try {
                if (VH) {
                    iy.gn(-2309561034054458199L, this);
                }
                return this.Hw;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -2309561034054458199L, this);
                }
                throw th;
            }
        }

        @ey(method = -31854801244726816L)
        private Iterator(MapOfIntLong mapOfIntLong) {
            try {
                if (VH) {
                    iy.tp(-450109477765826860L, null, mapOfIntLong);
                }
                this.Zo = mapOfIntLong;
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -450109477765826860L, null, mapOfIntLong);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(MapOfIntLong.class);
            if (tp) {
                iy.gn(-95072509845511200L, null);
            }
            u7 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -95072509845511200L, null);
            }
            throw th;
        }
    }

    @ey(method = 1764439457197218048L)
    public MapOfIntLong() {
        a aVar = null;
        try {
            if (tp) {
                iy.gn(-2304525454521607800L, null);
            }
            this.default_Iterator = new Iterator(this, aVar);
            this.gn = 0;
            this.DW = new int[u7[0]];
            this.Hw = new long[u7[0]];
            this.Zo = 0;
            this.VH = 0;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2304525454521607800L, null);
            }
            throw th;
        }
    }

    @ey(method = 2657566117398320421L)
    private void gn() {
        int[] iArr;
        long[] jArr;
        try {
            if (tp) {
                iy.gn(-565565878588757287L, this);
            }
            if (this.VH * 2 > this.DW.length) {
                int i = this.gn + 1;
                this.gn = i;
                this.FH = null;
                this.v5 = null;
                iArr = new int[u7[i]];
                jArr = new long[u7[i]];
            } else if (this.FH == null || this.FH.length != this.DW.length) {
                this.FH = this.DW;
                this.v5 = this.Hw;
                iArr = new int[u7[this.gn]];
                jArr = new long[u7[this.gn]];
            } else {
                iArr = this.FH;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    iArr[i2] = 0;
                }
                jArr = this.v5;
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
                    jArr[length2] = this.Hw[i4];
                    i3++;
                }
            }
            this.DW = iArr;
            this.Hw = jArr;
            this.Zo = i3;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -565565878588757287L, this);
            }
            throw th;
        }
    }

    @ey(method = -1318293730343270493L)
    public void FH() {
        try {
            if (tp) {
                iy.gn(2431355369120097071L, this);
            }
            if (this.Zo > 0) {
                for (int i = 0; i < this.DW.length; i++) {
                    this.DW[i] = 0;
                }
                for (int i2 = 0; i2 < this.Hw.length; i2++) {
                    this.Hw[i2] = 0;
                }
                this.Zo = 0;
                this.VH = 0;
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 2431355369120097071L, this);
            }
            throw th;
        }
    }

    @ey(method = 849898211334121572L)
    public boolean Hw(int i) {
        try {
            if (tp) {
                iy.u7(988890967189256640L, this, i);
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
                iy.j3(th, 988890967189256640L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 618187718634624005L)
    public void VH(int i, long j) {
        try {
            if (tp) {
                iy.EQ(286905547438170025L, this, new Integer(i), new Long(j));
            }
            remove(i);
            Zo(i, j);
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 286905547438170025L, this, new Integer(i), new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -667049853282894399L)
    public void Zo(int i, long j) {
        try {
            if (tp) {
                iy.EQ(2316729831846393L, this, new Integer(i), new Long(j));
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
                    if (this.Hw[length] == j) {
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
            this.Hw[length] = j;
            this.VH++;
            if (i4 == -1) {
                this.Zo++;
            }
            if (this.Zo * 2 > this.DW.length) {
                gn();
            }
        } finally {
        }
    }

    @ey(method = -166751854216552201L)
    public void remove(int i) {
        try {
            if (tp) {
                iy.u7(-6746725027039578373L, this, i);
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
                iy.j3(th, -6746725027039578373L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -8334851000962076780L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (tp) {
                iy.tp(-3064738974656993920L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.VH);
            storeOutputStream.writeInt(this.Zo);
            storeOutputStream.writeInt(this.gn);
            for (int i = 0; i < this.DW.length; i++) {
                storeOutputStream.writeInt(this.DW[i]);
            }
            for (int i2 = 0; i2 < this.Hw.length; i2++) {
                storeOutputStream.writeLong(this.Hw[i2]);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -3064738974656993920L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -3361931834747237128L)
    public String toString() {
        try {
            if (tp) {
                iy.gn(-2492727991359498064L, this);
            }
            return getClass().getName() + "[Size=" + this.VH + "]";
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2492727991359498064L, this);
            }
            throw th;
        }
    }

    @ey(method = -7828663634196153855L)
    public long v5(int i) {
        try {
            if (tp) {
                iy.u7(6486143246431260125L, this, i);
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
                    return -1L;
                }
                length2 = (length2 + length) % this.DW.length;
                i3 = this.DW[length2];
            }
            return this.Hw[length2];
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 6486143246431260125L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 67699026839889068L)
    public MapOfIntLong(StoreInputStream storeInputStream) {
        a aVar = null;
        try {
            if (tp) {
                iy.tp(2973664881823939072L, null, storeInputStream);
            }
            this.default_Iterator = new Iterator(this, aVar);
            this.VH = storeInputStream.readInt();
            this.Zo = storeInputStream.readInt();
            int i = storeInputStream.readInt();
            this.gn = i;
            this.DW = new int[u7[i]];
            for (int i2 = 0; i2 < this.DW.length; i2++) {
                this.DW[i2] = storeInputStream.readInt();
            }
            this.Hw = new long[u7[this.gn]];
            for (int i3 = 0; i3 < this.Hw.length; i3++) {
                this.Hw[i3] = storeInputStream.readLong();
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 2973664881823939072L, null, storeInputStream);
            }
            throw th;
        }
    }
}
