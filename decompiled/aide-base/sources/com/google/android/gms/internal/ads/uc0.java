package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public final class uc0 {
    static {
        "0123456789abcdef".toCharArray();
    }

    public static long DW(double d, DisplayMetrics displayMetrics) {
        double d2 = displayMetrics.density;
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    public static String FH(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        s30.j6(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean Hw(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static boolean VH(String str) {
        return str == null || str.isEmpty();
    }

    public static String Zo(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID uuidFromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
        byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
        return p80.j6(bArr, true);
    }

    public static boolean j6() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static Activity v5(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        for (int i = 0; (context instanceof ContextWrapper) && i < 10; i++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
