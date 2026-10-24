package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dn0 {
    public final String DW;
    public final String j6;

    public dn0(String str, String str2) {
        this.j6 = str;
        this.DW = str2;
    }

    public final String toString() {
        String str = this.j6;
        String str2 = this.DW;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        return sb.toString();
    }
}
