package abcd;

import android.util.Log;

/* loaded from: classes.dex */
public final class ot {
    public static void DW(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void j6(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }
}
