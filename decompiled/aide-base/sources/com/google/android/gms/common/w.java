package com.google.android.gms.common;

import android.util.Log;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* loaded from: classes.dex */
public class w {
    private static final w Hw = new w(true, null, null);
    private final String DW;
    private final Throwable FH;
    final boolean j6;

    w(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.j6 = z;
        this.DW = str;
        this.FH = th;
    }

    static w DW(String str, Throwable th) {
        return new w(false, str, th);
    }

    static w FH(Callable<String> callable) {
        return new y(callable);
    }

    static String Hw(String str, p pVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", z2 ? "debug cert rejected" : "not whitelisted", str, com.google.android.gms.common.util.j.j6(com.google.android.gms.common.util.a.j6("SHA-1").digest(pVar.g3())), Boolean.valueOf(z), "12451009.false");
    }

    static w Zo() {
        return Hw;
    }

    static w v5(String str) {
        return new w(false, str, null);
    }

    final void VH() {
        if (this.j6 || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.FH != null) {
            Log.d("GoogleCertificatesRslt", j6(), this.FH);
        } else {
            Log.d("GoogleCertificatesRslt", j6());
        }
    }

    @Nullable
    String j6() {
        return this.DW;
    }
}
