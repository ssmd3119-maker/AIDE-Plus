package com.jcraft.jsch;

import com.jcraft.jsch.IdentityRepository;
import java.util.Vector;

/* loaded from: classes.dex */
public class UserAuthPublicKey extends UserAuth {
    UserAuthPublicKey() {
    }

    @Override // com.jcraft.jsch.UserAuth
    public boolean j6(Session session) {
        byte[] bArrAM;
        byte[] bArr;
        int iGn;
        super.j6(session);
        Vector vectorJ6 = session.U2().j6();
        synchronized (vectorJ6) {
            if (vectorJ6.size() <= 0) {
                return false;
            }
            byte[] bArrAM2 = Util.aM(this.Hw);
            for (int i = 0; i < vectorJ6.size(); i++) {
                if (session.qP >= session.oa) {
                    return false;
                }
                Identity identity = (Identity) vectorJ6.elementAt(i);
                byte[] bArrFH = identity.FH();
                if (bArrFH != null) {
                    this.DW.FH();
                    this.FH.j3((byte) 50);
                    this.FH.er(bArrAM2);
                    this.FH.er(Util.aM("ssh-connection"));
                    this.FH.er(Util.aM("publickey"));
                    this.FH.j3((byte) 0);
                    this.FH.er(Util.aM(identity.j6()));
                    this.FH.er(bArrFH);
                    session.br(this.DW);
                    while (true) {
                        Buffer buffer = this.FH;
                        session.nw(buffer);
                        this.FH = buffer;
                        iGn = buffer.gn() & 255;
                        if (iGn == 60 || iGn == 51 || iGn != 53) {
                            break;
                        }
                        this.FH.u7();
                        this.FH.FH();
                        this.FH.FH();
                        byte[] bArrQX = this.FH.QX();
                        this.FH.QX();
                        String strDW = Util.DW(bArrQX);
                        if (this.j6 != null) {
                            this.j6.Hw(strDW);
                        }
                    }
                    if (iGn != 60) {
                    }
                }
                int i2 = 5;
                while (true) {
                    if (identity.DW()) {
                        if (this.j6 == null) {
                            throw new JSchException("USERAUTH fail");
                        }
                        if (identity.DW()) {
                            if (!this.j6.j6("Passphrase for " + identity.getName())) {
                                throw new JSchAuthCancelException("publickey");
                            }
                        }
                        String strDW2 = this.j6.DW();
                        bArrAM = strDW2 != null ? Util.aM(strDW2) : null;
                        if ((!identity.DW() && bArrAM == null) || !identity.Hw(bArrAM)) {
                            Util.Zo(bArrAM);
                            i2--;
                            if (i2 == 0) {
                                bArr = null;
                                break;
                            }
                        } else {
                            if (bArrAM != null && (session.U2() instanceof IdentityRepository.Wrapper)) {
                                ((IdentityRepository.Wrapper) session.U2()).Zo();
                            }
                            bArr = bArrAM;
                        }
                    }
                    if (!identity.DW()) {
                    }
                    if (bArrAM != null) {
                        ((IdentityRepository.Wrapper) session.U2()).Zo();
                    }
                    bArr = bArrAM;
                }
                Util.Zo(bArr);
                if (!identity.DW()) {
                    if (bArrFH == null) {
                        bArrFH = identity.FH();
                    }
                    if (bArrFH != null) {
                        this.DW.FH();
                        this.FH.j3((byte) 50);
                        this.FH.er(bArrAM2);
                        this.FH.er(Util.aM("ssh-connection"));
                        this.FH.er(Util.aM("publickey"));
                        this.FH.j3((byte) 1);
                        this.FH.er(Util.aM(identity.j6()));
                        this.FH.er(bArrFH);
                        byte[] bArrLg = session.lg();
                        int length = bArrLg.length;
                        int i3 = length + 4;
                        byte[] bArr2 = new byte[(this.FH.FH + i3) - 5];
                        bArr2[0] = (byte) (length >>> 24);
                        bArr2[1] = (byte) (length >>> 16);
                        bArr2[2] = (byte) (length >>> 8);
                        bArr2[3] = (byte) length;
                        System.arraycopy(bArrLg, 0, bArr2, 4, length);
                        System.arraycopy(this.FH.DW, 5, bArr2, i3, this.FH.FH - 5);
                        byte[] bArrV5 = identity.v5(bArr2);
                        if (bArrV5 == null) {
                            break;
                        }
                        this.FH.er(bArrV5);
                        session.br(this.DW);
                        while (true) {
                            Buffer buffer2 = this.FH;
                            session.nw(buffer2);
                            this.FH = buffer2;
                            int iGn2 = buffer2.gn() & 255;
                            if (iGn2 == 52) {
                                return true;
                            }
                            if (iGn2 == 53) {
                                this.FH.u7();
                                this.FH.FH();
                                this.FH.FH();
                                byte[] bArrQX2 = this.FH.QX();
                                this.FH.QX();
                                String strDW3 = Util.DW(bArrQX2);
                                if (this.j6 != null) {
                                    this.j6.Hw(strDW3);
                                }
                            } else if (iGn2 == 51) {
                                this.FH.u7();
                                this.FH.FH();
                                this.FH.FH();
                                byte[] bArrQX3 = this.FH.QX();
                                if (this.FH.FH() != 0) {
                                    throw new JSchPartialAuthException(Util.DW(bArrQX3));
                                }
                                session.qP++;
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }
}
