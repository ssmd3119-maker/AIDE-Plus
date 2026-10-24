package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j40 implements Iterator {
    private int WB = 0;
    private final /* synthetic */ i40 jw;
    private final int mb;

    j40(i40 i40Var) {
        this.jw = i40Var;
        this.mb = this.jw.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WB < this.mb;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public final byte nextByte() {
        try {
            i40 i40Var = this.jw;
            int i = this.WB;
            this.WB = i + 1;
            return i40Var.Ws(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
