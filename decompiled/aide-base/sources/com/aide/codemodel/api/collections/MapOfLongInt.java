package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = -4539247182517018205L, container = -4539247182517018205L, user = true)
/* loaded from: classes.dex */
public class MapOfLongInt {

    @dy(field = -3105261584004538535L)
    private static final int[] gn;

    @gy
    private static /* synthetic */ boolean tp;

    @fy
    private static /* synthetic */ boolean u7;

    @dy(field = -295899937856454888L)
    private long[] DW;

    @dy(field = 2641644404607903711L)
    private int[] FH;

    @dy(field = -430888391209984172L)
    private int[] Hw;

    @dy(field = 839709177539218629L)
    private int VH;

    @dy(field = -2412766364248464000L)
    private int Zo;

    @dy(field = 909678957481581749L)
    private long[] j6;

    @dy(field = -1725515930123346312L)
    private int v5;

    @cy(clazz = 400920452278172695L, container = 400920452278172695L, user = true)
    public class b {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -4684209671589080571L)
        public /* synthetic */ b(MapOfLongInt mapOfLongInt, a aVar) {
            this(mapOfLongInt);
            try {
                if (j6) {
                    iy.EQ(86746765712196159L, null, mapOfLongInt, aVar);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.Mr(th, 86746765712196159L, null, mapOfLongInt, aVar);
                }
                throw th;
            }
        }

        @ey(method = -165119742805953015L)
        private b(MapOfLongInt mapOfLongInt) {
            try {
                if (j6) {
                    iy.tp(763482911649096663L, null, mapOfLongInt);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 763482911649096663L, null, mapOfLongInt);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(MapOfLongInt.class);
            if (u7) {
                iy.gn(-463736038517153425L, null);
            }
            gn = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -463736038517153425L, null);
            }
            throw th;
        }
    }

    @ey(method = 190815065886326200L)
    public MapOfLongInt() {
        a aVar = null;
        try {
            if (u7) {
                iy.gn(-2138963765610002295L, null);
            }
            new b(this, aVar);
            this.VH = 0;
            this.j6 = new long[gn[0]];
            this.FH = new int[gn[0]];
            this.v5 = 0;
            this.Zo = 0;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -2138963765610002295L, null);
            }
            throw th;
        }
    }

    @ey(method = 1119863829305088363L)
    private void u7() {
        long[] jArr;
        int[] iArr;
        try {
            if (u7) {
                iy.gn(1597939349583119840L, this);
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
                iy.aM(th, 1597939349583119840L, this);
            }
            throw th;
        }
    }

    @ey(method = -2537007631987340677L)
    public boolean DW(int i, int i2) {
        try {
            if (u7) {
                iy.EQ(1254770687444558424L, this, new Integer(i), new Integer(i2));
            }
            return FH((i << 32) | i2);
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, 1254770687444558424L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1036492567776138624L)
    public boolean FH(long j) {
        try {
            if (u7) {
                iy.tp(-1295537802859789331L, this, new Long(j));
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
                iy.j3(th, -1295537802859789331L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -2251690457564369536L)
    public int Hw(int i, int i2) {
        try {
            if (u7) {
                iy.EQ(-3309048933238468945L, this, new Integer(i), new Integer(i2));
            }
            return v5((i << 32) | i2);
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -3309048933238468945L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -12497297955602292L)
    public void VH(int i, int i2, int i3) {
        try {
            if (u7) {
                iy.we(-5944588731342560115L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            gn((i << 32) | i2, i3);
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, -5944588731342560115L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 1108947331329809829L)
    public void Zo(long j, int i) {
        try {
            if (u7) {
                iy.EQ(-225338381748270000L, this, new Long(j), new Integer(i));
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
                } else if (j3 == -2147483648L) {
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
                u7();
            }
        } finally {
        }
    }

    @ey(method = 7452558146435462853L)
    public void gn(long j, int i) {
        try {
            if (u7) {
                iy.EQ(3467374853702376924L, this, new Long(j), new Integer(i));
            }
            tp(j);
            Zo(j, i);
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, 3467374853702376924L, this, new Long(j), new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 95563656193376872L)
    public void j6(int i) {
        try {
            if (u7) {
                iy.u7(-4234538833608172881L, this, i);
            }
            if (this.v5 > 0) {
                if (this.j6.length >= i) {
                    this.VH = 0;
                    while (gn[this.VH] < i * 2) {
                        this.VH++;
                    }
                    this.j6 = new long[gn[this.VH]];
                    this.FH = new int[gn[this.VH]];
                } else {
                    for (int i2 = 0; i2 < this.j6.length; i2++) {
                        this.j6[i2] = 0;
                    }
                }
                this.v5 = 0;
                this.Zo = 0;
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -4234538833608172881L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4731460270918245200L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (u7) {
                iy.tp(-782408673491432715L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.Zo);
            storeOutputStream.writeInt(this.v5);
            storeOutputStream.writeInt(this.VH);
            for (int i = 0; i < this.j6.length; i++) {
                storeOutputStream.writeLong(this.j6[i]);
            }
            for (int i2 = 0; i2 < this.FH.length; i2++) {
                storeOutputStream.writeInt(this.FH[i2]);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -782408673491432715L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 3961217499543209792L)
    public String toString() {
        try {
            if (u7) {
                iy.gn(-2968870889585594119L, this);
            }
            return getClass().getName() + "[Size=" + this.Zo + "]";
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -2968870889585594119L, this);
            }
            throw th;
        }
    }

    @ey(method = 836180270466389737L)
    public void tp(long j) {
        try {
            if (u7) {
                iy.tp(295247275176219380L, this, new Long(j));
            }
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            long j2 = Long.MAX_VALUE & j;
            int length = (int) (j2 % this.j6.length);
            int length2 = ((int) (j2 % (this.j6.length - 2))) + 1;
            long j3 = this.j6[length];
            while (j3 != 0) {
                if (j3 == j) {
                    this.j6[length] = Long.MIN_VALUE;
                    this.Zo--;
                }
                length = (length + length2) % this.j6.length;
                j3 = this.j6[length];
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 295247275176219380L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -1340158441220457417L)
    public int v5(long j) {
        try {
            if (u7) {
                iy.tp(-6140469894409196208L, this, new Long(j));
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
                iy.j3(th, -6140469894409196208L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 119276256419608464L)
    public MapOfLongInt(StoreInputStream storeInputStream) {
        a aVar = null;
        try {
            if (u7) {
                iy.tp(3431135177519370741L, null, storeInputStream);
            }
            new b(this, aVar);
            this.Zo = storeInputStream.readInt();
            this.v5 = storeInputStream.readInt();
            int i = storeInputStream.readInt();
            this.VH = i;
            this.j6 = new long[gn[i]];
            for (int i2 = 0; i2 < this.j6.length; i2++) {
                this.j6[i2] = storeInputStream.readLong();
            }
            this.FH = new int[gn[this.VH]];
            for (int i3 = 0; i3 < this.FH.length; i3++) {
                this.FH[i3] = storeInputStream.readInt();
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 3431135177519370741L, null, storeInputStream);
            }
            throw th;
        }
    }
}
