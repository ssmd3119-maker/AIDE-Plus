package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class y10 extends r50<y10, a> implements b70 {
    private static volatile k70<y10> zzcas;
    private static final y10 zzfht;
    private int zzfea;
    private a20 zzfhs;

    public static final class a extends r50.a<y10, a> implements b70 {
        private a() {
            super(y10.zzfht);
        }

        public final a XL(a20 a20Var) {
            J0();
            ((y10) this.mb).P8(a20Var);
            return this;
        }

        public final a j3(int i) {
            J0();
            ((y10) this.mb).yS(0);
            return this;
        }

        /* synthetic */ a(z10 z10Var) {
            this();
        }
    }

    static {
        y10 y10Var = new y10();
        zzfht = y10Var;
        r50.aM(y10.class, y10Var);
    }

    private y10() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P8(a20 a20Var) {
        if (a20Var == null) {
            throw null;
        }
        this.zzfhs = a20Var;
    }

    public static a SI() {
        return (a) ((r50.a) zzfht.J8(r50.e.v5, null, null));
    }

    public static y10 ei(i40 i40Var) {
        return (y10) r50.tp(zzfht, i40Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yS(int i) {
        this.zzfea = i;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        z10 z10Var = null;
        switch (z10.j6[i - 1]) {
            case 1:
                return new y10();
            case 2:
                return new a(z10Var);
            case 3:
                return r50.Ws(zzfht, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzfea", "zzfhs"});
            case 4:
                return zzfht;
            case 5:
                k70<y10> bVar = zzcas;
                if (bVar == null) {
                    synchronized (y10.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfht);
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
        return this.zzfea;
    }

    public final a20 nw() {
        a20 a20Var = this.zzfhs;
        return a20Var == null ? a20.yS() : a20Var;
    }
}
