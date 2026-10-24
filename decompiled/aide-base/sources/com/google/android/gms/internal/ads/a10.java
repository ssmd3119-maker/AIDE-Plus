package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class a10 extends r50<a10, a> implements b70 {
    private static volatile k70<a10> zzcas;
    private static final a10 zzffn;
    private int zzfea;
    private w00 zzffd;
    private i40 zzffl;
    private i40 zzffm;

    public static final class a extends r50.a<a10, a> implements b70 {
        private a() {
            super(a10.zzffn);
        }

        public final a U2(w00 w00Var) {
            J0();
            ((a10) this.mb).sG(w00Var);
            return this;
        }

        public final a XL(i40 i40Var) {
            J0();
            ((a10) this.mb).Sf(i40Var);
            return this;
        }

        public final a j3(i40 i40Var) {
            J0();
            ((a10) this.mb).ei(i40Var);
            return this;
        }

        public final a lg(int i) {
            J0();
            ((a10) this.mb).yS(0);
            return this;
        }

        /* synthetic */ a(b10 b10Var) {
            this();
        }
    }

    static {
        a10 a10Var = new a10();
        zzffn = a10Var;
        r50.aM(a10.class, a10Var);
    }

    private a10() {
        i40 i40Var = i40.mb;
        this.zzffl = i40Var;
        this.zzffm = i40Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Sf(i40 i40Var) {
        if (i40Var == null) {
            throw null;
        }
        this.zzffl = i40Var;
    }

    public static a10 cb() {
        return zzffn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ei(i40 i40Var) {
        if (i40Var == null) {
            throw null;
        }
        this.zzffm = i40Var;
    }

    public static a10 nw(i40 i40Var) {
        return (a10) r50.tp(zzffn, i40Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sG(w00 w00Var) {
        if (w00Var == null) {
            throw null;
        }
        this.zzffd = w00Var;
    }

    public static a sh() {
        return (a) ((r50.a) zzffn.J8(r50.e.v5, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yS(int i) {
        this.zzfea = i;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        b10 b10Var = null;
        switch (b10.j6[i - 1]) {
            case 1:
                return new a10();
            case 2:
                return new a(b10Var);
            case 3:
                return r50.Ws(zzffn, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzfea", "zzffd", "zzffl", "zzffm"});
            case 4:
                return zzffn;
            case 5:
                k70<a10> bVar = zzcas;
                if (bVar == null) {
                    synchronized (a10.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzffn);
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

    public final w00 SI() {
        w00 w00Var = this.zzffd;
        return w00Var == null ? w00.BT() : w00Var;
    }

    public final i40 cn() {
        return this.zzffm;
    }

    public final int er() {
        return this.zzfea;
    }

    public final i40 ro() {
        return this.zzffl;
    }
}
