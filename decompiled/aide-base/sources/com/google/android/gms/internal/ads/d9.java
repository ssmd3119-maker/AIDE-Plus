package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class d9 {
    private static final Charset j6 = Charset.forName("UTF-8");
    public static final b9<JSONObject> DW = new f9();

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.b9<org.json.JSONObject>, com.google.android.gms.internal.ads.f9] */
    static {
        z8 z8Var = e9.j6;
    }

    static final /* synthetic */ InputStream j6(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(j6));
    }
}
