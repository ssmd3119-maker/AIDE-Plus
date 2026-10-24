package androidx.core.view.accessibility;

import android.os.Build;

/* loaded from: classes.dex */
public class AccessibilityNodeProviderCompat {
    private final Object j6;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
        }
    }

    public AccessibilityNodeProviderCompat(Object obj) {
        this.j6 = obj;
    }

    public Object j6() {
        return this.j6;
    }
}
