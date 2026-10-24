package com.aide.ui.views;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SlidingDrawer;

@cy(clazz = -619920423127698829L, container = -619920423127698829L, user = true)
/* loaded from: classes.dex */
public class WrappingSlidingDrawer extends SlidingDrawer {

    @gy
    private static /* synthetic */ boolean fY;

    @fy
    private static /* synthetic */ boolean jw;

    @dy(field = 3740104355881371705L)
    private boolean WB;

    @dy(field = -1727980716268968189L)
    private int mb;

    static {
        iy.Zo(WrappingSlidingDrawer.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 2192573921874925176L)
    public WrappingSlidingDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (jw) {
                iy.we(-507211066623366561L, null, context, attributeSet, new Integer(i));
            }
            boolean z = true;
            int attributeIntValue = attributeSet.getAttributeIntValue("android", "orientation", 1);
            this.mb = attributeSet.getAttributeIntValue("android", "topOffset", 0);
            if (attributeIntValue != 1) {
                z = false;
            }
            this.WB = z;
        } catch (Throwable th) {
            if (fY) {
                iy.U2(th, -507211066623366561L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.widget.SlidingDrawer, android.view.View
    @ey(method = -137268825418187376L)
    protected void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        try {
            if (jw) {
                iy.EQ(-959454100828577320L, this, new Integer(i), new Integer(i2));
            }
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 0 || mode2 == 0) {
                throw new RuntimeException("SlidingDrawer cannot have UNSPECIFIED dimensions");
            }
            View handle = getHandle();
            View content = getContent();
            measureChild(handle, i, i2);
            if (this.WB) {
                content.measure(i, View.MeasureSpec.makeMeasureSpec((size2 - handle.getMeasuredHeight()) - this.mb, mode2));
                measuredHeight = handle.getMeasuredHeight() + this.mb + content.getMeasuredHeight();
                measuredWidth = content.getMeasuredWidth();
                if (handle.getMeasuredWidth() > measuredWidth) {
                    measuredWidth = handle.getMeasuredWidth();
                }
            } else {
                content.measure(View.MeasureSpec.makeMeasureSpec((size - handle.getMeasuredWidth()) - this.mb, mode), i2);
                measuredWidth = content.getMeasuredWidth() + handle.getMeasuredWidth() + this.mb;
                measuredHeight = content.getMeasuredHeight();
                if (handle.getMeasuredHeight() > measuredHeight) {
                    measuredHeight = handle.getMeasuredHeight();
                }
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, -959454100828577320L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -5943452077822599759L)
    public WrappingSlidingDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (jw) {
                iy.EQ(-1605006505721893120L, null, context, attributeSet);
            }
            boolean z = true;
            int attributeIntValue = attributeSet.getAttributeIntValue("android", "orientation", 1);
            this.mb = attributeSet.getAttributeIntValue("android", "topOffset", 0);
            if (attributeIntValue != 1) {
                z = false;
            }
            this.WB = z;
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, -1605006505721893120L, null, context, attributeSet);
            }
            throw th;
        }
    }
}
