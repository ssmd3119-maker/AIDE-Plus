package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ul0 implements nk0 {
    private final Object AL;
    private long Jl;
    private no0 Q6;
    private final yn0 WB;
    private xn0 Z1;
    private final Runnable cT;
    private Handler e3;
    private km0 eU;
    private final long fY;
    private final Runnable hK;
    private long iW;
    private final int jw;
    private final po0<? extends km0> k2;
    private Uri kf;
    private final rl0 mb;
    private io0 n5;
    private ok0 q7;
    private final rj0 qp;
    private long sE;
    private int sg;
    private final SparseArray<sl0> w9;
    private final zl0 zh;

    public ul0(Uri uri, yn0 yn0Var, rl0 rl0Var, Handler handler, qj0 qj0Var) {
        this(uri, yn0Var, rl0Var, 3, -1L, handler, null);
    }

    private final <T> void EQ(oo0<T> oo0Var, jo0<oo0<T>> jo0Var, int i) {
        this.qp.FH(oo0Var.j6, oo0Var.DW, this.n5.FH(oo0Var, jo0Var, i));
    }

    private final void QX(IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        j3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void XL() {
        Uri uri;
        synchronized (this.AL) {
            uri = this.kf;
        }
        EQ(new oo0(this.Z1, uri, 4, this.k2), this.zh, this.jw);
    }

    private final void aM() {
        km0 km0Var = this.eU;
        if (km0Var.FH) {
            long j = km0Var.Hw;
            if (j == 0) {
                j = 5000;
            }
            this.e3.postDelayed(this.hK, Math.max(0L, (this.Jl + j) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(boolean z) {
        long j;
        boolean z2;
        for (int i = 0; i < this.w9.size(); i++) {
            int iKeyAt = this.w9.keyAt(i);
            if (iKeyAt >= this.sg) {
                this.w9.valueAt(i).J0(this.eU, iKeyAt - this.sg);
            }
        }
        int iFH = this.eU.FH() - 1;
        bm0 bm0VarJ6 = bm0.j6(this.eU.j6(0), this.eU.DW(0));
        bm0 bm0VarJ62 = bm0.j6(this.eU.j6(iFH), this.eU.DW(iFH));
        long jMax = bm0VarJ6.DW;
        long jMin = bm0VarJ62.FH;
        long jDW = 0;
        if (!this.eU.FH || bm0VarJ62.j6) {
            j = jMax;
            z2 = false;
        } else {
            jMin = Math.min(((this.sE != 0 ? ie0.DW(SystemClock.elapsedRealtime() + this.sE) : ie0.DW(System.currentTimeMillis())) - ie0.DW(this.eU.j6)) - ie0.DW(this.eU.j6(iFH).DW), jMin);
            long j2 = this.eU.v5;
            if (j2 != -9223372036854775807L) {
                long jDW2 = jMin - ie0.DW(j2);
                while (jDW2 < 0 && iFH > 0) {
                    iFH--;
                    jDW2 += this.eU.DW(iFH);
                }
                jMax = iFH == 0 ? Math.max(jMax, jDW2) : this.eU.DW(0);
            }
            j = jMax;
            z2 = true;
        }
        long jDW3 = jMin - j;
        for (int i2 = 0; i2 < this.eU.FH() - 1; i2++) {
            jDW3 += this.eU.DW(i2);
        }
        km0 km0Var = this.eU;
        if (km0Var.FH) {
            long j3 = this.fY;
            if (j3 == -1) {
                long j4 = km0Var.Zo;
                if (j4 == -9223372036854775807L) {
                    j4 = 30000;
                }
                j3 = j4;
            }
            jDW = jDW3 - ie0.DW(j3);
            if (jDW < 5000000) {
                jDW = Math.min(5000000L, jDW3 / 2);
            }
        }
        km0 km0Var2 = this.eU;
        long jJ6 = km0Var2.j6 + km0Var2.j6(0).DW + ie0.j6(j);
        km0 km0Var3 = this.eU;
        this.q7.j6(new xl0(km0Var3.j6, jJ6, this.sg, j, jDW3, jDW, km0Var3), this.eU);
        this.e3.removeCallbacks(this.cT);
        if (z2) {
            this.e3.postDelayed(this.cT, 5000L);
        }
        if (z) {
            aM();
        }
    }

    private final void u7(dn0 dn0Var, po0<Long> po0Var) {
        EQ(new oo0(this.Z1, Uri.parse(dn0Var.DW), 5, po0Var), new cm0(this, null), 1);
    }

    private final void we(long j) {
        this.sE = j;
        j3(true);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void DW() {
        this.Q6.j6();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void FH(lk0 lk0Var) {
        sl0 sl0Var = (sl0) lk0Var;
        sl0Var.j6();
        this.w9.remove(sl0Var.WB);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final lk0 Hw(int i, vn0 vn0Var) {
        sl0 sl0Var = new sl0(this.sg + i, this.eU, i, this.mb, this.jw, this.qp.we(this.eU.j6(i).DW), this.sE, this.Q6, vn0Var);
        this.w9.put(sl0Var.WB, sl0Var);
        return sl0Var;
    }

    final int J0(oo0<Long> oo0Var, long j, long j2, IOException iOException) {
        this.qp.v5(oo0Var.j6, oo0Var.DW, j, j2, oo0Var.v5(), iOException, true);
        QX(iOException);
        return 2;
    }

    final void J8(oo0<Long> oo0Var, long j, long j2) {
        this.qp.Hw(oo0Var.j6, oo0Var.DW, j, j2, oo0Var.v5());
        we(oo0Var.Hw().longValue() - j);
    }

    final void Ws(oo0<?> oo0Var, long j, long j2) {
        this.qp.u7(oo0Var.j6, oo0Var.DW, j, j2, oo0Var.v5());
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void Zo() {
        this.Z1 = null;
        this.Q6 = null;
        io0 io0Var = this.n5;
        if (io0Var != null) {
            io0Var.VH(null);
            this.n5 = null;
        }
        this.Jl = 0L;
        this.iW = 0L;
        this.eU = null;
        Handler handler = this.e3;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.e3 = null;
        }
        this.sE = 0L;
        this.w9.clear();
    }

    final int j6(oo0<km0> oo0Var, long j, long j2, IOException iOException) {
        boolean z = iOException instanceof af0;
        this.qp.v5(oo0Var.j6, oo0Var.DW, j, j2, oo0Var.v5(), iOException, z);
        return z ? 3 : 0;
    }

    final void tp(oo0<km0> oo0Var, long j, long j2) {
        this.qp.Hw(oo0Var.j6, oo0Var.DW, j, j2, oo0Var.v5());
        km0 km0VarHw = oo0Var.Hw();
        km0 km0Var = this.eU;
        int i = 0;
        int iFH = km0Var == null ? 0 : km0Var.FH();
        long j3 = km0VarHw.j6(0).DW;
        while (i < iFH && this.eU.j6(i).DW < j3) {
            i++;
        }
        if (iFH - i > km0VarHw.FH()) {
            Log.w("DashMediaSource", "Out of sync manifest");
            aM();
            return;
        }
        this.eU = km0VarHw;
        this.Jl = j - j2;
        this.iW = j;
        if (km0VarHw.gn != null) {
            synchronized (this.AL) {
                if (oo0Var.j6.j6 == this.kf) {
                    this.kf = this.eU.gn;
                }
            }
        }
        if (iFH != 0) {
            this.sg += i;
            j3(true);
            return;
        }
        dn0 dn0Var = this.eU.VH;
        if (dn0Var == null) {
            j3(true);
            return;
        }
        String str = dn0Var.j6;
        if (ip0.u7(str, "urn:mpeg:dash:utc:direct:2014") || ip0.u7(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                we(ip0.J8(dn0Var.DW) - this.iW);
                return;
            } catch (af0 e) {
                QX(e);
                return;
            }
        }
        vl0 vl0Var = null;
        if (ip0.u7(str, "urn:mpeg:dash:utc:http-iso:2014") || ip0.u7(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            u7(dn0Var, new yl0(vl0Var));
        } else if (ip0.u7(str, "urn:mpeg:dash:utc:http-xsdate:2014") || ip0.u7(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            u7(dn0Var, new dm0(vl0Var));
        } else {
            QX(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void v5(ke0 ke0Var, boolean z, ok0 ok0Var) {
        this.q7 = ok0Var;
        this.Z1 = this.WB.zzgs();
        io0 io0Var = new io0("Loader:DashMediaSource");
        this.n5 = io0Var;
        this.Q6 = io0Var;
        this.e3 = new Handler();
        XL();
    }

    private ul0(Uri uri, yn0 yn0Var, rl0 rl0Var, int i, long j, Handler handler, qj0 qj0Var) {
        this(uri, yn0Var, new lm0(), rl0Var, 3, -1L, handler, null);
    }

    private ul0(Uri uri, yn0 yn0Var, po0<? extends km0> po0Var, rl0 rl0Var, int i, long j, Handler handler, qj0 qj0Var) {
        this(null, uri, yn0Var, po0Var, rl0Var, 3, -1L, handler, qj0Var);
    }

    private ul0(km0 km0Var, Uri uri, yn0 yn0Var, po0<? extends km0> po0Var, rl0 rl0Var, int i, long j, Handler handler, qj0 qj0Var) {
        this.eU = null;
        this.kf = uri;
        this.WB = yn0Var;
        this.k2 = po0Var;
        this.mb = rl0Var;
        this.jw = i;
        this.fY = j;
        this.qp = new rj0(handler, qj0Var);
        this.AL = new Object();
        this.w9 = new SparseArray<>();
        this.zh = new zl0(this, null);
        this.hK = new vl0(this);
        this.cT = new wl0(this);
    }
}
