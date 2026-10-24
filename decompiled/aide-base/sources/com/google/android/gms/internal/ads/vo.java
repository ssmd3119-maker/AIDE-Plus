package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class vo extends bq0<co0> {
    private final qp Q6;
    private final fr<co0> n5;

    public vo(String str, fr<co0> frVar) {
        this(str, null, frVar);
    }

    @Override // com.google.android.gms.internal.ads.bq0
    protected final /* synthetic */ void XL(co0 co0Var) throws IOException {
        co0 co0Var2 = co0Var;
        this.Q6.tp(co0Var2.FH, co0Var2.j6);
        qp qpVar = this.Q6;
        byte[] bArr = co0Var2.DW;
        if (qp.j6() && bArr != null) {
            qpVar.U2(bArr);
        }
        this.n5.FH(co0Var2);
    }

    @Override // com.google.android.gms.internal.ads.bq0
    protected final iw0<co0> we(co0 co0Var) {
        return iw0.j6(co0Var, wd.j6(co0Var));
    }

    private vo(String str, Map<String, String> map, fr<co0> frVar) throws IOException {
        super(0, str, new wo(frVar));
        this.n5 = frVar;
        qp qpVar = new qp();
        this.Q6 = qpVar;
        qpVar.Zo(str, "GET", null, null);
    }
}
