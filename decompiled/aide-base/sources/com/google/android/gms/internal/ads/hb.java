package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

@jg
/* loaded from: classes.dex */
public final class hb implements com.google.android.gms.ads.mediation.a {
    private final int DW;
    private final Set<String> FH;
    private final boolean Hw;
    private final boolean VH;
    private final int Zo;
    private final Date j6;
    private final Location v5;

    public hb(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2) {
        this.j6 = date;
        this.DW = i;
        this.FH = set;
        this.v5 = location;
        this.Hw = z;
        this.Zo = i2;
        this.VH = z2;
    }

    @Override // com.google.android.gms.ads.mediation.a
    @Deprecated
    public final boolean DW() {
        return this.VH;
    }

    @Override // com.google.android.gms.ads.mediation.a
    @Deprecated
    public final Date FH() {
        return this.j6;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final boolean Hw() {
        return this.Hw;
    }

    @Override // com.google.android.gms.ads.mediation.a
    @Deprecated
    public final int VH() {
        return this.DW;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final Location Zo() {
        return this.v5;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final int j6() {
        return this.Zo;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final Set<String> v5() {
        return this.FH;
    }
}
