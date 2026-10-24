package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes.dex */
public final class z5 extends a7 {
    private final yf j6;

    z5(yf yfVar) {
        this.j6 = yfVar;
    }

    @Override // com.google.android.gms.internal.ads.a7
    public final xe DW(bq0<?> bq0Var, Map<String, String> map) throws IOException {
        try {
            HttpResponse httpResponseJ6 = this.j6.j6(bq0Var, map);
            int statusCode = httpResponseJ6.getStatusLine().getStatusCode();
            Header[] allHeaders = httpResponseJ6.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new yj0(header.getName(), header.getValue()));
            }
            if (httpResponseJ6.getEntity() == null) {
                return new xe(statusCode, arrayList);
            }
            long contentLength = httpResponseJ6.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new xe(statusCode, arrayList, (int) httpResponseJ6.getEntity().getContentLength(), httpResponseJ6.getEntity().getContent());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(contentLength);
            throw new IOException(sb.toString());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
