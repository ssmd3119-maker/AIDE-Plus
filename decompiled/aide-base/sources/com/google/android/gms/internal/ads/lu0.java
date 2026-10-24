package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class lu0 extends r50<lu0, a> implements b70 {
    private static volatile k70<lu0> zzcas;
    private static final lu0 zzcfx;
    private int zzccg;
    private int zzcfw;

    public static final class a extends r50.a<lu0, a> implements b70 {
        private a() {
            super(lu0.zzcfx);
        }

        /* synthetic */ a(ru0 ru0Var) {
            this();
        }
    }

    public enum b implements u50 {
        VIDEO_ERROR_CODE_UNSPECIFIED(0),
        OPENGL_RENDERING_FAILED(1),
        CACHE_LOAD_FAILED(2),
        ANDROID_TARGET_API_TOO_LOW(3);

        private final int WB;

        b(int i) {
            this.WB = i;
        }

        public static v50 DW() {
            return yu0.j6;
        }

        public static b j6(int i) {
            if (i == 0) {
                return VIDEO_ERROR_CODE_UNSPECIFIED;
            }
            if (i == 1) {
                return OPENGL_RENDERING_FAILED;
            }
            if (i == 2) {
                return CACHE_LOAD_FAILED;
            }
            if (i != 3) {
                return null;
            }
            return ANDROID_TARGET_API_TOO_LOW;
        }

        @Override // com.google.android.gms.internal.ads.u50
        public final int Hw() {
            return this.WB;
        }
    }

    static {
        lu0 lu0Var = new lu0();
        zzcfx = lu0Var;
        r50.aM(lu0.class, lu0Var);
    }

    private lu0() {
    }

    public static k70<lu0> er() {
        return (k70) zzcfx.J8(r50.e.VH, null, null);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        ru0 ru0Var = null;
        switch (ru0.j6[i - 1]) {
            case 1:
                return new lu0();
            case 2:
                return new a(ru0Var);
            case 3:
                return r50.Ws(zzcfx, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"zzccg", "zzcfw", b.DW()});
            case 4:
                return zzcfx;
            case 5:
                k70<lu0> bVar = zzcas;
                if (bVar == null) {
                    synchronized (lu0.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzcfx);
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
