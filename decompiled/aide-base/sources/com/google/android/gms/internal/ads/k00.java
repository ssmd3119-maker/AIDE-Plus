package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class k00 extends r50<k00, a> implements b70 {
    private static volatile k70<k00> zzcas;
    private static final k00 zzfes;
    private int zzfea;
    private i40 zzfei = i40.mb;

    public static final class a extends r50.a<k00, a> implements b70 {
        private a() {
            super(k00.zzfes);
        }

        public final a XL(int i) {
            J0();
            ((k00) this.mb).yS(0);
            return this;
        }

        public final a j3(i40 i40Var) {
            J0();
            ((k00) this.mb).SI(i40Var);
            return this;
        }

        /* synthetic */ a(l00 l00Var) {
            this();
        }
    }

    static {
        k00 k00Var = new k00();
        zzfes = k00Var;
        r50.aM(k00.class, k00Var);
    }

    private k00() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void SI(i40 i40Var) {
        if (i40Var == null) {
            throw null;
        }
        this.zzfei = i40Var;
    }

    public static a ei() {
        return (a) ((r50.a) zzfes.J8(r50.e.v5, null, null));
    }

    public static k00 ro(i40 i40Var) {
        return (k00) r50.tp(zzfes, i40Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yS(int i) {
        this.zzfea = i;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        l00 l00Var = null;
        switch (l00.j6[i - 1]) {
            case 1:
                return new k00();
            case 2:
                return new a(l00Var);
            case 3:
                return r50.Ws(zzfes, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzfea", "zzfei"});
            case 4:
                return zzfes;
            case 5:
                k70<k00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (k00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfes);
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
