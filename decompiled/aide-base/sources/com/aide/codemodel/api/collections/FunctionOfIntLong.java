package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 483982438163401119L, container = 483982438163401119L, user = true)
/* loaded from: classes.dex */
public class FunctionOfIntLong {

    @gy
    private static /* synthetic */ boolean EQ;

    @dy(field = 2011319480021454349L)
    private static final int[] SIZES;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = -687315710583601920L)
    private int[] FH;

    @dy(field = 2712428502396787356L)
    private int count;

    @dy(field = 318308173134131985L)
    private int gn;

    @dy(field = -3470514567604624385L)
    public final b j6;

    @dy(field = -2447689460883713475L)
    private int[] keys;

    @dy(field = -2408022250435286760L)
    private int slots;

    @dy(field = -3569422490369198304L)
    private long[] v5;

    @dy(field = -2911025633552703557L)
    private long[] values;

    @cy(clazz = -6228195955688894157L, container = -6228195955688894157L, user = true)
    public class b {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = 2048093012653439763L)
        private int DW;

        @dy(field = -3075940734409597743L)
        private long FH;

        @dy(field = -461264305678087768L)
        @hy
        final /* synthetic */ FunctionOfIntLong Hw;

        @dy(field = 2860609711039032876L)
        private int j6;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -402712850378500941L)
        public /* synthetic */ b(FunctionOfIntLong functionOfIntLong, a aVar) {
            this(functionOfIntLong);
            try {
                if (v5) {
                    iy.EQ(-138335932566967577L, null, functionOfIntLong, aVar);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -138335932566967577L, null, functionOfIntLong, aVar);
                }
                throw th;
            }
        }

        @ey(method = -2525993075230147553L)
        public void DW() {
            try {
                if (v5) {
                    iy.gn(-2180942161532509629L, this);
                }
                this.j6 = 0;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -2180942161532509629L, this);
                }
                throw th;
            }
        }

        @ey(method = 941865489479234755L)
        public int FH() {
            try {
                if (v5) {
                    iy.gn(1934960413379984739L, this);
                }
                return this.DW;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 1934960413379984739L, this);
                }
                throw th;
            }
        }

        @ey(method = -1827909564884931363L)
        public long Hw() {
            try {
                if (v5) {
                    iy.gn(-1047476672979618543L, this);
                }
                return this.FH;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -1047476672979618543L, this);
                }
                throw th;
            }
        }

        @ey(method = -1204115964272167675L)
        public boolean j6() {
            try {
                if (v5) {
                    iy.gn(-4779133786077094967L, this);
                }
                while (this.j6 < this.Hw.keys.length) {
                    int i = this.Hw.keys[this.j6];
                    this.DW = i;
                    if (i != 0 && i != Integer.MIN_VALUE) {
                        if (i == Integer.MAX_VALUE) {
                            this.DW = 0;
                        }
                        this.FH = this.Hw.values[this.j6];
                        this.j6++;
                        return true;
                    }
                    this.j6++;
                }
                return false;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -4779133786077094967L, this);
                }
                throw th;
            }
        }

        @ey(method = 4488093184691969776L)
        private b(FunctionOfIntLong functionOfIntLong) {
            try {
                if (v5) {
                    iy.tp(-376979218547606664L, null, functionOfIntLong);
                }
                this.Hw = functionOfIntLong;
                this.j6 = 0;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -376979218547606664L, null, functionOfIntLong);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(FunctionOfIntLong.class);
            if (tp) {
                iy.gn(-422871345685057521L, null);
            }
            SIZES = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -422871345685057521L, null);
            }
            throw th;
        }
    }

    @ey(method = -2149915104793008784L)
    public FunctionOfIntLong() {
        a aVar = null;
        try {
            if (tp) {
                iy.gn(740615441934873153L, null);
            }
            this.j6 = new b(this, aVar);
            this.gn = 0;
            this.keys = new int[SIZES[0]];
            this.values = new long[SIZES[0]];
            this.slots = 0;
            this.count = 0;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 740615441934873153L, null);
            }
            throw th;
        }
    }

    @ey(method = -1361748959151395937L)
    private void gn() {
        int[] iArr;
        long[] jArr;
        try {
            if (tp) {
                iy.gn(612924053988698296L, this);
            }
            if (this.count * 2 > this.keys.length) {
                int i = this.gn + 1;
                this.gn = i;
                this.FH = null;
                this.v5 = null;
                iArr = new int[SIZES[i]];
                jArr = new long[SIZES[i]];
            } else if (this.FH == null || this.FH.length != this.keys.length) {
                this.FH = this.keys;
                this.v5 = this.values;
                iArr = new int[SIZES[this.gn]];
                jArr = new long[SIZES[this.gn]];
            } else {
                iArr = this.FH;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    iArr[i2] = 0;
                }
                jArr = this.v5;
                this.FH = this.keys;
                this.v5 = this.values;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.keys.length; i4++) {
                int i5 = this.keys[i4];
                if (i5 != 0 && i5 != Integer.MIN_VALUE) {
                    int i6 = Integer.MAX_VALUE & i5;
                    int length = (i6 % (iArr.length - 2)) + 1;
                    int length2 = i6 % iArr.length;
                    while (iArr[length2] != 0) {
                        length2 = (length2 + length) % iArr.length;
                    }
                    iArr[length2] = i5;
                    jArr[length2] = this.values[i4];
                    i3++;
                }
            }
            this.keys = iArr;
            this.values = jArr;
            this.slots = i3;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 612924053988698296L, this);
            }
            throw th;
        }
    }

    @ey(method = 723942373180377976L)
    public boolean Hw(int i) {
        try {
            if (tp) {
                iy.u7(-77332215437452723L, this, i);
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = (i2 % (this.keys.length - 2)) + 1;
            int length2 = i2 % this.keys.length;
            int i3 = this.keys[length2];
            while (i3 != i) {
                if (i3 == 0) {
                    return false;
                }
                length2 = (length2 + length) % this.keys.length;
                i3 = this.keys[length2];
            }
            return true;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -77332215437452723L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 505475816549461489L)
    public void clear() {
        try {
            if (tp) {
                iy.gn(-965367383885918272L, this);
            }
            if (this.slots > 0) {
                for (int i = 0; i < this.keys.length; i++) {
                    this.keys[i] = 0;
                }
                this.slots = 0;
                this.count = 0;
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -965367383885918272L, this);
            }
            throw th;
        }
    }

    @ey(method = 4090188857303942939L)
    public void put(int i, long j) {
        try {
            if (tp) {
                iy.EQ(2977960676241144600L, this, new Integer(i), new Long(j));
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = i2 % this.keys.length;
            int length2 = (i2 % (this.keys.length - 2)) + 1;
            int i3 = this.keys[length];
            int i4 = -1;
            while (i3 != 0) {
                if (i3 == i) {
                    if (this.values[length] == j) {
                        return;
                    }
                    this.keys[length] = Integer.MIN_VALUE;
                    this.count--;
                } else if (i3 == Integer.MIN_VALUE) {
                    i4 = length;
                }
                length = (length + length2) % this.keys.length;
                i3 = this.keys[length];
            }
            if (i4 != -1) {
                length = i4;
            }
            this.keys[length] = i;
            this.values[length] = j;
            this.count++;
            if (i4 == -1) {
                this.slots++;
            }
            if (this.slots * 2 > this.keys.length) {
                gn();
            }
        } finally {
        }
    }

    @ey(method = -6707790626796795620L)
    public void put(FunctionOfIntLong functionOfIntLong) {
        try {
            if (tp) {
                iy.tp(1410437567098360101L, this, functionOfIntLong);
            }
            for (int i = 0; i < functionOfIntLong.keys.length; i++) {
                int i2 = functionOfIntLong.keys[i];
                if (i2 == Integer.MAX_VALUE) {
                    put(0, functionOfIntLong.values[i]);
                } else if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    put(i2, functionOfIntLong.values[i]);
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 1410437567098360101L, this, functionOfIntLong);
            }
            throw th;
        }
    }

    @ey(method = 91827985936802141L)
    public void remove(int i) {
        try {
            if (tp) {
                iy.u7(-8097312349795307280L, this, i);
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = i2 % this.keys.length;
            int length2 = (i2 % (this.keys.length - 2)) + 1;
            int i3 = this.keys[length];
            while (i3 != 0) {
                if (i3 == i) {
                    this.keys[length] = Integer.MIN_VALUE;
                    this.count--;
                    return;
                } else {
                    length = (length + length2) % this.keys.length;
                    i3 = this.keys[length];
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -8097312349795307280L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2344555274073215800L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (tp) {
                iy.tp(7431344192247592677L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.count);
            storeOutputStream.writeInt(this.gn);
            for (int i = 0; i < this.keys.length; i++) {
                int i2 = this.keys[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    storeOutputStream.writeInt(this.keys[i]);
                    storeOutputStream.writeLong(this.values[i]);
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 7431344192247592677L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 711969756052344564L)
    public String toString() {
        try {
            if (tp) {
                iy.gn(-2662724277264221775L, this);
            }
            String str = "{";
            for (int i = 0; i < this.keys.length; i++) {
                int i2 = this.keys[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    long j = this.values[i];
                    str = i2 == Integer.MAX_VALUE ? str + "0->" + j + ", " : str + i2 + "->" + j + ", ";
                }
            }
            return str + "}";
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2662724277264221775L, this);
            }
            throw th;
        }
    }

    @ey(method = 1708049998026146703L)
    public long v5(int i) {
        try {
            if (tp) {
                iy.u7(-2780237577044598640L, this, i);
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = (i2 % (this.keys.length - 2)) + 1;
            int length2 = i2 % this.keys.length;
            int i3 = this.keys[length2];
            while (i3 != i) {
                if (i3 == 0) {
                    return -1L;
                }
                length2 = (length2 + length) % this.keys.length;
                i3 = this.keys[length2];
            }
            return this.values[length2];
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -2780237577044598640L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -142031969500820840L)
    public FunctionOfIntLong(StoreInputStream storeInputStream) {
        a aVar = null;
        try {
            if (tp) {
                iy.tp(64161204358636461L, null, storeInputStream);
            }
            this.j6 = new b(this, aVar);
            int i = storeInputStream.readInt();
            int i2 = storeInputStream.readInt();
            this.gn = i2;
            this.keys = new int[SIZES[i2]];
            this.values = new long[SIZES[i2]];
            this.slots = 0;
            this.count = 0;
            for (int i3 = 0; i3 < i; i3++) {
                put(storeInputStream.readInt(), storeInputStream.readLong());
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 64161204358636461L, null, storeInputStream);
            }
            throw th;
        }
    }
}
