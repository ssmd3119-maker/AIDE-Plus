package abcd;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class fi0 {
    private final int DW;
    private final byte[][] FH;
    private final InputStream j6;

    public fi0(InputStream inputStream) {
        this(inputStream, jk0.FH(inputStream));
    }

    private void v5(boolean z) {
        InputStream inputStream = this.j6;
        if (inputStream instanceof ek0) {
            ((ek0) inputStream).Hw(z);
        }
    }

    public mh0 DW() throws IOException {
        int i = this.j6.read();
        if (i == -1) {
            return null;
        }
        v5(false);
        int iJ0 = rh0.J0(this.j6, i);
        boolean z = (i & 32) != 0;
        int iEQ = rh0.EQ(this.j6, this.DW);
        if (iEQ < 0) {
            if (!z) {
                throw new IOException("indefinite length primitive encoding encountered");
            }
            fi0 fi0Var = new fi0(new ek0(this.j6, this.DW), this.DW);
            return (i & 64) != 0 ? new ki0(iJ0, fi0Var) : (i & 128) != 0 ? new ti0(true, iJ0, fi0Var) : fi0Var.j6(iJ0);
        }
        ck0 ck0Var = new ck0(this.j6, iEQ);
        if ((i & 64) != 0) {
            return new vi0(z, iJ0, ck0Var.FH());
        }
        if ((i & 128) != 0) {
            return new ti0(z, iJ0, new fi0(ck0Var));
        }
        if (!z) {
            if (iJ0 == 4) {
                return new lj0(ck0Var);
            }
            try {
                return rh0.Hw(iJ0, ck0Var, this.FH);
            } catch (IllegalArgumentException e) {
                throw new ph0("corrupted stream detected", e);
            }
        }
        if (iJ0 == 4) {
            return new ni0(new fi0(ck0Var));
        }
        if (iJ0 == 8) {
            return new bj0(new fi0(ck0Var));
        }
        if (iJ0 == 16) {
            return new pj0(new fi0(ck0Var));
        }
        if (iJ0 == 17) {
            return new rj0(new fi0(ck0Var));
        }
        throw new IOException("unknown tag " + iJ0 + " encountered");
    }

    public ai0 FH(boolean z, int i) throws IOException {
        if (!z) {
            return new tj0(false, i, new kj0(((ck0) this.j6).FH()));
        }
        nh0 nh0VarHw = Hw();
        return this.j6 instanceof ek0 ? nh0VarHw.FH() == 1 ? new si0(true, i, nh0VarHw.DW(0)) : new si0(false, i, li0.j6(nh0VarHw)) : nh0VarHw.FH() == 1 ? new tj0(true, i, nh0VarHw.DW(0)) : new tj0(false, i, cj0.j6(nh0VarHw));
    }

    public nh0 Hw() throws IOException {
        nh0 nh0Var = new nh0();
        while (true) {
            mh0 mh0VarDW = DW();
            if (mh0VarDW == null) {
                return nh0Var;
            }
            if (mh0VarDW instanceof dk0) {
                nh0Var.j6(((dk0) mh0VarDW).Hw());
            } else {
                nh0Var.j6(mh0VarDW.DW());
            }
        }
    }

    public mh0 j6(int i) throws ph0 {
        if (i == 4) {
            return new ni0(this);
        }
        if (i == 8) {
            return new bj0(this);
        }
        if (i == 16) {
            return new pi0(this);
        }
        if (i == 17) {
            return new ri0(this);
        }
        throw new ph0("unknown BER object encountered: 0x" + Integer.toHexString(i));
    }

    public fi0(InputStream inputStream, int i) {
        this.j6 = inputStream;
        this.DW = i;
        this.FH = new byte[11][];
    }
}
