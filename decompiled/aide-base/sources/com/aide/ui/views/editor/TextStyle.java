package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -3522944750472055601L, container = -3522944750472055601L, user = true)
/* loaded from: classes.dex */
public class TextStyle {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -952675225964569901L)
    private Color FH;

    @dy(field = -1504950536546159632L)
    private Color color;

    @dy(field = -137484257438815089L)
    private int typefaceStyle;

    static {
        iy.Zo(TextStyle.class);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = 5313006939736889640L)
    public TextStyle(int i, int i2) {
        this(new Color(i), null, i2);
        try {
            if (Hw) {
                iy.EQ(-1936666221700393304L, null, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -1936666221700393304L, null, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4420752066228924108L)
    public Color FH() {
        try {
            if (Hw) {
                iy.gn(-1444770656751685552L, this);
            }
            return this.color;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1444770656751685552L, this);
            }
            throw th;
        }
    }

    @ey(method = -878518125250269664L)
    public int getTypefaceStyle() {
        try {
            if (Hw) {
                iy.gn(-4341010216536672860L, this);
            }
            return this.typefaceStyle;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -4341010216536672860L, this);
            }
            throw th;
        }
    }

    @ey(method = 3159600266670207023L)
    public Color j6() {
        try {
            if (Hw) {
                iy.gn(-2621703902316282345L, this);
            }
            return this.FH;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2621703902316282345L, this);
            }
            throw th;
        }
    }

    @ey(method = 537715477764165149L)
    public TextStyle(Color color, Color color2, int i) {
        try {
            if (Hw) {
                iy.we(2025310141569325533L, null, color, color2, new Integer(i));
            }
            this.color = color;
            this.FH = color2;
            this.typefaceStyle = i;
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, 2025310141569325533L, null, color, color2, new Integer(i));
            }
            throw th;
        }
    }
}
