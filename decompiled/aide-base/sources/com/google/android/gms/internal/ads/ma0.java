package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ma0 extends Closeable {
    void VH(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long position();

    int read(ByteBuffer byteBuffer);

    long size();

    ByteBuffer v5(long j, long j2);
}
