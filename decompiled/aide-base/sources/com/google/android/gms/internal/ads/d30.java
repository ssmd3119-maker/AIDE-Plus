package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public final class d30 implements b30<KeyAgreement> {
    @Override // com.google.android.gms.internal.ads.b30
    public final /* synthetic */ KeyAgreement j6(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
