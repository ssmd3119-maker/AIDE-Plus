package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class o00 extends r50<o00, a> implements b70 {
    private static volatile k70<o00> zzcas;
    private static final o00 zzfeu;
    private int zzfea;
    private i40 zzfei = i40.mb;

    public static final class a extends r50.a<o00, a> implements b70 {
        private a() {
            super(o00.zzfeu);
        }

        public final a XL(int i) {
            J0();
            ((o00) this.mb).yS(0);
            return this;
        }

        public final a j3(i40 i40Var) {
            J0();
            ((o00) this.mb).SI(i40Var);
            return this;
        }

        /* synthetic */ a(p00 p00Var) {
            this();
        }
    }

    static {
        o00 o00Var = new o00();
        zzfeu = o00Var;
        r50.aM(o00.class, o00Var);
    }

    private o00() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void SI(i40 i40Var) {
        if (i40Var == null) {
            throw null;
        }
        this.zzfei = i40Var;
    }

    public static a ei() {
        return (a) ((r50.a) zzfeu.J8(r50.e.v5, null, null));
    }

    public static o00 ro(i40 i40Var) {
        return (o00) r50.tp(zzfeu, i40Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yS(int i) {
        this.zzfea = i;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        p00 p00Var = null;
        switch (p00.j6[i - 1]) {
            case 1:
                return new o00();
            case 2:
                return new a(p00Var);
            case 3:
                return r50.Ws(zzfeu, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzfea", "zzfei"});
            case 4:
                return zzfeu;
            case 5:
                k70<o00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (o00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfeu);
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

    public final i40 P8() {
        return this.zzfei;
    }

    public final int er() {
        return this.zzfea;
    }
}
