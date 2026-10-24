package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class l {
    static {
        if (Build.VERSION.SDK_INT >= 21) {
        }
    }

    @Deprecated
    public static void j6(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }
}
