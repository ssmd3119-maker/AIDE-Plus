package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

@jg
/* loaded from: classes.dex */
public final class qu extends fu implements qo0<xn0> {
    private final xt AL;
    private final Object cT;
    private String fY;
    private boolean hK;
    private boolean k2;
    private boolean q7;
    private final rs qp;
    private ByteBuffer w9;
    private final pu zh;

    public qu(ss ssVar, rs rsVar) {
        super(ssVar);
        this.qp = rsVar;
        this.zh = new pu();
        this.AL = new xt();
        this.cT = new Object();
    }

    private final void yS() {
        int iDW = (int) this.zh.DW();
        int iJ6 = (int) this.AL.j6(this.w9);
        int iRound = Math.round(iJ6 * (this.w9.position() / iDW));
        boolean z = iRound > 0;
        int iGW = mt.gW();
        int iBT = mt.BT();
        String str = this.fY;
        we(str, a8(str), iRound, iJ6, z, iGW, iBT);
    }

    @Override // com.google.android.gms.internal.ads.qo0
    public final /* synthetic */ void Hw(xn0 xn0Var, bo0 bo0Var) {
        xn0 xn0Var2 = xn0Var;
        if (xn0Var2 instanceof eo0) {
            this.zh.j6((eo0) xn0Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[Catch: Exception -> 0x0032, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0032, blocks: (B:5:0x0028, B:11:0x004b, B:17:0x0098, B:42:0x00ef, B:43:0x010a, B:45:0x010d, B:46:0x0130), top: B:66:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9 A[Catch: Exception -> 0x013c, TRY_ENTER, TryCatch #1 {Exception -> 0x013c, blocks: (B:3:0x000d, B:9:0x0035, B:12:0x004e, B:13:0x0086, B:19:0x00a9, B:20:0x00ab), top: B:61:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:? -> B:53:0x013a). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U2(java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qu.U2(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.qo0
    public final /* bridge */ /* synthetic */ void XL(xn0 xn0Var, int i) {
    }

    @Override // com.google.android.gms.internal.ads.fu
    protected final String a8(String str) {
        String strValueOf = String.valueOf(super.a8(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }

    public final String er() {
        return this.fY;
    }

    public final boolean gW() {
        return this.q7;
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void gn() {
        this.k2 = true;
    }

    public final ByteBuffer rN() {
        synchronized (this.cT) {
            if (this.w9 != null && !this.hK) {
                this.w9.flip();
                this.hK = true;
            }
            this.k2 = true;
        }
        return this.w9;
    }

    @Override // com.google.android.gms.internal.ads.qo0
    public final /* bridge */ /* synthetic */ void v5(xn0 xn0Var) {
    }
}
