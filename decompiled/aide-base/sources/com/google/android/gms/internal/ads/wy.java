package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.h20;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class wy {
    public static final h20 DW;

    @Deprecated
    public static final h20 j6;

    static {
        h20.a aVarP8 = h20.P8();
        aVarP8.EQ(tz.j6);
        h20.a aVar = aVarP8;
        aVar.XL(fy.j6("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true));
        aVar.XL(fy.j6("TinkAead", "Aead", "AesEaxKey", 0, true));
        aVar.XL(fy.j6("TinkAead", "Aead", "AesGcmKey", 0, true));
        aVar.XL(fy.j6("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true));
        aVar.XL(fy.j6("TinkAead", "Aead", "KmsAeadKey", 0, true));
        aVar.XL(fy.j6("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true));
        aVar.j3("TINK_AEAD_1_0_0");
        j6 = (h20) ((r50) aVar.Mr());
        h20.a aVarP82 = h20.P8();
        aVarP82.EQ(j6);
        h20.a aVar2 = aVarP82;
        aVar2.j3("TINK_AEAD_1_1_0");
        h20.a aVarP83 = h20.P8();
        aVarP83.EQ(tz.DW);
        h20.a aVar3 = aVarP83;
        aVar3.XL(fy.j6("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true));
        aVar3.XL(fy.j6("TinkAead", "Aead", "AesEaxKey", 0, true));
        aVar3.XL(fy.j6("TinkAead", "Aead", "AesGcmKey", 0, true));
        aVar3.XL(fy.j6("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true));
        aVar3.XL(fy.j6("TinkAead", "Aead", "KmsAeadKey", 0, true));
        aVar3.XL(fy.j6("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true));
        aVar3.j3("TINK_AEAD");
        DW = (h20) ((r50) aVar3.Mr());
        try {
            j6();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void j6() throws GeneralSecurityException {
        tz.j6();
        ty.gn("TinkAead", new vy());
        fy.DW(DW);
    }
}
