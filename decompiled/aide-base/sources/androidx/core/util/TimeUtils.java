package androidx.core.util;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class TimeUtils {
    private static final Object j6 = new Object();
    private static char[] DW = new char[24];

    public static void DW(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            Hw(j - j2, printWriter, 0);
        }
    }

    public static void FH(long j, PrintWriter printWriter) {
        Hw(j, printWriter, 0);
    }

    public static void Hw(long j, PrintWriter printWriter, int i) {
        synchronized (j6) {
            printWriter.print(new String(DW, 0, v5(j, i)));
        }
    }

    private static int Zo(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }

    private static int j6(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    private static int v5(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        if (DW.length < i) {
            DW = new char[i];
        }
        char[] cArr = DW;
        if (j2 == 0) {
            int i7 = i - 1;
            while (i7 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i8 = (int) (j2 % 1000);
        int iFloor = (int) Math.floor(j2 / 1000);
        if (iFloor > 86400) {
            i2 = iFloor / 86400;
            iFloor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (iFloor > 3600) {
            i3 = iFloor / 3600;
            iFloor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (iFloor > 60) {
            int i9 = iFloor / 60;
            i4 = iFloor - (i9 * 60);
            i5 = i9;
        } else {
            i4 = iFloor;
            i5 = 0;
        }
        if (i != 0) {
            int iJ6 = j6(i2, 1, false, 0);
            int iJ62 = iJ6 + j6(i3, 1, iJ6 > 0, 2);
            int iJ63 = iJ62 + j6(i5, 1, iJ62 > 0, 2);
            int iJ64 = iJ63 + j6(i4, 1, iJ63 > 0, 2);
            i6 = 0;
            for (int iJ65 = iJ64 + j6(i8, 2, true, iJ64 > 0 ? 3 : 0) + 1; iJ65 < i; iJ65++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i10 = i6 + 1;
        boolean z = i != 0;
        int iZo = Zo(cArr, i2, 'd', i10, false, 0);
        int iZo2 = Zo(cArr, i3, 'h', iZo, iZo != i10, z ? 2 : 0);
        int iZo3 = Zo(cArr, i5, 'm', iZo2, iZo2 != i10, z ? 2 : 0);
        int iZo4 = Zo(cArr, i4, 's', iZo3, iZo3 != i10, z ? 2 : 0);
        int iZo5 = Zo(cArr, i8, 'm', iZo4, true, (!z || iZo4 == i10) ? 0 : 3);
        cArr[iZo5] = 's';
        return iZo5 + 1;
    }
}
