package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class qo extends tk {
    private final /* synthetic */ Map Jl;
    private final /* synthetic */ qp iW;
    private final /* synthetic */ byte[] kf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    qo(zzazs zzazsVar, int i, String str, iy0 iy0Var, jx0 jx0Var, byte[] bArr, Map map, qp qpVar) {
        super(i, str, iy0Var, jx0Var);
        this.kf = bArr;
        this.Jl = map;
        this.iW = qpVar;
    }

    @Override // com.google.android.gms.internal.ads.bq0
    public final Map<String, String> j6() {
        Map<String, String> map = this.Jl;
        return map == null ? super.j6() : map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.bq0
    /* renamed from: sG, reason: merged with bridge method [inline-methods] */
    public final void XL(String str) throws IOException {
        this.iW.aM(str);
        super.XL(str);
    }

    @Override // com.google.android.gms.internal.ads.bq0
    public final byte[] vy() {
        byte[] bArr = this.kf;
        return bArr == null ? super.vy() : bArr;
    }
}
