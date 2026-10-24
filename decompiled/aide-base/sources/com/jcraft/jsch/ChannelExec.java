package com.jcraft.jsch;

import java.io.InputStream;

/* loaded from: classes.dex */
public class ChannelExec extends ChannelSession {
    byte[] ys = new byte[0];

    @Override // com.jcraft.jsch.Channel
    public void KD() throws JSchException {
        Session sessionMr = Mr();
        try {
            sh();
            new RequestExec(this.ys).j6(sessionMr, this);
            if (this.w9.j6 != null) {
                Thread thread = new Thread(this);
                this.hK = thread;
                thread.setName("Exec thread " + sessionMr.j3());
                boolean z = sessionMr.Jm;
                if (z) {
                    this.hK.setDaemon(z);
                }
                this.hK.start();
            }
        } catch (Exception e) {
            if (!(e instanceof JSchException)) {
                throw new JSchException("ChannelExec", e);
            }
            throw ((JSchException) e);
        }
    }

    public void Sf(String str) {
        this.ys = Util.aM(str);
    }

    @Override // com.jcraft.jsch.Channel
    void U2() {
        this.w9.tp(Mr().sM);
        this.w9.we(Mr().a5);
    }

    public InputStream ef() {
        return QX();
    }
}
