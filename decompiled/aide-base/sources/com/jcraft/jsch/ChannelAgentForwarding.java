package com.jcraft.jsch;

import java.io.IOException;
import java.util.Vector;

/* loaded from: classes.dex */
public class ChannelAgentForwarding extends Channel {
    private Buffer Cz;
    private Buffer pO;
    private Buffer fN = null;
    private Packet Gj = null;

    ChannelAgentForwarding() {
        this.pO = null;
        this.Cz = null;
        vy(131072);
        BT(131072);
        gW(16384);
        this.jw = Util.aM("auth-agent@openssh.com");
        Buffer buffer = new Buffer();
        this.pO = buffer;
        buffer.gW();
        this.Cz = new Buffer();
        this.n5 = true;
    }

    private void sh(byte[] bArr) {
        this.Gj.FH();
        this.fN.j3((byte) 94);
        this.fN.a8(this.mb);
        this.fN.a8(bArr.length + 4);
        this.fN.er(bArr);
        try {
            Mr().XX(this.Gj, this, bArr.length + 4);
        } catch (Exception unused) {
        }
    }

    @Override // com.jcraft.jsch.Channel
    void ro(byte[] bArr, int i, int i2) throws IOException {
        Identity identity;
        String strDW;
        if (this.Gj == null) {
            this.fN = new Buffer(this.AL);
            this.Gj = new Packet(this.fN);
        }
        this.pO.P8();
        Buffer buffer = this.pO;
        byte[] bArr2 = buffer.DW;
        int i3 = 0;
        if (bArr2.length < buffer.FH + i2) {
            byte[] bArr3 = new byte[buffer.Hw + i2];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            this.pO.DW = bArr3;
        }
        this.pO.U2(bArr, i, i2);
        if (this.pO.u7() > this.pO.tp()) {
            Buffer buffer2 = this.pO;
            buffer2.Hw -= 4;
            return;
        }
        int iFH = this.pO.FH();
        try {
            Session sessionMr = Mr();
            IdentityRepository identityRepositoryU2 = sessionMr.U2();
            UserInfo userInfoEr = sessionMr.er();
            this.Cz.gW();
            if (iFH == 11) {
                this.Cz.j3((byte) 12);
                Vector vectorJ6 = identityRepositoryU2.j6();
                synchronized (vectorJ6) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < vectorJ6.size(); i5++) {
                        if (((Identity) vectorJ6.elementAt(i5)).FH() != null) {
                            i4++;
                        }
                    }
                    this.Cz.a8(i4);
                    while (i3 < vectorJ6.size()) {
                        byte[] bArrFH = ((Identity) vectorJ6.elementAt(i3)).FH();
                        if (bArrFH != null) {
                            this.Cz.er(bArrFH);
                            this.Cz.er(Util.FH);
                        }
                        i3++;
                    }
                }
            } else if (iFH == 1) {
                this.Cz.j3((byte) 2);
                this.Cz.a8(0);
            } else if (iFH == 13) {
                byte[] bArrQX = this.pO.QX();
                byte[] bArrQX2 = this.pO.QX();
                this.pO.u7();
                Vector vectorJ62 = identityRepositoryU2.j6();
                synchronized (vectorJ62) {
                    while (true) {
                        if (i3 >= vectorJ62.size()) {
                            identity = null;
                            break;
                        }
                        identity = (Identity) vectorJ62.elementAt(i3);
                        if (identity.FH() != null && Util.j6(bArrQX, identity.FH())) {
                            if (identity.DW()) {
                                if (userInfoEr != null) {
                                    while (identity.DW()) {
                                        if (userInfoEr.j6("Passphrase for " + identity.getName()) && (strDW = userInfoEr.DW()) != null) {
                                            try {
                                                if (identity.Hw(Util.aM(strDW))) {
                                                    break;
                                                }
                                            } catch (JSchException unused) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (!identity.DW()) {
                                break;
                            }
                        }
                        i3++;
                    }
                }
                byte[] bArrV5 = identity != null ? identity.v5(bArrQX2) : null;
                if (bArrV5 == null) {
                    this.Cz.j3((byte) 30);
                } else {
                    this.Cz.j3((byte) 14);
                    this.Cz.er(bArrV5);
                }
            } else if (iFH == 18) {
                identityRepositoryU2.FH(this.pO.QX());
                this.Cz.j3((byte) 6);
            } else if (iFH == 9) {
                this.Cz.j3((byte) 6);
            } else if (iFH == 19) {
                identityRepositoryU2.Hw();
                this.Cz.j3((byte) 6);
            } else if (iFH == 17) {
                byte[] bArr4 = new byte[this.pO.tp()];
                this.pO.v5(bArr4);
                this.Cz.j3(identityRepositoryU2.DW(bArr4) ? (byte) 6 : (byte) 5);
            } else {
                Buffer buffer3 = this.pO;
                buffer3.ei(buffer3.tp() - 1);
                this.Cz.j3((byte) 5);
            }
            byte[] bArr5 = new byte[this.Cz.tp()];
            this.Cz.v5(bArr5);
            sh(bArr5);
        } catch (JSchException e) {
            throw new IOException(e.toString());
        }
    }

    @Override // com.jcraft.jsch.Channel, java.lang.Runnable
    public void run() {
        try {
            rN();
        } catch (Exception unused) {
            this.Z1 = true;
            VH();
        }
    }

    @Override // com.jcraft.jsch.Channel
    void tp() throws IOException {
        super.tp();
        u7();
    }
}
