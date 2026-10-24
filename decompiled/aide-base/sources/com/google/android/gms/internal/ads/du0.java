package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class du0 extends r50<du0, a> implements b70 {
    private static volatile k70<du0> zzcas;
    private static final du0 zzceg;
    private int zzccg;
    private int zzcch;
    private int zzcef;

    public static final class a extends r50.a<du0, a> implements b70 {
        private a() {
            super(du0.zzceg);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    public enum b implements u50 {
        CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
        TWO_G(1),
        THREE_G(2),
        LTE(4);

        private final int WB;

        b(int i) {
            this.WB = i;
        }

        public static v50 DW() {
            return wu0.j6;
        }

        public static b j6(int i) {
            if (i == 0) {
                return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return TWO_G;
            }
            if (i == 2) {
                return THREE_G;
            }
            if (i != 4) {
                return null;
            }
            return LTE;
        }

        @Override // com.google.android.gms.internal.ads.u50
        public final int Hw() {
            return this.WB;
        }
    }

    public enum c implements u50 {
        NETWORKTYPE_UNSPECIFIED(0),
        CELL(1),
        WIFI(2);

        private final int WB;

        c(int i) {
            this.WB = i;
        }

        public static v50 DW() {
            return xu0.j6;
        }

        public static c j6(int i) {
            if (i == 0) {
                return NETWORKTYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return CELL;
            }
            if (i != 2) {
                return null;
            }
            return WIFI;
        }

        @Override // com.google.android.gms.internal.ads.u50
        public final int Hw() {
            return this.WB;
        }
    }

    static {
        du0 du0Var = new du0();
        zzceg = du0Var;
        r50.aM(du0.class, du0Var);
    }

    private du0() {
    }

    public static k70<du0> er() {
        return (k70) zzceg.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new du0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzceg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzccg", "zzcch", c.DW(), "zzcef", b.DW()});
            case 4:
                return zzceg;
            case 5:
                k70<du0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (du0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzceg);
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
}
