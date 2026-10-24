package abcd;

/* loaded from: classes.dex */
public final class qs implements rs {
    private int DW;
    private final byte[] j6;

    public qs(byte... bArr) {
        this.j6 = bArr;
    }

    @Override // abcd.rs
    public byte readByte() {
        byte[] bArr = this.j6;
        int i = this.DW;
        this.DW = i + 1;
        return bArr[i];
    }
}
