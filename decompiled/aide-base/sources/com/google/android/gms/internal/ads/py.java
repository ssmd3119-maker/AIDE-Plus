package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.u10;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class py {
    @Deprecated
    public static final ly j6(byte[] bArr) throws GeneralSecurityException {
        try {
            u10 u10VarP8 = u10.P8(bArr);
            for (u10.b bVar : u10VarP8.yS()) {
                if (bVar.yS().SI() == m10.b.UNKNOWN_KEYMATERIAL || bVar.yS().SI() == m10.b.SYMMETRIC || bVar.yS().SI() == m10.b.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return ly.j6(u10VarP8);
        } catch (y50 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
