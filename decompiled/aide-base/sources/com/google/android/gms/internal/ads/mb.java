package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.formats.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@jg
/* loaded from: classes.dex */
public final class mb implements com.google.android.gms.ads.mediation.i {
    private final int DW;
    private final Set<String> FH;
    private final boolean Hw;
    private final zzacp VH;
    private final int Zo;
    private final Date j6;
    private final boolean u7;
    private final Location v5;
    private final List<String> gn = new ArrayList();
    private final Map<String, Boolean> tp = new HashMap();

    public mb(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzacp zzacpVar, List<String> list, boolean z2) {
        this.j6 = date;
        this.DW = i;
        this.FH = set;
        this.v5 = location;
        this.Hw = z;
        this.Zo = i2;
        this.VH = zzacpVar;
        this.u7 = z2;
        if (list != null) {
            for (String str : list) {
                if (str.startsWith("custom:")) {
                    String[] strArrSplit = str.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.tp.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.tp.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.gn.add(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.a
    @Deprecated
    public final boolean DW() {
        return this.u7;
    }

    @Override // com.google.android.gms.ads.mediation.i
    public final com.google.android.gms.ads.formats.b EQ() {
        zzzw zzzwVar;
        if (this.VH == null) {
            return null;
        }
        b.a aVar = new b.a();
        aVar.v5(this.VH.mb);
        aVar.FH(this.VH.jw);
        aVar.Hw(this.VH.fY);
        zzacp zzacpVar = this.VH;
        if (zzacpVar.WB >= 2) {
            aVar.DW(zzacpVar.qp);
        }
        zzacp zzacpVar2 = this.VH;
        if (zzacpVar2.WB >= 3 && (zzzwVar = zzacpVar2.k2) != null) {
            aVar.Zo(new com.google.android.gms.ads.h(zzzwVar));
        }
        return aVar.j6();
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

    @Override // com.google.android.gms.ads.mediation.i
    public final boolean J0() {
        List<String> list = this.gn;
        if (list != null) {
            return list.contains("1") || this.gn.contains("6");
        }
        return false;
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

    @Override // com.google.android.gms.ads.mediation.i
    public final Map<String, Boolean> gn() {
        return this.tp;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final int j6() {
        return this.Zo;
    }

    @Override // com.google.android.gms.ads.mediation.i
    public final boolean tp() {
        List<String> list = this.gn;
        if (list != null) {
            return list.contains("2") || this.gn.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.i
    public final boolean u7() {
        List<String> list = this.gn;
        return list != null && list.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final Set<String> v5() {
        return this.FH;
    }

    @Override // com.google.android.gms.ads.mediation.i
    public final boolean we() {
        List<String> list = this.gn;
        return list != null && list.contains("3");
    }
}
