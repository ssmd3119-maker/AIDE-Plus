package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@jg
/* loaded from: classes.dex */
public class lr<T> implements hr<T> {
    private T Hw;
    private final Object j6 = new Object();
    private int DW = 0;
    private final BlockingQueue<mr> FH = new LinkedBlockingQueue();

    @Override // com.google.android.gms.internal.ads.hr
    public final void DW(T t) {
        synchronized (this.j6) {
            if (this.DW != 0) {
                throw new UnsupportedOperationException();
            }
            this.Hw = t;
            this.DW = 1;
            Iterator it = this.FH.iterator();
            while (it.hasNext()) {
                ((mr) it.next()).j6.j6(t);
            }
            this.FH.clear();
        }
    }

    public final int FH() {
        return this.DW;
    }

    public final void Hw() {
        synchronized (this.j6) {
            if (this.DW != 0) {
                throw new UnsupportedOperationException();
            }
            this.DW = -1;
            Iterator it = this.FH.iterator();
            while (it.hasNext()) {
                ((mr) it.next()).DW.run();
            }
            this.FH.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.hr
    public final void j6(kr<T> krVar, ir irVar) {
        synchronized (this.j6) {
            if (this.DW == 1) {
                krVar.j6(this.Hw);
            } else if (this.DW == -1) {
                irVar.run();
            } else if (this.DW == 0) {
                this.FH.add(new mr(this, krVar, irVar));
            }
        }
    }
}
