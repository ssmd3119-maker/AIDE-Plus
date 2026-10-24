package com.google.firebase.components;

import abcd.nx;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements nx {
    private final b DW;
    private final c j6;

    private r(c cVar, b bVar) {
        this.j6 = cVar;
        this.DW = bVar;
    }

    public static nx j6(c cVar, b bVar) {
        return new r(cVar, bVar);
    }

    @Override // abcd.nx
    public final Object get() {
        return this.j6.j6(this.DW);
    }
}
