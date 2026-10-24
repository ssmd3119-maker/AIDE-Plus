package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class qm0 {
    public final String DW;
    public final long FH;
    public final List<nm0> Hw;
    public final zzfs j6;
    private final pm0 v5;

    private qm0(String str, long j, zzfs zzfsVar, String str2, um0 um0Var, List<nm0> list) {
        this.j6 = zzfsVar;
        this.DW = str2;
        this.Hw = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.v5 = um0Var.j6(this);
        this.FH = ip0.Hw(um0Var.FH, 1000000L, um0Var.DW);
    }

    public abstract em0 EQ();

    public abstract String gn();

    public abstract pm0 tp();

    public final pm0 u7() {
        return this.v5;
    }
}
