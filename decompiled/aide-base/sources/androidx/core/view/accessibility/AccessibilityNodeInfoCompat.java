package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {
    static final j DW;
    private final AccessibilityNodeInfo j6;

    public static class a {
        public static final a DW = new a(1, null);
        public static final a FH = new a(2, null);
        final Object j6;

        static {
            new a(4, null);
            new a(8, null);
            new a(16, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null);
            new a(512, null);
            new a(1024, null);
            new a(2048, null);
            new a(4096, null);
            new a(8192, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null);
            new a(262144, null);
            new a(524288, null);
            new a(1048576, null);
            new a(2097152, null);
            AccessibilityNodeInfoCompat.DW.gn();
            AccessibilityNodeInfoCompat.DW.v5();
            AccessibilityNodeInfoCompat.DW.Zo();
            AccessibilityNodeInfoCompat.DW.FH();
            AccessibilityNodeInfoCompat.DW.DW();
            AccessibilityNodeInfoCompat.DW.Hw();
            AccessibilityNodeInfoCompat.DW.j6();
            AccessibilityNodeInfoCompat.DW.VH();
        }

        public a(int i, CharSequence charSequence) {
            this(AccessibilityNodeInfoCompat.DW.J0(i, charSequence));
        }

        public a(Object obj) {
            this.j6 = obj;
        }
    }

    static class b extends j {
        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public boolean EQ(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityFocused();
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public void QX(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            accessibilityNodeInfo.setMovementGranularities(i);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public void Ws(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityFocused(z);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public void XL(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setVisibleToUser(z);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public int u7(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMovementGranularities();
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public boolean we(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isVisibleToUser();
        }
    }

    static class c extends b {
    }

    static class d extends c {
        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public String tp(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getViewIdResourceName();
        }
    }

    static class e extends d {
    }

    static class f extends e {
        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public Object J0(int i, CharSequence charSequence) {
            return new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public boolean J8(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            return accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) obj);
        }
    }

    static class g extends f {
    }

    static class h extends g {
        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public Object DW() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public Object FH() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public Object Hw() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public Object Zo() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public Object gn() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public Object j6() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public Object v5() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        }
    }

    static class i extends h {
        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.j
        public Object VH() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        }
    }

    static class j {
        public Object DW() {
            return null;
        }

        public boolean EQ(AccessibilityNodeInfo accessibilityNodeInfo) {
            return false;
        }

        public Object FH() {
            return null;
        }

        public Object Hw() {
            return null;
        }

        public Object J0(int i, CharSequence charSequence) {
            return null;
        }

        public boolean J8(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            return false;
        }

        public void QX(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        }

        public Object VH() {
            return null;
        }

        public void Ws(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        }

        public void XL(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        }

        public Object Zo() {
            return null;
        }

        public Object gn() {
            return null;
        }

        public Object j6() {
            return null;
        }

        public String tp(AccessibilityNodeInfo accessibilityNodeInfo) {
            return null;
        }

        public int u7(AccessibilityNodeInfo accessibilityNodeInfo) {
            return 0;
        }

        public Object v5() {
            return null;
        }

        public boolean we(AccessibilityNodeInfo accessibilityNodeInfo) {
            return false;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            DW = new i();
            return;
        }
        if (i2 >= 23) {
            DW = new h();
            return;
        }
        if (i2 >= 22) {
            DW = new g();
            return;
        }
        if (i2 >= 21) {
            DW = new f();
            return;
        }
        if (i2 >= 19) {
            DW = new e();
            return;
        }
        if (i2 >= 18) {
            DW = new d();
            return;
        }
        if (i2 >= 17) {
            DW = new c();
        } else if (i2 >= 16) {
            DW = new b();
        } else {
            DW = new j();
        }
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.j6 = accessibilityNodeInfo;
    }

    private static String FH(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public static AccessibilityNodeInfoCompat I(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    public static AccessibilityNodeInfoCompat er(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return I(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.j6));
    }

    public void BT(boolean z) {
        DW.Ws(this.j6, z);
    }

    public void DW(View view) {
        this.j6.addChild(view);
    }

    public CharSequence EQ() {
        return this.j6.getText();
    }

    public int Hw() {
        return this.j6.getActions();
    }

    public boolean J0() {
        return DW.EQ(this.j6);
    }

    public boolean J8() {
        return this.j6.isCheckable();
    }

    public void KD(boolean z) {
        this.j6.setEnabled(z);
    }

    public boolean Mr() {
        return this.j6.isLongClickable();
    }

    public AccessibilityNodeInfo Mz() {
        return this.j6;
    }

    public void P8(Rect rect) {
        this.j6.setBoundsInScreen(rect);
    }

    public boolean QX() {
        return this.j6.isClickable();
    }

    public void SI(CharSequence charSequence) {
        this.j6.setContentDescription(charSequence);
    }

    public void Sf(boolean z) {
        this.j6.setSelected(z);
    }

    public boolean U2() {
        return this.j6.isPassword();
    }

    public CharSequence VH() {
        return this.j6.getClassName();
    }

    public boolean Ws() {
        return this.j6.isChecked();
    }

    public boolean XL() {
        return this.j6.isEnabled();
    }

    public void Zo(Rect rect) {
        this.j6.getBoundsInScreen(rect);
    }

    public boolean a8() {
        return this.j6.isScrollable();
    }

    public boolean aM() {
        return this.j6.isFocusable();
    }

    public void cb(int i2) {
        DW.QX(this.j6, i2);
    }

    public void cn(boolean z) {
        this.j6.setFocused(z);
    }

    public void dx(CharSequence charSequence) {
        this.j6.setPackageName(charSequence);
    }

    public void ef(boolean z) {
        this.j6.setScrollable(z);
    }

    public void ei(CharSequence charSequence) {
        this.j6.setClassName(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccessibilityNodeInfoCompat.class != obj.getClass()) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.j6;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.j6 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.j6)) {
            return false;
        }
        return true;
    }

    public void g3(boolean z) {
        DW.XL(this.j6, z);
    }

    public boolean gW(a aVar) {
        return DW.J8(this.j6, aVar.j6);
    }

    public CharSequence gn() {
        return this.j6.getContentDescription();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.j6;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean j3() {
        return this.j6.isFocused();
    }

    public void j6(int i2) {
        this.j6.addAction(i2);
    }

    public boolean lg() {
        return this.j6.isSelected();
    }

    public void nw(boolean z) {
        this.j6.setClickable(z);
    }

    public boolean rN() {
        return DW.we(this.j6);
    }

    public void ro(boolean z) {
        this.j6.setFocusable(z);
    }

    public void sG(View view) {
        this.j6.setParent(view);
    }

    public void sh(boolean z) {
        this.j6.setLongClickable(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        v5(rect);
        sb.append("; boundsInParent: " + rect);
        Zo(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(tp());
        sb.append("; className: ");
        sb.append(VH());
        sb.append("; text: ");
        sb.append(EQ());
        sb.append("; contentDescription: ");
        sb.append(gn());
        sb.append("; viewId: ");
        sb.append(we());
        sb.append("; checkable: ");
        sb.append(J8());
        sb.append("; checked: ");
        sb.append(Ws());
        sb.append("; focusable: ");
        sb.append(aM());
        sb.append("; focused: ");
        sb.append(j3());
        sb.append("; selected: ");
        sb.append(lg());
        sb.append("; clickable: ");
        sb.append(QX());
        sb.append("; longClickable: ");
        sb.append(Mr());
        sb.append("; enabled: ");
        sb.append(XL());
        sb.append("; password: ");
        sb.append(U2());
        sb.append("; scrollable: " + a8());
        sb.append("; [");
        int iHw = Hw();
        while (iHw != 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iHw);
            iHw &= iNumberOfTrailingZeros ^ (-1);
            sb.append(FH(iNumberOfTrailingZeros));
            if (iHw != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence tp() {
        return this.j6.getPackageName();
    }

    public int u7() {
        return DW.u7(this.j6);
    }

    public void v5(Rect rect) {
        this.j6.getBoundsInParent(rect);
    }

    public void vJ(View view) {
        this.j6.setSource(view);
    }

    public void vy(Rect rect) {
        this.j6.setBoundsInParent(rect);
    }

    public String we() {
        return DW.tp(this.j6);
    }

    public void yS() {
        this.j6.recycle();
    }
}
