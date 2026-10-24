package com.jcraft.jsch;

/* loaded from: classes.dex */
public class ChannelSubsystem extends ChannelSession {
    boolean ys = false;
    boolean IS = false;
    boolean gG = true;
    String Nh = "";

    @Override // com.jcraft.jsch.Channel
    public void KD() throws JSchException {
        Session sessionMr = Mr();
        try {
            if (this.ys) {
                new RequestX11().j6(sessionMr, this);
            }
            if (this.IS) {
                new RequestPtyReq().j6(sessionMr, this);
            }
            new RequestSubsystem().v5(sessionMr, this, this.Nh, this.gG);
            if (this.w9.j6 != null) {
                Thread thread = new Thread(this);
                this.hK = thread;
                thread.setName("Subsystem for " + sessionMr.MP);
                boolean z = sessionMr.Jm;
                if (z) {
                    this.hK.setDaemon(z);
                }
                this.hK.start();
            }
        } catch (Exception e) {
            if (!(e instanceof JSchException)) {
                throw new JSchException("ChannelSubsystem", e);
            }
            throw ((JSchException) e);
        }
    }

    @Override // com.jcraft.jsch.Channel
    void U2() {
        this.w9.tp(Mr().sM);
        this.w9.we(Mr().a5);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public void dx(boolean z) {
        this.IS = z;
    }
}
