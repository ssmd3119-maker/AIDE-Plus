package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@jg
/* loaded from: classes.dex */
public final class go extends b8 {
    private final Context Hw;

    private go(Context context, yf yfVar) {
        super(yfVar);
        this.Hw = context;
    }

    public static tu0 Hw(Context context) {
        tu0 tu0Var = new tu0(new eb(new File(context.getCacheDir(), "admob_volley"), 20971520), new go(context, new zg()));
        tu0Var.j6();
        return tu0Var;
    }

    @Override // com.google.android.gms.internal.ads.b8, com.google.android.gms.internal.ads.zk0
    public final co0 j6(bq0<?> bq0Var) throws e3 {
        if (bq0Var.KD() && bq0Var.DW() == 0) {
            if (Pattern.matches((String) cw0.v5().FH(p.iK), bq0Var.FH())) {
                cw0.j6();
                if (mp.a8(this.Hw, 13400000)) {
                    co0 co0VarJ6 = new zzaft(this.Hw).j6(bq0Var);
                    if (co0VarJ6 != null) {
                        String strValueOf = String.valueOf(bq0Var.FH());
                        sm.we(strValueOf.length() != 0 ? "Got gmscore asset response: ".concat(strValueOf) : new String("Got gmscore asset response: "));
                        return co0VarJ6;
                    }
                    String strValueOf2 = String.valueOf(bq0Var.FH());
                    sm.we(strValueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(strValueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.j6(bq0Var);
    }
}
