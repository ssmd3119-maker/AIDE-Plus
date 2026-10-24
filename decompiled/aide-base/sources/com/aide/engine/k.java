package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -1140929093877866676L, container = -1140929093877866676L, user = true)
/* loaded from: classes.dex */
public final class k {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -2921231449288353880L)
    private final String DW;

    @dy(field = -3480541864810991572L)
    private final String FH;

    @dy(field = 3384090264454787793L)
    private final String j6;

    static {
        iy.Zo(k.class);
    }

    @ey(method = -1001963199653052051L)
    public k(String str, String str2, String str3) {
        try {
            if (Hw) {
                iy.we(-2874216031776284720L, null, str, str2, str3);
            }
            this.j6 = str;
            this.DW = str2;
            this.FH = str3;
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, -2874216031776284720L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = -303510221621795776L)
    public String DW() {
        try {
            if (Hw) {
                iy.gn(-2394207721300312071L, this);
            }
            return this.j6;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2394207721300312071L, this);
            }
            throw th;
        }
    }

    @ey(method = 2591478844050112005L)
    public String FH() {
        try {
            if (Hw) {
                iy.gn(-6868480586795416820L, this);
            }
            return this.FH;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -6868480586795416820L, this);
            }
            throw th;
        }
    }

    @ey(method = 129845943530385387L)
    public String Hw() {
        try {
            if (Hw) {
                iy.gn(4839711584149375392L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 4839711584149375392L, this);
            }
            throw th;
        }
    }

    @ey(method = 30123905419786731L)
    public boolean equals(Object obj) {
        try {
            if (Hw) {
                iy.tp(-136474242748518240L, this, obj);
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (this.j6.equals(kVar.j6) && this.DW.equals(kVar.DW)) {
                return this.FH.equals(kVar.FH);
            }
            return false;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -136474242748518240L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = -532259797150683360L)
    public int hashCode() {
        try {
            if (Hw) {
                iy.gn(-1121876085216528213L, this);
            }
            return this.j6.hashCode() + this.DW.hashCode() + this.FH.hashCode();
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1121876085216528213L, this);
            }
            throw th;
        }
    }

    @ey(method = 1955225951092875804L)
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public k clone() {
        try {
            if (Hw) {
                iy.gn(-2123964332879944851L, this);
            }
            return new k(this.j6, this.DW, this.FH);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2123964332879944851L, this);
            }
            throw th;
        }
    }
}
