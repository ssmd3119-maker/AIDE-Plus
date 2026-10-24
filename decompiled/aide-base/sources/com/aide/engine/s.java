package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -4933782201093643184L, container = -4933782201093643184L, user = true)
/* loaded from: classes.dex */
public class s implements l {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 2362166014735210488L)
    private final Class DW;

    @dy(field = 1782501115973262912L)
    private final l j6;

    static {
        iy.Zo(s.class);
    }

    @ey(method = -77000896197280489L)
    public s(l lVar, Class cls, Class cls2) {
        try {
            if (FH) {
                iy.we(-765366942442970775L, null, lVar, cls, cls2);
            }
            this.j6 = lVar;
            this.DW = cls2;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -765366942442970775L, null, lVar, cls, cls2);
            }
            throw th;
        }
    }

    @ey(method = 544860216682272936L)
    public String toString() {
        try {
            if (FH) {
                iy.gn(-1655237069751377068L, this);
            }
            return "(" + this.DW.getName() + ") " + this.j6;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1655237069751377068L, this);
            }
            throw th;
        }
    }
}
