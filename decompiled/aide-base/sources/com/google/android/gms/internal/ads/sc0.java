package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class sc0 {
    static jy j6;

    static boolean j6(nc0 nc0Var) throws GeneralSecurityException {
        Method methodV5;
        jy jyVarJ6;
        if (j6 != null) {
            return true;
        }
        String str = (String) cw0.v5().FH(p.ce);
        if (str == null || str.length() == 0) {
            str = null;
            if (nc0Var != null && (methodV5 = nc0Var.v5("phpjyfBMe8u7C5auGMsy22WXoT6iMDb5qqttOP4sXOBlc73QdE1wdYLJ++PsHndY", "86B2wkBiSbEIJu45HO/BQ/RpWXZRq9YpFeIER87ao7I=")) != null) {
                str = (String) methodV5.invoke(null, new Object[0]);
            }
            if (str == null) {
                return false;
            }
        }
        try {
            ly lyVarJ6 = py.j6(p80.DW(str, true));
            fy.DW(hz.j6);
            jyVarJ6 = kz.j6(lyVarJ6);
            j6 = jyVarJ6;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return jyVarJ6 != null;
    }
}
