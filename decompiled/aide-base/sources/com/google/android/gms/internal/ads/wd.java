package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class wd {
    static String DW(long j) {
        return Hw().format(new Date(j));
    }

    private static long FH(String str) {
        try {
            return Hw().parse(str).getTime();
        } catch (ParseException e) {
            e4.v5(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    private static SimpleDateFormat Hw() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static ab0 j6(co0 co0Var) throws NumberFormatException {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = co0Var.FH;
        String str = map.get("Date");
        long jFH = str != null ? FH(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        long jFH2 = str3 != null ? FH(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long jFH3 = str4 != null ? FH(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j4 = jCurrentTimeMillis + (j * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (jFH <= 0 || jFH2 < jFH) {
                j4 = 0;
            } else {
                j4 = jCurrentTimeMillis + (jFH2 - jFH);
                j3 = j4;
            }
        }
        ab0 ab0Var = new ab0();
        ab0Var.j6 = co0Var.DW;
        ab0Var.DW = str5;
        ab0Var.Zo = j4;
        ab0Var.v5 = j3;
        ab0Var.FH = jFH;
        ab0Var.Hw = jFH3;
        ab0Var.VH = map;
        ab0Var.gn = co0Var.Hw;
        return ab0Var;
    }
}
