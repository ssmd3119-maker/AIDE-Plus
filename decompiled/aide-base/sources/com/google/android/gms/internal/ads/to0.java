package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class to0 {
    private boolean j6;

    public final synchronized boolean DW() {
        if (this.j6) {
            return false;
        }
        this.j6 = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean FH() {
        boolean z;
        z = this.j6;
        this.j6 = false;
        return z;
    }

    public final synchronized void j6() {
        while (!this.j6) {
            wait();
        }
    }
}
