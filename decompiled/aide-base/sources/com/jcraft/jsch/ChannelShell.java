package com.jcraft.jsch;

/* loaded from: classes.dex */
public class ChannelShell extends ChannelSession {
    ChannelShell() {
        this.Cz = true;
    }

    @Override // com.jcraft.jsch.Channel
    public void KD() throws JSchException {
        Session sessionMr = Mr();
        try {
            sh();
            new RequestShell().j6(sessionMr, this);
            if (this.w9.j6 != null) {
                Thread thread = new Thread(this);
                this.hK = thread;
                thread.setName("Shell for " + sessionMr.MP);
                boolean z = sessionMr.Jm;
                if (z) {
                    this.hK.setDaemon(z);
                }
                this.hK.start();
            }
        } catch (Exception e) {
            if (!(e instanceof JSchException)) {
                throw new JSchException("ChannelShell", e);
            }
            throw ((JSchException) e);
        }
    }

    @Override // com.jcraft.jsch.Channel
    void U2() {
        this.w9.tp(Mr().sM);
        this.w9.we(Mr().a5);
    }
}
