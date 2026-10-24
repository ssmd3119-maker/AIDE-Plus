package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.c;
import java.io.IOException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class jt0 implements c.a {
    private final /* synthetic */ zzty WB;
    final /* synthetic */ ht0 jw;
    private final /* synthetic */ fr mb;

    jt0(ht0 ht0Var, zzty zztyVar, fr frVar) {
        this.jw = ht0Var;
        this.WB = zztyVar;
        this.mb = frVar;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.jw.Hw) {
            if (this.jw.DW) {
                return;
            }
            ht0.FH(this.jw, true);
            final at0 at0Var = this.jw.j6;
            if (at0Var == null) {
                return;
            }
            final zzty zztyVar = this.WB;
            final fr frVar = this.mb;
            final vq<?> vqVarDW = zm.DW(new Runnable(this, at0Var, zztyVar, frVar) { // from class: com.google.android.gms.internal.ads.kt0
                private final jt0 WB;
                private final fr fY;
                private final zzty jw;
                private final at0 mb;

                {
                    this.WB = this;
                    this.mb = at0Var;
                    this.jw = zztyVar;
                    this.fY = frVar;
                }

                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    jt0 jt0Var = this.WB;
                    at0 at0Var2 = this.mb;
                    zzty zztyVar2 = this.jw;
                    fr frVar2 = this.fY;
                    try {
                        zztv zztvVarWy = at0Var2.Hw().Wy(zztyVar2);
                        if (!zztvVarWy.gn()) {
                            frVar2.Hw(new RuntimeException("No entry contents."));
                            jt0Var.jw.j6();
                            return;
                        }
                        mt0 mt0Var = new mt0(jt0Var, zztvVarWy.EQ(), 1);
                        int i = mt0Var.read();
                        if (i == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        mt0Var.unread(i);
                        frVar2.FH(mt0Var);
                    } catch (RemoteException | IOException e) {
                        xp.Hw("Unable to obtain a cache service instance.", e);
                        frVar2.Hw(e);
                        jt0Var.jw.j6();
                    }
                }
            });
            fr frVar2 = this.mb;
            final fr frVar3 = this.mb;
            frVar2.DW(new Runnable(frVar3, vqVarDW) { // from class: com.google.android.gms.internal.ads.lt0
                private final fr WB;
                private final Future mb;

                {
                    this.WB = frVar3;
                    this.mb = vqVarDW;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    fr frVar4 = this.WB;
                    Future future = this.mb;
                    if (frVar4.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, ar.DW);
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i) {
    }
}
