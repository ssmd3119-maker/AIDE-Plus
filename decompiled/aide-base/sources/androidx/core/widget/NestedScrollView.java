package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.core.view.e;
import androidx.core.view.g;
import androidx.core.view.h;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements g, androidx.core.view.d {
    private boolean AL;
    private b Cz;
    private float Gj;
    private int Jl;
    private int Q6;
    private long WB;
    private boolean Z1;
    private VelocityTracker cT;
    private int e3;
    private final int[] eU;
    private final e fN;
    private EdgeEffect fY;
    private boolean hK;
    private final int[] iW;
    private OverScroller jw;
    private int k2;
    private int kf;
    private final Rect mb;
    private int n5;
    private final h pO;
    private boolean q7;
    private EdgeEffect qp;
    private int sE;
    private SavedState sg;
    private View w9;
    private boolean zh;
    private static final a pN = new a();
    private static final int[] oy = {R.attr.fillViewport};

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int WB;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.WB + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.WB);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.WB = parcel.readInt();
        }
    }

    static class a extends AccessibilityDelegateCompat {
        a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Hw(View view, AccessibilityEvent accessibilityEvent) {
            super.Hw(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AccessibilityRecordCompat.j6(accessibilityEvent, nestedScrollView.getScrollX());
            AccessibilityRecordCompat.DW(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean gn(View view, int i, Bundle bundle) {
            if (super.gn(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int iMin = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.cn(0, iMin);
                return true;
            }
            if (i != 8192) {
                return false;
            }
            int iMax = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
            if (iMax == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.cn(0, iMax);
            return true;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void v5(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            super.v5(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.ei(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            accessibilityNodeInfoCompat.ef(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.j6(8192);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfoCompat.j6(4096);
            }
        }
    }

    public interface b {
        void j6(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private void BT(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Jl) {
            int i = actionIndex == 0 ? 1 : 0;
            this.k2 = (int) motionEvent.getY(i);
            this.Jl = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.cT;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void J0() {
        this.hK = false;
        ei();
        cb(0);
        EdgeEffect edgeEffect = this.fY;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.qp.onRelease();
        }
    }

    private void J8() {
        if (getOverScrollMode() == 2) {
            this.fY = null;
            this.qp = null;
        } else if (this.fY == null) {
            Context context = getContext();
            this.fY = new EdgeEffect(context);
            this.qp = new EdgeEffect(context);
        }
    }

    private boolean KD(Rect rect, boolean z) {
        int iU7 = u7(rect);
        boolean z2 = iU7 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iU7);
            } else {
                ro(0, iU7);
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View QX(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            r9 = 1
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            if (r3 != 0) goto L2e
            r3 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r3.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r3.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = 1
            goto L41
        L40:
            r7 = 0
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r3 = r6
            r5 = 1
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r3 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.QX(boolean, int, int):android.view.View");
    }

    private void SI(View view) {
        view.getDrawingRect(this.mb);
        offsetDescendantRectToMyCoords(view, this.mb);
        int iU7 = u7(this.mb);
        if (iU7 != 0) {
            scrollBy(0, iU7);
        }
    }

    private boolean U2(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    private boolean VH() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        }
        return false;
    }

    private void a8() {
        VelocityTracker velocityTracker = this.cT;
        if (velocityTracker == null) {
            this.cT = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void aM(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = i;
        if (dispatchNestedPreFling(0.0f, f)) {
            return;
        }
        dispatchNestedFling(0.0f, f, z);
        XL(i);
    }

    private void ei() {
        VelocityTracker velocityTracker = this.cT;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.cT = null;
        }
    }

    private boolean er(View view) {
        return !gW(view, 0, getHeight());
    }

    private boolean gW(View view, int i, int i2) {
        view.getDrawingRect(this.mb);
        offsetDescendantRectToMyCoords(view, this.mb);
        return this.mb.bottom + i >= getScrollY() && this.mb.top - i <= getScrollY() + i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.Gj == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.Gj = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.Gj;
    }

    private static int gn(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private void lg() {
        this.jw = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.n5 = viewConfiguration.getScaledTouchSlop();
        this.Q6 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.kf = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private boolean nw(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View viewQX = QX(z2, i2, i3);
        if (viewQX == null) {
            viewQX = this;
        }
        if (i2 < scrollY || i3 > i4) {
            we(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (viewQX != findFocus()) {
            viewQX.requestFocus(i);
        }
        return z;
    }

    private void rN() {
        if (this.cT == null) {
            this.cT = VelocityTracker.obtain();
        }
    }

    private void we(int i) {
        if (i != 0) {
            if (this.Z1) {
                ro(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private static boolean yS(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && yS((View) parent, view2);
    }

    public boolean EQ(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.fN.Zo(i, i2, i3, i4, iArr, i5);
    }

    public boolean Mr(int i) {
        return this.fN.u7(i);
    }

    public boolean P8(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.mb.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.mb.top + height > childAt.getBottom()) {
                    this.mb.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.mb.top = getScrollY() - height;
            Rect rect = this.mb;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        Rect rect2 = this.mb;
        int i2 = rect2.top;
        int i3 = height + i2;
        rect2.bottom = i3;
        return nw(i, i2, i3);
    }

    public boolean Ws(KeyEvent keyEvent) {
        this.mb.setEmpty();
        if (!VH()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? Zo(33) : j3(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? Zo(130) : j3(130);
        }
        if (keyCode != 62) {
            return false;
        }
        P8(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    public void XL(int i) {
        if (getChildCount() > 0) {
            sh(2, 1);
            this.jw.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.sE = getScrollY();
            ViewCompat.J8(this);
        }
    }

    public boolean Zo(int i) {
        int bottom;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !gW(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0 && (bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom())) < maxScrollAmount) {
                maxScrollAmount = bottom;
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            we(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.mb);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.mb);
            we(u7(this.mb));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !er(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void cb(int i) {
        this.fN.QX(i);
    }

    public final void cn(int i, int i2) {
        ro(i - getScrollX(), i2 - getScrollY());
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.jw.computeScrollOffset()) {
            if (Mr(1)) {
                cb(1);
            }
            this.sE = 0;
            return;
        }
        this.jw.getCurrX();
        int currY = this.jw.getCurrY();
        int i = currY - this.sE;
        if (tp(0, i, this.eU, null, 1)) {
            i -= this.eU[1];
        }
        int i2 = i;
        if (i2 != 0) {
            int scrollRange = getScrollRange();
            int scrollY = getScrollY();
            vy(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            if (!EQ(0, scrollY2, 0, i2 - scrollY2, null, 1)) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    J8();
                    if (currY <= 0 && scrollY > 0) {
                        this.fY.onAbsorb((int) this.jw.getCurrVelocity());
                    } else if (currY >= scrollRange && scrollY < scrollRange) {
                        this.qp.onAbsorb((int) this.jw.getCurrVelocity());
                    }
                }
            }
        }
        this.sE = currY;
        ViewCompat.J8(this);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || Ws(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.fN.j6(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.fN.DW(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.fN.FH(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.fN.v5(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.fY != null) {
            int scrollY = getScrollY();
            if (!this.fY.isFinished()) {
                int iSave = canvas.save();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft(), Math.min(0, scrollY));
                this.fY.setSize(width, getHeight());
                if (this.fY.draw(canvas)) {
                    ViewCompat.J8(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.qp.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = getHeight();
            canvas.translate((-width2) + getPaddingLeft(), Math.max(getScrollRange(), scrollY) + height);
            canvas.rotate(180.0f, width2, 0.0f);
            this.qp.setSize(width2, height);
            if (this.qp.draw(canvas)) {
                ViewCompat.J8(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.pO.j6();
    }

    int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.fN.gn();
    }

    @Override // android.view.View, androidx.core.view.d
    public boolean isNestedScrollingEnabled() {
        return this.fN.tp();
    }

    public boolean j3(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.mb;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.mb.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            Rect rect2 = this.mb;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.mb;
        return nw(i, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.AL = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.hK) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto Ld
            boolean r3 = r11.hK
            if (r3 == 0) goto Ld
            return r2
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto La2
            r4 = -1
            if (r0 == r2) goto L7d
            if (r0 == r1) goto L24
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 6
            if (r0 == r1) goto L1f
            goto Ld9
        L1f:
            r11.BT(r12)
            goto Ld9
        L24:
            int r0 = r11.Jl
            if (r0 != r4) goto L2a
            goto Ld9
        L2a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L4d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto Ld9
        L4d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.k2
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.n5
            if (r4 <= r5) goto Ld9
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto Ld9
            r11.hK = r2
            r11.k2 = r0
            r11.rN()
            android.view.VelocityTracker r0 = r11.cT
            r0.addMovement(r12)
            r11.e3 = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto Ld9
            r12.requestDisallowInterceptTouchEvent(r2)
            goto Ld9
        L7d:
            r11.hK = r3
            r11.Jl = r4
            r11.ei()
            android.widget.OverScroller r4 = r11.jw
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L9e
            androidx.core.view.ViewCompat.J8(r11)
        L9e:
            r11.cb(r3)
            goto Ld9
        La2:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            boolean r4 = r11.U2(r4, r0)
            if (r4 != 0) goto Lb8
            r11.hK = r3
            r11.ei()
            goto Ld9
        Lb8:
            r11.k2 = r0
            int r0 = r12.getPointerId(r3)
            r11.Jl = r0
            r11.a8()
            android.view.VelocityTracker r0 = r11.cT
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.jw
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.jw
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.hK = r12
            r11.sh(r1, r3)
        Ld9:
            boolean r12 = r11.hK
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.zh = false;
        View view = this.w9;
        if (view != null && yS(view, this)) {
            SI(this.w9);
        }
        this.w9 = null;
        if (!this.AL) {
            if (this.sg != null) {
                scrollTo(getScrollX(), this.sg.WB);
                this.sg = null;
            }
            int iMax = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > iMax) {
                scrollTo(getScrollX(), iMax);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.AL = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.q7 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        aM((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.pO.DW(view, view2, i);
        startNestedScroll(2);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || er(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.sg = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.WB = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        b bVar = this.Cz;
        if (bVar != null) {
            bVar.j6(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !gW(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.mb);
        offsetDescendantRectToMyCoords(viewFindFocus, this.mb);
        we(u7(this.mb));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.g
    public void onStopNestedScroll(View view) {
        this.pO.Hw(view);
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        rN();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e3 = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.e3);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.cT;
                velocityTracker.computeCurrentVelocity(1000, this.kf);
                int yVelocity = (int) velocityTracker.getYVelocity(this.Jl);
                if (Math.abs(yVelocity) > this.Q6) {
                    aM(-yVelocity);
                } else if (this.jw.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.J8(this);
                }
                this.Jl = -1;
                J0();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.Jl);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.Jl + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i = this.k2 - y;
                    if (tp(0, i, this.eU, this.iW, 0)) {
                        i -= this.eU[1];
                        motionEventObtain.offsetLocation(0.0f, this.iW[1]);
                        this.e3 += this.iW[1];
                    }
                    if (!this.hK && Math.abs(i) > this.n5) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.hK = true;
                        i = i > 0 ? i - this.n5 : i + this.n5;
                    }
                    int i2 = i;
                    if (this.hK) {
                        this.k2 = y - this.iW[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (vy(0, i2, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !Mr(0)) {
                            this.cT.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (EQ(0, scrollY2, 0, i2 - scrollY2, this.iW, 0)) {
                            this.k2 = this.k2 - this.iW[1];
                            motionEventObtain.offsetLocation(0.0f, r1[1]);
                            this.e3 += this.iW[1];
                        } else if (z) {
                            J8();
                            int i3 = scrollY + i2;
                            if (i3 < 0) {
                                EdgeEffectCompat.j6(this.fY, i2 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.qp.isFinished()) {
                                    this.qp.onRelease();
                                }
                            } else if (i3 > scrollRange) {
                                EdgeEffectCompat.j6(this.qp, i2 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.fY.isFinished()) {
                                    this.fY.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.fY;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.qp.isFinished())) {
                                ViewCompat.J8(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.hK && getChildCount() > 0 && this.jw.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.J8(this);
                }
                this.Jl = -1;
                J0();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.k2 = (int) motionEvent.getY(actionIndex);
                this.Jl = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                BT(motionEvent);
                this.k2 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.Jl));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z2 = !this.jw.isFinished();
            this.hK = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.jw.isFinished()) {
                this.jw.abortAnimation();
            }
            this.k2 = (int) motionEvent.getY();
            this.Jl = motionEvent.getPointerId(0);
            sh(2, 0);
        }
        VelocityTracker velocityTracker2 = this.cT;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.zh) {
            this.w9 = view2;
        } else {
            SI(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return KD(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            ei();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.zh = true;
        super.requestLayout();
    }

    public final void ro(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.WB > 250) {
            int iMax = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
            int scrollY = getScrollY();
            this.jw.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, iMax)) - scrollY);
            ViewCompat.J8(this);
        } else {
            if (!this.jw.isFinished()) {
                this.jw.abortAnimation();
            }
            scrollBy(i, i2);
        }
        this.WB = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int iGn = gn(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int iGn2 = gn(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (iGn == getScrollX() && iGn2 == getScrollY()) {
                return;
            }
            super.scrollTo(iGn, iGn2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.q7) {
            this.q7 = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.fN.EQ(z);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.Cz = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.Z1 = z;
    }

    public boolean sh(int i, int i2) {
        return this.fN.J8(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.fN.J0(i);
    }

    @Override // android.view.View, androidx.core.view.d
    public void stopNestedScroll() {
        this.fN.Ws();
    }

    public boolean tp(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.fN.Hw(i, i2, iArr, iArr2, i3);
    }

    protected int u7(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i) + 0, getChildAt(0).getBottom() - i);
        }
        if (rect.top >= scrollY || rect.bottom >= i) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean vy(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.Mr(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.jw
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.vy(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mb = new Rect();
        this.zh = true;
        this.AL = false;
        this.w9 = null;
        this.hK = false;
        this.Z1 = true;
        this.Jl = -1;
        this.iW = new int[2];
        this.eU = new int[2];
        lg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oy, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.pO = new h(this);
        this.fN = new e(this);
        setNestedScrollingEnabled(true);
        ViewCompat.XL(this, pN);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
