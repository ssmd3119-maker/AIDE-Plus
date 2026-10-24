package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class i10 extends r50<i10, a> implements b70 {
    private static volatile k70<i10> zzcas;
    private static final i10 zzfgg;
    private int zzfek;
    private k10 zzfge;

    public static final class a extends r50.a<i10, a> implements b70 {
        private a() {
            super(i10.zzfgg);
        }

        /* synthetic */ a(j10 j10Var) {
            this();
        }
    }

    static {
        i10 i10Var = new i10();
        zzfgg = i10Var;
        r50.aM(i10.class, i10Var);
    }

    private i10() {
    }

    public static i10 BT() {
        return zzfgg;
    }

    public static i10 yS(i40 i40Var) {
        return (i10) r50.tp(zzfgg, i40Var);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        j10 j10Var = null;
        switch (j10.j6[i - 1]) {
            case 1:
                return new i10();
            case 2:
                return new a(j10Var);
            case 3:
                return r50.Ws(zzfgg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzfge", "zzfek"});
            case 4:
                return zzfgg;
            case 5:
                k70<i10> bVar = zzcas;
                if (bVar == null) {
                    synchronized (i10.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfgg);
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

    public final k10 gW() {
        k10 k10Var = this.zzfge;
        return k10Var == null ? k10.gW() : k10Var;
    }
}
