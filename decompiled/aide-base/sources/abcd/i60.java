package abcd;

import java.util.zip.Inflater;

/* loaded from: classes.dex */
public class i60 extends Inflater {
    private static final byte[] j6 = new byte[1];

    public i60() {
        super(false);
    }

    @Override // java.util.zip.Inflater
    public void end() {
    }

    @Override // java.util.zip.Inflater
    public int inflate(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            return super.inflate(bArr, i, i2);
        }
        if (super.inflate(j6, 0, 1) <= 0) {
            return 0;
        }
        throw new RuntimeException();
    }

    public void j6() {
        super.end();
    }

    @Override // java.util.zip.Inflater
    public int inflate(byte[] bArr) {
        return super.inflate(bArr);
    }
}
