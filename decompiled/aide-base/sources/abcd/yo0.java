package abcd;

import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;

/* loaded from: classes.dex */
public class yo0 implements wo0 {
    protected final Provider j6;

    public yo0(Provider provider) {
        this.j6 = provider;
    }

    @Override // abcd.wo0
    public Signature DW(String str) {
        return Signature.getInstance(str, this.j6);
    }

    @Override // abcd.wo0
    public MessageDigest j6(String str) {
        return MessageDigest.getInstance(str, this.j6);
    }
}
