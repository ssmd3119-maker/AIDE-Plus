package org.codehaus.groovy.control.io;

import java.io.Writer;

/* loaded from: classes.dex */
public class NullWriter extends Writer {
    public static final NullWriter WB = new NullWriter();

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
    }
}
