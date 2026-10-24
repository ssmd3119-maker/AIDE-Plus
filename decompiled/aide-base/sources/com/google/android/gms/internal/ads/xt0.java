package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class xt0 extends r50<xt0, a> implements b70 {
    private static volatile k70<xt0> zzcas;
    private static final xt0 zzcda;
    private int zzccg;
    private String zzccx = "";
    private x50<wt0> zzccy = r50.a8();
    private int zzccz;

    public static final class a extends r50.a<xt0, a> implements b70 {
        private a() {
            super(xt0.zzcda);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        xt0 xt0Var = new xt0();
        zzcda = xt0Var;
        r50.aM(xt0.class, xt0Var);
    }

    private xt0() {
    }

    public static k70<xt0> er() {
        return (k70) zzcda.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new xt0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcda, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\f\u0001", new Object[]{"zzccg", "zzccx", "zzccy", wt0.class, "zzccz", uu0.DW()});
            case 4:
                return zzcda;
            case 5:
                k70<xt0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (xt0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcda);
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
