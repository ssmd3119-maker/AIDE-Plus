package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.zzwf;

/* loaded from: classes.dex */
public final class d {
    private final int DW;
    private final String FH;
    private final int j6;
    public static final d Hw = new d(ModuleDescriptor.MODULE_VERSION, 50, "320x50_mb");
    public static final d v5 = new d(468, 60, "468x60_as");
    public static final d Zo = new d(ModuleDescriptor.MODULE_VERSION, 100, "320x100_as");
    public static final d VH = new d(728, 90, "728x90_as");
    public static final d gn = new d(300, 250, "300x250_as");
    public static final d u7 = new d(160, 600, "160x600_as");
    public static final d tp = new d(-1, -2, "smart_banner");
    public static final d EQ = new d(-3, -4, "fluid");
    public static final d we = new d(50, 50, "50x50_mb");

    static {
        new d(-3, 0, "search_v2");
    }

    public d(int i, int i2) {
        String strValueOf = i == -1 ? "FULL" : String.valueOf(i);
        String strValueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 4 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("x");
        sb.append(strValueOf2);
        sb.append("_as");
        this(i, i2, sb.toString());
    }

    public final int DW(Context context) {
        int i = this.DW;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzwf.EQ(context.getResources().getDisplayMetrics());
        }
        cw0.j6();
        return mp.j6(context, this.DW);
    }

    public final int FH() {
        return this.j6;
    }

    public final int Hw(Context context) {
        int i = this.j6;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -1) {
            return zzwf.gn(context.getResources().getDisplayMetrics());
        }
        cw0.j6();
        return mp.j6(context, this.j6);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.j6 == dVar.j6 && this.DW == dVar.DW && this.FH.equals(dVar.FH);
    }

    public final int hashCode() {
        return this.FH.hashCode();
    }

    public final int j6() {
        return this.DW;
    }

    public final String toString() {
        return this.FH;
    }

    public final boolean v5() {
        return this.j6 == -3 && this.DW == -4;
    }

    d(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.j6 = i;
        this.DW = i2;
        this.FH = str;
    }
}
