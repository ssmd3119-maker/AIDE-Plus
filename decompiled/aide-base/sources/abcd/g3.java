package abcd;

@cy(clazz = 139850406627490039L, container = 139850406627490039L, user = true)
/* loaded from: classes.dex */
public class g3 {

    @gy
    private static /* synthetic */ boolean tp;

    @fy
    private static /* synthetic */ boolean u7;

    @dy(field = 2234790382728710400L)
    private int[] DW;

    @dy(field = -3089744435556921903L)
    private int[] FH;

    @dy(field = 2193562336037001648L)
    private int[] Hw;

    @dy(field = 302851622689081037L)
    private int[] VH;

    @dy(field = 1455662942591099216L)
    private int[] Zo;

    @dy(field = 1900573222217741391L)
    private int gn;

    @dy(field = -2894527492609872896L)
    private int[] j6;

    @dy(field = 3729500952291843935L)
    private int[] v5;

    static {
        iy.Zo(g3.class);
    }

    @ey(method = 1428290386659986944L)
    public g3() {
        try {
            if (u7) {
                iy.gn(4951732032586035688L, null);
            }
            this.j6 = new int[3000];
            this.DW = new int[3000];
            this.FH = new int[3000];
            this.Hw = new int[1000];
            this.v5 = new int[1000];
            this.Zo = new int[1000];
            this.VH = new int[1000];
            this.gn = 0;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 4951732032586035688L, null);
            }
            throw th;
        }
    }

    @ey(method = 2314832306418961499L)
    private void gn() {
        try {
            if (u7) {
                iy.gn(2123548836139659431L, this);
            }
            int length = (this.j6.length * 2) + 1;
            int[] iArr = new int[length];
            int[] iArr2 = new int[(this.j6.length * 2) + 1];
            int[] iArr3 = new int[(this.j6.length * 2) + 1];
            for (int i = 0; i < this.gn; i++) {
                int i2 = this.Hw[i];
                if (i2 != 0) {
                    int i3 = this.v5[i];
                    int i4 = this.Zo[i];
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
            this.j6 = iArr;
            this.FH = iArr3;
            this.DW = iArr2;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 2123548836139659431L, this);
            }
            throw th;
        }
    }

    @ey(method = 2338744303475269500L)
    private void u7() {
        try {
            if (u7) {
                iy.gn(2145511406180766624L, this);
            }
            int[] iArr = new int[(this.Hw.length * 2) + 1];
            System.arraycopy(this.Hw, 0, iArr, 0, this.Hw.length);
            this.Hw = iArr;
            int[] iArr2 = new int[(this.v5.length * 2) + 1];
            System.arraycopy(this.v5, 0, iArr2, 0, this.v5.length);
            this.v5 = iArr2;
            int[] iArr3 = new int[(this.Zo.length * 2) + 1];
            System.arraycopy(this.Zo, 0, iArr3, 0, this.Zo.length);
            this.Zo = iArr3;
            int[] iArr4 = new int[(this.VH.length * 2) + 1];
            System.arraycopy(this.VH, 0, iArr4, 0, this.VH.length);
            this.VH = iArr4;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 2145511406180766624L, this);
            }
            throw th;
        }
    }

    @ey(method = -169449353842715613L)
    public boolean DW(int i, int i2) {
        int i3;
        try {
            if (u7) {
                iy.EQ(-326601633536781153L, this, new Integer(i), new Integer(i2));
            }
            int[] iArr = this.j6;
            int length = iArr.length;
            int i4 = (Integer.MAX_VALUE & i) % length;
            do {
                i3 = iArr[i4];
                if (i3 == i && this.FH[i4] == i2) {
                    return true;
                }
                i4++;
                if (i4 >= length) {
                    i4 = 0;
                }
            } while (i3 != 0);
            return false;
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -326601633536781153L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -3670561704443728331L)
    public void FH(int i, int i2, int i3) {
        try {
            if (u7) {
                iy.we(-826368047139182835L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (this.j6.length < this.gn * 3) {
                gn();
            }
            if (this.Hw.length <= this.gn) {
                u7();
            }
            this.Hw[this.gn] = i;
            this.v5[this.gn] = i3;
            this.Zo[this.gn] = i2;
            this.gn++;
            int[] iArr = this.j6;
            int length = iArr.length;
            int i4 = (Integer.MAX_VALUE & i) % length;
            while (iArr[i4] != 0) {
                i4++;
                if (i4 >= length) {
                    i4 = 0;
                }
            }
            iArr[i4] = i;
            this.DW[i4] = i2;
            this.FH[i4] = i3;
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, -826368047139182835L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 3111128707513146005L)
    public void Hw() {
        try {
            if (u7) {
                iy.gn(772532352875646789L, this);
            }
            if (this.Hw.length <= this.gn) {
                u7();
            }
            this.Hw[this.gn] = 0;
            this.gn++;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 772532352875646789L, this);
            }
            throw th;
        }
    }

    @ey(method = 330293927447983200L)
    public void VH() {
        int i;
        try {
            if (u7) {
                iy.gn(-1590007234940783220L, this);
            }
            int[] iArr = this.j6;
            int length = iArr.length;
            int i2 = this.gn - 1;
            this.gn = i2;
            int i3 = this.Hw[i2];
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
                int i6 = this.gn - 1;
                this.gn = i6;
                i3 = this.Hw[i6];
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -1590007234940783220L, this);
            }
            throw th;
        }
    }

    @ey(method = 3268699038391999380L)
    public int Zo(int i, int i2) {
        int i3;
        try {
            if (u7) {
                iy.EQ(4786214699952956160L, this, new Integer(i), new Integer(i2));
            }
            int[] iArr = this.j6;
            int length = iArr.length;
            int i4 = (Integer.MAX_VALUE & i) % length;
            int i5 = -1;
            do {
                i3 = iArr[i4];
                if (i3 == i && this.FH[i4] == i2) {
                    i5 = this.DW[i4];
                }
                i4++;
                if (i4 >= length) {
                    i4 = 0;
                }
            } while (i3 != 0);
            return i5;
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, 4786214699952956160L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1046004730061359141L)
    public void j6() {
        try {
            if (u7) {
                iy.gn(-269503305327401943L, this);
            }
            if (this.gn > 0) {
                for (int i = 0; i < this.j6.length; i++) {
                    this.j6[i] = 0;
                }
            }
            this.gn = 0;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -269503305327401943L, this);
            }
            throw th;
        }
    }

    @ey(method = 3170515177459401288L)
    public void v5() {
        try {
            if (u7) {
                iy.gn(822998535729344616L, this);
            }
            if (this.Hw.length <= this.gn) {
                u7();
            }
            this.Hw[this.gn] = 0;
            this.gn++;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 822998535729344616L, this);
            }
            throw th;
        }
    }
}
