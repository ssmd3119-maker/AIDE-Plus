package com.jcraft.jsch;

/* loaded from: classes.dex */
public class IdentityFile implements Identity {
    private String DW;
    private KeyPair j6;

    private IdentityFile(JSch jSch, String str, KeyPair keyPair) {
        this.DW = str;
        this.j6 = keyPair;
    }

    static IdentityFile VH(String str, String str2, JSch jSch) {
        return new IdentityFile(jSch, str, KeyPair.Ws(jSch, str, str2));
    }

    static IdentityFile gn(String str, byte[] bArr, byte[] bArr2, JSch jSch) {
        return new IdentityFile(jSch, str, KeyPair.QX(jSch, bArr, bArr2));
    }

    @Override // com.jcraft.jsch.Identity
    public boolean DW() {
        return this.j6.J8();
    }

    @Override // com.jcraft.jsch.Identity
    public byte[] FH() {
        return this.j6.we();
    }

    @Override // com.jcraft.jsch.Identity
    public boolean Hw(byte[] bArr) {
        return this.j6.Hw(bArr);
    }

    public KeyPair Zo() {
        return this.j6;
    }

    @Override // com.jcraft.jsch.Identity
    public void clear() {
        this.j6.Zo();
        this.j6 = null;
    }

    @Override // com.jcraft.jsch.Identity
    public String getName() {
        return this.DW;
    }

    @Override // com.jcraft.jsch.Identity
    public String j6() {
        return new String(this.j6.EQ());
    }

    @Override // com.jcraft.jsch.Identity
    public byte[] v5(byte[] bArr) {
        return this.j6.J0(bArr);
    }
}
