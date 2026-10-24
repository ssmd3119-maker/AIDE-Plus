package abcd;

import abcd.uc0;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class cd0 {
    static final cd0 j6 = new c(null);

    private static class a extends cd0 {
        private String DW;
        private String FH;

        private a() {
        }

        @Override // abcd.cd0
        public void FH(HttpURLConnection httpURLConnection) {
            String strDW = tf0.DW((String.valueOf(this.DW) + ":" + this.FH).getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder("Basic ");
            sb.append(strDW);
            httpURLConnection.setRequestProperty("Authorization", sb.toString());
        }

        @Override // abcd.cd0
        public void j6(String str, String str2) {
            this.DW = str;
            this.FH = str2;
        }

        public /* synthetic */ a(a aVar) {
            this();
        }
    }

    private static class b extends cd0 {
        private final Map<String, String> DW;
        private int FH;
        private String Hw;
        private String v5;
        private static final Random Zo = new Random();
        private static final char[] VH = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        public b(String str) {
            Map<String, String> mapU7 = u7(str);
            this.DW = mapU7;
            if ("auth".equals(mapU7.get("qop"))) {
                byte[] bArr = new byte[8];
                Zo.nextBytes(bArr);
                this.DW.put("cnonce", tf0.DW(bArr));
            }
        }

        private static String VH(byte[] bArr) {
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (byte b : bArr) {
                sb.append(VH[(b >>> 4) & 15]);
                sb.append(VH[b & 15]);
            }
            return sb.toString();
        }

        private static String Zo(String str, String str2) {
            try {
                MessageDigest messageDigestGn = gn();
                messageDigestGn.update(str.getBytes("UTF-8"));
                messageDigestGn.update((byte) 58);
                messageDigestGn.update(str2.getBytes("UTF-8"));
                return VH(messageDigestGn.digest());
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 encoding not available", e);
            }
        }

        private static MessageDigest gn() {
            try {
                return MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("No MD5 available", e);
            }
        }

        private static String tp(URL url) {
            StringBuilder sb = new StringBuilder();
            sb.append(url.getProtocol());
            sb.append("://");
            sb.append(url.getHost());
            if (url.getPort() > 0 && ((url.getPort() != 80 || !"http".equals(url.getProtocol())) && (url.getPort() != 443 || !"https".equals(url.getProtocol())))) {
                sb.append(':');
                sb.append(url.getPort());
            }
            sb.append(url.getPath());
            if (url.getQuery() != null) {
                sb.append('?');
                sb.append(url.getQuery());
            }
            return sb.toString();
        }

        private static Map<String, String> u7(String str) {
            int i;
            String strSubstring;
            int i2;
            HashMap map = new HashMap();
            int i3 = 0;
            while (i3 < str.length()) {
                if (i3 < str.length() && str.charAt(i3) == ',') {
                    i3++;
                }
                while (i3 < str.length() && Character.isWhitespace(str.charAt(i3))) {
                    i3++;
                }
                int iIndexOf = str.indexOf(61, i3);
                if (iIndexOf < 0 || (i = iIndexOf + 1) == str.length()) {
                    return Collections.emptyMap();
                }
                String strSubstring2 = str.substring(i3, iIndexOf);
                if (str.charAt(i) == '\"') {
                    int i4 = iIndexOf + 2;
                    int iIndexOf2 = str.indexOf(34, i4);
                    if (iIndexOf2 < 0) {
                        return Collections.emptyMap();
                    }
                    String strSubstring3 = str.substring(i4, iIndexOf2);
                    int i5 = iIndexOf2 + 1;
                    strSubstring = strSubstring3;
                    i2 = i5;
                } else {
                    int iIndexOf3 = str.indexOf(32, i);
                    int iIndexOf4 = str.indexOf(44, i);
                    if (iIndexOf3 < 0) {
                        iIndexOf3 = str.length();
                    }
                    if (iIndexOf4 < 0) {
                        iIndexOf4 = str.length();
                    }
                    int iMin = Math.min(iIndexOf3, iIndexOf4);
                    strSubstring = str.substring(i, iMin);
                    i2 = iMin + 1;
                }
                map.put(strSubstring2, strSubstring);
                i3 = i2;
            }
            return map;
        }

        private static String v5(String str) {
            try {
                MessageDigest messageDigestGn = gn();
                messageDigestGn.update(str.getBytes("UTF-8"));
                return VH(messageDigestGn.digest());
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 encoding not available", e);
            }
        }

        @Override // abcd.cd0
        public void FH(HttpURLConnection httpURLConnection) {
            String str;
            String strZo;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = this.DW.get("realm");
            String str3 = this.DW.get("nonce");
            String str4 = this.DW.get("cnonce");
            String strTp = tp(httpURLConnection.getURL());
            String str5 = this.DW.get("qop");
            String requestMethod = httpURLConnection.getRequestMethod();
            String str6 = String.valueOf(this.Hw) + ":" + str2 + ":" + this.v5;
            String str7 = String.valueOf(requestMethod) + ":" + strTp;
            linkedHashMap.put("username", this.Hw);
            linkedHashMap.put("realm", str2);
            linkedHashMap.put("nonce", str3);
            linkedHashMap.put("uri", strTp);
            if ("auth".equals(str5)) {
                int i = this.FH + 1;
                this.FH = i;
                str = String.format("%08x", Integer.valueOf(i));
                strZo = Zo(v5(str6), String.valueOf(str3) + ":" + str + ":" + str4 + ":" + str5 + ":" + v5(str7));
            } else {
                str = null;
                strZo = Zo(v5(str6), String.valueOf(str3) + ":" + v5(str7));
            }
            linkedHashMap.put("response", strZo);
            if (this.DW.containsKey("algorithm")) {
                linkedHashMap.put("algorithm", "MD5");
            }
            if (str4 != null && str5 != null) {
                linkedHashMap.put("cnonce", str4);
            }
            if (this.DW.containsKey("opaque")) {
                linkedHashMap.put("opaque", this.DW.get("opaque"));
            }
            if (str5 != null) {
                linkedHashMap.put("qop", str5);
            }
            if (str != null) {
                linkedHashMap.put("nc", str);
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append((String) entry.getKey());
                sb.append('=');
                sb.append('\"');
                sb.append((String) entry.getValue());
                sb.append('\"');
            }
            httpURLConnection.setRequestProperty("Authorization", "Digest " + ((Object) sb));
        }

        @Override // abcd.cd0
        public void j6(String str, String str2) {
            this.Hw = str;
            this.v5 = str2;
        }
    }

    private static class c extends cd0 {
        private c() {
        }

        @Override // abcd.cd0
        public void FH(HttpURLConnection httpURLConnection) {
        }

        @Override // abcd.cd0
        public void j6(String str, String str2) {
        }

        public /* synthetic */ c(c cVar) {
            this();
        }
    }

    public static cd0 Hw(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("WWW-Authenticate");
        if (headerField == null || headerField.length() == 0) {
            return j6;
        }
        int iIndexOf = headerField.indexOf(32);
        if (iIndexOf < 0) {
            return j6;
        }
        String strSubstring = headerField.substring(0, iIndexOf);
        return "Basic".equalsIgnoreCase(strSubstring) ? new a(null) : "Digest".equalsIgnoreCase(strSubstring) ? new b(headerField.substring(iIndexOf + 1)) : j6;
    }

    public boolean DW(ue0 ue0Var, vc0 vc0Var) {
        String strVH;
        String strDW;
        if (vc0Var != null) {
            uc0.e eVar = new uc0.e();
            uc0.c cVar = new uc0.c();
            if (!vc0Var.Zo(eVar, cVar) || !vc0Var.DW(ue0Var, eVar, cVar)) {
                return false;
            }
            strDW = eVar.DW();
            strVH = new String(cVar.FH());
            cVar.DW();
        } else {
            String strWe = ue0Var.we();
            strVH = ue0Var.VH();
            strDW = strWe;
        }
        if (strDW == null) {
            return false;
        }
        j6(strDW, strVH);
        return true;
    }

    public abstract void FH(HttpURLConnection httpURLConnection);

    public abstract void j6(String str, String str2);
}
