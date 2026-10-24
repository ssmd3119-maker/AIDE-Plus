package com.jcraft.jsch;

/* loaded from: classes.dex */
public class RequestX11 extends Request {
    RequestX11() {
    }

    @Override // com.jcraft.jsch.Request
    public void j6(Session session, Channel channel) {
        super.j6(session, channel);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.FH();
        buffer.j3((byte) 98);
        buffer.a8(channel.j3());
        buffer.er(Util.aM("x11-req"));
        buffer.j3(FH() ? (byte) 1 : (byte) 0);
        buffer.j3((byte) 0);
        buffer.er(Util.aM("MIT-MAGIC-COOKIE-1"));
        buffer.er(ChannelX11.dx(session));
        buffer.a8(0);
        Hw(packet);
        session.e9 = true;
    }
}
