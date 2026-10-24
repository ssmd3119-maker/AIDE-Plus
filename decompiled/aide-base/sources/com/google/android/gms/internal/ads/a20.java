package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class a20 extends r50<a20, a> implements b70 {
    private static volatile k70<a20> zzcas;
    private static final a20 zzfhv;
    private String zzfhu = "";

    public static final class a extends r50.a<a20, a> implements b70 {
        private a() {
            super(a20.zzfhv);
        }

        /* synthetic */ a(b20 b20Var) {
            this();
        }
    }

    static {
        a20 a20Var = new a20();
        zzfhv = a20Var;
        r50.aM(a20.class, a20Var);
    }

    private a20() {
    }

    public static a20 BT(i40 i40Var) {
        return (a20) r50.tp(zzfhv, i40Var);
    }

    public static a20 yS() {
        return zzfhv;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        b20 b20Var = null;
        switch (b20.j6[i - 1]) {
            case 1:
                return new a20();
            case 2:
                return new a(b20Var);
            case 3:
                return r50.Ws(zzfhv, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzfhu"});
            case 4:
                return zzfhv;
            case 5:
                k70<a20> bVar = zzcas;
                if (bVar == null) {
                    synchronized (a20.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfhv);
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
        return this.zzfhu;
    }
}
