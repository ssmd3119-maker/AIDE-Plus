package com.jcraft.jsch;

/* loaded from: classes.dex */
public class RequestEnv extends Request {
    byte[] Hw = new byte[0];
    byte[] v5 = new byte[0];

    RequestEnv() {
    }

    @Override // com.jcraft.jsch.Request
    public void j6(Session session, Channel channel) {
        super.j6(session, channel);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.FH();
        buffer.j3((byte) 98);
        buffer.a8(channel.j3());
        buffer.er(Util.aM("env"));
        buffer.j3(FH() ? (byte) 1 : (byte) 0);
        buffer.er(this.Hw);
        buffer.er(this.v5);
        Hw(packet);
    }

    void v5(byte[] bArr, byte[] bArr2) {
        this.Hw = bArr;
        this.v5 = bArr2;
    }
}
