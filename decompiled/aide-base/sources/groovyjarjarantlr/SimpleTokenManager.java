package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.Vector;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class SimpleTokenManager implements TokenManager, Cloneable {
    protected int WB;
    protected Tool fY;
    private Hashtable jw;
    protected Vector mb;
    protected String qp;

    @Override // groovyjarjarantlr.TokenManager
    public int FH() {
        return this.WB - 1;
    }

    @Override // groovyjarjarantlr.TokenManager
    public Vector Hw() {
        return this.mb;
    }

    @Override // groovyjarjarantlr.TokenManager
    public boolean Zo(String str) {
        return this.jw.containsKey(str);
    }

    public Object clone() {
        try {
            SimpleTokenManager simpleTokenManager = (SimpleTokenManager) super.clone();
            simpleTokenManager.mb = (Vector) this.mb.clone();
            simpleTokenManager.jw = (Hashtable) this.jw.clone();
            simpleTokenManager.WB = this.WB;
            simpleTokenManager.fY = this.fY;
            simpleTokenManager.qp = this.qp;
            return simpleTokenManager;
        } catch (CloneNotSupportedException unused) {
            this.fY.Hw("cannot clone token manager");
            throw null;
        }
    }

    @Override // groovyjarjarantlr.TokenManager
    public TokenSymbol j6(String str) {
        return (TokenSymbol) this.jw.get(str);
    }
}
