package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class dd0 extends xd0 {
    private static final yd0<q90> tp = new yd0<>();
    private final Context gn;
    private ww u7;

    public dd0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2, Context context, ww wwVar) {
        super(nc0Var, str, str2, szVar, i, 27);
        this.u7 = null;
        this.gn = context;
        this.u7 = wwVar;
    }

    private final String FH() throws ExecutionException, InterruptedException {
        try {
            if (this.j6.Mr() != null) {
                this.j6.Mr().get();
            }
            sz szVarJ3 = this.j6.j3();
            if (szVarJ3 == null || szVarJ3.er == null) {
                return null;
            }
            return szVarJ3.er;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        q90 q90Var;
        char c;
        AtomicReference<q90> atomicReferenceJ6 = tp.j6(this.gn.getPackageName());
        synchronized (atomicReferenceJ6) {
            q90 q90Var2 = atomicReferenceJ6.get();
            if (q90Var2 == null || uc0.VH(q90Var2.DW) || q90Var2.DW.equals("E") || q90Var2.DW.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                tx txVar = null;
                if (uc0.VH(null)) {
                    uc0.VH(null);
                    c = 2;
                } else {
                    c = 4;
                }
                Method method = this.v5;
                Object[] objArr = new Object[3];
                objArr[0] = this.gn;
                objArr[1] = Boolean.valueOf(c == 2);
                objArr[2] = cw0.v5().FH(p.An);
                q90 q90Var3 = new q90((String) method.invoke(null, objArr));
                if (uc0.VH(q90Var3.DW) || q90Var3.DW.equals("E")) {
                    if (c == 3) {
                        String strFH = FH();
                        if (!uc0.VH(strFH)) {
                            q90Var3.DW = strFH;
                        }
                    } else if (c == 4) {
                        q90Var3.DW = txVar.FH;
                    }
                }
                atomicReferenceJ6.set(q90Var3);
            }
            q90Var = atomicReferenceJ6.get();
        }
        synchronized (this.Hw) {
            if (q90Var != null) {
                this.Hw.er = q90Var.DW;
                this.Hw.ei = Long.valueOf(q90Var.FH);
                this.Hw.P8 = q90Var.Hw;
                this.Hw.ef = q90Var.v5;
                this.Hw.Sf = q90Var.Zo;
            }
        }
    }
}
