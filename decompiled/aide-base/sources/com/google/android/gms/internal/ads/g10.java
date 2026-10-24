package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class g10 extends r50<g10, a> implements b70 {
    private static volatile k70<g10> zzcas;
    private static final g10 zzfgf;
    private int zzfea;
    private i40 zzfei = i40.mb;
    private k10 zzfge;

    public static final class a extends r50.a<g10, a> implements b70 {
        private a() {
            super(g10.zzfgf);
        }

        public final a U2(int i) {
            J0();
            ((g10) this.mb).yS(0);
            return this;
        }

        public final a XL(i40 i40Var) {
            J0();
            ((g10) this.mb).dx(i40Var);
            return this;
        }

        public final a j3(k10 k10Var) {
            J0();
            ((g10) this.mb).cb(k10Var);
            return this;
        }

        /* synthetic */ a(h10 h10Var) {
            this();
        }
    }

    static {
        g10 g10Var = new g10();
        zzfgf = g10Var;
        r50.aM(g10.class, g10Var);
    }

    private g10() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cb(k10 k10Var) {
        if (k10Var == null) {
            throw null;
        }
        this.zzfge = k10Var;
    }

    public static g10 cn() {
        return zzfgf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dx(i40 i40Var) {
        if (i40Var == null) {
            throw null;
        }
        this.zzfei = i40Var;
    }

    public static g10 ei(i40 i40Var) {
        return (g10) r50.tp(zzfgf, i40Var);
    }

    public static a ro() {
        return (a) ((r50.a) zzfgf.J8(r50.e.v5, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yS(int i) {
        this.zzfea = i;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        h10 h10Var = null;
        switch (h10.j6[i - 1]) {
            case 1:
                return new g10();
            case 2:
                return new a(h10Var);
            case 3:
                return r50.Ws(zzfgf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzfea", "zzfge", "zzfei"});
            case 4:
                return zzfgf;
            case 5:
                k70<g10> bVar = zzcas;
                if (bVar == null) {
                    synchronized (g10.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfgf);
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

    public final k10 SI() {
        k10 k10Var = this.zzfge;
        return k10Var == null ? k10.gW() : k10Var;
    }

    public final int er() {
        return this.zzfea;
    }

    public final i40 nw() {
        return this.zzfei;
    }
}
