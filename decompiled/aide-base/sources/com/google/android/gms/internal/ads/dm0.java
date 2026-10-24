package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public final class dm0 implements po0<Long> {
    private dm0() {
    }

    @Override // com.google.android.gms.internal.ads.po0
    public final /* synthetic */ Long j6(Uri uri, InputStream inputStream) {
        return Long.valueOf(ip0.J8(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }

    /* synthetic */ dm0(vl0 vl0Var) {
        this();
    }
}
