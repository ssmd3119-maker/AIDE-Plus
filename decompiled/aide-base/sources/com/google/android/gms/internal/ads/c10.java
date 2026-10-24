package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class c10 extends r50<c10, a> implements b70 {
    private static volatile k70<c10> zzcas;
    private static final c10 zzffr;
    private int zzffo;
    private int zzffp;
    private i40 zzffq = i40.mb;

    public static final class a extends r50.a<c10, a> implements b70 {
        private a() {
            super(c10.zzffr);
        }

        /* synthetic */ a(d10 d10Var) {
            this();
        }
    }

    static {
        c10 c10Var = new c10();
        zzffr = c10Var;
        r50.aM(c10.class, c10Var);
    }

    private c10() {
    }

    public static c10 BT() {
        return zzffr;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        d10 d10Var = null;
        switch (d10.j6[i - 1]) {
            case 1:
                return new c10();
            case 2:
                return new a(d10Var);
            case 3:
                return r50.Ws(zzffr, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzffo", "zzffp", "zzffq"});
            case 4:
                return zzffr;
            case 5:
                k70<c10> bVar = zzcas;
                if (bVar == null) {
                    synchronized (c10.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzffr);
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

    public final e10 er() {
        e10 e10VarJ6 = e10.j6(this.zzffo);
        return e10VarJ6 == null ? e10.UNRECOGNIZED : e10VarJ6;
    }

    public final i40 gW() {
        return this.zzffq;
    }

    public final f10 yS() {
        f10 f10VarJ6 = f10.j6(this.zzffp);
        return f10VarJ6 == null ? f10.UNRECOGNIZED : f10VarJ6;
    }
}
