package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class fu0 extends r50<fu0, a> implements b70 {
    private static volatile k70<fu0> zzcas;
    private static final fu0 zzcfe;
    private int zzccg;
    private int zzcet = 1000;
    private int zzceu = 1000;
    private int zzcev;
    private int zzcew;
    private int zzcex;
    private int zzcey;
    private int zzcez;
    private int zzcfa;
    private int zzcfb;
    private int zzcfc;
    private gu0 zzcfd;

    public static final class a extends r50.a<fu0, a> implements b70 {
        private a() {
            super(fu0.zzcfe);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        fu0 fu0Var = new fu0();
        zzcfe = fu0Var;
        r50.aM(fu0.class, fu0Var);
    }

    private fu0() {
    }

    public static k70<fu0> er() {
        return (k70) zzcfe.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new fu0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcfe, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\t\n", new Object[]{"zzccg", "zzcet", uu0.DW(), "zzceu", uu0.DW(), "zzcev", "zzcew", "zzcex", "zzcey", "zzcez", "zzcfa", "zzcfb", "zzcfc", "zzcfd"});
            case 4:
                return zzcfe;
            case 5:
                k70<fu0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (fu0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcfe);
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
