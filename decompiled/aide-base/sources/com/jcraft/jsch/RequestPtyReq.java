package com.jcraft.jsch;

/* loaded from: classes.dex */
public class RequestPtyReq extends Request {
    private String Hw = "vt100";
    private int v5 = 80;
    private int Zo = 24;
    private int VH = 640;
    private int gn = 480;
    private byte[] u7 = Util.FH;

    RequestPtyReq() {
    }

    void VH(byte[] bArr) {
        this.u7 = bArr;
    }

    void Zo(String str) {
        this.Hw = str;
    }

    @Override // com.jcraft.jsch.Request
    public void j6(Session session, Channel channel) {
        super.j6(session, channel);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.FH();
        buffer.j3((byte) 98);
        buffer.a8(channel.j3());
        buffer.er(Util.aM("pty-req"));
        buffer.j3(FH() ? (byte) 1 : (byte) 0);
        buffer.er(Util.aM(this.Hw));
        buffer.a8(this.v5);
        buffer.a8(this.Zo);
        buffer.a8(this.VH);
        buffer.a8(this.gn);
        buffer.er(this.u7);
        Hw(packet);
    }

    void v5(int i, int i2, int i3, int i4) {
        this.v5 = i;
        this.Zo = i2;
        this.VH = i3;
        this.gn = i4;
    }
}
