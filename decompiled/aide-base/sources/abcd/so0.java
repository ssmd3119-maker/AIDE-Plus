package abcd;

/* loaded from: classes.dex */
public class so0 implements mn0 {
    private byte[] j6;

    public so0(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] j6() {
        return this.j6;
    }

    public so0(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.j6 = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
