package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class m10 extends r50<m10, a> implements b70 {
    private static volatile k70<m10> zzcas;
    private static final m10 zzfgn;
    private String zzfgk = "";
    private i40 zzfgl = i40.mb;
    private int zzfgm;

    public static final class a extends r50.a<m10, a> implements b70 {
        private a() {
            super(m10.zzfgn);
        }

        public final a U2(String str) {
            J0();
            ((m10) this.mb).cb(str);
            return this;
        }

        public final a XL(i40 i40Var) {
            J0();
            ((m10) this.mb).P8(i40Var);
            return this;
        }

        public final a j3(b bVar) {
            J0();
            ((m10) this.mb).er(bVar);
            return this;
        }

        /* synthetic */ a(n10 n10Var) {
            this();
        }
    }

    public enum b implements u50 {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private final int WB;

        b(int i) {
            this.WB = i;
        }

        public static b j6(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // com.google.android.gms.internal.ads.u50
        public final int Hw() {
            if (this != UNRECOGNIZED) {
                return this.WB;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        m10 m10Var = new m10();
        zzfgn = m10Var;
        r50.aM(m10.class, m10Var);
    }

    private m10() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P8(i40 i40Var) {
        if (i40Var == null) {
            throw null;
        }
        this.zzfgl = i40Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cb(String str) {
        if (str == null) {
            throw null;
        }
        this.zzfgk = str;
    }

    public static m10 cn() {
        return zzfgn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void er(b bVar) {
        if (bVar == null) {
            throw null;
        }
        this.zzfgm = bVar.Hw();
    }

    public static a ro() {
        return (a) ((r50.a) zzfgn.J8(r50.e.v5, null, null));
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        n10 n10Var = null;
        switch (n10.j6[i - 1]) {
            case 1:
                return new m10();
            case 2:
                return new a(n10Var);
            case 3:
                return r50.Ws(zzfgn, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzfgk", "zzfgl", "zzfgm"});
            case 4:
                return zzfgn;
            case 5:
                k70<m10> bVar = zzcas;
                if (bVar == null) {
                    synchronized (m10.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfgn);
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

    public final b SI() {
        b bVarJ6 = b.j6(this.zzfgm);
        return bVarJ6 == null ? b.UNRECOGNIZED : bVarJ6;
    }

    public final String ei() {
        return this.zzfgk;
    }

    public final i40 nw() {
        return this.zzfgl;
    }
}
