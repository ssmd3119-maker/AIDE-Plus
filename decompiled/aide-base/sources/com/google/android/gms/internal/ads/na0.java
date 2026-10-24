package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class na0 extends sa0 {
    private String j6;

    public na0(String str) {
        this.j6 = str;
    }

    @Override // com.google.android.gms.internal.ads.sa0
    public final void j6(String str) {
        String str2 = this.j6;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
