package abcd;

import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class dg0 {
    public static Proxy DW(ProxySelector proxySelector, URL url) throws ConnectException {
        try {
            return proxySelector.select(url.toURI()).get(0);
        } catch (URISyntaxException e) {
            ConnectException connectException = new ConnectException(MessageFormat.format(JGitText.DW().cannotDetermineProxyFor, url));
            connectException.initCause(e);
            throw connectException;
        }
    }

    public static int FH(HttpURLConnection httpURLConnection) throws ConnectException {
        try {
            return httpURLConnection.getResponseCode();
        } catch (ConnectException e) {
            String host = httpURLConnection.getURL().getHost();
            if ("Connection timed out: connect".equals(e.getMessage())) {
                throw new ConnectException(MessageFormat.format(JGitText.DW().connectionTimeOut, host));
            }
            throw new ConnectException(String.valueOf(e.getMessage()) + " " + host);
        }
    }

    public static void j6(StringBuilder sb, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            sb.append(URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(JGitText.DW().couldNotURLEncodeToUTF8, e);
        }
    }
}
