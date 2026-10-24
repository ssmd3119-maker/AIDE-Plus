package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class vt0 {
    private int DW;
    private int FH;
    private final /* synthetic */ zzur Hw;
    private final byte[] j6;

    private vt0(zzur zzurVar, byte[] bArr) {
        this.Hw = zzurVar;
        this.j6 = bArr;
    }

    public final vt0 DW(int i) {
        this.DW = i;
        return this;
    }

    public final vt0 FH(int i) {
        this.FH = i;
        return this;
    }

    public final synchronized void j6() {
        try {
            if (this.Hw.DW) {
                this.Hw.j6.Od(this.j6);
                this.Hw.j6.nA(this.DW);
                this.Hw.j6.E2(this.FH);
                this.Hw.j6.q5(null);
                this.Hw.j6.uN();
            }
        } catch (RemoteException e) {
            xp.FH("Clearcut log failed", e);
        }
    }
}
