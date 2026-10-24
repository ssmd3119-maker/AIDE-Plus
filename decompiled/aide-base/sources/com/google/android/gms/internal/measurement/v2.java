package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class v2 extends w2 {
    private int WB = 0;
    private final /* synthetic */ u2 jw;
    private final int mb;

    v2(u2 u2Var) {
        this.jw = u2Var;
        this.mb = this.jw.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WB < this.mb;
    }

    @Override // com.google.android.gms.internal.measurement.a3
    public final byte nextByte() {
        int i = this.WB;
        if (i >= this.mb) {
            throw new NoSuchElementException();
        }
        this.WB = i + 1;
        return this.jw.VH(i);
    }
}
