package groovyjarjarantlr;

import com.probelytics.api.UserTouchAction;
import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class MismatchedTokenException extends RecognitionException {
    public int AL;
    String[] fY;
    public int k2;
    String qp;
    public BitSet w9;
    public int zh;

    public MismatchedTokenException() {
        super("Mismatched Token: expecting any AST node", "<AST>", -1, -1);
        this.qp = null;
    }

    private String FH(int i) {
        if (i == 0) {
            return "<Set of tokens>";
        }
        if (i >= 0) {
            String[] strArr = this.fY;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<");
        stringBuffer.append(String.valueOf(i));
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.k2) {
            case 1:
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("expecting ");
                stringBuffer2.append(FH(this.zh));
                stringBuffer2.append(", found '");
                stringBuffer2.append(this.qp);
                stringBuffer2.append("'");
                stringBuffer.append(stringBuffer2.toString());
                break;
            case 2:
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("expecting anything but ");
                stringBuffer3.append(FH(this.zh));
                stringBuffer3.append("; got it anyway");
                stringBuffer.append(stringBuffer3.toString());
                break;
            case 3:
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("expecting token in range: ");
                stringBuffer4.append(FH(this.zh));
                stringBuffer4.append("..");
                stringBuffer4.append(FH(this.AL));
                stringBuffer4.append(", found '");
                stringBuffer4.append(this.qp);
                stringBuffer4.append("'");
                stringBuffer.append(stringBuffer4.toString());
                break;
            case 4:
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("expecting token NOT in range: ");
                stringBuffer5.append(FH(this.zh));
                stringBuffer5.append("..");
                stringBuffer5.append(FH(this.AL));
                stringBuffer5.append(", found '");
                stringBuffer5.append(this.qp);
                stringBuffer5.append("'");
                stringBuffer.append(stringBuffer5.toString());
                break;
            case 5:
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("expecting ");
                stringBuffer6.append(this.k2 == 6 ? "NOT " : "");
                stringBuffer6.append("one of (");
                stringBuffer.append(stringBuffer6.toString());
                for (int i : this.w9.j3()) {
                    stringBuffer.append(" ");
                    stringBuffer.append(FH(i));
                }
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append("), found '");
                stringBuffer7.append(this.qp);
                stringBuffer7.append("'");
                stringBuffer.append(stringBuffer7.toString());
                break;
            default:
                stringBuffer.append(super.getMessage());
                break;
        }
        return stringBuffer.toString();
    }

    public MismatchedTokenException(String[] strArr, Token token, int i, boolean z, String str) {
        super("Mismatched Token", str, token.FH(), token.Zo());
        this.qp = null;
        this.fY = strArr;
        this.qp = token.j6();
        this.k2 = z ? 2 : 1;
        this.zh = i;
    }

    public MismatchedTokenException(String[] strArr, Token token, BitSet bitSet, boolean z, String str) {
        super("Mismatched Token", str, token.FH(), token.Zo());
        this.qp = null;
        this.fY = strArr;
        this.qp = token.j6();
        this.k2 = z ? 6 : 5;
        this.w9 = bitSet;
    }
}
