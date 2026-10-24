package abcd;

import abcd.pg0;
import abcd.ze0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.net.URL;
import java.net.URLConnection;
import java.security.DigestOutputStream;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.eclipse.jgit.JGitText;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/* loaded from: classes.dex */
public class mc0 {
    private static final Set<String> VH;
    private final SecretKeySpec DW;
    private final ProxySelector FH;
    private final String Hw;
    private final ze0 Zo;
    private final String j6;
    private final int v5;

    class a extends pg0.d {
        private final /* synthetic */ String AL;
        private final /* synthetic */ String cT;
        private final /* synthetic */ j70 hK;
        private final /* synthetic */ MessageDigest w9;
        private final /* synthetic */ String zh;

        public a(String str, String str2, MessageDigest messageDigest, j70 j70Var, String str3) {
            this.zh = str;
            this.AL = str2;
            this.w9 = messageDigest;
            this.hK = j70Var;
            this.cT = str3;
        }

        @Override // abcd.pg0, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            try {
                mc0.this.a8(this.zh, this.AL, this.w9.digest(), this, this.hK, this.cT);
            } finally {
                FH();
            }
        }
    }

    private final class b extends DefaultHandler {
        private final String DW;
        private final String FH;
        boolean Hw;
        final List<String> j6 = new ArrayList();
        private StringBuilder v5;

        public b(String str, String str2) {
            this.DW = str;
            this.FH = str2;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            StringBuilder sb = this.v5;
            if (sb != null) {
                sb.append(cArr, i, i2);
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            if ("Key".equals(str2)) {
                this.j6.add(this.v5.toString().substring(this.FH.length()));
            } else if ("IsTruncated".equals(str2)) {
                this.Hw = ng0.j6("true", this.v5.toString());
            }
            this.v5 = null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i, int i2) {
            StringBuilder sb = this.v5;
            if (sb != null) {
                sb.append(cArr, i, i2);
            }
        }

        public void j6() throws NoSuchAlgorithmException, SAXException, InvalidKeyException, IOException {
            TreeMap treeMap = new TreeMap();
            if (this.FH.length() > 0) {
                treeMap.put("prefix", this.FH);
            }
            if (!this.j6.isEmpty()) {
                StringBuilder sb = new StringBuilder(String.valueOf(this.FH));
                List<String> list = this.j6;
                sb.append(list.get(list.size() - 1));
                treeMap.put("marker", sb.toString());
            }
            for (int i = 0; i < mc0.this.v5; i++) {
                HttpURLConnection httpURLConnectionJ3 = mc0.this.j3("GET", this.DW, "", treeMap);
                mc0.this.VH(httpURLConnectionJ3);
                int iFH = dg0.FH(httpURLConnectionJ3);
                if (iFH == 200) {
                    this.Hw = false;
                    this.v5 = null;
                    try {
                        XMLReader xMLReaderCreateXMLReader = XMLReaderFactory.createXMLReader();
                        xMLReaderCreateXMLReader.setContentHandler(this);
                        InputStream inputStream = httpURLConnectionJ3.getInputStream();
                        try {
                            try {
                                xMLReaderCreateXMLReader.parse(new InputSource(inputStream));
                                return;
                            } finally {
                                inputStream.close();
                            }
                        } catch (SAXException e) {
                            IOException iOException = new IOException(MessageFormat.format(JGitText.DW().errorListing, this.FH));
                            iOException.initCause(e);
                            throw iOException;
                        }
                    } catch (SAXException unused) {
                        throw new IOException(JGitText.DW().noXMLParserAvailable);
                    }
                }
                if (iFH != 500) {
                    throw mc0.this.EQ("Listing", this.FH, httpURLConnectionJ3);
                }
            }
            throw mc0.this.QX("Listing", this.FH);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            if ("Key".equals(str2) || "IsTruncated".equals(str2)) {
                this.v5 = new StringBuilder();
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        VH = hashSet;
        hashSet.add("content-type");
        VH.add("content-md5");
        VH.add("date");
    }

    public mc0(Properties properties) {
        String property = properties.getProperty("accesskey");
        this.j6 = property;
        if (property == null) {
            throw new IllegalArgumentException(JGitText.DW().missingAccesskey);
        }
        String property2 = properties.getProperty("secretkey");
        if (property2 == null) {
            throw new IllegalArgumentException(JGitText.DW().missingSecretkey);
        }
        this.DW = new SecretKeySpec(r60.Hw(property2), "HmacSHA1");
        String property3 = properties.getProperty("acl", "PRIVATE");
        if (ng0.j6("PRIVATE", property3)) {
            this.Hw = "private";
        } else {
            if (!ng0.j6("PUBLIC", property3) && !ng0.j6("PUBLIC-READ", property3) && !ng0.j6("PUBLIC_READ", property3)) {
                throw new IllegalArgumentException("Invalid acl: " + property3);
            }
            this.Hw = "public-read";
        }
        try {
            String property4 = properties.getProperty("password");
            if (property4 != null) {
                String property5 = properties.getProperty("crypto.algorithm");
                this.Zo = new ze0.b(property5 == null ? "PBEWithMD5AndDES" : property5, property4);
            } else {
                this.Zo = ze0.j6;
            }
            this.v5 = Integer.parseInt(properties.getProperty("httpclient.retry-max", "3"));
            this.FH = ProxySelector.getDefault();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(JGitText.DW().invalidEncryption, e);
        } catch (InvalidKeySpecException e2) {
            throw new IllegalArgumentException(JGitText.DW().invalidEncryption, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IOException EQ(String str, String str2, HttpURLConnection httpURLConnection) throws IOException {
        IOException iOException = new IOException(MessageFormat.format(JGitText.DW().amazonS3ActionFailed, str, str2, Integer.valueOf(dg0.FH(httpURLConnection)), httpURLConnection.getResponseMessage()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            int i = httpURLConnection.getErrorStream().read(bArr);
            if (i < 0) {
                break;
            }
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length > 0) {
            iOException.initCause(new IOException("\n" + new String(byteArray)));
        }
        return iOException;
    }

    private static String J0() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return String.valueOf(simpleDateFormat.format(new Date())) + " GMT";
    }

    private static boolean J8(String str) {
        String strGn = ng0.gn(str);
        return VH.contains(strGn) || strGn.startsWith("x-amz-");
    }

    public static Properties Mr(File file) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            return properties;
        } finally {
            fileInputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IOException QX(String str, String str2) {
        return new IOException(MessageFormat.format(JGitText.DW().amazonS3ActionFailedGivingUp, str, str2, Integer.valueOf(this.v5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void VH(HttpURLConnection httpURLConnection) throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, List<String>> entry : requestProperties.entrySet()) {
            String key = entry.getKey();
            if (J8(key)) {
                treeMap.put(ng0.gn(key), rN(entry.getValue()));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(httpURLConnection.getRequestMethod());
        sb.append('\n');
        sb.append(lg(treeMap, "content-md5"));
        sb.append('\n');
        sb.append(lg(treeMap, "content-type"));
        sb.append('\n');
        sb.append(lg(treeMap, "date"));
        sb.append('\n');
        for (Map.Entry entry2 : treeMap.entrySet()) {
            sb.append((String) entry2.getKey());
            sb.append(':');
            sb.append((String) entry2.getValue());
            sb.append('\n');
        }
        String host = httpURLConnection.getURL().getHost();
        sb.append('/');
        sb.append(host.substring(0, (host.length() - 16) - 1));
        sb.append(httpURLConnection.getURL().getPath());
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(this.DW);
            httpURLConnection.setRequestProperty("Authorization", "AWS " + this.j6 + ":" + tf0.DW(mac.doFinal(sb.toString().getBytes("UTF-8"))));
        } catch (InvalidKeyException e) {
            throw new IOException(MessageFormat.format(JGitText.DW().invalidKey, e.getMessage()));
        } catch (NoSuchAlgorithmException e2) {
            throw new IOException(MessageFormat.format(JGitText.DW().noHMACsupport, "HmacSHA1", e2.getMessage()));
        }
    }

    private static MessageDigest XL() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(JGitText.DW().JRELacksMD5Implementation, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a8(String str, String str2, byte[] bArr, pg0 pg0Var, j70 j70Var, String str3) throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        if (j70Var == null) {
            j70Var = x60.j6;
        }
        if (str3 == null) {
            str3 = MessageFormat.format(JGitText.DW().progressMonUploading, str2);
        }
        String strDW = tf0.DW(bArr);
        long jGn = pg0Var.gn();
        String strValueOf = String.valueOf(jGn);
        for (int i = 0; i < this.v5; i++) {
            HttpURLConnection httpURLConnectionAM = aM("PUT", str, str2);
            httpURLConnectionAM.setRequestProperty("Content-Length", strValueOf);
            httpURLConnectionAM.setRequestProperty("Content-MD5", strDW);
            httpURLConnectionAM.setRequestProperty("x-amz-acl", this.Hw);
            this.Zo.Hw(httpURLConnectionAM, "x-amz-meta-");
            VH(httpURLConnectionAM);
            httpURLConnectionAM.setDoOutput(true);
            httpURLConnectionAM.setFixedLengthStreamingMode((int) jGn);
            j70Var.j6(str3, (int) (jGn / 1024));
            OutputStream outputStream = httpURLConnectionAM.getOutputStream();
            try {
                pg0Var.Ws(outputStream, j70Var);
                j70Var.FH();
                outputStream.close();
                int iFH = dg0.FH(httpURLConnectionAM);
                if (iFH == 200) {
                    return;
                }
                if (iFH != 500) {
                    throw EQ("Writing", str2, httpURLConnectionAM);
                }
            } catch (Throwable th) {
                j70Var.FH();
                outputStream.close();
                throw th;
            }
        }
        throw QX("Writing", str2);
    }

    private HttpURLConnection aM(String str, String str2, String str3) {
        return j3(str, str2, str3, Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HttpURLConnection j3(String str, String str2, String str3, Map<String, String> map) throws ProtocolException {
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(str2);
        sb.append('.');
        sb.append("s3.amazonaws.com");
        sb.append('/');
        if (str3.length() > 0) {
            dg0.j6(sb, str3);
        }
        if (!map.isEmpty()) {
            sb.append('?');
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                sb.append(next.getKey());
                sb.append('=');
                dg0.j6(sb, next.getValue());
                if (it.hasNext()) {
                    sb.append('&');
                }
            }
        }
        URL url = new URL(sb.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(dg0.DW(this.FH, url));
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setRequestProperty("User-Agent", "jgit/1.0");
        httpURLConnection.setRequestProperty("Date", J0());
        return httpURLConnection;
    }

    private static String lg(Map<String, String> map, String str) {
        String strRemove = map.remove(str);
        return strRemove != null ? strRemove : "";
    }

    private static String rN(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(str.replaceAll("\n", "").trim());
        }
        return sb.toString();
    }

    public void U2(String str, String str2, byte[] bArr) throws NoSuchAlgorithmException, IOException, InvalidKeyException {
        if (this.Zo != ze0.j6) {
            OutputStream outputStreamGn = gn(str, str2, null, null);
            outputStreamGn.write(bArr);
            outputStreamGn.close();
            return;
        }
        String strDW = tf0.DW(XL().digest(bArr));
        String strValueOf = String.valueOf(bArr.length);
        for (int i = 0; i < this.v5; i++) {
            HttpURLConnection httpURLConnectionAM = aM("PUT", str, str2);
            httpURLConnectionAM.setRequestProperty("Content-Length", strValueOf);
            httpURLConnectionAM.setRequestProperty("Content-MD5", strDW);
            httpURLConnectionAM.setRequestProperty("x-amz-acl", this.Hw);
            VH(httpURLConnectionAM);
            httpURLConnectionAM.setDoOutput(true);
            httpURLConnectionAM.setFixedLengthStreamingMode(bArr.length);
            OutputStream outputStream = httpURLConnectionAM.getOutputStream();
            try {
                outputStream.write(bArr);
                outputStream.close();
                int iFH = dg0.FH(httpURLConnectionAM);
                if (iFH == 200) {
                    return;
                }
                if (iFH != 500) {
                    throw EQ("Writing", str2, httpURLConnectionAM);
                }
            } catch (Throwable th) {
                outputStream.close();
                throw th;
            }
        }
        throw QX("Writing", str2);
    }

    public List<String> Ws(String str, String str2) throws NoSuchAlgorithmException, SAXException, InvalidKeyException, IOException {
        if (str2.length() > 0 && !str2.endsWith("/")) {
            str2 = String.valueOf(str2) + "/";
        }
        b bVar = new b(str, str2);
        do {
            bVar.j6();
        } while (bVar.Hw);
        return bVar.j6;
    }

    public OutputStream gn(String str, String str2, j70 j70Var, String str3) {
        MessageDigest messageDigestXL = XL();
        return this.Zo.DW(new DigestOutputStream(new a(str, str2, messageDigestXL, j70Var, str3), messageDigestXL));
    }

    public void tp(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        for (int i = 0; i < this.v5; i++) {
            HttpURLConnection httpURLConnectionAM = aM("DELETE", str, str2);
            VH(httpURLConnectionAM);
            int iFH = dg0.FH(httpURLConnectionAM);
            if (iFH == 204) {
                return;
            }
            if (iFH != 500) {
                throw EQ("Deletion", str2, httpURLConnectionAM);
            }
        }
        throw QX("Deletion", str2);
    }

    public InputStream u7(URLConnection uRLConnection) {
        return this.Zo.j6(uRLConnection.getInputStream());
    }

    public URLConnection we(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        for (int i = 0; i < this.v5; i++) {
            HttpURLConnection httpURLConnectionAM = aM("GET", str, str2);
            VH(httpURLConnectionAM);
            int iFH = dg0.FH(httpURLConnectionAM);
            if (iFH == 200) {
                this.Zo.v5(httpURLConnectionAM, "x-amz-meta-");
                return httpURLConnectionAM;
            }
            if (iFH == 404) {
                throw new FileNotFoundException(str2);
            }
            if (iFH != 500) {
                throw EQ("Reading", str2, httpURLConnectionAM);
            }
        }
        throw QX("Reading", str2);
    }
}
