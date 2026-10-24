package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class eo0 implements xn0 {
    private final int DW;
    private long EQ;
    private final int FH;
    private final String Hw;
    private long J0;
    private long J8;
    private bo0 VH;
    private final qo0<? super eo0> Zo;
    private HttpURLConnection gn;
    private final boolean j6;
    private boolean tp;
    private InputStream u7;
    private final ho0 v5;
    private long we;
    private static final Pattern Ws = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> QX = new AtomicReference<>();

    public eo0(String str, cp0<String> cp0Var, qo0<? super eo0> qo0Var, int i, int i2, boolean z, ho0 ho0Var) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.Hw = str;
        this.Zo = qo0Var;
        this.v5 = new ho0();
        this.DW = i;
        this.FH = i2;
        this.j6 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.net.HttpURLConnection Hw(java.net.URL r6, byte[] r7, long r8, long r10, boolean r12, boolean r13) throws java.io.IOException {
        /*
            r5 = this;
            java.net.URLConnection r6 = r6.openConnection()
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6
            int r0 = r5.DW
            r6.setConnectTimeout(r0)
            int r0 = r5.FH
            r6.setReadTimeout(r0)
            com.google.android.gms.internal.ads.ho0 r0 = r5.v5
            java.util.Map r0 = r0.j6()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r6.setRequestProperty(r2, r1)
            goto L1e
        L3a:
            r0 = 0
            r2 = -1
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 != 0) goto L46
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L88
        L46:
            r0 = 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "bytes="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 == 0) goto L83
            java.lang.String r0 = java.lang.String.valueOf(r0)
            long r8 = r8 + r10
            r10 = 1
            long r8 = r8 - r10
            java.lang.String r10 = java.lang.String.valueOf(r0)
            int r10 = r10.length()
            int r10 = r10 + 20
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            r11.append(r0)
            r11.append(r8)
            java.lang.String r0 = r11.toString()
        L83:
            java.lang.String r8 = "Range"
            r6.setRequestProperty(r8, r0)
        L88:
            java.lang.String r8 = r5.Hw
            java.lang.String r9 = "User-Agent"
            r6.setRequestProperty(r9, r8)
            if (r12 != 0) goto L98
            java.lang.String r8 = "Accept-Encoding"
            java.lang.String r9 = "identity"
            r6.setRequestProperty(r8, r9)
        L98:
            r6.setInstanceFollowRedirects(r13)
            if (r7 == 0) goto L9f
            r8 = 1
            goto La0
        L9f:
            r8 = 0
        La0:
            r6.setDoOutput(r8)
            if (r7 == 0) goto Lbf
            java.lang.String r8 = "POST"
            r6.setRequestMethod(r8)
            int r8 = r7.length
            if (r8 == 0) goto Lbf
            int r8 = r7.length
            r6.setFixedLengthStreamingMode(r8)
            r6.connect()
            java.io.OutputStream r8 = r6.getOutputStream()
            r8.write(r7)
            r8.close()
            goto Lc2
        Lbf:
            r6.connect()
        Lc2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eo0.Hw(java.net.URL, byte[], long, long, boolean, boolean):java.net.HttpURLConnection");
    }

    private final void Zo() {
        HttpURLConnection httpURLConnection = this.gn;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.gn = null;
        }
    }

    private static long v5(HttpURLConnection httpURLConnection) throws NumberFormatException {
        long j;
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(headerField).length() + 28);
                sb.append("Unexpected Content-Length [");
                sb.append(headerField);
                sb.append("]");
                Log.e("DefaultHttpDataSource", sb.toString());
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j;
        }
        Matcher matcher = Ws.matcher(headerField2);
        if (!matcher.find()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField).length() + 26 + String.valueOf(headerField2).length());
            sb2.append("Inconsistent headers [");
            sb2.append(headerField);
            sb2.append("] [");
            sb2.append(headerField2);
            sb2.append("]");
            Log.w("DefaultHttpDataSource", sb2.toString());
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(headerField2).length() + 27);
            sb3.append("Unexpected Content-Range [");
            sb3.append(headerField2);
            sb3.append("]");
            Log.e("DefaultHttpDataSource", sb3.toString());
            return j;
        }
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final long DW(bo0 bo0Var) throws IOException, NumberFormatException {
        HttpURLConnection httpURLConnectionHw;
        HttpURLConnection httpURLConnectionHw2;
        this.VH = bo0Var;
        long j = 0;
        this.J8 = 0L;
        this.J0 = 0L;
        try {
            URL url = new URL(bo0Var.j6.toString());
            byte[] bArr = bo0Var.DW;
            long j2 = bo0Var.Hw;
            long j3 = bo0Var.v5;
            boolean zJ6 = bo0Var.j6(1);
            if (this.j6) {
                URL url2 = url;
                byte[] bArr2 = bArr;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i > 20) {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Too many redirects: ");
                        sb.append(i2);
                        throw new NoRouteToHostException(sb.toString());
                    }
                    URL url3 = url2;
                    long j4 = j3;
                    long j5 = j2;
                    httpURLConnectionHw = Hw(url2, bArr2, j2, j3, zJ6, false);
                    int responseCode = httpURLConnectionHw.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && (bArr2 != null || (responseCode != 307 && responseCode != 308))) {
                        break;
                    }
                    bArr2 = null;
                    String headerField = httpURLConnectionHw.getHeaderField("Location");
                    httpURLConnectionHw.disconnect();
                    if (headerField == null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    url2 = new URL(url3, headerField);
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        String strValueOf = String.valueOf(protocol);
                        throw new ProtocolException(strValueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf) : new String("Unsupported protocol redirect: "));
                    }
                    i = i2;
                    j3 = j4;
                    j2 = j5;
                }
                httpURLConnectionHw2 = httpURLConnectionHw;
            } else {
                httpURLConnectionHw2 = Hw(url, bArr, j2, j3, zJ6, true);
            }
            this.gn = httpURLConnectionHw2;
            try {
                int responseCode2 = httpURLConnectionHw2.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map<String, List<String>> headerFields = this.gn.getHeaderFields();
                    Zo();
                    go0 go0Var = new go0(responseCode2, headerFields, bo0Var);
                    if (responseCode2 != 416) {
                        throw go0Var;
                    }
                    go0Var.initCause(new zn0(0));
                    throw go0Var;
                }
                this.gn.getContentType();
                if (responseCode2 == 200) {
                    long j6 = bo0Var.Hw;
                    if (j6 != 0) {
                        j = j6;
                    }
                }
                this.EQ = j;
                if (bo0Var.j6(1)) {
                    this.we = bo0Var.v5;
                } else {
                    long j7 = bo0Var.v5;
                    if (j7 != -1) {
                        this.we = j7;
                    } else {
                        long jV5 = v5(this.gn);
                        this.we = jV5 != -1 ? jV5 - this.EQ : -1L;
                    }
                }
                try {
                    this.u7 = this.gn.getInputStream();
                    this.tp = true;
                    qo0<? super eo0> qo0Var = this.Zo;
                    if (qo0Var != null) {
                        qo0Var.Hw(this, bo0Var);
                    }
                    return this.we;
                } catch (IOException e) {
                    Zo();
                    throw new fo0(e, bo0Var, 1);
                }
            } catch (IOException e2) {
                Zo();
                String strValueOf2 = String.valueOf(bo0Var.j6.toString());
                throw new fo0(strValueOf2.length() != 0 ? "Unable to connect to ".concat(strValueOf2) : new String("Unable to connect to "), e2, bo0Var, 1);
            }
        } catch (IOException e3) {
            String strValueOf3 = String.valueOf(bo0Var.j6.toString());
            throw new fo0(strValueOf3.length() != 0 ? "Unable to connect to ".concat(strValueOf3) : new String("Unable to connect to "), e3, bo0Var, 1);
        }
    }

    public final Map<String, List<String>> FH() {
        HttpURLConnection httpURLConnection = this.gn;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final Uri Jm() {
        HttpURLConnection httpURLConnection = this.gn;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: Exception -> 0x006b, all -> 0x008e, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0024, B:16:0x002c, B:21:0x003a, B:23:0x004a, B:25:0x0052), top: B:45:0x0024 }] */
    @Override // com.google.android.gms.internal.ads.xn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.u7     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L7b
            java.net.HttpURLConnection r2 = r9.gn     // Catch: java.lang.Throwable -> L8e
            long r3 = r9.we     // Catch: java.lang.Throwable -> L8e
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L13
            long r3 = r9.we     // Catch: java.lang.Throwable -> L8e
            goto L18
        L13:
            long r3 = r9.we     // Catch: java.lang.Throwable -> L8e
            long r7 = r9.J8     // Catch: java.lang.Throwable -> L8e
            long r3 = r3 - r7
        L18:
            int r7 = com.google.android.gms.internal.ads.ip0.j6     // Catch: java.lang.Throwable -> L8e
            r8 = 19
            if (r7 == r8) goto L24
            int r7 = com.google.android.gms.internal.ads.ip0.j6     // Catch: java.lang.Throwable -> L8e
            r8 = 20
            if (r7 != r8) goto L6b
        L24:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L34
            int r3 = r2.read()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            r4 = -1
            if (r3 != r4) goto L3a
            goto L6b
        L34:
            r5 = 2048(0x800, double:1.012E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L6b
        L3a:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            if (r4 != 0) goto L52
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            if (r3 == 0) goto L6b
        L52:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
        L6b:
            java.io.InputStream r2 = r9.u7     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L8e
            r2.close()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L8e
            goto L7b
        L71:
            r2 = move-exception
            com.google.android.gms.internal.ads.fo0 r3 = new com.google.android.gms.internal.ads.fo0     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.bo0 r4 = r9.VH     // Catch: java.lang.Throwable -> L8e
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L8e
            throw r3     // Catch: java.lang.Throwable -> L8e
        L7b:
            r9.u7 = r0
            r9.Zo()
            boolean r0 = r9.tp
            if (r0 == 0) goto L8d
            r9.tp = r1
            com.google.android.gms.internal.ads.qo0<? super com.google.android.gms.internal.ads.eo0> r0 = r9.Zo
            if (r0 == 0) goto L8d
            r0.v5(r9)
        L8d:
            return
        L8e:
            r2 = move-exception
            r9.u7 = r0
            r9.Zo()
            boolean r0 = r9.tp
            if (r0 == 0) goto La1
            r9.tp = r1
            com.google.android.gms.internal.ads.qo0<? super com.google.android.gms.internal.ads.eo0> r0 = r9.Zo
            if (r0 == 0) goto La1
            r0.v5(r9)
        La1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eo0.close():void");
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final int j6(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (this.J0 != this.EQ) {
                byte[] andSet = QX.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.J0 != this.EQ) {
                    int i3 = this.u7.read(andSet, 0, (int) Math.min(this.EQ - this.J0, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.J0 += i3;
                    if (this.Zo != null) {
                        this.Zo.XL(this, i3);
                    }
                }
                QX.set(andSet);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.we != -1) {
                long j = this.we - this.J8;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j);
            }
            int i4 = this.u7.read(bArr, i, i2);
            if (i4 == -1) {
                if (this.we == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.J8 += i4;
            if (this.Zo != null) {
                this.Zo.XL(this, i4);
            }
            return i4;
        } catch (IOException e) {
            throw new fo0(e, this.VH, 2);
        }
    }
}
