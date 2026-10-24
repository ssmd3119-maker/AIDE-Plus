package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.d;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {
    static final e sE;
    float AL;
    boolean Jl;
    private d Q6;
    private int WB;
    private float Z1;
    boolean cT;
    final ArrayList<b> e3;
    private final Rect eU;
    private Drawable fY;
    int hK;
    private boolean iW;
    private Drawable jw;
    private boolean k2;
    final androidx.core.widget.d kf;
    private int mb;
    private float n5;
    private int q7;
    private final int qp;
    private float w9;
    View zh;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean jw;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: FH, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.jw ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.jw = parcel.readInt() != 0;
        }
    }

    class a extends AccessibilityDelegateCompat {
        private final Rect Hw = new Rect();

        a() {
        }

        private void EQ(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.Hw;
            accessibilityNodeInfoCompat2.v5(rect);
            accessibilityNodeInfoCompat.vy(rect);
            accessibilityNodeInfoCompat2.Zo(rect);
            accessibilityNodeInfoCompat.P8(rect);
            accessibilityNodeInfoCompat.g3(accessibilityNodeInfoCompat2.rN());
            accessibilityNodeInfoCompat.dx(accessibilityNodeInfoCompat2.tp());
            accessibilityNodeInfoCompat.ei(accessibilityNodeInfoCompat2.VH());
            accessibilityNodeInfoCompat.SI(accessibilityNodeInfoCompat2.gn());
            accessibilityNodeInfoCompat.KD(accessibilityNodeInfoCompat2.XL());
            accessibilityNodeInfoCompat.nw(accessibilityNodeInfoCompat2.QX());
            accessibilityNodeInfoCompat.ro(accessibilityNodeInfoCompat2.aM());
            accessibilityNodeInfoCompat.cn(accessibilityNodeInfoCompat2.j3());
            accessibilityNodeInfoCompat.BT(accessibilityNodeInfoCompat2.J0());
            accessibilityNodeInfoCompat.Sf(accessibilityNodeInfoCompat2.lg());
            accessibilityNodeInfoCompat.sh(accessibilityNodeInfoCompat2.Mr());
            accessibilityNodeInfoCompat.j6(accessibilityNodeInfoCompat2.Hw());
            accessibilityNodeInfoCompat.cb(accessibilityNodeInfoCompat2.u7());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Hw(View view, AccessibilityEvent accessibilityEvent) {
            super.Hw(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean VH(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (we(view)) {
                return false;
            }
            return super.VH(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void v5(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatEr = AccessibilityNodeInfoCompat.er(accessibilityNodeInfoCompat);
            super.v5(view, accessibilityNodeInfoCompatEr);
            EQ(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatEr);
            accessibilityNodeInfoCompatEr.yS();
            accessibilityNodeInfoCompat.ei(SlidingPaneLayout.class.getName());
            accessibilityNodeInfoCompat.vJ(view);
            Object objZo = ViewCompat.Zo(view);
            if (objZo instanceof View) {
                accessibilityNodeInfoCompat.sG((View) objZo);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!we(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.U2(childAt, 1);
                    accessibilityNodeInfoCompat.DW(childAt);
                }
            }
        }

        public boolean we(View view) {
            return SlidingPaneLayout.this.gn(view);
        }
    }

    private class b implements Runnable {
        final View WB;

        b(View view) {
            this.WB = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.WB.getParent() == SlidingPaneLayout.this) {
                this.WB.setLayerType(0, null);
                SlidingPaneLayout.this.VH(this.WB);
            }
            SlidingPaneLayout.this.e3.remove(this);
        }
    }

    private class c extends d.c {
        c() {
        }

        @Override // androidx.core.widget.d.c
        public int DW(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.core.widget.d.c
        public void EQ(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.we(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.core.widget.d.c
        public int Hw(View view) {
            return SlidingPaneLayout.this.hK;
        }

        @Override // androidx.core.widget.d.c
        public boolean J0(View view, int i) {
            if (SlidingPaneLayout.this.cT) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).DW;
        }

        @Override // androidx.core.widget.d.c
        public void Zo(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.kf.FH(slidingPaneLayout.zh, i2);
        }

        @Override // androidx.core.widget.d.c
        public int j6(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.zh.getLayoutParams();
            if (SlidingPaneLayout.this.u7()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.zh.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.hK);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.hK + paddingLeft);
        }

        @Override // androidx.core.widget.d.c
        public void tp(int i) {
            if (SlidingPaneLayout.this.kf.gW() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.AL != 0.0f) {
                    slidingPaneLayout.v5(slidingPaneLayout.zh);
                    SlidingPaneLayout.this.Jl = true;
                } else {
                    slidingPaneLayout.aM(slidingPaneLayout.zh);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.Hw(slidingPaneLayout2.zh);
                    SlidingPaneLayout.this.Jl = false;
                }
            }
        }

        @Override // androidx.core.widget.d.c
        public void u7(View view, int i) {
            SlidingPaneLayout.this.QX();
        }

        @Override // androidx.core.widget.d.c
        public void we(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.u7()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.AL > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.hK;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.zh.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.AL > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.hK;
                }
            }
            SlidingPaneLayout.this.kf.sG(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }
    }

    public interface d {
        void DW(View view);

        void FH(View view);

        void j6(View view, float f);
    }

    interface e {
        void j6(SlidingPaneLayout slidingPaneLayout, View view);
    }

    static class f implements e {
        f() {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void j6(SlidingPaneLayout slidingPaneLayout, View view) {
            ViewCompat.Ws(slidingPaneLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    static class g extends f {
        private Field DW;
        private Method j6;

        g() throws NoSuchFieldException {
            try {
                this.j6 = View.class.getDeclaredMethod("getDisplayList", null);
            } catch (NoSuchMethodException e) {
                Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
            }
            try {
                Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                this.DW = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
            }
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f, androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void j6(SlidingPaneLayout slidingPaneLayout, View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Field field;
            if (this.j6 == null || (field = this.DW) == null) {
                view.invalidate();
                return;
            }
            try {
                field.setBoolean(view, true);
                this.j6.invoke(view, null);
            } catch (Exception e) {
                Log.e("SlidingPaneLayout", "Error refreshing display list state", e);
            }
            super.j6(slidingPaneLayout, view);
        }
    }

    static class h extends f {
        h() {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f, androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void j6(SlidingPaneLayout slidingPaneLayout, View view) {
            ViewCompat.a8(view, ((LayoutParams) view.getLayoutParams()).Hw);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            sE = new h();
        } else if (i >= 16) {
            sE = new g();
        } else {
            sE = new f();
        }
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    private boolean DW(View view, int i) {
        if (!this.iW && !XL(0.0f, i)) {
            return false;
        }
        this.Jl = false;
        return true;
    }

    private void FH(View view, float f2, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f2)) << 24) | (i & 16777215);
            if (layoutParams.Hw == null) {
                layoutParams.Hw = new Paint();
            }
            layoutParams.Hw.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.Hw);
            }
            VH(view);
            return;
        }
        if (view.getLayerType() != 0) {
            Paint paint = layoutParams.Hw;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            b bVar = new b(view);
            this.e3.add(bVar);
            ViewCompat.QX(this, bVar);
        }
    }

    private boolean J8(View view, int i) {
        if (!this.iW && !XL(1.0f, i)) {
            return false;
        }
        this.Jl = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Ws(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.u7()
            android.view.View r1 = r9.zh
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.FH
            r3 = 0
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L16
            int r1 = r1.rightMargin
            goto L18
        L16:
            int r1 = r1.leftMargin
        L18:
            if (r1 > 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            int r2 = r9.getChildCount()
        L21:
            if (r3 >= r2) goto L59
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.zh
            if (r4 != r5) goto L2c
            goto L56
        L2c:
            float r5 = r9.w9
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.q7
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.w9 = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L44
            int r5 = -r5
        L44:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L56
            float r5 = r9.w9
            if (r0 == 0) goto L4f
            float r5 = r5 - r6
            goto L51
        L4f:
            float r5 = r6 - r5
        L51:
            int r6 = r9.mb
            r9.FH(r4, r5, r6)
        L56:
            int r3 = r3 + 1
            goto L21
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.Ws(float):void");
    }

    private static boolean j3(View view) {
        Drawable background;
        if (view.isOpaque()) {
            return true;
        }
        return Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1;
    }

    public boolean EQ() {
        return this.k2;
    }

    void Hw(View view) {
        d dVar = this.Q6;
        if (dVar != null) {
            dVar.FH(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean J0() {
        return J8(this.zh, 0);
    }

    void QX() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    void VH(View view) {
        sE.j6(this, view);
    }

    boolean XL(float f2, int i) {
        int paddingLeft;
        if (!this.k2) {
            return false;
        }
        boolean zU7 = u7();
        LayoutParams layoutParams = (LayoutParams) this.zh.getLayoutParams();
        if (zU7) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f2 * this.hK)) + this.zh.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f2 * this.hK));
        }
        androidx.core.widget.d dVar = this.kf;
        View view = this.zh;
        if (!dVar.Sf(view, paddingLeft, view.getTop())) {
            return false;
        }
        QX();
        ViewCompat.J8(this);
        return true;
    }

    void Zo(View view) {
        d dVar = this.Q6;
        if (dVar != null) {
            dVar.j6(view, this.AL);
        }
    }

    void aM(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        boolean z;
        View view2 = view;
        boolean zU7 = u7();
        int width = zU7 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zU7 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !j3(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && (childAt = getChildAt(i)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = zU7;
            } else {
                z = zU7;
                childAt.setVisibility((Math.max(zU7 ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zU7 ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zU7 = z;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.kf.J8(true)) {
            if (this.k2) {
                ViewCompat.J8(this);
            } else {
                this.kf.j6();
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int right;
        super.draw(canvas);
        Drawable drawable = u7() ? this.fY : this.jw;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (u7()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save(2);
        if (this.k2 && !layoutParams.DW && this.zh != null) {
            canvas.getClipBounds(this.eU);
            if (u7()) {
                Rect rect = this.eU;
                rect.left = Math.max(rect.left, this.zh.getRight());
            } else {
                Rect rect2 = this.eU;
                rect2.right = Math.min(rect2.right, this.zh.getLeft());
            }
            canvas.clipRect(this.eU);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.mb;
    }

    public int getParallaxDistance() {
        return this.q7;
    }

    public int getSliderFadeColor() {
        return this.WB;
    }

    boolean gn(View view) {
        if (view == null) {
            return false;
        }
        return this.k2 && ((LayoutParams) view.getLayoutParams()).FH && this.AL > 0.0f;
    }

    public boolean j6() {
        return DW(this.zh, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.iW = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.iW = true;
        int size = this.e3.size();
        for (int i = 0; i < size; i++) {
            this.e3.get(i).run();
        }
        this.e3.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.k2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.Jl = !this.kf.ei(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.k2 || (this.cT && actionMasked != 0)) {
            this.kf.DW();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.kf.DW();
            return false;
        }
        if (actionMasked == 0) {
            this.cT = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.Z1 = x;
            this.n5 = y;
            if (this.kf.ei(this.zh, (int) x, (int) y) && gn(this.zh)) {
                z = true;
            }
            return this.kf.ef(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float fAbs = Math.abs(x2 - this.Z1);
            float fAbs2 = Math.abs(y2 - this.n5);
            if (fAbs > this.kf.yS() && fAbs2 > fAbs) {
                this.kf.DW();
                this.cT = true;
                return false;
            }
        }
        z = false;
        if (this.kf.ef(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean zU7 = u7();
        if (zU7) {
            this.kf.cb(2);
        } else {
            this.kf.cb(1);
        }
        int i9 = i3 - i;
        int paddingRight = zU7 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zU7 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.iW) {
            this.AL = (this.k2 && this.Jl) ? 1.0f : 0.0f;
        }
        int i10 = paddingRight;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.DW) {
                    int i12 = i9 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i12 - this.qp) - i10) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.hK = iMin;
                    int i13 = zU7 ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.FH = ((i10 + i13) + iMin) + (measuredWidth / 2) > i12;
                    int i14 = (int) (iMin * this.AL);
                    i10 += i13 + i14;
                    this.AL = i14 / this.hK;
                    i5 = 0;
                } else if (!this.k2 || (i6 = this.q7) == 0) {
                    i10 = paddingRight;
                    i5 = 0;
                } else {
                    i5 = (int) ((1.0f - this.AL) * i6);
                    i10 = paddingRight;
                }
                if (zU7) {
                    i8 = (i9 - i10) + i5;
                    i7 = i8 - measuredWidth;
                } else {
                    i7 = i10 - i5;
                    i8 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.iW) {
            if (this.k2) {
                if (this.q7 != 0) {
                    Ws(this.AL);
                }
                if (((LayoutParams) this.zh.getLayoutParams()).FH) {
                    FH(this.zh, this.AL, this.WB);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    FH(getChildAt(i15), 0.0f, this.WB);
                }
            }
            aM(this.zh);
        }
        this.iW = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1 A[PHI: r13
      0x00b1: PHI (r13v2 float) = (r13v1 float), (r13v7 float) binds: [B:35:0x00a8, B:37:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.j6());
        if (savedState.jw) {
            J0();
        } else {
            j6();
        }
        this.Jl = savedState.jw;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.jw = EQ() ? tp() : this.Jl;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.iW = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.k2) {
            return super.onTouchEvent(motionEvent);
        }
        this.kf.nw(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.Z1 = x;
            this.n5 = y;
        } else if (actionMasked == 1 && gn(this.zh)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f2 = x2 - this.Z1;
            float f3 = y2 - this.n5;
            int iYS = this.kf.yS();
            if ((f2 * f2) + (f3 * f3) < iYS * iYS && this.kf.ei(this.zh, (int) x2, (int) y2)) {
                DW(this.zh, 0);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.k2) {
            return;
        }
        this.Jl = view == this.zh;
    }

    public void setCoveredFadeColor(int i) {
        this.mb = i;
    }

    public void setPanelSlideListener(d dVar) {
        this.Q6 = dVar;
    }

    public void setParallaxDistance(int i) {
        this.q7 = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.jw = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.fY = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i));
    }

    public void setSliderFadeColor(int i) {
        this.WB = i;
    }

    public boolean tp() {
        return !this.k2 || this.AL == 1.0f;
    }

    boolean u7() {
        return ViewCompat.v5(this) == 1;
    }

    void v5(View view) {
        d dVar = this.Q6;
        if (dVar != null) {
            dVar.DW(view);
        }
        sendAccessibilityEvent(32);
    }

    void we(int i) {
        if (this.zh == null) {
            this.AL = 0.0f;
            return;
        }
        boolean zU7 = u7();
        LayoutParams layoutParams = (LayoutParams) this.zh.getLayoutParams();
        int width = this.zh.getWidth();
        if (zU7) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = (i - ((zU7 ? getPaddingRight() : getPaddingLeft()) + (zU7 ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / this.hK;
        this.AL = paddingRight;
        if (this.q7 != 0) {
            Ws(paddingRight);
        }
        if (layoutParams.FH) {
            FH(this.zh, this.AL, this.WB);
        }
        Zo(this.zh);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] v5 = {R.attr.layout_weight};
        boolean DW;
        boolean FH;
        Paint Hw;
        public float j6;

        public LayoutParams() {
            super(-1, -1);
            this.j6 = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.j6 = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.j6 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.j6 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v5);
            this.j6 = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.WB = -858993460;
        this.iW = true;
        this.eU = new Rect();
        this.e3 = new ArrayList<>();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.qp = (int) ((32.0f * f2) + 0.5f);
        setWillNotDraw(false);
        ViewCompat.XL(this, new a());
        ViewCompat.U2(this, 1);
        androidx.core.widget.d dVarWs = androidx.core.widget.d.Ws(this, 0.5f, new c());
        this.kf = dVarWs;
        dVarWs.dx(f2 * 400.0f);
    }
}
