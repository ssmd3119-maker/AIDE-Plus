package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class g00 extends r50<g00, a> implements b70 {
    private static volatile k70<g00> zzcas;
    private static final g00 zzfeq;
    private int zzfek;
    private i00 zzfeo;

    public static final class a extends r50.a<g00, a> implements b70 {
        private a() {
            super(g00.zzfeq);
        }

        /* synthetic */ a(h00 h00Var) {
            this();
        }
    }

    static {
        g00 g00Var = new g00();
        zzfeq = g00Var;
        r50.aM(g00.class, g00Var);
    }

    private g00() {
    }

    public static g00 BT(i40 i40Var) {
        return (g00) r50.tp(zzfeq, i40Var);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        h00 h00Var = null;
        switch (h00.j6[i - 1]) {
            case 1:
                return new g00();
            case 2:
                return new a(h00Var);
            case 3:
                return r50.Ws(zzfeq, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzfeo", "zzfek"});
            case 4:
                return zzfeq;
            case 5:
                k70<g00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (g00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfeq);
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

    public final int er() {
        return this.zzfek;
    }

    public final i00 yS() {
        i00 i00Var = this.zzfeo;
        return i00Var == null ? i00.yS() : i00Var;
    }
}
