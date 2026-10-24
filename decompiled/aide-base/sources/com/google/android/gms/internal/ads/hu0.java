package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class hu0 extends r50<hu0, a> implements b70 {
    private static volatile k70<hu0> zzcas;
    private static final hu0 zzcfk;
    private int zzccg;
    private int zzcfi;
    private int zzcfj;

    public static final class a extends r50.a<hu0, a> implements b70 {
        private a() {
            super(hu0.zzcfk);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        hu0 hu0Var = new hu0();
        zzcfk = hu0Var;
        r50.aM(hu0.class, hu0Var);
    }

    private hu0() {
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new hu0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcfk, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzccg", "zzcfi", "zzcfj"});
            case 4:
                return zzcfk;
            case 5:
                k70<hu0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (hu0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcfk);
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
