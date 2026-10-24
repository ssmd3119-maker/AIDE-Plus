package abcd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class sa0 {
    static final FilenameFilter u7 = new a();
    private final File DW;
    private boolean FH;
    private FileOutputStream Hw;
    private ma0 VH;
    private boolean Zo;
    private final wf0 gn;
    private final File j6;
    private boolean v5;

    class a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return !str.endsWith(".lock");
        }
    }

    class b extends OutputStream {
        private final /* synthetic */ OutputStream mb;

        public b(OutputStream outputStream) {
            this.mb = outputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                if (sa0.this.Zo) {
                    sa0.this.Hw.getChannel().force(true);
                }
                this.mb.close();
                sa0.this.Hw = null;
            } catch (IOException e) {
                sa0.this.QX();
                throw e;
            } catch (Error e2) {
                sa0.this.QX();
                throw e2;
            } catch (RuntimeException e3) {
                sa0.this.QX();
                throw e3;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.mb.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.mb.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.mb.write(i);
        }
    }

    public sa0(File file, wf0 wf0Var) {
        this.j6 = file;
        this.DW = VH(file);
        this.gn = wf0Var;
    }

    private void EQ() {
        if (this.Hw != null) {
            return;
        }
        QX();
        throw new IllegalStateException(MessageFormat.format(JGitText.DW().lockOnNotHeld, this.j6));
    }

    public static File VH(File file) {
        return new File(file.getParentFile(), String.valueOf(file.getName()) + ".lock");
    }

    private boolean tp() throws InterruptedException {
        if (!this.gn.gn()) {
            return this.DW.renameTo(this.j6);
        }
        for (int i = 0; i < 10; i++) {
            if (this.DW.renameTo(this.j6)) {
                return true;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
                return false;
            }
        }
        return false;
    }

    private boolean v5() throws InterruptedException {
        if (!this.gn.gn()) {
            return this.j6.delete();
        }
        for (int i = 0; i < 10; i++) {
            if (this.j6.delete()) {
                return true;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
                return false;
            }
        }
        return false;
    }

    private void we() {
        if (this.v5) {
            this.VH = ma0.Zo(this.DW);
        }
    }

    public boolean Hw() {
        if (this.Hw != null) {
            QX();
            throw new IllegalStateException(MessageFormat.format(JGitText.DW().lockOnNotClosed, this.j6));
        }
        we();
        if (this.DW.renameTo(this.j6)) {
            return true;
        }
        if ((!this.j6.exists() || v5()) && tp()) {
            return true;
        }
        QX();
        return false;
    }

    public void J0(boolean z) {
        this.Zo = z;
    }

    public void J8(boolean z) {
        this.v5 = z;
    }

    public void QX() {
        FileOutputStream fileOutputStream = this.Hw;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            this.Hw = null;
        }
        if (this.FH) {
            this.FH = false;
            try {
                cg0.DW(this.DW, 2);
            } catch (IOException unused2) {
            }
        }
    }

    public void Ws(boolean z) {
        J8(z);
    }

    public void XL() throws InterruptedException {
        ma0 ma0VarZo = ma0.Zo(this.j6);
        ma0 ma0VarZo2 = ma0.Zo(this.DW);
        while (ma0VarZo.j6(ma0VarZo2)) {
            Thread.sleep(25L);
            this.DW.setLastModified(System.currentTimeMillis());
            ma0VarZo2 = ma0.Zo(this.DW);
        }
    }

    public ma0 Zo() {
        return this.VH;
    }

    public void aM(a70 a70Var) throws IOException {
        byte[] bArr = new byte[41];
        a70Var.J0(bArr, 0);
        bArr[40] = 10;
        j3(bArr);
    }

    public OutputStream gn() {
        EQ();
        return new b(this.Zo ? Channels.newOutputStream(this.Hw.getChannel()) : this.Hw);
    }

    public void j3(byte[] bArr) throws IOException {
        EQ();
        try {
            if (this.Zo) {
                FileChannel channel = this.Hw.getChannel();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                while (byteBufferWrap.remaining() > 0) {
                    channel.write(byteBufferWrap);
                }
                channel.force(true);
            } else {
                this.Hw.write(bArr);
            }
            this.Hw.close();
            this.Hw = null;
        } catch (IOException e) {
            QX();
            throw e;
        } catch (Error e2) {
            QX();
            throw e2;
        } catch (RuntimeException e3) {
            QX();
            throw e3;
        }
    }

    public String toString() {
        return "LockFile[" + this.DW + ", haveLck=" + this.FH + "]";
    }

    public boolean u7() throws IOException {
        cg0.Zo(this.DW.getParentFile(), true);
        if (this.DW.createNewFile()) {
            this.FH = true;
            try {
                this.Hw = new FileOutputStream(this.DW);
            } catch (IOException e) {
                QX();
                throw e;
            }
        }
        return this.FH;
    }
}
