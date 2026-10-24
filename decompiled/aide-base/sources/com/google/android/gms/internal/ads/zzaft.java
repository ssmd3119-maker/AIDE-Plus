package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@jg
/* loaded from: classes.dex */
public final class zzaft implements zk0 {
    private final Context DW;
    private volatile m4 j6;

    public zzaft(Context context) {
        this.DW = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DW() {
        if (this.j6 == null) {
            return;
        }
        this.j6.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zk0
    public final co0 j6(bq0<?> bq0Var) throws e3 {
        zzafl zzaflVarGn = zzafl.gn(bq0Var);
        long jDW = com.google.android.gms.ads.internal.w0.we().DW();
        try {
            fr frVar = new fr();
            this.j6 = new m4(this.DW, com.google.android.gms.ads.internal.w0.U2().DW(), new w4(this, frVar), new x4(this, frVar));
            this.j6.checkAvailabilityAndConnect();
            vq vqVarJ6 = jq.j6(jq.DW(frVar, new t4(this, zzaflVarGn), zm.j6), ((Integer) cw0.v5().FH(p.fh)).intValue(), TimeUnit.MILLISECONDS, zm.FH);
            vqVarJ6.DW(new v4(this), zm.j6);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) vqVarJ6.get();
            long jDW2 = com.google.android.gms.ads.internal.w0.we().DW() - jDW;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(jDW2);
            sb.append("ms");
            sm.we(sb.toString());
            zzafn zzafnVar = (zzafn) new zzasy(parcelFileDescriptor).gn(zzafn.CREATOR);
            if (zzafnVar == null) {
                return null;
            }
            if (zzafnVar.WB) {
                throw new e3(zzafnVar.mb);
            }
            if (zzafnVar.qp.length != zzafnVar.k2.length) {
                return null;
            }
            HashMap map = new HashMap();
            int i = 0;
            while (true) {
                String[] strArr = zzafnVar.qp;
                if (i >= strArr.length) {
                    return new co0(zzafnVar.jw, zzafnVar.fY, map, zzafnVar.zh, zzafnVar.AL);
                }
                map.put(strArr[i], zzafnVar.k2[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            long jDW3 = com.google.android.gms.ads.internal.w0.we().DW() - jDW;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(jDW3);
            sb2.append("ms");
            sm.we(sb2.toString());
            return null;
        } catch (Throwable th) {
            long jDW4 = com.google.android.gms.ads.internal.w0.we().DW() - jDW;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(jDW4);
            sb3.append("ms");
            sm.we(sb3.toString());
            throw th;
        }
    }
}
