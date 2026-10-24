package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class au0 extends r50<au0, a> implements b70 {
    private static volatile k70<au0> zzcas;
    private static final au0 zzcdz;
    private int zzccg;
    private int zzcdw;
    private ju0 zzcdy;
    private String zzcdv = "";
    private w50 zzcdx = r50.U2();

    public static final class a extends r50.a<au0, a> implements b70 {
        private a() {
            super(au0.zzcdz);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        au0 au0Var = new au0();
        zzcdz = au0Var;
        r50.aM(au0.class, au0Var);
    }

    private au0() {
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new au0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcdz, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0016\u0004\t\u0002", new Object[]{"zzccg", "zzcdv", "zzcdw", uu0.DW(), "zzcdx", "zzcdy"});
            case 4:
                return zzcdz;
            case 5:
                k70<au0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (au0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcdz);
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
