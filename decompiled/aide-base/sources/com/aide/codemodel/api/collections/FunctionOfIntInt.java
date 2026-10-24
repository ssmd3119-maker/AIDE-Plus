package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 95772217110757660L, container = 95772217110757660L, user = true)
/* loaded from: classes.dex */
public class FunctionOfIntInt {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = 2126002160684474835L)
    private static final int[] u7;

    @dy(field = -5486984738910756599L)
    public final Iterator DEFAULT_ITERATOR;

    @dy(field = -2037312517985041296L)
    private int[] FH;

    @dy(field = 2867889084755248912L)
    private int VH;

    @dy(field = -2571690545523984900L)
    private int Zo;

    @dy(field = -980361765276450165L)
    private int gn;

    @dy(field = -807121714505361325L)
    private int[] keys;

    @dy(field = -289234308796077424L)
    private int[] v5;

    @dy(field = 3052385961399230049L)
    private int[] values;

    @cy(clazz = 1407578816107880640L, container = 1407578816107880640L, user = true)
    public class Iterator {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -316453047819561900L)
        private int DW;

        @dy(field = 2949865943764463544L)
        private int FH;

        @dy(field = -1153087435917850717L)
        @hy
        final /* synthetic */ FunctionOfIntInt Hw;

        @dy(field = 2404200489523227639L)
        private int j6;

        static {
            iy.Zo(Iterator.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 362279029777453048L)
        public /* synthetic */ Iterator(FunctionOfIntInt functionOfIntInt, a aVar) {
            this(functionOfIntInt);
            try {
                if (v5) {
                    iy.EQ(1197043873507036117L, null, functionOfIntInt, aVar);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 1197043873507036117L, null, functionOfIntInt, aVar);
                }
                throw th;
            }
        }

        @ey(method = 1625947347147464256L)
        public boolean hasMoreElements() {
            try {
                if (v5) {
                    iy.gn(-1637957197448927667L, this);
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
                    iy.aM(th, -1637957197448927667L, this);
                }
                throw th;
            }
        }

        @ey(method = 1533215454193111920L)
        public void init() {
            try {
                if (v5) {
                    iy.gn(-745745509978116417L, this);
                }
                this.j6 = 0;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -745745509978116417L, this);
                }
                throw th;
            }
        }

        @ey(method = 53447888563415712L)
        public int nextKey() {
            try {
                if (v5) {
                    iy.gn(-2897468489473133625L, this);
                }
                return this.DW;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -2897468489473133625L, this);
                }
                throw th;
            }
        }

        @ey(method = -1225920193542845600L)
        public int nextValue() {
            try {
                if (v5) {
                    iy.gn(806457053736206613L, this);
                }
                return this.FH;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 806457053736206613L, this);
                }
                throw th;
            }
        }

        @ey(method = -513167681218537136L)
        private Iterator(FunctionOfIntInt functionOfIntInt) {
            try {
                if (v5) {
                    iy.tp(758021126854222647L, null, functionOfIntInt);
                }
                this.Hw = functionOfIntInt;
                this.j6 = 0;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 758021126854222647L, null, functionOfIntInt);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(FunctionOfIntInt.class);
            if (tp) {
                iy.gn(-2858449360090685361L, null);
            }
            u7 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2858449360090685361L, null);
            }
            throw th;
        }
    }

    @ey(method = 644652247242248000L)
    public FunctionOfIntInt() {
        a aVar = null;
        try {
            if (tp) {
                iy.gn(1867360243313614000L, null);
            }
            this.DEFAULT_ITERATOR = new Iterator(this, aVar);
            this.gn = 0;
            this.keys = new int[u7[0]];
            this.values = new int[u7[0]];
            this.Zo = 0;
            this.VH = 0;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1867360243313614000L, null);
            }
            throw th;
        }
    }

    @ey(method = 1518135276185350011L)
    private void gn() {
        int[] iArr;
        int[] iArr2;
        try {
            if (tp) {
                iy.gn(-972194276411647472L, this);
            }
            if (this.VH * 2 > this.keys.length) {
                int i = this.gn + 1;
                this.gn = i;
                this.FH = null;
                this.v5 = null;
                iArr = new int[u7[i]];
                iArr2 = new int[u7[i]];
            } else if (this.FH == null || this.FH.length != this.keys.length) {
                this.FH = this.keys;
                this.v5 = this.values;
                iArr = new int[u7[this.gn]];
                iArr2 = new int[u7[this.gn]];
            } else {
                iArr = this.FH;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    iArr[i2] = 0;
                }
                iArr2 = this.v5;
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
                    iArr2[length2] = this.values[i4];
                    i3++;
                }
            }
            this.keys = iArr;
            this.values = iArr2;
            this.Zo = i3;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -972194276411647472L, this);
            }
            throw th;
        }
    }

    @ey(method = -690945613446809600L)
    public boolean Hw(int i) {
        try {
            if (tp) {
                iy.u7(-132923240459956203L, this, i);
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
                iy.j3(th, -132923240459956203L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 6281304549309824605L)
    public void VH(FunctionOfIntInt functionOfIntInt) {
        try {
            if (tp) {
                iy.tp(-2655165627268462200L, this, functionOfIntInt);
            }
            for (int i = 0; i < functionOfIntInt.keys.length; i++) {
                int i2 = functionOfIntInt.keys[i];
                if (i2 == Integer.MAX_VALUE) {
                    Zo(0, functionOfIntInt.values[i]);
                } else if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    Zo(i2, functionOfIntInt.values[i]);
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -2655165627268462200L, this, functionOfIntInt);
            }
            throw th;
        }
    }

    @ey(method = 4710520901365843947L)
    public void Zo(int i, int i2) {
        try {
            if (tp) {
                iy.EQ(-1111929256310396076L, this, new Integer(i), new Integer(i2));
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i3 = Integer.MAX_VALUE & i;
            int length = i3 % this.keys.length;
            int length2 = (i3 % (this.keys.length - 2)) + 1;
            int i4 = this.keys[length];
            int i5 = -1;
            while (i4 != 0) {
                if (i4 == i) {
                    if (this.values[length] == i2) {
                        return;
                    }
                    this.keys[length] = Integer.MIN_VALUE;
                    this.VH--;
                } else if (i4 == Integer.MIN_VALUE) {
                    i5 = length;
                }
                length = (length + length2) % this.keys.length;
                i4 = this.keys[length];
            }
            if (i5 != -1) {
                length = i5;
            }
            this.keys[length] = i;
            this.values[length] = i2;
            this.VH++;
            if (i5 == -1) {
                this.Zo++;
            }
            if (this.Zo * 2 > this.keys.length) {
                gn();
            }
        } finally {
        }
    }

    @ey(method = -2917449083382534011L)
    public void clear() {
        try {
            if (tp) {
                iy.gn(-2292764284742436120L, this);
            }
            if (this.Zo > 0) {
                for (int i = 0; i < this.keys.length; i++) {
                    this.keys[i] = 0;
                }
                this.Zo = 0;
                this.VH = 0;
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2292764284742436120L, this);
            }
            throw th;
        }
    }

    @ey(method = -11289217570365661L)
    public int get(int i) {
        try {
            if (tp) {
                iy.u7(1962993288033778800L, this, i);
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
                    return -1;
                }
                length2 = (length2 + length) % this.keys.length;
                i3 = this.keys[length2];
            }
            return this.values[length2];
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 1962993288033778800L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -153349368935057183L)
    public void remove(int i) {
        try {
            if (tp) {
                iy.u7(1583431444630631120L, this, i);
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
                    this.VH--;
                    return;
                } else {
                    length = (length + length2) % this.keys.length;
                    i3 = this.keys[length];
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 1583431444630631120L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 7917527549428487888L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (tp) {
                iy.tp(-1548330951917096899L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.VH);
            storeOutputStream.writeInt(this.gn);
            for (int i = 0; i < this.keys.length; i++) {
                int i2 = this.keys[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    storeOutputStream.writeInt(this.keys[i]);
                    storeOutputStream.writeInt(this.values[i]);
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -1548330951917096899L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -427845683007087108L)
    public String toString() {
        try {
            if (tp) {
                iy.gn(1219763485420616829L, this);
            }
            String str = "{";
            for (int i = 0; i < this.keys.length; i++) {
                int i2 = this.keys[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    int i3 = this.values[i];
                    str = i2 == Integer.MAX_VALUE ? str + "0->" + i3 + ", " : str + i2 + "->" + i3 + ", ";
                }
            }
            return str + "}";
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1219763485420616829L, this);
            }
            throw th;
        }
    }

    @ey(method = 11910187149934928L)
    public FunctionOfIntInt(StoreInputStream storeInputStream) {
        a aVar = null;
        try {
            if (tp) {
                iy.tp(-4601775707185828384L, null, storeInputStream);
            }
            this.DEFAULT_ITERATOR = new Iterator(this, aVar);
            int i = storeInputStream.readInt();
            int i2 = storeInputStream.readInt();
            this.gn = i2;
            this.keys = new int[u7[i2]];
            this.values = new int[u7[i2]];
            this.Zo = 0;
            this.VH = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Zo(storeInputStream.readInt(), storeInputStream.readInt());
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -4601775707185828384L, null, storeInputStream);
            }
            throw th;
        }
    }
}
