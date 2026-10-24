package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes.dex */
public class uo extends ja0 implements Closeable {
    static {
        sa0.DW(uo.class);
    }

    public uo(ma0 ma0Var, un unVar) {
        Hw(ma0Var, ma0Var.size(), unVar);
    }

    @Override // com.google.android.gms.internal.ads.ja0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mb.close();
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public String toString() {
        String string = this.mb.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
