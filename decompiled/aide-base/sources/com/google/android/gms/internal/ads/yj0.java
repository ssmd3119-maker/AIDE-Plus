package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class yj0 {
    private final String DW;
    private final String j6;

    public yj0(String str, String str2) {
        this.j6 = str;
        this.DW = str2;
    }

    public final String DW() {
        return this.DW;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yj0.class == obj.getClass()) {
            yj0 yj0Var = (yj0) obj;
            if (TextUtils.equals(this.j6, yj0Var.j6) && TextUtils.equals(this.DW, yj0Var.DW)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.j6.hashCode() * 31) + this.DW.hashCode();
    }

    public final String j6() {
        return this.j6;
    }

    public final String toString() {
        String str = this.j6;
        String str2 = this.DW;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
