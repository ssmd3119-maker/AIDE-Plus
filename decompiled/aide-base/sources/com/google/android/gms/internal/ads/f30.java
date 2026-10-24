package com.google.android.gms.internal.ads;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes.dex */
public final class f30 implements b30<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.ads.b30
    public final /* synthetic */ KeyPairGenerator j6(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
