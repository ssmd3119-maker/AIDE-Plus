package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public abstract class v4 {
    private static final v4 DW;
    private static final v4 j6;

    static {
        w4 w4Var = null;
        j6 = new x4();
        DW = new y4();
    }

    private v4() {
    }

    static v4 Hw() {
        return j6;
    }

    static v4 v5() {
        return DW;
    }

    abstract <L> void DW(Object obj, Object obj2, long j);

    abstract void FH(Object obj, long j);

    abstract <L> List<L> j6(Object obj, long j);
}
