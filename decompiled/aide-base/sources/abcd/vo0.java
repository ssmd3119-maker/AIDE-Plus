package abcd;

import java.security.MessageDigest;
import java.security.Signature;

/* loaded from: classes.dex */
public class vo0 implements wo0 {
    @Override // abcd.wo0
    public Signature DW(String str) {
        return Signature.getInstance(str);
    }

    @Override // abcd.wo0
    public MessageDigest j6(String str) {
        return MessageDigest.getInstance(str);
    }
}
