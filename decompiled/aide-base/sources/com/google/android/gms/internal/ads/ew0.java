package com.google.android.gms.internal.ads;

@jg
/* loaded from: classes.dex */
public class ew0 extends com.google.android.gms.ads.a {
    private com.google.android.gms.ads.a DW;
    private final Object j6 = new Object();

    public final void J0(com.google.android.gms.ads.a aVar) {
        synchronized (this.j6) {
            this.DW = aVar;
        }
    }

    @Override // com.google.android.gms.ads.a
    public void VH(int i) {
        synchronized (this.j6) {
            if (this.DW != null) {
                this.DW.VH(i);
            }
        }
    }

    @Override // com.google.android.gms.ads.a
    public void Zo() {
        synchronized (this.j6) {
            if (this.DW != null) {
                this.DW.Zo();
            }
        }
    }

    @Override // com.google.android.gms.ads.a
    public void tp() {
        synchronized (this.j6) {
            if (this.DW != null) {
                this.DW.tp();
            }
        }
    }

    @Override // com.google.android.gms.ads.a
    public void u7() {
        synchronized (this.j6) {
            if (this.DW != null) {
                this.DW.u7();
            }
        }
    }

    @Override // com.google.android.gms.ads.a
    public void we() {
        synchronized (this.j6) {
            if (this.DW != null) {
                this.DW.we();
            }
        }
    }
}
