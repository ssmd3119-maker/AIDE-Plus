package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class wt0 extends r50<wt0, b> implements b70 {
    private static volatile k70<wt0> zzcas;
    private static final wt0 zzccj;
    private int zzccg;
    private int zzcch;
    private hu0 zzcci;

    public enum a implements u50 {
        AD_FORMAT_TYPE_UNSPECIFIED(0),
        BANNER(1),
        INTERSTITIAL(2),
        NATIVE_EXPRESS(3),
        NATIVE_CONTENT(4),
        NATIVE_APP_INSTALL(5),
        NATIVE_CUSTOM_TEMPLATE(6),
        DFP_BANNER(7),
        DFP_INTERSTITIAL(8),
        REWARD_BASED_VIDEO_AD(9),
        BANNER_SEARCH_ADS(10);

        private final int WB;

        a(int i) {
            this.WB = i;
        }

        public static v50 DW() {
            return su0.j6;
        }

        public static a j6(int i) {
            switch (i) {
                case 0:
                    return AD_FORMAT_TYPE_UNSPECIFIED;
                case 1:
                    return BANNER;
                case 2:
                    return INTERSTITIAL;
                case 3:
                    return NATIVE_EXPRESS;
                case 4:
                    return NATIVE_CONTENT;
                case 5:
                    return NATIVE_APP_INSTALL;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    return NATIVE_CUSTOM_TEMPLATE;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    return DFP_BANNER;
                case 8:
                    return DFP_INTERSTITIAL;
                case 9:
                    return REWARD_BASED_VIDEO_AD;
                case 10:
                    return BANNER_SEARCH_ADS;
                default:
                    return null;
            }
        }

        @Override // com.google.android.gms.internal.ads.u50
        public final int Hw() {
            return this.WB;
        }
    }

    public static final class b extends r50.a<wt0, b> implements b70 {
        private b() {
            super(wt0.zzccj);
        }

        /* synthetic */ b(ru0 ru0Var) {
            this();
        }
    }

    static {
        wt0 wt0Var = new wt0();
        zzccj = wt0Var;
        r50.aM(wt0.class, wt0Var);
    }

    private wt0() {
    }

    public static k70<wt0> er() {
        return (k70) zzccj.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new wt0();
            case 2:
                return new b(ru0Var);
            case 3:
                return r50.Ws(zzccj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzccg", "zzcch", a.DW(), "zzcci"});
            case 4:
                return zzccj;
            case 5:
                k70<wt0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (wt0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzccj);
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
