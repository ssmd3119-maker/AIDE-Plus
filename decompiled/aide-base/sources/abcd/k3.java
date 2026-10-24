package abcd;

@cy(clazz = -3326378980488377480L, container = -3326378980488377480L, user = true)
/* loaded from: classes.dex */
public class k3 {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -1600048704983574111L)
    private int DW;

    @dy(field = 3312765268069062568L)
    private long[] j6;

    static {
        iy.Zo(k3.class);
    }

    @ey(method = 883085931526086477L)
    public k3() {
        try {
            if (FH) {
                iy.gn(-1520604431317412488L, null);
            }
            this.j6 = null;
            this.DW = 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1520604431317412488L, null);
            }
            throw th;
        }
    }

    @ey(method = 1034603368590660540L)
    public void DW() {
        try {
            if (FH) {
                iy.gn(2258090898471885312L, this);
            }
            this.DW = 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2258090898471885312L, this);
            }
            throw th;
        }
    }

    @ey(method = -3197046824470603200L)
    public long FH(int i) {
        try {
            if (FH) {
                iy.u7(2221685026128992244L, this, i);
            }
            if (this.j6 != null && i < this.j6.length && i < this.DW) {
                return this.j6[i];
            }
            return -1L;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 2221685026128992244L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1147320644851112615L)
    public void Hw(int i, long j) {
        try {
            if (FH) {
                iy.EQ(-374471799622429867L, this, new Integer(i), new Long(j));
            }
            if (this.j6 == null) {
                this.j6 = new long[Math.max(10, i + 1)];
            } else if (i >= this.j6.length) {
                long[] jArr = new long[Math.max(i + 1, (this.j6.length * 2) + 1)];
                System.arraycopy(this.j6, 0, jArr, 0, this.j6.length);
                this.j6 = jArr;
            }
            if (i >= this.DW) {
                this.DW = i + 1;
            }
            this.j6[i] = j;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -374471799622429867L, this, new Integer(i), new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 7091836922042064591L)
    public void j6(long j) {
        try {
            if (FH) {
                iy.tp(-1250435731425065133L, this, new Long(j));
            }
            if (this.j6 == null) {
                this.j6 = new long[10];
            } else if (this.DW >= this.j6.length) {
                long[] jArr = new long[(this.j6.length * 2) + 1];
                System.arraycopy(this.j6, 0, jArr, 0, this.j6.length);
                this.j6 = jArr;
            }
            long[] jArr2 = this.j6;
            int i = this.DW;
            this.DW = i + 1;
            jArr2[i] = j;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1250435731425065133L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -1252242825202962921L)
    public String toString() {
        try {
            if (FH) {
                iy.gn(3679935882327221183L, this);
            }
            String str = "{";
            for (int i = 0; i < this.DW; i++) {
                str = str + this.j6[i] + ", ";
            }
            return str + "}";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 3679935882327221183L, this);
            }
            throw th;
        }
    }
}
