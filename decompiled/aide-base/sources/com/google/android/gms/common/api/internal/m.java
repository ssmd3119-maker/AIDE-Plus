package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.a;

/* loaded from: classes.dex */
public final class m implements a.InterfaceC0109a {
    private final /* synthetic */ b j6;

    m(b bVar) {
        this.j6 = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0109a
    public final void j6(boolean z) {
        this.j6.q7.sendMessage(this.j6.q7.obtainMessage(1, Boolean.valueOf(z)));
    }
}
