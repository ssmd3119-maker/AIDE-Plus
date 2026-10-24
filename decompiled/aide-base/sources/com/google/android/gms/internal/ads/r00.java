package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class r00 extends r50<r00, a> implements b70 {
    private static volatile k70<r00> zzcas;
    private static final r00 zzffc;
    private q10 zzffb;

    public static final class a extends r50.a<r00, a> implements b70 {
        private a() {
            super(r00.zzffc);
        }

        /* synthetic */ a(t00 t00Var) {
            this();
        }
    }

    static {
        r00 r00Var = new r00();
        zzffc = r00Var;
        r50.aM(r00.class, r00Var);
    }

    private r00() {
    }

    public static r00 yS() {
        return zzffc;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        t00 t00Var = null;
        switch (t00.j6[i - 1]) {
            case 1:
                return new r00();
            case 2:
                return new a(t00Var);
            case 3:
                return r50.Ws(zzffc, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzffb"});
            case 4:
                return zzffc;
            case 5:
                k70<r00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (r00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzffc);
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

    public final q10 er() {
        q10 q10Var = this.zzffb;
        return q10Var == null ? q10.gW() : q10Var;
    }
}
