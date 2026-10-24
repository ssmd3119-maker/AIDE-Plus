package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class p0 extends b2 {
    private final int AL;
    private final String WB;
    private final int fY;
    private final int k2;
    private final int qp;
    private final boolean w9;
    private final int zh;
    private static final int hK = Color.rgb(12, 174, 206);
    private static final int cT = Color.rgb(204, 204, 204);
    private static final int q7 = hK;
    private final List<u0> mb = new ArrayList();
    private final List<f2> jw = new ArrayList();

    public p0(String str, List<u0> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.WB = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                u0 u0Var = list.get(i3);
                this.mb.add(u0Var);
                this.jw.add(u0Var);
            }
        }
        this.fY = num != null ? num.intValue() : cT;
        this.qp = num2 != null ? num2.intValue() : q7;
        this.k2 = num3 != null ? num3.intValue() : 12;
        this.zh = i;
        this.AL = i2;
        this.w9 = z;
    }

    public final int CO() {
        return this.qp;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final List<f2> MH() {
        return this.jw;
    }

    public final int MU() {
        return this.k2;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final String OW() {
        return this.WB;
    }

    public final List<u0> UE() {
        return this.mb;
    }

    public final int d7() {
        return this.AL;
    }

    public final int k6() {
        return this.fY;
    }

    public final boolean nG() {
        return this.w9;
    }

    public final int tc() {
        return this.zh;
    }
}
