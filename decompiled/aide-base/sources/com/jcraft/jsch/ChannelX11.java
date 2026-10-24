package com.jcraft.jsch;

import java.io.IOException;
import java.net.Socket;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class ChannelX11 extends Channel {
    private static String Cz = "127.0.0.1";
    static byte[] oy = null;
    private static int pN = 6000;
    private static Hashtable aX = new Hashtable();
    private static Hashtable e9 = new Hashtable();
    private static byte[] QO = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    private boolean pO = true;
    private Socket fN = null;
    private byte[] Gj = new byte[0];

    ChannelX11() {
        vy(131072);
        BT(131072);
        gW(16384);
        this.jw = Util.aM("x11");
        this.n5 = true;
    }

    private static boolean cb(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    static byte[] dx(Session session) {
        byte[] bArr;
        int i;
        synchronized (e9) {
            bArr = (byte[]) e9.get(session);
            if (bArr == null) {
                Random random = Session.GK;
                byte[] bArr2 = new byte[16];
                synchronized (random) {
                    random.j6(bArr2, 0, 16);
                }
                aX.put(session, bArr2);
                bArr = new byte[32];
                for (i = 0; i < 16; i++) {
                    int i2 = i * 2;
                    bArr[i2] = QO[(bArr2[i] >>> 4) & 15];
                    bArr[i2 + 1] = QO[bArr2[i] & 15];
                }
                e9.put(session, bArr);
            }
        }
        return bArr;
    }

    static void sG(Session session) {
        synchronized (e9) {
            e9.remove(session);
            aX.remove(session);
        }
    }

    private byte[] sh(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.Gj;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        byte[] bArr4 = this.Gj;
        if (bArr4.length > 0) {
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        this.Gj = bArr3;
        return bArr3;
    }

    @Override // com.jcraft.jsch.Channel
    void ro(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        if (!this.pO) {
            this.w9.Zo(bArr, i, i2);
            return;
        }
        try {
            Session sessionMr = Mr();
            byte[] bArrSh = sh(bArr, i, i2);
            int length = bArrSh.length;
            if (length < 9) {
                return;
            }
            int i3 = ((bArrSh[6] & 255) * 256) + (bArrSh[7] & 255);
            int i4 = ((bArrSh[8] & 255) * 256) + (bArrSh[9] & 255);
            if ((bArrSh[0] & 255) != 66 && (bArrSh[0] & 255) == 108) {
                i3 = ((i3 << 8) & 65280) | ((i3 >>> 8) & 255);
                i4 = ((i4 << 8) & 65280) | ((i4 >>> 8) & 255);
            }
            int i5 = (-i3) & 3;
            if (length < i3 + 12 + i5 + i4) {
                return;
            }
            byte[] bArr3 = new byte[i4];
            int i6 = 12 + i3 + i5;
            System.arraycopy(bArrSh, i6, bArr3, 0, i4);
            synchronized (aX) {
                bArr2 = (byte[]) aX.get(sessionMr);
            }
            if (cb(bArr3, bArr2)) {
                byte[] bArr4 = oy;
                if (bArr4 != null) {
                    System.arraycopy(bArr4, 0, bArrSh, i6, i4);
                }
            } else {
                this.hK = null;
                u7();
                this.w9.j6();
                VH();
            }
            this.pO = false;
            this.w9.Zo(bArrSh, 0, length);
            this.Gj = null;
        } catch (JSchException e) {
            throw new IOException(e.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        u7();
     */
    @Override // com.jcraft.jsch.Channel, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            java.lang.String r1 = com.jcraft.jsch.ChannelX11.Cz     // Catch: java.lang.Exception -> L8b
            int r2 = com.jcraft.jsch.ChannelX11.pN     // Catch: java.lang.Exception -> L8b
            r3 = 10000(0x2710, float:1.4013E-41)
            java.net.Socket r1 = com.jcraft.jsch.Util.gn(r1, r2, r3)     // Catch: java.lang.Exception -> L8b
            r6.fN = r1     // Catch: java.lang.Exception -> L8b
            r1.setTcpNoDelay(r0)     // Catch: java.lang.Exception -> L8b
            com.jcraft.jsch.IO r1 = new com.jcraft.jsch.IO     // Catch: java.lang.Exception -> L8b
            r1.<init>()     // Catch: java.lang.Exception -> L8b
            r6.w9 = r1     // Catch: java.lang.Exception -> L8b
            java.net.Socket r2 = r6.fN     // Catch: java.lang.Exception -> L8b
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L8b
            r1.tp(r2)     // Catch: java.lang.Exception -> L8b
            com.jcraft.jsch.IO r1 = r6.w9     // Catch: java.lang.Exception -> L8b
            java.net.Socket r2 = r6.fN     // Catch: java.lang.Exception -> L8b
            java.io.OutputStream r2 = r2.getOutputStream()     // Catch: java.lang.Exception -> L8b
            r1.we(r2)     // Catch: java.lang.Exception -> L8b
            r6.rN()     // Catch: java.lang.Exception -> L8b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r6.hK = r0
            com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer
            int r1 = r6.AL
            r0.<init>(r1)
            com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet
            r1.<init>(r0)
        L40:
            java.lang.Thread r2 = r6.hK     // Catch: java.lang.Exception -> L87
            if (r2 == 0) goto L87
            com.jcraft.jsch.IO r2 = r6.w9     // Catch: java.lang.Exception -> L87
            if (r2 == 0) goto L87
            com.jcraft.jsch.IO r2 = r6.w9     // Catch: java.lang.Exception -> L87
            java.io.InputStream r2 = r2.j6     // Catch: java.lang.Exception -> L87
            if (r2 != 0) goto L4f
            goto L87
        L4f:
            com.jcraft.jsch.IO r2 = r6.w9     // Catch: java.lang.Exception -> L87
            java.io.InputStream r2 = r2.j6     // Catch: java.lang.Exception -> L87
            byte[] r3 = r0.DW     // Catch: java.lang.Exception -> L87
            byte[] r4 = r0.DW     // Catch: java.lang.Exception -> L87
            int r4 = r4.length     // Catch: java.lang.Exception -> L87
            r5 = 14
            int r4 = r4 - r5
            int r4 = r4 + (-84)
            int r2 = r2.read(r3, r5, r4)     // Catch: java.lang.Exception -> L87
            if (r2 > 0) goto L67
            r6.u7()     // Catch: java.lang.Exception -> L87
            goto L87
        L67:
            boolean r3 = r6.Z1     // Catch: java.lang.Exception -> L87
            if (r3 == 0) goto L6c
            goto L87
        L6c:
            r1.FH()     // Catch: java.lang.Exception -> L87
            r3 = 94
            r0.j3(r3)     // Catch: java.lang.Exception -> L87
            int r3 = r6.mb     // Catch: java.lang.Exception -> L87
            r0.a8(r3)     // Catch: java.lang.Exception -> L87
            r0.a8(r2)     // Catch: java.lang.Exception -> L87
            r0.ei(r2)     // Catch: java.lang.Exception -> L87
            com.jcraft.jsch.Session r3 = r6.Mr()     // Catch: java.lang.Exception -> L87
            r3.XX(r1, r6, r2)     // Catch: java.lang.Exception -> L87
            goto L40
        L87:
            r6.VH()
            return
        L8b:
            r6.er(r0)
            r6.Z1 = r0
            r6.VH()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.ChannelX11.run():void");
    }
}
