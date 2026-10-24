package abcd;

import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 4379644660961656000L, container = 4379644660961656000L, user = true)
/* loaded from: classes.dex */
public class y3 {

    @fy
    private static /* synthetic */ boolean VH;

    @dy(field = 301422686127427072L)
    private static final int[] Zo;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = -1044293497519477125L)
    private long[] DW;

    @dy(field = 1640401021608463899L)
    private int FH;

    @dy(field = 998862536907858945L)
    private int Hw;

    @dy(field = 1644057881820727848L)
    private long[] j6;

    @dy(field = 4428228052452188L)
    private int v5;

    @cy(clazz = 1359724431656601600L, container = 1359724431656601600L, user = true)
    public class b {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -170080863744340395L)
        public /* synthetic */ b(y3 y3Var, a aVar) {
            this(y3Var);
            try {
                if (j6) {
                    iy.EQ(-1390473997813720960L, null, y3Var, aVar);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.Mr(th, -1390473997813720960L, null, y3Var, aVar);
                }
                throw th;
            }
        }

        @ey(method = -122502422323718325L)
        private b(y3 y3Var) {
            try {
                if (j6) {
                    iy.tp(563252126241925448L, null, y3Var);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 563252126241925448L, null, y3Var);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(y3.class);
            if (VH) {
                iy.gn(356802911305228224L, null);
            }
            Zo = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
            new y3();
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 356802911305228224L, null);
            }
            throw th;
        }
    }

    @ey(method = -2467952688390029613L)
    public y3() {
        a aVar = null;
        try {
            if (VH) {
                iy.gn(2853887064396271345L, null);
            }
            new b(this, aVar);
            this.v5 = 1;
            this.j6 = new long[Zo[1]];
            this.FH = 0;
            this.Hw = 0;
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 2853887064396271345L, null);
            }
            throw th;
        }
    }

    @ey(method = -1643887916944616200L)
    private void Hw() {
        long[] jArr;
        try {
            if (VH) {
                iy.gn(-1257813617015926935L, this);
            }
            if (this.Hw * 2 > this.j6.length) {
                int i = this.v5 + 1;
                this.v5 = i;
                this.DW = null;
                jArr = new long[Zo[i]];
            } else if (this.DW == null || this.DW.length != this.j6.length) {
                this.DW = this.j6;
                jArr = new long[Zo[this.v5]];
            } else {
                jArr = this.DW;
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    jArr[i2] = 0;
                }
                this.DW = this.j6;
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
                    i3++;
                }
            }
            this.j6 = jArr;
            this.FH = i3;
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -1257813617015926935L, this);
            }
            throw th;
        }
    }

    @ey(method = 1680382295144033285L)
    public boolean DW(long j) {
        try {
            if (VH) {
                iy.tp(-1329487767138827152L, this, new Long(j));
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
            if (gn) {
                iy.j3(th, -1329487767138827152L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -1667367950380009129L)
    public void FH(long j) {
        try {
            if (VH) {
                iy.tp(-1028650398253309072L, this, new Long(j));
            }
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            long j2 = Long.MAX_VALUE & j;
            int length = (int) (j2 % this.j6.length);
            int length2 = ((int) (j2 % (this.j6.length - 2))) + 1;
            long j3 = this.j6[length];
            int i = -1;
            while (j3 != 0) {
                if (j3 == j) {
                    return;
                }
                if (j3 == Long.MIN_VALUE) {
                    i = length;
                }
                length = (length + length2) % this.j6.length;
                j3 = this.j6[length];
            }
            if (i != -1) {
                length = i;
            }
            this.j6[length] = j;
            if (i == -1) {
                this.FH++;
            }
            this.Hw++;
            if (this.FH * 2 > this.j6.length) {
                Hw();
            }
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -1028650398253309072L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -191345094891025933L)
    public boolean equals(Object obj) {
        try {
            if (VH) {
                iy.tp(146393395345701740L, this, obj);
            }
            if (!(obj instanceof y3)) {
                return false;
            }
            y3 y3Var = (y3) obj;
            if (y3Var.v5() != v5()) {
                return false;
            }
            for (int i = 0; i < this.j6.length; i++) {
                long j = this.j6[i];
                if (j != 0 && j != Long.MIN_VALUE) {
                    if (j == Long.MAX_VALUE) {
                        j = 0;
                    }
                    if (!y3Var.DW(j)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 146393395345701740L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = 1303438245705848000L)
    public void j6() {
        try {
            if (VH) {
                iy.gn(830952819050231647L, this);
            }
            if (this.FH > 0) {
                for (int i = 0; i < this.j6.length; i++) {
                    this.j6[i] = 0;
                }
                this.FH = 0;
                this.Hw = 0;
            }
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 830952819050231647L, this);
            }
            throw th;
        }
    }

    @ey(method = 1588434002662106721L)
    public String toString() {
        try {
            if (VH) {
                iy.gn(-2040058579844368736L, this);
            }
            String str = "{";
            for (int i = 0; i < this.j6.length; i++) {
                long j = this.j6[i];
                if (j != 0 && j != Long.MIN_VALUE) {
                    str = j == Long.MAX_VALUE ? str + "0, " : str + j + ", ";
                }
            }
            return str + "}";
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -2040058579844368736L, this);
            }
            throw th;
        }
    }

    @ey(method = -482496695454680712L)
    public int v5() {
        try {
            if (VH) {
                iy.gn(203532264663468201L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 203532264663468201L, this);
            }
            throw th;
        }
    }
}
