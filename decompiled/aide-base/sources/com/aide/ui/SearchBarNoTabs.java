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

@cy(clazz = 582954128950735584L, container = 582954128950735584L, user = true)
/* loaded from: classes.dex */
public class SearchBarNoTabs extends Drawable {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 784127598799697328L)
    private MainActivity j6;

    static {
        iy.Zo(SearchBarNoTabs.class);
    }

    @ey(method = -2051818054605662720L)
    public SearchBarNoTabs(MainActivity mainActivity) {
        try {
            if (DW) {
                iy.tp(185928872725840272L, null, mainActivity);
            }
            this.j6 = mainActivity;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 185928872725840272L, null, mainActivity);
            }
            throw th;
        }
    }

    @ey(method = 2538065274151753080L)
    private void j6(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Paint paint) {
        try {
            if (DW) {
                iy.QX(-18181156698456768L, this, new Object[]{canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Float(f8), paint});
            }
            canvas.save();
            RoundRectShape roundRectShape = new RoundRectShape(new float[]{f5, f5, f6, f6, f8, f8, f7, f7}, null, null);
            roundRectShape.resize(f3 - f, f4 - f2);
            canvas.translate(f, f2);
            roundRectShape.draw(canvas, paint);
            canvas.restore();
        } catch (Throwable th) {
            if (FH) {
                iy.rN(th, -18181156698456768L, this, new Object[]{canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Float(f8), paint});
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = 5953258879899880675L)
    public void draw(Canvas canvas) {
        try {
            if (DW) {
                iy.tp(688203217134876825L, this, canvas);
            }
            Rect bounds = getBounds();
            float f = this.j6.getResources().getDisplayMetrics().density;
            float f2 = 2.0f * f;
            float f3 = f * 4.0f;
            Paint paint = new Paint(1);
            paint.setShadowLayer(f2, 0.0f, -f2, this.j6.getResources().getColor(2131034116));
            paint.setColor(this.j6.getResources().getColor(2131034114));
            j6(canvas, 0.0f, bounds.top + f3, bounds.right, bounds.bottom + f3, 0.0f, 0.0f, 0.0f, 0.0f, paint);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 688203217134876825L, this, canvas);
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = -599239225224305393L)
    public int getOpacity() {
        try {
            if (!DW) {
                return -1;
            }
            iy.gn(-2863896678345696127L, this);
            return -1;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -2863896678345696127L, this);
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = -233668657522602625L)
    public void setAlpha(int i) {
        try {
            if (DW) {
                iy.u7(272201658422455425L, this, i);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 272201658422455425L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = -962417261034927720L)
    public void setColorFilter(ColorFilter colorFilter) {
        try {
            if (DW) {
                iy.tp(-874599474019733500L, this, colorFilter);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -874599474019733500L, this, colorFilter);
            }
            throw th;
        }
    }
}
