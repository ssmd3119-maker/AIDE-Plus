package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class g7 extends IllegalArgumentException {
    g7(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
