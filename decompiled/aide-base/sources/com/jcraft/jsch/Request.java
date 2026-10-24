package com.jcraft.jsch;

/* loaded from: classes.dex */
public abstract class Request {
    private boolean j6 = false;
    private Session DW = null;
    private Channel FH = null;

    Request() {
    }

    void DW(boolean z) {
        this.j6 = z;
    }

    boolean FH() {
        return this.j6;
    }

    void Hw(Packet packet) throws InterruptedException, JSchException {
        if (this.j6) {
            this.FH.Jl = -1;
        }
        this.DW.br(packet);
        if (this.j6) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.FH.iW;
            while (this.FH.a8() && this.FH.Jl == -1) {
                try {
                    Thread.sleep(10L);
                } catch (Exception unused) {
                }
                if (j > 0 && System.currentTimeMillis() - jCurrentTimeMillis > j) {
                    this.FH.Jl = 0;
                    throw new JSchException("channel request: timeout");
                }
            }
            if (this.FH.Jl == 0) {
                throw new JSchException("failed to send channel request");
            }
        }
    }

    void j6(Session session, Channel channel) {
        this.DW = session;
        this.FH = channel;
        if (channel.iW > 0) {
            DW(true);
        }
    }
}
