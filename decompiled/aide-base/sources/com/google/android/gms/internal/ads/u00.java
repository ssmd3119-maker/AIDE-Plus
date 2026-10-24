package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class u00 extends r50<u00, a> implements b70 {
    private static volatile k70<u00> zzcas;
    private static final u00 zzffe;
    private w00 zzffd;

    public static final class a extends r50.a<u00, a> implements b70 {
        private a() {
            super(u00.zzffe);
        }

        /* synthetic */ a(v00 v00Var) {
            this();
        }
    }

    static {
        u00 u00Var = new u00();
        zzffe = u00Var;
        r50.aM(u00.class, u00Var);
    }

    private u00() {
    }

    public static u00 gW(i40 i40Var) {
        return (u00) r50.tp(zzffe, i40Var);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        v00 v00Var = null;
        switch (v00.j6[i - 1]) {
            case 1:
                return new u00();
            case 2:
                return new a(v00Var);
            case 3:
                return r50.Ws(zzffe, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzffd"});
            case 4:
                return zzffe;
            case 5:
                k70<u00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (u00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzffe);
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

    public final w00 er() {
        w00 w00Var = this.zzffd;
        return w00Var == null ? w00.BT() : w00Var;
    }
}
