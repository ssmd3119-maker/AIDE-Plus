package abcd;

@cy(clazz = 5443718632469516595L, container = 5443718632469516595L, user = true)
/* loaded from: classes.dex */
public class u3 {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = -3652883959629807840L)
    private int[] DW;

    @dy(field = -1626608185379538636L)
    private int[] FH;

    @dy(field = 4057012066355179740L)
    private int[] Hw;

    @dy(field = 3483375617516397680L)
    private int[] j6;

    @dy(field = -1121017539610588755L)
    private int v5;

    @cy(clazz = 1212717644094915135L, container = 1212717644094915135L, user = true)
    public class b {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 930331025429668128L)
        public /* synthetic */ b(u3 u3Var, a aVar) {
            this(u3Var);
            try {
                if (j6) {
                    iy.EQ(144803306762288796L, null, u3Var, aVar);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.Mr(th, 144803306762288796L, null, u3Var, aVar);
                }
                throw th;
            }
        }

        @ey(method = 8050847440270419243L)
        private b(u3 u3Var) {
            try {
                if (j6) {
                    iy.tp(84587066694673035L, null, u3Var);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 84587066694673035L, null, u3Var);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(u3.class);
    }

    @ey(method = -3214876459842861372L)
    public u3() {
        a aVar = null;
        try {
            if (Zo) {
                iy.gn(-864148279812655675L, null);
            }
            new b(this, aVar);
            this.j6 = new int[3000];
            this.DW = new int[3000];
            this.FH = new int[1000];
            this.Hw = new int[1000];
            this.v5 = 0;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -864148279812655675L, null);
            }
            throw th;
        }
    }

    @ey(method = -2386525600946508219L)
    private void VH() {
        try {
            if (Zo) {
                iy.gn(-2632476617934229000L, this);
            }
            int length = (this.j6.length * 2) + 1;
            int[] iArr = new int[length];
            int[] iArr2 = new int[(this.j6.length * 2) + 1];
            int[] iArr3 = new int[(this.j6.length * 2) + 1];
            for (int i = 0; i < this.v5; i++) {
                int i2 = this.FH[i];
                if (i2 != 0) {
                    int i3 = this.Hw[i];
                    int i4 = (Integer.MAX_VALUE & i2) % length;
                    while (iArr[i4] != 0) {
                        i4++;
                        if (i4 >= length) {
                            i4 = 0;
                        }
                    }
                    iArr[i4] = i2;
                    iArr2[i4] = i3;
                }
            }
            this.j6 = iArr;
            this.DW = iArr2;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -2632476617934229000L, this);
            }
            throw th;
        }
    }

    @ey(method = -2378299335482449288L)
    private void gn() {
        try {
            if (Zo) {
                iy.gn(-2627875403769954099L, this);
            }
            int[] iArr = new int[(this.FH.length * 2) + 1];
            System.arraycopy(this.FH, 0, iArr, 0, this.FH.length);
            this.FH = iArr;
            int[] iArr2 = new int[(this.Hw.length * 2) + 1];
            System.arraycopy(this.Hw, 0, iArr2, 0, this.Hw.length);
            this.Hw = iArr2;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -2627875403769954099L, this);
            }
            throw th;
        }
    }

    @ey(method = -246590499763515392L)
    public boolean DW(int i) {
        int i2;
        try {
            if (Zo) {
                iy.u7(-274232321902677747L, this, i);
            }
            int[] iArr = this.j6;
            int length = iArr.length;
            int i3 = (Integer.MAX_VALUE & i) % length;
            do {
                i2 = iArr[i3];
                if (i2 == i) {
                    return true;
                }
                i3++;
                if (i3 >= length) {
                    i3 = 0;
                }
            } while (i2 != 0);
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -274232321902677747L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 41205314730443856L)
    public void FH(int i, int i2) {
        try {
            if (Zo) {
                iy.EQ(43492109073413895L, this, new Integer(i), new Integer(i2));
            }
            if (this.j6.length < this.v5 * 3) {
                VH();
            }
            if (this.FH.length <= this.v5) {
                gn();
            }
            this.FH[this.v5] = i;
            this.Hw[this.v5] = i2;
            this.v5++;
            int[] iArr = this.j6;
            int length = iArr.length;
            int i3 = (Integer.MAX_VALUE & i) % length;
            while (iArr[i3] != 0) {
                i3++;
                if (i3 >= length) {
                    i3 = 0;
                }
            }
            iArr[i3] = i;
            this.DW[i3] = i2;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 43492109073413895L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4303933732954615011L)
    public void Hw() {
        try {
            if (Zo) {
                iy.gn(-881371437075637632L, this);
            }
            if (this.FH.length <= this.v5) {
                gn();
            }
            this.FH[this.v5] = 0;
            this.v5++;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -881371437075637632L, this);
            }
            throw th;
        }
    }

    @ey(method = 1517072351848139024L)
    public void Zo() {
        int i;
        try {
            if (Zo) {
                iy.gn(-3396261419735885715L, this);
            }
            int[] iArr = this.j6;
            int length = iArr.length;
            int i2 = this.v5 - 1;
            this.v5 = i2;
            int i3 = this.FH[i2];
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
                int i6 = this.v5 - 1;
                this.v5 = i6;
                i3 = this.FH[i6];
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -3396261419735885715L, this);
            }
            throw th;
        }
    }

    @ey(method = -279152589044975085L)
    public void j6() {
        try {
            if (Zo) {
                iy.gn(-437668044999884160L, this);
            }
            if (this.v5 > 0) {
                for (int i = 0; i < this.j6.length; i++) {
                    this.j6[i] = 0;
                }
            }
            this.v5 = 0;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -437668044999884160L, this);
            }
            throw th;
        }
    }

    @ey(method = -3454438010530776383L)
    public int v5(int i) {
        int i2;
        try {
            if (Zo) {
                iy.u7(-3369606849428259000L, this, i);
            }
            int[] iArr = this.j6;
            int length = iArr.length;
            int i3 = (Integer.MAX_VALUE & i) % length;
            int i4 = -1;
            do {
                i2 = iArr[i3];
                if (i2 == i) {
                    i4 = this.DW[i3];
                }
                i3++;
                if (i3 >= length) {
                    i3 = 0;
                }
            } while (i2 != 0);
            return i4;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3369606849428259000L, this, new Integer(i));
            }
            throw th;
        }
    }
}
