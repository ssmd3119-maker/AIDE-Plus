package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -1991496644882198913L, container = -1991496644882198913L, user = true)
/* loaded from: classes.dex */
public final class v {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -1216802409054557981L)
    private final int DW;

    @dy(field = -2548004457823135616L)
    private final String FH;

    @dy(field = 2329768836414139879L)
    private final int j6;

    static {
        iy.Zo(v.class);
    }

    @ey(method = -95482627019616348L)
    public v(String str, int i, int i2) {
        try {
            if (Hw) {
                iy.we(2956724040647298048L, null, str, new Integer(i), new Integer(i2));
            }
            this.j6 = i;
            this.DW = i2;
            this.FH = str;
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, 2956724040647298048L, null, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -3283096251268446720L)
    public int DW() {
        try {
            if (Hw) {
                iy.gn(2397784624778008467L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 2397784624778008467L, this);
            }
            throw th;
        }
    }

    @ey(method = 4335186798038193311L)
    public String FH() {
        try {
            if (Hw) {
                iy.gn(3976824193543907708L, this);
            }
            return this.FH;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 3976824193543907708L, this);
            }
            throw th;
        }
    }

    @ey(method = 2213558270365137836L)
    public int Hw() {
        try {
            if (Hw) {
                iy.gn(-2199888773323200649L, this);
            }
            return this.j6;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2199888773323200649L, this);
            }
            throw th;
        }
    }

    @ey(method = -519884908876103680L)
    public boolean equals(Object obj) {
        try {
            if (Hw) {
                iy.tp(-334801406093349735L, this, obj);
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            if (this.j6 == vVar.j6 && this.DW == vVar.DW) {
                return this.FH.equals(vVar.FH);
            }
            return false;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -334801406093349735L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = 574622323140118239L)
    public int hashCode() {
        try {
            if (Hw) {
                iy.gn(-27858242320564320L, this);
            }
            return this.FH.hashCode() + this.j6 + this.DW;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -27858242320564320L, this);
            }
            throw th;
        }
    }

    @ey(method = -1792516892697568079L)
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public v clone() {
        try {
            if (Hw) {
                iy.gn(2475302012646589176L, this);
            }
            return new v(this.FH, this.j6, this.DW);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 2475302012646589176L, this);
            }
            throw th;
        }
    }
}
