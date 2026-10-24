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

@cy(clazz = -3026351755103570705L, container = -3026351755103570705L, user = true)
/* loaded from: classes.dex */
public class MapOfInt<E extends Entity> {

    @fy
    private static /* synthetic */ boolean EQ;

    @dy(field = -130694840903525445L)
    private static final int[] tp;

    @gy
    private static /* synthetic */ boolean we;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/aide/codemodel/api/collections/MapOfInt<TE;>.b; */
    @dy(field = 5565990823027329057L)
    public final Iterator DEFAULT_ITERATOR;

    @dy(field = 1283484482083522971L)
    private int[] DW;

    @dy(field = -3483727961837424432L)
    private int[] FH;

    @dy(field = -1881995112763482935L)
    private int[] Hw;

    @dy(field = 563268836974620992L)
    private int VH;

    @dy(field = 1208471996766842956L)
    private int Zo;

    @dy(field = -2434929151072689565L)
    private int gn;

    @dy(field = 1208922225479978205L)
    private final EntitySpace u7;

    @dy(field = -500220021486621744L)
    private int[] v5;

    @cy(clazz = 151990112872737875L, container = 151990112872737875L, user = true)
    public class Iterator {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -253641483436698264L)
        private int DW;

        @dy(field = -925333980575425603L)
        private int FH;

        @dy(field = -2814874549115060509L)
        private int Hw;

        @dy(field = 1372848759035624172L)
        @hy
        final /* synthetic */ MapOfInt Zo;

        @dy(field = 2367258623082942624L)
        private int j6;

        @dy(field = 1377600442242350592L)
        private int v5;

        static {
            iy.Zo(Iterator.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -5371007745637289705L)
        public /* synthetic */ Iterator(MapOfInt mapOfInt, a aVar) {
            this(mapOfInt);
            try {
                if (VH) {
                    iy.EQ(-311034358952034921L, null, mapOfInt, aVar);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, -311034358952034921L, null, mapOfInt, aVar);
                }
                throw th;
            }
        }

        @ey(method = -837757107285447975L)
        public void DW() {
            try {
                if (VH) {
                    iy.gn(1284717318393718825L, this);
                }
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 1284717318393718825L, this);
                }
                throw th;
            }
        }

        @ey(method = -2880862042983879375L)
        public int Hw() {
            try {
                if (VH) {
                    iy.gn(-1666041877491876983L, this);
                }
                return this.FH;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -1666041877491876983L, this);
                }
                throw th;
            }
        }

        @ey(method = 289879234228209915L)
        public boolean hasMoreElements() {
            try {
                if (VH) {
                    iy.gn(-4966664739350581701L, this);
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
                    iy.aM(th, -4966664739350581701L, this);
                }
                throw th;
            }
        }

        @ey(method = 5062404984633344872L)
        public void init(int i) {
            try {
                if (VH) {
                    iy.u7(6306334829055820944L, this, i);
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
                    iy.j3(th, 6306334829055820944L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1363998153169075379L)
        public E nextValue() {
            try {
                if (VH) {
                    iy.gn(-8958132557437357L, this);
                }
                return (E) this.Zo.u7.getEntity(this.Hw);
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -8958132557437357L, this);
                }
                throw th;
            }
        }

        @ey(method = 126242415796890544L)
        private Iterator(MapOfInt mapOfInt) {
            try {
                if (VH) {
                    iy.tp(-896183007275068880L, null, mapOfInt);
                }
                this.Zo = mapOfInt;
                this.j6 = 0;
                this.DW = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -896183007275068880L, null, mapOfInt);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(MapOfInt.class);
            if (EQ) {
                iy.gn(1957819347989648032L, null);
            }
            tp = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 1957819347989648032L, null);
            }
            throw th;
        }
    }

    @ey(method = 33705780484187420L)
    public MapOfInt(EntitySpace entitySpace) {
        a aVar = null;
        try {
            if (EQ) {
                iy.tp(-414321974248936500L, null, entitySpace);
            }
            this.DEFAULT_ITERATOR = new Iterator(this, aVar);
            this.u7 = entitySpace;
            this.gn = 0;
            this.DW = new int[tp[0]];
            this.Hw = new int[tp[0]];
            this.Zo = 0;
            this.VH = 0;
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -414321974248936500L, null, entitySpace);
            }
            throw th;
        }
    }

    @ey(method = -3562096904396417101L)
    private void EQ(int i, int i2) {
        try {
            if (EQ) {
                iy.EQ(339526339763507949L, this, new Integer(i), new Integer(i2));
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
                J0();
            }
        } finally {
        }
    }

    @ey(method = 3176829583101617843L)
    private void J0() {
        int[] iArr;
        int[] iArr2;
        try {
            if (EQ) {
                iy.gn(-167853829047349903L, this);
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
                iy.aM(th, -167853829047349903L, this);
            }
            throw th;
        }
    }

    @ey(method = -166637390651841433L)
    private void u7(int i, int i2) {
        try {
            if (EQ) {
                iy.EQ(-6488878679120733235L, this, new Integer(i), new Integer(i2));
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
                J0();
            }
        } finally {
        }
    }

    @ey(method = 868364875760342637L)
    public void Hw() {
        try {
            if (EQ) {
                iy.gn(351207034185578103L, this);
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
                iy.aM(th, 351207034185578103L, this);
            }
            throw th;
        }
    }

    @ey(method = -862171982252518413L)
    public int J8() {
        try {
            if (EQ) {
                iy.gn(1379687947394764977L, this);
            }
            return this.VH;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 1379687947394764977L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Incorrect inner types in method signature: ()Lcom/aide/codemodel/api/collections/MapOfInt<TE;>.b; */
    @ey(method = 2752465659395308320L)
    public Iterator VH() {
        try {
            if (EQ) {
                iy.gn(3723694057827196460L, this);
            }
            return new Iterator(this, null);
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 3723694057827196460L, this);
            }
            throw th;
        }
    }

    @ey(method = -8588480850453709720L)
    public int Zo(int i) {
        try {
            if (EQ) {
                iy.u7(-4008095890271974228L, this, i);
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
                iy.j3(th, -4008095890271974228L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4160195946566290485L)
    public E gn(int i) {
        try {
            if (EQ) {
                iy.u7(6239539737884708149L, this, i);
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
            return (E) this.u7.getEntity(this.Hw[length2]);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 6239539737884708149L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -139250559311797255L)
    public void insert(int i, E e) {
        try {
            if (EQ) {
                iy.EQ(-5915174016177005089L, this, new Integer(i), e);
            }
            u7(i, this.u7.getId(e));
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, -5915174016177005089L, this, new Integer(i), e);
            }
            throw th;
        }
    }

    @ey(method = 8385704371888508304L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (EQ) {
                iy.tp(573549786321091344L, this, storeOutputStream);
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
                iy.j3(th, 573549786321091344L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -2933994692847215988L)
    public String toString() {
        try {
            if (EQ) {
                iy.gn(-532626060759216600L, this);
            }
            String str = "{";
            for (int i = 0; i < this.DW.length; i++) {
                int i2 = this.DW[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    String fullyQualifiedNameString = this.u7.getEntity(this.Hw[i]).getFullyQualifiedNameString();
                    str = i2 == Integer.MAX_VALUE ? str + "0->" + fullyQualifiedNameString + ", " : str + i2 + "->" + fullyQualifiedNameString + ", ";
                }
            }
            return str + "}";
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -532626060759216600L, this);
            }
            throw th;
        }
    }

    @ey(method = -1082508446821017600L)
    public boolean v5(int i) {
        try {
            if (EQ) {
                iy.u7(-587781049798124880L, this, i);
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
                iy.j3(th, -587781049798124880L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3106561813083325395L)
    public void we(int i, E e) {
        try {
            if (EQ) {
                iy.EQ(755232666988983639L, this, new Integer(i), e);
            }
            EQ(i, this.u7.getId(e));
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 755232666988983639L, this, new Integer(i), e);
            }
            throw th;
        }
    }

    @ey(method = -83075918990601936L)
    public MapOfInt(EntitySpace entitySpace, StoreInputStream storeInputStream) {
        try {
            a aVar = null;
            if (EQ) {
                iy.EQ(-246945007721299712L, null, entitySpace, storeInputStream);
            }
            this.DEFAULT_ITERATOR = new Iterator(this, aVar);
            this.u7 = entitySpace;
            int i = storeInputStream.readInt();
            int i2 = storeInputStream.readInt();
            this.gn = i2;
            this.DW = new int[tp[i2]];
            this.Hw = new int[tp[i2]];
            this.Zo = 0;
            this.VH = 0;
            for (int i3 = 0; i3 < i; i3++) {
                u7(storeInputStream.readInt(), storeInputStream.readInt());
            }
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, -246945007721299712L, null, entitySpace, storeInputStream);
            }
            throw th;
        }
    }
}
