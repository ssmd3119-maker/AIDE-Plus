package abcd;

import abcd.gu;
import abcd.qt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.net.ssl.SSLException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;

/* loaded from: classes.dex */
public class st {

    public enum a {
        GET,
        POST
    }

    static {
        new SimpleDateFormat("EEE, dd MMM yyyy kk:mm:ss ZZZZZ", Locale.US);
    }

    public static HttpResponse DW(gu guVar, HttpUriRequest httpUriRequest) {
        return FH(guVar, httpUriRequest, -1);
    }

    public static HttpResponse FH(gu guVar, HttpUriRequest httpUriRequest, int i) throws Throwable {
        HttpClient httpClientU7 = u7(guVar);
        guVar.j6(httpUriRequest);
        if (i >= 0) {
            HttpConnectionParams.setSoTimeout(httpUriRequest.getParams(), i);
        }
        boolean zHw = Hw(httpUriRequest);
        HttpResponse httpResponseExecute = null;
        for (int i2 = 0; i2 < 5; i2++) {
            try {
                try {
                    httpResponseExecute = httpClientU7.execute(httpUriRequest);
                } catch (NullPointerException unused) {
                }
                if (httpResponseExecute != null) {
                    break;
                }
                gn(httpClientU7, guVar);
                if (!zHw) {
                    throw new zt();
                }
            } catch (OutOfMemoryError e) {
                throw new vt(e);
            } catch (SSLException e2) {
                throw new au(e2);
            } catch (IOException e3) {
                throw new wt(e3);
            }
        }
        if (httpResponseExecute == null) {
            throw new wt("Apache HTTPClient encountered an error. No response, try again.");
        }
        int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
        if (statusCode != 200 && statusCode != 206) {
            v5(httpResponseExecute);
        }
        return httpResponseExecute;
    }

    private static boolean Hw(HttpRequest httpRequest) {
        HttpEntity entity;
        return !(httpRequest instanceof HttpEntityEnclosingRequest) || (entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity()) == null || entity.isRepeatable();
    }

    public static qt.g VH(a aVar, String str, String str2, int i, String[] strArr, gu guVar) throws vt {
        HttpRequestBase httpGet;
        if (aVar == a.GET) {
            httpGet = new HttpGet(j6(str, i, str2, strArr));
        } else {
            HttpPost httpPost = new HttpPost(j6(str, i, str2, null));
            httpGet = httpPost;
            if (strArr != null) {
                httpGet = httpPost;
                if (strArr.length >= 2) {
                    if (strArr.length % 2 != 0) {
                        throw new IllegalArgumentException("Params must have an even number of elements.");
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                        int i3 = i2 + 1;
                        if (strArr[i3] != null) {
                            arrayList.add(new BasicNameValuePair(strArr[i2], strArr[i3]));
                        }
                    }
                    try {
                        httpPost.setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
                        httpGet = httpPost;
                    } catch (UnsupportedEncodingException e) {
                        throw new vt(e);
                    }
                }
            }
        }
        guVar.gn(httpGet);
        return new qt.g(httpGet, DW(guVar, httpGet));
    }

    public static Object Zo(a aVar, String str, String str2, int i, String[] strArr, gu guVar) {
        return v5(VH(aVar, str, str2, i, strArr, guVar).j6);
    }

    private static void gn(HttpClient httpClient, gu guVar) {
        String str;
        gu.b bVarDW = guVar.DW();
        if (bVarDW == null || (str = bVarDW.j6) == null || str.equals("")) {
            httpClient.getParams().removeParameter("http.route.default-proxy");
        } else {
            httpClient.getParams().setParameter("http.route.default-proxy", bVarDW.DW < 0 ? new HttpHost(bVarDW.j6) : new HttpHost(bVarDW.j6, bVarDW.DW));
        }
    }

    public static String j6(String str, int i, String str2, String[] strArr) {
        if (!str2.startsWith("/")) {
            str2 = "/" + str2;
        }
        try {
            String strReplace = URLEncoder.encode("/" + i + str2, "UTF-8").replace("%2F", "/");
            if (strArr != null && strArr.length > 0) {
                strReplace = strReplace + "?" + tp(strArr);
            }
            return "https://" + str + ":443" + strReplace.replace("+", "%20").replace("*", "%2A");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static String tp(String[] strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Params must have an even number of elements.");
        }
        boolean z = true;
        String str = "";
        for (int i = 0; i < strArr.length; i += 2) {
            try {
                int i2 = i + 1;
                if (strArr[i2] != null) {
                    if (z) {
                        z = false;
                    } else {
                        str = str + "&";
                    }
                    str = str + URLEncoder.encode(strArr[i], "UTF-8") + "=" + URLEncoder.encode(strArr[i2], "UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
        return str;
    }

    private static synchronized HttpClient u7(gu guVar) {
        HttpClient httpClientHw;
        httpClientHw = guVar.Hw();
        gn(httpClientHw, guVar);
        return httpClientHw;
    }

    public static Object v5(HttpResponse httpResponse) throws Throwable {
        Object objV5;
        BufferedReader bufferedReader = null;
        try {
            try {
                HttpEntity entity = httpResponse.getEntity();
                if (entity != null) {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(entity.getContent()), 16384);
                    try {
                        bufferedReader2.mark(16384);
                        objV5 = new gh0().v5(bufferedReader2);
                        bufferedReader = bufferedReader2;
                    } catch (hh0 unused) {
                        bufferedReader = bufferedReader2;
                        if (bu.DW(httpResponse)) {
                            throw new bu(httpResponse);
                        }
                        throw new xt(bufferedReader);
                    } catch (IOException e) {
                        e = e;
                        throw new wt(e);
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        throw new vt(e);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    objV5 = null;
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                int statusCode = httpResponse.getStatusLine().getStatusCode();
                if (statusCode == 200) {
                    return objV5;
                }
                if (statusCode == 401) {
                    throw new cu();
                }
                throw new bu(httpResponse, objV5);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (hh0 unused4) {
        } catch (IOException e3) {
            e = e3;
        } catch (OutOfMemoryError e4) {
            e = e4;
        }
    }
}
