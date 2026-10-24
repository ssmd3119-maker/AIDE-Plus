package com.google.android.gms.internal.ads;

@jg
/* loaded from: classes.dex */
public abstract class ch implements ah, wn<Void> {
    private final hr<zzasi> WB;
    private final Object jw = new Object();
    private final ah mb;

    public ch(hr<zzasi> hrVar, ah ahVar) {
        this.WB = hrVar;
        this.mb = ahVar;
    }

    public abstract void DW();

    public abstract nh FH();

    @Override // com.google.android.gms.internal.ads.wn
    public final /* synthetic */ Void VH() {
        nh nhVarFH = FH();
        if (nhVarFH != null) {
            this.WB.j6(new dh(this, nhVarFH), new eh(this));
            return null;
        }
        this.mb.e9(new zzasm(0));
        DW();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void cancel() {
        DW();
    }

    @Override // com.google.android.gms.internal.ads.ah
    public final void e9(zzasm zzasmVar) {
        synchronized (this.jw) {
            this.mb.e9(zzasmVar);
            DW();
        }
    }

    final boolean j6(nh nhVar, zzasi zzasiVar) {
        try {
            nhVar.x(zzasiVar, new kh(this));
            return true;
        } catch (Throwable th) {
            xp.v5("Could not fetch ad response from ad request service due to an Exception.", th);
            com.google.android.gms.ads.internal.w0.u7().v5(th, "AdRequestClientTask.getAdResponseFromService");
            this.mb.e9(new zzasm(0));
            return false;
        }
    }
}
