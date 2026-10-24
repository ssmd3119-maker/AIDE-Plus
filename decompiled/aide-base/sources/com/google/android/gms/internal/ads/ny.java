package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ny {
    private static final CopyOnWriteArrayList<my> j6 = new CopyOnWriteArrayList<>();

    public static my j6(String str) throws GeneralSecurityException {
        Iterator<my> it = j6.iterator();
        while (it.hasNext()) {
            my next = it.next();
            if (next.DW(str)) {
                return next;
            }
        }
        String strValueOf = String.valueOf(str);
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "No KMS client does support: ".concat(strValueOf) : new String("No KMS client does support: "));
    }
}
