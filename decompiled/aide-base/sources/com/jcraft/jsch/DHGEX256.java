package com.jcraft.jsch;

/* loaded from: classes.dex */
public class DHGEX256 extends KeyExchange {
    static int Mr = 1024;
    static int aM = 1024;
    static int j3 = 1024;
    byte[] EQ;
    private Buffer J0;
    private Packet J8;
    private byte[] QX;
    private int VH;
    private byte[] Ws;
    private byte[] XL;
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
    /* JADX WARN: Removed duplicated region for block: B:22:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x026d  */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.jcraft.jsch.Signature, com.jcraft.jsch.SignatureRSA] */
    /* JADX WARN: Type inference failed for: r0v50, types: [com.jcraft.jsch.Signature, com.jcraft.jsch.SignatureRSA] */
    /* JADX WARN: Type inference failed for: r0v52 */
    @Override // com.jcraft.jsch.KeyExchange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean tp(com.jcraft.jsch.Buffer r12) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.DHGEX256.tp(com.jcraft.jsch.Buffer):boolean");
    }

    @Override // com.jcraft.jsch.KeyExchange
    public void u7(Session session, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
        this.j6 = session;
        this.u7 = bArr;
        this.tp = bArr2;
        this.EQ = bArr3;
        this.we = bArr4;
        try {
            HASH hash = (HASH) Class.forName(session.aM("sha-256")).newInstance();
            this.DW = hash;
            hash.DW();
        } catch (Exception e) {
            System.err.println(e);
        }
        this.J0 = new Buffer();
        this.J8 = new Packet(this.J0);
        try {
            DH dh = (DH) Class.forName(session.aM("dh")).newInstance();
            this.gn = dh;
            dh.DW();
            this.J8.FH();
            this.J0.j3((byte) 34);
            this.J0.a8(aM);
            this.J0.a8(j3);
            this.J0.a8(Mr);
            session.br(this.J8);
            if (JSch.tp().isEnabled(1)) {
                JSch.tp().j6(1, "SSH_MSG_KEX_DH_GEX_REQUEST(" + aM + "<" + j3 + "<" + Mr + ") sent");
                JSch.tp().j6(1, "expecting SSH_MSG_KEX_DH_GEX_GROUP");
            }
            this.VH = 31;
        } catch (Exception e2) {
            throw e2;
        }
    }
}
