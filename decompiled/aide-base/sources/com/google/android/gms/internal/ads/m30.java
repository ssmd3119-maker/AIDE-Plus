package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class m30 extends ThreadLocal<SecureRandom> {
    m30() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        return l30.j6();
    }
}
