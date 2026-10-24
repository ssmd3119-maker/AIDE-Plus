package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class kz {
    static {
        Logger.getLogger(kz.class.getName());
    }

    public static jy j6(ly lyVar) throws GeneralSecurityException {
        qy qyVarJ6 = ty.j6(lyVar, null);
        Iterator it = qyVarJ6.Hw().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Collection) it.next()).iterator();
            while (it2.hasNext()) {
                if (!(((sy) it2.next()).j6() instanceof jy)) {
                    throw new GeneralSecurityException("invalid HybridEncrypt key material");
                }
            }
        }
        return new lz(qyVarJ6);
    }
}
