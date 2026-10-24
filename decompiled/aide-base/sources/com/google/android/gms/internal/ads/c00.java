package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class c00 extends r50<c00, a> implements b70 {
    private static volatile k70<c00> zzcas;
    private static final c00 zzfen;
    private int zzfem;

    public static final class a extends r50.a<c00, a> implements b70 {
        private a() {
            super(c00.zzfen);
        }

        /* synthetic */ a(d00 d00Var) {
            this();
        }
    }

    static {
        c00 c00Var = new c00();
        zzfen = c00Var;
        r50.aM(c00.class, c00Var);
    }

    private c00() {
    }

    public static c00 yS() {
        return zzfen;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        d00 d00Var = null;
        switch (d00.j6[i - 1]) {
            case 1:
                return new c00();
            case 2:
                return new a(d00Var);
            case 3:
                return r50.Ws(zzfen, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzfem"});
            case 4:
                return zzfen;
            case 5:
                k70<c00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (c00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfen);
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
