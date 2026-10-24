package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class k10 extends r50<k10, a> implements b70 {
    private static volatile k70<k10> zzcas;
    private static final k10 zzfgj;
    private int zzfgh;
    private int zzfgi;

    public static final class a extends r50.a<k10, a> implements b70 {
        private a() {
            super(k10.zzfgj);
        }

        /* synthetic */ a(l10 l10Var) {
            this();
        }
    }

    static {
        k10 k10Var = new k10();
        zzfgj = k10Var;
        r50.aM(k10.class, k10Var);
    }

    private k10() {
    }

    public static k10 gW() {
        return zzfgj;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        l10 l10Var = null;
        switch (l10.j6[i - 1]) {
            case 1:
                return new k10();
            case 2:
                return new a(l10Var);
            case 3:
                return r50.Ws(zzfgj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzfgh", "zzfgi"});
            case 4:
                return zzfgj;
            case 5:
                k70<k10> bVar = zzcas;
                if (bVar == null) {
                    synchronized (k10.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfgj);
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

    public final f10 er() {
        f10 f10VarJ6 = f10.j6(this.zzfgh);
        return f10VarJ6 == null ? f10.UNRECOGNIZED : f10VarJ6;
    }

    public final int yS() {
        return this.zzfgi;
    }
}
