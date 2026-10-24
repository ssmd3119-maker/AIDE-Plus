package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 974190519053358909L, container = 974190519053358909L, user = true)
/* loaded from: classes.dex */
public class t implements l {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -3203517144640254351L)
    private final String DW;

    @dy(field = 2587027912386969504L)
    private final l j6;

    static {
        iy.Zo(t.class);
    }

    @ey(method = 1881670967103877675L)
    public t(l lVar, String str) {
        try {
            if (FH) {
                iy.EQ(-1895897418974995149L, null, lVar, str);
            }
            this.j6 = lVar;
            this.DW = str;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1895897418974995149L, null, lVar, str);
            }
            throw th;
        }
    }

    @ey(method = -496426064322327636L)
    public String toString() {
        try {
            if (FH) {
                iy.gn(-1396547904870289017L, this);
            }
            return this.DW + this.j6;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1396547904870289017L, this);
            }
            throw th;
        }
    }
}
