package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class e00 extends r50<e00, a> implements b70 {
    private static volatile k70<e00> zzcas;
    private static final e00 zzfep;
    private int zzfea;
    private i40 zzfei = i40.mb;
    private i00 zzfeo;

    public static final class a extends r50.a<e00, a> implements b70 {
        private a() {
            super(e00.zzfep);
        }

        public final a U2(i40 i40Var) {
            J0();
            ((e00) this.mb).sh(i40Var);
            return this;
        }

        public final a XL(i00 i00Var) {
            J0();
            ((e00) this.mb).ei(i00Var);
            return this;
        }

        public final a j3(int i) {
            J0();
            ((e00) this.mb).yS(0);
            return this;
        }

        /* synthetic */ a(f00 f00Var) {
            this();
        }
    }

    static {
        e00 e00Var = new e00();
        zzfep = e00Var;
        r50.aM(e00.class, e00Var);
    }

    private e00() {
    }

    public static e00 cb(i40 i40Var) {
        return (e00) r50.tp(zzfep, i40Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ei(i00 i00Var) {
        if (i00Var == null) {
            throw null;
        }
        this.zzfeo = i00Var;
    }

    public static a ro() {
        return (a) ((r50.a) zzfep.J8(r50.e.v5, null, null));
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
        f00 f00Var = null;
        switch (f00.j6[i - 1]) {
            case 1:
                return new e00();
            case 2:
                return new a(f00Var);
            case 3:
                return r50.Ws(zzfep, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzfea", "zzfeo", "zzfei"});
            case 4:
                return zzfep;
            case 5:
                k70<e00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (e00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfep);
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

    public final i00 SI() {
        i00 i00Var = this.zzfeo;
        return i00Var == null ? i00.yS() : i00Var;
    }

    public final int er() {
        return this.zzfea;
    }

    public final i40 nw() {
        return this.zzfei;
    }
}
