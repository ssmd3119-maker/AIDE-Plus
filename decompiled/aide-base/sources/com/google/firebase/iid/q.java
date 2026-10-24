package com.google.firebase.iid;

import com.google.firebase.iid.Registrar;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements com.google.firebase.components.c {
    static final com.google.firebase.components.c j6 = new q();

    private q() {
    }

    @Override // com.google.firebase.components.c
    public final Object j6(com.google.firebase.components.b bVar) {
        return new Registrar.a((FirebaseInstanceId) bVar.j6(FirebaseInstanceId.class));
    }
}
