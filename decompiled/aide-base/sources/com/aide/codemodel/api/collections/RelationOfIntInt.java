package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 237811116859619652L, container = 237811116859619652L, user = true)
/* loaded from: classes.dex */
public class RelationOfIntInt {

    @dy(field = 475769669487625281L)
    private static final int[] VH;

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = 2361428063803660269L)
    private long[] DW;

    @dy(field = -3142228863230042184L)
    private long[] FH;

    @dy(field = 1921445969185482056L)
    private int Hw;

    @dy(field = -2025720309046568355L)
    private int Zo;

    @dy(field = 3988336137794042291L)
    public final b j6;

    @dy(field = 1229899115539576384L)
    private int v5;

    @cy(clazz = 5468223788595286928L, container = 5468223788595286928L, user = true)
    public class b {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -1509268063402040688L)
        private int DW;

        @dy(field = -1509336945673817975L)
        private int FH;

        @dy(field = 2376666521762754704L)
        @hy
        final /* synthetic */ RelationOfIntInt Hw;

        @dy(field = -2711013860924388996L)
        private int j6;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -358028101051490280L)
        public /* synthetic */ b(RelationOfIntInt relationOfIntInt, a aVar) {
            this(relationOfIntInt);
            try {
                if (v5) {
                    iy.EQ(-89274344915234800L, null, relationOfIntInt, aVar);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -89274344915234800L, null, relationOfIntInt, aVar);
                }
                throw th;
            }
        }

        @ey(method = 1375100174518115591L)
        public void DW() {
            try {
                if (v5) {
                    iy.gn(-1662178150199401065L, this);
                }
                this.j6 = 0;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -1662178150199401065L, this);
                }
                throw th;
            }
        }

        @ey(method = 2807417094417600368L)
        public int FH() {
            try {
                if (v5) {
                    iy.gn(-2502036584752529664L, this);
                }
                return this.DW;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -2502036584752529664L, this);
                }
                throw th;
            }
        }

        @ey(method = 2807509893903138537L)
        public int Hw() {
            try {
                if (v5) {
                    iy.gn(-2502121516687171575L, this);
                }
                return this.FH;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -2502121516687171575L, this);
                }
                throw th;
            }
        }

        @ey(method = 2339837406676499725L)
        public boolean j6() {
            try {
                if (v5) {
                    iy.gn(-5381032264331825891L, this);
                }
                while (this.j6 < this.Hw.DW.length) {
                    long j = this.Hw.DW[this.j6];
                    this.j6++;
                    if (j != 0 && j != Long.MIN_VALUE) {
                        if (j == Long.MAX_VALUE) {
                            j = 0;
                        }
                        this.DW = (int) (j >> 32);
                        this.FH = (int) (j & (-1));
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -5381032264331825891L, this);
                }
                throw th;
            }
        }

        @ey(method = 189124959063738936L)
        private b(RelationOfIntInt relationOfIntInt) {
            try {
                if (v5) {
                    iy.tp(52991662815337888L, null, relationOfIntInt);
                }
                this.Hw = relationOfIntInt;
                this.j6 = 0;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 52991662815337888L, null, relationOfIntInt);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(RelationOfIntInt.class);
            if (gn) {
                iy.gn(-2661805207040595111L, null);
            }
            VH = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -2661805207040595111L, null);
            }
            throw th;
        }
    }

    @ey(method = 2575918204574390536L)
    public RelationOfIntInt() {
        a aVar = null;
        try {
            if (gn) {
                iy.gn(-2388979533300984928L, null);
            }
            this.j6 = new b(this, aVar);
            this.Zo = 0;
            this.DW = new long[VH[0]];
            this.Hw = 0;
            this.v5 = 0;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -2388979533300984928L, null);
            }
            throw th;
        }
    }

    @ey(method = -3521758436614610877L)
    private void gn() {
        long[] jArr;
        try {
            if (gn) {
                iy.gn(-720750438749882244L, this);
            }
            if (this.v5 * 2 > this.DW.length) {
                int i = this.Zo + 1;
                this.Zo = i;
                this.FH = null;
                jArr = new long[VH[i]];
            } else if (this.FH == null || this.FH.length != this.DW.length) {
                this.FH = this.DW;
                jArr = new long[VH[this.Zo]];
            } else {
                jArr = this.FH;
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    jArr[i2] = 0;
                }
                this.FH = this.DW;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.DW.length; i4++) {
                long j = this.DW[i4];
                if (j != 0 && j != Long.MIN_VALUE) {
                    long j2 = Long.MAX_VALUE & j;
                    int length = (int) (j2 % jArr.length);
                    int length2 = ((int) (j2 % (jArr.length - 2))) + 1;
                    while (jArr[length] != 0) {
                        length = (length + length2) % jArr.length;
                    }
                    jArr[length] = j;
                    i3++;
                }
            }
            this.DW = jArr;
            this.Hw = i3;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -720750438749882244L, this);
            }
            throw th;
        }
    }

    @ey(method = 277398530359113303L)
    public void EQ(SetOfInt setOfInt) {
        try {
            if (gn) {
                iy.tp(-7458258255519550044L, this, setOfInt);
            }
            for (int i = 0; i < this.DW.length; i++) {
                long j = this.DW[i];
                if (j != 0 && j != Long.MIN_VALUE) {
                    if (j == Long.MAX_VALUE) {
                        j = 0;
                    }
                    if (setOfInt.contains((int) (j >> 32))) {
                        this.DW[i] = Long.MIN_VALUE;
                        this.v5--;
                    }
                }
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -7458258255519550044L, this, setOfInt);
            }
            throw th;
        }
    }

    @ey(method = -39525731516455041L)
    public void Hw(int i, int i2) {
        try {
            if (gn) {
                iy.EQ(-4157439945943880556L, this, new Integer(i), new Integer(i2));
            }
            long j = (i << 32) | i2;
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            long j2 = Long.MAX_VALUE & j;
            int length = (int) (j2 % this.DW.length);
            int length2 = ((int) (j2 % (this.DW.length - 2))) + 1;
            long j3 = this.DW[length];
            while (j3 != 0) {
                if (j3 == j) {
                    return;
                }
                length = (length + length2) % this.DW.length;
                j3 = this.DW[length];
            }
            this.DW[length] = j;
            this.v5++;
            int i3 = this.Hw + 1;
            this.Hw = i3;
            if (i3 * 2 > this.DW.length) {
                gn();
            }
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -4157439945943880556L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -5402237234260119748L)
    public void VH(RelationOfIntInt relationOfIntInt) {
        try {
            if (gn) {
                iy.tp(7231893503985399465L, this, relationOfIntInt);
            }
            for (int i = 0; i < relationOfIntInt.DW.length; i++) {
                long j = relationOfIntInt.DW[i];
                if (j == Long.MAX_VALUE) {
                    Zo(0L);
                } else if (j != 0 && j != Long.MIN_VALUE) {
                    Zo(j);
                }
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 7231893503985399465L, this, relationOfIntInt);
            }
            throw th;
        }
    }

    @ey(method = -2385155067004428564L)
    public void Zo(long j) {
        try {
            if (gn) {
                iy.tp(-5293446937136091279L, this, new Long(j));
            }
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            long j2 = Long.MAX_VALUE & j;
            int length = (int) (j2 % this.DW.length);
            int length2 = ((int) (j2 % (this.DW.length - 2))) + 1;
            long j3 = this.DW[length];
            while (j3 != 0) {
                if (j3 == j) {
                    return;
                }
                length = (length + length2) % this.DW.length;
                j3 = this.DW[length];
            }
            this.DW[length] = j;
            this.v5++;
            int i = this.Hw + 1;
            this.Hw = i;
            if (i * 2 > this.DW.length) {
                gn();
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -5293446937136091279L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -1584869576137183011L)
    public void clear() {
        try {
            if (gn) {
                iy.gn(617443371431231540L, this);
            }
            if (this.Hw > 0) {
                for (int i = 0; i < this.DW.length; i++) {
                    this.DW[i] = 0;
                }
                this.Hw = 0;
                this.v5 = 0;
            }
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 617443371431231540L, this);
            }
            throw th;
        }
    }

    @ey(method = 756939830381322467L)
    public boolean contains(int i, int i2) {
        try {
            if (gn) {
                iy.EQ(545657150018462976L, this, new Integer(i), new Integer(i2));
            }
            long j = (i << 32) | i2;
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            long j2 = Long.MAX_VALUE & j;
            int length = (int) (j2 % this.DW.length);
            int length2 = ((int) (j2 % (this.DW.length - 2))) + 1;
            long j3 = this.DW[length];
            while (j3 != j) {
                if (j3 == 0) {
                    return false;
                }
                length = (length + length2) % this.DW.length;
                j3 = this.DW[length];
            }
            return true;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 545657150018462976L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -5414893494566171824L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (gn) {
                iy.tp(7680429866486978883L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.v5);
            storeOutputStream.writeInt(this.Hw);
            storeOutputStream.writeInt(this.Zo);
            for (int i = 0; i < this.DW.length; i++) {
                storeOutputStream.writeLong(this.DW[i]);
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 7680429866486978883L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -1647412276549223040L)
    public String toString() {
        try {
            if (gn) {
                iy.gn(1678963393083190419L, this);
            }
            String str = "{";
            for (int i = 0; i < this.DW.length; i++) {
                long j = this.DW[i];
                if (j != 0 && j != Long.MIN_VALUE) {
                    if (j == Long.MAX_VALUE) {
                        j = 0;
                    }
                    str = str + ((int) (j >> 32)) + " - " + ((int) (j & (-1))) + ", ";
                }
            }
            return str + "}";
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1678963393083190419L, this);
            }
            throw th;
        }
    }

    @ey(method = 261320208825239124L)
    public void tp(SetOfFileEntry setOfFileEntry) {
        try {
            if (gn) {
                iy.tp(-7394478806326353363L, this, setOfFileEntry);
            }
            for (int i = 0; i < this.DW.length; i++) {
                long j = this.DW[i];
                if (j != 0 && j != Long.MIN_VALUE) {
                    if (j == Long.MAX_VALUE) {
                        j = 0;
                    }
                    if (setOfFileEntry.Hw((int) (j >> 32))) {
                        this.DW[i] = Long.MIN_VALUE;
                        this.v5--;
                    }
                }
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -7394478806326353363L, this, setOfFileEntry);
            }
            throw th;
        }
    }

    @ey(method = 37415694607271313L)
    public void u7(int i) {
        try {
            if (gn) {
                iy.u7(7457908745023314732L, this, i);
            }
            for (int i2 = 0; i2 < this.DW.length; i2++) {
                long j = this.DW[i2];
                if (j != 0 && j != Long.MIN_VALUE) {
                    if (j == Long.MAX_VALUE) {
                        j = 0;
                    }
                    if (((int) (j >> 32)) == i) {
                        this.DW[i2] = Long.MIN_VALUE;
                        this.v5--;
                    }
                }
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 7457908745023314732L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2100073999575385521L)
    public void v5(int i, int i2) {
        try {
            if (gn) {
                iy.EQ(3684786208174567128L, this, new Integer(i), new Integer(i2));
            }
            long j = (i << 32) | i2;
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            long j2 = Long.MAX_VALUE & j;
            int length = (int) (j2 % this.DW.length);
            int length2 = ((int) (j2 % (this.DW.length - 2))) + 1;
            long j3 = this.DW[length];
            while (j3 != 0) {
                if (j3 == j) {
                    return;
                }
                length = (length + length2) % this.DW.length;
                j3 = this.DW[length];
            }
            this.DW[length] = j;
            this.v5++;
            int i3 = this.Hw + 1;
            this.Hw = i3;
            if (i3 * 2 > this.DW.length) {
                gn();
            }
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 3684786208174567128L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -675491936613247984L)
    public RelationOfIntInt(StoreInputStream storeInputStream) {
        a aVar = null;
        try {
            if (gn) {
                iy.tp(197273551341732084L, null, storeInputStream);
            }
            this.j6 = new b(this, aVar);
            this.v5 = storeInputStream.readInt();
            this.Hw = storeInputStream.readInt();
            int i = storeInputStream.readInt();
            this.Zo = i;
            this.DW = new long[VH[i]];
            for (int i2 = 0; i2 < this.DW.length; i2++) {
                this.DW[i2] = storeInputStream.readLong();
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 197273551341732084L, null, storeInputStream);
            }
            throw th;
        }
    }
}
