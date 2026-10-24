package androidx.print;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class PrintHelper {
    public PrintHelper(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && i < 23 && i >= 20) {
        }
    }
}
