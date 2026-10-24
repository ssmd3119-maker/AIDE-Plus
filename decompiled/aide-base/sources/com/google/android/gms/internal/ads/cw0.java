package com.google.android.gms.internal.ads;

import java.util.Random;

@jg
/* loaded from: classes.dex */
public final class cw0 {
    private static cw0 u7 = new cw0();
    private final uv0 DW;
    private final String FH;
    private final k Hw;
    private final zzbbi VH;
    private final m Zo;
    private final Random gn;
    private final mp j6;
    private final l v5;

    protected cw0() {
        this(new mp(), new uv0(new mv0(), new lv0(), new ky0(), new f4(), new ak(), new yk(), new kd(), new g4()), new k(), new l(), new m(), mp.we(), new zzbbi(0, 14300000, true), new Random());
    }

    public static uv0 DW() {
        return u7.DW;
    }

    public static l FH() {
        return u7.v5;
    }

    public static k Hw() {
        return u7.Hw;
    }

    public static zzbbi VH() {
        return u7.VH;
    }

    public static String Zo() {
        return u7.FH;
    }

    public static Random gn() {
        return u7.gn;
    }

    public static mp j6() {
        return u7.j6;
    }

    public static m v5() {
        return u7.Zo;
    }

    private cw0(mp mpVar, uv0 uv0Var, k kVar, l lVar, m mVar, String str, zzbbi zzbbiVar, Random random) {
        this.j6 = mpVar;
        this.DW = uv0Var;
        this.Hw = kVar;
        this.v5 = lVar;
        this.Zo = mVar;
        this.FH = str;
        this.VH = zzbbiVar;
        this.gn = random;
    }
}
