package com.jcraft.jsch;

/* loaded from: classes.dex */
public class DHG14 extends KeyExchange {
    static final byte[] QX = {2};
    static final byte[] XL = {0, -1, -1, -1, -1, -1, -1, -1, -1, -55, 15, -38, -94, 33, 104, -62, 52, -60, -58, 98, -117, -128, -36, 28, -47, 41, 2, 78, 8, -118, 103, -52, 116, 2, 11, -66, -90, 59, 19, -101, 34, 81, 74, 8, 121, -114, 52, 4, -35, -17, -107, 25, -77, -51, 58, 67, 27, 48, 43, 10, 109, -14, 95, 20, 55, 79, -31, 53, 109, 109, 81, -62, 69, -28, -123, -75, 118, 98, 94, 126, -58, -12, 76, 66, -23, -90, 55, -19, 107, 11, -1, 92, -74, -12, 6, -73, -19, -18, 56, 107, -5, 90, -119, -97, -91, -82, -97, 36, 17, 124, 75, 31, -26, 73, 40, 102, 81, -20, -28, 91, 61, -62, 0, 124, -72, -95, 99, -65, 5, -104, -38, 72, 54, 28, 85, -45, -102, 105, 22, 63, -88, -3, 36, -49, 95, -125, 101, 93, 35, -36, -93, -83, -106, 28, 98, -13, 86, 32, -123, 82, -69, -98, -43, 41, 7, 112, -106, -106, 109, 103, 12, 53, 78, 74, -68, -104, 4, -15, 116, 108, 8, -54, 24, 33, 124, 50, -112, 94, 70, 46, 54, -50, 59, -29, -98, 119, 44, 24, 14, -122, 3, -101, 39, -125, -94, -20, 7, -94, -113, -75, -59, 93, -16, 111, 76, 82, -55, -34, 43, -53, -10, -107, 88, 23, 24, 57, -107, 73, 124, -22, -107, 106, -27, 21, -46, 38, 24, -104, -6, 5, 16, 21, 114, -114, 90, -118, -84, -86, 104, -1, -1, -1, -1, -1, -1, -1, -1};
    byte[] EQ;
    byte[] J0;
    private Buffer J8;
    private int VH;
    private Packet Ws;
    private int Zo = 0;
    DH gn;
    byte[] tp;
    byte[] u7;
    byte[] we;

    @Override // com.jcraft.jsch.KeyExchange
    public int VH() {
        return this.VH;
    }

    @Override // com.jcraft.jsch.KeyExchange
    public String Zo() {
        return this.Zo == 1 ? "DSA" : "RSA";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023e  */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [com.jcraft.jsch.Signature, com.jcraft.jsch.SignatureRSA] */
    /* JADX WARN: Type inference failed for: r0v40, types: [com.jcraft.jsch.Signature, com.jcraft.jsch.SignatureRSA] */
    /* JADX WARN: Type inference failed for: r0v42 */
    @Override // com.jcraft.jsch.KeyExchange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean tp(com.jcraft.jsch.Buffer r13) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.DHG14.tp(com.jcraft.jsch.Buffer):boolean");
    }

    @Override // com.jcraft.jsch.KeyExchange
    public void u7(Session session, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
        this.j6 = session;
        this.u7 = bArr;
        this.tp = bArr2;
        this.EQ = bArr3;
        this.we = bArr4;
        try {
            HASH hash = (HASH) Class.forName(session.aM("sha-1")).newInstance();
            this.DW = hash;
            hash.DW();
        } catch (Exception e) {
            System.err.println(e);
        }
        this.J8 = new Buffer();
        this.Ws = new Packet(this.J8);
        try {
            DH dh = (DH) Class.forName(session.aM("dh")).newInstance();
            this.gn = dh;
            dh.DW();
            this.gn.Hw(XL);
            this.gn.v5(QX);
            this.J0 = this.gn.j6();
            this.Ws.FH();
            this.J8.j3((byte) 30);
            this.J8.rN(this.J0);
            if (bArr == null) {
                return;
            }
            session.br(this.Ws);
            if (JSch.tp().isEnabled(1)) {
                JSch.tp().j6(1, "SSH_MSG_KEXDH_INIT sent");
                JSch.tp().j6(1, "expecting SSH_MSG_KEXDH_REPLY");
            }
            this.VH = 31;
        } catch (Exception e2) {
            throw e2;
        }
    }
}
