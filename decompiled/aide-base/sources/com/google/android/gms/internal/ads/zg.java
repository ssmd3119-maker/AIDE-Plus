package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class zg extends a7 {
    private final vi j6;

    public zg() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream FH(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static List<yj0> Hw(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new yj0(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private static void v5(HttpURLConnection httpURLConnection, bq0<?> bq0Var) {
        byte[] bArrVy = bq0Var.vy();
        if (bArrVy != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                httpURLConnection.setRequestProperty("Content-Type", "UTF-8".length() != 0 ? "application/x-www-form-urlencoded; charset=".concat("UTF-8") : new String("application/x-www-form-urlencoded; charset="));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(bArrVy);
            dataOutputStream.close();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:14:0x0068, B:15:0x0070, B:17:0x0076, B:18:0x0086, B:19:0x008a, B:20:0x008d, B:53:0x011f, B:54:0x0124, B:21:0x0091, B:22:0x009a, B:23:0x00a0, B:24:0x00a6, B:25:0x00ac, B:26:0x00b2, B:27:0x00bb, B:28:0x00c4, B:29:0x00c9, B:31:0x00d0, B:44:0x00ec, B:51:0x0117, B:52:0x011e), top: B:63:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[Catch: all -> 0x0125, TRY_ENTER, TryCatch #1 {all -> 0x0125, blocks: (B:14:0x0068, B:15:0x0070, B:17:0x0076, B:18:0x0086, B:19:0x008a, B:20:0x008d, B:53:0x011f, B:54:0x0124, B:21:0x0091, B:22:0x009a, B:23:0x00a0, B:24:0x00a6, B:25:0x00ac, B:26:0x00b2, B:27:0x00bb, B:28:0x00c4, B:29:0x00c9, B:31:0x00d0, B:44:0x00ec, B:51:0x0117, B:52:0x011e), top: B:63:0x0068 }] */
    @Override // com.google.android.gms.internal.ads.a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.xe DW(com.google.android.gms.internal.ads.bq0<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zg.DW(com.google.android.gms.internal.ads.bq0, java.util.Map):com.google.android.gms.internal.ads.xe");
    }

    private zg(vi viVar) {
        this(null, null);
    }

    private zg(vi viVar, SSLSocketFactory sSLSocketFactory) {
        this.j6 = null;
    }
}
