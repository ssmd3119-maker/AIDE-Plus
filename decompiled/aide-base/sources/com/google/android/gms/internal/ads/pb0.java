package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public class pb0 {
    private static final ConditionVariable FH = new ConditionVariable();
    protected static volatile zzur Hw = null;
    private static volatile Random v5 = null;
    protected volatile Boolean DW;
    private nc0 j6;

    public pb0(nc0 nc0Var) {
        this.j6 = nc0Var;
        nc0Var.we().execute(new qb0(this));
    }

    public static int Hw() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : v5().nextInt();
        } catch (RuntimeException unused) {
            return v5().nextInt();
        }
    }

    private static Random v5() {
        if (v5 == null) {
            synchronized (pb0.class) {
                if (v5 == null) {
                    v5 = new Random();
                }
            }
        }
        return v5;
    }

    public final void DW(int i, int i2, long j) {
        try {
            FH.block();
            if (!this.DW.booleanValue() || Hw == null) {
                return;
            }
            wv wvVar = new wv();
            wvVar.FH = this.j6.j6.getPackageName();
            wvVar.Hw = Long.valueOf(j);
            vt0 vt0VarJ6 = Hw.j6(p90.VH(wvVar));
            vt0VarJ6.DW(i2);
            vt0VarJ6.FH(i);
            vt0VarJ6.j6();
        } catch (Exception unused) {
        }
    }
}
