package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class s10 extends r50<s10, a> implements b70 {
    private static volatile k70<s10> zzcas;
    private static final s10 zzfhh;
    private int zzfhe;
    private boolean zzfhf;
    private String zzfhd = "";
    private String zzfgk = "";
    private String zzfhg = "";

    public static final class a extends r50.a<s10, a> implements b70 {
        private a() {
            super(s10.zzfhh);
        }

        public final a U2(String str) {
            J0();
            ((s10) this.mb).Sf(str);
            return this;
        }

        public final a XL(boolean z) {
            J0();
            ((s10) this.mb).cb(true);
            return this;
        }

        public final a j3(int i) {
            J0();
            ((s10) this.mb).sG(0);
            return this;
        }

        public final a lg(String str) {
            J0();
            ((s10) this.mb).ef(str);
            return this;
        }

        public final a rN(String str) {
            J0();
            ((s10) this.mb).vJ(str);
            return this;
        }

        /* synthetic */ a(t10 t10Var) {
            this();
        }
    }

    static {
        s10 s10Var = new s10();
        zzfhh = s10Var;
        r50.aM(s10.class, s10Var);
    }

    private s10() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Sf(String str) {
        if (str == null) {
            throw null;
        }
        this.zzfhd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cb(boolean z) {
        this.zzfhf = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ef(String str) {
        if (str == null) {
            throw null;
        }
        this.zzfgk = str;
    }

    public static a ro() {
        return (a) ((r50.a) zzfhh.J8(r50.e.v5, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sG(int i) {
        this.zzfhe = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vJ(String str) {
        if (str == null) {
            throw null;
        }
        this.zzfhg = str;
    }

    public final String BT() {
        return this.zzfgk;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        t10 t10Var = null;
        switch (t10.j6[i - 1]) {
            case 1:
                return new s10();
            case 2:
                return new a(t10Var);
            case 3:
                return r50.Ws(zzfhh, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzfhd", "zzfgk", "zzfhe", "zzfhf", "zzfhg"});
            case 4:
                return zzfhh;
            case 5:
                k70<s10> bVar = zzcas;
                if (bVar == null) {
                    synchronized (s10.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfhh);
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

    public final String P8() {
        return this.zzfhd;
    }

    public final String SI() {
        return this.zzfhg;
    }

    public final int ei() {
        return this.zzfhe;
    }

    public final boolean nw() {
        return this.zzfhf;
    }
}
