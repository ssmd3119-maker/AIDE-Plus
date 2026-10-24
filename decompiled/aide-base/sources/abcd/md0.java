package abcd;

import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class md0 {
    public static final String FH = new StringBuilder(0).toString();
    private final byte[] DW = new byte[1000];
    private final InputStream j6;

    enum a {
        NAK,
        ACK,
        ACK_CONTINUE,
        ACK_COMMON,
        ACK_READY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public md0(InputStream inputStream) {
        this.j6 = inputStream;
    }

    public int DW() throws IOException {
        eg0.DW(this.j6, this.DW, 0, 4);
        try {
            int iA8 = kg0.a8(this.DW, 0);
            if (iA8 != 0 && iA8 < 4) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return iA8;
        } catch (ArrayIndexOutOfBoundsException unused) {
            String str = JGitText.DW().invalidPacketLineHeader;
            StringBuilder sb = new StringBuilder();
            sb.append((char) this.DW[0]);
            sb.append((char) this.DW[1]);
            sb.append((char) this.DW[2]);
            sb.append((char) this.DW[3]);
            throw new IOException(MessageFormat.format(str, sb.toString()));
        }
    }

    public String FH() throws IOException {
        int iDW = DW();
        if (iDW == 0) {
            return FH;
        }
        int i = iDW - 4;
        if (i == 0) {
            return "";
        }
        byte[] bArr = this.DW;
        if (i > bArr.length) {
            bArr = new byte[i];
        }
        eg0.DW(this.j6, bArr, 0, i);
        if (bArr[i - 1] == 10) {
            i--;
        }
        return kg0.Zo(r60.Zo, bArr, 0, i);
    }

    public String Hw() throws IOException {
        int iDW = DW();
        if (iDW == 0) {
            return FH;
        }
        int i = iDW - 4;
        byte[] bArr = this.DW;
        if (i > bArr.length) {
            bArr = new byte[i];
        }
        eg0.DW(this.j6, bArr, 0, i);
        return kg0.Zo(r60.Zo, bArr, 0, i);
    }

    public a j6(w60 w60Var) throws IOException {
        String strFH = FH();
        if (strFH.length() == 0) {
            throw new y40(JGitText.DW().expectedACKNAKFoundEOF);
        }
        if ("NAK".equals(strFH)) {
            return a.NAK;
        }
        if (strFH.startsWith("ACK ")) {
            w60Var.ef(strFH.substring(4, 44));
            if (strFH.length() == 44) {
                return a.ACK;
            }
            String strSubstring = strFH.substring(44);
            if (strSubstring.equals(" continue")) {
                return a.ACK_CONTINUE;
            }
            if (strSubstring.equals(" common")) {
                return a.ACK_COMMON;
            }
            if (strSubstring.equals(" ready")) {
                return a.ACK_READY;
            }
        }
        if (strFH.startsWith("ERR ")) {
            throw new y40(strFH.substring(4));
        }
        throw new y40(MessageFormat.format(JGitText.DW().expectedACKNAKGot, strFH));
    }
}
