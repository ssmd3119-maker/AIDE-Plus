package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;

@cy(clazz = 1290225752860614315L, container = 1290225752860614315L, user = true)
/* loaded from: classes.dex */
public class ActionBarNoTabs extends Drawable {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -1783738127019336125L)
    private MainActivity j6;

    static {
        iy.Zo(ActionBarNoTabs.class);
    }

    @ey(method = -171620133194561899L)
    public ActionBarNoTabs(MainActivity mainActivity) {
        try {
            if (DW) {
                iy.tp(-5717877600934059696L, null, mainActivity);
            }
            this.j6 = mainActivity;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -5717877600934059696L, null, mainActivity);
            }
            throw th;
        }
    }

    @ey(method = -4306881569060215611L)
    private void j6(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Paint paint) {
        try {
            if (DW) {
                iy.QX(-874037161975678769L, this, new Object[]{canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Float(f8), paint});
            }
            canvas.save();
            RoundRectShape roundRectShape = new RoundRectShape(new float[]{f5, f5, f6, f6, f8, f8, f7, f7}, null, null);
            roundRectShape.resize(f3 - f, f4 - f2);
            canvas.translate(f, f2);
            roundRectShape.draw(canvas, paint);
            canvas.restore();
        } catch (Throwable th) {
            if (FH) {
                iy.rN(th, -874037161975678769L, this, new Object[]{canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Float(f8), paint});
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = -256807712321080L)
    public void draw(Canvas canvas) {
        try {
            if (DW) {
                iy.tp(941230264274022204L, this, canvas);
            }
            Rect bounds = getBounds();
            float f = this.j6.getResources().getDisplayMetrics().density;
            float fP8 = this.j6.P8();
            float f2 = 2.0f * f;
            float f3 = 3.0f * f;
            Paint paint = new Paint(1);
            paint.setShadowLayer(f2, -f2, f2, this.j6.getResources().getColor(2131034116));
            paint.setColor(this.j6.getResources().getColor(2131034114));
            j6(canvas, fP8 + f3, bounds.top - f3, bounds.right + f3, bounds.bottom - f3, 0.0f, 0.0f, f * 13.0f, 0.0f, paint);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 941230264274022204L, this, canvas);
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = 4542588601946540624L)
    public int getOpacity() {
        try {
            if (!DW) {
                return -1;
            }
            iy.gn(11479826695116416L, this);
            return -1;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 11479826695116416L, this);
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = 1665766039509202452L)
    public void setAlpha(int i) {
        try {
            if (DW) {
                iy.u7(226122081121546584L, this, i);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 226122081121546584L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = -2510686491530276333L)
    public void setColorFilter(ColorFilter colorFilter) {
        try {
            if (DW) {
                iy.tp(1102827172513932925L, this, colorFilter);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 1102827172513932925L, this, colorFilter);
            }
            throw th;
        }
    }
}
