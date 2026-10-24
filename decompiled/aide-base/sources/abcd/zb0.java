package abcd;

import abcd.n40;
import abcd.pg0;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.Deflater;

/* loaded from: classes.dex */
public class zb0 {
    private final tb0 DW;
    private pg0.c EQ;
    private final g70 FH;
    private final ac0[] Hw;
    private Deflater J0;
    private long VH;
    private final int Zo;
    private int gn;
    private final ec0 j6;
    private ac0 tp;
    private int u7;
    private final long v5;
    private int we;

    public zb0(ec0 ec0Var, tb0 tb0Var, g70 g70Var) {
        this.j6 = ec0Var;
        this.DW = tb0Var;
        this.FH = g70Var;
        this.Hw = new ac0[ec0Var.VH() + 1];
        int i = 0;
        while (true) {
            ac0[] ac0VarArr = this.Hw;
            if (i >= ac0VarArr.length) {
                this.v5 = this.j6.Zo();
                this.Zo = this.j6.tp();
                return;
            } else {
                ac0VarArr[i] = new ac0();
                i++;
            }
        }
    }

    private void DW(dc0 dc0Var, dc0 dc0Var2) {
        if (2147483647L < this.EQ.gn()) {
            return;
        }
        int iGn = (int) this.EQ.gn();
        if (this.DW.DW(iGn, dc0Var, dc0Var2)) {
            try {
                byte[] bArr = new byte[Hw(iGn)];
                a aVar = new a(v5(), bArr);
                this.EQ.Ws(aVar, null);
                this.EQ = null;
                dc0Var2.oY(this.DW.j6(bArr, aVar.j6(), iGn));
                dc0Var2.ko(iGn);
            } catch (IOException unused) {
                this.DW.Hw(iGn);
            } catch (OutOfMemoryError unused2) {
                this.DW.Hw(iGn);
            }
        }
    }

    private boolean EQ(ac0 ac0Var, pg0.c cVar) {
        if (this.EQ == null) {
            return true;
        }
        return cVar.gn() == this.EQ.gn() ? ac0Var.j6() < this.Hw[this.we].j6() : cVar.gn() < this.EQ.gn();
    }

    private void FH(ac0 ac0Var) {
        vb0 vb0Var = ac0Var.FH;
        if (vb0Var != null) {
            this.VH -= vb0Var.VH();
        } else if (this.tp.DW != null) {
            this.VH -= ac0Var.DW.length;
        }
        ac0Var.FH(null);
    }

    private static int Hw(int i) {
        return ((i + 7) >> 3) + i + ((i + 63) >> 6) + 11;
    }

    private int J0(int i) {
        int i2 = i + 1;
        if (i2 == this.Hw.length) {
            return 0;
        }
        return i2;
    }

    private int J8(int i) {
        return i == 0 ? this.Hw.length - 1 : i - 1;
    }

    private static int VH(ac0 ac0Var, int i, ac0 ac0Var2) {
        return (((ac0Var.Hw() / 2) - 20) * (i - ac0Var2.j6())) / i;
    }

    private void Ws() {
        ac0 ac0Var;
        this.u7 = this.Zo;
        int iJ8 = this.gn;
        do {
            iJ8 = J8(iJ8);
            if (iJ8 != this.gn) {
                ac0Var = this.Hw[iJ8];
                if (ac0Var.DW()) {
                }
            }
            if (this.EQ == null) {
                we();
                return;
            }
            dc0 dc0Var = this.Hw[this.we].j6;
            dc0 dc0Var2 = this.tp.j6;
            if (dc0Var.Xa()) {
                dc0Var2.Ev(dc0Var.Zo());
            } else {
                dc0Var2.Ev(dc0Var);
            }
            dc0Var2.ye(dc0Var.yO() + 1);
            dc0Var2.OW();
            DW(dc0Var, dc0Var2);
            this.EQ = null;
            if (dc0Var2.yO() == this.Zo) {
                return;
            }
            XL();
            we();
            return;
        } while (Zo(ac0Var, iJ8) != 0);
        this.EQ = null;
    }

    private void XL() {
        ac0[] ac0VarArr = this.Hw;
        int i = this.gn;
        ac0VarArr[i] = ac0VarArr[this.we];
        ac0 ac0Var = this.tp;
        int iJ8 = J8(i);
        while (iJ8 != this.we) {
            ac0[] ac0VarArr2 = this.Hw;
            ac0 ac0Var2 = ac0VarArr2[iJ8];
            ac0VarArr2[iJ8] = ac0Var;
            iJ8 = J8(iJ8);
            ac0Var = ac0Var2;
        }
        this.Hw[iJ8] = ac0Var;
    }

    private int Zo(ac0 ac0Var, int i) throws IOException {
        int iVH;
        if (ac0Var.v5() != this.tp.v5()) {
            we();
            return 0;
        }
        int iJ6 = ac0Var.j6();
        int i2 = this.u7;
        if (iJ6 > i2 || (iVH = VH(this.tp, i2, ac0Var)) <= 8 || this.tp.Hw() - ac0Var.Hw() > iVH || this.tp.Hw() < ac0Var.Hw() / 16) {
            return 1;
        }
        try {
            vb0 vb0VarTp = tp(ac0Var);
            try {
                byte[] bArrJ6 = j6(this.tp);
                pg0.c cVar = this.EQ;
                if (cVar != null && cVar.gn() < iVH) {
                    iVH = (int) this.EQ.gn();
                }
                pg0.c cVar2 = new pg0.c(iVH);
                try {
                    if (vb0VarTp.Hw(cVar2, bArrJ6, iVH) && EQ(ac0Var, cVar2)) {
                        this.EQ = cVar2;
                        this.we = i;
                    }
                } catch (IOException unused) {
                }
                return 1;
            } catch (n40 unused2) {
                return 0;
            }
        } catch (n40 unused3) {
            gn(i);
            return 1;
        } catch (IOException e) {
            if (!ac0Var.j6.Xa()) {
                throw e;
            }
            gn(i);
            return 1;
        }
    }

    private void gn(int i) {
    }

    private byte[] j6(ac0 ac0Var) {
        byte[] bArrVH = ac0Var.DW;
        if (bArrVH == null) {
            bArrVH = gc0.VH(this.j6, this.FH, ac0Var.j6);
            if (0 < this.v5) {
                this.VH += bArrVH.length;
            }
            ac0Var.DW = bArrVH;
        }
        return bArrVH;
    }

    private vb0 tp(ac0 ac0Var) {
        vb0 vb0Var = ac0Var.FH;
        if (vb0Var == null) {
            try {
                vb0Var = new vb0(j6(ac0Var));
                if (0 < this.v5) {
                    this.VH += vb0Var.VH() - vb0Var.gn();
                }
                ac0Var.FH = vb0Var;
            } catch (OutOfMemoryError e) {
                n40.c cVar = new n40.c(e);
                cVar.FH(ac0Var.j6);
                throw cVar;
            }
        }
        return vb0Var;
    }

    private static long u7(dc0 dc0Var) {
        return vb0.v5(dc0Var.wc());
    }

    private Deflater v5() {
        Deflater deflater = this.J0;
        if (deflater == null) {
            this.J0 = new Deflater(this.j6.FH());
        } else {
            deflater.reset();
        }
        return this.J0;
    }

    private void we() {
        this.gn = J0(this.gn);
    }

    public void QX(j70 j70Var, dc0[] dc0VarArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            try {
                ac0 ac0Var = this.Hw[this.gn];
                this.tp = ac0Var;
                if (0 < this.v5) {
                    FH(ac0Var);
                    int iJ0 = J0(this.gn);
                    long jU7 = u7(dc0VarArr[i]);
                    while (this.v5 < this.VH + jU7 && iJ0 != this.gn) {
                        FH(this.Hw[iJ0]);
                        iJ0 = J0(iJ0);
                    }
                }
                this.tp.FH(dc0VarArr[i]);
                if (this.tp.j6.Xa()) {
                    we();
                } else {
                    j70Var.v5(1);
                    Ws();
                }
                i++;
            } finally {
                Deflater deflater = this.J0;
                if (deflater != null) {
                    deflater.end();
                }
            }
        }
    }

    static final class a extends OutputStream {
        private final Deflater WB;
        private int jw;
        private final byte[] mb;

        public a(Deflater deflater, byte[] bArr) {
            this.WB = deflater;
            this.mb = bArr;
        }

        public int j6() throws IOException {
            this.WB.finish();
            while (true) {
                int i = this.jw;
                byte[] bArr = this.mb;
                if (i == bArr.length) {
                    throw new EOFException();
                }
                int iDeflate = this.WB.deflate(bArr, i, bArr.length - i);
                if (iDeflate == 0) {
                    if (this.WB.finished()) {
                        return this.jw;
                    }
                    throw new IOException();
                }
                this.jw += iDeflate;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.WB.setInput(bArr, i, i2);
            while (true) {
                int i3 = this.jw;
                byte[] bArr2 = this.mb;
                if (i3 == bArr2.length) {
                    throw new EOFException();
                }
                int iDeflate = this.WB.deflate(bArr2, i3, bArr2.length - i3);
                if (iDeflate == 0) {
                    if (!this.WB.needsInput()) {
                        throw new IOException();
                    }
                    return;
                }
                this.jw += iDeflate;
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            throw new UnsupportedOperationException();
        }
    }
}
