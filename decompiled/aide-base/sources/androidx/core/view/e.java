package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class e {
    private ViewParent DW;
    private final View FH;
    private boolean Hw;
    private ViewParent j6;
    private int[] v5;

    public e(View view) {
        this.FH = view;
    }

    private ViewParent VH(int i) {
        if (i == 0) {
            return this.j6;
        }
        if (i != 1) {
            return null;
        }
        return this.DW;
    }

    private void we(int i, ViewParent viewParent) {
        if (i == 0) {
            this.j6 = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.DW = viewParent;
        }
    }

    public boolean DW(float f, float f2) {
        ViewParent viewParentVH;
        if (!tp() || (viewParentVH = VH(0)) == null) {
            return false;
        }
        return m.DW(viewParentVH, this.FH, f, f2);
    }

    public void EQ(boolean z) {
        if (this.Hw) {
            ViewCompat.rN(this.FH);
        }
        this.Hw = z;
    }

    public boolean FH(int i, int i2, int[] iArr, int[] iArr2) {
        return Hw(i, i2, iArr, iArr2, 0);
    }

    public boolean Hw(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentVH;
        int i4;
        int i5;
        if (!tp() || (viewParentVH = VH(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.FH.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.v5 == null) {
                this.v5 = new int[2];
            }
            iArr = this.v5;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m.FH(viewParentVH, this.FH, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.FH.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean J0(int i) {
        return J8(i, 0);
    }

    public boolean J8(int i, int i2) {
        if (u7(i2)) {
            return true;
        }
        if (!tp()) {
            return false;
        }
        View view = this.FH;
        for (ViewParent parent = this.FH.getParent(); parent != null; parent = parent.getParent()) {
            if (m.Zo(parent, view, this.FH, i, i2)) {
                we(i2, parent);
                m.v5(parent, view, this.FH, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void QX(int i) {
        ViewParent viewParentVH = VH(i);
        if (viewParentVH != null) {
            m.VH(viewParentVH, this.FH, i);
            we(i, null);
        }
    }

    public void Ws() {
        QX(0);
    }

    public boolean Zo(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent viewParentVH;
        int i6;
        int i7;
        if (!tp() || (viewParentVH = VH(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.FH.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        m.Hw(viewParentVH, this.FH, i, i2, i3, i4, i5);
        if (iArr != null) {
            this.FH.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public boolean gn() {
        return u7(0);
    }

    public boolean j6(float f, float f2, boolean z) {
        ViewParent viewParentVH;
        if (!tp() || (viewParentVH = VH(0)) == null) {
            return false;
        }
        return m.j6(viewParentVH, this.FH, f, f2, z);
    }

    public boolean tp() {
        return this.Hw;
    }

    public boolean u7(int i) {
        return VH(i) != null;
    }

    public boolean v5(int i, int i2, int i3, int i4, int[] iArr) {
        return Zo(i, i2, i3, i4, iArr, 0);
    }
}
