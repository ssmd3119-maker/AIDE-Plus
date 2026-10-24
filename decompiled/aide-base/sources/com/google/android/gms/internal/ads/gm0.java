package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gm0 implements ql0 {
    private final int[] DW;
    private IOException EQ;
    private final on0 FH;
    private final int Hw;
    private final long VH;
    private final xn0 Zo;
    private final int gn;
    private final no0 j6;
    private int tp;
    private km0 u7;
    private final im0[] v5;
    private boolean we;

    public gm0(no0 no0Var, km0 km0Var, int i, int[] iArr, on0 on0Var, int i2, xn0 xn0Var, long j, int i3, boolean z, boolean z2) {
        this.j6 = no0Var;
        this.u7 = km0Var;
        this.DW = iArr;
        this.FH = on0Var;
        this.Hw = i2;
        this.Zo = xn0Var;
        this.tp = i;
        this.VH = j;
        this.gn = i3;
        long jDW = km0Var.DW(i);
        ArrayList<qm0> arrayListZo = Zo();
        this.v5 = new im0[on0Var.DW()];
        for (int i4 = 0; i4 < this.v5.length; i4++) {
            this.v5[i4] = new im0(jDW, arrayListZo.get(on0Var.gn(i4)), z, z2);
        }
    }

    private final ArrayList<qm0> Zo() {
        List<jm0> list = this.u7.j6(this.tp).FH;
        ArrayList<qm0> arrayList = new ArrayList<>();
        for (int i : this.DW) {
            arrayList.addAll(list.get(i).FH);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.ql0
    public final void DW(km0 km0Var, int i) {
        try {
            this.u7 = km0Var;
            this.tp = i;
            long jDW = km0Var.DW(i);
            ArrayList<qm0> arrayListZo = Zo();
            for (int i2 = 0; i2 < this.v5.length; i2++) {
                this.v5[i2].j6(jDW, arrayListZo.get(this.FH.gn(i2)));
            }
        } catch (xj0 e) {
            this.EQ = e;
        }
    }

    @Override // com.google.android.gms.internal.ads.ll0
    public final void FH(ol0 ol0Var, long j, il0 il0Var) {
        int iDW;
        int iV5;
        el0 ml0Var;
        gm0 gm0Var = this;
        if (gm0Var.EQ != null) {
            return;
        }
        gm0Var.FH.v5(ol0Var != null ? ol0Var.VH - j : 0L);
        im0 im0Var = gm0Var.v5[gm0Var.FH.VH()];
        fl0 fl0Var = im0Var.j6;
        if (fl0Var != null) {
            qm0 qm0Var = im0Var.DW;
            pm0 pm0VarU7 = fl0Var.v5() == null ? qm0Var.u7() : null;
            pm0 pm0VarTp = im0Var.FH == null ? qm0Var.tp() : null;
            if (pm0VarU7 != null || pm0VarTp != null) {
                xn0 xn0Var = gm0Var.Zo;
                zzfs zzfsVarEQ = gm0Var.FH.EQ();
                int iU7 = gm0Var.FH.u7();
                Object objFH = gm0Var.FH.FH();
                String str = im0Var.DW.DW;
                if (pm0VarU7 != null) {
                    pm0 pm0VarJ6 = pm0VarU7.j6(pm0VarTp, str);
                    if (pm0VarJ6 != null) {
                        pm0VarU7 = pm0VarJ6;
                    }
                } else {
                    pm0VarU7 = pm0VarTp;
                }
                il0Var.j6 = new nl0(xn0Var, new bo0(pm0VarU7.DW(str), pm0VarU7.j6, pm0VarU7.DW, im0Var.DW.gn()), zzfsVarEQ, iU7, objFH, im0Var.j6);
                return;
            }
        }
        long jElapsedRealtime = (gm0Var.VH != 0 ? SystemClock.elapsedRealtime() + gm0Var.VH : System.currentTimeMillis()) * 1000;
        int iVH = im0Var.VH();
        if (iVH == 0) {
            km0 km0Var = gm0Var.u7;
            il0Var.DW = !km0Var.FH || gm0Var.tp < km0Var.FH() - 1;
            return;
        }
        int iZo = im0Var.Zo();
        if (iVH == -1) {
            km0 km0Var2 = gm0Var.u7;
            long j2 = (jElapsedRealtime - (km0Var2.j6 * 1000)) - (km0Var2.j6(gm0Var.tp).DW * 1000);
            long j3 = gm0Var.u7.v5;
            if (j3 != -9223372036854775807L) {
                iZo = Math.max(iZo, im0Var.DW(j2 - (j3 * 1000)));
            }
            iDW = im0Var.DW(j2) - 1;
        } else {
            iDW = (iVH + iZo) - 1;
        }
        if (ol0Var == null) {
            iV5 = ip0.Mr(im0Var.DW(j), iZo, iDW);
        } else {
            iV5 = ol0Var.v5();
            if (iV5 < iZo) {
                gm0Var.EQ = new xj0();
                return;
            }
        }
        int i = iV5;
        if (i > iDW) {
            gm0Var = this;
        } else if (!gm0Var.we || i < iDW) {
            int iMin = Math.min(gm0Var.gn, (iDW - i) + 1);
            xn0 xn0Var2 = gm0Var.Zo;
            int i2 = gm0Var.Hw;
            zzfs zzfsVarEQ2 = gm0Var.FH.EQ();
            int iU72 = gm0Var.FH.u7();
            Object objFH2 = gm0Var.FH.FH();
            qm0 qm0Var2 = im0Var.DW;
            long jHw = im0Var.Hw(i);
            pm0 pm0VarFH = im0Var.FH(i);
            String str2 = qm0Var2.DW;
            if (im0Var.j6 == null) {
                ml0Var = new pl0(xn0Var2, new bo0(pm0VarFH.DW(str2), pm0VarFH.j6, pm0VarFH.DW, qm0Var2.gn()), zzfsVarEQ2, iU72, objFH2, jHw, im0Var.v5(i), i, i2, zzfsVarEQ2);
            } else {
                int i3 = 1;
                int i4 = 1;
                while (i3 < iMin) {
                    pm0 pm0VarJ62 = pm0VarFH.j6(im0Var.FH(i + i3), str2);
                    if (pm0VarJ62 == null) {
                        break;
                    }
                    i4++;
                    i3++;
                    pm0VarFH = pm0VarJ62;
                }
                ml0Var = new ml0(xn0Var2, new bo0(pm0VarFH.DW(str2), pm0VarFH.j6, pm0VarFH.DW, qm0Var2.gn()), zzfsVarEQ2, iU72, objFH2, jHw, im0Var.v5((i + i4) - 1), i, i4, -qm0Var2.FH, im0Var.j6);
            }
            il0Var.j6 = ml0Var;
            return;
        }
        km0 km0Var3 = gm0Var.u7;
        il0Var.DW = !km0Var3.FH || gm0Var.tp < km0Var3.FH() - 1;
    }

    @Override // com.google.android.gms.internal.ads.ll0
    public final boolean Hw(el0 el0Var, boolean z, Exception exc) {
        int i;
        im0 im0Var;
        int iVH;
        boolean zZo = false;
        if (!z) {
            return false;
        }
        boolean z2 = true;
        if (!this.u7.FH && (el0Var instanceof ol0) && (exc instanceof go0) && ((go0) exc).WB == 404 && (iVH = (im0Var = this.v5[this.FH.j6(el0Var.FH)]).VH()) != -1 && iVH != 0) {
            if (((ol0) el0Var).v5() > (im0Var.Zo() + iVH) - 1) {
                this.we = true;
                return true;
            }
        }
        on0 on0Var = this.FH;
        int iJ6 = on0Var.j6(el0Var.FH);
        if (!(exc instanceof go0) || ((i = ((go0) exc).WB) != 404 && i != 410)) {
            z2 = false;
        }
        if (z2) {
            zZo = on0Var.Zo(iJ6, 60000L);
            int i2 = ((go0) exc).WB;
            if (zZo) {
                String strValueOf = String.valueOf(on0Var.Hw(iJ6));
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 77);
                sb.append("Blacklisted: duration=60000, responseCode=");
                sb.append(i2);
                sb.append(", format=");
                sb.append(strValueOf);
                Log.w("ChunkedTrackBlacklist", sb.toString());
            } else {
                String strValueOf2 = String.valueOf(on0Var.Hw(iJ6));
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 92);
                sb2.append("Blacklisting failed (cannot blacklist last enabled track): responseCode=");
                sb2.append(i2);
                sb2.append(", format=");
                sb2.append(strValueOf2);
                Log.w("ChunkedTrackBlacklist", sb2.toString());
            }
        }
        return zZo;
    }

    @Override // com.google.android.gms.internal.ads.ll0
    public final void j6() throws IOException {
        IOException iOException = this.EQ;
        if (iOException != null) {
            throw iOException;
        }
        this.j6.j6();
    }

    @Override // com.google.android.gms.internal.ads.ll0
    public final void v5(el0 el0Var) {
        kh0 kh0VarFH;
        if (el0Var instanceof nl0) {
            im0 im0Var = this.v5[this.FH.j6(((nl0) el0Var).FH)];
            if (im0Var.FH != null || (kh0VarFH = im0Var.j6.FH()) == null) {
                return;
            }
            im0Var.FH = new fm0((ah0) kh0VarFH);
        }
    }
}
