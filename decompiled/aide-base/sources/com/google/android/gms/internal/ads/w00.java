package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class w00 extends r50<w00, a> implements b70 {
    private static volatile k70<w00> zzcas;
    private static final w00 zzffi;
    private c10 zzfff;
    private r00 zzffg;
    private int zzffh;

    public static final class a extends r50.a<w00, a> implements b70 {
        private a() {
            super(w00.zzffi);
        }

        /* synthetic */ a(x00 x00Var) {
            this();
        }
    }

    static {
        w00 w00Var = new w00();
        zzffi = w00Var;
        r50.aM(w00.class, w00Var);
    }

    private w00() {
    }

    public static w00 BT() {
        return zzffi;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        x00 x00Var = null;
        switch (x00.j6[i - 1]) {
            case 1:
                return new w00();
            case 2:
                return new a(x00Var);
            case 3:
                return r50.Ws(zzffi, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzfff", "zzffg", "zzffh"});
            case 4:
                return zzffi;
            case 5:
                k70<w00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (w00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzffi);
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

    public final c10 er() {
        c10 c10Var = this.zzfff;
        return c10Var == null ? c10.BT() : c10Var;
    }

    public final q00 gW() {
        q00 q00VarJ6 = q00.j6(this.zzffh);
        return q00VarJ6 == null ? q00.UNRECOGNIZED : q00VarJ6;
    }

    public final r00 yS() {
        r00 r00Var = this.zzffg;
        return r00Var == null ? r00.yS() : r00Var;
    }
}
