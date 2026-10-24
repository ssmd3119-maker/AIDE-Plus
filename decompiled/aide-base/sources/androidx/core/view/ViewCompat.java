package androidx.core.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ViewCompat {
    static final j j6;

    static class a extends j {
        a() {
        }
    }

    static class b extends a {
        b() {
        }

        @Override // androidx.core.view.ViewCompat.j
        public boolean FH(View view) {
            return view.getFitsSystemWindows();
        }

        @Override // androidx.core.view.ViewCompat.j
        public void QX(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        @Override // androidx.core.view.ViewCompat.j
        public ViewParent VH(View view) {
            return view.getParentForAccessibility();
        }

        @Override // androidx.core.view.ViewCompat.j
        public void Ws(View view) {
            view.postInvalidateOnAnimation();
        }

        @Override // androidx.core.view.ViewCompat.j
        public void XL(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @Override // androidx.core.view.ViewCompat.j
        public void a8(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }

        @Override // androidx.core.view.ViewCompat.j
        public void j3(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @Override // androidx.core.view.ViewCompat.j
        public boolean u7(View view) {
            return view.hasOverlappingRendering();
        }

        @Override // androidx.core.view.ViewCompat.j
        public int v5(View view) {
            return view.getImportantForAccessibility();
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.core.view.ViewCompat.j
        public int Zo(View view) {
            return view.getLayoutDirection();
        }

        @Override // androidx.core.view.ViewCompat.j
        public void lg(View view, Paint paint) {
            view.setLayerPaint(paint);
        }
    }

    static class d extends c {
        d() {
        }
    }

    static class e extends d {
        e() {
        }

        @Override // androidx.core.view.ViewCompat.b, androidx.core.view.ViewCompat.j
        public void a8(View view, int i) {
            view.setImportantForAccessibility(i);
        }

        @Override // androidx.core.view.ViewCompat.j
        public boolean tp(View view) {
            return view.isAttachedToWindow();
        }
    }

    static class f extends e {
        private static ThreadLocal<Rect> FH;

        class a implements View.OnApplyWindowInsetsListener {
            final /* synthetic */ androidx.core.view.i j6;

            a(f fVar, androidx.core.view.i iVar) {
                this.j6 = iVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return (WindowInsets) n.VH(this.j6.j6(view, n.gn(windowInsets)));
            }
        }

        f() {
        }

        private static Rect gW() {
            if (FH == null) {
                FH = new ThreadLocal<>();
            }
            Rect rect = FH.get();
            if (rect == null) {
                rect = new Rect();
                FH.set(rect);
            }
            rect.setEmpty();
            return rect;
        }

        @Override // androidx.core.view.ViewCompat.j
        public float DW(View view) {
            return view.getElevation();
        }

        @Override // androidx.core.view.ViewCompat.j
        public boolean EQ(View view) {
            return view.isNestedScrollingEnabled();
        }

        @Override // androidx.core.view.ViewCompat.j
        public void J0(View view, int i) {
            boolean z;
            Rect rectGW = gW();
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                rectGW.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !rectGW.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.J0(view, i);
            if (z && rectGW.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(rectGW);
            }
        }

        @Override // androidx.core.view.ViewCompat.j
        public n J8(View view, n nVar) {
            WindowInsets windowInsets = (WindowInsets) n.VH(nVar);
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (windowInsetsOnApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(windowInsetsOnApplyWindowInsets);
            }
            return n.gn(windowInsets);
        }

        @Override // androidx.core.view.ViewCompat.j
        public void U2(View view, float f) {
            view.setElevation(f);
        }

        @Override // androidx.core.view.ViewCompat.j
        public void er(View view) {
            view.stopNestedScroll();
        }

        @Override // androidx.core.view.ViewCompat.j
        public String gn(View view) {
            return view.getTransitionName();
        }

        @Override // androidx.core.view.ViewCompat.j
        public n j6(View view, n nVar) {
            WindowInsets windowInsets = (WindowInsets) n.VH(nVar);
            WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
            if (windowInsetsDispatchApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(windowInsetsDispatchApplyWindowInsets);
            }
            return n.gn(windowInsets);
        }

        @Override // androidx.core.view.ViewCompat.j
        public void rN(View view, androidx.core.view.i iVar) {
            if (iVar == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new a(this, iVar));
            }
        }

        @Override // androidx.core.view.ViewCompat.j
        public void we(View view, int i) {
            boolean z;
            Rect rectGW = gW();
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                rectGW.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !rectGW.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.we(view, i);
            if (z && rectGW.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(rectGW);
            }
        }
    }

    static class g extends f {
        g() {
        }

        @Override // androidx.core.view.ViewCompat.f, androidx.core.view.ViewCompat.j
        public void J0(View view, int i) {
            view.offsetTopAndBottom(i);
        }

        @Override // androidx.core.view.ViewCompat.f, androidx.core.view.ViewCompat.j
        public void we(View view, int i) {
            view.offsetLeftAndRight(i);
        }
    }

    static class h extends g {
        h() {
        }
    }

    static class i extends h {
        i() {
        }
    }

    static class j {
        private static Method DW;
        private static WeakHashMap<View, String> j6;

        j() {
        }

        private static void yS(View view) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
        }

        public float DW(View view) {
            return 0.0f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean EQ(View view) {
            if (view instanceof androidx.core.view.d) {
                return ((androidx.core.view.d) view).isNestedScrollingEnabled();
            }
            return false;
        }

        public boolean FH(View view) {
            return false;
        }

        long Hw() {
            return ValueAnimator.getFrameDelay();
        }

        public void J0(View view, int i) {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                yS(view);
                Object parent = view.getParent();
                if (parent instanceof View) {
                    yS((View) parent);
                }
            }
        }

        public n J8(View view, n nVar) {
            return nVar;
        }

        public void Mr(ViewGroup viewGroup, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (DW == null) {
                try {
                    DW = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e) {
                    Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e);
                }
                DW.setAccessible(true);
            }
            try {
                DW.invoke(viewGroup, Boolean.valueOf(z));
            } catch (IllegalAccessException e2) {
                Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e2);
            } catch (IllegalArgumentException e3) {
                Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e3);
            } catch (InvocationTargetException e4) {
                Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e4);
            }
        }

        public void QX(View view, int i, int i2, int i3, int i4) {
            view.postInvalidate(i, i2, i3, i4);
        }

        public void U2(View view, float f) {
        }

        public ViewParent VH(View view) {
            return view.getParent();
        }

        public void Ws(View view) {
            view.postInvalidate();
        }

        public void XL(View view, Runnable runnable) {
            view.postDelayed(runnable, Hw());
        }

        public int Zo(View view) {
            return 0;
        }

        public void a8(View view, int i) {
        }

        public void aM(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
            view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.FH());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void er(View view) {
            if (view instanceof androidx.core.view.d) {
                ((androidx.core.view.d) view).stopNestedScroll();
            }
        }

        public String gn(View view) {
            WeakHashMap<View, String> weakHashMap = j6;
            if (weakHashMap == null) {
                return null;
            }
            return weakHashMap.get(view);
        }

        public void j3(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        public n j6(View view, n nVar) {
            return nVar;
        }

        public void lg(View view, Paint paint) {
            view.setLayerType(view.getLayerType(), paint);
            view.invalidate();
        }

        public void rN(View view, androidx.core.view.i iVar) {
        }

        public boolean tp(View view) {
            return view.getWindowToken() != null;
        }

        public boolean u7(View view) {
            return true;
        }

        public int v5(View view) {
            return 0;
        }

        public void we(View view, int i) {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                yS(view);
                Object parent = view.getParent();
                if (parent instanceof View) {
                    yS((View) parent);
                }
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            j6 = new i();
            return;
        }
        if (i2 >= 24) {
            j6 = new h();
            return;
        }
        if (i2 >= 23) {
            j6 = new g();
            return;
        }
        if (i2 >= 21) {
            j6 = new f();
            return;
        }
        if (i2 >= 19) {
            j6 = new e();
            return;
        }
        if (i2 >= 18) {
            j6 = new d();
            return;
        }
        if (i2 >= 17) {
            j6 = new c();
            return;
        }
        if (i2 >= 16) {
            j6 = new b();
        } else if (i2 >= 15) {
            j6 = new a();
        } else {
            j6 = new j();
        }
    }

    public static float DW(View view) {
        return j6.DW(view);
    }

    public static void EQ(View view, int i2) {
        j6.we(view, i2);
    }

    public static boolean FH(View view) {
        return j6.FH(view);
    }

    public static int Hw(View view) {
        return j6.v5(view);
    }

    public static n J0(View view, n nVar) {
        return j6.J8(view, nVar);
    }

    public static void J8(View view) {
        j6.Ws(view);
    }

    public static void Mr(View view, float f2) {
        j6.U2(view, f2);
    }

    public static void QX(View view, Runnable runnable) {
        j6.XL(view, runnable);
    }

    public static void U2(View view, int i2) {
        j6.a8(view, i2);
    }

    public static String VH(View view) {
        return j6.gn(view);
    }

    public static void Ws(View view, int i2, int i3, int i4, int i5) {
        j6.QX(view, i2, i3, i4, i5);
    }

    public static void XL(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        j6.aM(view, accessibilityDelegateCompat);
    }

    public static ViewParent Zo(View view) {
        return j6.VH(view);
    }

    public static void a8(View view, Paint paint) {
        j6.lg(view, paint);
    }

    public static void aM(View view, Drawable drawable) {
        j6.j3(view, drawable);
    }

    public static boolean gn(View view) {
        return j6.u7(view);
    }

    public static boolean isAttachedToWindow(View view) {
        return j6.tp(view);
    }

    public static void j3(ViewGroup viewGroup, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        j6.Mr(viewGroup, z);
    }

    public static n j6(View view, n nVar) {
        return j6.j6(view, nVar);
    }

    public static void lg(View view, androidx.core.view.i iVar) {
        j6.rN(view, iVar);
    }

    public static void rN(View view) {
        j6.er(view);
    }

    public static boolean tp(View view) {
        return j6.EQ(view);
    }

    public static int v5(View view) {
        return j6.Zo(view);
    }

    public static void we(View view, int i2) {
        j6.J0(view, i2);
    }
}
