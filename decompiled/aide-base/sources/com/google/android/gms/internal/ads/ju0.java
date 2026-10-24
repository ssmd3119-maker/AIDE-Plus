package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class ju0 extends r50<ju0, a> implements b70 {
    private static volatile k70<ju0> zzcas;
    private static final ju0 zzcfo;
    private int zzccg;
    private int zzcfm;
    private int zzcfn;

    public static final class a extends r50.a<ju0, a> implements b70 {
        private a() {
            super(ju0.zzcfo);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        ju0 ju0Var = new ju0();
        zzcfo = ju0Var;
        r50.aM(ju0.class, ju0Var);
    }

    private ju0() {
    }

    public static k70<ju0> er() {
        return (k70) zzcfo.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new ju0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcfo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzccg", "zzcfm", "zzcfn"});
            case 4:
                return zzcfo;
            case 5:
                k70<ju0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (ju0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcfo);
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
