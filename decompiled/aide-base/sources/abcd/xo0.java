package abcd;

import java.security.MessageDigest;
import java.security.Signature;

/* loaded from: classes.dex */
public class xo0 implements wo0 {
    protected final String j6;

    public xo0(String str) {
        this.j6 = str;
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
