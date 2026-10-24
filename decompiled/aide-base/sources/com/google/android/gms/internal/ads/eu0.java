package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class eu0 extends r50<eu0, a> implements b70 {
    private static volatile k70<eu0> zzcas;
    private static final eu0 zzces;
    private int zzccg;
    private int zzceq;
    private ju0 zzcer;

    public static final class a extends r50.a<eu0, a> implements b70 {
        private a() {
            super(eu0.zzces);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        eu0 eu0Var = new eu0();
        zzces = eu0Var;
        r50.aM(eu0.class, eu0Var);
    }

    private eu0() {
    }

    public static k70<eu0> er() {
        return (k70) zzces.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new eu0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzces, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzccg", "zzceq", uu0.DW(), "zzcer"});
            case 4:
                return zzces;
            case 5:
                k70<eu0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (eu0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzces);
                            zzcas = bVar;
                        }
                    }
                }
                return bVar;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return (byte) 1;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
