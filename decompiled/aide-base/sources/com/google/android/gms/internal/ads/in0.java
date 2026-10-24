package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class in0 extends ln0 {
    private final AtomicReference<jn0> Hw;

    public in0() {
        this(null);
    }

    private static boolean VH(zzfs zzfsVar, String str) {
        return str != null && TextUtils.equals(str, ip0.EQ(zzfsVar.Gj));
    }

    private static int gn(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    private static boolean u7(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a6  */
    @Override // com.google.android.gms.internal.ads.ln0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.on0[] v5(com.google.android.gms.internal.ads.ef0[] r35, com.google.android.gms.internal.ads.al0[] r36, int[][][] r37) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.in0.v5(com.google.android.gms.internal.ads.ef0[], com.google.android.gms.internal.ads.al0[], int[][][]):com.google.android.gms.internal.ads.on0[]");
    }

    private in0(pn0 pn0Var) {
        this.Hw = new AtomicReference<>(new jn0());
    }
}
