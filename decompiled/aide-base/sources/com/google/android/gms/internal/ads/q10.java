package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class q10 extends r50<q10, a> implements b70 {
    private static volatile k70<q10> zzcas;
    private static final q10 zzfhc;
    private String zzfgk = "";
    private i40 zzfgl = i40.mb;
    private int zzfhb;

    public static final class a extends r50.a<q10, a> implements b70 {
        private a() {
            super(q10.zzfhc);
        }

        /* synthetic */ a(r10 r10Var) {
            this();
        }
    }

    static {
        q10 q10Var = new q10();
        zzfhc = q10Var;
        r50.aM(q10.class, q10Var);
    }

    private q10() {
    }

    public static q10 gW() {
        return zzfhc;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        r10 r10Var = null;
        switch (r10.j6[i - 1]) {
            case 1:
                return new q10();
            case 2:
                return new a(r10Var);
            case 3:
                return r50.Ws(zzfhc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzfgk", "zzfgl", "zzfhb"});
            case 4:
                return zzfhc;
            case 5:
                k70<q10> bVar = zzcas;
                if (bVar == null) {
                    synchronized (q10.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfhc);
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
        return this.zzfgk;
    }

    public final i40 yS() {
        return this.zzfgl;
    }
}
