package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -5869603869117064877L, container = -5869603869117064877L, user = true)
/* loaded from: classes.dex */
public class p implements l {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -2165122280292590880L)
    private final Object j6;

    static {
        iy.Zo(p.class);
    }

    @ey(method = -304241622279319909L)
    public p(Object obj) {
        try {
            if (DW) {
                iy.tp(15273987377764496L, null, obj);
            }
            this.j6 = obj;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 15273987377764496L, null, obj);
            }
            throw th;
        }
    }

    @ey(method = 1115208202016823352L)
    public String toString() {
        try {
            if (DW) {
                iy.gn(-1204927327852527720L, this);
            }
            return this.j6 == null ? "null" : this.j6.toString();
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -1204927327852527720L, this);
            }
            throw th;
        }
    }
}
