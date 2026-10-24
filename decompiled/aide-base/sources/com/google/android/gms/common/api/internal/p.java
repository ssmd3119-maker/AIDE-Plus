package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.c;

/* loaded from: classes.dex */
public final class p implements c.e {
    final /* synthetic */ b.a j6;

    p(b.a aVar) {
        this.j6 = aVar;
    }

    @Override // com.google.android.gms.common.internal.c.e
    public final void j6() {
        b.this.q7.post(new q(this));
    }
}
