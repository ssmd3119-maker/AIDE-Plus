package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 1717438685724287680L, container = 1717438685724287680L, user = true)
/* loaded from: classes.dex */
public class SetOfFileEntry {

    @dy(field = 2333952093605259375L)
    private static final int[] gn;

    @gy
    private static /* synthetic */ boolean tp;

    @fy
    private static /* synthetic */ boolean u7;

    @dy(field = 3339345495065876261L)
    private final FileSpace DW;

    @dy(field = -2595259278179703905L)
    private int[] FH;

    @dy(field = -2789425391358217280L)
    private int[] Hw;

    @dy(field = -1671342222453146737L)
    private int VH;

    @dy(field = 3122957734060419960L)
    private int Zo;

    @dy(field = -5089709055947545939L)
    public final Iterator j6;

    @dy(field = -2673030183025669964L)
    private int v5;

    @cy(clazz = 662139315901330176L, container = 662139315901330176L, user = true)
    public class Iterator {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 971401635445095975L)
        private int DW;

        @dy(field = 1523439112685022008L)
        @hy
        final /* synthetic */ SetOfFileEntry FH;

        @dy(field = 390685072692224800L)
        private int j6;

        static {
            iy.Zo(Iterator.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -73797655763745375L)
        public /* synthetic */ Iterator(SetOfFileEntry setOfFileEntry, a aVar) {
            this(setOfFileEntry);
            try {
                if (Hw) {
                    iy.EQ(139459785525098000L, null, setOfFileEntry, aVar);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, 139459785525098000L, null, setOfFileEntry, aVar);
                }
                throw th;
            }
        }

        @ey(method = -4761074011899409165L)
        public boolean hasMoreElements() {
            try {
                if (Hw) {
                    iy.gn(464504306972715840L, this);
                }
                while (this.j6 < this.FH.FH.length) {
                    int i = this.FH.FH[this.j6];
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
                    iy.aM(th, 464504306972715840L, this);
                }
                throw th;
            }
        }

        @ey(method = 2744714514690876009L)
        public void init() {
            try {
                if (Hw) {
                    iy.gn(-205351636672305936L, this);
                }
                this.j6 = 0;
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -205351636672305936L, this);
                }
                throw th;
            }
        }

        @ey(method = -1038328192318963211L)
        public FileEntry nextKey() {
            try {
                if (Hw) {
                    iy.gn(-542859407813092176L, this);
                }
                return this.FH.DW.getFileEntry(this.DW);
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -542859407813092176L, this);
                }
                throw th;
            }
        }

        @ey(method = -72628576590775389L)
        private Iterator(SetOfFileEntry setOfFileEntry) {
            try {
                if (Hw) {
                    iy.tp(-334151378866724832L, null, setOfFileEntry);
                }
                this.FH = setOfFileEntry;
                this.j6 = 0;
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -334151378866724832L, null, setOfFileEntry);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(SetOfFileEntry.class);
            if (u7) {
                iy.gn(-3022269036190830840L, null);
            }
            gn = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
            new SetOfInt();
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -3022269036190830840L, null);
            }
            throw th;
        }
    }

    @ey(method = 29305798207453584L)
    public SetOfFileEntry(FileSpace fileSpace) {
        a aVar = null;
        try {
            if (u7) {
                iy.tp(2998680942378555651L, null, fileSpace);
            }
            this.j6 = new Iterator(this, aVar);
            this.DW = fileSpace;
            this.VH = 1;
            this.FH = new int[gn[1]];
            this.v5 = 0;
            this.Zo = 0;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 2998680942378555651L, null, fileSpace);
            }
            throw th;
        }
    }

    @ey(method = -7308225661967176636L)
    private void VH(int i) {
        try {
            if (u7) {
                iy.u7(4206087795882556976L, this, i);
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = i2 % this.FH.length;
            int length2 = (i2 % (this.FH.length - 2)) + 1;
            int i3 = this.FH[length];
            int i4 = -1;
            while (i3 != 0) {
                if (i3 == i) {
                    return;
                }
                if (i3 == Integer.MIN_VALUE) {
                    i4 = length;
                }
                length = (length + length2) % this.FH.length;
                i3 = this.FH[length];
            }
            if (i4 != -1) {
                length = i4;
            }
            this.FH[length] = i;
            if (i4 == -1) {
                this.v5++;
            }
            this.Zo++;
            if (this.v5 * 2 > this.FH.length) {
                tp();
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 4206087795882556976L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3056300047891616491L)
    private void tp() {
        int[] iArr;
        try {
            if (u7) {
                iy.gn(-1423856421812070981L, this);
            }
            if (this.Zo * 2 > this.FH.length) {
                int i = this.VH + 1;
                this.VH = i;
                this.Hw = null;
                iArr = new int[gn[i]];
            } else if (this.Hw == null || this.Hw.length != this.FH.length) {
                this.Hw = this.FH;
                iArr = new int[gn[this.VH]];
            } else {
                iArr = this.Hw;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    iArr[i2] = 0;
                }
                this.Hw = this.FH;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.FH.length; i4++) {
                int i5 = this.FH[i4];
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
            this.FH = iArr;
            this.v5 = i3;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -1423856421812070981L, this);
            }
            throw th;
        }
    }

    @ey(method = 805854194880046383L)
    public void EQ(FileEntry fileEntry) {
        try {
            if (u7) {
                iy.tp(291803823277001105L, this, fileEntry);
            }
            int id = this.DW.getId(fileEntry);
            if (id == 0) {
                id = Integer.MAX_VALUE;
            }
            int i = Integer.MAX_VALUE & id;
            int length = i % this.FH.length;
            int length2 = (i % (this.FH.length - 2)) + 1;
            int i2 = this.FH[length];
            while (i2 != id) {
                if (i2 == 0) {
                    return;
                }
                length = (length + length2) % this.FH.length;
                i2 = this.FH[length];
            }
            this.FH[length] = Integer.MIN_VALUE;
            this.Zo--;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 291803823277001105L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -526280990446415808L)
    public boolean Hw(int i) {
        try {
            if (u7) {
                iy.u7(-392242372711352152L, this, i);
            }
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = (i2 % (this.FH.length - 2)) + 1;
            int length2 = i2 % this.FH.length;
            int i3 = this.FH[length2];
            while (i3 != i) {
                if (i3 == 0) {
                    return false;
                }
                length2 = (length2 + length) % this.FH.length;
                i3 = this.FH[length2];
            }
            return true;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -392242372711352152L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2750652119310490752L)
    public FileEntry Zo() {
        try {
            if (u7) {
                iy.gn(701975799965414920L, this);
            }
            int i = 0;
            int i2 = 0;
            while (i2 < this.FH.length) {
                int i3 = this.FH[i2];
                i2++;
                if (i3 != 0 && i3 != Integer.MIN_VALUE) {
                    if (i3 != Integer.MAX_VALUE) {
                        i = i3;
                    }
                    return this.DW.getFileEntry(i);
                }
            }
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 701975799965414920L, this);
            }
            throw th;
        }
    }

    @ey(method = 317269119140492035L)
    public void clear() {
        try {
            if (u7) {
                iy.gn(-754158966417287771L, this);
            }
            if (this.v5 > 0) {
                for (int i = 0; i < this.FH.length; i++) {
                    this.FH[i] = 0;
                }
                this.v5 = 0;
                this.Zo = 0;
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -754158966417287771L, this);
            }
            throw th;
        }
    }

    @ey(method = -705348044489356688L)
    public boolean contains(FileEntry fileEntry) {
        try {
            if (u7) {
                iy.tp(138272374666265868L, this, fileEntry);
            }
            return Hw(this.DW.getId(fileEntry));
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 138272374666265868L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 412941291491187588L)
    public boolean equals(Object obj) {
        try {
            if (u7) {
                iy.tp(172440942628475880L, this, obj);
            }
            if (!(obj instanceof SetOfInt)) {
                return false;
            }
            SetOfInt setOfInt = (SetOfInt) obj;
            if (setOfInt.size() != we()) {
                return false;
            }
            for (int i = 0; i < this.FH.length; i++) {
                int i2 = this.FH[i];
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
                iy.j3(th, 172440942628475880L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = -6206026017968922080L)
    public void gn(FileEntry fileEntry) {
        try {
            if (u7) {
                iy.tp(-6671820574459799408L, this, fileEntry);
            }
            VH(this.DW.getId(fileEntry));
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -6671820574459799408L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -7358055097390779360L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (u7) {
                iy.tp(-7773237639901596072L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.Zo);
            storeOutputStream.writeInt(this.VH);
            for (int i = 0; i < this.FH.length; i++) {
                int i2 = this.FH[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    storeOutputStream.writeInt(this.FH[i]);
                }
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -7773237639901596072L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 2049450010533894504L)
    public String toString() {
        try {
            if (u7) {
                iy.gn(1636535381058871180L, this);
            }
            String str = "{";
            for (int i = 0; i < this.FH.length; i++) {
                int i2 = this.FH[i];
                if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    if (i2 == Integer.MAX_VALUE) {
                        i2 = 0;
                    }
                    str = str + i2 + " " + this.DW.getFileEntry(i2).getPathString() + ", ";
                }
            }
            return str + "}";
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 1636535381058871180L, this);
            }
            throw th;
        }
    }

    @ey(method = -4741536494097588367L)
    public void u7(SetOfFileEntry setOfFileEntry) {
        try {
            if (u7) {
                iy.tp(6455872537627456319L, this, setOfFileEntry);
            }
            for (int i = 0; i < setOfFileEntry.FH.length; i++) {
                int i2 = setOfFileEntry.FH[i];
                if (i2 == Integer.MAX_VALUE) {
                    VH(0);
                } else if (i2 != 0 && i2 != Integer.MIN_VALUE) {
                    VH(i2);
                }
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 6455872537627456319L, this, setOfFileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2305038338887682475L)
    public int we() {
        try {
            if (u7) {
                iy.gn(-1137530722301540613L, this);
            }
            return this.Zo;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -1137530722301540613L, this);
            }
            throw th;
        }
    }

    @ey(method = -601954590120282164L)
    public SetOfFileEntry(FileSpace fileSpace, StoreInputStream storeInputStream) {
        try {
            a aVar = null;
            if (u7) {
                iy.EQ(-3044723276893776765L, null, fileSpace, storeInputStream);
            }
            this.j6 = new Iterator(this, aVar);
            this.DW = fileSpace;
            int i = storeInputStream.readInt();
            int i2 = storeInputStream.readInt();
            this.VH = i2;
            this.FH = new int[gn[i2]];
            this.v5 = 0;
            this.Zo = 0;
            for (int i3 = 0; i3 < i; i3++) {
                VH(storeInputStream.readInt());
            }
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -3044723276893776765L, null, fileSpace, storeInputStream);
            }
            throw th;
        }
    }
}
