package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 3214962432214181L, container = 3214962432214181L, user = true)
/* loaded from: classes.dex */
public class w {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -3361601819234885815L)
    private final String DW;

    @dy(field = 2210808304154366377L)
    private final String j6;

    static {
        iy.Zo(w.class);
    }

    @ey(method = 146514850072697617L)
    public w(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(1273521336372384320L, null, str, str2);
            }
            this.j6 = str;
            this.DW = str2;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1273521336372384320L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -2983828951274357061L)
    public String toString() {
        try {
            if (FH) {
                iy.gn(-216125814032075993L, this);
            }
            return this.DW + " ." + this.j6;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -216125814032075993L, this);
            }
            throw th;
        }
    }
}
