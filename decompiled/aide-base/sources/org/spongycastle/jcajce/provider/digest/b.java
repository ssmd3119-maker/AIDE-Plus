package org.spongycastle.jcajce.provider.digest;

import abcd.cp0;
import abcd.fp0;
import abcd.vh0;

/* loaded from: classes.dex */
public abstract class b extends fp0 {
    b() {
    }

    protected void DW(cp0 cp0Var, String str, vh0 vh0Var) {
        String str2 = "HMAC" + str;
        cp0Var.j6("Alg.Alias.Mac." + vh0Var, str2);
        cp0Var.j6("Alg.Alias.KeyGenerator." + vh0Var, str2);
    }

    protected void j6(cp0 cp0Var, String str, String str2, String str3) {
        String str4 = "HMAC" + str;
        cp0Var.j6("Mac." + str4, str2);
        cp0Var.j6("Alg.Alias.Mac.HMAC-" + str, str4);
        cp0Var.j6("Alg.Alias.Mac.HMAC/" + str, str4);
        cp0Var.j6("KeyGenerator." + str4, str3);
        cp0Var.j6("Alg.Alias.KeyGenerator.HMAC-" + str, str4);
        cp0Var.j6("Alg.Alias.KeyGenerator.HMAC/" + str, str4);
    }
}
