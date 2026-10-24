package abcd;

import abcd.pg0;
import java.io.IOException;

/* loaded from: classes.dex */
public class w70 {
    private int DW;
    private pg0.c FH;
    private byte[] j6;

    public w70(int i) {
        this.j6 = new byte[i];
    }

    public static int Hw(t60 t60Var, int i) {
        return t60Var.FH() + i + 20 + 2;
    }

    private void Zo(byte[] bArr, int i, int i2, t60 t60Var) throws IOException {
        if (this.j6 != null) {
            pg0.c cVar = new pg0.c(Integer.MAX_VALUE);
            this.FH = cVar;
            cVar.write(this.j6, 0, this.DW);
            this.j6 = null;
        }
        t60Var.j6(this.FH);
        this.FH.write(32);
        this.FH.write(bArr, i, i2);
        this.FH.write(0);
    }

    private boolean v5(byte[] bArr, int i, int i2, t60 t60Var) {
        byte[] bArr2 = this.j6;
        if (bArr2 == null || bArr2.length < this.DW + Hw(t60Var, i2)) {
            return false;
        }
        t60Var.DW(this.j6, this.DW);
        int iFH = this.DW + t60Var.FH();
        this.DW = iFH;
        byte[] bArr3 = this.j6;
        int i3 = iFH + 1;
        this.DW = i3;
        bArr3[iFH] = 32;
        System.arraycopy(bArr, i, bArr3, i3, i2);
        int i4 = this.DW + i2;
        this.DW = i4;
        byte[] bArr4 = this.j6;
        this.DW = i4 + 1;
        bArr4[i4] = 0;
        return true;
    }

    public void DW(byte[] bArr, int i, int i2, t60 t60Var, byte[] bArr2, int i3) {
        if (v5(bArr, i, i2, t60Var)) {
            System.arraycopy(bArr2, i3, this.j6, this.DW, 20);
            this.DW += 20;
        } else {
            try {
                Zo(bArr, i, i2, t60Var);
                this.FH.write(bArr2, i3, 20);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void FH(byte[] bArr, t60 t60Var, j60 j60Var) {
        j6(bArr, 0, bArr.length, t60Var, j60Var);
    }

    public a70 VH(e70 e70Var) {
        byte[] bArr = this.j6;
        return bArr != null ? e70Var.gn(2, bArr, 0, this.DW) : e70Var.Zo(2, this.FH.gn(), this.FH.u7());
    }

    public byte[] gn() {
        byte[] bArr = this.j6;
        if (bArr == null) {
            try {
                return this.FH.J8();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        int i = this.DW;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public void j6(byte[] bArr, int i, int i2, t60 t60Var, j60 j60Var) {
        if (v5(bArr, i, i2, t60Var)) {
            j60Var.tp(this.j6, this.DW);
            this.DW += 20;
        } else {
            try {
                Zo(bArr, i, i2, t60Var);
                j60Var.u7(this.FH);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String toString() {
        byte[] bArrGn = gn();
        ff0 ff0Var = new ff0();
        ff0Var.ro(bArrGn);
        StringBuilder sb = new StringBuilder();
        sb.append("Tree={");
        if (!ff0Var.VH()) {
            sb.append('\n');
            try {
                new y60().v5(bArrGn);
            } catch (i40 e) {
                sb.append("*** ERROR: ");
                sb.append(e.getMessage());
                sb.append("\n");
                sb.append('\n');
            }
        }
        while (!ff0Var.VH()) {
            t60 t60VarU7 = ff0Var.u7();
            sb.append(t60VarU7);
            sb.append(' ');
            sb.append(r60.VH(t60VarU7.VH()));
            sb.append(' ');
            sb.append(ff0Var.tp().BT());
            sb.append(' ');
            sb.append(ff0Var.we());
            sb.append('\n');
            ff0Var.nw();
        }
        sb.append("}");
        return sb.toString();
    }
}
