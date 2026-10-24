package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes.dex */
public final class j2 {
    private final String DW;
    private final String FH;
    private final Uri j6;

    public j2(Uri uri) {
        this(null, uri, "", "", false, false, false);
    }

    public final d2<Double> DW(String str, double d) {
        return d2.FH(this, str, d);
    }

    public final d2<Long> VH(String str, long j) {
        return d2.v5(this, str, j);
    }

    public final d2<Boolean> Zo(String str, boolean z) {
        return d2.VH(this, str, z);
    }

    public final d2<String> gn(String str, String str2) {
        return d2.Zo(this, str, str2);
    }

    public final d2<Integer> v5(String str, int i) {
        return d2.Hw(this, str, i);
    }

    private j2(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.j6 = uri;
        this.DW = str2;
        this.FH = str3;
    }
}
