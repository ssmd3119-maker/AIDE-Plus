package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* loaded from: classes.dex */
public final class bk0 implements gh0, lk0, tk0, jo0<gk0> {
    private final String AL;
    private boolean[] Cz;
    private long Gj;
    private mk0 Jl;
    private final Uri WB;
    private boolean a5;
    private final hk0 cT;
    private boolean e3;
    private long e9;
    private boolean eU;
    private al0 fN;
    private final Handler fY;
    private kh0 iW;
    private final int jw;
    private final ok0 k2;
    private final xn0 mb;
    private boolean oy;
    private boolean[] pN;
    private int pO;
    private final kk0 qp;
    private boolean sE;
    private int sM;
    private boolean sg;
    private final long w9;
    private boolean ys;
    private final vn0 zh;
    private final io0 hK = new io0("Loader:ExtractorMediaPeriod");
    private final to0 q7 = new to0();
    private final Runnable Z1 = new ck0(this);
    private final Runnable n5 = new dk0(this);
    private final Handler Q6 = new Handler();
    private long QO = -9223372036854775807L;
    private final SparseArray<rk0> kf = new SparseArray<>();
    private long aX = -1;

    public bk0(Uri uri, xn0 xn0Var, dh0[] dh0VarArr, int i, Handler handler, kk0 kk0Var, ok0 ok0Var, vn0 vn0Var, String str, int i2) {
        this.WB = uri;
        this.mb = xn0Var;
        this.jw = i;
        this.fY = handler;
        this.qp = kk0Var;
        this.k2 = ok0Var;
        this.zh = vn0Var;
        this.AL = str;
        this.w9 = i2;
        this.cT = new hk0(dh0VarArr, this);
    }

    private final boolean KD() {
        return this.QO != -9223372036854775807L;
    }

    private final long SI() {
        int size = this.kf.size();
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, this.kf.valueAt(i).Ws());
        }
        return jMax;
    }

    private final void a8(gk0 gk0Var) {
        if (this.aX == -1) {
            this.aX = gk0Var.u7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ei() {
        if (this.ys || this.e3 || this.iW == null || !this.eU) {
            return;
        }
        int size = this.kf.size();
        for (int i = 0; i < size; i++) {
            if (this.kf.valueAt(i).Mr() == null) {
                return;
            }
        }
        this.q7.FH();
        yk0[] yk0VarArr = new yk0[size];
        this.pN = new boolean[size];
        this.Cz = new boolean[size];
        this.Gj = this.iW.gn();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                this.fN = new al0(yk0VarArr);
                this.e3 = true;
                this.k2.j6(new xk0(this.Gj, this.iW.Hw()), null);
                this.Jl.Zo(this);
                return;
            }
            zzfs zzfsVarMr = this.kf.valueAt(i2).Mr();
            yk0VarArr[i2] = new yk0(zzfsVarMr);
            String str = zzfsVarMr.k2;
            if (!wo0.DW(str) && !wo0.j6(str)) {
                z = false;
            }
            this.pN[i2] = z;
            this.oy = z | this.oy;
            i2++;
        }
    }

    private final void j3() {
        kh0 kh0Var;
        gk0 gk0Var = new gk0(this, this.WB, this.mb, this.cT, this.q7);
        if (this.e3) {
            ro0.Hw(KD());
            long j = this.Gj;
            if (j != -9223372036854775807L && this.QO >= j) {
                this.a5 = true;
                this.QO = -9223372036854775807L;
                return;
            } else {
                gk0Var.v5(this.iW.v5(this.QO), this.QO);
                this.QO = -9223372036854775807L;
            }
        }
        this.sM = nw();
        int i = this.jw;
        if (i == -1) {
            i = (this.e3 && this.aX == -1 && ((kh0Var = this.iW) == null || kh0Var.gn() == -9223372036854775807L)) ? 6 : 3;
        }
        this.hK.FH(gk0Var, this, i);
    }

    private final int nw() {
        int size = this.kf.size();
        int iXL = 0;
        for (int i = 0; i < size; i++) {
            iXL += this.kf.valueAt(i).XL();
        }
        return iXL;
    }

    @Override // com.google.android.gms.internal.ads.lk0, com.google.android.gms.internal.ads.vk0
    public final long DW() {
        if (this.pO == 0) {
            return Long.MIN_VALUE;
        }
        return gn();
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final void EQ(long j) {
    }

    @Override // com.google.android.gms.internal.ads.lk0, com.google.android.gms.internal.ads.vk0
    public final boolean FH(long j) {
        if (this.a5) {
            return false;
        }
        if (this.e3 && this.pO == 0) {
            return false;
        }
        boolean zDW = this.q7.DW();
        if (this.hK.DW()) {
            return zDW;
        }
        j3();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gh0
    public final void Hw() {
        this.eU = true;
        this.Q6.post(this.Z1);
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public final /* synthetic */ int J0(lo0 lo0Var, long j, long j2, IOException iOException) {
        kh0 kh0Var;
        gk0 gk0Var = (gk0) lo0Var;
        a8(gk0Var);
        Handler handler = this.fY;
        if (handler != null && this.qp != null) {
            handler.post(new fk0(this, iOException));
        }
        if (iOException instanceof bl0) {
            return 3;
        }
        boolean z = nw() > this.sM;
        if (this.aX == -1 && ((kh0Var = this.iW) == null || kh0Var.gn() == -9223372036854775807L)) {
            this.e9 = 0L;
            this.sg = this.e3;
            int size = this.kf.size();
            for (int i = 0; i < size; i++) {
                this.kf.valueAt(i).rN(!this.e3 || this.Cz[i]);
            }
            gk0Var.v5(0L, 0L);
        }
        this.sM = nw();
        return z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final long J8(on0[] on0VarArr, boolean[] zArr, uk0[] uk0VarArr, boolean[] zArr2, long j) {
        ro0.Hw(this.e3);
        for (int i = 0; i < on0VarArr.length; i++) {
            if (uk0VarArr[i] != null && (on0VarArr[i] == null || !zArr[i])) {
                int i2 = ((ik0) uk0VarArr[i]).WB;
                ro0.Hw(this.Cz[i2]);
                this.pO--;
                this.Cz[i2] = false;
                this.kf.valueAt(i2).v5();
                uk0VarArr[i] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < on0VarArr.length; i3++) {
            if (uk0VarArr[i3] == null && on0VarArr[i3] != null) {
                on0 on0Var = on0VarArr[i3];
                ro0.Hw(on0Var.DW() == 1);
                ro0.Hw(on0Var.gn(0) == 0);
                int iJ6 = this.fN.j6(on0Var.tp());
                ro0.Hw(!this.Cz[iJ6]);
                this.pO++;
                this.Cz[iJ6] = true;
                uk0VarArr[i3] = new ik0(this, iJ6);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.sE) {
            int size = this.kf.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.Cz[i4]) {
                    this.kf.valueAt(i4).v5();
                }
            }
        }
        if (this.pO == 0) {
            this.sg = false;
            if (this.hK.DW()) {
                this.hK.tp();
            }
        } else if (!this.sE ? j != 0 : z) {
            j = VH(j);
            for (int i5 = 0; i5 < uk0VarArr.length; i5++) {
                if (uk0VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.sE = true;
        return j;
    }

    final int Mr(int i, xe0 xe0Var, tg0 tg0Var, boolean z) {
        if (this.sg || KD()) {
            return -3;
        }
        return this.kf.valueAt(i).Zo(xe0Var, tg0Var, z, this.a5, this.e9);
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public final /* synthetic */ void QX(lo0 lo0Var, long j, long j2) {
        a8((gk0) lo0Var);
        this.a5 = true;
        if (this.Gj == -9223372036854775807L) {
            long jSI = SI();
            this.Gj = jSI == Long.MIN_VALUE ? 0L : jSI + 10000;
            this.k2.j6(new xk0(this.Gj, this.iW.Hw()), null);
        }
        this.Jl.Hw(this);
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final long VH(long j) {
        if (!this.iW.Hw()) {
            j = 0;
        }
        this.e9 = j;
        int size = this.kf.size();
        boolean zJ8 = !KD();
        for (int i = 0; zJ8 && i < size; i++) {
            if (this.Cz[i]) {
                zJ8 = this.kf.valueAt(i).J8(j, false);
            }
        }
        if (!zJ8) {
            this.QO = j;
            this.a5 = false;
            if (this.hK.DW()) {
                this.hK.tp();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.kf.valueAt(i2).rN(this.Cz[i2]);
                }
            }
        }
        this.sg = false;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final void Ws() throws IOException {
        this.hK.u7(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.tk0
    public final void XL(zzfs zzfsVar) {
        this.Q6.post(this.Z1);
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public final /* synthetic */ void Zo(lo0 lo0Var, long j, long j2, boolean z) {
        a8((gk0) lo0Var);
        if (z || this.pO <= 0) {
            return;
        }
        int size = this.kf.size();
        for (int i = 0; i < size; i++) {
            this.kf.valueAt(i).rN(this.Cz[i]);
        }
        this.Jl.Hw(this);
    }

    public final void aM() {
        this.hK.VH(new ek0(this, this.cT));
        this.Q6.removeCallbacksAndMessages(null);
        this.ys = true;
    }

    final void gW(int i, long j) {
        rk0 rk0VarValueAt = this.kf.valueAt(i);
        if (!this.a5 || j <= rk0VarValueAt.Ws()) {
            rk0VarValueAt.J8(j, true);
        } else {
            rk0VarValueAt.U2();
        }
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final long gn() {
        long jSI;
        if (this.a5) {
            return Long.MIN_VALUE;
        }
        if (KD()) {
            return this.QO;
        }
        if (this.oy) {
            jSI = Long.MAX_VALUE;
            int size = this.kf.size();
            for (int i = 0; i < size; i++) {
                if (this.pN[i]) {
                    jSI = Math.min(jSI, this.kf.valueAt(i).Ws());
                }
            }
        } else {
            jSI = SI();
        }
        return jSI == Long.MIN_VALUE ? this.e9 : jSI;
    }

    @Override // com.google.android.gms.internal.ads.gh0
    public final mh0 j6(int i, int i2) {
        rk0 rk0Var = this.kf.get(i);
        if (rk0Var != null) {
            return rk0Var;
        }
        rk0 rk0Var2 = new rk0(this.zh);
        rk0Var2.u7(this);
        this.kf.put(i, rk0Var2);
        return rk0Var2;
    }

    final boolean lg(int i) {
        if (this.a5) {
            return true;
        }
        return !KD() && this.kf.valueAt(i).j3();
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final al0 tp() {
        return this.fN;
    }

    @Override // com.google.android.gms.internal.ads.gh0
    public final void u7(kh0 kh0Var) {
        this.iW = kh0Var;
        this.Q6.post(this.Z1);
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final void v5(mk0 mk0Var, long j) {
        this.Jl = mk0Var;
        this.q7.DW();
        j3();
    }

    final void vy() {
        this.hK.u7(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final long we() {
        if (!this.sg) {
            return -9223372036854775807L;
        }
        this.sg = false;
        return this.e9;
    }
}
