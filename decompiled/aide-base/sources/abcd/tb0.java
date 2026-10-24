package abcd;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class tb0 {
    private final int DW;
    private final ReferenceQueue<byte[]> FH = new ReferenceQueue<>();
    private long Hw;
    private final long j6;

    static class a extends SoftReference<byte[]> {
        final int j6;

        public a(byte[] bArr, ReferenceQueue<byte[]> referenceQueue) {
            super(bArr, referenceQueue);
            this.j6 = bArr.length;
        }
    }

    public tb0(ec0 ec0Var) {
        this.j6 = ec0Var.v5();
        this.DW = ec0Var.Hw();
    }

    private void FH() {
        while (true) {
            if (((a) this.FH.poll()) == null) {
                return;
            } else {
                this.Hw -= r0.j6;
            }
        }
    }

    public boolean DW(int i, dc0 dc0Var, dc0 dc0Var2) {
        long j = this.j6;
        if (0 < j) {
            long j2 = i;
            if (j < this.Hw + j2) {
                FH();
                long j3 = this.j6;
                if (0 < j3 && j3 < this.Hw + j2) {
                    return false;
                }
            }
        }
        if (i < this.DW) {
            this.Hw += i;
            return true;
        }
        if ((i >> 10) >= (dc0Var.wc() >> 20) + (dc0Var2.wc() >> 21)) {
            return false;
        }
        this.Hw += i;
        return true;
    }

    public void Hw(int i) {
        this.Hw -= i;
    }

    public a j6(byte[] bArr, int i, int i2) {
        byte[] bArrV5 = v5(bArr, i);
        if (i2 != bArrV5.length) {
            long j = this.Hw - i2;
            this.Hw = j;
            this.Hw = j + bArrV5.length;
        }
        return new a(bArrV5, this.FH);
    }

    public byte[] v5(byte[] bArr, int i) {
        if (bArr.length == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }
}
