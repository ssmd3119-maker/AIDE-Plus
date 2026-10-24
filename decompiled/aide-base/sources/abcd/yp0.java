package abcd;

import java.io.OutputStream;

/* loaded from: classes.dex */
public class yp0 implements tp0 {

    class a implements sp0 {
        private final /* synthetic */ b DW;
        private final /* synthetic */ sl0 j6;

        public a(yp0 yp0Var, sl0 sl0Var, b bVar) {
            this.j6 = sl0Var;
            this.DW = bVar;
        }

        @Override // abcd.sp0
        public byte[] DW() {
            return this.DW.j6();
        }

        @Override // abcd.sp0
        public sl0 FH() {
            return this.j6;
        }

        @Override // abcd.sp0
        public OutputStream j6() {
            return this.DW;
        }
    }

    private class b extends OutputStream {
        private on0 WB;

        public b(yp0 yp0Var, on0 on0Var) {
            this.WB = on0Var;
        }

        public byte[] j6() {
            byte[] bArr = new byte[this.WB.Zo()];
            this.WB.Hw(bArr, 0);
            return bArr;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.WB.j6(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.WB.j6(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.WB.FH((byte) i);
        }
    }

    @Override // abcd.tp0
    public sp0 j6(sl0 sl0Var) {
        return new a(this, sl0Var, new b(this, zp0.j6(sl0Var)));
    }
}
