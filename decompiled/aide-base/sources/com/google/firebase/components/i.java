package com.google.firebase.components;

import abcd.nx;

/* loaded from: classes.dex */
public abstract class i implements b {
    i() {
    }

    @Override // com.google.firebase.components.b
    public <T> T j6(Class<T> cls) {
        nx<T> nxVarDW = DW(cls);
        if (nxVarDW == null) {
            return null;
        }
        return nxVarDW.get();
    }
}
