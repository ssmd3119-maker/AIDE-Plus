package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.ActionBar;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

@cy(clazz = 719480879837168673L, container = 719480879837168673L, user = true)
/* loaded from: classes.dex */
public class TrainerLogo extends Drawable {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 1107372641231293568L)
    private String[] DW;

    @dy(field = 1089982636806485568L)
    private Drawable j6;

    static {
        iy.Zo(TrainerLogo.class);
    }

    @ey(method = -12360076210788480L)
    public TrainerLogo(Context context, int i, String[] strArr) {
        try {
            if (FH) {
                iy.we(-707788385893162448L, null, context, new Integer(i), strArr);
            }
            this.DW = strArr;
            this.j6 = context.getResources().getDrawable(i);
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -707788385893162448L, null, context, new Integer(i), strArr);
            }
            throw th;
        }
    }

    @ey(method = 1397634080134114680L)
    public static void j6(ActionBar actionBar, int i, String[] strArr) {
        try {
            if (FH) {
                iy.we(-6349990907778744920L, null, actionBar, new Integer(i), strArr);
            }
            Context themedContext = actionBar.getThemedContext();
            if (!AndroidHelper.lg(themedContext)) {
                actionBar.setDisplayShowTitleEnabled(false);
                actionBar.setLogo(new TrainerLogo(themedContext, i, strArr));
            } else {
                actionBar.setDisplayShowTitleEnabled(true);
                actionBar.setIcon(i);
                actionBar.setTitle(strArr[0]);
                actionBar.setSubtitle(strArr[1]);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -6349990907778744920L, null, actionBar, new Integer(i), strArr);
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = 7913606652917326009L)
    public void draw(Canvas canvas) {
        try {
            if (FH) {
                iy.tp(541004158327237965L, this, canvas);
            }
            Paint paint = new Paint();
            paint.setColor(-13421773);
            paint.setAntiAlias(true);
            paint.setTextSize(40.0f);
            paint.setTypeface(Typeface.DEFAULT_BOLD);
            canvas.drawText(this.DW[0], 120.0f, 40.0f, paint);
            paint.setTextSize(35.0f);
            paint.setTypeface(Typeface.DEFAULT);
            canvas.drawText(this.DW[1], 120.0f, 90.0f, paint);
            this.j6.setBounds(0, 0, 100, 100);
            this.j6.draw(canvas);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 541004158327237965L, this, canvas);
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = -307575451407297204L)
    public int getIntrinsicHeight() {
        try {
            if (!FH) {
                return 100;
            }
            iy.gn(5348465685662353408L, this);
            return 100;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 5348465685662353408L, this);
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = 2339277346059340407L)
    public int getIntrinsicWidth() {
        try {
            if (!FH) {
                return 400;
            }
            iy.gn(2281900910868417475L, this);
            return 400;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2281900910868417475L, this);
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = -4181884841455316807L)
    public int getOpacity() {
        try {
            if (!FH) {
                return -1;
            }
            iy.gn(-1519488372921239203L, this);
            return -1;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1519488372921239203L, this);
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = -567456994900802955L)
    public void setAlpha(int i) {
        try {
            if (FH) {
                iy.u7(343205115111904437L, this, i);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 343205115111904437L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ey(method = -620113590700503680L)
    public void setColorFilter(ColorFilter colorFilter) {
        try {
            if (FH) {
                iy.tp(-1514245693360453476L, this, colorFilter);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1514245693360453476L, this, colorFilter);
            }
            throw th;
        }
    }
}
