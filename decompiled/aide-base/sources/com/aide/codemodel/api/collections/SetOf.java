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

@cy(clazz = 523805944999715320L, container = 523805944999715320L, user = true)
/* loaded from: classes.dex */
public class SetOf<E extends Entity> {

    @dy(field = 2415411536592963300L)
    private static final int[] gn;

    @gy
    private static /* synthetic */ boolean tp;

    @fy
    private static /* synthetic */ boolean u7;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/aide/codemodel/api/collections/SetOf<TE;>.b; */
    @dy(field = 259851223341246004L)
    public final Iterator DEFAULT_ITERATOR;

    @dy(field = 2447092971365383768L)
    private int[] DW;

    @dy(field = 2815319930068689703L)
    private int[] FH;

    @dy(field = -2275814587258768281L)
    private int Hw;

    @dy(field = -2263425620700355352L)
    private final EntitySpace VH;

    @dy(field = -3273904490587924928L)
    private int Zo;

    @dy(field = -2913306625309027639L)
    private int v5;

    @cy(clazz = -5269636161949098816L, container = -5269636161949098816L, user = true)
    public class Iterator {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 1347165794824042865L)
        private int DW;

        @dy(field = -767929702087507104L)
        @hy
        final /* synthetic */ SetOf FH;

        @dy(field = 1901308747973449344L)
        private int j6;

        static {
            iy.Zo(Iterator.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -4260445831518057783L)
        public /* synthetic */ Iterator(SetOf setOf, a aVar) {
            this(setOf);
            try {
                if (Hw) {
                    iy.EQ(-1174655552044905436L, null, setOf, aVar);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, -1174655552044905436L, null, setOf, aVar);
                }
                throw th;
            }
        }

        @ey(method = 2679065945238714817L)
        public boolean hasMoreElements() {
            try {
                if (Hw) {
                    iy.gn(5803055578777122120L, this);
                }
                while (this.j6 < this.FH.DW.length) {
                    int i = this.FH.DW[this.j6];
                    this.DW = i;
                    this.j6++;
                    if (i != 0 && i != Integer.MIN_VALUE) {
                        if (i == Integer.MAX_VALUE) {
                            this.DW = 0;
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 5803055578777122120L, this);
                }
                throw th;
            }
        }

        @ey(method = -1764784223747844885L)
        public void init() {
            try {
                if (Hw) {
                    iy.gn(-1011891552851378192L, this);
                }
                this.j6 = 0;
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -1011891552851378192L, this);
                }
                throw th;
            }
        }

        @ey(method = 126299747434920075L)
        public E nextKey() {
            try {
                if (Hw) {
                    iy.gn(3118822035262312500L, this);
                }
                return (E) this.FH.VH.getEntity(this.DW);
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 3118822035262312500L, this);
                }
                throw th;
            }
        }

        @ey(method = 7249919706386930048L)
        private Iterator(SetOf setOf) {
            try {
                if (Hw) {
                    iy.tp(-761314468921877545L, null, setOf);
                }
                this.FH = setOf;
                this.j6 = 0;
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -761314468921877545L, null, setOf);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(SetOf.class);
            if (u7) {
                iy.gn(2775244899002098357L, null);
            }
            gn = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 2775244899002098357L, null);
            }
            throw th;
        }
    }

    @ey(method = -29776299702149753L)
    public SetOf(EntitySpace entitySpace) {
        a aVar = null;
        try {
            if (u7) {
                iy.tp(2822219335171884160L, null, entitySpace);
            }
            this.DEFAULT_ITERATOR = new Iterator(this, aVar);
            this.VH = entitySpace;
            this.Zo = 1;
            this.DW = new int[gn[1]];
            this.Hw = 0;
            this.v5 = 0;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 2822219335171884160L, null, entitySpace);
            }
            throw th;
        }
    }

    @ey(method = -7095136985572572333L)
    private void VH(int i) {
        try {
            if (u7) {
                iy.u7(7109137237484061741L, this, i);
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
                    return;
                }
                if (i3 == Integer.MIN_VALUE) {
                    i4 = length;
                }
                length = (length + length2) % this.DW.length;
                i3 = this.DW[length];
            }
            if (i4 != -1) {
                length = i4;
            }
            this.DW[length] = i;
            if (i4 == -1) {
                this.Hw++;
            }
            this.v5++;
            if (this.Hw * 2 > this.DW.length) {
                tp();
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 7109137237484061741L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1760009913074726720L)
    private void tp() {
        int[] iArr;
        try {
            if (u7) {
                iy.gn(2352075851894270420L, this);
            }
            if (this.v5 * 2 > this.DW.length) {
                int i = this.Zo + 1;
                this.Zo = i;
                this.FH = null;
                iArr = new int[gn[i]];
            } else if (this.FH == null || this.FH.length != this.DW.length) {
                this.FH = this.DW;
                iArr = new int[gn[this.Zo]];
            } else {
                iArr = this.FH;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    iArr[i2] = 0;
                }
                this.FH = this.DW;
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
                    i3++;
                }
            }
            this.DW = iArr;
            this.Hw = i3;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 2352075851894270420L, this);
            }
            throw th;
        }
    }

    @ey(method = -237023089272771340L)
    public void EQ(Entity entity) {
        try {
            if (u7) {
                iy.tp(324140739602566920L, this, entity);
            }
            int id = this.VH.getId(entity);
            if (id == 0) {
                id = Integer.MAX_VALUE;
            }
            int i = Integer.MAX_VALUE & id;
            int length = i % this.DW.length;
            int length2 = (i % (this.DW.length - 2)) + 1;
            int i2 = this.DW[length];
            while (i2 != id) {
                if (i2 == 0) {
                    return;
                }
                length = (length + length2) % this.DW.length;
                i2 = this.DW[length];
            }
            this.DW[length] = Integer.MIN_VALUE;
            this.v5--;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 324140739602566920L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = 305332249892389440L)
    public int J0() {
        try {
            if (u7) {
                iy.gn(1520607846079439572L, this);
            }
            return this.v5;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 1520607846079439572L, this);
            }
            throw th;
        }
    }

    @ey(method = -1659021829717579675L)
    public E Zo() {
        try {
            if (u7) {
                iy.gn(722666150688541599L, this);
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
                    return (E) this.VH.getEntity(i);
                }
            }
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 722666150688541599L, this);
            }
            throw th;
        }
    }

    @ey(method = -2621233460058981704L)
    public void clear() {
        try {
            if (u7) {
                iy.gn(223616676234825132L, this);
            }
            if (this.Hw > 0) {
                for (int i = 0; i < this.DW.length; i++) {
                    this.DW[i] = 0;
                }
                this.Hw = 0;
                this.v5 = 0;
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 223616676234825132L, this);
            }
            throw th;
        }
    }

    @ey(method = 1077591887100313375L)
    public boolean contains(Entity entity) {
        try {
            if (u7) {
                iy.tp(-10749196324318151L, this, entity);
            }
            int id = this.VH.getId(entity);
            if (id == 0) {
                id = Integer.MAX_VALUE;
            }
            int i = Integer.MAX_VALUE & id;
            int length = (i % (this.DW.length - 2)) + 1;
            int length2 = i % this.DW.length;
            int i2 = this.DW[length2];
            while (i2 != id) {
                if (i2 == 0) {
                    return false;
                }
                length2 = (length2 + length) % this.DW.length;
                i2 = this.DW[length2];
            }
            return true;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -10749196324318151L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = 315323636222355411L)
    public boolean equals(Object obj) {
        try {
            if (u7) {
                iy.tp(8553388830791134629L, this, obj);
            }
            if (!(obj instanceof SetOfInt)) {
                return false;
            }
            SetOfInt setOfInt = (SetOfInt) obj;
            if (setOfInt.size() != J0()) {
                return false;
            }
            for (int i = 0; i < this.DW.length; i++) {
                int i2 = this.DW[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    if (i2 == Integer.MAX_VALUE) {
                        i2 = 0;
                    }
                    if (!setOfInt.contains(i2)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 8553388830791134629L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = -6574804817965249855L)
    public void put(E e) {
        try {
            if (u7) {
                iy.tp(-7009161897567392533L, this, e);
            }
            if (e == null) {
                VH(-1);
            } else {
                VH(this.VH.getId(e));
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -7009161897567392533L, this, e);
            }
            throw th;
        }
    }

    @ey(method = 8424672774545084461L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (u7) {
                iy.tp(1338762705626683479L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.v5);
            storeOutputStream.writeInt(this.Zo);
            for (int i = 0; i < this.DW.length; i++) {
                int i2 = this.DW[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    storeOutputStream.writeInt(this.DW[i]);
                }
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 1338762705626683479L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 152013557157093437L)
    public String toString() {
        try {
            if (u7) {
                iy.gn(510124018224278271L, this);
            }
            String str = "{";
            for (int i = 0; i < this.DW.length; i++) {
                int i2 = this.DW[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    if (i2 == Integer.MAX_VALUE) {
                        i2 = 0;
                    }
                    str = str + i2 + " " + this.VH.getEntity(i2).getFullyQualifiedNameString() + ", ";
                }
            }
            return str + "}";
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 510124018224278271L, this);
            }
            throw th;
        }
    }

    @ey(method = 3444402745961779743L)
    public void u7(SetOf<? extends E> setOf) {
        try {
            if (u7) {
                iy.tp(-3240739263395966971L, this, setOf);
            }
            for (int i = 0; i < setOf.DW.length; i++) {
                int i2 = setOf.DW[i];
                if (i2 == Integer.MAX_VALUE) {
                    VH(0);
                } else if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    VH(i2);
                }
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -3240739263395966971L, this, setOf);
            }
            throw th;
        }
    }

    @ey(method = -2548867812704376360L)
    public boolean v5() {
        try {
            if (u7) {
                iy.gn(294064497744668508L, this);
            }
            return this.v5 == 0;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 294064497744668508L, this);
            }
            throw th;
        }
    }

    @ey(method = -27011153488991220L)
    public void we(SetOf<? extends E> setOf) {
        try {
            if (u7) {
                iy.tp(-6903919427933733912L, this, setOf);
            }
            setOf.DEFAULT_ITERATOR.init();
            while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                EQ(setOf.DEFAULT_ITERATOR.nextKey());
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -6903919427933733912L, this, setOf);
            }
            throw th;
        }
    }

    @ey(method = 53710204518121071L)
    public SetOf(EntitySpace entitySpace, StoreInputStream storeInputStream) {
        try {
            a aVar = null;
            if (u7) {
                iy.EQ(6582643997476170260L, null, entitySpace, storeInputStream);
            }
            this.DEFAULT_ITERATOR = new Iterator(this, aVar);
            this.VH = entitySpace;
            int i = storeInputStream.readInt();
            int i2 = storeInputStream.readInt();
            this.Zo = i2;
            this.DW = new int[gn[i2]];
            this.Hw = 0;
            this.v5 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                VH(storeInputStream.readInt());
            }
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, 6582643997476170260L, null, entitySpace, storeInputStream);
            }
            throw th;
        }
    }
}
