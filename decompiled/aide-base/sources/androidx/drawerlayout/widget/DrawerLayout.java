package androidx.drawerlayout.widget;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.l;
import androidx.core.widget.d;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    private static final boolean BR;
    static final boolean Nh;
    private final d AL;
    private CharSequence Cz;
    private Drawable Gj;
    private int Jl;
    private int Q6;
    private Drawable QO;
    private final c WB;
    private boolean Z1;
    private Drawable a5;
    private boolean aX;
    private int cT;
    private List<DrawerListener> e3;
    private Drawable e9;
    private DrawerListener eU;
    private Drawable fN;
    private int fY;
    private final e hK;
    private boolean iW;
    private int jw;
    private Paint k2;
    private int kf;
    private float mb;
    private int n5;
    private Object oy;
    private CharSequence pN;
    private Drawable pO;
    private boolean q7;
    private float qp;
    private float sE;
    private Drawable sM;
    private float sg;
    private final e w9;
    private final ArrayList<View> ys;
    private final d zh;
    private static final int[] IS = {R.attr.colorPrimaryDark};
    static final int[] gG = {R.attr.layout_gravity};

    public interface DrawerListener {
        void DW(View view);

        void FH(int i);

        void Hw(View view, float f);

        void j6(View view);
    }

    class a implements View.OnApplyWindowInsetsListener {
        a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        @TargetApi(21)
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).Sf(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class b extends AccessibilityDelegateCompat {
        private final Rect Hw = new Rect();

        b() {
        }

        private void EQ(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.er(childAt)) {
                    accessibilityNodeInfoCompat.DW(childAt);
                }
            }
        }

        private void we(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
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
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Hw(View view, AccessibilityEvent accessibilityEvent) {
            super.Hw(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean VH(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.Nh || DrawerLayout.er(view)) {
                return super.VH(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean j6(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.j6(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewWs = DrawerLayout.this.Ws();
            if (viewWs == null) {
                return true;
            }
            CharSequence charSequenceAM = DrawerLayout.this.aM(DrawerLayout.this.j3(viewWs));
            if (charSequenceAM == null) {
                return true;
            }
            text.add(charSequenceAM);
            return true;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void v5(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (DrawerLayout.Nh) {
                super.v5(view, accessibilityNodeInfoCompat);
            } else {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatEr = AccessibilityNodeInfoCompat.er(accessibilityNodeInfoCompat);
                super.v5(view, accessibilityNodeInfoCompatEr);
                accessibilityNodeInfoCompat.vJ(view);
                Object objZo = ViewCompat.Zo(view);
                if (objZo instanceof View) {
                    accessibilityNodeInfoCompat.sG((View) objZo);
                }
                we(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatEr);
                accessibilityNodeInfoCompatEr.yS();
                EQ(accessibilityNodeInfoCompat, (ViewGroup) view);
            }
            accessibilityNodeInfoCompat.ei(DrawerLayout.class.getName());
            accessibilityNodeInfoCompat.ro(false);
            accessibilityNodeInfoCompat.cn(false);
            accessibilityNodeInfoCompat.gW(AccessibilityNodeInfoCompat.a.DW);
            accessibilityNodeInfoCompat.gW(AccessibilityNodeInfoCompat.a.FH);
        }
    }

    static final class c extends AccessibilityDelegateCompat {
        c() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void v5(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.v5(view, accessibilityNodeInfoCompat);
            if (DrawerLayout.er(view)) {
                return;
            }
            accessibilityNodeInfoCompat.sG(null);
        }
    }

    private class e extends d.c {
        private d DW;
        private final Runnable FH = new a();
        private final int j6;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.Ws();
            }
        }

        e(int i) {
            this.j6 = i;
        }

        private void J8() {
            View viewJ0 = DrawerLayout.this.J0(this.j6 == 3 ? 5 : 3);
            if (viewJ0 != null) {
                DrawerLayout.this.Zo(viewJ0);
            }
        }

        @Override // androidx.core.widget.d.c
        public int DW(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.core.widget.d.c
        public void EQ(View view, int i, int i2, int i3, int i4) {
            float width = (DrawerLayout.this.FH(view, 3) ? i + r3 : DrawerLayout.this.getWidth() - i) / view.getWidth();
            DrawerLayout.this.g3(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.core.widget.d.c
        public int Hw(View view) {
            if (DrawerLayout.this.vy(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.core.widget.d.c
        public boolean J0(View view, int i) {
            return DrawerLayout.this.vy(view) && DrawerLayout.this.FH(view, this.j6) && DrawerLayout.this.XL(view) == 0;
        }

        public void QX() {
            DrawerLayout.this.removeCallbacks(this.FH);
        }

        @Override // androidx.core.widget.d.c
        public boolean VH(int i) {
            return false;
        }

        void Ws() {
            View viewJ0;
            int width;
            int iRN = this.DW.rN();
            boolean z = this.j6 == 3;
            if (z) {
                viewJ0 = DrawerLayout.this.J0(3);
                width = (viewJ0 != null ? -viewJ0.getWidth() : 0) + iRN;
            } else {
                viewJ0 = DrawerLayout.this.J0(5);
                width = DrawerLayout.this.getWidth() - iRN;
            }
            if (viewJ0 != null) {
                if (((!z || viewJ0.getLeft() >= width) && (z || viewJ0.getLeft() <= width)) || DrawerLayout.this.XL(viewJ0) != 0) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) viewJ0.getLayoutParams();
                this.DW.Sf(viewJ0, width, viewJ0.getTop());
                layoutParams.FH = true;
                DrawerLayout.this.invalidate();
                J8();
                DrawerLayout.this.DW();
            }
        }

        public void XL(d dVar) {
            this.DW = dVar;
        }

        @Override // androidx.core.widget.d.c
        public void Zo(int i, int i2) {
            View viewJ0 = (i & 1) == 1 ? DrawerLayout.this.J0(3) : DrawerLayout.this.J0(5);
            if (viewJ0 == null || DrawerLayout.this.XL(viewJ0) != 0) {
                return;
            }
            this.DW.FH(viewJ0, i2);
        }

        @Override // androidx.core.widget.d.c
        public void gn(int i, int i2) {
            DrawerLayout.this.postDelayed(this.FH, 160L);
        }

        @Override // androidx.core.widget.d.c
        public int j6(View view, int i, int i2) {
            if (DrawerLayout.this.FH(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // androidx.core.widget.d.c
        public void tp(int i) {
            DrawerLayout.this.I(this.j6, i, this.DW.lg());
        }

        @Override // androidx.core.widget.d.c
        public void u7(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).FH = false;
            J8();
        }

        @Override // androidx.core.widget.d.c
        public void we(View view, float f, float f2) {
            int i;
            float fMr = DrawerLayout.this.Mr(view);
            int width = view.getWidth();
            if (DrawerLayout.this.FH(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && fMr > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && fMr > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.DW.sG(i, view.getTop());
            DrawerLayout.this.invalidate();
        }
    }

    static {
        Nh = Build.VERSION.SDK_INT >= 19;
        BR = Build.VERSION.SDK_INT >= 21;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    private void Mz(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || vy(childAt)) && !(z && childAt == view)) {
                ViewCompat.U2(childAt, 4);
            } else {
                ViewCompat.U2(childAt, 1);
            }
        }
    }

    static String U2(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    private static boolean a8(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private Drawable dx() {
        int iV5 = ViewCompat.v5(this);
        if (iV5 == 0) {
            Drawable drawable = this.e9;
            if (drawable != null) {
                nw(drawable, iV5);
                return this.e9;
            }
        } else {
            Drawable drawable2 = this.QO;
            if (drawable2 != null) {
                nw(drawable2, iV5);
                return this.QO;
            }
        }
        return this.sM;
    }

    private void ef() {
        if (BR) {
            return;
        }
        this.fN = dx();
        this.Gj = sG();
    }

    static boolean er(View view) {
        return (ViewCompat.Hw(view) == 4 || ViewCompat.Hw(view) == 2) ? false : true;
    }

    private boolean lg() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).FH) {
                return true;
            }
        }
        return false;
    }

    private boolean nw(Drawable drawable, int i) {
        if (drawable == null || !DrawableCompat.j6(drawable)) {
            return false;
        }
        DrawableCompat.DW(drawable, i);
        return true;
    }

    private boolean rN() {
        return Ws() != null;
    }

    private Drawable sG() {
        int iV5 = ViewCompat.v5(this);
        if (iV5 == 0) {
            Drawable drawable = this.QO;
            if (drawable != null) {
                nw(drawable, iV5);
                return this.QO;
            }
        } else {
            Drawable drawable2 = this.e9;
            if (drawable2 != null) {
                nw(drawable2, iV5);
                return this.e9;
            }
        }
        return this.a5;
    }

    public boolean BT(View view) {
        if (vy(view)) {
            return (((LayoutParams) view.getLayoutParams()).Hw & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void DW() {
        if (this.iW) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.iW = true;
    }

    void EQ(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.Hw & 1) == 0) {
            layoutParams.Hw = 1;
            List<DrawerListener> list = this.e3;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.e3.get(size).j6(view);
                }
            }
            Mz(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    boolean FH(View view, int i) {
        return (j3(view) & i) == i;
    }

    void I(int i, int i2, View view) {
        int iGW = this.zh.gW();
        int iGW2 = this.AL.gW();
        int i3 = 2;
        if (iGW == 1 || iGW2 == 1) {
            i3 = 1;
        } else if (iGW != 2 && iGW2 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).DW;
            if (f == 0.0f) {
                tp(view);
            } else if (f == 1.0f) {
                EQ(view);
            }
        }
        if (i3 != this.cT) {
            this.cT = i3;
            List<DrawerListener> list = this.e3;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.e3.get(size).FH(i3);
                }
            }
        }
    }

    View J0(int i) {
        int iJ6 = androidx.core.view.b.j6(i, ViewCompat.v5(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((j3(childAt) & 7) == iJ6) {
                return childAt;
            }
        }
        return null;
    }

    View J8() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).Hw & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    float Mr(View view) {
        return ((LayoutParams) view.getLayoutParams()).DW;
    }

    public boolean P8(int i) {
        View viewJ0 = J0(i);
        if (viewJ0 != null) {
            return ei(viewJ0);
        }
        return false;
    }

    public int QX(int i) {
        int iV5 = ViewCompat.v5(this);
        if (i == 3) {
            int i2 = this.n5;
            if (i2 != 3) {
                return i2;
            }
            int i3 = iV5 == 0 ? this.kf : this.Jl;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.Q6;
            if (i4 != 3) {
                return i4;
            }
            int i5 = iV5 == 0 ? this.Jl : this.kf;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.kf;
            if (i6 != 3) {
                return i6;
            }
            int i7 = iV5 == 0 ? this.n5 : this.Q6;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.Jl;
        if (i8 != 3) {
            return i8;
        }
        int i9 = iV5 == 0 ? this.Q6 : this.n5;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    void SI(View view, float f) {
        float fMr = Mr(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (fMr * width));
        if (!FH(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        g3(view, f);
    }

    public void Sf(Object obj, boolean z) {
        this.oy = obj;
        this.aX = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void VH(View view, boolean z) {
        if (!vy(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.Z1) {
            layoutParams.DW = 0.0f;
            layoutParams.Hw = 0;
        } else if (z) {
            layoutParams.Hw |= 4;
            if (FH(view, 3)) {
                this.zh.Sf(view, -view.getWidth(), view.getTop());
            } else {
                this.AL.Sf(view, getWidth(), view.getTop());
            }
        } else {
            SI(view, 0.0f);
            I(layoutParams.gravity, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    View Ws() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (vy(childAt) && ei(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int XL(View view) {
        if (vy(view)) {
            return QX(((LayoutParams) view.getLayoutParams()).gravity);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void Zo(View view) {
        VH(view, true);
    }

    public CharSequence aM(int i) {
        int iJ6 = androidx.core.view.b.j6(i, ViewCompat.v5(this));
        if (iJ6 == 3) {
            return this.Cz;
        }
        if (iJ6 == 5) {
            return this.pN;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!vy(childAt)) {
                this.ys.add(childAt);
            } else if (BT(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.ys.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.ys.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.ys.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (J8() != null || vy(view)) {
            ViewCompat.U2(view, 4);
        } else {
            ViewCompat.U2(view, 1);
        }
        if (Nh) {
            return;
        }
        ViewCompat.XL(view, this.WB);
    }

    public void cb(DrawerListener drawerListener) {
        List<DrawerListener> list;
        if (drawerListener == null || (list = this.e3) == null) {
            return;
        }
        list.remove(drawerListener);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void closeDrawer(int i) {
        v5(i, true);
    }

    public void cn(View view) {
        sh(view, true);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).DW);
        }
        this.qp = fMax;
        boolean zJ8 = this.zh.J8(true);
        boolean zJ82 = this.AL.J8(true);
        if (zJ8 || zJ82) {
            ViewCompat.J8(this);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean zYS = yS(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zYS) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && a8(childAt) && vy(childAt) && childAt.getHeight() >= height) {
                    if (FH(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.qp;
        if (f > 0.0f && zYS) {
            this.k2.setColor((this.fY & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.k2);
        } else if (this.fN != null && FH(view, 3)) {
            int intrinsicWidth = this.fN.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.zh.rN(), 1.0f));
            this.fN.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.fN.setAlpha((int) (fMax * 255.0f));
            this.fN.draw(canvas);
        } else if (this.Gj != null && FH(view, 5)) {
            int intrinsicWidth2 = this.Gj.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.AL.rN(), 1.0f));
            this.Gj.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.Gj.setAlpha((int) (fMax2 * 255.0f));
            this.Gj.draw(canvas);
        }
        return zDrawChild;
    }

    public boolean ei(View view) {
        if (vy(view)) {
            return ((LayoutParams) view.getLayoutParams()).DW > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void g3(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.DW) {
            return;
        }
        layoutParams.DW = f;
        we(view, f);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (BR) {
            return this.mb;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.pO;
    }

    public void gn() {
        u7(false);
    }

    public boolean isDrawerOpen(int i) {
        View viewJ0 = J0(i);
        if (viewJ0 != null) {
            return BT(viewJ0);
        }
        return false;
    }

    int j3(View view) {
        return androidx.core.view.b.j6(((LayoutParams) view.getLayoutParams()).gravity, ViewCompat.v5(this));
    }

    public void j6(DrawerListener drawerListener) {
        if (drawerListener == null) {
            return;
        }
        if (this.e3 == null) {
            this.e3 = new ArrayList();
        }
        this.e3.add(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z1 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.aX || this.pO == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.oy) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.pO.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.pO.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.core.widget.d r1 = r6.zh
            boolean r1 = r1.ef(r7)
            androidx.core.widget.d r2 = r6.AL
            boolean r2 = r2.ef(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            androidx.core.widget.d r7 = r6.zh
            boolean r7 = r7.v5(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$e r7 = r6.w9
            r7.QX()
            androidx.drawerlayout.widget.DrawerLayout$e r7 = r6.hK
            r7.QX()
            goto L36
        L31:
            r6.u7(r2)
            r6.iW = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.sE = r0
            r6.sg = r7
            float r4 = r6.qp
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            androidx.core.widget.d r4 = r6.zh
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.U2(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.yS(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r6.iW = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.lg()
            if (r7 != 0) goto L70
            boolean r7 = r6.iW
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = 0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !rN()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewWs = Ws();
        if (viewWs != null && XL(viewWs) == 0) {
            gn();
        }
        return viewWs != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        this.q7 = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (yS(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (FH(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.DW * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r11) / f3;
                        i5 = i6 - ((int) (layoutParams.DW * f3));
                    }
                    boolean z2 = f != layoutParams.DW;
                    int i9 = layoutParams.gravity & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i11 < i12) {
                            i11 = i12;
                        } else {
                            int i13 = i11 + measuredHeight;
                            int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i13 > i10 - i14) {
                                i11 = (i10 - i14) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z2) {
                        g3(childAt, f);
                    }
                    int i17 = layoutParams.DW > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
        }
        this.q7 = false;
        this.Z1 = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.oy != null && ViewCompat.FH(this);
        int iV5 = ViewCompat.v5(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int iJ6 = androidx.core.view.b.j6(layoutParams.gravity, iV5);
                    if (ViewCompat.FH(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.oy;
                            if (iJ6 == 3) {
                                windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), i3, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                            } else if (iJ6 == 5) {
                                windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(i3, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.oy;
                        if (iJ6 == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), i3, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iJ6 == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(i3, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (yS(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!vy(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (BR) {
                        float fDW = ViewCompat.DW(childAt);
                        float f = this.mb;
                        if (fDW != f) {
                            ViewCompat.Mr(childAt, f);
                        }
                    }
                    int iJ3 = j3(childAt) & 7;
                    boolean z4 = iJ3 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + U2(iJ3) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.jw + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
            i4++;
            i3 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewJ0;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.j6());
        int i = savedState.jw;
        if (i != 0 && (viewJ0 = J0(i)) != null) {
            cn(viewJ0);
        }
        int i2 = savedState.fY;
        if (i2 != 3) {
            vJ(i2, 3);
        }
        int i3 = savedState.qp;
        if (i3 != 3) {
            vJ(i3, 5);
        }
        int i4 = savedState.k2;
        if (i4 != 3) {
            vJ(i4, 8388611);
        }
        int i5 = savedState.zh;
        if (i5 != 3) {
            vJ(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        ef();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            boolean z = layoutParams.Hw == 1;
            boolean z2 = layoutParams.Hw == 2;
            if (z || z2) {
                savedState.jw = layoutParams.gravity;
                break;
            }
        }
        savedState.fY = this.n5;
        savedState.qp = this.Q6;
        savedState.k2 = this.kf;
        savedState.zh = this.Jl;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.core.widget.d r0 = r6.zh
            r0.nw(r7)
            androidx.core.widget.d r0 = r6.AL
            r0.nw(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L70
        L1a:
            r6.u7(r2)
            r6.iW = r1
            goto L70
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.core.widget.d r3 = r6.zh
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.U2(r4, r5)
            if (r3 == 0) goto L5d
            boolean r3 = r6.yS(r3)
            if (r3 == 0) goto L5d
            float r3 = r6.sE
            float r0 = r0 - r3
            float r3 = r6.sg
            float r7 = r7 - r3
            androidx.core.widget.d r3 = r6.zh
            int r3 = r3.yS()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            android.view.View r7 = r6.J8()
            if (r7 == 0) goto L5d
            int r7 = r6.XL(r7)
            r0 = 2
            if (r7 != r0) goto L5e
        L5d:
            r1 = 1
        L5e:
            r6.u7(r1)
            goto L70
        L62:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.sE = r0
            r6.sg = r7
            r6.iW = r1
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void openDrawer(int i) {
        ro(i, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            u7(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.q7) {
            return;
        }
        super.requestLayout();
    }

    public void ro(int i, boolean z) {
        View viewJ0 = J0(i);
        if (viewJ0 != null) {
            sh(viewJ0, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + U2(i));
    }

    public void setDrawerElevation(float f) {
        this.mb = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (vy(childAt)) {
                ViewCompat.Mr(childAt, this.mb);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        DrawerListener drawerListener2 = this.eU;
        if (drawerListener2 != null) {
            cb(drawerListener2);
        }
        if (drawerListener != null) {
            j6(drawerListener);
        }
        this.eU = drawerListener;
    }

    public void setDrawerLockMode(int i) {
        vJ(i, 3);
        vJ(i, 5);
    }

    public void setScrimColor(int i) {
        this.fY = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.pO = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.pO = new ColorDrawable(i);
        invalidate();
    }

    public void sh(View view, boolean z) {
        if (!vy(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.Z1) {
            layoutParams.DW = 1.0f;
            layoutParams.Hw = 1;
            Mz(view, true);
        } else if (z) {
            layoutParams.Hw |= 2;
            if (FH(view, 3)) {
                this.zh.Sf(view, 0, view.getTop());
            } else {
                this.AL.Sf(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            SI(view, 1.0f);
            I(layoutParams.gravity, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    void tp(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.Hw & 1) == 1) {
            layoutParams.Hw = 0;
            List<DrawerListener> list = this.e3;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.e3.get(size).DW(view);
                }
            }
            Mz(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void u7(boolean z) {
        int childCount = getChildCount();
        boolean zSf = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (vy(childAt) && (!z || layoutParams.FH)) {
                zSf |= FH(childAt, 3) ? this.zh.Sf(childAt, -childAt.getWidth(), childAt.getTop()) : this.AL.Sf(childAt, getWidth(), childAt.getTop());
                layoutParams.FH = false;
            }
        }
        this.w9.QX();
        this.hK.QX();
        if (zSf) {
            invalidate();
        }
    }

    public void v5(int i, boolean z) {
        View viewJ0 = J0(i);
        if (viewJ0 != null) {
            VH(viewJ0, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + U2(i));
    }

    public void vJ(int i, int i2) {
        View viewJ0;
        int iJ6 = androidx.core.view.b.j6(i2, ViewCompat.v5(this));
        if (i2 == 3) {
            this.n5 = i;
        } else if (i2 == 5) {
            this.Q6 = i;
        } else if (i2 == 8388611) {
            this.kf = i;
        } else if (i2 == 8388613) {
            this.Jl = i;
        }
        if (i != 0) {
            (iJ6 == 3 ? this.zh : this.AL).DW();
        }
        if (i != 1) {
            if (i == 2 && (viewJ0 = J0(iJ6)) != null) {
                cn(viewJ0);
                return;
            }
            return;
        }
        View viewJ02 = J0(iJ6);
        if (viewJ02 != null) {
            Zo(viewJ02);
        }
    }

    boolean vy(View view) {
        int iJ6 = androidx.core.view.b.j6(((LayoutParams) view.getLayoutParams()).gravity, ViewCompat.v5(view));
        return ((iJ6 & 3) == 0 && (iJ6 & 5) == 0) ? false : true;
    }

    void we(View view, float f) {
        List<DrawerListener> list = this.e3;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.e3.get(size).Hw(view, f);
            }
        }
    }

    boolean yS(View view) {
        return ((LayoutParams) view.getLayoutParams()).gravity == 0;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.WB = new c();
        this.fY = -1728053248;
        this.k2 = new Paint();
        this.Z1 = true;
        this.n5 = 3;
        this.Q6 = 3;
        this.kf = 3;
        this.Jl = 3;
        this.e9 = null;
        this.QO = null;
        this.sM = null;
        this.a5 = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.jw = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.w9 = new e(3);
        this.hK = new e(5);
        d dVarWs = d.Ws(this, 1.0f, this.w9);
        this.zh = dVarWs;
        dVarWs.cb(1);
        this.zh.dx(f2);
        this.w9.XL(this.zh);
        d dVarWs2 = d.Ws(this, 1.0f, this.hK);
        this.AL = dVarWs2;
        dVarWs2.cb(2);
        this.AL.dx(f2);
        this.hK.XL(this.AL);
        setFocusableInTouchMode(true);
        ViewCompat.U2(this, 1);
        ViewCompat.XL(this, new b());
        l.j6(this, false);
        if (ViewCompat.FH(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a());
                setSystemUiVisibility(1280);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(IS);
                try {
                    this.pO = typedArrayObtainStyledAttributes.getDrawable(0);
                } finally {
                    typedArrayObtainStyledAttributes.recycle();
                }
            } else {
                this.pO = null;
            }
        }
        this.mb = f * 10.0f;
        this.ys = new ArrayList<>();
    }

    public void setStatusBarBackground(int i) {
        this.pO = i != 0 ? ContextCompat.getDrawable(getContext(), i) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        float DW;
        boolean FH;
        int Hw;
        public int gravity;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.gG);
            this.gravity = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = 0;
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int fY;
        int jw;
        int k2;
        int qp;
        int zh;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.jw = 0;
            this.jw = parcel.readInt();
            this.fY = parcel.readInt();
            this.qp = parcel.readInt();
            this.k2 = parcel.readInt();
            this.zh = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.jw);
            parcel.writeInt(this.fY);
            parcel.writeInt(this.qp);
            parcel.writeInt(this.k2);
            parcel.writeInt(this.zh);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.jw = 0;
        }
    }
}
