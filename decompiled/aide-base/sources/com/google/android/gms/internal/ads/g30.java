package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class g30 implements b30<Mac> {
    @Override // com.google.android.gms.internal.ads.b30
    public final /* synthetic */ Mac j6(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
