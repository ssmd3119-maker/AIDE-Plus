package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class c20 extends r50<c20, a> implements b70 {
    private static volatile k70<c20> zzcas;
    private static final c20 zzfhx;
    private int zzfea;
    private e20 zzfhw;

    public static final class a extends r50.a<c20, a> implements b70 {
        private a() {
            super(c20.zzfhx);
        }

        public final a XL(e20 e20Var) {
            J0();
            ((c20) this.mb).P8(e20Var);
            return this;
        }

        public final a j3(int i) {
            J0();
            ((c20) this.mb).yS(0);
            return this;
        }

        /* synthetic */ a(d20 d20Var) {
            this();
        }
    }

    static {
        c20 c20Var = new c20();
        zzfhx = c20Var;
        r50.aM(c20.class, c20Var);
    }

    private c20() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P8(e20 e20Var) {
        if (e20Var == null) {
            throw null;
        }
        this.zzfhw = e20Var;
    }

    public static a nw() {
        return (a) ((r50.a) zzfhx.J8(r50.e.v5, null, null));
    }

    public static c20 ro(i40 i40Var) {
        return (c20) r50.tp(zzfhx, i40Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yS(int i) {
        this.zzfea = i;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        d20 d20Var = null;
        switch (d20.j6[i - 1]) {
            case 1:
                return new c20();
            case 2:
                return new a(d20Var);
            case 3:
                return r50.Ws(zzfhx, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzfea", "zzfhw"});
            case 4:
                return zzfhx;
            case 5:
                k70<c20> bVar = zzcas;
                if (bVar == null) {
                    synchronized (c20.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfhx);
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

    public final e20 ei() {
        e20 e20Var = this.zzfhw;
        return e20Var == null ? e20.gW() : e20Var;
    }

    public final int er() {
        return this.zzfea;
    }
}
