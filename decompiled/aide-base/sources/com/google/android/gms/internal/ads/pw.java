package com.google.android.gms.internal.ads;

@jg
/* loaded from: classes.dex */
public final class pw {
    public final int DW;
    public final int FH;
    private final int j6;

    private pw(int i, int i2, int i3) {
        this.j6 = i;
        this.FH = i2;
        this.DW = i3;
    }

    public static pw DW() {
        return new pw(0, 0, 0);
    }

    public static pw FH() {
        return new pw(4, 0, 0);
    }

    public static pw Hw() {
        return new pw(5, 0, 0);
    }

    public static pw tp(int i, int i2) {
        return new pw(1, i, i2);
    }

    public static pw u7(zzwf zzwfVar) {
        return zzwfVar.fY ? new pw(3, 0, 0) : zzwfVar.w9 ? new pw(2, 0, 0) : zzwfVar.AL ? DW() : tp(zzwfVar.k2, zzwfVar.jw);
    }

    public final boolean VH() {
        return this.j6 == 4;
    }

    public final boolean Zo() {
        return this.j6 == 0;
    }

    public final boolean gn() {
        return this.j6 == 5;
    }

    public final boolean j6() {
        return this.j6 == 2;
    }

    public final boolean v5() {
        return this.j6 == 3;
    }
}
