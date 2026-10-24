package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -5197172455537187640L, container = -5197172455537187640L, user = true)
/* loaded from: classes.dex */
public class n implements l {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 1086701286124304160L)
    private final l j6;

    static {
        iy.Zo(n.class);
    }

    @ey(method = -259835631391435L)
    public n(l lVar) {
        try {
            if (DW) {
                iy.tp(822118388362484519L, null, lVar);
            }
            this.j6 = lVar;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 822118388362484519L, null, lVar);
            }
            throw th;
        }
    }

    @ey(method = 58954552361465908L)
    public String toString() {
        try {
            if (DW) {
                iy.gn(-2562119126174929008L, this);
            }
            return this.j6 + ".length";
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -2562119126174929008L, this);
            }
            throw th;
        }
    }
}
