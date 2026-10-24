package com.aide.ui.views;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

@cy(clazz = -7039700628554560L, container = -7039700628554560L, user = true)
/* loaded from: classes.dex */
public class ActivityGotoLayout extends ViewGroup {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(ActivityGotoLayout.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -165011075487883024L)
    public ActivityGotoLayout(Context context) {
        super(context);
        try {
            if (WB) {
                iy.tp(258949633952288801L, null, context);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 258949633952288801L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 1503241096327617335L)
    private float DW(float f) {
        try {
            if (WB) {
                iy.tp(-2611304108400573624L, this, new Float(f));
            }
            return Math.min(f, Hw(f));
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -2611304108400573624L, this, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = 1288375128802837008L)
    private float FH(float f) {
        try {
            if (WB) {
                iy.tp(1142576163235709139L, this, new Float(f));
            }
            return getContext().getResources().getDisplayMetrics().density * 600.0f;
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 1142576163235709139L, this, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = -102674340223269255L)
    private float Hw(float f) {
        try {
            if (WB) {
                iy.tp(436539724560484560L, this, new Float(f));
            }
            return getContext().getResources().getDisplayMetrics().density * 600.0f;
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 436539724560484560L, this, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = -7257402910061516736L)
    private float j6(float f) {
        try {
            if (WB) {
                iy.tp(4109845372606184751L, this, new Float(f));
            }
            return Math.min(f, FH(f));
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 4109845372606184751L, this, new Float(f));
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @ey(method = 25981813519919181L)
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            if (WB) {
                iy.J8(4645757774192883184L, this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            float f = i3 - i;
            float f2 = i4 - i2;
            float fDW = (f - DW(f)) / 2.0f;
            float fJ6 = (f2 - j6(f2)) / 2.0f;
            getChildAt(0).layout((int) fDW, (int) fJ6, (int) (f - fDW), (int) (f2 - fJ6));
        } catch (Throwable th) {
            if (mb) {
                iy.lg(th, 4645757774192883184L, this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = -2345800879145865240L)
    protected void onMeasure(int i, int i2) {
        try {
            if (WB) {
                iy.EQ(-229838818923902001L, this, new Integer(i), new Integer(i2));
            }
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec((int) DW(size2), 1073741824), View.MeasureSpec.makeMeasureSpec((int) j6(size), 1073741824));
            setMeasuredDimension(size2, size);
        } catch (Throwable th) {
            if (mb) {
                iy.Mr(th, -229838818923902001L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -5080491569744472519L)
    public ActivityGotoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (WB) {
                iy.EQ(-6334031528656167312L, null, context, attributeSet);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.Mr(th, -6334031528656167312L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 1874918135630427288L)
    public ActivityGotoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (WB) {
                iy.we(2415807670372947459L, null, context, attributeSet, new Integer(i));
            }
        } catch (Throwable th) {
            if (mb) {
                iy.U2(th, 2415807670372947459L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
