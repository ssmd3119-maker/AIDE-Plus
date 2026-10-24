package com.jcraft.jsch;

/* loaded from: classes.dex */
public class RequestExec extends Request {
    private byte[] Hw;

    RequestExec(byte[] bArr) {
        this.Hw = new byte[0];
        this.Hw = bArr;
    }

    @Override // com.jcraft.jsch.Request
    public void j6(Session session, Channel channel) {
        super.j6(session, channel);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.FH();
        buffer.j3((byte) 98);
        buffer.a8(channel.j3());
        buffer.er(Util.aM("exec"));
        buffer.j3(FH() ? (byte) 1 : (byte) 0);
        buffer.j6(this.Hw.length + 4);
        buffer.er(this.Hw);
        Hw(packet);
    }
}
