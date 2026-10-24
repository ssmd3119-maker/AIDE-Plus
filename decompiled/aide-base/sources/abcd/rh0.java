package abcd;

import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class rh0 extends FilterInputStream {
    private final int WB;
    private final byte[][] jw;
    private final boolean mb;

    public rh0(InputStream inputStream) {
        this(inputStream, jk0.FH(inputStream));
    }

    public static int EQ(InputStream inputStream, int i) throws IOException {
        int i2 = inputStream.read();
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (i2 == 128) {
            return -1;
        }
        if (i2 <= 127) {
            return i2;
        }
        int i3 = i2 & 127;
        if (i3 > 4) {
            throw new IOException("DER length more than 4 bytes: " + i3);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i4 = (i4 << 8) + i6;
        }
        if (i4 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i4 < i) {
            return i4;
        }
        throw new IOException("corrupted stream - out of bounds length found");
    }

    public static ai0 Hw(int i, ck0 ck0Var, byte[][] bArr) throws IOException {
        switch (i) {
            case 1:
                return yi0.J8(gn(ck0Var, bArr));
            case 2:
                return new sh0(ck0Var.FH());
            case 3:
                return xi0.J8(ck0Var.j6(), ck0Var);
            case 4:
                return new kj0(ck0Var.FH());
            case 5:
                return hj0.WB;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return jj0.Ws(gn(ck0Var, bArr));
            case UserTouchAction.CLICK_KIND /* 7 */:
            case 8:
            case 9:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
            case 21:
            case 25:
            case 29:
            default:
                throw new IOException("unknown tag " + i + " encountered");
            case 10:
                return zi0.J8(gn(ck0Var, bArr));
            case 12:
                return new vj0(ck0Var.FH());
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                return new ij0(ck0Var.FH());
            case 19:
                return new nj0(ck0Var.FH());
            case ProxyTextView.INPUTTYPE_date /* 20 */:
                return new sj0(ck0Var.FH());
            case 22:
                return new fj0(ck0Var.FH());
            case 23:
                return new ii0(ck0Var.FH());
            case 24:
                return new qh0(ck0Var.FH());
            case 26:
                return new xj0(ck0Var.FH());
            case 27:
                return new dj0(ck0Var.FH());
            case 28:
                return new wj0(ck0Var.FH());
            case 30:
                return new wi0(Zo(ck0Var));
        }
    }

    public static int J0(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int i4 = inputStream.read();
        if ((i4 & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while (i4 >= 0 && (i4 & 128) != 0) {
            i3 = (i3 | (i4 & 127)) << 7;
            i4 = inputStream.read();
        }
        if (i4 >= 0) {
            return i3 | (i4 & 127);
        }
        throw new EOFException("EOF found inside tag value.");
    }

    private static char[] Zo(ck0 ck0Var) throws IOException {
        int i;
        int iJ6 = ck0Var.j6() / 2;
        char[] cArr = new char[iJ6];
        for (int i2 = 0; i2 < iJ6; i2++) {
            int i3 = ck0Var.read();
            if (i3 < 0 || (i = ck0Var.read()) < 0) {
                break;
            }
            cArr[i2] = (char) ((i3 << 8) | (i & 255));
        }
        return cArr;
    }

    private static byte[] gn(ck0 ck0Var, byte[][] bArr) {
        int iJ6 = ck0Var.j6();
        if (ck0Var.j6() >= bArr.length) {
            return ck0Var.FH();
        }
        byte[] bArr2 = bArr[iJ6];
        if (bArr2 == null) {
            bArr2 = new byte[iJ6];
            bArr[iJ6] = bArr2;
        }
        mq0.FH(ck0Var, bArr2);
        return bArr2;
    }

    public nh0 DW() throws IOException {
        nh0 nh0Var = new nh0();
        while (true) {
            ai0 ai0VarWe = we();
            if (ai0VarWe == null) {
                return nh0Var;
            }
            nh0Var.j6(ai0VarWe);
        }
    }

    public ai0 FH(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        ck0 ck0Var = new ck0(this, i3);
        if ((i & 64) != 0) {
            return new vi0(z, i2, ck0Var.FH());
        }
        if ((i & 128) != 0) {
            return new fi0(ck0Var).FH(z, i2);
        }
        if (!z) {
            return Hw(i2, ck0Var, this.jw);
        }
        if (i2 == 4) {
            nh0 nh0VarJ6 = j6(ck0Var);
            int iFH = nh0VarJ6.FH();
            wh0[] wh0VarArr = new wh0[iFH];
            for (int i4 = 0; i4 != iFH; i4++) {
                wh0VarArr[i4] = (wh0) nh0VarJ6.DW(i4);
            }
            return new mi0(wh0VarArr);
        }
        if (i2 == 8) {
            return new aj0(j6(ck0Var));
        }
        if (i2 == 16) {
            return this.mb ? new gk0(ck0Var.FH()) : cj0.j6(j6(ck0Var));
        }
        if (i2 == 17) {
            return cj0.DW(j6(ck0Var));
        }
        throw new IOException("unknown tag " + i2 + " encountered");
    }

    public nh0 j6(ck0 ck0Var) {
        return new rh0(ck0Var).DW();
    }

    public int tp() {
        return EQ(this, this.WB);
    }

    public int u7() {
        return this.WB;
    }

    public ai0 we() throws IOException {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iJ0 = J0(this, i);
        boolean z = (i & 32) != 0;
        int iTp = tp();
        if (iTp >= 0) {
            try {
                return FH(i, iJ0, iTp);
            } catch (IllegalArgumentException e) {
                throw new ph0("corrupted stream detected", e);
            }
        }
        if (!z) {
            throw new IOException("indefinite length primitive encoding encountered");
        }
        fi0 fi0Var = new fi0(new ek0(this, this.WB), this.WB);
        if ((i & 64) != 0) {
            return new ki0(iJ0, fi0Var).Hw();
        }
        if ((i & 128) != 0) {
            return new ti0(true, iJ0, fi0Var).Hw();
        }
        if (iJ0 == 4) {
            return new ni0(fi0Var).Hw();
        }
        if (iJ0 == 8) {
            return new bj0(fi0Var).Hw();
        }
        if (iJ0 == 16) {
            return new pi0(fi0Var).Hw();
        }
        if (iJ0 == 17) {
            return new ri0(fi0Var).Hw();
        }
        throw new IOException("unknown BER object encountered");
    }

    public rh0(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public rh0(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }

    public rh0(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public rh0(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.WB = i;
        this.mb = z;
        this.jw = new byte[11][];
    }
}
