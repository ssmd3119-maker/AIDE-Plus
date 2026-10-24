package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class d2<T> {

    @SuppressLint({"StaticFieldLeak"})
    private static Context VH;
    private static final Object Zo = new Object();
    private static final AtomicInteger gn = new AtomicInteger();
    private final String DW;
    private final T FH;
    private volatile int Hw;
    private final j2 j6;
    private volatile T v5;

    private d2(j2 j2Var, String str, T t) {
        this.Hw = -1;
        if (j2Var.j6 == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.j6 = j2Var;
        this.DW = str;
        this.FH = t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d2<Double> FH(j2 j2Var, String str, double d) {
        return new h2(j2Var, str, Double.valueOf(d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d2<Integer> Hw(j2 j2Var, String str, int i) {
        return new f2(j2Var, str, Integer.valueOf(i));
    }

    private final String J8(String str) {
        if (str != null && str.isEmpty()) {
            return this.DW;
        }
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(this.DW);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    static void QX() {
        gn.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d2<Boolean> VH(j2 j2Var, String str, boolean z) {
        return new g2(j2Var, str, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d2<String> Zo(j2 j2Var, String str, String str2) {
        return new i2(j2Var, str, str2);
    }

    @Nullable
    private final T aM() {
        Object objJ6;
        String str = (String) z1.DW(VH).j6("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
        if (str != null && o1.FH.matcher(str).matches()) {
            String strValueOf = String.valueOf(XL());
            Log.w("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else {
            w1 w1VarDW = this.j6.j6 != null ? r1.DW(VH.getContentResolver(), this.j6.j6) : k2.FH(VH, null);
            if (w1VarDW != null && (objJ6 = w1VarDW.j6(XL())) != null) {
                return Ws(objJ6);
            }
        }
        return null;
    }

    public static void gn(Context context) {
        synchronized (Zo) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (VH != context) {
                synchronized (r1.class) {
                    r1.Zo.clear();
                }
                synchronized (k2.class) {
                    k2.Zo.clear();
                }
                synchronized (z1.class) {
                    z1.DW = null;
                }
                gn.incrementAndGet();
                VH = context;
            }
        }
    }

    @Nullable
    private final T j3() {
        Object objJ6 = z1.DW(VH).j6(J8(this.j6.DW));
        if (objJ6 != null) {
            return Ws(objJ6);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d2<Long> v5(j2 j2Var, String str, long j) {
        return new e2(j2Var, str, Long.valueOf(j));
    }

    public final T DW() {
        return this.FH;
    }

    abstract T Ws(Object obj);

    public final String XL() {
        return J8(this.j6.FH);
    }

    public final T j6() {
        int i = gn.get();
        if (this.Hw < i) {
            synchronized (this) {
                if (this.Hw < i) {
                    if (VH == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    T tAM = aM();
                    if (tAM == null && (tAM = j3()) == null) {
                        tAM = this.FH;
                    }
                    this.v5 = tAM;
                    this.Hw = i;
                }
            }
        }
        return this.v5;
    }

    /* synthetic */ d2(j2 j2Var, String str, Object obj, e2 e2Var) {
        this(j2Var, str, obj);
    }
}
