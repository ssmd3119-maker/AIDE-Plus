package abcd;

import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;

@cy(clazz = 2412108700048208304L, container = 2412108700048208304L, user = true)
/* loaded from: classes.dex */
public class f3<E extends Entity> {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = -1639865249189478819L)
    private int[] DW;

    @dy(field = 4077961008736936475L)
    private int[] FH;

    @dy(field = 5104161043012864224L)
    private int[] Hw;

    @dy(field = 3304758390261823825L)
    private int[] VH;

    @dy(field = -1517517138304414608L)
    private int[] Zo;

    @dy(field = -2510487540499569500L)
    private int[] gn;

    @dy(field = -279245768758236252L)
    private final EntitySpace j6;

    @dy(field = -3160406126651166828L)
    private int u7;

    @dy(field = -983839462391291625L)
    private int[] v5;

    @cy(clazz = 2976095549421543132L, container = 2976095549421543132L, user = true)
    public class b {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 8508654746975336772L)
        public /* synthetic */ b(f3 f3Var, a aVar) {
            this(f3Var);
            try {
                if (j6) {
                    iy.EQ(17646037302713061L, null, f3Var, aVar);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.Mr(th, 17646037302713061L, null, f3Var, aVar);
                }
                throw th;
            }
        }

        @ey(method = -7520719832321529L)
        private b(f3 f3Var) {
            try {
                if (j6) {
                    iy.tp(-650137682411319808L, null, f3Var);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -650137682411319808L, null, f3Var);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(f3.class);
    }

    @ey(method = 68770858597668225L)
    public f3(EntitySpace entitySpace) {
        a aVar = null;
        try {
            if (tp) {
                iy.tp(-191451201406700495L, null, entitySpace);
            }
            new b(this, aVar);
            this.DW = new int[3000];
            this.FH = new int[3000];
            this.Hw = new int[3000];
            this.v5 = new int[1000];
            this.Zo = new int[1000];
            this.VH = new int[1000];
            this.gn = new int[1000];
            this.u7 = 0;
            this.j6 = entitySpace;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -191451201406700495L, null, entitySpace);
            }
            throw th;
        }
    }

    @ey(method = -895119657797265008L)
    private void VH() {
        try {
            if (tp) {
                iy.gn(-1948981486404678093L, this);
            }
            int length = (this.DW.length * 2) + 1;
            int[] iArr = new int[length];
            int[] iArr2 = new int[(this.DW.length * 2) + 1];
            int[] iArr3 = new int[(this.DW.length * 2) + 1];
            for (int i = 0; i < this.u7; i++) {
                int i2 = this.v5[i];
                if (i2 != 0) {
                    int i3 = this.Zo[i];
                    int i4 = this.VH[i];
                    int i5 = (Integer.MAX_VALUE & i2) % length;
                    while (iArr[i5] != 0) {
                        i5++;
                        if (i5 >= length) {
                            i5 = 0;
                        }
                    }
                    iArr[i5] = i2;
                    iArr2[i5] = i4;
                    iArr3[i5] = i3;
                }
            }
            this.DW = iArr;
            this.Hw = iArr3;
            this.FH = iArr2;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1948981486404678093L, this);
            }
            throw th;
        }
    }

    @ey(method = -881973718615840885L)
    private void gn() {
        try {
            if (tp) {
                iy.gn(-1942447477616393604L, this);
            }
            int[] iArr = new int[(this.v5.length * 2) + 1];
            System.arraycopy(this.v5, 0, iArr, 0, this.v5.length);
            this.v5 = iArr;
            int[] iArr2 = new int[(this.Zo.length * 2) + 1];
            System.arraycopy(this.Zo, 0, iArr2, 0, this.Zo.length);
            this.Zo = iArr2;
            int[] iArr3 = new int[(this.VH.length * 2) + 1];
            System.arraycopy(this.VH, 0, iArr3, 0, this.VH.length);
            this.VH = iArr3;
            int[] iArr4 = new int[(this.gn.length * 2) + 1];
            System.arraycopy(this.gn, 0, iArr4, 0, this.gn.length);
            this.gn = iArr4;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1942447477616393604L, this);
            }
            throw th;
        }
    }

    @ey(method = -1523809236054889476L)
    public boolean DW(int i, int i2) {
        int i3;
        try {
            if (tp) {
                iy.EQ(720261031918800395L, this, new Integer(i), new Integer(i2));
            }
            int[] iArr = this.DW;
            int length = iArr.length;
            int i4 = (Integer.MAX_VALUE & i) % length;
            do {
                i3 = iArr[i4];
                if (i3 == i && this.Hw[i4] == i2) {
                    return true;
                }
                i4++;
                if (i4 >= length) {
                    i4 = 0;
                }
            } while (i3 != 0);
            return false;
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 720261031918800395L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2361569141480022016L)
    public void FH(int i, E e, int i2) {
        try {
            if (tp) {
                iy.we(-844519042696398525L, this, new Integer(i), e, new Integer(i2));
            }
            if (this.DW.length < this.u7 * 3) {
                VH();
            }
            if (this.v5.length <= this.u7) {
                gn();
            }
            this.v5[this.u7] = i;
            this.Zo[this.u7] = i2;
            this.VH[this.u7] = this.j6.getId(e);
            this.u7++;
            int[] iArr = this.DW;
            int length = iArr.length;
            int i3 = (Integer.MAX_VALUE & i) % length;
            while (iArr[i3] != 0) {
                i3++;
                if (i3 >= length) {
                    i3 = 0;
                }
            }
            iArr[i3] = i;
            this.FH[i3] = this.j6.getId(e);
            this.Hw[i3] = i2;
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -844519042696398525L, this, new Integer(i), e, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1030004030958557200L)
    public void Hw() {
        try {
            if (tp) {
                iy.gn(-3222138507580938875L, this);
            }
            if (this.v5.length <= this.u7) {
                gn();
            }
            this.v5[this.u7] = 0;
            this.u7++;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -3222138507580938875L, this);
            }
            throw th;
        }
    }

    @ey(method = -3790577157200927985L)
    public void Zo() {
        int i;
        try {
            if (tp) {
                iy.gn(2272221747373726560L, this);
            }
            int[] iArr = this.DW;
            int length = iArr.length;
            int i2 = this.u7 - 1;
            this.u7 = i2;
            int i3 = this.v5[i2];
            while (i3 != 0) {
                int i4 = (Integer.MAX_VALUE & i3) % length;
                int i5 = -1;
                do {
                    i = iArr[i4];
                    if (i == i3) {
                        i5 = i4;
                    }
                    i4++;
                    if (i4 >= length) {
                        i4 = 0;
                    }
                } while (i != 0);
                if (i5 != -1) {
                    iArr[i5] = 0;
                }
                int i6 = this.u7 - 1;
                this.u7 = i6;
                i3 = this.v5[i6];
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 2272221747373726560L, this);
            }
            throw th;
        }
    }

    @ey(method = -628319908447000128L)
    public void j6() {
        try {
            if (tp) {
                iy.gn(-236768840178953715L, this);
            }
            if (this.u7 > 0) {
                for (int i = 0; i < this.DW.length; i++) {
                    this.DW[i] = 0;
                }
            }
            this.u7 = 0;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -236768840178953715L, this);
            }
            throw th;
        }
    }

    @ey(method = -26832188998160659L)
    public E v5(int i, int i2) {
        int i3;
        try {
            if (tp) {
                iy.EQ(-3731759404714780748L, this, new Integer(i), new Integer(i2));
            }
            int[] iArr = this.DW;
            int length = iArr.length;
            int i4 = (Integer.MAX_VALUE & i) % length;
            int i5 = -1;
            do {
                i3 = iArr[i4];
                if (i3 == i && this.Hw[i4] == i2) {
                    i5 = this.FH[i4];
                }
                i4++;
                if (i4 >= length) {
                    i4 = 0;
                }
            } while (i3 != 0);
            return (E) this.j6.getEntity(i5);
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -3731759404714780748L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
