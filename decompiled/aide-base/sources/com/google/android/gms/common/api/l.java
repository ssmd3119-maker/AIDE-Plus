package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class l extends UnsupportedOperationException {
    private final Feature WB;

    public l(Feature feature) {
        this.WB = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strValueOf = String.valueOf(this.WB);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
        sb.append("Missing ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
