package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes.dex */
public final class ie0 {
    public static final UUID DW;
    public static final UUID FH;
    public static final int j6;

    static {
        j6 = ip0.j6 < 23 ? 1020 : 6396;
        DW = new UUID(0L, 0L);
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-1301668207276963122L, -6645017420763422227L);
        FH = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long DW(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j * 1000;
    }

    public static long j6(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }
}
