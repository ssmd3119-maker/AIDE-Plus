package com.google.firebase.components;

import abcd.ix;
import abcd.jx;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    private final Map.Entry WB;
    private final ix mb;

    private p(Map.Entry entry, ix ixVar) {
        this.WB = entry;
        this.mb = ixVar;
    }

    public static Runnable j6(Map.Entry entry, ix ixVar) {
        return new p(entry, ixVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((jx) this.WB.getKey()).j6(this.mb);
    }
}
