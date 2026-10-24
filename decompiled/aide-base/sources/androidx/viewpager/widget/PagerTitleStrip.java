package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.c;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.e
/* loaded from: classes.dex */
public class PagerTitleStrip extends ViewGroup {
    private static final int[] Q6 = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    private static final int[] kf = {R.attr.textAllCaps};
    private int AL;
    ViewPager WB;
    private int Z1;
    private final a cT;
    TextView fY;
    private boolean hK;
    TextView jw;
    float k2;
    TextView mb;
    int n5;
    private WeakReference<PagerAdapter> q7;
    private int qp;
    private boolean w9;
    private int zh;

    private class a extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {
        private int j6;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void DW(int i) {
            this.j6 = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void FH(int i) {
            if (this.j6 == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.FH(pagerTitleStrip.WB.getCurrentItem(), PagerTitleStrip.this.WB.getAdapter());
                float f = PagerTitleStrip.this.k2;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                pagerTitleStrip2.Hw(pagerTitleStrip2.WB.getCurrentItem(), f, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void Hw(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            PagerTitleStrip.this.DW(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.FH(pagerTitleStrip.WB.getCurrentItem(), PagerTitleStrip.this.WB.getAdapter());
            float f = PagerTitleStrip.this.k2;
            if (f < 0.0f) {
                f = 0.0f;
            }
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            pagerTitleStrip2.Hw(pagerTitleStrip2.WB.getCurrentItem(), f, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.Hw(i, f, false);
        }
    }

    private static class b extends SingleLineTransformationMethod {
        private Locale WB;

        b(Context context) {
            this.WB = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.WB);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    void DW(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.cT);
            this.q7 = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.cT);
            this.q7 = new WeakReference<>(pagerAdapter2);
        }
        ViewPager viewPager = this.WB;
        if (viewPager != null) {
            this.qp = -1;
            this.k2 = -1.0f;
            FH(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    void FH(int i, PagerAdapter pagerAdapter) {
        int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
        this.w9 = true;
        CharSequence pageTitle = null;
        this.mb.setText((i < 1 || pagerAdapter == null) ? null : pagerAdapter.getPageTitle(i - 1));
        this.jw.setText((pagerAdapter == null || i >= count) ? null : pagerAdapter.getPageTitle(i));
        int i2 = i + 1;
        if (i2 < count && pagerAdapter != null) {
            pageTitle = pagerAdapter.getPageTitle(i2);
        }
        this.fY.setText(pageTitle);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.mb.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.jw.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.fY.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.qp = i;
        if (!this.hK) {
            Hw(i, this.k2, false);
        }
        this.w9 = false;
    }

    void Hw(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.qp) {
            FH(i, this.WB.getAdapter());
        } else if (!z && f == this.k2) {
            return;
        }
        this.hK = true;
        int measuredWidth = this.mb.getMeasuredWidth();
        int measuredWidth2 = this.jw.getMeasuredWidth();
        int measuredWidth3 = this.fY.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.mb.getBaseline();
        int baseline2 = this.jw.getBaseline();
        int baseline3 = this.fY.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.mb.getMeasuredHeight() + i11, this.jw.getMeasuredHeight() + i12), this.fY.getMeasuredHeight() + i13);
        int i14 = this.AL & 112;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
                TextView textView = this.jw;
                textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
                int iMin = Math.min(paddingLeft, (i9 - this.zh) - measuredWidth);
                TextView textView2 = this.mb;
                textView2.layout(iMin, i3, measuredWidth + iMin, textView2.getMeasuredHeight() + i3);
                int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.zh);
                TextView textView3 = this.fY;
                textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
                this.k2 = f;
                this.hK = false;
            }
            i2 = (height - paddingBottom) - iMax2;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.jw;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.zh) - measuredWidth);
        TextView textView22 = this.mb;
        textView22.layout(iMin2, i3, measuredWidth + iMin2, textView22.getMeasuredHeight() + i3);
        int iMax32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.zh);
        TextView textView32 = this.fY;
        textView32.layout(iMax32, i5, iMax32 + measuredWidth3, textView32.getMeasuredHeight() + i5);
        this.k2 = f;
        this.hK = false;
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.zh;
    }

    public void j6(int i, float f) {
        this.mb.setTextSize(i, f);
        this.jw.setTextSize(i, f);
        this.fY.setTextSize(i, f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        viewPager.g3(this.cT);
        viewPager.addOnAdapterChangeListener(this.cT);
        this.WB = viewPager;
        WeakReference<PagerAdapter> weakReference = this.q7;
        DW(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.WB;
        if (viewPager != null) {
            DW(viewPager.getAdapter(), null);
            this.WB.g3(null);
            this.WB.removeOnAdapterChangeListener(this.cT);
            this.WB = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.WB != null) {
            float f = this.k2;
            if (f < 0.0f) {
                f = 0.0f;
            }
            Hw(this.qp, f, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int iMax;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.mb.measure(childMeasureSpec2, childMeasureSpec);
        this.jw.measure(childMeasureSpec2, childMeasureSpec);
        this.fY.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(getMinHeight(), this.jw.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, this.jw.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.w9) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.AL = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.Z1 = i;
        int i2 = (i << 24) | (this.n5 & 16777215);
        this.mb.setTextColor(i2);
        this.fY.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.n5 = i;
        this.jw.setTextColor(i);
        int i2 = (this.Z1 << 24) | (this.n5 & 16777215);
        this.mb.setTextColor(i2);
        this.fY.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.zh = i;
        requestLayout();
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.qp = -1;
        this.k2 = -1.0f;
        this.cT = new a();
        TextView textView = new TextView(context);
        this.mb = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.jw = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.fY = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q6);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            c.j6(this.mb, resourceId);
            c.j6(this.jw, resourceId);
            c.j6(this.fY, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            j6(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.mb.setTextColor(color);
            this.jw.setTextColor(color);
            this.fY.setTextColor(color);
        }
        this.AL = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.n5 = this.jw.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.mb.setEllipsize(TextUtils.TruncateAt.END);
        this.jw.setEllipsize(TextUtils.TruncateAt.END);
        this.fY.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, kf);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.mb);
            setSingleLineAllCaps(this.jw);
            setSingleLineAllCaps(this.fY);
        } else {
            this.mb.setSingleLine();
            this.jw.setSingleLine();
            this.fY.setSingleLine();
        }
        this.zh = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
