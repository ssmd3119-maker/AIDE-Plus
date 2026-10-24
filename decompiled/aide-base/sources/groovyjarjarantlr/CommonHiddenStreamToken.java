package groovyjarjarantlr;

/* loaded from: classes.dex */
public class CommonHiddenStreamToken extends CommonToken {
    protected CommonHiddenStreamToken k2;
    protected CommonHiddenStreamToken zh;

    public CommonHiddenStreamToken EQ() {
        return this.zh;
    }

    protected void J0(CommonHiddenStreamToken commonHiddenStreamToken) {
        this.zh = commonHiddenStreamToken;
    }

    protected void J8(CommonHiddenStreamToken commonHiddenStreamToken) {
        this.k2 = commonHiddenStreamToken;
    }

    public CommonHiddenStreamToken we() {
        return this.k2;
    }
}
