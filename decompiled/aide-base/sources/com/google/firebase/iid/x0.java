package com.google.firebase.iid;

import android.util.Base64;
import java.security.KeyPair;

/* loaded from: classes.dex */
public final class x0 {
    private final long DW;
    private final KeyPair j6;

    x0(KeyPair keyPair, long j) {
        this.j6 = keyPair;
        this.DW = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Zo() {
        return Base64.encodeToString(this.j6.getPrivate().getEncoded(), 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String v5() {
        return Base64.encodeToString(this.j6.getPublic().getEncoded(), 11);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.DW == x0Var.DW && this.j6.getPublic().equals(x0Var.j6.getPublic()) && this.j6.getPrivate().equals(x0Var.j6.getPrivate());
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.o.DW(this.j6.getPublic(), this.j6.getPrivate(), Long.valueOf(this.DW));
    }

    final KeyPair j6() {
        return this.j6;
    }
}
