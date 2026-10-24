package groovyjarjarantlr;

/* loaded from: classes.dex */
public class RecognitionException extends ANTLRException {
    public String WB;
    public int jw;
    public int mb;

    public RecognitionException() {
        super("parsing error");
        this.WB = null;
        this.mb = -1;
        this.jw = -1;
    }

    public int DW() {
        return this.mb;
    }

    public int j6() {
        return this.jw;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(FileLineFormatter.DW().j6(this.WB, this.mb, this.jw));
        stringBuffer.append(getMessage());
        return stringBuffer.toString();
    }

    public RecognitionException(String str) {
        super(str);
        this.WB = null;
        this.mb = -1;
        this.jw = -1;
    }

    public RecognitionException(String str, String str2, int i, int i2) {
        super(str);
        this.WB = str2;
        this.mb = i;
        this.jw = i2;
    }
}
