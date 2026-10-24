package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class ze implements fq<List<u0>, p0> {
    private final /* synthetic */ Integer DW;
    private final /* synthetic */ Integer FH;
    private final /* synthetic */ int Hw;
    private final /* synthetic */ int VH;
    private final /* synthetic */ int Zo;
    private final /* synthetic */ boolean gn;
    private final /* synthetic */ String j6;
    private final /* synthetic */ int v5;

    ze(te teVar, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.j6 = str;
        this.DW = num;
        this.FH = num2;
        this.Hw = i;
        this.v5 = i2;
        this.Zo = i3;
        this.VH = i4;
        this.gn = z;
    }

    @Override // com.google.android.gms.internal.ads.fq
    public final /* synthetic */ p0 j6(List<u0> list) {
        List<u0> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        String str = this.j6;
        Integer num = this.DW;
        Integer num2 = this.FH;
        int i = this.Hw;
        return new p0(str, list2, num, num2, i > 0 ? Integer.valueOf(i) : null, this.v5 + this.Zo, this.VH, this.gn);
    }
}
