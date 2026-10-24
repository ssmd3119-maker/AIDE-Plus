package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public final class zzm extends zzfn {
    zzm(zzfo zzfoVar) {
        super(zzfoVar);
    }

    private static e1[] zzb(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        int i = 0;
        e1[] e1VarArr = new e1[map.size()];
        for (Integer num : map.keySet()) {
            e1 e1Var = new e1();
            e1Var.FH = num;
            e1Var.Hw = map.get(num);
            e1VarArr[i] = e1Var;
            i++;
        }
        return e1VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x08a3 A[PHI: r13 r15
      0x08a3: PHI (r13v16 java.util.BitSet) = (r13v15 java.util.BitSet), (r13v20 java.util.BitSet) binds: [B:246:0x0859, B:248:0x0883] A[DONT_GENERATE, DONT_INLINE]
      0x08a3: PHI (r15v9 java.util.BitSet) = (r15v8 java.util.BitSet), (r15v11 java.util.BitSet) binds: [B:246:0x0859, B:248:0x0883] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.gms.internal.measurement.d1[] zza(java.lang.String r68, com.google.android.gms.internal.measurement.f1[] r69, com.google.android.gms.internal.measurement.l1[] r70) throws android.database.SQLException, java.lang.ArrayIndexOutOfBoundsException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 3193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzm.zza(java.lang.String, com.google.android.gms.internal.measurement.f1[], com.google.android.gms.internal.measurement.l1[]):com.google.android.gms.internal.measurement.d1[]");
    }

    @Override // com.google.android.gms.measurement.internal.zzfn
    protected final boolean zzgy() {
        return false;
    }

    private static void zzb(Map<Integer, List<Long>> map, int i, long j) {
        List<Long> arrayList = map.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(Integer.valueOf(i), arrayList);
        }
        arrayList.add(Long.valueOf(j / 1000));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Boolean zza(v0 v0Var, String str, g1[] g1VarArr, long j) {
        Boolean boolZza;
        x0 x0Var = v0Var.VH;
        if (x0Var != null) {
            Boolean boolZza2 = zza(j, x0Var);
            if (boolZza2 == null) {
                return null;
            }
            if (!boolZza2.booleanValue()) {
                return Boolean.FALSE;
            }
        }
        HashSet hashSet = new HashSet();
        for (w0 w0Var : v0Var.v5) {
            if (TextUtils.isEmpty(w0Var.Zo)) {
                zzgt().zzjj().zzg("null or empty param name in filter. event", zzgq().zzbt(str));
                return null;
            }
            hashSet.add(w0Var.Zo);
        }
        ArrayMap arrayMap = new ArrayMap();
        for (g1 g1Var : g1VarArr) {
            if (hashSet.contains(g1Var.FH)) {
                Long l = g1Var.v5;
                if (l != null) {
                    arrayMap.put(g1Var.FH, l);
                } else {
                    Double d = g1Var.VH;
                    if (d != null) {
                        arrayMap.put(g1Var.FH, d);
                    } else {
                        String str2 = g1Var.Hw;
                        if (str2 != null) {
                            arrayMap.put(g1Var.FH, str2);
                        } else {
                            zzgt().zzjj().zze("Unknown value for param. event, param", zzgq().zzbt(str), zzgq().zzbu(g1Var.FH));
                            return null;
                        }
                    }
                }
            }
        }
        for (w0 w0Var2 : v0Var.v5) {
            boolean zEquals = Boolean.TRUE.equals(w0Var2.v5);
            String str3 = w0Var2.Zo;
            if (TextUtils.isEmpty(str3)) {
                zzgt().zzjj().zzg("Event has empty param name. event", zzgq().zzbt(str));
                return null;
            }
            V v = arrayMap.get(str3);
            if (v instanceof Long) {
                if (w0Var2.Hw == null) {
                    zzgt().zzjj().zze("No number filter for long param. event, param", zzgq().zzbt(str), zzgq().zzbu(str3));
                    return null;
                }
                if (zza(((Long) v).longValue(), w0Var2.Hw) == null) {
                    return null;
                }
                if ((!r10.booleanValue()) ^ zEquals) {
                    return Boolean.FALSE;
                }
            } else if (v instanceof Double) {
                if (w0Var2.Hw == null) {
                    zzgt().zzjj().zze("No number filter for double param. event, param", zzgq().zzbt(str), zzgq().zzbu(str3));
                    return null;
                }
                if (zza(((Double) v).doubleValue(), w0Var2.Hw) == null) {
                    return null;
                }
                if ((!r10.booleanValue()) ^ zEquals) {
                    return Boolean.FALSE;
                }
            } else {
                if (!(v instanceof String)) {
                    if (v == 0) {
                        zzgt().zzjo().zze("Missing param for filter. event, param", zzgq().zzbt(str), zzgq().zzbu(str3));
                        return Boolean.FALSE;
                    }
                    zzgt().zzjj().zze("Unknown param type. event, param", zzgq().zzbt(str), zzgq().zzbu(str3));
                    return null;
                }
                z0 z0Var = w0Var2.FH;
                if (z0Var != null) {
                    boolZza = zza((String) v, z0Var);
                } else if (w0Var2.Hw != null) {
                    String str4 = (String) v;
                    if (zzfu.zzcs(str4)) {
                        boolZza = zza(str4, w0Var2.Hw);
                    } else {
                        zzgt().zzjj().zze("Invalid param value for number filter. event, param", zzgq().zzbt(str), zzgq().zzbu(str3));
                        return null;
                    }
                } else {
                    zzgt().zzjj().zze("No filter for String param. event, param", zzgq().zzbt(str), zzgq().zzbu(str3));
                    return null;
                }
                if (boolZza == null) {
                    return null;
                }
                if ((!boolZza.booleanValue()) ^ zEquals) {
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.TRUE;
    }

    private final Boolean zza(y0 y0Var, l1 l1Var) {
        w0 w0Var = y0Var.v5;
        if (w0Var == null) {
            zzgt().zzjj().zzg("Missing property filter. property", zzgq().zzbv(l1Var.Hw));
            return null;
        }
        boolean zEquals = Boolean.TRUE.equals(w0Var.v5);
        Long l = l1Var.Zo;
        if (l != null) {
            if (w0Var.Hw == null) {
                zzgt().zzjj().zzg("No number filter for long property. property", zzgq().zzbv(l1Var.Hw));
                return null;
            }
            return zza(zza(l.longValue(), w0Var.Hw), zEquals);
        }
        Double d = l1Var.gn;
        if (d != null) {
            if (w0Var.Hw == null) {
                zzgt().zzjj().zzg("No number filter for double property. property", zzgq().zzbv(l1Var.Hw));
                return null;
            }
            return zza(zza(d.doubleValue(), w0Var.Hw), zEquals);
        }
        String str = l1Var.v5;
        if (str != null) {
            z0 z0Var = w0Var.FH;
            if (z0Var == null) {
                if (w0Var.Hw == null) {
                    zzgt().zzjj().zzg("No string or number filter defined. property", zzgq().zzbv(l1Var.Hw));
                } else {
                    if (zzfu.zzcs(str)) {
                        return zza(zza(l1Var.v5, w0Var.Hw), zEquals);
                    }
                    zzgt().zzjj().zze("Invalid user property value for Numeric number filter. property, value", zzgq().zzbv(l1Var.Hw), l1Var.v5);
                }
                return null;
            }
            return zza(zza(str, z0Var), zEquals);
        }
        zzgt().zzjj().zzg("User property has no value, property", zzgq().zzbv(l1Var.Hw));
        return null;
    }

    private static Boolean zza(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    private final Boolean zza(String str, z0 z0Var) {
        Integer num;
        String upperCase;
        List<String> listAsList;
        p.u7(z0Var);
        if (str == null || (num = z0Var.FH) == null || num.intValue() == 0) {
            return null;
        }
        if (z0Var.FH.intValue() == 6) {
            String[] strArr = z0Var.Zo;
            if (strArr == null || strArr.length == 0) {
                return null;
            }
        } else if (z0Var.Hw == null) {
            return null;
        }
        int iIntValue = z0Var.FH.intValue();
        Boolean bool = z0Var.v5;
        boolean z = bool != null && bool.booleanValue();
        if (!z && iIntValue != 1 && iIntValue != 6) {
            upperCase = z0Var.Hw.toUpperCase(Locale.ENGLISH);
        } else {
            upperCase = z0Var.Hw;
        }
        String str2 = upperCase;
        String[] strArr2 = z0Var.Zo;
        if (strArr2 == null) {
            listAsList = null;
        } else if (z) {
            listAsList = Arrays.asList(strArr2);
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str3 : strArr2) {
                arrayList.add(str3.toUpperCase(Locale.ENGLISH));
            }
            listAsList = arrayList;
        }
        return zza(str, iIntValue, z, str2, listAsList, iIntValue == 1 ? str2 : null);
    }

    private final Boolean zza(String str, int i, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 1) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                try {
                    break;
                } catch (PatternSyntaxException unused) {
                    zzgt().zzjj().zzg("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
        }
        return null;
    }

    private final Boolean zza(long j, x0 x0Var) {
        try {
            return zza(new BigDecimal(j), x0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean zza(double d, x0 x0Var) {
        try {
            return zza(new BigDecimal(d), x0Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean zza(String str, x0 x0Var) {
        if (!zzfu.zzcs(str)) {
            return null;
        }
        try {
            return zza(new BigDecimal(str), x0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean zza(BigDecimal bigDecimal, x0 x0Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        p.u7(x0Var);
        Integer num = x0Var.FH;
        if (num != null && num.intValue() != 0) {
            if (x0Var.FH.intValue() == 4) {
                if (x0Var.Zo == null || x0Var.VH == null) {
                    return null;
                }
            } else if (x0Var.v5 == null) {
                return null;
            }
            int iIntValue = x0Var.FH.intValue();
            if (x0Var.FH.intValue() == 4) {
                if (zzfu.zzcs(x0Var.Zo) && zzfu.zzcs(x0Var.VH)) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(x0Var.Zo);
                        bigDecimal4 = new BigDecimal(x0Var.VH);
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!zzfu.zzcs(x0Var.v5)) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(x0Var.v5);
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (iIntValue == 4) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            if (iIntValue == 1) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == -1);
            }
            if (iIntValue == 2) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 1);
            }
            if (iIntValue == 3) {
                if (d == 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                }
                if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) == -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (iIntValue == 4) {
                if (bigDecimal.compareTo(bigDecimal3) != -1 && bigDecimal.compareTo(bigDecimal4) != 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    private static void zza(Map<Integer, Long> map, int i, long j) {
        Long l = map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }
}
