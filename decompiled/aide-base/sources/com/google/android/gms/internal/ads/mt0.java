package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes.dex */
public final class mt0 extends PushbackInputStream {
    private final /* synthetic */ jt0 WB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    mt0(jt0 jt0Var, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.WB = jt0Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.WB.jw.j6();
        super.close();
    }
}
