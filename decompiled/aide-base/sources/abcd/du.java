package abcd;

import abcd.gu;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.TokenIterator;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes.dex */
public abstract class du implements gu {
    private final fu DW;
    private eu FH;
    private String Hw;
    private final gu.a j6;
    private HttpClient v5;

    class a implements ConnPerRoute {
        public a(du duVar) {
        }

        @Override // org.apache.http.conn.params.ConnPerRoute
        public int getMaxForRoute(HttpRoute httpRoute) {
            return 10;
        }
    }

    class b extends DefaultHttpClient {
        public b(du duVar, ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
            super(clientConnectionManager, httpParams);
        }

        @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
        public ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
            return new g(null);
        }

        @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
        public ConnectionReuseStrategy createConnectionReuseStrategy() {
            return new f(null);
        }
    }

    class c implements HttpRequestInterceptor {
        public c(du duVar) {
        }

        @Override // org.apache.http.HttpRequestInterceptor
        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            if (httpRequest.containsHeader("Accept-Encoding")) {
                return;
            }
            httpRequest.addHeader("Accept-Encoding", "gzip");
        }
    }

    class d implements HttpResponseInterceptor {
        public d(du duVar) {
        }

        @Override // org.apache.http.HttpResponseInterceptor
        public void process(HttpResponse httpResponse, HttpContext httpContext) throws ParseException {
            Header contentEncoding;
            HttpEntity entity = httpResponse.getEntity();
            if (entity == null || (contentEncoding = entity.getContentEncoding()) == null) {
                return;
            }
            for (HeaderElement headerElement : contentEncoding.getElements()) {
                if (headerElement.getName().equalsIgnoreCase("gzip")) {
                    httpResponse.setEntity(new h(httpResponse.getEntity()));
                    return;
                }
            }
        }
    }

    private static class e extends ThreadSafeClientConnManager {
        public e(HttpParams httpParams, SchemeRegistry schemeRegistry) {
            super(httpParams, schemeRegistry);
        }

        @Override // org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager, org.apache.http.conn.ClientConnectionManager
        public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
            i.j6(this, 20, 5);
            return super.requestConnection(httpRoute, obj);
        }
    }

    private static class f extends DefaultConnectionReuseStrategy {
        private f() {
        }

        @Override // org.apache.http.impl.DefaultConnectionReuseStrategy, org.apache.http.ConnectionReuseStrategy
        public boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext) {
            if (httpResponse == null) {
                throw new IllegalArgumentException("HTTP response may not be null.");
            }
            if (httpContext == null) {
                throw new IllegalArgumentException("HTTP context may not be null.");
            }
            ProtocolVersion protocolVersion = httpResponse.getStatusLine().getProtocolVersion();
            Header firstHeader = httpResponse.getFirstHeader("Transfer-Encoding");
            if (firstHeader == null) {
                Header[] headers = httpResponse.getHeaders("Content-Length");
                if (headers != null && headers.length == 1) {
                    try {
                        if (Integer.parseInt(headers[0].getValue()) < 0) {
                            return false;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                return false;
            }
            if (!"chunked".equalsIgnoreCase(firstHeader.getValue())) {
                return false;
            }
            HeaderIterator headerIterator = httpResponse.headerIterator("Connection");
            if (!headerIterator.hasNext()) {
                headerIterator = httpResponse.headerIterator("Proxy-Connection");
            }
            if (headerIterator.hasNext()) {
                try {
                    TokenIterator tokenIteratorCreateTokenIterator = createTokenIterator(headerIterator);
                    boolean z = false;
                    while (tokenIteratorCreateTokenIterator.hasNext()) {
                        String strNextToken = tokenIteratorCreateTokenIterator.nextToken();
                        if ("Close".equalsIgnoreCase(strNextToken)) {
                            return false;
                        }
                        if ("Keep-Alive".equalsIgnoreCase(strNextToken)) {
                            z = true;
                        }
                    }
                    if (z) {
                        return true;
                    }
                } catch (ParseException unused2) {
                    return false;
                }
            }
            return !protocolVersion.lessEquals(HttpVersion.HTTP_1_0);
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    private static class g implements ConnectionKeepAliveStrategy {
        private g() {
        }

        @Override // org.apache.http.conn.ConnectionKeepAliveStrategy
        public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
            BasicHeaderElementIterator basicHeaderElementIterator = new BasicHeaderElementIterator(httpResponse.headerIterator("Keep-Alive"));
            long jMin = 20000;
            while (basicHeaderElementIterator.hasNext()) {
                HeaderElement headerElementNextElement = basicHeaderElementIterator.nextElement();
                String name = headerElementNextElement.getName();
                String value = headerElementNextElement.getValue();
                if (value != null && name.equalsIgnoreCase("timeout")) {
                    try {
                        jMin = Math.min(jMin, Long.parseLong(value) * 1000);
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return jMin;
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    private static class h extends HttpEntityWrapper {
        public h(HttpEntity httpEntity) {
            super(httpEntity);
        }

        @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
        public InputStream getContent() {
            return new GZIPInputStream(((HttpEntityWrapper) this).wrappedEntity.getContent());
        }

        @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
        public long getContentLength() {
            return -1L;
        }
    }

    private static class i extends Thread {
        private static i fY;
        private final e WB;
        private final int jw;
        private final int mb;

        public i(e eVar, int i, int i2) {
            this.WB = eVar;
            this.mb = i;
            this.jw = i2 * 1000;
        }

        public static synchronized void j6(e eVar, int i, int i2) {
            if (fY == null) {
                i iVar = new i(eVar, i, i2);
                fY = iVar;
                iVar.start();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    synchronized (this) {
                        wait(this.jw);
                    }
                    this.WB.closeExpiredConnections();
                    this.WB.closeIdleConnections(this.mb, TimeUnit.SECONDS);
                    synchronized (i.class) {
                        if (this.WB.getConnectionsInPool() == 0) {
                            fY = null;
                            return;
                        }
                    }
                } catch (InterruptedException unused) {
                    fY = null;
                    return;
                }
            }
        }
    }

    public du(fu fuVar, gu.a aVar) {
        this(fuVar, aVar, null);
    }

    private static String EQ(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            AssertionError assertionError = new AssertionError("UTF-8 isn't available");
            assertionError.initCause(e2);
            throw assertionError;
        }
    }

    private static String tp(fu fuVar, eu euVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("OAuth oauth_version=\"1.0\"");
        sb.append(", oauth_signature_method=\"PLAINTEXT\"");
        sb.append(", oauth_consumer_key=\"");
        sb.append(EQ(fuVar.WB));
        sb.append("\"");
        if (euVar != null) {
            sb.append(", oauth_token=\"");
            sb.append(EQ(euVar.WB));
            sb.append("\"");
            str = EQ(fuVar.mb) + "&" + EQ(euVar.mb);
        } else {
            str = EQ(fuVar.mb) + "&";
        }
        sb.append(", oauth_signature=\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    @Override // abcd.gu
    public synchronized gu.b DW() {
        return null;
    }

    @Override // abcd.gu
    public boolean FH() {
        return (this.FH == null && this.Hw == null) ? false : true;
    }

    @Override // abcd.gu
    public synchronized HttpClient Hw() {
        if (this.v5 == null) {
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new a(this));
            ConnManagerParams.setMaxTotalConnections(basicHttpParams, 20);
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    ut utVar = new ut();
                                    SchemeRegistry schemeRegistry = new SchemeRegistry();
                                    schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
                                    schemeRegistry.register(new Scheme("https", utVar, 443));
                                    e eVar = new e(basicHttpParams, schemeRegistry);
                                    BasicHttpParams basicHttpParams2 = new BasicHttpParams();
                                    HttpConnectionParams.setConnectionTimeout(basicHttpParams2, 30000);
                                    HttpConnectionParams.setSoTimeout(basicHttpParams2, 30000);
                                    HttpConnectionParams.setSocketBufferSize(basicHttpParams2, 8192);
                                    HttpProtocolParams.setUserAgent(basicHttpParams2, "OfficialDropboxJavaSDK/" + qt.DW);
                                    b bVar = new b(this, eVar, basicHttpParams2);
                                    bVar.addRequestInterceptor(new c(this));
                                    bVar.addResponseInterceptor(new d(this));
                                    this.v5 = bVar;
                                } catch (CertificateException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } catch (NoSuchAlgorithmException e3) {
                                throw new RuntimeException(e3);
                            }
                        } catch (UnrecoverableKeyException e4) {
                            throw new RuntimeException(e4);
                        }
                    } catch (IOException e5) {
                        throw new RuntimeException(e5);
                    }
                } catch (KeyManagementException e6) {
                    throw new RuntimeException(e6);
                }
            } catch (KeyStoreException e7) {
                throw new RuntimeException(e7);
            }
        }
        return this.v5;
    }

    public fu J0() {
        return this.DW;
    }

    public void J8(eu euVar) {
        if (euVar == null) {
            throw new IllegalArgumentException("'oauth1AccessToken' must be non-null");
        }
        this.FH = euVar;
        this.Hw = null;
    }

    public void QX() {
        this.FH = null;
        this.Hw = null;
    }

    @Override // abcd.gu
    public String VH() {
        return "api.dropbox.com";
    }

    public void Ws(String str) {
        if (str == null) {
            throw new IllegalArgumentException("'oauth2AccessToken' must be non-null");
        }
        this.Hw = str;
        this.FH = null;
    }

    @Override // abcd.gu
    public gu.a Zo() {
        return this.j6;
    }

    @Override // abcd.gu
    public void gn(HttpRequest httpRequest) {
        String strTp;
        if (this.Hw != null) {
            strTp = "Bearer " + this.Hw;
        } else {
            strTp = tp(this.DW, this.FH);
        }
        httpRequest.addHeader("Authorization", strTp);
    }

    @Override // abcd.gu
    public void j6(HttpUriRequest httpUriRequest) {
        HttpParams params = httpUriRequest.getParams();
        HttpConnectionParams.setSoTimeout(params, 30000);
        HttpConnectionParams.setConnectionTimeout(params, 30000);
    }

    @Override // abcd.gu
    public Locale u7() {
        return Locale.ENGLISH;
    }

    @Override // abcd.gu
    public String v5() {
        return "api-content.dropbox.com";
    }

    public eu we() {
        return this.FH;
    }

    public du(fu fuVar, gu.a aVar, eu euVar) {
        this.FH = null;
        this.Hw = null;
        this.v5 = null;
        if (fuVar == null) {
            throw new IllegalArgumentException("'appKeyPair' must be non-null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("'type' must be non-null");
        }
        this.DW = fuVar;
        this.j6 = aVar;
        this.FH = euVar;
    }
}
