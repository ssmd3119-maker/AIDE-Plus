package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.probelytics.api.UserTouchAction;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class pe0 implements ke0 {
    private final rn0 DW;
    private int EQ;
    private final qn0 FH;
    private final Handler Hw;
    private int J0;
    private boolean J8;
    private te0 Mr;
    private Object QX;
    private int U2;
    private final jf0 VH;
    private gf0 Ws;
    private al0 XL;
    private final CopyOnWriteArraySet<le0> Zo;
    private long a8;
    private qn0 aM;
    private final if0 gn;
    private bf0 j3;
    private final cf0[] j6;
    private boolean tp;
    private boolean u7;
    private final re0 v5;
    private int we;

    @SuppressLint({"HandlerLeak"})
    public pe0(cf0[] cf0VarArr, rn0 rn0Var, ze0 ze0Var) {
        String str = ip0.v5;
        StringBuilder sb = new StringBuilder("Init ExoPlayerLib/2.4.2 [".length() + 1 + String.valueOf(str).length());
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        ro0.Hw(cf0VarArr.length > 0);
        ro0.FH(cf0VarArr);
        this.j6 = cf0VarArr;
        ro0.FH(rn0Var);
        this.DW = rn0Var;
        this.tp = false;
        this.EQ = 1;
        this.Zo = new CopyOnWriteArraySet<>();
        this.FH = new qn0(new on0[cf0VarArr.length]);
        this.Ws = gf0.j6;
        this.VH = new jf0();
        this.gn = new if0();
        this.XL = al0.Hw;
        this.aM = this.FH;
        this.j3 = bf0.Hw;
        this.Hw = new qe0(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        te0 te0Var = new te0(0, 0L);
        this.Mr = te0Var;
        this.v5 = new re0(cf0VarArr, rn0Var, ze0Var, this.tp, 0, this.Hw, te0Var, this);
    }

    private final int FH() {
        if (this.Ws.j6() || this.we > 0) {
            return this.U2;
        }
        this.Ws.FH(this.Mr.j6, this.gn, false);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final long Cz() {
        if (this.Ws.j6()) {
            return -9223372036854775807L;
        }
        return ie0.j6(this.Ws.v5(FH(), this.VH, false, 0L).v5);
    }

    final void DW(Message message) {
        switch (message.what) {
            case 0:
                this.J0--;
                return;
            case 1:
                this.EQ = message.arg1;
                Iterator<le0> it = this.Zo.iterator();
                while (it.hasNext()) {
                    it.next().J0(this.tp, this.EQ);
                }
                return;
            case 2:
                this.J8 = message.arg1 != 0;
                Iterator<le0> it2 = this.Zo.iterator();
                while (it2.hasNext()) {
                    it2.next().FH(this.J8);
                }
                return;
            case 3:
                if (this.J0 == 0) {
                    tn0 tn0Var = (tn0) message.obj;
                    this.u7 = true;
                    this.XL = tn0Var.j6;
                    this.aM = tn0Var.DW;
                    this.DW.Hw(tn0Var.FH);
                    Iterator<le0> it3 = this.Zo.iterator();
                    while (it3.hasNext()) {
                        it3.next().we(this.XL, this.aM);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.we - 1;
                this.we = i;
                if (i == 0) {
                    this.Mr = (te0) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<le0> it4 = this.Zo.iterator();
                        while (it4.hasNext()) {
                            it4.next().j6();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.we == 0) {
                    this.Mr = (te0) message.obj;
                    Iterator<le0> it5 = this.Zo.iterator();
                    while (it5.hasNext()) {
                        it5.next().j6();
                    }
                    return;
                }
                return;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                ve0 ve0Var = (ve0) message.obj;
                this.we -= ve0Var.Hw;
                if (this.J0 == 0) {
                    this.Ws = ve0Var.j6;
                    this.QX = ve0Var.DW;
                    this.Mr = ve0Var.FH;
                    Iterator<le0> it6 = this.Zo.iterator();
                    while (it6.hasNext()) {
                        it6.next().VH(this.Ws, this.QX);
                    }
                    return;
                }
                return;
            case UserTouchAction.CLICK_KIND /* 7 */:
                bf0 bf0Var = (bf0) message.obj;
                if (this.j3.equals(bf0Var)) {
                    return;
                }
                this.j3 = bf0Var;
                Iterator<le0> it7 = this.Zo.iterator();
                while (it7.hasNext()) {
                    it7.next().aM(bf0Var);
                }
                return;
            case 8:
                je0 je0Var = (je0) message.obj;
                Iterator<le0> it8 = this.Zo.iterator();
                while (it8.hasNext()) {
                    it8.next().J8(je0Var);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final void Gj(ne0... ne0VarArr) {
        this.v5.aM(ne0VarArr);
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final int Jl() {
        return this.j6.length;
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final void e3(boolean z) {
        if (this.tp != z) {
            this.tp = z;
            this.v5.P8(z);
            Iterator<le0> it = this.Zo.iterator();
            while (it.hasNext()) {
                it.next().J0(z, this.EQ);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final long eU() {
        if (this.Ws.j6() || this.we > 0) {
            return this.a8;
        }
        this.Ws.FH(this.Mr.j6, this.gn, false);
        return this.gn.DW() + ie0.j6(this.Mr.FH);
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final void fN(nk0 nk0Var) {
        if (!this.Ws.j6() || this.QX != null) {
            this.Ws = gf0.j6;
            this.QX = null;
            Iterator<le0> it = this.Zo.iterator();
            while (it.hasNext()) {
                it.next().VH(this.Ws, this.QX);
            }
        }
        if (this.u7) {
            this.u7 = false;
            this.XL = al0.Hw;
            this.aM = this.FH;
            this.DW.Hw(null);
            Iterator<le0> it2 = this.Zo.iterator();
            while (it2.hasNext()) {
                it2.next().we(this.XL, this.aM);
            }
        }
        this.J0++;
        this.v5.QX(nk0Var, true);
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final void iW(long j) {
        int iFH = FH();
        if (iFH < 0 || (!this.Ws.j6() && iFH >= this.Ws.VH())) {
            throw new ye0(this.Ws, iFH, j);
        }
        this.we++;
        this.U2 = iFH;
        if (!this.Ws.j6()) {
            this.Ws.v5(iFH, this.VH, false, 0L);
            long jDW = this.VH.Zo + (j == -9223372036854775807L ? this.VH.Hw : ie0.DW(j));
            long j2 = this.Ws.FH(0, this.gn, false).FH;
            int i = 0;
            while (j2 != -9223372036854775807L && jDW >= j2 && i < this.VH.FH) {
                jDW -= j2;
                i++;
                j2 = this.Ws.FH(i, this.gn, false).FH;
            }
        }
        if (j == -9223372036854775807L) {
            this.a8 = 0L;
            this.v5.Ws(this.Ws, iFH, -9223372036854775807L);
            return;
        }
        this.a8 = j;
        this.v5.Ws(this.Ws, iFH, ie0.DW(j));
        Iterator<le0> it = this.Zo.iterator();
        while (it.hasNext()) {
            it.next().j6();
        }
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final void j6() {
        this.v5.FH();
        this.Hw.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final int kf() {
        return this.EQ;
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final void oy(le0 le0Var) {
        this.Zo.add(le0Var);
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final void pN(le0 le0Var) {
        this.Zo.remove(le0Var);
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final boolean pO() {
        return this.tp;
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final long sE() {
        if (this.Ws.j6() || this.we > 0) {
            return this.a8;
        }
        this.Ws.FH(this.Mr.j6, this.gn, false);
        return this.gn.DW() + ie0.j6(this.Mr.Hw);
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final void sg(ne0... ne0VarArr) {
        this.v5.rN(ne0VarArr);
    }

    @Override // com.google.android.gms.internal.ads.ke0
    public final void stop() {
        this.v5.VH();
    }
}
