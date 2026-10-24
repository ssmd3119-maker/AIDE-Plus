package androidx.core.util;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public class LogWriter extends Writer {
    private final String WB;
    private StringBuilder mb = new StringBuilder(128);

    public LogWriter(String str) {
        this.WB = str;
    }

    private void j6() {
        if (this.mb.length() > 0) {
            Log.d(this.WB, this.mb.toString());
            StringBuilder sb = this.mb;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j6();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        j6();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                j6();
            } else {
                this.mb.append(c);
            }
        }
    }
}
