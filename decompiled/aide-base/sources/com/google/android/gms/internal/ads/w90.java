package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class w90 extends r50<w90, a> implements b70 {
    private static volatile k70<w90> zzcas;
    private static final w90 zzfzh;
    private int zzccg;
    private i40 zzfza;
    private int zzfzf;
    private i40 zzfzg;

    public static final class a extends r50.a<w90, a> implements b70 {
        private a() {
            super(w90.zzfzh);
        }

        /* synthetic */ a(x90 x90Var) {
            this();
        }
    }

    static {
        w90 w90Var = new w90();
        zzfzh = w90Var;
        r50.aM(w90.class, w90Var);
    }

    private w90() {
        i40 i40Var = i40.mb;
        this.zzfzg = i40Var;
        this.zzfza = i40Var;
    }

    public static k70<w90> yS() {
        return (k70) zzfzh.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        x90 x90Var = null;
        switch (x90.j6[i - 1]) {
            case 1:
                return new w90();
            case 2:
                return new a(x90Var);
            case 3:
                return r50.Ws(zzfzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzccg", "zzfzf", "zzfzg", "zzfza"});
            case 4:
                return zzfzh;
            case 5:
                k70<w90> bVar = zzcas;
                if (bVar == null) {
                    synchronized (w90.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfzh);
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
