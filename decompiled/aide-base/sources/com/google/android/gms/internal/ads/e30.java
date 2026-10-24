package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes.dex */
public final class e30 implements b30<KeyFactory> {
    @Override // com.google.android.gms.internal.ads.b30
    public final /* synthetic */ KeyFactory j6(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
