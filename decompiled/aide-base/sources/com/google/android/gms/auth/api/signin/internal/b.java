package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* loaded from: classes.dex */
public class b {
    private static final Lock FH = new ReentrantLock();

    @GuardedBy("sLk")
    private static b Hw;

    @GuardedBy("mLk")
    private final SharedPreferences DW;
    private final Lock j6 = new ReentrantLock();

    private b(Context context) {
        this.DW = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    private static String FH(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    private final GoogleSignInAccount Hw(String str) {
        String strV5;
        if (!TextUtils.isEmpty(str) && (strV5 = v5(FH("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.lg(strV5);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static b j6(Context context) {
        p.u7(context);
        FH.lock();
        try {
            if (Hw == null) {
                Hw = new b(context.getApplicationContext());
            }
            return Hw;
        } finally {
            FH.unlock();
        }
    }

    @Nullable
    private final String v5(String str) {
        this.j6.lock();
        try {
            return this.DW.getString(str, null);
        } finally {
            this.j6.unlock();
        }
    }

    @Nullable
    public GoogleSignInAccount DW() {
        return Hw(v5("defaultGoogleSignInAccount"));
    }
}
