package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class je0 extends Exception {
    private je0(int i, String str, Throwable th, int i2) {
        super(null, th);
    }

    public static je0 DW(Exception exc, int i) {
        return new je0(1, null, exc, i);
    }

    static je0 FH(RuntimeException runtimeException) {
        return new je0(2, null, runtimeException, -1);
    }

    public static je0 j6(IOException iOException) {
        return new je0(0, null, iOException, -1);
    }
}
