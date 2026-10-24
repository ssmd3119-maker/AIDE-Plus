package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public abstract class i60 {
    private static final i60 DW;
    private static final i60 j6;

    static {
        j60 j60Var = null;
        j6 = new k60();
        DW = new l60();
    }

    private i60() {
    }

    static i60 FH() {
        return j6;
    }

    static i60 Hw() {
        return DW;
    }

    abstract <L> void DW(Object obj, Object obj2, long j);

    abstract <L> List<L> j6(Object obj, long j);

    abstract void v5(Object obj, long j);
}
