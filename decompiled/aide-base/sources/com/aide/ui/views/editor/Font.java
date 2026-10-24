package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.graphics.Paint;
import android.graphics.Typeface;

@cy(clazz = -1402906950571771580L, container = -1402906950571771580L, user = true)
/* loaded from: classes.dex */
public class Font {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -1637551485023879887L)
    public boolean isFakeBoldText;

    @dy(field = 2373894905434763165L)
    public float textSize;

    @dy(field = -2529342134261062800L)
    public Typeface typeface;

    static {
        iy.Zo(Font.class);
    }

    @ey(method = 1915883698849301808L)
    public Font(float f, Typeface typeface, int i) {
        try {
            if (Hw) {
                iy.we(-168337655888775669L, null, new Float(f), typeface, new Integer(i));
            }
            this.typeface = Typeface.create(typeface, i);
            this.textSize = f;
            this.isFakeBoldText = ((i & 1) == 0 || typeface.isBold()) ? false : true;
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, -168337655888775669L, null, new Float(f), typeface, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 7229334201788387325L)
    public static boolean DW(Typeface typeface, float f) {
        try {
            if (Hw) {
                iy.EQ(1090149807440638067L, null, typeface, new Float(f));
            }
            Typeface typefaceCreate = Typeface.create(typeface, 1);
            return j6(typefaceCreate, f, !typefaceCreate.isBold()) == j6(Typeface.create(typeface, 0), f, false);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 1090149807440638067L, null, typeface, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = 177289077408575968L)
    private static float j6(Typeface typeface, float f, boolean z) {
        try {
            if (Hw) {
                iy.we(-103938136445258752L, null, typeface, new Float(f), new Boolean(z));
            }
            Paint paint = new Paint();
            paint.setFakeBoldText(z);
            paint.setTypeface(typeface);
            paint.setTextSize(f);
            return paint.measureText("public");
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, -103938136445258752L, null, typeface, new Float(f), new Boolean(z));
            }
            throw th;
        }
    }
}
