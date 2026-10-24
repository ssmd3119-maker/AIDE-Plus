package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@jg
/* loaded from: classes.dex */
public final class jt implements xn0 {
    private boolean DW;
    private final Context FH;
    private final xn0 Hw;
    private Uri VH;
    private final kt Zo;
    private InputStream j6;
    private final qo0<xn0> v5;

    public jt(Context context, xn0 xn0Var, qo0<xn0> qo0Var, kt ktVar) {
        this.FH = context;
        this.Hw = xn0Var;
        this.v5 = qo0Var;
        this.Zo = ktVar;
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final long DW(bo0 bo0Var) throws IOException {
        Long l;
        bo0 bo0Var2 = bo0Var;
        if (this.DW) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.DW = true;
        this.VH = bo0Var2.j6;
        qo0<xn0> qo0Var = this.v5;
        if (qo0Var != null) {
            qo0Var.Hw(this, bo0Var2);
        }
        zzty zztyVarEQ = zzty.EQ(bo0Var2.j6);
        if (!((Boolean) cw0.v5().FH(p.Ak)).booleanValue()) {
            zztv zztvVarHw = null;
            if (zztyVarEQ != null) {
                zztyVarEQ.AL = bo0Var2.Hw;
                zztvVarHw = com.google.android.gms.ads.internal.w0.EQ().Hw(zztyVarEQ);
            }
            if (zztvVarHw != null && zztvVarHw.gn()) {
                this.j6 = zztvVarHw.EQ();
                return -1L;
            }
        } else if (zztyVarEQ != null) {
            zztyVarEQ.AL = bo0Var2.Hw;
            if (zztyVarEQ.zh) {
                l = (Long) cw0.v5().FH(p.ti);
            } else {
                l = (Long) cw0.v5().FH(p.nl);
            }
            long jLongValue = l.longValue();
            long jDW = com.google.android.gms.ads.internal.w0.we().DW();
            com.google.android.gms.ads.internal.w0.gW();
            Future<InputStream> futureJ6 = ot0.j6(this.FH, zztyVarEQ);
            try {
                try {
                    this.j6 = futureJ6.get(jLongValue, TimeUnit.MILLISECONDS);
                    long jDW2 = com.google.android.gms.ads.internal.w0.we().DW() - jDW;
                    this.Zo.DW(true, jDW2);
                    StringBuilder sb = new StringBuilder(44);
                    sb.append("Cache connection took ");
                    sb.append(jDW2);
                    sb.append("ms");
                    sm.we(sb.toString());
                    return -1L;
                } catch (InterruptedException unused) {
                    futureJ6.cancel(true);
                    Thread.currentThread().interrupt();
                    long jDW3 = com.google.android.gms.ads.internal.w0.we().DW() - jDW;
                    this.Zo.DW(false, jDW3);
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("Cache connection took ");
                    sb2.append(jDW3);
                    sb2.append("ms");
                    sm.we(sb2.toString());
                } catch (ExecutionException | TimeoutException unused2) {
                    futureJ6.cancel(true);
                    long jDW4 = com.google.android.gms.ads.internal.w0.we().DW() - jDW;
                    this.Zo.DW(false, jDW4);
                    StringBuilder sb3 = new StringBuilder(44);
                    sb3.append("Cache connection took ");
                    sb3.append(jDW4);
                    sb3.append("ms");
                    sm.we(sb3.toString());
                }
            } catch (Throwable th) {
                long jDW5 = com.google.android.gms.ads.internal.w0.we().DW() - jDW;
                this.Zo.DW(false, jDW5);
                StringBuilder sb4 = new StringBuilder(44);
                sb4.append("Cache connection took ");
                sb4.append(jDW5);
                sb4.append("ms");
                sm.we(sb4.toString());
                throw th;
            }
        }
        if (zztyVarEQ != null) {
            bo0Var2 = new bo0(Uri.parse(zztyVarEQ.WB), bo0Var2.DW, bo0Var2.FH, bo0Var2.Hw, bo0Var2.v5, bo0Var2.Zo, bo0Var2.VH);
        }
        return this.Hw.DW(bo0Var2);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final Uri Jm() {
        return this.VH;
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void close() throws IOException {
        if (!this.DW) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.DW = false;
        this.VH = null;
        InputStream inputStream = this.j6;
        if (inputStream != null) {
            com.google.android.gms.common.util.k.j6(inputStream);
            this.j6 = null;
        } else {
            this.Hw.close();
        }
        qo0<xn0> qo0Var = this.v5;
        if (qo0Var != null) {
            qo0Var.v5(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final int j6(byte[] bArr, int i, int i2) throws IOException {
        if (!this.DW) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.j6;
        int iJ6 = inputStream != null ? inputStream.read(bArr, i, i2) : this.Hw.j6(bArr, i, i2);
        qo0<xn0> qo0Var = this.v5;
        if (qo0Var != null) {
            qo0Var.XL(this, iJ6);
        }
        return iJ6;
    }
}
