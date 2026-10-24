package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.w10;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class uy {
    static {
        Charset.forName("UTF-8");
    }

    public static void DW(u10 u10Var) throws GeneralSecurityException {
        if (u10Var.gW() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        int iEr = u10Var.er();
        boolean z = false;
        boolean z2 = true;
        for (u10.b bVar : u10Var.yS()) {
            if (!bVar.er()) {
                throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(bVar.BT())));
            }
            if (bVar.P8() == g20.UNKNOWN_PREFIX) {
                throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(bVar.BT())));
            }
            if (bVar.gW() == o10.UNKNOWN_STATUS) {
                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(bVar.BT())));
            }
            if (bVar.gW() == o10.ENABLED && bVar.BT() == iEr) {
                if (z) {
                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                }
                z = true;
            }
            if (bVar.yS().SI() != m10.b.ASYMMETRIC_PUBLIC) {
                z2 = false;
            }
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }

    public static w10 j6(u10 u10Var) {
        w10.a aVarBT = w10.BT();
        aVarBT.j3(u10Var.er());
        for (u10.b bVar : u10Var.yS()) {
            w10.b.a aVarNw = w10.b.nw();
            aVarNw.lg(bVar.yS().ei());
            aVarNw.XL(bVar.gW());
            aVarNw.j3(bVar.P8());
            aVarNw.U2(bVar.BT());
            aVarBT.XL((w10.b) ((r50) aVarNw.Mr()));
        }
        return (w10) ((r50) aVarBT.Mr());
    }
}
