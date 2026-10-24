package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bo0 {
    public final byte[] DW;
    public final long FH;
    public final long Hw;
    public final int VH;
    public final String Zo;
    public final Uri j6;
    public final long v5;

    public bo0(Uri uri) {
        this(uri, 0);
    }

    public final boolean j6(int i) {
        return (this.VH & 1) == 1;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.j6);
        String string = Arrays.toString(this.DW);
        long j = this.FH;
        long j2 = this.Hw;
        long j3 = this.v5;
        String str = this.Zo;
        int i = this.VH;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 93 + String.valueOf(string).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(string);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public bo0(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public bo0(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public bo0(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    private bo0(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public bo0(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        ro0.j6(j >= 0);
        ro0.j6(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        ro0.j6(z);
        this.j6 = uri;
        this.DW = bArr;
        this.FH = j;
        this.Hw = j2;
        this.v5 = j3;
        this.Zo = str;
        this.VH = i;
    }
}
