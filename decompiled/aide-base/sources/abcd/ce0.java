package abcd;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class ce0 extends InputStream {
    private boolean AL;
    private final InputStream WB;
    private final Writer fY;
    private int hK;
    private final j70 jw;
    private final md0 mb;
    private int w9;
    private int zh;
    private static final String cT = JGitText.DW().prefixRemote;
    private static Pattern q7 = Pattern.compile("^([\\w ]+): +(\\d+)(?:, done\\.)? *[\r\n]$");
    private static Pattern Z1 = Pattern.compile("^([\\w ]+): +\\d+% +\\( *(\\d+)/ *(\\d+)\\)(?:, done\\.)? *[\r\n]$");
    private String qp = "";
    private String k2 = "";

    public ce0(InputStream inputStream, j70 j70Var, Writer writer) {
        this.WB = inputStream;
        this.mb = new md0(this.WB);
        this.jw = j70Var;
        this.fY = writer;
    }

    private void DW(String str) throws NumberFormatException, IOException {
        Matcher matcher = Z1.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            if (!this.k2.equals(strGroup)) {
                this.k2 = strGroup;
                this.zh = 0;
                j6(Integer.parseInt(matcher.group(3)));
            }
            int i = Integer.parseInt(matcher.group(2));
            this.jw.v5(i - this.zh);
            this.zh = i;
            return;
        }
        Matcher matcher2 = q7.matcher(str);
        if (!matcher2.matches()) {
            this.fY.write(str);
            return;
        }
        String strGroup2 = matcher2.group(1);
        if (!this.k2.equals(strGroup2)) {
            this.k2 = strGroup2;
            this.zh = 0;
            j6(0);
        }
        int i2 = Integer.parseInt(matcher2.group(2));
        this.jw.v5(i2 - this.zh);
        this.zh = i2;
    }

    private void FH() throws IOException, NumberFormatException {
        if (this.AL) {
            return;
        }
        if (this.w9 == 1 && this.hK > 0) {
            return;
        }
        while (true) {
            int iDW = this.mb.DW();
            this.hK = iDW;
            if (iDW == 0) {
                this.AL = true;
                return;
            }
            int i = this.WB.read() & 255;
            this.w9 = i;
            int i2 = this.hK - 5;
            this.hK = i2;
            if (i2 != 0) {
                if (i == 1) {
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new y40(MessageFormat.format(JGitText.DW().invalidChannel, Integer.valueOf(this.w9)));
                    }
                    this.AL = true;
                    throw new j50(String.valueOf(cT) + Zo(this.hK));
                }
                Hw(Zo(i2));
            }
        }
    }

    private void Hw(String str) throws NumberFormatException, IOException {
        String strSubstring = String.valueOf(this.qp) + str;
        while (true) {
            int iIndexOf = strSubstring.indexOf(10);
            int iIndexOf2 = strSubstring.indexOf(13);
            if (iIndexOf >= 0 && iIndexOf2 >= 0) {
                iIndexOf = Math.min(iIndexOf, iIndexOf2);
            } else if (iIndexOf >= 0) {
                continue;
            } else {
                if (iIndexOf2 < 0) {
                    this.qp = strSubstring;
                    return;
                }
                iIndexOf = iIndexOf2;
            }
            int i = iIndexOf + 1;
            DW(strSubstring.substring(0, i));
            strSubstring = strSubstring.substring(i);
        }
    }

    private String Zo(int i) throws IOException {
        byte[] bArr = new byte[i];
        eg0.DW(this.WB, bArr, 0, i);
        return kg0.Zo(r60.Zo, bArr, 0, i);
    }

    private void j6(int i) {
        this.jw.j6(String.valueOf(cT) + this.k2, i);
    }

    @Override // java.io.InputStream
    public int read() throws IOException, NumberFormatException {
        FH();
        if (this.AL) {
            return -1;
        }
        this.hK--;
        return this.WB.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException, NumberFormatException {
        int i3;
        int i4 = 0;
        while (i2 > 0) {
            FH();
            if (this.AL || (i3 = this.WB.read(bArr, i, Math.min(i2, this.hK))) < 0) {
                break;
            }
            i4 += i3;
            i += i3;
            i2 -= i3;
            this.hK -= i3;
        }
        if (this.AL && i4 == 0) {
            return -1;
        }
        return i4;
    }
}
