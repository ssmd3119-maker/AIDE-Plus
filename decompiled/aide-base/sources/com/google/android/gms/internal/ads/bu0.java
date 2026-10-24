package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class bu0 extends r50<bu0, a> implements b70 {
    private static volatile k70<bu0> zzcas;
    private static final bu0 zzceb;
    private int zzccg;
    private w50 zzcdx = r50.U2();
    private int zzcea;

    public static final class a extends r50.a<bu0, a> implements b70 {
        private a() {
            super(bu0.zzceb);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        bu0 bu0Var = new bu0();
        zzceb = bu0Var;
        r50.aM(bu0.class, bu0Var);
    }

    private bu0() {
    }

    public static k70<bu0> er() {
        return (k70) zzceb.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new bu0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzceb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u0016", new Object[]{"zzccg", "zzcea", uu0.DW(), "zzcdx"});
            case 4:
                return zzceb;
            case 5:
                k70<bu0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (bu0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzceb);
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
