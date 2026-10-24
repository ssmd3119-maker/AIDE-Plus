package abcd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class t60 {
    private final int DW;
    private final int FH;
    private final byte[] j6;
    public static final t60 Hw = new a(16384, 2);
    public static final t60 v5 = new b(40960, 3);
    public static final t60 Zo = new c(33188, 3);
    public static final t60 VH = new d(33261, 3);
    public static final t60 gn = new e(57344, 1);
    public static final t60 u7 = new f(0, -1);

    class a extends t60 {
        public a(int i, int i2) {
            super(i, i2, null);
        }

        @Override // abcd.t60
        public boolean Hw(int i) {
            return (i & 61440) == 16384;
        }
    }

    class b extends t60 {
        public b(int i, int i2) {
            super(i, i2, null);
        }

        @Override // abcd.t60
        public boolean Hw(int i) {
            return (i & 61440) == 40960;
        }
    }

    class c extends t60 {
        public c(int i, int i2) {
            super(i, i2, null);
        }

        @Override // abcd.t60
        public boolean Hw(int i) {
            return (61440 & i) == 32768 && (i & 73) == 0;
        }
    }

    class d extends t60 {
        public d(int i, int i2) {
            super(i, i2, null);
        }

        @Override // abcd.t60
        public boolean Hw(int i) {
            return (61440 & i) == 32768 && (i & 73) != 0;
        }
    }

    class e extends t60 {
        public e(int i, int i2) {
            super(i, i2, null);
        }

        @Override // abcd.t60
        public boolean Hw(int i) {
            return (i & 61440) == 57344;
        }
    }

    class f extends t60 {
        public f(int i, int i2) {
            super(i, i2, null);
        }

        @Override // abcd.t60
        public boolean Hw(int i) {
            return i == 0;
        }
    }

    class g extends t60 {
        private final /* synthetic */ int tp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, int i2, int i3) {
            super(i, i2, null);
            this.tp = i3;
        }

        @Override // abcd.t60
        public boolean Hw(int i) {
            return this.tp == i;
        }
    }

    private t60(int i, int i2) {
        this.DW = i;
        this.FH = i2;
        int i3 = 0;
        if (i == 0) {
            this.j6 = new byte[]{48};
            return;
        }
        int i4 = 10;
        byte[] bArr = new byte[10];
        while (i != 0) {
            i4--;
            bArr[i4] = (byte) ((i & 7) + 48);
            i >>= 3;
        }
        this.j6 = new byte[10 - i4];
        while (true) {
            byte[] bArr2 = this.j6;
            if (i3 >= bArr2.length) {
                return;
            }
            bArr2[i3] = bArr[i4 + i3];
            i3++;
        }
    }

    public static final t60 v5(int i) {
        int i2 = 61440 & i;
        if (i2 != 0) {
            if (i2 == 16384) {
                return Hw;
            }
            if (i2 == 32768) {
                return (i & 73) != 0 ? VH : Zo;
            }
            if (i2 == 40960) {
                return v5;
            }
            if (i2 == 57344) {
                return gn;
            }
        } else if (i == 0) {
            return u7;
        }
        return new g(i, -1, i);
    }

    public void DW(byte[] bArr, int i) {
        byte[] bArr2 = this.j6;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    public int FH() {
        return this.j6.length;
    }

    public abstract boolean Hw(int i);

    public int VH() {
        return this.FH;
    }

    public int Zo() {
        return this.DW;
    }

    public void j6(OutputStream outputStream) throws IOException {
        outputStream.write(this.j6);
    }

    public String toString() {
        return Integer.toOctalString(this.DW);
    }

    public /* synthetic */ t60(int i, int i2, t60 t60Var) {
        this(i, i2);
    }
}
