package abcd;

import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class bq0 {
    private cq0 j6 = new cq0(new vo0());

    class a implements tp0 {

        /* renamed from: abcd.bq0$a$a, reason: collision with other inner class name */
        class C0000a implements sp0 {
            private final /* synthetic */ b DW;
            private final /* synthetic */ sl0 j6;

            public C0000a(a aVar, sl0 sl0Var, b bVar) {
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

        public a() {
        }

        @Override // abcd.tp0
        public sp0 j6(sl0 sl0Var) throws up0 {
            try {
                return new C0000a(this, sl0Var, new b(bq0.this, bq0.this.j6.j6(sl0Var)));
            } catch (GeneralSecurityException e) {
                throw new up0("exception on setup: " + e, e);
            }
        }
    }

    private class b extends OutputStream {
        private MessageDigest WB;

        public b(bq0 bq0Var, MessageDigest messageDigest) {
            this.WB = messageDigest;
        }

        public byte[] j6() {
            return this.WB.digest();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.WB.update(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.WB.update(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.WB.update((byte) i);
        }
    }

    public tp0 DW() {
        return new a();
    }

    public bq0 FH(String str) {
        this.j6 = new cq0(new xo0(str));
        return this;
    }
}
