package abcd;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* loaded from: classes.dex */
public class fd0 implements be0 {
    private final ue0 DW;
    private final Session j6;

    public fd0(Session session, ue0 ue0Var) {
        this.j6 = session;
        this.DW = ue0Var;
    }

    public Channel Hw() {
        return this.j6.P8("sftp");
    }

    @Override // abcd.be0
    public void disconnect() throws IOException {
        if (this.j6.vy()) {
            this.j6.Ws();
        }
    }

    @Override // abcd.be0
    public Process j6(String str, int i) {
        return new a(this, str, i, null);
    }

    private class a extends Process {
        private final int DW;
        private InputStream FH;
        private OutputStream Hw;
        private ChannelExec j6;
        private InputStream v5;

        /* renamed from: abcd.fd0$a$a, reason: collision with other inner class name */
        class C0004a extends PipedOutputStream {
            private final /* synthetic */ wg0 mb;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0004a(PipedInputStream pipedInputStream, wg0 wg0Var) {
                super(pipedInputStream);
                this.mb = wg0Var;
            }

            @Override // java.io.PipedOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws InterruptedException, IOException {
                super.close();
                try {
                    this.mb.join(a.this.DW * 1000);
                } catch (InterruptedException unused) {
                }
            }

            @Override // java.io.PipedOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                super.flush();
                this.mb.j6();
            }
        }

        private a(fd0 fd0Var, String str, int i) throws j50 {
            this.DW = i;
            try {
                ChannelExec channelExec = (ChannelExec) fd0Var.j6.P8("exec");
                this.j6 = channelExec;
                channelExec.Sf(str);
                FH();
                this.j6.FH(this.DW > 0 ? this.DW * 1000 : 0);
                if (this.j6.a8()) {
                } else {
                    throw new j50(fd0Var.DW, "connection failed");
                }
            } catch (JSchException e) {
                throw new j50(fd0Var.DW, e.getMessage(), e);
            }
        }

        private boolean DW() {
            return this.j6.Ws() < 0 && this.j6.a8();
        }

        private void FH() {
            this.FH = this.j6.XL();
            OutputStream outputStreamAM = this.j6.aM();
            if (this.DW <= 0) {
                this.Hw = outputStreamAM;
            } else {
                PipedInputStream pipedInputStream = new PipedInputStream();
                wg0 wg0Var = new wg0(pipedInputStream, outputStreamAM);
                C0004a c0004a = new C0004a(pipedInputStream, wg0Var);
                wg0Var.start();
                this.Hw = c0004a;
            }
            this.v5 = this.j6.ef();
        }

        @Override // java.lang.Process
        public void destroy() {
            if (this.j6.a8()) {
                this.j6.VH();
            }
        }

        @Override // java.lang.Process
        public int exitValue() {
            if (DW()) {
                throw new IllegalStateException();
            }
            return this.j6.Ws();
        }

        @Override // java.lang.Process
        public InputStream getErrorStream() {
            return this.v5;
        }

        @Override // java.lang.Process
        public InputStream getInputStream() {
            return this.FH;
        }

        @Override // java.lang.Process
        public OutputStream getOutputStream() {
            return this.Hw;
        }

        @Override // java.lang.Process
        public int waitFor() throws InterruptedException {
            while (DW()) {
                Thread.sleep(100L);
            }
            return exitValue();
        }

        public /* synthetic */ a(fd0 fd0Var, String str, int i, a aVar) {
            this(fd0Var, str, i);
        }
    }
}
