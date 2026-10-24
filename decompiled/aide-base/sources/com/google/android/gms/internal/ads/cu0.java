package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class cu0 extends r50<cu0, a> implements b70 {
    private static volatile k70<cu0> zzcas;
    private static final cu0 zzcee;
    private int zzccg;
    private ju0 zzcdy;
    private int zzcea;
    private au0 zzcec;
    private x50<iu0> zzced = r50.a8();

    public static final class a extends r50.a<cu0, a> implements b70 {
        private a() {
            super(cu0.zzcee);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    static {
        cu0 cu0Var = new cu0();
        zzcee = cu0Var;
        r50.aM(cu0.class, cu0Var);
    }

    private cu0() {
    }

    public static k70<cu0> er() {
        return (k70) zzcee.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new cu0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcee, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001\u0004\t\u0002", new Object[]{"zzccg", "zzcec", "zzced", iu0.class, "zzcea", uu0.DW(), "zzcdy"});
            case 4:
                return zzcee;
            case 5:
                k70<cu0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (cu0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcee);
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
