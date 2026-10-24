package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class a00 extends r50<a00, a> implements b70 {
    private static volatile k70<a00> zzcas;
    private static final a00 zzfel;
    private c00 zzfeh;
    private int zzfek;

    public static final class a extends r50.a<a00, a> implements b70 {
        private a() {
            super(a00.zzfel);
        }

        /* synthetic */ a(b00 b00Var) {
            this();
        }
    }

    static {
        a00 a00Var = new a00();
        zzfel = a00Var;
        r50.aM(a00.class, a00Var);
    }

    private a00() {
    }

    public static a00 P8(i40 i40Var) {
        return (a00) r50.tp(zzfel, i40Var);
    }

    public static a00 gW() {
        return zzfel;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        b00 b00Var = null;
        switch (b00.j6[i - 1]) {
            case 1:
                return new a00();
            case 2:
                return new a(b00Var);
            case 3:
                return r50.Ws(zzfel, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzfeh", "zzfek"});
            case 4:
                return zzfel;
            case 5:
                k70<a00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (a00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfel);
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

    public final c00 yS() {
        c00 c00Var = this.zzfeh;
        return c00Var == null ? c00.yS() : c00Var;
    }
}
