package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o8 extends lr<j7> {
    private ho<j7> Zo;
    private final Object v5 = new Object();
    private boolean VH = false;
    private int gn = 0;

    public o8(ho<j7> hoVar) {
        this.Zo = hoVar;
    }

    private final void u7() {
        synchronized (this.v5) {
            com.google.android.gms.common.internal.p.we(this.gn >= 0);
            if (this.VH && this.gn == 0) {
                sm.we("No reference is left (including root). Cleaning up engine.");
                j6(new r8(this), new jr());
            } else {
                sm.we("There are still references to the engine. Not destroying.");
            }
        }
    }

    protected final void VH() {
        synchronized (this.v5) {
            com.google.android.gms.common.internal.p.we(this.gn > 0);
            sm.we("Releasing 1 reference for JS Engine");
            this.gn--;
            u7();
        }
    }

    public final k8 Zo() {
        k8 k8Var = new k8(this);
        synchronized (this.v5) {
            j6(new p8(this, k8Var), new q8(this, k8Var));
            com.google.android.gms.common.internal.p.we(this.gn >= 0);
            this.gn++;
        }
        return k8Var;
    }

    public final void gn() {
        synchronized (this.v5) {
            com.google.android.gms.common.internal.p.we(this.gn >= 0);
            sm.we("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.VH = true;
            u7();
        }
    }
}
