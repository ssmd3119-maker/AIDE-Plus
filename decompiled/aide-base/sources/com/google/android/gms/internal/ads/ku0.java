package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class ku0 extends r50<ku0, a> implements b70 {
    private static volatile k70<ku0> zzcas;
    private static final ku0 zzcfv;
    private int zzccg;
    private int zzcea = 1000;
    private lu0 zzcft;
    private ju0 zzcfu;

    public static final class a extends r50.a<ku0, a> implements b70 {
        private a() {
            super(ku0.zzcfv);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        ku0 ku0Var = new ku0();
        zzcfv = ku0Var;
        r50.aM(ku0.class, ku0Var);
    }

    private ku0() {
    }

    public static k70<ku0> er() {
        return (k70) zzcfv.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new ku0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcfv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzccg", "zzcea", uu0.DW(), "zzcft", "zzcfu"});
            case 4:
                return zzcfv;
            case 5:
                k70<ku0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (ku0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcfv);
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
