package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class pu0 extends r50<pu0, a> implements b70 {
    private static volatile k70<pu0> zzcas;
    private static final pu0 zzcgk;
    private int zzccg;
    private int zzcea = 1000;
    private lu0 zzcft;
    private ju0 zzcfu;

    public static final class a extends r50.a<pu0, a> implements b70 {
        private a() {
            super(pu0.zzcgk);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        pu0 pu0Var = new pu0();
        zzcgk = pu0Var;
        r50.aM(pu0.class, pu0Var);
    }

    private pu0() {
    }

    public static k70<pu0> er() {
        return (k70) zzcgk.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new pu0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcgk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzccg", "zzcea", uu0.DW(), "zzcft", "zzcfu"});
            case 4:
                return zzcgk;
            case 5:
                k70<pu0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (pu0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcgk);
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
