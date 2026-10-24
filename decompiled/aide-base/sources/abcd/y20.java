package abcd;

import abcd.b30;
import abcd.h70;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class y20 {

    private static class a extends y20 {
        private final File j6;

        /* renamed from: abcd.y20$a$a, reason: collision with other inner class name */
        class C0017a extends f70 {
            private final /* synthetic */ File j6;

            public C0017a(a aVar, File file) {
                this.j6 = file;
            }

            @Override // abcd.f70
            public byte[] Hw() {
                throw new n40();
            }

            @Override // abcd.f70
            public int VH() {
                return 3;
            }

            @Override // abcd.f70
            public long Zo() {
                return this.j6.length();
            }

            @Override // abcd.f70
            public boolean gn() {
                return true;
            }

            @Override // abcd.f70
            public h70 u7() throws IOException {
                FileInputStream fileInputStream = new FileInputStream(this.j6);
                return new h70.a(VH(), fileInputStream.getChannel().size(), new BufferedInputStream(fileInputStream));
            }
        }

        public a(File file) {
            this.j6 = file;
        }

        @Override // abcd.y20
        public f70 FH(String str, a70 a70Var) throws FileNotFoundException {
            File file = new File(this.j6, str);
            if (file.isFile()) {
                return new C0017a(this, file);
            }
            throw new FileNotFoundException(str);
        }

        @Override // abcd.y20
        public long Hw(String str, a70 a70Var) {
            return new File(this.j6, str).length();
        }
    }

    private static class b extends y20 {
        private final g70 j6;

        public b(g70 g70Var) {
            this.j6 = g70Var;
        }

        @Override // abcd.y20
        public f70 FH(String str, a70 a70Var) {
            return this.j6.QX(a70Var, 3);
        }

        @Override // abcd.y20
        public long Hw(String str, a70 a70Var) {
            return this.j6.u7(a70Var, 3);
        }
    }

    public static final class c {
        private static /* synthetic */ int[] FH;
        private final y20 DW;
        private final y20 j6;

        public c(y20 y20Var, y20 y20Var2) {
            this.j6 = y20Var;
            this.DW = y20Var2;
        }

        public static /* synthetic */ int[] j6() {
            int[] iArr = FH;
            if (iArr != null) {
                return iArr;
            }
            int[] iArr2 = new int[b30.b.valuesCustom().length];
            try {
                iArr2[b30.b.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr2[b30.b.OLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            FH = iArr2;
            return iArr2;
        }

        public f70 DW(b30.b bVar, b30 b30Var) {
            int i = j6()[bVar.ordinal()];
            if (i == 1) {
                return this.j6.FH(b30Var.j6, b30Var.VH.QX());
            }
            if (i == 2) {
                return this.DW.FH(b30Var.DW, b30Var.gn.QX());
            }
            throw new IllegalArgumentException();
        }

        public long FH(b30.b bVar, b30 b30Var) {
            int i = j6()[bVar.ordinal()];
            if (i == 1) {
                return this.j6.Hw(b30Var.j6, b30Var.VH.QX());
            }
            if (i == 2) {
                return this.DW.Hw(b30Var.DW, b30Var.gn.QX());
            }
            throw new IllegalArgumentException();
        }
    }

    private static class d extends y20 {
        private final kf0 DW;
        private String FH;
        private kf0 Hw;
        private final jf0 j6 = new jf0((g70) null);

        class a extends f70 {
            public a() {
            }

            @Override // abcd.f70
            public byte[] Hw() {
                throw new n40();
            }

            @Override // abcd.f70
            public int VH() {
                return d.this.Hw.u7().VH();
            }

            @Override // abcd.f70
            public long Zo() {
                return d.this.Hw.sG();
            }

            @Override // abcd.f70
            public boolean gn() {
                return true;
            }

            @Override // abcd.f70
            public h70 u7() {
                return new h70.a(VH(), Zo(), new BufferedInputStream(d.this.Hw.kQ()));
            }
        }

        public d(kf0 kf0Var) {
            this.DW = kf0Var;
        }

        private void Zo(String str) throws FileNotFoundException {
            if (str.equals(this.FH)) {
                return;
            }
            this.DW.er();
            this.j6.P8();
            this.j6.DW(this.DW);
            this.j6.SI(pf0.v5(str));
            this.FH = str;
            if (!this.j6.rN()) {
                throw new FileNotFoundException(str);
            }
            kf0 kf0Var = (kf0) this.j6.QX(0, kf0.class);
            this.Hw = kf0Var;
            if (kf0Var == null) {
                throw new FileNotFoundException(str);
            }
        }

        @Override // abcd.y20
        public f70 FH(String str, a70 a70Var) throws FileNotFoundException {
            Zo(str);
            return new a();
        }

        @Override // abcd.y20
        public long Hw(String str, a70 a70Var) throws FileNotFoundException {
            Zo(str);
            return this.Hw.sG();
        }
    }

    public static y20 DW(kf0 kf0Var) {
        return kf0Var instanceof hf0 ? new a(((hf0) kf0Var).wc()) : new d(kf0Var);
    }

    public static y20 j6(g70 g70Var) {
        return new b(g70Var);
    }

    public abstract f70 FH(String str, a70 a70Var);

    public abstract long Hw(String str, a70 a70Var);
}
