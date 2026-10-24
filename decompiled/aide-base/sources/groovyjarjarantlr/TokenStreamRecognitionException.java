package groovyjarjarantlr;

/* loaded from: classes.dex */
public class TokenStreamRecognitionException extends TokenStreamException {
    public RecognitionException WB;

    public TokenStreamRecognitionException(RecognitionException recognitionException) {
        super(recognitionException.getMessage());
        this.WB = recognitionException;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.WB.toString();
    }
}
