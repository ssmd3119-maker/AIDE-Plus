package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class ChannelDirectTCPIP extends Channel {
    private static final byte[] pN = Util.aM("direct-tcpip");
    int fN;
    String pO;
    String Gj = "127.0.0.1";
    int Cz = 0;

    ChannelDirectTCPIP() {
        this.jw = pN;
        vy(131072);
        BT(131072);
        gW(16384);
    }

    @Override // com.jcraft.jsch.Channel
    protected Packet EQ() {
        Buffer buffer = new Buffer(this.pO.length() + 50 + this.Gj.length() + 84);
        Packet packet = new Packet(buffer);
        packet.FH();
        buffer.j3((byte) 90);
        buffer.er(this.jw);
        buffer.a8(this.WB);
        buffer.a8(this.qp);
        buffer.a8(this.k2);
        buffer.er(Util.aM(this.pO));
        buffer.a8(this.fN);
        buffer.er(Util.aM(this.Gj));
        buffer.a8(this.Cz);
        return packet;
    }

    @Override // com.jcraft.jsch.Channel
    public void FH(int i) {
        this.iW = i;
        try {
            Session sessionMr = Mr();
            if (!sessionMr.vy()) {
                throw new JSchException("session is down");
            }
            if (this.w9.j6 == null) {
                lg();
                return;
            }
            Thread thread = new Thread(this);
            this.hK = thread;
            thread.setName("DirectTCPIP thread " + sessionMr.j3());
            if (sessionMr.Jm) {
                this.hK.setDaemon(sessionMr.Jm);
            }
            this.hK.start();
        } catch (Exception e) {
            this.w9.j6();
            this.w9 = null;
            Channel.Hw(this);
            if (e instanceof JSchException) {
                throw ((JSchException) e);
            }
        }
    }

    public void Sf(int i) {
        this.fN = i;
    }

    @Override // com.jcraft.jsch.Channel
    void U2() {
        this.w9 = new IO();
    }

    public void cb(InputStream inputStream) {
        this.w9.tp(inputStream);
    }

    public void dx(String str) {
        this.Gj = str;
    }

    public void ef(OutputStream outputStream) {
        this.w9.we(outputStream);
    }

    @Override // com.jcraft.jsch.Channel, java.lang.Runnable
    public void run() throws IOException {
        try {
            lg();
            Buffer buffer = new Buffer(this.AL);
            Packet packet = new Packet(buffer);
            Session sessionMr = Mr();
            while (true) {
                if (!a8() || this.hK == null || this.w9 == null || this.w9.j6 == null) {
                    break;
                }
                int i = this.w9.j6.read(buffer.DW, 14, (buffer.DW.length - 14) - 84);
                if (i <= 0) {
                    u7();
                    break;
                }
                packet.FH();
                buffer.j3((byte) 94);
                buffer.a8(this.mb);
                buffer.a8(i);
                buffer.ei(i);
                synchronized (this) {
                    if (this.Z1) {
                        break;
                    } else {
                        sessionMr.XX(packet, this, i);
                    }
                }
            }
            u7();
            VH();
        } catch (Exception unused) {
            if (!this.n5) {
                this.n5 = true;
            }
            VH();
        }
    }

    public void sG(int i) {
        this.Cz = i;
    }

    public void sh(String str) {
        this.pO = str;
    }
}
