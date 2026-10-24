package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class c30 implements b30<Cipher> {
    @Override // com.google.android.gms.internal.ads.b30
    public final /* synthetic */ Cipher j6(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
