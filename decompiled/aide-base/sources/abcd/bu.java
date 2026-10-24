package abcd;

import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

/* loaded from: classes.dex */
public class bu extends vt {
    public a WB;
    public String fY;
    public String jw;
    public int mb;
    public Map<String, Object> qp;

    public static class a {
        public String j6;

        public a(Map<String, Object> map) {
            Object obj = map.get("error");
            if (obj instanceof String) {
                this.j6 = (String) obj;
            } else if (obj instanceof Map) {
                for (Object obj2 : ((Map) obj).values()) {
                    if (obj2 instanceof String) {
                        this.j6 = (String) obj2;
                    }
                }
            }
            Object obj3 = map.get("user_error");
            if (obj3 instanceof String) {
            }
        }
    }

    public bu(HttpResponse httpResponse) {
        fillInStackTrace();
        StatusLine statusLine = httpResponse.getStatusLine();
        this.mb = statusLine.getStatusCode();
        this.jw = statusLine.getReasonPhrase();
        this.fY = j6(httpResponse, "server");
        j6(httpResponse, "location");
    }

    public static boolean DW(HttpResponse httpResponse) {
        int iIndexOf;
        String strSubstring;
        int iIndexOf2;
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 302) {
            String strJ6 = j6(httpResponse, "location");
            if (strJ6 != null && (iIndexOf = strJ6.indexOf("://")) > -1 && (iIndexOf2 = (strSubstring = strJ6.substring(iIndexOf + 3)).indexOf("/")) > -1 && strSubstring.substring(0, iIndexOf2).toLowerCase().contains("dropbox.com")) {
                return true;
            }
        } else if (statusCode == 304) {
            return true;
        }
        return false;
    }

    private static String j6(HttpResponse httpResponse, String str) {
        Header firstHeader = httpResponse.getFirstHeader(str);
        if (firstHeader != null) {
            return firstHeader.getValue();
        }
        return null;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "DropboxServerException (" + this.fY + "): " + this.mb + " " + this.jw + " (" + this.WB.j6 + ")";
    }

    public bu(HttpResponse httpResponse, Object obj) {
        this(httpResponse);
        if (obj == null || !(obj instanceof Map)) {
            return;
        }
        Map<String, Object> map = (Map) obj;
        this.qp = map;
        this.WB = new a(map);
    }
}
