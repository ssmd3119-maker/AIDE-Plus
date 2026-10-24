package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 1127103718700658792L, container = 1127103718700658792L, user = true)
/* loaded from: classes.dex */
public class m implements l {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 1470512555388930688L)
    private final l DW;

    @dy(field = 2390932251684259229L)
    private final l j6;

    static {
        iy.Zo(m.class);
    }

    @ey(method = 13336885123882745L)
    public m(l lVar, l lVar2) {
        try {
            if (FH) {
                iy.EQ(3141386852127688479L, null, lVar, lVar2);
            }
            this.j6 = lVar;
            this.DW = lVar2;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 3141386852127688479L, null, lVar, lVar2);
            }
            throw th;
        }
    }

    @ey(method = 1293543754401892889L)
    public String toString() {
        try {
            if (FH) {
                iy.gn(-2587857934923953943L, this);
            }
            return this.j6 + "[" + this.DW + "]";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2587857934923953943L, this);
            }
            throw th;
        }
    }
}
