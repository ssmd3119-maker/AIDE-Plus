package abcd;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class wg0 extends Thread {
    private final InputStream WB;
    private volatile boolean jw;
    private final OutputStream mb;

    public wg0(InputStream inputStream, OutputStream outputStream) {
        setName(String.valueOf(Thread.currentThread().getName()) + "-StreamCopy");
        this.WB = inputStream;
        this.mb = outputStream;
    }

    public void DW() throws InterruptedException {
        while (true) {
            join(250L);
            if (!isAlive()) {
                return;
            }
            this.jw = true;
            interrupt();
        }
    }

    public void j6() {
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws IOException {
        int i;
        try {
            byte[] bArr = new byte[1024];
            int i2 = 0;
            while (true) {
                if (i2 > 0) {
                    try {
                        this.mb.flush();
                        i2--;
                    } catch (IOException unused) {
                    }
                }
                if (!this.jw) {
                    try {
                        i = this.WB.read(bArr);
                    } catch (InterruptedIOException unused2) {
                        i2++;
                    }
                    if (i >= 0) {
                        boolean z = false;
                        while (true) {
                            try {
                                this.mb.write(bArr, 0, i);
                                break;
                            } catch (InterruptedIOException unused3) {
                                z = true;
                            }
                        }
                        if (z) {
                            interrupt();
                        }
                    }
                }
                try {
                    this.WB.close();
                } catch (IOException unused4) {
                }
                try {
                    this.mb.close();
                    return;
                } catch (IOException unused5) {
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                this.WB.close();
            } catch (IOException unused6) {
            }
            try {
                this.mb.close();
            } catch (IOException unused7) {
            }
            throw th;
        }
    }
}
