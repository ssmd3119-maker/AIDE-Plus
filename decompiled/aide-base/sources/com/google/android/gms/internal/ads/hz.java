package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.h20;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class hz {
    private static final h20 DW;

    @Deprecated
    public static final h20 j6;

    static {
        h20.a aVarP8 = h20.P8();
        aVarP8.EQ(wy.j6);
        h20.a aVar = aVarP8;
        aVar.XL(fy.j6("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true));
        aVar.XL(fy.j6("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true));
        aVar.j3("TINK_HYBRID_1_0_0");
        j6 = (h20) ((r50) aVar.Mr());
        h20.a aVarP82 = h20.P8();
        aVarP82.EQ(j6);
        h20.a aVar2 = aVarP82;
        aVar2.j3("TINK_HYBRID_1_1_0");
        h20.a aVarP83 = h20.P8();
        aVarP83.EQ(wy.DW);
        h20.a aVar3 = aVarP83;
        aVar3.XL(fy.j6("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true));
        aVar3.XL(fy.j6("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true));
        aVar3.j3("TINK_HYBRID");
        DW = (h20) ((r50) aVar3.Mr());
        try {
            wy.j6();
            ty.gn("TinkHybridEncrypt", new jz());
            ty.gn("TinkHybridDecrypt", new iz());
            fy.DW(DW);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
