package abcd;

import abcd.c70;
import abcd.cf0;
import abcd.k70;
import abcd.pg0;
import abcd.q60;
import abcd.se0;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProxySelector;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class qe0 extends dd0 implements df0, kd0 {
    private final e Mr;
    private final ProxySelector U2;
    private boolean a8;
    private final URL aM;
    private final URL j3;
    private cd0 lg;
    private static final String rN = sy();
    static final se0 er = new a();
    static final se0 yS = new b();
    private static final q60.b<e> gW = new c();

    class a extends se0 {
        private final String[] DW = {"http", "https"};
        private final Set<String> FH = Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(this.DW)));

        @Override // abcd.se0
        public String Hw() {
            return JGitText.DW().transportProtoHTTP;
        }

        @Override // abcd.se0
        public Set<String> VH() {
            return this.FH;
        }

        @Override // abcd.se0
        public Set<se0.a> Zo() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.HOST, se0.a.PATH));
        }

        @Override // abcd.se0
        public le0 gn(ue0 ue0Var, p70 p70Var, String str) {
            return new qe0(p70Var, ue0Var);
        }

        @Override // abcd.se0
        public Set<se0.a> v5() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.USER, se0.a.PASS, se0.a.PORT));
        }
    }

    class b extends se0 {
        @Override // abcd.se0
        public String Hw() {
            return JGitText.DW().transportProtoFTP;
        }

        @Override // abcd.se0
        public Set<String> VH() {
            return Collections.singleton("ftp");
        }

        @Override // abcd.se0
        public Set<se0.a> Zo() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.HOST, se0.a.PATH));
        }

        @Override // abcd.se0
        public le0 gn(ue0 ue0Var, p70 p70Var, String str) {
            return new qe0(p70Var, ue0Var);
        }

        @Override // abcd.se0
        public Set<se0.a> v5() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.USER, se0.a.PASS, se0.a.PORT));
        }
    }

    class c implements q60.b<e> {
        @Override // abcd.q60.b
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public e j6(q60 q60Var) {
            return new e(q60Var);
        }
    }

    private static class d implements X509TrustManager {
        private d() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        public /* synthetic */ d(d dVar) {
            this();
        }
    }

    private static class e {
        final boolean DW;
        final int j6;

        public e(q60 q60Var) {
            this.j6 = q60Var.QX("http", "postbuffer", 1048576);
            this.DW = q60Var.J0("http", "sslVerify", true);
        }
    }

    class f extends cf0 {
        private final URL j6;

        public f(URL url) {
            this.j6 = url;
        }

        private y40 Mr(String str) {
            return new y40(MessageFormat.format(JGitText.DW().advertisementOfCameBefore, str, str));
        }

        private y40 aM(String str) {
            return new y40(MessageFormat.format(JGitText.DW().duplicateAdvertisementsOf, str));
        }

        private y40 j3(String str) {
            return new y40(MessageFormat.format(JGitText.DW().invalidAdvertisementOf, str));
        }

        public Map<String, k70> U2(BufferedReader bufferedReader) throws IOException {
            TreeMap treeMap = new TreeMap();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return treeMap;
                }
                int iIndexOf = line.indexOf(9);
                if (iIndexOf < 0) {
                    throw j3(line);
                }
                String strSubstring = line.substring(iIndexOf + 1);
                a70 a70VarVJ = a70.vJ(line.substring(0, iIndexOf));
                if (strSubstring.endsWith("^{}")) {
                    String strSubstring2 = strSubstring.substring(0, strSubstring.length() - 3);
                    k70 k70Var = (k70) treeMap.get(strSubstring2);
                    if (k70Var == null) {
                        throw Mr(strSubstring2);
                    }
                    if (k70Var.FH() != null) {
                        throw aM(String.valueOf(strSubstring2) + "^{}");
                    }
                    treeMap.put(strSubstring2, new c70.b(k70.a.NETWORK, strSubstring2, k70Var.DW(), a70VarVJ));
                } else if (((k70) treeMap.put(strSubstring, new c70.a(k70.a.NETWORK, strSubstring, a70VarVJ))) != null) {
                    throw aM(strSubstring);
                }
            }
        }

        @Override // abcd.cf0
        public ue0 VH() {
            return new ue0(this.j6);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
            return r0;
         */
        @Override // abcd.cf0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.Collection<java.lang.String> Zo() throws java.io.IOException {
            /*
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.String r1 = "info/packs"
                java.io.BufferedReader r1 = r4.tp(r1)     // Catch: java.io.FileNotFoundException -> L3f
            Lb:
                java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L3a
                if (r2 == 0) goto L36
                int r3 = r2.length()     // Catch: java.lang.Throwable -> L3a
                if (r3 != 0) goto L18
                goto L36
            L18:
                java.lang.String r3 = "P pack-"
                boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> L3a
                if (r3 == 0) goto L31
                java.lang.String r3 = ".pack"
                boolean r3 = r2.endsWith(r3)     // Catch: java.lang.Throwable -> L3a
                if (r3 == 0) goto L31
                r3 = 2
                java.lang.String r2 = r2.substring(r3)     // Catch: java.lang.Throwable -> L3a
                r0.add(r2)     // Catch: java.lang.Throwable -> L3a
                goto Lb
            L31:
                abcd.y40 r2 = r4.j3(r2)     // Catch: java.lang.Throwable -> L3a
                throw r2     // Catch: java.lang.Throwable -> L3a
            L36:
                r1.close()     // Catch: java.io.FileNotFoundException -> L3f
                return r0
            L3a:
                r2 = move-exception
                r1.close()     // Catch: java.io.FileNotFoundException -> L3f
                throw r2     // Catch: java.io.FileNotFoundException -> L3f
            L3f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.qe0.f.Zo():java.util.Collection");
        }

        @Override // abcd.cf0
        public cf0.a gn(String str) throws IOException {
            URL url = new URL(this.j6, str);
            HttpURLConnection httpURLConnectionBr = qe0.this.br(url);
            int iFH = dg0.FH(httpURLConnectionBr);
            if (iFH == 200) {
                return new cf0.a(qe0.this.yO(httpURLConnectionBr), httpURLConnectionBr.getContentLength());
            }
            if (iFH == 404) {
                throw new FileNotFoundException(url.toString());
            }
            throw new IOException(String.valueOf(url.toString()) + ": " + dg0.FH(httpURLConnectionBr) + " " + httpURLConnectionBr.getResponseMessage());
        }

        @Override // abcd.cf0
        public void j6() {
        }

        @Override // abcd.cf0
        public cf0 u7(String str) {
            return qe0.this.new f(new URL(this.j6, str));
        }

        @Override // abcd.cf0
        public Collection<cf0> v5() {
            try {
                try {
                    return EQ("info/http-alternates");
                } catch (FileNotFoundException unused) {
                    return null;
                }
            } catch (FileNotFoundException unused2) {
                return EQ("info/alternates");
            }
        }
    }

    class g {
        private final String DW;
        private final String FH;
        HttpURLConnection VH;
        private final String j6;
        private final a Hw = new a();
        final ah0 v5 = new ah0(this.Hw);
        final b Zo = new b();

        class a extends InputStream {
            public a() {
            }

            @Override // java.io.InputStream
            public int read() throws NoSuchAlgorithmException, IOException, KeyManagementException {
                g.this.DW();
                return -1;
            }

            @Override // java.io.InputStream
            public long skip(long j) throws NoSuchAlgorithmException, IOException, KeyManagementException {
                g.this.DW();
                return 0L;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws NoSuchAlgorithmException, IOException, KeyManagementException {
                g.this.DW();
                return -1;
            }
        }

        class b extends pg0 {
            public b() {
                super(qe0.this.Mr.j6);
            }

            @Override // abcd.pg0
            public OutputStream tp() throws NoSuchAlgorithmException, IOException, KeyManagementException {
                g.this.FH();
                g.this.VH.setChunkedStreamingMode(0);
                return g.this.VH.getOutputStream();
            }
        }

        public g(String str) {
            this.j6 = str;
            this.DW = "application/x-" + str + "-request";
            this.FH = "application/x-" + str + "-result";
        }

        public void DW() throws NoSuchAlgorithmException, IOException, KeyManagementException {
            this.Zo.close();
            if (this.VH == null) {
                if (this.Zo.gn() == 0) {
                    throw new j50(qe0.this.DW, JGitText.DW().startingReadStageWithoutWrittenRequestDataPendingIsNotSupported);
                }
                pg0 cVar = new pg0.c(qe0.this.Mr.j6);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(cVar);
                    this.Zo.Ws(gZIPOutputStream, null);
                    gZIPOutputStream.close();
                    if (this.Zo.gn() < cVar.gn()) {
                        cVar = this.Zo;
                    }
                } catch (IOException unused) {
                    cVar = this.Zo;
                }
                FH();
                if (cVar != this.Zo) {
                    this.VH.setRequestProperty("Content-Encoding", "gzip");
                }
                this.VH.setFixedLengthStreamingMode((int) cVar.gn());
                OutputStream outputStream = this.VH.getOutputStream();
                try {
                    cVar.Ws(outputStream, null);
                } finally {
                    outputStream.close();
                }
            }
            this.Zo.we();
            int iFH = dg0.FH(this.VH);
            if (iFH != 200) {
                throw new j50(qe0.this.DW, String.valueOf(iFH) + " " + this.VH.getResponseMessage());
            }
            String contentType = this.VH.getContentType();
            if (!this.FH.equals(contentType)) {
                this.VH.getInputStream().close();
                throw qe0.this.wc(this.FH, contentType);
            }
            this.v5.j6(qe0.this.yO(this.VH));
            this.v5.j6(this.Hw);
            this.VH = null;
        }

        public void FH() throws NoSuchAlgorithmException, IOException, KeyManagementException {
            HttpURLConnection httpURLConnectionOW = qe0.this.OW("POST", new URL(qe0.this.aM, this.j6));
            this.VH = httpURLConnectionOW;
            httpURLConnectionOW.setInstanceFollowRedirects(false);
            this.VH.setDoOutput(true);
            this.VH.setRequestProperty("Content-Type", this.DW);
            this.VH.setRequestProperty("Accept", this.FH);
        }
    }

    class h extends qc0 {
        public h(InputStream inputStream) {
            super(qe0.this);
            this.Ws = true;
            XL(inputStream, rg0.WB);
            this.J8 = false;
            Mr();
        }

        @Override // abcd.qc0
        public void rN(j70 j70Var, Collection<k70> collection, Set<a70> set) {
            g gVar = qe0.this.new g("git-upload-pack");
            XL(gVar.v5, gVar.Zo);
            super.rN(j70Var, collection, set);
        }
    }

    class i extends rc0 {
        public i(InputStream inputStream) {
            super(qe0.this);
            this.Ws = true;
            XL(inputStream, rg0.WB);
            this.J8 = false;
            Mr();
        }

        @Override // abcd.rc0
        public void lg(j70 j70Var, Map<String, ae0> map) {
            g gVar = qe0.this.new g("git-receive-pack");
            XL(gVar.v5, gVar.Zo);
            super.lg(j70Var, map);
        }
    }

    public qe0(p70 p70Var, ue0 ue0Var) throws u40 {
        super(p70Var, ue0Var);
        this.a8 = true;
        this.lg = cd0.j6;
        try {
            String string = ue0Var.toString();
            if (!string.endsWith("/")) {
                string = String.valueOf(string) + "/";
            }
            this.aM = new URL(string);
            this.j3 = new URL(this.aM, "objects/");
            this.Mr = (e) p70Var.gn().tp(gW);
            this.U2 = ProxySelector.getDefault();
        } catch (MalformedURLException e2) {
            throw new u40(MessageFormat.format(JGitText.DW().invalidURL, ue0Var), e2);
        }
    }

    private void XG(InputStream inputStream, String str) throws IOException {
        byte[] bArr = new byte[5];
        eg0.DW(inputStream, bArr, 0, 5);
        if (bArr[4] != 35) {
            throw new j50(this.DW, MessageFormat.format(JGitText.DW().expectedPktLineWithService, kg0.VH(bArr)));
        }
        md0 md0Var = new md0(new ah0(new ByteArrayInputStream(bArr), inputStream));
        String str2 = "# service=" + str;
        String strFH = md0Var.FH();
        if (!str2.equals(strFH)) {
            throw new j50(this.DW, MessageFormat.format(JGitText.DW().expectedGot, str2, strFH));
        }
        while (md0Var.FH() != md0.FH) {
        }
    }

    private boolean XX(HttpURLConnection httpURLConnection, String str) {
        return ("application/x-" + str + "-advertisement").equals(httpURLConnection.getContentType());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0109, code lost:
    
        throw new abcd.j50(r8.DW, org.eclipse.jgit.JGitText.DW().notAuthorized);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection aj(java.lang.String r9) throws abcd.j50, abcd.u40 {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.qe0.aj(java.lang.String):java.net.HttpURLConnection");
    }

    private BufferedReader jJ(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream, r60.Zo));
    }

    private yc0 kQ(InputStream inputStream) throws IOException {
        f fVar = new f(this.j3);
        BufferedReader bufferedReaderJJ = jJ(inputStream);
        try {
            Map<String, k70> mapU2 = fVar.U2(bufferedReaderJJ);
            bufferedReaderJJ.close();
            if (!mapU2.containsKey("HEAD")) {
                HttpURLConnection httpURLConnectionBr = br(new URL(this.aM, "HEAD"));
                int iFH = dg0.FH(httpURLConnectionBr);
                if (iFH == 200) {
                    try {
                        String line = jJ(yO(httpURLConnectionBr)).readLine();
                        if (line != null && line.startsWith("ref: ")) {
                            String strSubstring = line.substring(5);
                            k70 cVar = mapU2.get(strSubstring);
                            if (cVar == null) {
                                cVar = new c70.c(k70.a.NEW, strSubstring, null);
                            }
                            u70 u70Var = new u70("HEAD", cVar);
                            mapU2.put(u70Var.getName(), u70Var);
                        } else if (line != null && a70.Mz(line)) {
                            c70.c cVar2 = new c70.c(k70.a.NETWORK, "HEAD", a70.vJ(line));
                            mapU2.put(cVar2.getName(), cVar2);
                        }
                    } finally {
                    }
                } else if (iFH != 404) {
                    throw new j50(this.DW, MessageFormat.format(JGitText.DW().cannotReadHEAD, Integer.valueOf(iFH), httpURLConnectionBr.getResponseMessage()));
                }
            }
            af0 af0Var = new af0(this, fVar);
            af0Var.EQ(mapU2);
            return af0Var;
        } finally {
        }
    }

    private void lp(URLConnection uRLConnection) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        TrustManager[] trustManagerArr = {new d(null)};
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, null);
            ((HttpsURLConnection) uRLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
        } catch (KeyManagementException e2) {
            throw new IOException(e2.getMessage());
        } catch (NoSuchAlgorithmException e3) {
            throw new IOException(e3.getMessage());
        }
    }

    private static String sy() {
        Package r0 = qe0.class.getPackage();
        return "JGit/" + ((r0 == null || r0.getImplementationVersion() == null) ? "unknown" : r0.getImplementationVersion());
    }

    @Override // abcd.le0
    public void Hw() {
    }

    public final HttpURLConnection OW(String str, URL url) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(dg0.DW(this.U2, url));
        if (!this.Mr.DW && "https".equals(url.getProtocol())) {
            lp(httpURLConnection);
        }
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Pragma", "no-cache");
        httpURLConnection.setRequestProperty("User-Agent", rN);
        httpURLConnection.setConnectTimeout(QX() * 1000);
        httpURLConnection.setReadTimeout(QX() * 1000);
        this.lg.FH(httpURLConnection);
        return httpURLConnection;
    }

    @Override // abcd.le0
    public rd0 SI() throws IOException {
        try {
            HttpURLConnection httpURLConnectionAj = aj("git-receive-pack");
            InputStream inputStreamYO = yO(httpURLConnectionAj);
            try {
                if (XX(httpURLConnectionAj, "git-receive-pack")) {
                    XG(inputStreamYO, "git-receive-pack");
                    return new i(inputStreamYO);
                }
                if (this.a8) {
                    throw new u40(JGitText.DW().remoteDoesNotSupportSmartHTTPPush);
                }
                throw new u40(JGitText.DW().smartHTTPPushDisabled);
            } finally {
                inputStreamYO.close();
            }
        } catch (j50 e2) {
            throw e2;
        } catch (u40 e3) {
            throw e3;
        } catch (IOException e4) {
            throw new j50(this.DW, JGitText.DW().errorReadingInfoRefs, e4);
        }
    }

    public final HttpURLConnection br(URL url) {
        return OW("GET", url);
    }

    @Override // abcd.le0
    public yc0 nw() throws IOException {
        try {
            HttpURLConnection httpURLConnectionAj = aj("git-upload-pack");
            InputStream inputStreamYO = yO(httpURLConnectionAj);
            try {
                if (!XX(httpURLConnectionAj, "git-upload-pack")) {
                    return kQ(inputStreamYO);
                }
                XG(inputStreamYO, "git-upload-pack");
                return new h(inputStreamYO);
            } finally {
                inputStreamYO.close();
            }
        } catch (j50 e2) {
            throw e2;
        } catch (u40 e3) {
            throw e3;
        } catch (IOException e4) {
            throw new j50(this.DW, JGitText.DW().errorReadingInfoRefs, e4);
        }
    }

    public IOException wc(String str, String str2) {
        return new j50(this.DW, MessageFormat.format(JGitText.DW().expectedReceivedContentType, str, str2));
    }

    public final InputStream yO(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        return "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
    }
}
