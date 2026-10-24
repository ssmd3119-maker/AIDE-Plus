package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class b8 implements zk0 {
    private static final boolean FH = e4.DW;
    private final c9 DW;
    private final a7 j6;

    @Deprecated
    public b8(yf yfVar) {
        this(yfVar, new c9(4096));
    }

    private static void DW(String str, bq0<?> bq0Var, e3 e3Var) throws e3 {
        c0 c0VarCn = bq0Var.cn();
        int iRo = bq0Var.ro();
        try {
            c0VarCn.j6(e3Var);
            bq0Var.Mr(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iRo)));
        } catch (e3 e) {
            bq0Var.Mr(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iRo)));
            throw e;
        }
    }

    private final byte[] FH(InputStream inputStream, int i) throws IOException {
        uj ujVar = new uj(this.DW, i);
        try {
            if (inputStream == null) {
                throw new d1();
            }
            byte[] bArrDW = this.DW.DW(1024);
            while (true) {
                int i2 = inputStream.read(bArrDW);
                if (i2 == -1) {
                    break;
                }
                ujVar.write(bArrDW, 0, i2);
            }
            byte[] byteArray = ujVar.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    e4.FH("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.DW.j6(bArrDW);
            ujVar.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    e4.FH("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.DW.j6(null);
            ujVar.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    @Override // com.google.android.gms.internal.ads.zk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.co0 j6(com.google.android.gms.internal.ads.bq0<?> r22) throws java.io.IOException, com.google.android.gms.internal.ads.e3 {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b8.j6(com.google.android.gms.internal.ads.bq0):com.google.android.gms.internal.ads.co0");
    }

    @Deprecated
    private b8(yf yfVar, c9 c9Var) {
        this.j6 = new z5(yfVar);
        this.DW = c9Var;
    }

    public b8(a7 a7Var) {
        this(a7Var, new c9(4096));
    }

    private b8(a7 a7Var, c9 c9Var) {
        this.j6 = a7Var;
        this.DW = c9Var;
    }
}
