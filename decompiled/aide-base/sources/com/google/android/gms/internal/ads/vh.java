package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class vh implements Runnable {
    private final /* synthetic */ OutputStream WB;
    private final /* synthetic */ byte[] mb;

    vh(zzasy zzasyVar, OutputStream outputStream, byte[] bArr) {
        this.WB = outputStream;
        this.mb = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1e
            java.io.OutputStream r2 = r5.WB     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1e
            byte[] r0 = r5.mb     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L3c
            int r0 = r0.length     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L3c
            r1.writeInt(r0)     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L3c
            byte[] r0 = r5.mb     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L3c
            r1.write(r0)     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L3c
            com.google.android.gms.common.util.k.j6(r1)
            return
        L17:
            r0 = move-exception
            goto L22
        L19:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L3d
        L1e:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L22:
            java.lang.String r2 = "Error transporting the ad response"
            com.google.android.gms.internal.ads.xp.Hw(r2, r0)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.dm r2 = com.google.android.gms.ads.internal.w0.u7()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "LargeParcelTeleporter.pipeData.1"
            r2.v5(r0, r3)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L38
            java.io.OutputStream r0 = r5.WB
            com.google.android.gms.common.util.k.j6(r0)
            return
        L38:
            com.google.android.gms.common.util.k.j6(r1)
            return
        L3c:
            r0 = move-exception
        L3d:
            if (r1 != 0) goto L45
            java.io.OutputStream r1 = r5.WB
            com.google.android.gms.common.util.k.j6(r1)
            goto L48
        L45:
            com.google.android.gms.common.util.k.j6(r1)
        L48:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vh.run():void");
    }
}
