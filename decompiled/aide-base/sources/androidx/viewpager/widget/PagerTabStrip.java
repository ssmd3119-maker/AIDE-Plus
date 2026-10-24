package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;

/* loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {
    private boolean Cz;
    private int Gj;
    private int Jl;
    private float QO;
    private boolean aX;
    private int e3;
    private float e9;
    private int eU;
    private final Rect fN;
    private int iW;
    private int oy;
    private boolean pN;
    private final Paint pO;
    private int sE;
    private int sM;
    private int sg;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            PagerTabStrip.this.WB.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            ViewPager viewPager = PagerTabStrip.this.WB;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    void Hw(int i, float f, boolean z) {
        Rect rect = this.fN;
        int height = getHeight();
        int left = this.jw.getLeft() - this.sg;
        int right = this.jw.getRight() + this.sg;
        int i2 = height - this.iW;
        rect.set(left, i2, right, height);
        super.Hw(i, f, z);
        this.Gj = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.jw.getLeft() - this.sg, i2, this.jw.getRight() + this.sg, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.Cz;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.sE);
    }

    public int getTabIndicatorColor() {
        return this.Jl;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.jw.getLeft() - this.sg;
        int right = this.jw.getRight() + this.sg;
        int i = height - this.iW;
        this.pO.setColor((this.Gj << 24) | (this.Jl & 16777215));
        float f = height;
        canvas.drawRect(left, i, right, f, this.pO);
        if (this.Cz) {
            this.pO.setColor((-16777216) | (this.Jl & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.oy, getWidth() - getPaddingRight(), f, this.pO);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction();
        if (action != 0 && this.aX) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.e9 = x;
            this.QO = y;
            this.aX = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.e9) > this.sM || Math.abs(y - this.QO) > this.sM)) {
                this.aX = true;
            }
        } else if (x < this.jw.getLeft() - this.sg) {
            ViewPager viewPager = this.WB;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > this.jw.getRight() + this.sg) {
            ViewPager viewPager2 = this.WB;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.pN) {
            return;
        }
        this.Cz = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.pN) {
            return;
        }
        this.Cz = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.pN) {
            return;
        }
        this.Cz = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.Cz = z;
        this.pN = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.eU;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.Jl = i;
        this.pO.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(ContextCompat.FH(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.e3;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pO = new Paint();
        this.fN = new Rect();
        this.Gj = 255;
        this.Cz = false;
        this.pN = false;
        int i = this.n5;
        this.Jl = i;
        this.pO.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.iW = (int) ((3.0f * f) + 0.5f);
        this.eU = (int) ((6.0f * f) + 0.5f);
        this.e3 = (int) (64.0f * f);
        this.sg = (int) ((16.0f * f) + 0.5f);
        this.oy = (int) ((1.0f * f) + 0.5f);
        this.sE = (int) ((f * 32.0f) + 0.5f);
        this.sM = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.mb.setFocusable(true);
        this.mb.setOnClickListener(new a());
        this.fY.setFocusable(true);
        this.fY.setOnClickListener(new b());
        if (getBackground() == null) {
            this.Cz = true;
        }
    }
}
