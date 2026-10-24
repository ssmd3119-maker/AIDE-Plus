package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.u10;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class ty {
    private static final Logger j6 = Logger.getLogger(ty.class.getName());
    private static final ConcurrentMap<String, ky> DW = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> FH = new ConcurrentHashMap();
    private static final ConcurrentMap<String, ey> Hw = new ConcurrentHashMap();

    public static synchronized <P> m10 DW(q10 q10Var) {
        ky kyVarWe;
        kyVarWe = we(q10Var.er());
        if (!FH.get(q10Var.er()).booleanValue()) {
            String strValueOf = String.valueOf(q10Var.er());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return kyVarWe.FH(q10Var.yS());
    }

    public static <P> ey<P> EQ(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ey<P> eyVar = Hw.get(str.toLowerCase());
        if (eyVar != null) {
            return eyVar;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase().startsWith("tinkaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkmac")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase().startsWith("tink")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(strConcat);
    }

    public static synchronized <P> z60 FH(String str, z60 z60Var) {
        ky kyVarWe;
        kyVarWe = we(str);
        if (!FH.get(str).booleanValue()) {
            String strValueOf = String.valueOf(str);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return kyVarWe.Zo(z60Var);
    }

    private static <P> P Hw(String str, i40 i40Var) {
        return (P) we(str).Hw(i40Var);
    }

    public static synchronized <P> void VH(ky<P> kyVar, boolean z) {
        if (kyVar == null) {
            throw new IllegalArgumentException("key manager must be non-null.");
        }
        String strDW = kyVar.DW();
        if (DW.containsKey(strDW)) {
            ky kyVarWe = we(strDW);
            boolean zBooleanValue = FH.get(strDW).booleanValue();
            if (!kyVar.getClass().equals(kyVarWe.getClass()) || (!zBooleanValue && z)) {
                Logger logger = j6;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(strDW);
                logger.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", strValueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(strValueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strDW, kyVarWe.getClass().getName(), kyVar.getClass().getName()));
            }
        }
        DW.put(strDW, kyVar);
        FH.put(strDW, Boolean.valueOf(z));
    }

    public static synchronized <P> void Zo(ky<P> kyVar) {
        VH(kyVar, true);
    }

    public static synchronized <P> void gn(String str, ey<P> eyVar) {
        if (Hw.containsKey(str.toLowerCase())) {
            if (!eyVar.getClass().equals(Hw.get(str.toLowerCase()).getClass())) {
                Logger logger = j6;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(str);
                logger.logp(level, "com.google.crypto.tink.Registry", "addCatalogue", strValueOf.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(strValueOf) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                sb.append("catalogue for name ");
                sb.append(str);
                sb.append(" has been already registered");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        Hw.put(str.toLowerCase(), eyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <P> qy<P> j6(ly lyVar, ky<P> kyVar) throws GeneralSecurityException {
        uy.DW(lyVar.DW());
        qy<P> qyVar = (qy<P>) new qy();
        for (u10.b bVar : lyVar.DW().yS()) {
            if (bVar.gW() == o10.ENABLED) {
                sy syVarJ6 = qyVar.j6(Hw(bVar.yS().ei(), bVar.yS().nw()), bVar);
                if (bVar.BT() == lyVar.DW().er()) {
                    qyVar.DW(syVarJ6);
                }
            }
        }
        return qyVar;
    }

    public static <P> P tp(String str, z60 z60Var) {
        return (P) we(str).j6(z60Var);
    }

    public static synchronized <P> z60 u7(q10 q10Var) {
        ky kyVarWe;
        kyVarWe = we(q10Var.er());
        if (!FH.get(q10Var.er()).booleanValue()) {
            String strValueOf = String.valueOf(q10Var.er());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return kyVarWe.v5(q10Var.yS());
    }

    public static <P> P v5(String str, byte[] bArr) {
        return (P) Hw(str, i40.lg(bArr));
    }

    private static <P> ky<P> we(String str) throws GeneralSecurityException {
        ky<P> kyVar = DW.get(str);
        if (kyVar != null) {
            return kyVar;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
        sb.append("No key manager found for key type: ");
        sb.append(str);
        sb.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(sb.toString());
    }
}
