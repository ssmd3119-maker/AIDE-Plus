package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -2113641575223505767L, container = -2113641575223505767L, user = true)
/* loaded from: classes.dex */
public class o implements l {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -1943702965759404421L)
    private final l DW;

    @dy(field = -2052139946700345411L)
    private final String FH;

    @dy(field = 81248612460903040L)
    private final l j6;

    static {
        iy.Zo(o.class);
    }

    @ey(method = 1380873554139074976L)
    public o(l lVar, l lVar2, String str) {
        try {
            if (Hw) {
                iy.we(6399633874708922536L, null, lVar, lVar2, str);
            }
            this.j6 = lVar2;
            this.DW = lVar;
            this.FH = str;
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, 6399633874708922536L, null, lVar, lVar2, str);
            }
            throw th;
        }
    }

    @ey(method = 686710219489835124L)
    public String toString() {
        try {
            if (Hw) {
                iy.gn(2240782965461983553L, this);
            }
            return this.DW + this.FH + this.j6;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 2240782965461983553L, this);
            }
            throw th;
        }
    }
}
