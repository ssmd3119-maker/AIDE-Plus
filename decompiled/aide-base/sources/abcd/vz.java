package abcd;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public class vz {
    private final boolean DW;
    private RandomAccessFile FH;
    private FileLock Hw;
    private final File j6;

    public vz(File file, boolean z) {
        this.j6 = file;
        this.DW = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void DW() {
        RandomAccessFile randomAccessFile = this.FH;
        if (randomAccessFile == null) {
            return;
        }
        try {
            randomAccessFile.close();
        } finally {
            this.FH = null;
            this.Hw = null;
        }
    }

    public void j6() throws IOException {
        if (this.Hw != null) {
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.j6, "rw");
        this.FH = randomAccessFile;
        try {
            this.Hw = randomAccessFile.getChannel().lock(0L, Long.MAX_VALUE, this.DW);
        } catch (IOException e) {
            try {
                this.FH.close();
            } catch (IOException unused) {
            }
            this.FH = null;
            throw e;
        }
    }
}
