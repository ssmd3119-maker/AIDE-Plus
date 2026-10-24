package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.b30;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class a30<T_WRAPPER extends b30<T_ENGINE>, T_ENGINE> {
    private static final Logger Hw = Logger.getLogger(a30.class.getName());
    public static final a30<g30, Mac> VH;
    public static final a30<c30, Cipher> Zo;
    public static final a30<d30, KeyAgreement> gn;
    public static final a30<e30, KeyFactory> tp;
    public static final a30<f30, KeyPairGenerator> u7;
    private static final List<Provider> v5;
    private List<Provider> DW = v5;
    private boolean FH = true;
    private T_WRAPPER j6;

    static {
        if (q30.j6()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    Hw.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            v5 = arrayList;
        } else {
            v5 = new ArrayList();
        }
        Zo = new a30<>(new c30());
        VH = new a30<>(new g30());
        gn = new a30<>(new d30());
        u7 = new a30<>(new f30());
        tp = new a30<>(new e30());
    }

    private a30(T_WRAPPER t_wrapper) {
        this.j6 = t_wrapper;
    }

    private final boolean j6(String str, Provider provider) {
        try {
            this.j6.j6(str, provider);
            return true;
        } catch (Exception e) {
            s30.FH(e);
            return false;
        }
    }

    public final T_ENGINE DW(String str) throws GeneralSecurityException {
        for (Provider provider : this.DW) {
            if (j6(str, provider)) {
                return (T_ENGINE) this.j6.j6(str, provider);
            }
        }
        if (this.FH) {
            return (T_ENGINE) this.j6.j6(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }
}
