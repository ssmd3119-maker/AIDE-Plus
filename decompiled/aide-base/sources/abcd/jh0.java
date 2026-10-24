package abcd;

import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public class jh0 {
    public Object DW;
    public int j6;

    public jh0(int i, Object obj) {
        this.j6 = 0;
        this.DW = null;
        this.j6 = i;
        this.DW = obj;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.j6) {
            case -1:
                str = "END OF FILE";
                break;
            case 0:
                stringBuffer.append("VALUE(");
                stringBuffer.append(this.DW);
                str = ")";
                break;
            case 1:
                str = "LEFT BRACE({)";
                break;
            case 2:
                str = "RIGHT BRACE(})";
                break;
            case 3:
                str = "LEFT SQUARE([)";
                break;
            case 4:
                str = "RIGHT SQUARE(])";
                break;
            case 5:
                str = "COMMA(,)";
                break;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                str = "COLON(:)";
                break;
            default:
                return stringBuffer.toString();
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
