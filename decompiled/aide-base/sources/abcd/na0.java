package abcd;

import abcd.h70;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* loaded from: classes.dex */
public class na0 extends f70 {
    private final long FH;
    private final long Hw;
    private final ja0 VH;
    private final wa0 Zo;
    private final int v5;
    private int j6 = -1;
    private long DW = -1;

    class a extends h70.a {
        private final /* synthetic */ ua0 fY;
        private final /* synthetic */ File k2;
        private final /* synthetic */ ob0 qp;
        private final /* synthetic */ a70 zh;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, long j, InputStream inputStream, ua0 ua0Var, ob0 ob0Var, File file, a70 a70Var) {
            super(i, j, inputStream);
            this.fY = ua0Var;
            this.qp = ob0Var;
            this.k2 = file;
            this.zh = a70Var;
        }

        @Override // abcd.h70.a, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.fY.we();
            this.qp.XL();
            na0.this.VH.lg(this.k2, this.zh, true);
        }
    }

    class b extends xb0 {
        private final /* synthetic */ f70 Z1;
        private final /* synthetic */ ob0 n5;
        private long q7;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(na0 na0Var, InputStream inputStream, f70 f70Var, ob0 ob0Var) {
            super(inputStream);
            this.Z1 = f70Var;
            this.n5 = ob0Var;
            this.q7 = -1L;
        }

        @Override // abcd.xb0
        public long DW() {
            if (this.q7 == -1) {
                this.q7 = this.Z1.Zo();
            }
            return this.q7;
        }

        @Override // abcd.xb0
        public InputStream gn() {
            f70 f70Var = this.Z1;
            InputStream inputStreamJ0 = f70Var instanceof na0 ? ((na0) f70Var).J0(this.n5) : f70Var.u7();
            if (this.q7 == -1) {
                if (inputStreamJ0 instanceof xb0) {
                    this.q7 = ((xb0) inputStreamJ0).FH();
                } else if (inputStreamJ0 instanceof h70) {
                    this.q7 = ((h70) inputStreamJ0).j6();
                }
            }
            return inputStreamJ0;
        }
    }

    public na0(long j, long j2, int i, wa0 wa0Var, ja0 ja0Var) {
        this.FH = j;
        this.Hw = j2;
        this.v5 = i;
        this.Zo = wa0Var;
        this.VH = ja0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream J0(ob0 ob0Var) {
        try {
            InflaterInputStream inflaterInputStream = new InflaterInputStream(new db0(this.Zo, this.FH + this.v5, ob0Var));
            f70 f70VarSf = this.Zo.Sf(ob0Var, this.Hw);
            b bVar = new b(this, inflaterInputStream, f70VarSf, ob0Var);
            if (this.j6 == -1 && !(f70VarSf instanceof na0)) {
                this.j6 = f70VarSf.VH();
            }
            if (this.DW == -1) {
                this.DW = bVar.FH();
            }
            return bVar;
        } catch (IOException unused) {
            return ob0Var.Ws(we()).u7();
        }
    }

    private a70 we() {
        return this.Zo.lg(this.FH);
    }

    @Override // abcd.f70
    public byte[] Hw() {
        try {
            throw new n40(we());
        } catch (IOException e) {
            n40 n40Var = new n40();
            n40Var.initCause(e);
            throw n40Var;
        }
    }

    @Override // abcd.f70
    public int VH() {
        if (this.j6 == -1) {
            ob0 ob0Var = new ob0(this.VH);
            try {
                try {
                    try {
                        this.j6 = this.Zo.nw(ob0Var, this.FH);
                    } catch (IOException unused) {
                    }
                } finally {
                    ob0Var.XL();
                }
            } catch (IOException unused2) {
                this.j6 = ob0Var.Ws(we()).VH();
            }
        }
        return this.j6;
    }

    @Override // abcd.f70
    public long Zo() {
        if (this.DW == -1) {
            ob0 ob0Var = new ob0(this.VH);
            try {
                try {
                    this.DW = rb0.FH(this.Zo.gW(ob0Var, this.FH + this.v5));
                } catch (IOException unused) {
                    this.DW = ob0Var.Ws(we()).Zo();
                } catch (IOException | DataFormatException unused2) {
                }
            } finally {
                ob0Var.XL();
            }
        }
        return this.DW;
    }

    @Override // abcd.f70
    public boolean gn() {
        return true;
    }

    @Override // abcd.f70
    public h70 u7() {
        a70 a70VarWe = we();
        ob0 ob0Var = new ob0(this.VH);
        f70 f70VarVy = this.VH.vy(ob0Var, a70VarWe.BT(), a70VarWe);
        if (f70VarVy != null) {
            return f70VarVy.u7();
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(J0(ob0Var), 8192);
        int iVH = VH();
        long jZo = Zo();
        ua0 ua0VarV5 = this.VH.v5();
        File fileQX = ua0VarV5.QX();
        DeflaterOutputStream deflaterOutputStreamJ8 = ua0VarV5.J8(new FileOutputStream(fileQX));
        ua0VarV5.Mr(deflaterOutputStreamJ8, iVH, jZo);
        return new a(iVH, jZo, new xg0(bufferedInputStream, deflaterOutputStreamJ8), ua0VarV5, ob0Var, fileQX, a70VarWe);
    }
}
