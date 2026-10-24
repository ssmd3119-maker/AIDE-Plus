package groovyjarjarantlr;

import com.probelytics.api.UserTouchAction;
import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class MismatchedCharException extends RecognitionException {
    public BitSet AL;
    public int fY;
    public int k2;
    public int qp;
    public int zh;

    public MismatchedCharException() {
        super("Mismatched char");
    }

    private void FH(StringBuffer stringBuffer, int i) {
        if (i == 9) {
            stringBuffer.append("'\\t'");
            return;
        }
        if (i == 10) {
            stringBuffer.append("'\\n'");
            return;
        }
        if (i == 13) {
            stringBuffer.append("'\\r'");
        } else {
            if (i == 65535) {
                stringBuffer.append("'<EOF>'");
                return;
            }
            stringBuffer.append('\'');
            stringBuffer.append((char) i);
            stringBuffer.append('\'');
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.fY) {
            case 1:
                stringBuffer.append("expecting ");
                FH(stringBuffer, this.k2);
                stringBuffer.append(", found ");
                FH(stringBuffer, this.qp);
                break;
            case 2:
                stringBuffer.append("expecting anything but '");
                FH(stringBuffer, this.k2);
                stringBuffer.append("'; got it anyway");
                break;
            case 3:
            case 4:
                stringBuffer.append("expecting token ");
                if (this.fY == 4) {
                    stringBuffer.append("NOT ");
                }
                stringBuffer.append("in range: ");
                FH(stringBuffer, this.k2);
                stringBuffer.append("..");
                FH(stringBuffer, this.zh);
                stringBuffer.append(", found ");
                FH(stringBuffer, this.qp);
                break;
            case 5:
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("expecting ");
                stringBuffer2.append(this.fY != 6 ? "" : "NOT ");
                stringBuffer2.append("one of (");
                stringBuffer.append(stringBuffer2.toString());
                for (int i : this.AL.j3()) {
                    FH(stringBuffer, i);
                }
                stringBuffer.append("), found ");
                FH(stringBuffer, this.qp);
                break;
            default:
                stringBuffer.append(super.getMessage());
                break;
        }
        return stringBuffer.toString();
    }

    public MismatchedCharException(char c, char c2, char c3, boolean z, CharScanner charScanner) {
        super("Mismatched char", charScanner.VH(), charScanner.gn(), charScanner.Zo());
        this.fY = z ? 4 : 3;
        this.qp = c;
        this.k2 = c2;
        this.zh = c3;
    }

    public MismatchedCharException(char c, char c2, boolean z, CharScanner charScanner) {
        super("Mismatched char", charScanner.VH(), charScanner.gn(), charScanner.Zo());
        this.fY = z ? 2 : 1;
        this.qp = c;
        this.k2 = c2;
    }

    public MismatchedCharException(char c, BitSet bitSet, boolean z, CharScanner charScanner) {
        super("Mismatched char", charScanner.VH(), charScanner.gn(), charScanner.Zo());
        this.fY = z ? 6 : 5;
        this.qp = c;
        this.AL = bitSet;
    }
}
