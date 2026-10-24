package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class xe {
    private final List<yj0> DW;
    private final int FH;
    private final InputStream Hw;
    private final int j6;

    public xe(int i, List<yj0> list) {
        this(i, list, -1, null);
    }

    public final int DW() {
        return this.FH;
    }

    public final int FH() {
        return this.j6;
    }

    public final List<yj0> Hw() {
        return Collections.unmodifiableList(this.DW);
    }

    public final InputStream j6() {
        return this.Hw;
    }

    public xe(int i, List<yj0> list, int i2, InputStream inputStream) {
        this.j6 = i;
        this.DW = list;
        this.FH = i2;
        this.Hw = inputStream;
    }
}
