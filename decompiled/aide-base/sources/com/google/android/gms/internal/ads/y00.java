package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class y00 extends r50<y00, a> implements b70 {
    private static volatile k70<y00> zzcas;
    private static final y00 zzffk;
    private int zzfea;
    private i40 zzfei = i40.mb;
    private a10 zzffj;

    public static final class a extends r50.a<y00, a> implements b70 {
        private a() {
            super(y00.zzffk);
        }

        public final a U2(i40 i40Var) {
            J0();
            ((y00) this.mb).sh(i40Var);
            return this;
        }

        public final a XL(a10 a10Var) {
            J0();
            ((y00) this.mb).ei(a10Var);
            return this;
        }

        public final a j3(int i) {
            J0();
            ((y00) this.mb).yS(0);
            return this;
        }

        /* synthetic */ a(z00 z00Var) {
            this();
        }
    }

    static {
        y00 y00Var = new y00();
        zzffk = y00Var;
        r50.aM(y00.class, y00Var);
    }

    private y00() {
    }

    public static y00 cb(i40 i40Var) {
        return (y00) r50.tp(zzffk, i40Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ei(a10 a10Var) {
        if (a10Var == null) {
            throw null;
        }
        this.zzffj = a10Var;
    }

    public static a ro() {
        return (a) ((r50.a) zzffk.J8(r50.e.v5, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sh(i40 i40Var) {
        if (i40Var == null) {
            throw null;
        }
        this.zzfei = i40Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yS(int i) {
        this.zzfea = i;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        z00 z00Var = null;
        switch (z00.j6[i - 1]) {
            case 1:
                return new y00();
            case 2:
                return new a(z00Var);
            case 3:
                return r50.Ws(zzffk, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzfea", "zzffj", "zzfei"});
            case 4:
                return zzffk;
            case 5:
                k70<y00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (y00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzffk);
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

    public final a10 SI() {
        a10 a10Var = this.zzffj;
        return a10Var == null ? a10.cb() : a10Var;
    }

    public final int er() {
        return this.zzfea;
    }

    public final i40 nw() {
        return this.zzfei;
    }
}
