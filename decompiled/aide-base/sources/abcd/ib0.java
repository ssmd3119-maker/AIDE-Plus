package abcd;

import java.io.Serializable;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class ib0 implements Serializable {
    private a70 WB;
    private String fY;
    private i70 jw;
    private a70 mb;

    public ib0(byte[] bArr, int i) {
        this.WB = a70.g3(bArr, i);
        int i2 = i + 40;
        int i3 = i2 + 1;
        if (bArr[i2] != 32) {
            throw new IllegalArgumentException(JGitText.DW().rawLogMessageDoesNotParseAsLogEntry);
        }
        this.mb = a70.g3(bArr, i3);
        int i4 = i3 + 40;
        int i5 = i4 + 1;
        if (bArr[i4] != 32) {
            throw new IllegalArgumentException(JGitText.DW().rawLogMessageDoesNotParseAsLogEntry);
        }
        this.jw = kg0.gW(bArr, i5);
        int iXL = kg0.XL(bArr, i5, '\t');
        if (iXL >= bArr.length) {
            this.fY = "";
        } else {
            int iAM = kg0.aM(bArr, iXL);
            this.fY = iAM > iXL ? kg0.gn(bArr, iXL, iAM - 1) : "";
        }
    }

    public a70 DW() {
        return this.mb;
    }

    public i70 FH() {
        return this.jw;
    }

    public String j6() {
        return this.fY;
    }

    public String toString() {
        return "Entry[" + this.WB.BT() + ", " + this.mb.BT() + ", " + FH() + ", " + j6() + "]";
    }
}
