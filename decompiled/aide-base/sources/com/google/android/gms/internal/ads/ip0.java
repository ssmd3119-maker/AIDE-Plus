package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ip0 {
    public static final String DW;
    public static final String FH;
    public static final String Hw;
    private static final Pattern VH;
    private static final Pattern Zo;
    public static final int j6;
    public static final String v5;

    static {
        j6 = (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') ? 26 : Build.VERSION.SDK_INT;
        DW = Build.DEVICE;
        FH = Build.MANUFACTURER;
        String str = Build.MODEL;
        Hw = str;
        String str2 = DW;
        String str3 = FH;
        int i = j6;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        v5 = sb.toString();
        Zo = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        VH = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static float DW(float f, float f2, float f3) {
        return Math.max(0.1f, Math.min(f, 8.0f));
    }

    public static String EQ(String str) {
        if (str == null) {
            return null;
        }
        return new Locale(str).getLanguage();
    }

    public static int FH(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j);
            i = iBinarySearch + 1;
        }
        return z2 ? Math.max(0, i) : i;
    }

    public static long Hw(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        double d = j2;
        double d2 = j3;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = j;
        Double.isNaN(d3);
        return (long) (d3 * (d / d2));
    }

    public static long J0(String str) {
        Matcher matcher = VH.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d2 = d + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d3 = d2 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d4 = d3 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d5 = d4 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j = (long) ((d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j : j;
    }

    public static long J8(String str) throws af0 {
        Matcher matcher = Zo.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            throw new af0(strValueOf.length() != 0 ? "Invalid date/time format: ".concat(strValueOf) : new String("Invalid date/time format: "));
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if (matcher.group(11).equals("-")) {
                i = -i;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String strValueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(strValueOf2.length() != 0 ? "0.".concat(strValueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (i * 60000) : timeInMillis;
    }

    public static int Mr(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static byte[] QX(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public static int U2(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static void VH(xn0 xn0Var) {
        if (xn0Var != null) {
            try {
                xn0Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int Ws(String str) {
        int length = str.length();
        ro0.j6(length <= 4);
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt << 8) | str.charAt(i);
        }
        return iCharAt;
    }

    public static int XL(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = iBinarySearch ^ (-1);
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j);
            i = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    public static String Zo(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static int a8(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i == 1073741824) {
            return i2 << 2;
        }
        if (i == 2) {
            return i2 << 1;
        }
        if (i == 3) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static int aM(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static void gn(long[] jArr, long j, long j2) {
        int i = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long j4 = 1000000 / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
            return;
        }
        double d = j2;
        Double.isNaN(d);
        double d2 = 1000000.0d / d;
        while (i < jArr.length) {
            double d3 = jArr[i];
            Double.isNaN(d3);
            jArr[i] = (long) (d3 * d2);
            i++;
        }
    }

    public static int j3(int i) {
        if (i == 0) {
            return 16777216;
        }
        if (i == 1) {
            return 3538944;
        }
        if (i == 2) {
            return 13107200;
        }
        if (i == 3 || i == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    public static void j6(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static long lg(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    public static ExecutorService tp(String str) {
        return Executors.newSingleThreadExecutor(new jp0(str));
    }

    public static boolean u7(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static bo0 v5(bo0 bo0Var, int i) {
        if (i == 0) {
            return bo0Var;
        }
        long j = bo0Var.v5;
        return new bo0(bo0Var.j6, bo0Var.Hw + i, j != -1 ? j - i : -1L, bo0Var.Zo, bo0Var.VH);
    }

    public static byte[] we(String str) {
        return str.getBytes(Charset.defaultCharset());
    }
}
