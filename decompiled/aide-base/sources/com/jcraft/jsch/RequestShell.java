package com.jcraft.jsch;

/* loaded from: classes.dex */
public class RequestShell extends Request {
    RequestShell() {
    }

    @Override // com.jcraft.jsch.Request
    public void j6(Session session, Channel channel) throws InterruptedException, JSchException {
        super.j6(session, channel);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.FH();
        buffer.j3((byte) 98);
        buffer.a8(channel.j3());
        buffer.er(Util.aM("shell"));
        buffer.j3(FH() ? (byte) 1 : (byte) 0);
        Hw(packet);
    }
}
