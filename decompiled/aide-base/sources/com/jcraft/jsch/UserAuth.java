package com.jcraft.jsch;

/* loaded from: classes.dex */
public abstract class UserAuth {
    protected Packet DW;
    protected Buffer FH;
    protected String Hw;
    protected UserInfo j6;

    public boolean j6(Session session) {
        this.j6 = session.er();
        Packet packet = session.IS;
        this.DW = packet;
        this.FH = packet.j6();
        this.Hw = session.yS();
        return true;
    }
}
