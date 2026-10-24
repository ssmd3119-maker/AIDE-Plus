package com.jcraft.jsch;

/* loaded from: classes.dex */
public class RequestSubsystem extends Request {
    private String Hw = null;

    @Override // com.jcraft.jsch.Request
    public void j6(Session session, Channel channel) throws InterruptedException, JSchException {
        super.j6(session, channel);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.FH();
        buffer.j3((byte) 98);
        buffer.a8(channel.j3());
        buffer.er(Util.aM("subsystem"));
        buffer.j3(FH() ? (byte) 1 : (byte) 0);
        buffer.er(Util.aM(this.Hw));
        Hw(packet);
    }

    public void v5(Session session, Channel channel, String str, boolean z) throws InterruptedException, JSchException {
        DW(z);
        this.Hw = str;
        j6(session, channel);
    }
}
