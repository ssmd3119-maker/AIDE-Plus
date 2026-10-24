package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.h20;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class tz {
    public static final h20 DW;

    @Deprecated
    public static final h20 j6;

    static {
        h20.a aVarP8 = h20.P8();
        aVarP8.j3("TINK_MAC_1_0_0");
        aVarP8.XL(fy.j6("TinkMac", "Mac", "HmacKey", 0, true));
        j6 = (h20) ((r50) aVarP8.Mr());
        h20.a aVarP82 = h20.P8();
        aVarP82.EQ(j6);
        h20.a aVar = aVarP82;
        aVar.j3("TINK_MAC_1_1_0");
        h20.a aVarP83 = h20.P8();
        aVarP83.EQ(j6);
        h20.a aVar2 = aVarP83;
        aVar2.j3("TINK_MAC");
        DW = (h20) ((r50) aVar2.Mr());
        try {
            j6();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void j6() throws GeneralSecurityException {
        ty.gn("TinkMac", new rz());
        fy.DW(DW);
    }
}
