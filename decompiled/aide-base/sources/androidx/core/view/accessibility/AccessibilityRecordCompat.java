package androidx.core.view.accessibility;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public class AccessibilityRecordCompat {
    private static final c j6;

    static class a extends c {
        @Override // androidx.core.view.accessibility.AccessibilityRecordCompat.c
        public void DW(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }

        @Override // androidx.core.view.accessibility.AccessibilityRecordCompat.c
        public void j6(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    static class b extends a {
    }

    static class c {
        public void DW(AccessibilityRecord accessibilityRecord, int i) {
        }

        public void j6(AccessibilityRecord accessibilityRecord, int i) {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            j6 = new b();
        } else if (i >= 15) {
            j6 = new a();
        } else {
            j6 = new c();
        }
    }

    public static void DW(AccessibilityRecord accessibilityRecord, int i) {
        j6.DW(accessibilityRecord, i);
    }

    public static void j6(AccessibilityRecord accessibilityRecord, int i) {
        j6.j6(accessibilityRecord, i);
    }
}
