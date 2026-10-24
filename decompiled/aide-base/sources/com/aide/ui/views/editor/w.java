package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.graphics.Rect;
import android.graphics.RectF;

@cy(clazz = 4995312689617170360L, container = 4995312689617170360L, user = true)
/* loaded from: classes.dex */
public class w {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = -1769357744743154985L)
    public float DW;

    @dy(field = 1899685279706700352L)
    public float FH;

    @dy(field = 2601668099258512911L)
    public float Hw;

    @dy(field = -1769244492495622660L)
    public float j6;

    static {
        iy.Zo(w.class);
    }

    @ey(method = -53919647402086920L)
    public w(w wVar) {
        try {
            if (v5) {
                iy.tp(-583964220007417511L, null, wVar);
            }
            this.j6 = wVar.j6;
            this.DW = wVar.DW;
            this.FH = wVar.FH;
            this.Hw = wVar.Hw;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -583964220007417511L, null, wVar);
            }
            throw th;
        }
    }

    @ey(method = 2341985796053789163L)
    public RectF j6() {
        try {
            if (v5) {
                iy.gn(-2168292519240769953L, this);
            }
            return new RectF(this.j6, this.DW, this.j6 + this.FH, this.DW + this.Hw);
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -2168292519240769953L, this);
            }
            throw th;
        }
    }

    @ey(method = 219113286877234740L)
    public w(Rect rect) {
        try {
            if (v5) {
                iy.tp(919612054478021071L, null, rect);
            }
            this.j6 = rect.left;
            this.DW = rect.top;
            this.FH = rect.right - rect.left;
            this.Hw = rect.bottom - rect.top;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 919612054478021071L, null, rect);
            }
            throw th;
        }
    }
}
