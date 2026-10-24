package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements androidx.core.view.g, androidx.core.view.d {
    private final Animation AE;
    private final androidx.core.view.e AL;
    private final Animation BR;
    int Cz;
    protected int Gj;
    boolean IS;
    private int Jl;
    private Animation.AnimationListener Nh;
    private float Q6;
    private Animation QO;
    private View WB;
    int Z1;
    boolean a5;
    private Animation aX;
    private boolean cT;
    private final DecelerateInterpolator e3;
    private Animation e9;
    private boolean eU;
    float fN;
    private int fY;
    private i gG;
    private final int[] hK;
    boolean iW;
    boolean jw;
    private float k2;
    private boolean kf;
    j mb;
    private float n5;
    private Animation oy;
    CircularProgressDrawable pN;
    protected int pO;
    private int q7;
    private float qp;
    androidx.core.widget.a sE;
    private Animation sM;
    private int sg;
    private final int[] w9;
    private int ys;
    private final androidx.core.view.h zh;
    private static final String Za = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] An = {R.attr.enabled};

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.jw) {
                swipeRefreshLayout.QX();
                return;
            }
            swipeRefreshLayout.pN.setAlpha(255);
            SwipeRefreshLayout.this.pN.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.a5 && (jVar = swipeRefreshLayout2.mb) != null) {
                jVar.j6();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.Z1 = swipeRefreshLayout3.sE.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    class d extends Animation {
        final /* synthetic */ int WB;
        final /* synthetic */ int mb;

        d(int i, int i2) {
            this.WB = i;
            this.mb = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.pN.setAlpha((int) (this.WB + ((this.mb - r0) * f)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.iW) {
                return;
            }
            swipeRefreshLayout.a8(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.IS ? swipeRefreshLayout.Cz - Math.abs(swipeRefreshLayout.Gj) : swipeRefreshLayout.Cz;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.pO + ((int) ((iAbs - r1) * f))) - swipeRefreshLayout2.sE.getTop());
            SwipeRefreshLayout.this.pN.EQ(1.0f - f);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.J8(f);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.fN;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.J8(f);
        }
    }

    public interface i {
        boolean j6(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    public interface j {
        void j6();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void EQ(float f2) {
        if (f2 > this.qp) {
            XL(true, true);
            return;
        }
        this.jw = false;
        this.pN.QX(0.0f, 0.0f);
        VH(this.Z1, this.iW ? null : new e());
        this.pN.tp(false);
    }

    private void J0(float f2) {
        this.pN.tp(true);
        float fMin = Math.min(1.0f, Math.abs(f2 / this.qp));
        double d2 = fMin;
        Double.isNaN(d2);
        float fMax = (((float) Math.max(d2 - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f2) - this.qp;
        float f3 = this.IS ? this.Cz - this.Gj : this.Cz;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        double dPow = Math.pow(dMax, 2.0d);
        Double.isNaN(dMax);
        float f4 = ((float) (dMax - dPow)) * 2.0f;
        int i2 = this.Gj + ((int) ((f3 * fMin) + (f3 * f4 * 2.0f)));
        if (this.sE.getVisibility() != 0) {
            this.sE.setVisibility(0);
        }
        if (!this.iW) {
            this.sE.setScaleX(1.0f);
            this.sE.setScaleY(1.0f);
        }
        if (this.iW) {
            setAnimationProgress(Math.min(1.0f, f2 / this.qp));
        }
        if (f2 < this.qp) {
            if (this.pN.getAlpha() > 76 && !we(this.e9)) {
                U2();
            }
        } else if (this.pN.getAlpha() < 255 && !we(this.QO)) {
            Mr();
        }
        this.pN.QX(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.pN.EQ(Math.min(1.0f, fMax));
        this.pN.J0((((fMax * 0.4f) - 0.25f) + (f4 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.Z1);
    }

    private void Mr() {
        this.QO = aM(this.pN.getAlpha(), 255);
    }

    private void U2() {
        this.e9 = aM(this.pN.getAlpha(), 76);
    }

    private void VH(int i2, Animation.AnimationListener animationListener) {
        if (this.iW) {
            lg(i2, animationListener);
            return;
        }
        this.pO = i2;
        this.AE.reset();
        this.AE.setDuration(200L);
        this.AE.setInterpolator(this.e3);
        if (animationListener != null) {
            this.sE.DW(animationListener);
        }
        this.sE.clearAnimation();
        this.sE.startAnimation(this.AE);
    }

    private void Ws(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Jl) {
            this.Jl = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void XL(boolean z, boolean z2) {
        if (this.jw != z) {
            this.a5 = z2;
            tp();
            this.jw = z;
            if (z) {
                Zo(this.Z1, this.Nh);
            } else {
                a8(this.Nh);
            }
        }
    }

    private void Zo(int i2, Animation.AnimationListener animationListener) {
        this.pO = i2;
        this.BR.reset();
        this.BR.setDuration(200L);
        this.BR.setInterpolator(this.e3);
        if (animationListener != null) {
            this.sE.DW(animationListener);
        }
        this.sE.clearAnimation();
        this.sE.startAnimation(this.BR);
    }

    private Animation aM(int i2, int i3) {
        d dVar = new d(i2, i3);
        dVar.setDuration(300L);
        this.sE.DW(null);
        this.sE.clearAnimation();
        this.sE.startAnimation(dVar);
        return dVar;
    }

    private void j3(float f2) {
        float f3 = this.Q6;
        float f4 = f2 - f3;
        int i2 = this.fY;
        if (f4 <= i2 || this.kf) {
            return;
        }
        this.n5 = f3 + i2;
        this.kf = true;
        this.pN.setAlpha(76);
    }

    private void lg(int i2, Animation.AnimationListener animationListener) {
        this.pO = i2;
        this.fN = this.sE.getScaleX();
        h hVar = new h();
        this.sM = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.sE.DW(animationListener);
        }
        this.sE.clearAnimation();
        this.sE.startAnimation(this.sM);
    }

    private void rN(Animation.AnimationListener animationListener) {
        this.sE.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11) {
            this.pN.setAlpha(255);
        }
        b bVar = new b();
        this.oy = bVar;
        bVar.setDuration(this.q7);
        if (animationListener != null) {
            this.sE.DW(animationListener);
        }
        this.sE.clearAnimation();
        this.sE.startAnimation(this.oy);
    }

    private void setColorViewAlpha(int i2) {
        this.sE.getBackground().setAlpha(i2);
        this.pN.setAlpha(i2);
    }

    private void tp() {
        if (this.WB == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.sE)) {
                    this.WB = childAt;
                    return;
                }
            }
        }
    }

    private void u7() {
        this.sE = new androidx.core.widget.a(getContext(), -328966);
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.pN = circularProgressDrawable;
        circularProgressDrawable.aM(1);
        this.sE.setImageDrawable(this.pN);
        this.sE.setVisibility(8);
        addView(this.sE);
    }

    private boolean we(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    void J8(float f2) {
        setTargetOffsetTopAndBottom((this.pO + ((int) ((this.Gj - r0) * f2))) - this.sE.getTop());
    }

    void QX() {
        this.sE.clearAnimation();
        this.pN.stop();
        this.sE.setVisibility(8);
        setColorViewAlpha(255);
        if (this.iW) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.Gj - this.Z1);
        }
        this.Z1 = this.sE.getTop();
    }

    void a8(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.aX = cVar;
        cVar.setDuration(150L);
        this.sE.DW(animationListener);
        this.sE.clearAnimation();
        this.sE.startAnimation(this.aX);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.AL.j6(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.AL.DW(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.AL.FH(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.AL.v5(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.sg;
        return i4 < 0 ? i3 : i3 == i2 + (-1) ? i4 : i3 >= i4 ? i3 + 1 : i3;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.zh.j6();
    }

    public int getProgressCircleDiameter() {
        return this.ys;
    }

    public int getProgressViewEndOffset() {
        return this.Cz;
    }

    public int getProgressViewStartOffset() {
        return this.Gj;
    }

    public boolean gn() {
        i iVar = this.gG;
        if (iVar != null) {
            return iVar.j6(this, this.WB);
        }
        View view = this.WB;
        return view instanceof ListView ? androidx.core.widget.b.j6((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.AL.gn();
    }

    @Override // android.view.View, androidx.core.view.d
    public boolean isNestedScrollingEnabled() {
        return this.AL.tp();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        QX();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.tp()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.eU
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r4.eU = r2
        L10:
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L81
            boolean r1 = r4.eU
            if (r1 != 0) goto L81
            boolean r1 = r4.gn()
            if (r1 != 0) goto L81
            boolean r1 = r4.jw
            if (r1 != 0) goto L81
            boolean r1 = r4.cT
            if (r1 == 0) goto L29
            goto L81
        L29:
            if (r0 == 0) goto L5d
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L58
            r1 = 6
            if (r0 == r1) goto L39
            goto L7e
        L39:
            r4.Ws(r5)
            goto L7e
        L3d:
            int r0 = r4.Jl
            if (r0 != r3) goto L49
            java.lang.String r5 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.Za
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L49:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L50
            return r2
        L50:
            float r5 = r5.getY(r0)
            r4.j3(r5)
            goto L7e
        L58:
            r4.kf = r2
            r4.Jl = r3
            goto L7e
        L5d:
            int r0 = r4.Gj
            androidx.core.widget.a r1 = r4.sE
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.Jl = r0
            r4.kf = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L78
            return r2
        L78:
            float r5 = r5.getY(r0)
            r4.Q6 = r5
        L7e:
            boolean r5 = r4.kf
            return r5
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.WB == null) {
            tp();
        }
        View view = this.WB;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.sE.getMeasuredWidth();
        int measuredHeight2 = this.sE.getMeasuredHeight();
        int i6 = measuredWidth / 2;
        int i7 = measuredWidth2 / 2;
        int i8 = this.Z1;
        this.sE.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.WB == null) {
            tp();
        }
        View view = this.WB;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.sE.measure(View.MeasureSpec.makeMeasureSpec(this.ys, 1073741824), View.MeasureSpec.makeMeasureSpec(this.ys, 1073741824));
        this.sg = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.sE) {
                this.sg = i4;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return dispatchNestedFling(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.k2;
            if (f2 > 0.0f) {
                float f3 = i3;
                if (f3 > f2) {
                    iArr[1] = i3 - ((int) f2);
                    this.k2 = 0.0f;
                } else {
                    this.k2 = f2 - f3;
                    iArr[1] = i3;
                }
                J0(this.k2);
            }
        }
        if (this.IS && i3 > 0 && this.k2 == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.sE.setVisibility(8);
        }
        int[] iArr2 = this.w9;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, this.hK);
        if (i5 + this.hK[1] >= 0 || gn()) {
            return;
        }
        float fAbs = this.k2 + Math.abs(r11);
        this.k2 = fAbs;
        J0(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.zh.DW(view, view2, i2);
        startNestedScroll(i2 & 2);
        this.k2 = 0.0f;
        this.cT = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (!isEnabled() || this.eU || this.jw || (i2 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public void onStopNestedScroll(View view) {
        this.zh.Hw(view);
        this.cT = false;
        float f2 = this.k2;
        if (f2 > 0.0f) {
            EQ(f2);
            this.k2 = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.eU && actionMasked == 0) {
            this.eU = false;
        }
        if (!isEnabled() || this.eU || gn() || this.jw || this.cT) {
            return false;
        }
        if (actionMasked == 0) {
            this.Jl = motionEvent.getPointerId(0);
            this.kf = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.Jl);
                if (iFindPointerIndex < 0) {
                    Log.e(Za, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.kf) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.n5) * 0.5f;
                    this.kf = false;
                    EQ(y);
                }
                this.Jl = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.Jl);
                if (iFindPointerIndex2 < 0) {
                    Log.e(Za, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                j3(y2);
                if (this.kf) {
                    float f2 = (y2 - this.n5) * 0.5f;
                    if (f2 <= 0.0f) {
                        return false;
                    }
                    J0(f2);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(Za, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.Jl = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    Ws(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.WB instanceof AbsListView)) {
            View view = this.WB;
            if (view == null || ViewCompat.tp(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    void setAnimationProgress(float f2) {
        this.sE.setScaleX(f2);
        this.sE.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        tp();
        this.pN.we(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = ContextCompat.FH(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.qp = i2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        QX();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.AL.EQ(z);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.gG = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.mb = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.sE.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(ContextCompat.FH(getContext(), i2));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.jw == z) {
            XL(z, false);
            return;
        }
        this.jw = z;
        setTargetOffsetTopAndBottom((!this.IS ? this.Cz + this.Gj : this.Cz) - this.Z1);
        this.a5 = false;
        rN(this.Nh);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.ys = (int) (displayMetrics.density * 56.0f);
            } else {
                this.ys = (int) (displayMetrics.density * 40.0f);
            }
            this.sE.setImageDrawable(null);
            this.pN.aM(i2);
            this.sE.setImageDrawable(this.pN);
        }
    }

    void setTargetOffsetTopAndBottom(int i2) {
        this.sE.bringToFront();
        ViewCompat.we(this.sE, i2);
        this.Z1 = this.sE.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return this.AL.J0(i2);
    }

    @Override // android.view.View, androidx.core.view.d
    public void stopNestedScroll() {
        this.AL.Ws();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet);
        this.jw = false;
        this.qp = -1.0f;
        this.w9 = new int[2];
        this.hK = new int[2];
        this.Jl = -1;
        this.sg = -1;
        this.Nh = new a();
        this.BR = new f();
        this.AE = new g();
        this.fY = ViewConfiguration.get(context).getScaledTouchSlop();
        this.q7 = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.e3 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.ys = (int) (displayMetrics.density * 40.0f);
        u7();
        ViewCompat.j3(this, true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.Cz = i2;
        this.qp = i2;
        this.zh = new androidx.core.view.h(this);
        this.AL = new androidx.core.view.e(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.ys;
        this.Z1 = i3;
        this.Gj = i3;
        J8(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, An);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
