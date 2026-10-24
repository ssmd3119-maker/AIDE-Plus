package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = -1543992954394624407L, container = -1543992954394624407L, user = true)
/* loaded from: classes.dex */
public class OrderedMapOfIntInt {

    @dy(field = -2587937497803357405L)
    private static final int[] EQ;

    @gy
    private static /* synthetic */ boolean J0;

    @fy
    private static /* synthetic */ boolean we;

    @dy(field = 1136445043076218967L)
    private int[] DW;

    @dy(field = 2580826646276370220L)
    private int[] FH;

    @dy(field = 605042638576849697L)
    private int[] Hw;

    @dy(field = 4076127779798960001L)
    private boolean[] VH;

    @dy(field = -1076064967533235848L)
    private boolean[] Zo;

    @dy(field = 5778153435825516641L)
    public final Iterator default_Iterator;

    @dy(field = -1381199163533367424L)
    private int gn;

    @dy(field = -3196701946363682493L)
    private int tp;

    @dy(field = -1984350431107925688L)
    private int u7;

    @dy(field = -3868368789271882440L)
    private int[] v5;

    @cy(clazz = -1172261726263072859L, container = -1172261726263072859L, user = true)
    public class Iterator {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        @dy(field = 2318588401997869795L)
        private int DW;

        @dy(field = -671242871942974581L)
        private int FH;

        @dy(field = 240610530244512429L)
        private int Hw;

        @dy(field = -2712215389709022625L)
        private int VH;

        @dy(field = 412604999736161652L)
        private int Zo;

        @dy(field = -2688152966957032515L)
        @hy
        final /* synthetic */ OrderedMapOfIntInt gn;

        @dy(field = -129236715977998083L)
        private int j6;

        @dy(field = -1876825356943611712L)
        private int v5;

        static {
            iy.Zo(Iterator.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 108052253980376360L)
        public /* synthetic */ Iterator(OrderedMapOfIntInt orderedMapOfIntInt, a aVar) {
            this(orderedMapOfIntInt);
            try {
                if (u7) {
                    iy.EQ(-1182439796024087388L, null, orderedMapOfIntInt, aVar);
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.Mr(th, -1182439796024087388L, null, orderedMapOfIntInt, aVar);
                }
                throw th;
            }
        }

        @ey(method = 5882928320843366357L)
        public void FH(int i) {
            try {
                if (u7) {
                    iy.u7(5194360506659477111L, this, i);
                }
                if (i == 0) {
                    i = Integer.MAX_VALUE;
                }
                this.VH = i;
                int i2 = Integer.MAX_VALUE & i;
                this.DW = (i2 % (this.gn.DW.length - 2)) + 1;
                this.j6 = i2 % this.gn.DW.length;
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, 5194360506659477111L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 69858583358277632L)
        public boolean hasMoreElements() {
            try {
                if (u7) {
                    iy.gn(1975102772116960072L, this);
                }
                if (this.DW == 0) {
                    if (this.Hw == 0) {
                        while (this.j6 < this.gn.DW.length) {
                            this.v5 = this.gn.DW[this.j6];
                            if (!this.gn.Zo[this.j6] && this.v5 != 0 && this.v5 != Integer.MIN_VALUE) {
                                this.Hw = ((this.v5 & Integer.MAX_VALUE) % (this.gn.DW.length - 2)) + 1;
                                this.FH = (this.v5 & Integer.MAX_VALUE) % this.gn.DW.length;
                                this.VH = this.v5;
                                this.j6++;
                                return hasMoreElements();
                            }
                            this.j6++;
                        }
                        return false;
                    }
                    while (true) {
                        int i = this.gn.DW[this.FH];
                        this.v5 = i;
                        if (i == 0) {
                            this.Hw = 0;
                            return hasMoreElements();
                        }
                        if (i == this.VH) {
                            if (i == Integer.MAX_VALUE) {
                                this.v5 = 0;
                            }
                            this.Zo = this.gn.Hw[this.FH];
                            this.FH = (this.FH + this.Hw) % this.gn.DW.length;
                            return true;
                        }
                        this.FH = (this.FH + this.Hw) % this.gn.DW.length;
                    }
                } else {
                    if (this.DW == -1) {
                        while (this.j6 < this.gn.DW.length) {
                            int i2 = this.gn.DW[this.j6];
                            this.v5 = i2;
                            if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                                if (i2 == Integer.MAX_VALUE) {
                                    this.v5 = 0;
                                }
                                this.Zo = this.gn.Hw[this.j6];
                                this.j6++;
                                return true;
                            }
                            this.j6++;
                        }
                        return false;
                    }
                    while (true) {
                        int i3 = this.gn.DW[this.j6];
                        this.v5 = i3;
                        if (i3 == 0) {
                            return false;
                        }
                        if (i3 == this.VH) {
                            if (i3 == Integer.MAX_VALUE) {
                                this.v5 = 0;
                            }
                            this.Zo = this.gn.Hw[this.j6];
                            this.j6 = (this.j6 + this.DW) % this.gn.DW.length;
                            return true;
                        }
                        this.j6 = (this.j6 + this.DW) % this.gn.DW.length;
                    }
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, 1975102772116960072L, this);
                }
                throw th;
            }
        }

        @ey(method = 2622999109616512880L)
        public void init() {
            try {
                if (u7) {
                    iy.gn(-1010149703108057224L, this);
                }
                if (this.gn.Zo == null) {
                    this.j6 = 0;
                    this.DW = -1;
                } else {
                    this.j6 = 0;
                    this.DW = 0;
                    this.Hw = 0;
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -1010149703108057224L, this);
                }
                throw th;
            }
        }

        @ey(method = 1275934897078572368L)
        public int nextKey() {
            try {
                if (u7) {
                    iy.gn(2451844941997578368L, this);
                }
                return this.v5;
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, 2451844941997578368L, this);
                }
                throw th;
            }
        }

        @ey(method = -4104022402654825888L)
        public int nextValue() {
            try {
                if (u7) {
                    iy.gn(1217273712896048584L, this);
                }
                return this.Zo;
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, 1217273712896048584L, this);
                }
                throw th;
            }
        }

        @ey(method = 10082924444227584L)
        private Iterator(OrderedMapOfIntInt orderedMapOfIntInt) {
            try {
                if (u7) {
                    iy.tp(490665124029529080L, null, orderedMapOfIntInt);
                }
                this.gn = orderedMapOfIntInt;
                if (orderedMapOfIntInt.Zo == null) {
                    this.j6 = 0;
                    this.DW = -1;
                } else {
                    this.j6 = 0;
                    this.DW = 0;
                    this.Hw = 0;
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, 490665124029529080L, null, orderedMapOfIntInt);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(OrderedMapOfIntInt.class);
            if (we) {
                iy.gn(-3023538564116819091L, null);
            }
            EQ = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -3023538564116819091L, null);
            }
            throw th;
        }
    }

    @ey(method = 1338253414555536096L)
    public OrderedMapOfIntInt() {
        a aVar = null;
        try {
            if (we) {
                iy.gn(-3263088879947625495L, null);
            }
            this.default_Iterator = new Iterator(this, aVar);
            this.tp = 0;
            this.DW = new int[EQ[0]];
            this.Hw = new int[EQ[0]];
            this.gn = 0;
            this.u7 = 0;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -3263088879947625495L, null);
            }
            throw th;
        }
    }

    @ey(method = 2174839034717154793L)
    private void u7() {
        int[] iArr;
        int[] iArr2;
        int i;
        try {
            if (we) {
                iy.gn(290648961392101376L, this);
            }
            boolean[] zArr = null;
            int i2 = 0;
            if (this.u7 * 2 > this.DW.length) {
                int i3 = this.tp + 1;
                this.tp = i3;
                this.FH = null;
                this.v5 = null;
                this.VH = null;
                iArr = new int[EQ[i3]];
                iArr2 = new int[EQ[i3]];
                if (this.Zo != null) {
                    zArr = new boolean[EQ[i3]];
                }
            } else if (this.FH == null || this.FH.length != this.DW.length) {
                this.FH = this.DW;
                this.v5 = this.Hw;
                this.VH = this.Zo;
                iArr = new int[EQ[this.tp]];
                iArr2 = new int[EQ[this.tp]];
                if (this.Zo != null) {
                    zArr = new boolean[EQ[this.tp]];
                }
            } else {
                iArr = this.FH;
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    iArr[i4] = 0;
                }
                if (this.VH != null) {
                    zArr = this.VH;
                    for (int i5 = 0; i5 < zArr.length; i5++) {
                        zArr[i5] = false;
                    }
                }
                iArr2 = this.v5;
                this.FH = this.DW;
                this.v5 = this.Hw;
                this.VH = this.Zo;
            }
            int i6 = Integer.MAX_VALUE;
            if (this.Zo == null) {
                i = 0;
                while (i2 < this.DW.length) {
                    int i7 = this.DW[i2];
                    if (i7 != 0 && i7 != Integer.MIN_VALUE) {
                        int i8 = i7 & Integer.MAX_VALUE;
                        int length = (i8 % (iArr.length - 2)) + 1;
                        int length2 = i8 % iArr.length;
                        while (iArr[length2] != 0) {
                            length2 = (length2 + length) % iArr.length;
                        }
                        iArr[length2] = i7;
                        iArr2[length2] = this.Hw[i2];
                        i++;
                    }
                    i2++;
                }
            } else {
                i = 0;
                while (i2 < this.DW.length) {
                    int i9 = this.DW[i2];
                    if (i9 != 0 && i9 != Integer.MIN_VALUE) {
                        int i10 = i9 & i6;
                        int length3 = (i10 % (iArr.length - 2)) + 1;
                        int length4 = i10 % iArr.length;
                        if (!this.Zo[i2]) {
                            while (iArr[length4] != 0) {
                                length4 = (length4 + length3) % iArr.length;
                            }
                            iArr[length4] = i9;
                            iArr2[length4] = this.Hw[i2];
                            i++;
                            int length5 = (i10 % (this.DW.length - 2)) + 1;
                            int length6 = i10 % this.DW.length;
                            while (this.DW[length6] != 0) {
                                if (this.DW[length6] == i9 && length6 != i2) {
                                    while (iArr[length4] != 0) {
                                        length4 = (length4 + length3) % iArr.length;
                                    }
                                    iArr[length4] = i9;
                                    iArr2[length4] = this.Hw[length6];
                                    if (zArr != null) {
                                        zArr[length4] = true;
                                    }
                                    i++;
                                }
                                length6 = (length6 + length5) % this.DW.length;
                            }
                        }
                    }
                    i2++;
                    i6 = Integer.MAX_VALUE;
                }
            }
            this.Zo = zArr;
            this.DW = iArr;
            this.Hw = iArr2;
            this.gn = i;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 290648961392101376L, this);
            }
            throw th;
        }
    }

    @ey(method = 266436698250429L)
    public void VH(int i, int i2) {
        try {
            if (we) {
                iy.EQ(2291886926785779840L, this, new Integer(i), new Integer(i2));
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i3 = Integer.MAX_VALUE & i;
            int length = i3 % this.DW.length;
            int length2 = (i3 % (this.DW.length - 2)) + 1;
            boolean z = false;
            int i4 = this.DW[length];
            while (i4 != 0) {
                if (i4 == i) {
                    if (this.Hw[length] == i2) {
                        return;
                    } else {
                        z = true;
                    }
                }
                length = (length + length2) % this.DW.length;
                i4 = this.DW[length];
            }
            this.DW[length] = i;
            this.Hw[length] = i2;
            if (z) {
                if (this.Zo == null) {
                    this.Zo = new boolean[this.DW.length];
                }
                this.Zo[length] = true;
            }
            this.u7++;
            int i5 = this.gn + 1;
            this.gn = i5;
            if (i5 * 2 > this.DW.length) {
                u7();
            }
        } finally {
        }
    }

    @ey(method = 1143676712897118205L)
    public boolean Zo(int i, int i2) {
        try {
            if (we) {
                iy.EQ(1459903321427327964L, this, new Integer(i), new Integer(i2));
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i3 = Integer.MAX_VALUE & i;
            int length = i3 % this.DW.length;
            int length2 = (i3 % (this.DW.length - 2)) + 1;
            int i4 = this.DW[length];
            while (true) {
                if (i4 == i) {
                    if (this.Hw[length] == i2) {
                        return true;
                    }
                }
                if (i4 == 0) {
                    return false;
                }
                length = (length + length2) % this.DW.length;
                i4 = this.DW[length];
            }
        } finally {
        }
    }

    @ey(method = 1539119097982213103L)
    public void clear() {
        try {
            if (we) {
                iy.gn(-2803807778386206000L, this);
            }
            if (this.gn > 0) {
                for (int i = 0; i < this.DW.length; i++) {
                    this.DW[i] = 0;
                }
                if (this.Zo != null) {
                    for (int i2 = 0; i2 < this.Zo.length; i2++) {
                        this.Zo[i2] = false;
                    }
                }
                this.gn = 0;
                this.u7 = 0;
            }
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -2803807778386206000L, this);
            }
            throw th;
        }
    }

    @ey(method = 671885113408385553L)
    public void gn(int i, int i2) {
        try {
            if (we) {
                iy.EQ(1110452733459219840L, this, new Integer(i), new Integer(i2));
            }
            remove(i);
            VH(i, i2);
        } catch (Throwable th) {
            if (J0) {
                iy.Mr(th, 1110452733459219840L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 204884229220808227L)
    public void remove(int i) {
        try {
            if (we) {
                iy.u7(7508969503368736L, this, i);
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
                    this.u7--;
                }
                length = (length + length2) % this.DW.length;
                i3 = this.DW[length];
            }
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, 7508969503368736L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4550416109022129004L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (we) {
                iy.tp(-6551306810059081113L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.u7);
            storeOutputStream.writeInt(this.gn);
            storeOutputStream.writeInt(this.tp);
            for (int i = 0; i < this.DW.length; i++) {
                storeOutputStream.writeInt(this.DW[i]);
            }
            for (int i2 = 0; i2 < this.Hw.length; i2++) {
                storeOutputStream.writeInt(this.Hw[i2]);
            }
            storeOutputStream.writeBoolean(this.Zo != null);
            if (this.Zo != null) {
                for (int i3 = 0; i3 < this.Zo.length; i3++) {
                    storeOutputStream.writeBoolean(this.Zo[i3]);
                }
            }
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, -6551306810059081113L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 465584558672137960L)
    public String toString() {
        try {
            if (we) {
                iy.gn(1885160515756819635L, this);
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
            if (J0) {
                iy.aM(th, 1885160515756819635L, this);
            }
            throw th;
        }
    }

    @ey(method = -645278643326384548L)
    public boolean v5(int i) {
        try {
            if (we) {
                iy.u7(912004247739662239L, this, i);
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
            if (J0) {
                iy.j3(th, 912004247739662239L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 51465367889015444L)
    public OrderedMapOfIntInt(StoreInputStream storeInputStream) {
        a aVar = null;
        try {
            if (we) {
                iy.tp(2674107443854280917L, null, storeInputStream);
            }
            this.default_Iterator = new Iterator(this, aVar);
            this.u7 = storeInputStream.readInt();
            this.gn = storeInputStream.readInt();
            int i = storeInputStream.readInt();
            this.tp = i;
            this.DW = new int[EQ[i]];
            for (int i2 = 0; i2 < this.DW.length; i2++) {
                this.DW[i2] = storeInputStream.readInt();
            }
            this.Hw = new int[EQ[this.tp]];
            for (int i3 = 0; i3 < this.Hw.length; i3++) {
                this.Hw[i3] = storeInputStream.readInt();
            }
            if (storeInputStream.readBoolean()) {
                this.Zo = new boolean[EQ[this.tp]];
                for (int i4 = 0; i4 < this.Zo.length; i4++) {
                    this.Zo[i4] = storeInputStream.readBoolean();
                }
            }
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, 2674107443854280917L, null, storeInputStream);
            }
            throw th;
        }
    }
}
