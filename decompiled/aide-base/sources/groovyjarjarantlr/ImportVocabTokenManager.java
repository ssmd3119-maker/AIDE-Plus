package groovyjarjarantlr;

/* loaded from: classes.dex */
public class ImportVocabTokenManager extends SimpleTokenManager implements Cloneable {
    private String k2;
    protected Grammar zh;

    @Override // groovyjarjarantlr.SimpleTokenManager
    public Object clone() {
        ImportVocabTokenManager importVocabTokenManager = (ImportVocabTokenManager) super.clone();
        importVocabTokenManager.k2 = this.k2;
        importVocabTokenManager.zh = this.zh;
        return importVocabTokenManager;
    }
}
