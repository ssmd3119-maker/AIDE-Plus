package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k30 {
    static byte[] DW(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jHw = Hw(bArr, 0, 0) & 67108863;
        int i = 3;
        long jHw2 = Hw(bArr, 3, 2) & 67108611;
        long jHw3 = Hw(bArr, 6, 4) & 67092735;
        long jHw4 = Hw(bArr, 9, 6) & 66076671;
        long jHw5 = Hw(bArr, 12, 8) & 1048575;
        long j = jHw2 * 5;
        long j2 = jHw3 * 5;
        long j3 = jHw4 * 5;
        long j4 = jHw5 * 5;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i3 = 0;
        while (i3 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i2, (byte) 0);
            }
            long jHw6 = j9 + Hw(bArr3, 0, 0);
            long jHw7 = j5 + Hw(bArr3, i, 2);
            long jHw8 = j6 + Hw(bArr3, 6, 4);
            long jHw9 = j7 + Hw(bArr3, 9, 6);
            long jHw10 = j8 + (Hw(bArr3, 12, 8) | (bArr3[16] << 24));
            long j10 = (jHw6 * jHw) + (jHw7 * j4) + (jHw8 * j3) + (jHw9 * j2) + (jHw10 * j);
            long j11 = (jHw6 * jHw2) + (jHw7 * jHw) + (jHw8 * j4) + (jHw9 * j3) + (jHw10 * j2);
            long j12 = (jHw6 * jHw3) + (jHw7 * jHw2) + (jHw8 * jHw) + (jHw9 * j4) + (jHw10 * j3);
            long j13 = (jHw6 * jHw4) + (jHw7 * jHw3) + (jHw8 * jHw2) + (jHw9 * jHw) + (jHw10 * j4);
            long j14 = j11 + (j10 >> 26);
            long j15 = j12 + (j14 >> 26);
            long j16 = j13 + (j15 >> 26);
            long j17 = (jHw6 * jHw5) + (jHw7 * jHw4) + (jHw8 * jHw3) + (jHw9 * jHw2) + (jHw10 * jHw) + (j16 >> 26);
            long j18 = (j10 & 67108863) + ((j17 >> 26) * 5);
            j5 = (j14 & 67108863) + (j18 >> 26);
            i3 += 16;
            j6 = j15 & 67108863;
            j7 = j16 & 67108863;
            j8 = j17 & 67108863;
            i2 = 17;
            i = 3;
            j9 = j18 & 67108863;
        }
        long j19 = j6 + (j5 >> 26);
        long j20 = j19 & 67108863;
        long j21 = j7 + (j19 >> 26);
        long j22 = j21 & 67108863;
        long j23 = j8 + (j21 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j9 + ((j23 >> 26) * 5);
        long j26 = j25 & 67108863;
        long j27 = (j5 & 67108863) + (j25 >> 26);
        long j28 = j26 + 5;
        long j29 = j28 & 67108863;
        long j30 = (j28 >> 26) + j27;
        long j31 = j20 + (j30 >> 26);
        long j32 = j22 + (j31 >> 26);
        long j33 = j32 & 67108863;
        long j34 = (j24 + (j32 >> 26)) - 67108864;
        long j35 = j34 >> 63;
        long j36 = j26 & j35;
        long j37 = j27 & j35;
        long j38 = j20 & j35;
        long j39 = j22 & j35;
        long j40 = j24 & j35;
        long j41 = j35 ^ (-1);
        long j42 = (j30 & 67108863 & j41) | j37;
        long j43 = (j31 & 67108863 & j41) | j38;
        long j44 = (j33 & j41) | j39;
        long j45 = (j34 & j41) | j40;
        long j46 = ((j42 << 26) | j36 | (j29 & j41)) & 4294967295L;
        long j47 = ((j42 >> 6) | (j43 << 20)) & 4294967295L;
        long j48 = ((j43 >> 12) | (j44 << 14)) & 4294967295L;
        long jFH = j46 + FH(bArr, 16);
        long jFH2 = j47 + FH(bArr, 20) + (jFH >> 32);
        long jFH3 = j48 + FH(bArr, 24) + (jFH2 >> 32);
        long jFH4 = ((((j44 >> 18) | (j45 << 8)) & 4294967295L) + FH(bArr, 28) + (jFH3 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        j6(bArr4, jFH & 4294967295L, 0);
        j6(bArr4, jFH2 & 4294967295L, 4);
        j6(bArr4, jFH3 & 4294967295L, 8);
        j6(bArr4, jFH4, 12);
        return bArr4;
    }

    private static long FH(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    private static long Hw(byte[] bArr, int i, int i2) {
        return (FH(bArr, i) >> i2) & 67108863;
    }

    private static void j6(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
