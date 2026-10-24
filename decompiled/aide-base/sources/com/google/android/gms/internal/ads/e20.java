package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class e20 extends r50<e20, a> implements b70 {
    private static volatile k70<e20> zzcas;
    private static final e20 zzfia;
    private String zzfhy = "";
    private q10 zzfhz;

    public static final class a extends r50.a<e20, a> implements b70 {
        private a() {
            super(e20.zzfia);
        }

        /* synthetic */ a(f20 f20Var) {
            this();
        }
    }

    static {
        e20 e20Var = new e20();
        zzfia = e20Var;
        r50.aM(e20.class, e20Var);
    }

    private e20() {
    }

    public static e20 P8(i40 i40Var) {
        return (e20) r50.tp(zzfia, i40Var);
    }

    public static e20 gW() {
        return zzfia;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        f20 f20Var = null;
        switch (f20.j6[i - 1]) {
            case 1:
                return new e20();
            case 2:
                return new a(f20Var);
            case 3:
                return r50.Ws(zzfia, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzfhy", "zzfhz"});
            case 4:
                return zzfia;
            case 5:
                k70<e20> bVar = zzcas;
                if (bVar == null) {
                    synchronized (e20.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfia);
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

    public final String er() {
        return this.zzfhy;
    }

    public final q10 yS() {
        q10 q10Var = this.zzfhz;
        return q10Var == null ? q10.gW() : q10Var;
    }
}
