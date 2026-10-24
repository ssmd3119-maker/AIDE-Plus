package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@jg
/* loaded from: classes.dex */
public final class fy0 {
    private final String DW;
    private final com.google.android.gms.ads.search.a EQ;
    private final int FH;
    private final Set<String> Hw;
    private final Set<String> J0;
    private final Bundle J8;
    private final boolean QX;
    private final Bundle VH;
    private final Set<String> Ws;
    private final int XL;
    private final boolean Zo;
    private final String aM;
    private final Map<Class<? extends Object>, Object> gn;
    private final Date j6;
    private final String tp;
    private final String u7;
    private final Location v5;
    private final int we;

    public fy0(gy0 gy0Var) {
        this(gy0Var, null);
    }

    public final String DW() {
        return this.DW;
    }

    public final boolean EQ(Context context) {
        Set<String> set = this.J0;
        cw0.j6();
        return set.contains(mp.Ws(context));
    }

    public final Bundle FH() {
        return this.J8;
    }

    @Deprecated
    public final int Hw() {
        return this.FH;
    }

    public final com.google.android.gms.ads.search.a J0() {
        return this.EQ;
    }

    public final Map<Class<? extends Object>, Object> J8() {
        return this.gn;
    }

    public final int QX() {
        return this.we;
    }

    public final boolean VH() {
        return this.Zo;
    }

    public final Bundle Ws() {
        return this.VH;
    }

    public final Set<String> XL() {
        return this.Ws;
    }

    public final Location Zo() {
        return this.v5;
    }

    public final int aM() {
        return this.XL;
    }

    public final Bundle gn(Class<? extends com.google.android.gms.ads.mediation.b> cls) {
        return this.VH.getBundle(cls.getName());
    }

    public final String j3() {
        return this.aM;
    }

    @Deprecated
    public final Date j6() {
        return this.j6;
    }

    @Deprecated
    public final boolean tp() {
        return this.QX;
    }

    public final String u7() {
        return this.u7;
    }

    public final Set<String> v5() {
        return this.Hw;
    }

    public final String we() {
        return this.tp;
    }

    public fy0(gy0 gy0Var, com.google.android.gms.ads.search.a aVar) {
        this.j6 = gy0Var.VH;
        this.DW = gy0Var.gn;
        this.FH = gy0Var.u7;
        this.Hw = Collections.unmodifiableSet(gy0Var.j6);
        this.v5 = gy0Var.tp;
        this.Zo = gy0Var.EQ;
        this.VH = gy0Var.DW;
        this.gn = Collections.unmodifiableMap(gy0Var.FH);
        this.u7 = gy0Var.we;
        this.tp = gy0Var.J0;
        this.EQ = aVar;
        this.we = gy0Var.J8;
        this.J0 = Collections.unmodifiableSet(gy0Var.Hw);
        this.J8 = gy0Var.v5;
        this.Ws = Collections.unmodifiableSet(gy0Var.Zo);
        this.QX = gy0Var.Ws;
        this.XL = gy0Var.QX;
        this.aM = gy0Var.XL;
    }
}
