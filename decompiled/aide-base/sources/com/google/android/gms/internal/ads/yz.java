package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class yz extends r50<yz, a> implements b70 {
    private static volatile k70<yz> zzcas;
    private static final yz zzfej;
    private int zzfea;
    private c00 zzfeh;
    private i40 zzfei = i40.mb;

    public static final class a extends r50.a<yz, a> implements b70 {
        private a() {
            super(yz.zzfej);
        }

        public final a U2(i40 i40Var) {
            J0();
            ((yz) this.mb).cb(i40Var);
            return this;
        }

        public final a XL(c00 c00Var) {
            J0();
            ((yz) this.mb).sh(c00Var);
            return this;
        }

        public final a j3(int i) {
            J0();
            ((yz) this.mb).yS(0);
            return this;
        }

        /* synthetic */ a(zz zzVar) {
            this();
        }
    }

    static {
        yz yzVar = new yz();
        zzfej = yzVar;
        r50.aM(yz.class, yzVar);
    }

    private yz() {
    }

    public static a SI() {
        return (a) ((r50.a) zzfej.J8(r50.e.v5, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cb(i40 i40Var) {
        if (i40Var == null) {
            throw null;
        }
        this.zzfei = i40Var;
    }

    public static yz dx(i40 i40Var) {
        return (yz) r50.tp(zzfej, i40Var);
    }

    public static yz ro() {
        return zzfej;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sh(c00 c00Var) {
        if (c00Var == null) {
            throw null;
        }
        this.zzfeh = c00Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yS(int i) {
        this.zzfea = i;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        zz zzVar = null;
        switch (zz.j6[i - 1]) {
            case 1:
                return new yz();
            case 2:
                return new a(zzVar);
            case 3:
                return r50.Ws(zzfej, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzfea", "zzfeh", "zzfei"});
            case 4:
                return zzfej;
            case 5:
                k70<yz> bVar = zzcas;
                if (bVar == null) {
                    synchronized (yz.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfej);
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

    public final c00 ei() {
        c00 c00Var = this.zzfeh;
        return c00Var == null ? c00.yS() : c00Var;
    }

    public final int er() {
        return this.zzfea;
    }

    public final i40 nw() {
        return this.zzfei;
    }
}
