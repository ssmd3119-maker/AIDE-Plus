package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class gy0 {
    private String J0;
    private Date VH;
    private boolean Ws;
    private String XL;
    private String gn;
    private Location tp;
    private String we;
    private final HashSet<String> j6 = new HashSet<>();
    private final Bundle DW = new Bundle();
    private final HashMap<Class<? extends Object>, Object> FH = new HashMap<>();
    private final HashSet<String> Hw = new HashSet<>();
    private final Bundle v5 = new Bundle();
    private final HashSet<String> Zo = new HashSet<>();
    private int u7 = -1;
    private boolean EQ = false;
    private int J8 = -1;
    private int QX = -1;

    public final void DW(Class<? extends com.google.android.gms.ads.mediation.b> cls, Bundle bundle) {
        this.DW.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    public final void FH(Date date) {
        this.VH = date;
    }

    public final void VH(String str) {
        this.Hw.add(str);
    }

    public final void Zo(String str) {
        this.j6.add(str);
    }

    public final void er(boolean z) {
        this.J8 = z ? 1 : 0;
    }

    public final void gn(String str) {
        this.Hw.remove(str);
    }

    @Deprecated
    public final void tp(int i) {
        this.u7 = i;
    }

    public final void v5(Location location) {
        this.tp = location;
    }

    @Deprecated
    public final void yS(boolean z) {
        this.Ws = z;
    }
}
