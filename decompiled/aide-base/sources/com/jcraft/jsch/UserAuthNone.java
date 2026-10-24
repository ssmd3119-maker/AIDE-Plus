package com.jcraft.jsch;

import java.io.IOException;

/* loaded from: classes.dex */
public class UserAuthNone extends UserAuth {
    private String v5 = null;

    UserAuthNone() {
    }

    String DW() {
        return this.v5;
    }

    @Override // com.jcraft.jsch.UserAuth
    public boolean j6(Session session) throws IOException, NumberFormatException, JSchException {
        super.j6(session);
        this.DW.FH();
        this.FH.j3((byte) 5);
        this.FH.er(Util.aM("ssh-userauth"));
        session.br(this.DW);
        if (JSch.tp().isEnabled(1)) {
            JSch.tp().j6(1, "SSH_MSG_SERVICE_REQUEST sent");
        }
        Buffer buffer = this.FH;
        session.nw(buffer);
        this.FH = buffer;
        boolean z = buffer.gn() == 6;
        if (JSch.tp().isEnabled(1)) {
            JSch.tp().j6(1, "SSH_MSG_SERVICE_ACCEPT received");
        }
        if (!z) {
            return false;
        }
        byte[] bArrAM = Util.aM(this.Hw);
        this.DW.FH();
        this.FH.j3((byte) 50);
        this.FH.er(bArrAM);
        this.FH.er(Util.aM("ssh-connection"));
        this.FH.er(Util.aM("none"));
        session.br(this.DW);
        while (true) {
            Buffer buffer2 = this.FH;
            session.nw(buffer2);
            this.FH = buffer2;
            int iGn = buffer2.gn() & 255;
            if (iGn == 52) {
                return true;
            }
            if (iGn != 53) {
                if (iGn != 51) {
                    throw new JSchException("USERAUTH fail (" + iGn + ")");
                }
                this.FH.u7();
                this.FH.FH();
                this.FH.FH();
                byte[] bArrQX = this.FH.QX();
                this.FH.FH();
                this.v5 = Util.DW(bArrQX);
                return false;
            }
            this.FH.u7();
            this.FH.FH();
            this.FH.FH();
            byte[] bArrQX2 = this.FH.QX();
            this.FH.QX();
            String strDW = Util.DW(bArrQX2);
            UserInfo userInfo = this.j6;
            if (userInfo != null) {
                try {
                    userInfo.Hw(strDW);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
