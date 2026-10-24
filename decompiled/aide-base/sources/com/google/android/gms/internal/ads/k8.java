package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class k8 extends lr<t8> {
    private boolean VH;
    private final o8 Zo;
    private final Object v5 = new Object();

    public k8(o8 o8Var) {
        this.Zo = o8Var;
    }

    public final void v5() {
        synchronized (this.v5) {
            if (this.VH) {
                return;
            }
            this.VH = true;
            j6(new l8(this), new jr());
            j6(new m8(this), new n8(this));
        }
    }
}
