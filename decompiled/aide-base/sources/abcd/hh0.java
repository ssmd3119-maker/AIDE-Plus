package abcd;

/* loaded from: classes.dex */
public class hh0 extends Exception {
    private int WB;
    private int jw;
    private Object mb;

    public hh0(int i, int i2, Object obj) {
        this.jw = i;
        this.WB = i2;
        this.mb = obj;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.WB;
        if (i == 0) {
            stringBuffer.append("Unexpected character (");
            stringBuffer.append(this.mb);
            str = ") at position ";
        } else if (i == 1) {
            stringBuffer.append("Unexpected token ");
            stringBuffer.append(this.mb);
            str = " at position ";
        } else {
            if (i == 2) {
                stringBuffer.append("Unexpected exception at position ");
                stringBuffer.append(this.jw);
                stringBuffer.append(": ");
                stringBuffer.append(this.mb);
                return stringBuffer.toString();
            }
            str = "Unkown error at position ";
        }
        stringBuffer.append(str);
        stringBuffer.append(this.jw);
        stringBuffer.append(".");
        return stringBuffer.toString();
    }
}
