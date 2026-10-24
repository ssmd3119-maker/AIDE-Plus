package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class ha implements s9 {
    private final ka DW;
    private final String EQ;
    private final Context FH;
    private x9 J0;
    private final long VH;
    private final boolean Ws;
    private final boolean Zo;
    private final long gn;
    private final zzasi j6;
    private final boolean tp;
    private final d0 u7;
    private final u9 v5;
    private final Object Hw = new Object();
    private boolean we = false;
    private List<aa> J8 = new ArrayList();

    public ha(Context context, zzasi zzasiVar, ka kaVar, u9 u9Var, boolean z, boolean z2, String str, long j, long j2, d0 d0Var, boolean z3) {
        this.FH = context;
        this.j6 = zzasiVar;
        this.DW = kaVar;
        this.v5 = u9Var;
        this.Zo = z;
        this.tp = z2;
        this.EQ = str;
        this.VH = j;
        this.gn = j2;
        this.u7 = d0Var;
        this.Ws = z3;
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final List<aa> DW() {
        return this.J8;
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final void cancel() {
        synchronized (this.Hw) {
            this.we = true;
            if (this.J0 != null) {
                this.J0.FH();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:50:0x0172
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.google.android.gms.internal.ads.s9
    public final com.google.android.gms.internal.ads.aa j6(java.util.List<com.google.android.gms.internal.ads.t9> r32) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ha.j6(java.util.List):com.google.android.gms.internal.ads.aa");
    }
}
