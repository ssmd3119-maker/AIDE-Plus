package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class nu0 extends r50<nu0, a> implements b70 {
    private static volatile k70<nu0> zzcas;
    private static final nu0 zzcgh;
    private int zzccg;
    private int zzcea = 1000;
    private lu0 zzcft;
    private ju0 zzcfu;

    public static final class a extends r50.a<nu0, a> implements b70 {
        private a() {
            super(nu0.zzcgh);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        nu0 nu0Var = new nu0();
        zzcgh = nu0Var;
        r50.aM(nu0.class, nu0Var);
    }

    private nu0() {
    }

    public static k70<nu0> er() {
        return (k70) zzcgh.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new nu0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcgh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzccg", "zzcea", uu0.DW(), "zzcft", "zzcfu"});
            case 4:
                return zzcgh;
            case 5:
                k70<nu0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (nu0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcgh);
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
