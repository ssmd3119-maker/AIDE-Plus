package com.google.android.gms.ads.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class l1 {
    public static Object[] DW(String str, zzwb zzwbVar, String str2, int i, zzwf zzwfVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzwbVar.mb));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(j6(zzwbVar.jw));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzwbVar.fY));
        }
        if (hashSet.contains("keywords")) {
            List<String> list = zzwbVar.qp;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzwbVar.k2));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzwbVar.zh));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzwbVar.AL));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzwbVar.w9);
        }
        if (hashSet.contains("location")) {
            Location location = zzwbVar.cT;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzwbVar.q7);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(j6(zzwbVar.Z1));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(j6(zzwbVar.n5));
        }
        if (hashSet.contains("categoryExclusions")) {
            List<String> list2 = zzwbVar.Q6;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzwbVar.kf);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzwbVar.Jl);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzwbVar.iW));
        }
        return arrayList.toArray();
    }

    private static String j6(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? j6((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }
}
