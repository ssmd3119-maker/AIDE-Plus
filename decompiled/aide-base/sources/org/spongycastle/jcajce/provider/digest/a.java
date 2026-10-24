package org.spongycastle.jcajce.provider.digest;

import abcd.on0;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class a extends MessageDigest {
    protected on0 WB;

    protected a(on0 on0Var) {
        super(on0Var.v5());
        this.WB = on0Var;
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        byte[] bArr = new byte[this.WB.Zo()];
        this.WB.Hw(bArr, 0);
        return bArr;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.WB.DW();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        this.WB.FH(b);
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.WB.j6(bArr, i, i2);
    }
}
