package abcd;

import abcd.no;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class dodo implements Comparable<dodo> {
    private final byte[] WB;

    public dodo(byte[] bArr) {
        this.WB = bArr;
    }

    @Override // java.lang.Comparable
    /* renamed from: DW, reason: merged with bridge method [inline-methods] */
    public int compareTo(dodo dodoVar) {
        int iMin = Math.min(this.WB.length, dodoVar.WB.length);
        for (int i = 0; i < iMin; i++) {
            byte[] bArr = this.WB;
            byte b = bArr[i];
            byte[] bArr2 = dodoVar.WB;
            if (b != bArr2[i]) {
                return (bArr[i] & 255) - (bArr2[i] & 255);
            }
        }
        return this.WB.length - dodoVar.WB.length;
    }

    public void FH(no.b bVar) {
        bVar.write(this.WB);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && dodo.class == obj.getClass() && Arrays.equals(this.WB, ((dodo) obj).WB);
    }

    public int hashCode() {
        return 31 + Arrays.hashCode(this.WB);
    }

    public rs j6() {
        return new qs(this.WB);
    }

    public String toString() {
        return Integer.toHexString(this.WB[0] & 255) + "...(" + this.WB.length + ")";
    }
}
