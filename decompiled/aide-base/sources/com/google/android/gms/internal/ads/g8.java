package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class g8 implements kr<j7> {
    private final /* synthetic */ u7 DW;
    private final /* synthetic */ o8 j6;

    g8(u7 u7Var, o8 o8Var) {
        this.DW = u7Var;
        this.j6 = o8Var;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final /* synthetic */ void j6(j7 j7Var) {
        synchronized (this.DW.j6) {
            this.DW.gn = 0;
            if (this.DW.VH != null && this.j6 != this.DW.VH) {
                sm.we("New JS engine is loaded, marking previous one as destroyable.");
                this.DW.VH.gn();
            }
            this.DW.VH = this.j6;
        }
    }
}
