package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 7418598902998530225L, container = 7418598902998530225L, user = true)
/* loaded from: classes.dex */
public class q implements l {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = 1702402661245362377L)
    private final String DW;

    @dy(field = 3363066909263371761L)
    private final String FH;

    @dy(field = -1061912428789299759L)
    private final l Hw;

    @dy(field = 99165816560974272L)
    private final boolean j6;

    static {
        iy.Zo(q.class);
    }

    @ey(method = 527054717890486512L)
    public q(boolean z, boolean z2, String str, String str2, l lVar) {
        try {
            if (v5) {
                iy.J8(-1357907814218154240L, null, new Boolean(z), new Boolean(z2), str, str2, lVar);
            }
            this.j6 = z;
            this.DW = str;
            this.FH = str2;
            this.Hw = lVar;
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, -1357907814218154240L, null, new Boolean(z), new Boolean(z2), str, str2, lVar);
            }
            throw th;
        }
    }

    @ey(method = -826335020234121013L)
    public String toString() {
        String str;
        try {
            if (v5) {
                iy.gn(3476766796497400048L, this);
            }
            StringBuilder sb = new StringBuilder();
            if (this.j6) {
                str = "";
            } else {
                str = this.Hw + ".";
            }
            sb.append(str);
            sb.append("(");
            sb.append(this.DW);
            sb.append(").");
            sb.append(this.FH);
            return sb.toString();
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 3476766796497400048L, this);
            }
            throw th;
        }
    }
}
