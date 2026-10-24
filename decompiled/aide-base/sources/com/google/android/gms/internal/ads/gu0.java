package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class gu0 extends r50<gu0, a> implements b70 {
    private static volatile k70<gu0> zzcas;
    private static final gu0 zzcfh;
    private int zzccg;
    private int zzcff;
    private int zzcfg;

    public static final class a extends r50.a<gu0, a> implements b70 {
        private a() {
            super(gu0.zzcfh);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        gu0 gu0Var = new gu0();
        zzcfh = gu0Var;
        r50.aM(gu0.class, gu0Var);
    }

    private gu0() {
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new gu0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcfh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzccg", "zzcff", "zzcfg"});
            case 4:
                return zzcfh;
            case 5:
                k70<gu0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (gu0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcfh);
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
