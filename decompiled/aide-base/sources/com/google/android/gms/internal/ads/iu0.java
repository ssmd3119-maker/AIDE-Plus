package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class iu0 extends r50<iu0, a> implements b70 {
    private static volatile k70<iu0> zzcas;
    private static final iu0 zzcfl;
    private int zzccg;
    private String zzcdv = "";
    private int zzcdw;
    private ju0 zzcdy;

    public static final class a extends r50.a<iu0, a> implements b70 {
        private a() {
            super(iu0.zzcfl);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        iu0 iu0Var = new iu0();
        zzcfl = iu0Var;
        r50.aM(iu0.class, iu0Var);
    }

    private iu0() {
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new iu0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcfl, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\t\u0002", new Object[]{"zzccg", "zzcdv", "zzcdw", uu0.DW(), "zzcdy"});
            case 4:
                return zzcfl;
            case 5:
                k70<iu0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (iu0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcfl);
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
