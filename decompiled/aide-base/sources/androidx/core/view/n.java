package androidx.core.view;

import android.os.Build;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class n {
    private final Object j6;

    private n(Object obj) {
        this.j6 = obj;
    }

    static Object VH(n nVar) {
        if (nVar == null) {
            return null;
        }
        return nVar.j6;
    }

    static n gn(Object obj) {
        if (obj == null) {
            return null;
        }
        return new n(obj);
    }

    public int DW() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.j6).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int FH() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.j6).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int Hw() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.j6).getSystemWindowInsetTop();
        }
        return 0;
    }

    public n Zo(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new n(((WindowInsets) this.j6).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.j6;
        Object obj3 = ((n) obj).j6;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.j6;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public int j6() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.j6).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public boolean v5() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.j6).isConsumed();
        }
        return false;
    }
}
