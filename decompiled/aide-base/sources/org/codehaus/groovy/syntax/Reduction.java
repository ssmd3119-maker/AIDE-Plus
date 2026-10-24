package org.codehaus.groovy.syntax;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class Reduction extends CSTNode {
    private List j6;

    static {
        new Reduction();
    }

    private Reduction() {
        this.j6 = null;
        this.j6 = Collections.EMPTY_LIST;
    }

    @Override // org.codehaus.groovy.syntax.CSTNode
    public CSTNode DW(int i) {
        if (i < u7()) {
            return (CSTNode) this.j6.get(i);
        }
        return null;
    }

    @Override // org.codehaus.groovy.syntax.CSTNode
    public Token Hw() {
        if (u7() > 0) {
            return (Token) this.j6.get(0);
        }
        return null;
    }

    @Override // org.codehaus.groovy.syntax.CSTNode
    public boolean gn() {
        return u7() == 0;
    }

    @Override // org.codehaus.groovy.syntax.CSTNode
    public int u7() {
        return this.j6.size();
    }
}
