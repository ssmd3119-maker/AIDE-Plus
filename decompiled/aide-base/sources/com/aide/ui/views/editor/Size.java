package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 5048987596455220867L, container = 5048987596455220867L, user = true)
/* loaded from: classes.dex */
public class Size {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -280379388879302420L)
    public float j6;

    static {
        iy.Zo(Size.class);
    }

    @ey(method = -3819524222510105005L)
    public Size(float f, float f2) {
        try {
            if (DW) {
                iy.EQ(1316459330835498964L, null, new Float(f), new Float(f2));
            }
            this.j6 = f;
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, 1316459330835498964L, null, new Float(f), new Float(f2));
            }
            throw th;
        }
    }
}
