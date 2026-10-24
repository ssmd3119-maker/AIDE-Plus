package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = -3668898065127298773L, container = -3668898065127298773L, user = true)
/* loaded from: classes.dex */
public class SetOfInt {

    @dy(field = 2992603643549860569L)
    private static final int[] SIZES;

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = -2396489536640843820L)
    private int count;

    @dy(field = -5602065950416264845L)
    public final Iterator default_Iterator;

    @dy(field = -244573179195577575L)
    private int[] keys;

    @dy(field = 612533103266626272L)
    private int[] oldkeys;

    @dy(field = 1691970549177139973L)
    private int sizeexp;

    @dy(field = -1748918108576214240L)
    private int slots;

    @cy(clazz = 896354909824653475L, container = 896354909824653475L, user = true)
    public class Iterator {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = -2016342768539776025L)
        private int index;

        @dy(field = -1964552496331583660L)
        private int key;

        @dy(field = -2099771496587331197L)
        @hy
        final /* synthetic */ SetOfInt this$0;

        static {
            iy.Zo(Iterator.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 6929525624811834335L)
        public /* synthetic */ Iterator(SetOfInt setOfInt, a aVar) {
            this(setOfInt);
            try {
                if (Hw) {
                    iy.EQ(502160324627900368L, null, setOfInt, aVar);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, 502160324627900368L, null, setOfInt, aVar);
                }
                throw th;
            }
        }

        @ey(method = 2741794701733206080L)
        public boolean hasMoreElements() {
            try {
                if (Hw) {
                    iy.gn(-2890399079012223495L, this);
                }
                while (this.index < this.this$0.keys.length) {
                    int i = this.this$0.keys[this.index];
                    this.key = i;
                    this.index++;
                    if (i != 0 && i != Integer.MIN_VALUE) {
                        if (i == Integer.MAX_VALUE) {
                            this.key = 0;
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -2890399079012223495L, this);
                }
                throw th;
            }
        }

        @ey(method = -2486801748767330240L)
        public void init() {
            try {
                if (Hw) {
                    iy.gn(-134943025862496397L, this);
                }
                this.index = 0;
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -134943025862496397L, this);
                }
                throw th;
            }
        }

        @ey(method = -215817393925948152L)
        public int nextKey() {
            try {
                if (Hw) {
                    iy.gn(-1482469552654619613L, this);
                }
                return this.key;
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -1482469552654619613L, this);
                }
                throw th;
            }
        }

        @ey(method = -1385300563214441953L)
        private Iterator(SetOfInt setOfInt) {
            try {
                if (Hw) {
                    iy.tp(59904037335515516L, null, setOfInt);
                }
                this.this$0 = setOfInt;
                this.index = 0;
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 59904037335515516L, null, setOfInt);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(SetOfInt.class);
            if (gn) {
                iy.gn(3577399276259114424L, null);
            }
            SIZES = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
            new SetOfInt();
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 3577399276259114424L, null);
            }
            throw th;
        }
    }

    @ey(method = 2658181636067313332L)
    public SetOfInt() {
        a aVar = null;
        try {
            if (gn) {
                iy.gn(-3438084626592268800L, null);
            }
            this.default_Iterator = new Iterator(this, aVar);
            this.sizeexp = 1;
            this.keys = new int[SIZES[1]];
            this.slots = 0;
            this.count = 0;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -3438084626592268800L, null);
            }
            throw th;
        }
    }

    @ey(method = -3149581386527109019L)
    private void gn() {
        int[] iArr;
        try {
            if (gn) {
                iy.gn(1799042293326191691L, this);
            }
            if (this.count * 2 > this.keys.length) {
                int i = this.sizeexp + 1;
                this.sizeexp = i;
                this.oldkeys = null;
                iArr = new int[SIZES[i]];
            } else if (this.oldkeys == null || this.oldkeys.length != this.keys.length) {
                this.oldkeys = this.keys;
                iArr = new int[SIZES[this.sizeexp]];
            } else {
                iArr = this.oldkeys;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    iArr[i2] = 0;
                }
                this.oldkeys = this.keys;
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
                    i3++;
                }
            }
            this.keys = iArr;
            this.slots = i3;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1799042293326191691L, this);
            }
            throw th;
        }
    }

    @ey(method = -3932475839484420340L)
    public void VH(SetOfInt setOfInt) {
        try {
            if (gn) {
                iy.tp(-673546038268608648L, this, setOfInt);
            }
            for (int i = 0; i < setOfInt.keys.length; i++) {
                int i2 = setOfInt.keys[i];
                if (i2 == Integer.MAX_VALUE) {
                    put(0);
                } else if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    put(i2);
                }
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -673546038268608648L, this, setOfInt);
            }
            throw th;
        }
    }

    @ey(method = -2098198529492799245L)
    public void clear() {
        try {
            if (gn) {
                iy.gn(1364539112133147925L, this);
            }
            if (this.slots > 0) {
                for (int i = 0; i < this.keys.length; i++) {
                    this.keys[i] = 0;
                }
                this.slots = 0;
                this.count = 0;
            }
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1364539112133147925L, this);
            }
            throw th;
        }
    }

    @ey(method = 1176721064909316768L)
    public boolean contains(int i) {
        try {
            if (gn) {
                iy.u7(-1081783843877578728L, this, i);
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
            if (u7) {
                iy.j3(th, -1081783843877578728L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2022399846578987365L)
    public boolean empty() {
        try {
            if (gn) {
                iy.gn(1450674510157308525L, this);
            }
            return this.count == 0;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1450674510157308525L, this);
            }
            throw th;
        }
    }

    @ey(method = -62618196326829996L)
    public boolean equals(Object obj) {
        try {
            if (gn) {
                iy.tp(411418167712355864L, this, obj);
            }
            if (!(obj instanceof SetOfInt)) {
                return false;
            }
            SetOfInt setOfInt = (SetOfInt) obj;
            if (setOfInt.size() != size()) {
                return false;
            }
            for (int i = 0; i < this.keys.length; i++) {
                int i2 = this.keys[i];
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
            if (u7) {
                iy.j3(th, 411418167712355864L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = 2320551369249106516L)
    public void put(int i) {
        try {
            if (gn) {
                iy.u7(7479690324856507488L, this, i);
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
                    return;
                }
                if (i3 == Integer.MIN_VALUE) {
                    i4 = length;
                }
                length = (length + length2) % this.keys.length;
                i3 = this.keys[length];
            }
            if (i4 != -1) {
                length = i4;
            }
            this.keys[length] = i;
            if (i4 == -1) {
                this.slots++;
            }
            this.count++;
            if (this.slots * 2 > this.keys.length) {
                gn();
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 7479690324856507488L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2442895536945461339L)
    public int size() {
        try {
            if (gn) {
                iy.gn(1105155565803208075L, this);
            }
            return this.count;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1105155565803208075L, this);
            }
            throw th;
        }
    }

    @ey(method = 6222908055583144224L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (gn) {
                iy.tp(-7875854344706609144L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.count);
            storeOutputStream.writeInt(this.sizeexp);
            for (int i = 0; i < this.keys.length; i++) {
                int i2 = this.keys[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    storeOutputStream.writeInt(this.keys[i]);
                }
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -7875854344706609144L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 3306805595582009040L)
    public String toString() {
        try {
            if (gn) {
                iy.gn(1008227729836827500L, this);
            }
            String str = "{";
            for (int i = 0; i < this.keys.length; i++) {
                int i2 = this.keys[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    str = i2 == Integer.MAX_VALUE ? str + "0, " : str + i2 + ", ";
                }
            }
            return str + "}";
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1008227729836827500L, this);
            }
            throw th;
        }
    }

    @ey(method = 889966386519956993L)
    public void tp(SetOfInt setOfInt) {
        try {
            if (gn) {
                iy.tp(-188255193581725641L, this, setOfInt);
            }
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                u7(setOfInt.default_Iterator.nextKey());
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -188255193581725641L, this, setOfInt);
            }
            throw th;
        }
    }

    @ey(method = 439457408744798063L)
    public void u7(int i) {
        try {
            if (gn) {
                iy.u7(-102222948084693567L, this, i);
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = i2 % this.keys.length;
            int length2 = (i2 % (this.keys.length - 2)) + 1;
            int i3 = this.keys[length];
            while (i3 != i) {
                if (i3 == 0) {
                    return;
                }
                length = (length + length2) % this.keys.length;
                i3 = this.keys[length];
            }
            this.keys[length] = Integer.MIN_VALUE;
            this.count--;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -102222948084693567L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1787698099529284192L)
    public int v5() {
        try {
            if (gn) {
                iy.gn(-923147917951935368L, this);
            }
            int i = 0;
            while (i < this.keys.length) {
                int i2 = this.keys[i];
                i++;
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    if (i2 == Integer.MAX_VALUE) {
                        return 0;
                    }
                    return i2;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -923147917951935368L, this);
            }
            throw th;
        }
    }

    @ey(method = -42105050711505504L)
    public SetOfInt(StoreInputStream storeInputStream) {
        a aVar = null;
        try {
            if (gn) {
                iy.tp(157158759127791644L, null, storeInputStream);
            }
            this.default_Iterator = new Iterator(this, aVar);
            int i = storeInputStream.readInt();
            int i2 = storeInputStream.readInt();
            this.sizeexp = i2;
            this.keys = new int[SIZES[i2]];
            this.slots = 0;
            this.count = 0;
            for (int i3 = 0; i3 < i; i3++) {
                put(storeInputStream.readInt());
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 157158759127791644L, null, storeInputStream);
            }
            throw th;
        }
    }
}
