package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class km0 {
    private final long DW;
    public final boolean FH;
    public final long Hw;
    public final dn0 VH;
    public final long Zo;
    public final Uri gn;
    public final long j6;
    private final List<om0> u7;
    public final long v5;

    public km0(long j, long j2, long j3, boolean z, long j4, long j5, long j6, dn0 dn0Var, Uri uri, List<om0> list) {
        this.j6 = j;
        this.DW = j2;
        this.FH = z;
        this.Hw = j4;
        this.v5 = j5;
        this.Zo = j6;
        this.VH = dn0Var;
        this.gn = uri;
        this.u7 = list;
    }

    public final long DW(int i) {
        long j;
        long j2 = -9223372036854775807L;
        if (i == this.u7.size() - 1) {
            long j3 = this.DW;
            if (j3 != -9223372036854775807L) {
                j = j3 - this.u7.get(i).DW;
            }
            return ie0.DW(j2);
        }
        j = this.u7.get(i + 1).DW - this.u7.get(i).DW;
        j2 = j;
        return ie0.DW(j2);
    }

    public final int FH() {
        return this.u7.size();
    }

    public final om0 j6(int i) {
        return this.u7.get(i);
    }
}
