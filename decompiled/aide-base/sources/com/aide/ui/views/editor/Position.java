package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -4197706724417731056L, container = -4197706724417731056L, user = true)
/* loaded from: classes.dex */
public class Position {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -2583418934560196880L)
    private int column;

    @dy(field = -79062537764929040L)
    private int line;

    static {
        iy.Zo(Position.class);
    }

    @ey(method = 1354829327235736515L)
    public Position(int i, int i2) {
        try {
            if (FH) {
                iy.EQ(1373550584852295968L, null, new Integer(i), new Integer(i2));
            }
            this.line = i;
            this.column = i2;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1373550584852295968L, null, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1263770420310344283L)
    public int getColumn() {
        try {
            if (FH) {
                iy.gn(-879183588170532600L, this);
            }
            return this.column;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -879183588170532600L, this);
            }
            throw th;
        }
    }

    @ey(method = 1404565886371334815L)
    public int getLine() {
        try {
            if (FH) {
                iy.gn(-1503777317860867368L, this);
            }
            return this.line;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1503777317860867368L, this);
            }
            throw th;
        }
    }

    @ey(method = -3519263681573461381L)
    public String toString() {
        try {
            if (FH) {
                iy.gn(1153480553499251620L, this);
            }
            return this.line + ", " + this.column;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1153480553499251620L, this);
            }
            throw th;
        }
    }
}
