package abcd;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class ah0 extends InputStream {
    private static final InputStream mb = new a();
    private final LinkedList<InputStream> WB = new LinkedList<>();

    class a extends InputStream {
        @Override // java.io.InputStream
        public int read() {
            return -1;
        }
    }

    public ah0(InputStream... inputStreamArr) {
        for (InputStream inputStream : inputStreamArr) {
            j6(inputStream);
        }
    }

    private InputStream DW() {
        return this.WB.isEmpty() ? mb : this.WB.getFirst();
    }

    private void FH() throws IOException {
        if (this.WB.isEmpty()) {
            return;
        }
        this.WB.removeFirst().close();
    }

    @Override // java.io.InputStream
    public int available() {
        return DW().available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Iterator<InputStream> it = this.WB.iterator();
        IOException e = null;
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException e2) {
                e = e2;
            }
            it.remove();
        }
        if (e != null) {
            throw e;
        }
    }

    public void j6(InputStream inputStream) {
        this.WB.add(inputStream);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStreamDW = DW();
            int i = inputStreamDW.read();
            if (i >= 0) {
                return i;
            }
            if (inputStreamDW == mb) {
                return -1;
            }
            FH();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        while (0 < j) {
            InputStream inputStreamDW = DW();
            long jSkip = inputStreamDW.skip(j);
            if (0 < jSkip) {
                j2 += jSkip;
                j -= jSkip;
            } else {
                if (inputStreamDW == mb) {
                    return j2;
                }
                if (inputStreamDW.read() < 0) {
                    FH();
                    if (0 < j2) {
                        break;
                    }
                } else {
                    j2++;
                    j--;
                }
            }
        }
        return j2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i2 > 0) {
            InputStream inputStreamDW = DW();
            int i4 = inputStreamDW.read(bArr, i, i2);
            if (i4 > 0) {
                i3 += i4;
                i += i4;
                i2 -= i4;
            } else {
                if (inputStreamDW == mb) {
                    if (i3 > 0) {
                        return i3;
                    }
                    return -1;
                }
                FH();
                if (i3 > 0) {
                    break;
                }
            }
        }
        return i3;
    }
}
