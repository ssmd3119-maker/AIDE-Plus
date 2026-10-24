package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class i00 extends r50<i00, a> implements b70 {
    private static volatile k70<i00> zzcas;
    private static final i00 zzfer;
    private int zzfem;

    public static final class a extends r50.a<i00, a> implements b70 {
        private a() {
            super(i00.zzfer);
        }

        /* synthetic */ a(j00 j00Var) {
            this();
        }
    }

    static {
        i00 i00Var = new i00();
        zzfer = i00Var;
        r50.aM(i00.class, i00Var);
    }

    private i00() {
    }

    public static i00 yS() {
        return zzfer;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        j00 j00Var = null;
        switch (j00.j6[i - 1]) {
            case 1:
                return new i00();
            case 2:
                return new a(j00Var);
            case 3:
                return r50.Ws(zzfer, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzfem"});
            case 4:
                return zzfer;
            case 5:
                k70<i00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (i00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfer);
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
        return this.zzfem;
    }
}
