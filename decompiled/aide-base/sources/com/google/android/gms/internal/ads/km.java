package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class km {

    @GuardedBy("this")
    private BigInteger j6 = BigInteger.ONE;

    @GuardedBy("this")
    private String DW = "0";

    public final synchronized String DW() {
        return this.DW;
    }

    public final synchronized String j6() {
        String string;
        string = this.j6.toString();
        this.j6 = this.j6.add(BigInteger.ONE);
        this.DW = string;
        return string;
    }
}
