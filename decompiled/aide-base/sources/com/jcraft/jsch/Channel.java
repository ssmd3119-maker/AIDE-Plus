package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Vector;

/* loaded from: classes.dex */
public abstract class Channel implements Runnable {
    static int sE;
    private static Vector sg = new Vector();
    int WB;
    private Session eU;
    volatile boolean q7;
    volatile int mb = -1;
    protected byte[] jw = Util.aM("foo");
    volatile int fY = 1048576;
    volatile int qp = this.fY;
    volatile int k2 = 16384;
    volatile long zh = 0;
    volatile int AL = 0;
    IO w9 = null;
    Thread hK = null;
    volatile boolean cT = false;
    volatile boolean Z1 = false;
    volatile boolean n5 = false;
    volatile boolean Q6 = false;
    volatile int kf = -1;
    volatile int Jl = 0;
    volatile int iW = 0;
    int e3 = 0;

    class PassiveInputStream extends MyPipedInputStream {
        PipedOutputStream jw;

        PassiveInputStream(Channel channel, PipedOutputStream pipedOutputStream, int i) {
            super(channel, pipedOutputStream, i);
            this.jw = pipedOutputStream;
        }

        @Override // java.io.PipedInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            PipedOutputStream pipedOutputStream = this.jw;
            if (pipedOutputStream != null) {
                pipedOutputStream.close();
            }
            this.jw = null;
        }
    }

    Channel() {
        synchronized (sg) {
            int i = sE;
            sE = i + 1;
            this.WB = i;
            sg.addElement(this);
        }
    }

    static void Hw(Channel channel) {
        synchronized (sg) {
            sg.removeElement(channel);
        }
    }

    static Channel J0(String str) {
        if (str.equals("session")) {
            return new ChannelSession();
        }
        if (str.equals("shell")) {
            return new ChannelShell();
        }
        if (str.equals("exec")) {
            return new ChannelExec();
        }
        if (str.equals("x11")) {
            return new ChannelX11();
        }
        if (str.equals("auth-agent@openssh.com")) {
            return new ChannelAgentForwarding();
        }
        if (str.equals("direct-tcpip")) {
            return new ChannelDirectTCPIP();
        }
        if (str.equals("forwarded-tcpip")) {
            return new ChannelForwardedTCPIP();
        }
        if (str.equals("sftp")) {
            return new ChannelSftp();
        }
        if (str.equals("subsystem")) {
            return new ChannelSubsystem();
        }
        return null;
    }

    static void gn(Session session) {
        Channel[] channelArr;
        int i;
        int i2;
        synchronized (sg) {
            channelArr = new Channel[sg.size()];
            i2 = 0;
            for (int i3 = 0; i3 < sg.size(); i3++) {
                try {
                    Channel channel = (Channel) sg.elementAt(i3);
                    if (channel.eU == session) {
                        int i4 = i2 + 1;
                        try {
                            channelArr[i2] = channel;
                        } catch (Exception unused) {
                        }
                        i2 = i4;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        for (i = 0; i < i2; i++) {
            channelArr[i].VH();
        }
    }

    static Channel we(int i, Session session) {
        synchronized (sg) {
            for (int i2 = 0; i2 < sg.size(); i2++) {
                Channel channel = (Channel) sg.elementAt(i2);
                if (channel.WB == i && channel.eU == session) {
                    return channel;
                }
            }
            return null;
        }
    }

    void BT(int i) {
        this.qp = i;
    }

    void DW() {
        if (this.Z1) {
            return;
        }
        this.Z1 = true;
        this.cT = true;
        int iJ3 = j3();
        if (iJ3 == -1) {
            return;
        }
        try {
            Buffer buffer = new Buffer(100);
            Packet packet = new Packet(buffer);
            packet.FH();
            buffer.j3((byte) 97);
            buffer.a8(iJ3);
            synchronized (this) {
                Mr().br(packet);
            }
        } catch (Exception unused) {
        }
    }

    protected Packet EQ() {
        Buffer buffer = new Buffer(100);
        Packet packet = new Packet(buffer);
        packet.FH();
        buffer.j3((byte) 90);
        buffer.er(this.jw);
        buffer.a8(this.WB);
        buffer.a8(this.qp);
        buffer.a8(this.k2);
        return packet;
    }

    public void FH(int i) throws JSchException {
        this.iW = i;
        try {
            lg();
            KD();
        } catch (Exception e) {
            this.n5 = false;
            VH();
            if (!(e instanceof JSchException)) {
                throw new JSchException(e.toString(), e);
            }
            throw ((JSchException) e);
        }
    }

    void J8(Buffer buffer) {
        P8(buffer.u7());
        nw(buffer.aM());
        ei(buffer.u7());
    }

    public void KD() {
    }

    public Session Mr() throws JSchException {
        Session session = this.eU;
        if (session != null) {
            return session;
        }
        throw new JSchException("session is not available");
    }

    synchronized void P8(int i) {
        this.mb = i;
        if (this.e3 > 0) {
            notifyAll();
        }
    }

    public InputStream QX() throws NumberFormatException {
        int i;
        try {
            i = Integer.parseInt(Mr().aM("max_input_buffer_size"));
        } catch (Exception unused) {
            i = 32768;
        }
        MyPipedInputStream myPipedInputStream = new MyPipedInputStream(this, 32768, i);
        this.w9.u7(new PassiveOutputStream(this, myPipedInputStream, 32768 < i), false);
        return myPipedInputStream;
    }

    void SI(Session session) {
        this.eU = session;
    }

    void U2() {
    }

    public void VH() {
        try {
            synchronized (this) {
                if (this.n5) {
                    this.n5 = false;
                    DW();
                    this.cT = true;
                    this.hK = null;
                    try {
                        if (this.w9 != null) {
                            this.w9.j6();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } finally {
            Hw(this);
        }
    }

    public int Ws() {
        return this.kf;
    }

    public InputStream XL() throws NumberFormatException {
        int i;
        try {
            i = Integer.parseInt(Mr().aM("max_input_buffer_size"));
        } catch (Exception unused) {
            i = 32768;
        }
        MyPipedInputStream myPipedInputStream = new MyPipedInputStream(this, 32768, i);
        this.w9.J0(new PassiveOutputStream(this, myPipedInputStream, 32768 < i), false);
        return myPipedInputStream;
    }

    public boolean a8() {
        Session session = this.eU;
        return session != null && session.vy() && this.n5;
    }

    public OutputStream aM() {
        return new OutputStream() { // from class: com.jcraft.jsch.Channel.1
            private int WB = 0;
            private Buffer mb = null;
            private Packet jw = null;
            private boolean fY = false;
            byte[] qp = new byte[1];

            private synchronized void j6() {
                this.mb = new Buffer(Channel.this.AL);
                this.jw = new Packet(this.mb);
                if ((this.mb.DW.length - 14) - 84 <= 0) {
                    this.mb = null;
                    this.jw = null;
                    throw new IOException("failed to initialize the channel.");
                }
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (this.jw == null) {
                    try {
                        j6();
                    } catch (IOException unused) {
                        return;
                    }
                }
                if (this.fY) {
                    return;
                }
                if (this.WB > 0) {
                    flush();
                }
                this.u7();
                this.fY = true;
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                if (this.fY) {
                    throw new IOException("Already closed");
                }
                if (this.WB == 0) {
                    return;
                }
                this.jw.FH();
                this.mb.j3((byte) 94);
                this.mb.a8(Channel.this.mb);
                this.mb.a8(this.WB);
                this.mb.ei(this.WB);
                try {
                    int i = this.WB;
                    this.WB = 0;
                    synchronized (this) {
                        if (!this.Z1) {
                            Channel.this.Mr().XX(this.jw, this, i);
                        }
                    }
                } catch (Exception e) {
                    close();
                    throw new IOException(e.toString());
                }
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                byte[] bArr = this.qp;
                bArr[0] = (byte) i;
                write(bArr, 0, 1);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                if (this.jw == null) {
                    j6();
                }
                if (!this.fY) {
                    byte[] bArr2 = this.mb.DW;
                    int length = bArr2.length;
                    while (i2 > 0) {
                        int i3 = i2 > (length - (this.WB + 14)) + (-84) ? (length - (r2 + 14)) - 84 : i2;
                        if (i3 <= 0) {
                            flush();
                        } else {
                            System.arraycopy(bArr, i, bArr2, this.WB + 14, i3);
                            this.WB += i3;
                            i += i3;
                            i2 -= i3;
                        }
                    }
                    return;
                }
                throw new IOException("Already closed");
            }
        };
    }

    void cn(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.w9.VH(bArr, i, i2);
        } catch (NullPointerException unused) {
        }
    }

    void ei(int i) {
        this.AL = i;
    }

    protected void er(int i) {
        try {
            Buffer buffer = new Buffer(100);
            Packet packet = new Packet(buffer);
            packet.FH();
            buffer.j3((byte) 92);
            buffer.a8(j3());
            buffer.a8(i);
            buffer.er(Util.aM("open failed"));
            buffer.er(Util.FH);
            Mr().br(packet);
        } catch (Exception unused) {
        }
    }

    void gW(int i) {
        this.k2 = i;
    }

    int j3() {
        return this.mb;
    }

    synchronized void j6(long j) {
        this.zh += j;
        if (this.e3 > 0) {
            notifyAll();
        }
    }

    protected void lg() throws JSchException {
        Session sessionMr = Mr();
        if (!sessionMr.vy()) {
            throw new JSchException("session is down");
        }
        sessionMr.br(EQ());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.iW;
        int i = j != 0 ? 1 : 2000;
        synchronized (this) {
            while (j3() == -1 && sessionMr.vy() && i > 0) {
                if (j <= 0 || System.currentTimeMillis() - jCurrentTimeMillis <= j) {
                    long j2 = j == 0 ? 10L : j;
                    try {
                        this.e3 = 1;
                        wait(j2);
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        this.e3 = 0;
                        throw th;
                    }
                    this.e3 = 0;
                    i--;
                } else {
                    i = 0;
                }
            }
        }
        if (!sessionMr.vy()) {
            throw new JSchException("session is down");
        }
        if (j3() == -1) {
            throw new JSchException("channel is not opened.");
        }
        if (!this.Q6) {
            throw new JSchException("channel is not opened.");
        }
        this.n5 = true;
    }

    synchronized void nw(long j) {
        this.zh = j;
    }

    protected void rN() {
        Buffer buffer = new Buffer(100);
        Packet packet = new Packet(buffer);
        packet.FH();
        buffer.j3((byte) 91);
        buffer.a8(j3());
        buffer.a8(this.WB);
        buffer.a8(this.qp);
        buffer.a8(this.k2);
        Mr().br(packet);
    }

    void ro(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.w9.Zo(bArr, i, i2);
        } catch (NullPointerException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    void tp() throws IOException {
        try {
            this.w9.Hw();
        } catch (NullPointerException unused) {
        }
    }

    void u7() {
        if (this.cT) {
            return;
        }
        this.cT = true;
        int iJ3 = j3();
        if (iJ3 == -1) {
            return;
        }
        try {
            Buffer buffer = new Buffer(100);
            Packet packet = new Packet(buffer);
            packet.FH();
            buffer.j3((byte) 96);
            buffer.a8(iJ3);
            synchronized (this) {
                if (!this.Z1) {
                    Mr().br(packet);
                }
            }
        } catch (Exception unused) {
        }
    }

    void vy(int i) {
        this.fY = i;
    }

    void yS(int i) {
        this.kf = i;
    }

    class PassiveOutputStream extends PipedOutputStream {
        private MyPipedInputStream WB;

        PassiveOutputStream(Channel channel, PipedInputStream pipedInputStream, boolean z) {
            super(pipedInputStream);
            this.WB = null;
            if (z && (pipedInputStream instanceof MyPipedInputStream)) {
                this.WB = (MyPipedInputStream) pipedInputStream;
            }
        }

        @Override // java.io.PipedOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            MyPipedInputStream myPipedInputStream = this.WB;
            if (myPipedInputStream != null) {
                myPipedInputStream.j6(1);
            }
            super.write(i);
        }

        @Override // java.io.PipedOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            MyPipedInputStream myPipedInputStream = this.WB;
            if (myPipedInputStream != null) {
                myPipedInputStream.j6(i2);
            }
            super.write(bArr, i, i2);
        }
    }

    class MyPipedInputStream extends PipedInputStream {
        private int WB;
        private int mb;

        MyPipedInputStream(Channel channel, int i) {
            this.WB = 1024;
            this.mb = 1024;
            ((PipedInputStream) this).buffer = new byte[i];
            this.WB = i;
            this.mb = i;
        }

        private int DW() {
            int length = ((PipedInputStream) this).out;
            int i = ((PipedInputStream) this).in;
            if (length < i) {
                length = ((PipedInputStream) this).buffer.length;
            } else {
                if (i >= length) {
                    return 0;
                }
                if (i == -1) {
                    return ((PipedInputStream) this).buffer.length;
                }
            }
            return length - i;
        }

        public synchronized void FH() {
            if (available() != 0) {
                return;
            }
            ((PipedInputStream) this).in = 0;
            ((PipedInputStream) this).out = 0;
            byte[] bArr = ((PipedInputStream) this).buffer;
            ((PipedInputStream) this).in = 0 + 1;
            bArr[0] = 0;
            read();
        }

        synchronized void j6(int i) {
            int iDW = DW();
            if (iDW < i) {
                int length = ((PipedInputStream) this).buffer.length - iDW;
                int length2 = ((PipedInputStream) this).buffer.length;
                while (length2 - length < i) {
                    length2 *= 2;
                }
                if (length2 > this.mb) {
                    length2 = this.mb;
                }
                if (length2 - length < i) {
                    return;
                }
                byte[] bArr = new byte[length2];
                if (((PipedInputStream) this).out < ((PipedInputStream) this).in) {
                    System.arraycopy(((PipedInputStream) this).buffer, 0, bArr, 0, ((PipedInputStream) this).buffer.length);
                } else if (((PipedInputStream) this).in < ((PipedInputStream) this).out) {
                    if (((PipedInputStream) this).in != -1) {
                        System.arraycopy(((PipedInputStream) this).buffer, 0, bArr, 0, ((PipedInputStream) this).in);
                        System.arraycopy(((PipedInputStream) this).buffer, ((PipedInputStream) this).out, bArr, length2 - (((PipedInputStream) this).buffer.length - ((PipedInputStream) this).out), ((PipedInputStream) this).buffer.length - ((PipedInputStream) this).out);
                        ((PipedInputStream) this).out = length2 - (((PipedInputStream) this).buffer.length - ((PipedInputStream) this).out);
                    }
                } else if (((PipedInputStream) this).in == ((PipedInputStream) this).out) {
                    System.arraycopy(((PipedInputStream) this).buffer, 0, bArr, 0, ((PipedInputStream) this).buffer.length);
                    ((PipedInputStream) this).in = ((PipedInputStream) this).buffer.length;
                }
                ((PipedInputStream) this).buffer = bArr;
            } else if (((PipedInputStream) this).buffer.length == iDW && iDW > this.WB) {
                int i2 = iDW / 2;
                if (i2 < this.WB) {
                    i2 = this.WB;
                }
                ((PipedInputStream) this).buffer = new byte[i2];
            }
        }

        MyPipedInputStream(Channel channel, int i, int i2) {
            this(channel, i);
            this.mb = i2;
        }

        MyPipedInputStream(Channel channel, PipedOutputStream pipedOutputStream, int i) {
            super(pipedOutputStream);
            this.WB = 1024;
            this.mb = 1024;
            ((PipedInputStream) this).buffer = new byte[i];
            this.WB = i;
        }
    }
}
