package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* loaded from: classes.dex */
public abstract class a7 implements yf {
    public abstract xe DW(bq0<?> bq0Var, Map<String, String> map);

    @Override // com.google.android.gms.internal.ads.yf
    @Deprecated
    public final HttpResponse j6(bq0<?> bq0Var, Map<String, String> map) {
        xe xeVarDW = DW(bq0Var, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), xeVarDW.FH(), ""));
        ArrayList arrayList = new ArrayList();
        for (yj0 yj0Var : xeVarDW.Hw()) {
            arrayList.add(new BasicHeader(yj0Var.j6(), yj0Var.DW()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream inputStreamJ6 = xeVarDW.j6();
        if (inputStreamJ6 != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(inputStreamJ6);
            basicHttpEntity.setContentLength(xeVarDW.DW());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
