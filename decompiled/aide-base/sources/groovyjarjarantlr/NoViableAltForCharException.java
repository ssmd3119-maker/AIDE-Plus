package groovyjarjarantlr;

/* loaded from: classes.dex */
public class NoViableAltForCharException extends RecognitionException {
    public char fY;

    public NoViableAltForCharException(char c, String str, int i, int i2) {
        super("NoViableAlt", str, i, i2);
        this.fY = c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        char c = this.fY;
        if (c < ' ' || c > '~') {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("unexpected char: ");
            stringBuffer.append("0x");
            stringBuffer.append(Integer.toHexString(this.fY).toUpperCase());
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("unexpected char: ");
        stringBuffer2.append('\'');
        String string = stringBuffer2.toString();
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(string);
        stringBuffer3.append(this.fY);
        String string2 = stringBuffer3.toString();
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(string2);
        stringBuffer4.append('\'');
        return stringBuffer4.toString();
    }
}
