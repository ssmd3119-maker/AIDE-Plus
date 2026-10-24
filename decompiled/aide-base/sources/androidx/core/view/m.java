package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class m {
    static final c j6;

    static class a extends c {
        a() {
        }
    }

    static class b extends a {
        b() {
        }

        @Override // androidx.core.view.m.c
        public boolean DW(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        }

        @Override // androidx.core.view.m.c
        public void FH(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }

        @Override // androidx.core.view.m.c
        public void Hw(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }

        @Override // androidx.core.view.m.c
        public void VH(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }

        @Override // androidx.core.view.m.c
        public boolean Zo(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        }

        @Override // androidx.core.view.m.c
        public boolean j6(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
                return false;
            }
        }

        @Override // androidx.core.view.m.c
        public void v5(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    static class c {
        c() {
        }

        public boolean DW(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof g) {
                return ((g) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }

        public void FH(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof g) {
                ((g) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        public void Hw(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof g) {
                ((g) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        public void VH(ViewParent viewParent, View view) {
            if (viewParent instanceof g) {
                ((g) viewParent).onStopNestedScroll(view);
            }
        }

        public boolean Zo(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof g) {
                return ((g) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }

        public boolean j6(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof g) {
                return ((g) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        public void v5(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof g) {
                ((g) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            j6 = new b();
        } else if (i >= 19) {
            j6 = new a();
        } else {
            j6 = new c();
        }
    }

    public static boolean DW(ViewParent viewParent, View view, float f, float f2) {
        return j6.DW(viewParent, view, f, f2);
    }

    public static void FH(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof f) {
            ((f) viewParent).v5(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            j6.FH(viewParent, view, i, i2, iArr);
        }
    }

    public static void Hw(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof f) {
            ((f) viewParent).j6(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            j6.Hw(viewParent, view, i, i2, i3, i4);
        }
    }

    public static void VH(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof f) {
            ((f) viewParent).Hw(view, i);
        } else if (i == 0) {
            j6.VH(viewParent, view);
        }
    }

    public static boolean Zo(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof f) {
            return ((f) viewParent).DW(view, view2, i, i2);
        }
        if (i2 == 0) {
            return j6.Zo(viewParent, view, view2, i);
        }
        return false;
    }

    public static boolean j6(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return j6.j6(viewParent, view, f, f2, z);
    }

    public static void v5(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof f) {
            ((f) viewParent).FH(view, view2, i, i2);
        } else if (i2 == 0) {
            j6.v5(viewParent, view, view2, i);
        }
    }
}
