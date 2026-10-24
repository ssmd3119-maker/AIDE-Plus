package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class m6 {
    private h5 FH;
    private final Map<n6, o6> j6 = new HashMap();
    private final LinkedList<n6> DW = new LinkedList<>();

    private static zzwb EQ(zzwb zzwbVar) {
        zzwb zzwbVarWe = we(zzwbVar);
        for (String str : ((String) cw0.v5().FH(p.hK)).split(",")) {
            Hw(zzwbVarWe.Z1, str);
            if (str.startsWith("com.google.ads.mediation.admob.AdMobAdapter/")) {
                Hw(zzwbVarWe.jw, str.replaceFirst("com.google.ads.mediation.admob.AdMobAdapter/", ""));
            }
        }
        return zzwbVarWe;
    }

    private static void FH(String str, n6 n6Var) {
        if (xp.DW(2)) {
            sm.we(String.format(str, n6Var));
        }
    }

    private static void Hw(Bundle bundle, String str) {
        while (true) {
            String[] strArrSplit = str.split("/", 2);
            if (strArrSplit.length == 0) {
                return;
            }
            String str2 = strArrSplit[0];
            if (strArrSplit.length == 1) {
                bundle.remove(str2);
                return;
            }
            bundle = bundle.getBundle(str2);
            if (bundle == null) {
                return;
            } else {
                str = strArrSplit[1];
            }
        }
    }

    private final String J8() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<n6> it = this.DW.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(it.next().toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    private static boolean VH(String str) {
        try {
            return Pattern.matches((String) cw0.v5().FH(p.n5), str);
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.w0.u7().v5(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    private static String[] Zo(String str) {
        try {
            String[] strArrSplit = str.split("\u0000");
            for (int i = 0; i < strArrSplit.length; i++) {
                strArrSplit[i] = new String(Base64.decode(strArrSplit[i], 0), "UTF-8");
            }
            return strArrSplit;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    private static String gn(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            return matcher.matches() ? matcher.group(1) : str;
        } catch (RuntimeException unused) {
            return str;
        }
    }

    static zzwb tp(zzwb zzwbVar) {
        zzwb zzwbVarWe = we(zzwbVar);
        Bundle bundle = zzwbVarWe.Z1.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean("_skipMediation", true);
        }
        zzwbVarWe.jw.putBoolean("_skipMediation", true);
        return zzwbVarWe;
    }

    static Set<String> u7(zzwb zzwbVar) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(zzwbVar.jw.keySet());
        Bundle bundle = zzwbVar.Z1.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    private static zzwb we(zzwb zzwbVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzwbVar.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        zzwb zzwbVarCreateFromParcel = zzwb.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return zzwbVarCreateFromParcel.gn();
    }

    final void DW(h5 h5Var) {
        if (this.FH == null) {
            h5 h5VarHw = h5Var.Hw();
            this.FH = h5VarHw;
            if (h5VarHw != null) {
                SharedPreferences sharedPreferences = h5VarHw.j6().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.DW.size() > 0) {
                    n6 n6VarRemove = this.DW.remove();
                    o6 o6Var = this.j6.get(n6VarRemove);
                    FH("Flushing interstitial queue for %s.", n6VarRemove);
                    while (o6Var.FH() > 0) {
                        o6Var.gn(null).j6.Qv();
                    }
                    this.j6.remove(n6VarRemove);
                }
                try {
                    HashMap map = new HashMap();
                    for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                        if (!entry.getKey().equals("PoolKeys")) {
                            s6 s6VarJ6 = s6.j6((String) entry.getValue());
                            n6 n6Var = new n6(s6VarJ6.j6, s6VarJ6.DW, s6VarJ6.FH);
                            if (!this.j6.containsKey(n6Var)) {
                                this.j6.put(n6Var, new o6(s6VarJ6.j6, s6VarJ6.DW, s6VarJ6.FH));
                                map.put(n6Var.toString(), n6Var);
                                FH("Restored interstitial queue for %s.", n6Var);
                            }
                        }
                    }
                    for (String str : Zo(sharedPreferences.getString("PoolKeys", ""))) {
                        n6 n6Var2 = (n6) map.get(str);
                        if (this.j6.containsKey(n6Var2)) {
                            this.DW.add(n6Var2);
                        }
                    }
                } catch (IOException | RuntimeException e) {
                    com.google.android.gms.ads.internal.w0.u7().v5(e, "InterstitialAdPool.restore");
                    xp.v5("Malformed preferences value for InterstitialAdPool.", e);
                    this.j6.clear();
                    this.DW.clear();
                }
            }
        }
    }

    final void J0() {
        int iFH;
        int iTp;
        if (this.FH == null) {
            return;
        }
        for (Map.Entry<n6, o6> entry : this.j6.entrySet()) {
            n6 key = entry.getKey();
            o6 value = entry.getValue();
            if (xp.DW(2) && (iTp = value.tp()) < (iFH = value.FH())) {
                sm.we(String.format("Loading %s/%s pooled interstitials for %s.", Integer.valueOf(iFH - iTp), Integer.valueOf(iFH), key));
            }
            int iEQ = value.EQ() + 0;
            while (value.FH() < ((Integer) cw0.v5().FH(p.q7)).intValue()) {
                FH("Pooling and loading one new interstitial for %s.", key);
                if (value.VH(this.FH)) {
                    iEQ++;
                }
            }
            q6.DW().j6(iEQ);
        }
        h5 h5Var = this.FH;
        if (h5Var != null) {
            SharedPreferences.Editor editorEdit = h5Var.j6().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
            editorEdit.clear();
            for (Map.Entry<n6, o6> entry2 : this.j6.entrySet()) {
                n6 key2 = entry2.getKey();
                o6 value2 = entry2.getValue();
                if (value2.J0()) {
                    editorEdit.putString(key2.toString(), new s6(value2).DW());
                    FH("Saved interstitial queue for %s.", key2);
                }
            }
            editorEdit.putString("PoolKeys", J8());
            editorEdit.apply();
        }
    }

    final p6 j6(zzwb zzwbVar, String str) {
        if (VH(str)) {
            return null;
        }
        int i = new zzaua(this.FH.j6()).VH().Ws;
        zzwb zzwbVarEQ = EQ(zzwbVar);
        String strGn = gn(str);
        n6 n6Var = new n6(zzwbVarEQ, strGn, i);
        o6 o6Var = this.j6.get(n6Var);
        if (o6Var == null) {
            FH("Interstitial pool created at %s.", n6Var);
            o6Var = new o6(zzwbVarEQ, strGn, i);
            this.j6.put(n6Var, o6Var);
        }
        this.DW.remove(n6Var);
        this.DW.add(n6Var);
        o6Var.we();
        while (this.DW.size() > ((Integer) cw0.v5().FH(p.cT)).intValue()) {
            n6 n6VarRemove = this.DW.remove();
            o6 o6Var2 = this.j6.get(n6VarRemove);
            FH("Evicting interstitial queue for %s.", n6VarRemove);
            while (o6Var2.FH() > 0) {
                p6 p6VarGn = o6Var2.gn(null);
                if (p6VarGn.v5) {
                    q6.DW().Hw();
                }
                p6VarGn.j6.Qv();
            }
            this.j6.remove(n6VarRemove);
        }
        while (o6Var.FH() > 0) {
            p6 p6VarGn2 = o6Var.gn(zzwbVarEQ);
            if (p6VarGn2.v5) {
                if (com.google.android.gms.ads.internal.w0.we().j6() - p6VarGn2.Hw > ((Integer) cw0.v5().FH(p.Z1)).intValue() * 1000) {
                    FH("Expired interstitial at %s.", n6Var);
                    q6.DW().FH();
                }
            }
            String str2 = p6VarGn2.DW != null ? " (inline) " : " ";
            StringBuilder sb = new StringBuilder(str2.length() + 34);
            sb.append("Pooled interstitial");
            sb.append(str2);
            sb.append("returned at %s.");
            FH(sb.toString(), n6Var);
            return p6VarGn2;
        }
        return null;
    }

    final void v5(zzwb zzwbVar, String str) {
        h5 h5Var = this.FH;
        if (h5Var == null) {
            return;
        }
        int i = new zzaua(h5Var.j6()).VH().Ws;
        zzwb zzwbVarEQ = EQ(zzwbVar);
        String strGn = gn(str);
        n6 n6Var = new n6(zzwbVarEQ, strGn, i);
        o6 o6Var = this.j6.get(n6Var);
        if (o6Var == null) {
            FH("Interstitial pool created at %s.", n6Var);
            o6Var = new o6(zzwbVarEQ, strGn, i);
            this.j6.put(n6Var, o6Var);
        }
        o6Var.v5(this.FH, zzwbVar);
        o6Var.we();
        FH("Inline entry added to the queue at %s.", n6Var);
    }
}
