package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 1602594521666738765L, container = 1602594521666738765L, user = true)
/* loaded from: classes.dex */
public class u implements l {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 251114052042369280L)
    private final String j6;

    static {
        iy.Zo(u.class);
    }

    @ey(method = -104148949719759384L)
    public u(String str) {
        try {
            if (DW) {
                iy.tp(-4722607489018260696L, null, str);
            }
            this.j6 = str;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -4722607489018260696L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1585277352280627920L)
    public String toString() {
        try {
            if (DW) {
                iy.gn(-3378484146070390995L, this);
            }
            return this.j6;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -3378484146070390995L, this);
            }
            throw th;
        }
    }
}
