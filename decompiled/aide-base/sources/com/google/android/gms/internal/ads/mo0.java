package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class mo0 extends IOException {
    public mo0(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 13 + String.valueOf(message).length());
        sb.append("Unexpected ");
        sb.append(simpleName);
        sb.append(": ");
        sb.append(message);
        super(sb.toString(), th);
    }
}
