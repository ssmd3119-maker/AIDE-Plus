package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class uz extends r50<uz, a> implements b70 {
    private static volatile k70<uz> zzcas;
    private static final uz zzfed;
    private int zzfea;
    private yz zzfeb;
    private g10 zzfec;

    public static final class a extends r50.a<uz, a> implements b70 {
        private a() {
            super(uz.zzfed);
        }

        public final a U2(int i) {
            J0();
            ((uz) this.mb).yS(i);
            return this;
        }

        public final a XL(yz yzVar) {
            J0();
            ((uz) this.mb).ei(yzVar);
            return this;
        }

        public final a j3(g10 g10Var) {
            J0();
            ((uz) this.mb).nw(g10Var);
            return this;
        }

        /* synthetic */ a(vz vzVar) {
            this();
        }
    }

    static {
        uz uzVar = new uz();
        zzfed = uzVar;
        r50.aM(uz.class, uzVar);
    }

    private uz() {
    }

    public static uz cb(i40 i40Var) {
        return (uz) r50.tp(zzfed, i40Var);
    }

    public static a cn() {
        return (a) ((r50.a) zzfed.J8(r50.e.v5, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ei(yz yzVar) {
        if (yzVar == null) {
            throw null;
        }
        this.zzfeb = yzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nw(g10 g10Var) {
        if (g10Var == null) {
            throw null;
        }
        this.zzfec = g10Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yS(int i) {
        this.zzfea = i;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        vz vzVar = null;
        switch (vz.j6[i - 1]) {
            case 1:
                return new uz();
            case 2:
                return new a(vzVar);
            case 3:
                return r50.Ws(zzfed, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzfea", "zzfeb", "zzfec"});
            case 4:
                return zzfed;
            case 5:
                k70<uz> bVar = zzcas;
                if (bVar == null) {
                    synchronized (uz.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfed);
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

    public final yz SI() {
        yz yzVar = this.zzfeb;
        return yzVar == null ? yz.ro() : yzVar;
    }

    public final int er() {
        return this.zzfea;
    }

    public final g10 ro() {
        g10 g10Var = this.zzfec;
        return g10Var == null ? g10.cn() : g10Var;
    }
}
