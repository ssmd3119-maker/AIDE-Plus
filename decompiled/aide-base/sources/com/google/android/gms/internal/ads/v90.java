package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class v90 extends r50<v90, a> implements b70 {
    private static volatile k70<v90> zzcas;
    private static final v90 zzfzb;
    private int zzccg;
    private i40 zzfyy;
    private i40 zzfyz;
    private i40 zzfza;

    public static final class a extends r50.a<v90, a> implements b70 {
        private a() {
            super(v90.zzfzb);
        }

        /* synthetic */ a(x90 x90Var) {
            this();
        }
    }

    static {
        v90 v90Var = new v90();
        zzfzb = v90Var;
        r50.aM(v90.class, v90Var);
    }

    private v90() {
        i40 i40Var = i40.mb;
        this.zzfyy = i40Var;
        this.zzfyz = i40Var;
        this.zzfza = i40Var;
    }

    public static k70<v90> yS() {
        return (k70) zzfzb.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        x90 x90Var = null;
        switch (x90.j6[i - 1]) {
            case 1:
                return new v90();
            case 2:
                return new a(x90Var);
            case 3:
                return r50.Ws(zzfzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzccg", "zzfyy", "zzfyz", "zzfza"});
            case 4:
                return zzfzb;
            case 5:
                k70<v90> bVar = zzcas;
                if (bVar == null) {
                    synchronized (v90.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfzb);
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
