package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class wh extends FilterInputStream {
    private final HttpURLConnection WB;

    wh(HttpURLConnection httpURLConnection) {
        super(zg.FH(httpURLConnection));
        this.WB = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.WB.disconnect();
    }
}
