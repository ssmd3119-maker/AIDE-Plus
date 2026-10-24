package abcd;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public abstract class e70 {
    private byte[] DW;
    private final MessageDigest j6 = r60.Zo();

    public static class a extends e70 {
        @Override // abcd.e70
        public jd0 EQ(InputStream inputStream) {
            throw new UnsupportedOperationException();
        }

        @Override // abcd.e70
        public void FH() {
        }

        @Override // abcd.e70
        public a70 Zo(int i, long j, InputStream inputStream) {
            throw new UnsupportedOperationException();
        }

        @Override // abcd.e70
        public void we() {
        }
    }

    public MessageDigest DW() {
        this.j6.reset();
        return this.j6;
    }

    public abstract jd0 EQ(InputStream inputStream);

    public abstract void FH();

    public a70 Hw(int i, byte[] bArr) {
        return v5(i, bArr, 0, bArr.length);
    }

    public a70 VH(int i, byte[] bArr) {
        return gn(i, bArr, 0, bArr.length);
    }

    public abstract a70 Zo(int i, long j, InputStream inputStream);

    public a70 gn(int i, byte[] bArr, int i2, int i3) {
        return Zo(i, i3, new ByteArrayInputStream(bArr, i2, i3));
    }

    public byte[] j6() {
        if (this.DW == null) {
            this.DW = new byte[8192];
        }
        return this.DW;
    }

    public final a70 tp(w70 w70Var) {
        return w70Var.VH(this);
    }

    public final a70 u7(p60 p60Var) {
        return VH(1, p60Var.j6());
    }

    public a70 v5(int i, byte[] bArr, int i2, int i3) {
        MessageDigest messageDigestDW = DW();
        messageDigestDW.update(r60.v5(i));
        messageDigestDW.update((byte) 32);
        messageDigestDW.update(r60.FH(i3));
        messageDigestDW.update((byte) 0);
        messageDigestDW.update(bArr, i2, i3);
        return a70.sG(messageDigestDW.digest());
    }

    public abstract void we();
}
